package com.clearlove.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author promise
 * @date 2024/2/17 - 23:51
 * 我们会用这个类，自动生成代理类
 */
public class ProxyInvocationHandler implements InvocationHandler {


  // 被代理的接口
  private Rent rent;

  public void setRent(Rent rent) {
    this.rent = rent;
  }


  // 生成得到代理类
  public Object getProxy() {
    return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
  }

  // 处理代理实例，并返回结果
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    seeHouse();
    // 动态代理的本质，使用反射机制实现
    Object result = method.invoke(rent, args);
    fee();
    return result;
  }

  public void seeHouse() {
    System.out.println("中介带看房子");
  }

  public void fee() {
    System.out.println("收中介费");
  }





}
