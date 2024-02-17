package com.clearlove.demo01;

/**
 * @author promise
 * @date 2024/2/17 - 22:20
 */
public class Proxy implements Rent{

  private Host host;

  public Proxy() {
  }

  public Proxy(Host host) {
    this.host = host;
  }

  @Override
  public void rent() {
    seeHouse();
    host.rent();
    contract();
    fee();
  }

  // 看房
  public void seeHouse() {
    System.out.println("中介带你看房");
  }

  // 收中介费
  public void fee() {
    System.out.println("收中介费");
  }

  // 签合同
  public void contract() {
    System.out.println("签租赁合同");
  }
}
