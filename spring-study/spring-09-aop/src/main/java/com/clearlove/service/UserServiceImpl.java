package com.clearlove.service;

/**
 * @author promise
 * @date 2024/2/18 - 21:52
 */
public class UserServiceImpl implements UserService {

  @Override
  public void add() {
    System.out.println("增加了一个用户");
  }

  @Override
  public void delete() {
    System.out.println("删除了一个用户");

  }

  @Override
  public void update() {
    System.out.println("修改了一个用户");

  }

  @Override
  public void select() {
    System.out.println("查询了一个用户");

  }
}
