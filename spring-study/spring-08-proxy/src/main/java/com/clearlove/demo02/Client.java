package com.clearlove.demo02;

/**
 * @author promise
 * @date 2024/2/17 - 22:59
 */
public class Client {

  public static void main(String[] args) {
    UserServiceImpl userService = new UserServiceImpl();
    UserServiceProxy proxy = new UserServiceProxy();
    proxy.setUserService(userService);
    proxy.add();
  }

}
