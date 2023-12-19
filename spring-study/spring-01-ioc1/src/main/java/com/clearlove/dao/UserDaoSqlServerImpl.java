package com.clearlove.dao;

/**
 * @author promise
 * @date 2023/12/19 - 22:12
 */
public class UserDaoSqlServerImpl implements UserDao{

  @Override
  public void getUser() {
    System.out.println("SqlServer获取用户数据");
  }
}
