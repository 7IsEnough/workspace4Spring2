import com.kobe.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author promise
 * @date 2023/12/27 - 21:42
 */
public class MyTest {

  @Test
  public void test1() {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
    User user = context.getBean("user", User.class);
    System.out.println(user);
  }

}
