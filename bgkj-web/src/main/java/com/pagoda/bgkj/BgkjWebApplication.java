package com.pagoda.bgkj;

import com.pagoda.bgkj.config.*;
import com.pagoda.platform.dubbo.annotation.*;
import com.pagoda.platform.jms.ApplicationContextHolder;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.ctrip.framework.apollo.spring.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.boot.autoconfigure.data.redis.*;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author PagodaGenerator
 * @generated
 */
@EnableHystrix
// @EnableHystrixDashboard
@EnableApolloConfig
@SpringBootApplication
// (exclude = { RedisAutoConfiguration.class, RedisRepositoriesAutoConfiguration.class,
// HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class})
@ComponentScan({
  "com.pagoda.platform.dubbo.consumer",
  "com.pagoda.platform.dubbo.metadata",
  "com.pagoda.bgkj"
})
public class BgkjWebApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(BgkjWebApplication.class, args);
    // 注意这里保存context，用于框架查找spring bean
    ApplicationContextHolder.setApplicationContext(context);
  }
}
