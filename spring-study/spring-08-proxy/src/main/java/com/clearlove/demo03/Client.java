package com.clearlove.demo03;

/**
 * @author promise
 * @date 2024/2/17 - 23:59
 */
public class Client {

  public static void main(String[] args) {

    // 真实角色
    Host host = new Host();

    // 代理角色：现在没有
    ProxyInvocationHandler pih = new ProxyInvocationHandler();
    // 通过调用 程序处理角色 来处理我们要调用的 接口对象
    pih.setRent(host);
    // 这里的代理对象是动态生成的，我们并没有写
    Rent proxy = (Rent) pih.getProxy();

    proxy.rent();
  }

}
