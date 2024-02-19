import com.clearlove.service.UserService;
import com.clearlove.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author promise
 * @date 2024/2/18 - 22:16
 */
public class MyTest {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
    // 动态代理，代理的是接口
    UserService userService = context.getBean("userService", UserService.class);
    userService.add();
  }

}
