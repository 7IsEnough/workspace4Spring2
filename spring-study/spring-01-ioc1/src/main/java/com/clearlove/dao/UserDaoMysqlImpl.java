package com.clearlove.dao;

/**
 * @author promise
 * @date 2023/12/19 - 22:12
 */
public class UserDaoMysqlImpl implements UserDao{

  @Override
  public void getUser() {
    System.out.println("Mysql获取用户数据");
  }
}
