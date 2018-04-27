package com.pagoda.bgkj;

import com.ctrip.framework.apollo.spring.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import com.pagoda.platform.jms.ApplicationContextHolder;

/**
 * @author PagodaGenerator
 * @generated
 */
@EnableHystrix
// @EnableHystrixDashboard
@EnableApolloConfig
@SpringBootApplication
public class BgkjDubboApplication {

  /**
   * 请求日志
   *
   * @return
   */
  @Bean
  public CommonsRequestLoggingFilter requestLoggingFilter() {
    CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
    filter.setIncludeClientInfo(true);
    filter.setIncludeQueryString(true);
    filter.setIncludePayload(true);
    filter.setMaxPayloadLength(10000);
    filter.setIncludeHeaders(true);
    return filter;
  }

  public static void main(String[] args) throws InterruptedException {
    ApplicationContext context = SpringApplication.run(BgkjDubboApplication.class, args);
    ApplicationContextHolder.setApplicationContext(context);
  }
}
