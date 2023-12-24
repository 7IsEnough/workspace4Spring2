import com.clearlove.dao.UserDaoMysqlImpl;
import com.clearlove.dao.UserDaoSqlServerImpl;
import com.clearlove.service.UserService;
import com.clearlove.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author promise
 * @date 2023/12/19 - 22:09
 */
public class MyTest {

  public static void main(String[] args) {

    // 用户实际调用的是业务层，dao层他们不需要接触
//    UserService userService = new UserServiceImpl();
//    ((UserServiceImpl) userService).setUserDao(new UserDaoSqlServerImpl());
//    userService.getUser();

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
    userService.getUser();
  }

}
