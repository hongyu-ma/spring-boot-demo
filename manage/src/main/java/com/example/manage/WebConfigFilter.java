package com.example.manage;

import com.example.manage.interceptor.TestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 *
 * @author mahongyu
 * @date 2019/12/3 12:17
 */
@Configuration
public class WebConfigFilter implements WebMvcConfigurer {

  @Autowired
  private TestInterceptor testInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(testInterceptor).addPathPatterns("/interceptor");
  }
}
