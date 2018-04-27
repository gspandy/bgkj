package com.pagoda.bgkj.service.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * Cache配置类，用于缓存数据
 *
 * @author PagodaGenerator
 * @generated
 */
@Configuration("serviceCache")
@EnableCaching
public class CacheConfiguration {

  public static final int DEFAULT_MAXSIZE = 1000;
  public static final int DEFAULT_TTL = 10;

  @ConditionalOnProperty(name = "redis.enabled", havingValue = "true", matchIfMissing = false)
  @Bean
  public CacheManager redisCacheManager(RedisTemplate redisTemplate) {
    RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
    // 设置缓存过期时间
    // rcm.setDefaultExpiration(60);//秒
    return rcm;
  }

  @ConditionalOnProperty(name = "redis.enabled", havingValue = "true", matchIfMissing = false)
  @Bean
  public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory) {
    StringRedisTemplate template = new StringRedisTemplate(factory);
    Jackson2JsonRedisSerializer jackson2JsonRedisSerializer =
        new Jackson2JsonRedisSerializer(Object.class);
    ObjectMapper om = new ObjectMapper();
    om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
    om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
    jackson2JsonRedisSerializer.setObjectMapper(om);
    template.setValueSerializer(jackson2JsonRedisSerializer);
    template.afterPropertiesSet();
    return template;
  }

  @Bean
  public KeyGenerator keyGenerator() {
    return new KeyGenerator() {
      @Override
      public Object generate(Object target, Method method, Object... params) {
        StringBuilder sb = new StringBuilder();
        sb.append(target.getClass().getName());
        sb.append(method.getName());
        for (Object obj : params) {
          sb.append(obj.toString());
        }
        return sb.toString();
      }
    };
  }

  /** 定义cache名称， 超时时长(秒)，最大容量， 每个cache缺省10秒超时，最多1000条数据，需要修改可以在构造方法的参数中指定。 */
  public enum Caches {

    /** demo例子，有效期5秒，最大容量100 */
    changeMeCache(5, 100),
    ;

    Caches() {}

    Caches(int ttl) {
      this.ttl = ttl;
    }

    Caches(int ttl, int maxSize) {
      this.ttl = ttl;
      this.maxSize = maxSize;
    }

    /** 缓存最大数量 */
    private int maxSize = DEFAULT_MAXSIZE;

    /** 缓存过期时间（秒） */
    private int ttl = DEFAULT_TTL;

    public int getMaxSize() {
      return maxSize;
    }

    public int getTtl() {
      return ttl;
    }
  }

  /**
   * 创建基于Caffeine的Cache Manager
   *
   * @return
   */
  @Bean
  @Primary
  @ConditionalOnMissingBean
  public CacheManager caffeineCacheManager() {
    SimpleCacheManager cacheManager = new SimpleCacheManager();

    ArrayList<CaffeineCache> caches = new ArrayList<CaffeineCache>();
    for (Caches c : Caches.values()) {
      caches.add(
          new CaffeineCache(
              c.name(),
              Caffeine.newBuilder()
                  .recordStats()
                  .expireAfterWrite(c.getTtl(), TimeUnit.SECONDS)
                  .maximumSize(c.getMaxSize())
                  .build()));
    }

    cacheManager.setCaches(caches);

    return cacheManager;
  }
}
