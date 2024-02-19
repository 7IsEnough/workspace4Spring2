package com.clearlove.log;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 * @author promise
 * @date 2024/2/18 - 22:00
 */
public class AfterLog implements AfterReturningAdvice {

  /**
   *
   * @param returnValue 返回值
   * @param method
   * @param objects
   * @param o1
   * @throws Throwable
   */
  @Override
  public void afterReturning(Object returnValue, Method method, Object[] objects, Object o1)
      throws Throwable {
    System.out.println("执行了"+method.getName()+"方法，返回结果为："+returnValue);
  }
}
