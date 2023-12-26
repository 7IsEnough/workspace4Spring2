import com.kobe.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author promise
 * @date 2023/12/26 - 22:14
 */
public class MyTest {

  @Test
  public void test1() {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "beans.xml");

    People people = context.getBean("people", People.class);
    people.getCat().shout();
    people.getDog().shout();
  }

}
