import com.kobe.pojo.Student;
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
    System.out.println(student.getName());
  }

}
