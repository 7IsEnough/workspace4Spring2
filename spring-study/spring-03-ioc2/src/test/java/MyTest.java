import com.kobe.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author promise
 * @date 2023/12/24 - 16:25
 */
public class MyTest {

  public static void main(String[] args) {
    // 在配置文件加载的时候，容器中管理的对象就已经初始化了
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "beans.xml");
    User user1 = (User) context.getBean("user");
    User user2 = (User) context.getBean("user");
    System.out.println(user1 == user2); // true
    user1.show();
  }

}
