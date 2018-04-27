package com.pagoda.bgkj.config;

import com.alibaba.dubbo.config.RegistryConfig;
import com.pagoda.platform.dubbo.annotation.DubboReferenceScan;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Dubbo启用配置，默认激活
 *
 * @author PagodaGenerator
 * @generated
 */
@Configuration
@ConditionalOnProperty(name = "dubbo.enabled", havingValue = "true", matchIfMissing = true)
@ImportResource("classpath*:META-INF/spring/*.xml")
@DubboReferenceScan(
  value = {"com.pagoda.bgkj.api"},
  scope = "remote"
)
public class DubboConfiguration {

  /**
   * dubbo的注册中心配置
   *
   * @return
   */
  @Bean
  public RegistryConfig registryConfig(Environment environment) {
    RelaxedPropertyResolver relaxedPropertyResolver =
        new RelaxedPropertyResolver(environment, "dubbo.");
    RegistryConfig registryConfig =
        new RegistryConfig(
            relaxedPropertyResolver.getProperty("registry", "zookeeper://127.0.0.1:2181"));
    registryConfig.setClient("curator");
    return registryConfig;
  }

  /**
   * dubbo启用时，datasource没有使用
   *
   * @return
   */
  @ConditionalOnMissingBean
  @Bean
  public DataSource dataSource() {
    return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL).build();
  }
}
