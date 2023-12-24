package com.kobe.pojo;

/**
 * @author promise
 * @date 2023/12/24 - 16:24
 */
public class UserT {

  private String name;

  public UserT() {
    System.out.println("UserT被创建了");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void show() {
    System.out.println("name="+name);
  }
}
