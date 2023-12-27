package com.kobe.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author promise
 * @date 2023/12/27 - 21:40
 */
@Component // 等价于 <bean id="user" class="com.kobe.pojo.User"/>
@Scope(value = "singleton")
public class User {

  @Value("kobe")  // 相当于 <property name="name" value="kobe"/>
  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        '}';
  }
}
