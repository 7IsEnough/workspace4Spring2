package com.clearlove.demo04;

import com.clearlove.demo02.UserService;
import com.clearlove.demo02.UserServiceImpl;

/**
 * @author promise
 * @date 2024/2/18 - 0:20
 */
public class Client {

  public static void main(String[] args) {
    // 真实角色
    UserServiceImpl userService = new UserServiceImpl();

    // 代理角色，不存在
    ProxyInvocationHandler pih = new ProxyInvocationHandler();
    pih.setTarget(userService);
    // 动态生成代理类
    UserService proxy = (UserService) pih.getProxy();
    proxy.delete();
  }

}
