import com.kobe.config.MyConfig;
import com.kobe.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author promise
 * @date 2023/12/27 - 23:00
 */
public class MyTest {

  @Test
  public void test1() {

    // 如果完全使用了配置类方式去做，就只能通过 AnnotationConfigApplicationContext 上下文来获取容器，通过配置类的class对象加载
    ApplicationContext context = new AnnotationConfigApplicationContext(
        MyConfig.class);

    User user = context.getBean("getUser", User.class);
    System.out.println(user);
  }

}
