package com.kobe.config;

import com.kobe.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author promise
 * @date 2023/12/27 - 22:58
 */
// 这个也会被Spring容器托管，注册到容器中，因为它本身就是一个@Component
// @Configuration 代表这是一个配置类，和之前的beans.xml是一致的
@Configuration
@ComponentScan("com.kobe.pojo")
@Import(MyConfig2.class)
public class MyConfig {

  // 注册一个bean，相当于之前的一个bean标签
  // 这个方法的名字，相当于bean标签的id属性
  // 这个方法的返回值类型，相当于bean标签的class属性
  @Bean
  public User getUser() {
    return new User(); // 就是返回要注入到bean的对象
  }

}
