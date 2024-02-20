package com.clearlove.mapper;

import com.clearlove.pojo.User;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * @author promise
 * @date 2024/2/20 - 22:06
 */
public class UserMapperImpl implements UserMapper {

  // 我们的所有操作，原来都是用sqlSession来执行，现在使用sqlSessionTemplate
  private SqlSessionTemplate sqlSession;

  public void setSqlSession(SqlSessionTemplate sqlSession) {
    this.sqlSession = sqlSession;
  }

  @Override
  public List<User> selectUser() {
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    return mapper.selectUser();
  }
}
