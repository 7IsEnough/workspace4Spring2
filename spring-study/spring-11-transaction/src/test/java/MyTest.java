import com.clearlove.mapper.UserMapper;
import com.clearlove.mapper.UserMapperImpl2;
import com.clearlove.pojo.User;
import java.io.IOException;
import java.util.List;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author promise
 * @date 2024/2/20 - 0:46
 */
public class MyTest {

  @Test
  public void test() throws IOException {

//    String resource = "mybatis-config.xml";
//    InputStream in = Resources.getResourceAsStream(resource);
//    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
//    SqlSession sqlSession = sessionFactory.openSession(true);
//    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//    List<User> users = mapper.selectUser();
//    users.forEach(System.out::println);

//    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//    UserMapperImpl userMapperImpl = context.getBean("userMapperImpl", UserMapperImpl.class);
//    List<User> users = userMapperImpl.selectUser();
//    users.forEach(System.out::println);


    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserMapper userMapperImpl = context.getBean("userMapperImpl2", UserMapper.class);
    List<User> users = userMapperImpl.selectUser();
    users.forEach(System.out::println);
  }

}
