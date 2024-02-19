import com.clearlove.mapper.UserMapper;
import com.clearlove.pojo.User;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**
 * @author promise
 * @date 2024/2/20 - 0:46
 */
public class MyTest {

  @Test
  public void test() throws IOException {

    String resource = "mybatis-config.xml";
    InputStream in = Resources.getResourceAsStream(resource);
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
    SqlSession sqlSession = sessionFactory.openSession(true);
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    List<User> users = mapper.selectUser();
    users.forEach(System.out::println);
  }

}
