import com.kobe.pojo.Student;
import com.kobe.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author promise
 * @date 2023/12/24 - 23:33
 */
public class MyTest {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "beans.xml");
    Student student = (Student) context.getBean("student");
    System.out.println(student);
  }


  @Test
  public void test2() {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "userbeans.xml");
    User user = context.getBean("user", User.class);
    User user2 = context.getBean("user2", User.class);
    System.out.println(user);
    System.out.println(user2);
  }

}
