package com.clearlove.log;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author promise
 * @date 2024/2/18 - 21:56
 */
public class Log implements MethodBeforeAdvice {

  /**
   *
   * @param method 要执行的目标对象的方法
   * @param args 参数
   * @param target 目标对象
   * @throws Throwable
   */
  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable {
    System.out.println(target.getClass().getName() + "的" + method.getName() +"方法"+"被执行了");
  }
}
