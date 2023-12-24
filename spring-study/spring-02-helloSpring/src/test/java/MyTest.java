import com.kobe.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author promise
 * @date 2023/12/19 - 23:25
 */
public class MyTest {

  public static void main(String[] args) {
    // 获取Spring的上下文对象
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "beans.xml");
    // 我们的对象，都在Spring中管理了，需要使用，直接去里面取出来就可以
    Hello hello = (Hello) context.getBean("hello");
    System.out.println(hello);
  }

}
