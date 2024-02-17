package com.clearlove.demo03;


/**
 * @author promise
 * @date 2024/2/17 - 22:17
 * 房东
 */
public class Host implements Rent {

  @Override
  public void rent() {
    System.out.println("房东要出租房子");
  }
}
