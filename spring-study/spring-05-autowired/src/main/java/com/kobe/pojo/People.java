package com.kobe.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author promise
 * @date 2023/12/26 - 22:09
 */
public class People {

  // 如果显示定义了 Autowired 的 required 属性为false，说明这个对象可以为null，否则不允许为空
//  @Autowired(required = false)
  @Autowired
  @Qualifier(value = "cat1")
  private Cat cat;

  @Autowired
  private Dog dog;

  private String name;

  public Cat getCat() {
    return cat;
  }

  public void setCat(Cat cat) {
    this.cat = cat;
  }

  public Dog getDog() {
    return dog;
  }

  public void setDog(Dog dog) {
    this.dog = dog;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "People{" +
        "cat=" + cat +
        ", dog=" + dog +
        ", name='" + name + '\'' +
        '}';
  }
}
