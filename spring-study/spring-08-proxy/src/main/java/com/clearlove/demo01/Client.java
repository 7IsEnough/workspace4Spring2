package com.clearlove.demo01;

/**
 * @author promise
 * @date 2024/2/17 - 22:18
 * 客户
 */
public class Client {


  public static void main(String[] args) {
    // 房东要租房子
    Host host = new Host();
    // 代理，中介帮房东租房子，但代理一般会有一些附属操作
    Proxy proxy = new Proxy(host);
    // 你不用面对房东，直接找中介租房即可
    proxy.rent();
  }

}
