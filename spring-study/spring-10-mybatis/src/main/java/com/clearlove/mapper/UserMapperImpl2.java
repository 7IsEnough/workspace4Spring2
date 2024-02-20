package com.clearlove.mapper;

import com.clearlove.pojo.User;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author promise
 * @date 2024/2/20 - 22:06
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {


  @Override
  public List<User> selectUser() {
    UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
    return mapper.selectUser();
  }
}
