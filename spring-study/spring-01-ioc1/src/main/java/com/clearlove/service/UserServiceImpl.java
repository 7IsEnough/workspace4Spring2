package com.clearlove.service;

import com.clearlove.dao.UserDao;
import com.clearlove.dao.UserDaoImpl;

/**
 * @author promise
 * @date 2023/12/19 - 22:08
 */
public class UserServiceImpl implements UserService{

  private UserDao userDao;

  // 利用set进行动态实现值的注入
  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }

  @Override
  public void getUser() {
    userDao.getUser();
  }
}
