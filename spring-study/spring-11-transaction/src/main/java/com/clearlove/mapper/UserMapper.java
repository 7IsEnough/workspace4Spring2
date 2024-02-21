package com.clearlove.mapper;

import com.clearlove.pojo.User;
import java.util.List;

/**
 * @author promise
 * @date 2024/2/20 - 0:42
 */
public interface UserMapper {

  public List<User> selectUser();

  // 添加一个用户
  public int addUser(User user);

  // 删除一个用户
  public int deleteUser(int id);
}
