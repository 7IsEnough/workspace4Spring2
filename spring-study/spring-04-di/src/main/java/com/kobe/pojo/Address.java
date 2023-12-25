package com.kobe.pojo;

/**
 * @author promise
 * @date 2023/12/24 - 23:28
 */
public class Address {

  private String address;

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Address{" +
        "address='" + address + '\'' +
        '}';
  }
}
