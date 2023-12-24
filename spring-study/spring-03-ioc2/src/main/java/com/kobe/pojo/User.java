package com.kobe.pojo;

/**
 * @author promise
 * @date 2023/12/24 - 16:24
 */
public class User {

  private String name;

  public User(String name) {
    this.name = name;
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
