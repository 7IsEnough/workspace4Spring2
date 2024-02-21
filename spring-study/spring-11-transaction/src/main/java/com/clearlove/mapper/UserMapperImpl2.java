package com.clearlove.mapper;

import com.clearlove.pojo.User;
import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author promise
 * @date 2024/2/20 - 22:06
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {


  @Override
  public List<User> selectUser() {
    User user = new User(5, "2131231", "小王");
    UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
    mapper.addUser(user);
    mapper.deleteUser(4);
    return mapper.selectUser();
  }

  @Override
  public int addUser(User user) {

    UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
    return mapper.addUser(user);
  }

  @Override
  public int deleteUser(int id) {
    UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
    return mapper.deleteUser(id);
  }
}
