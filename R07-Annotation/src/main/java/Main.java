import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import performers.Kenny;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Kenny kenny = (Kenny) context.getBean("kenny");
        kenny.perform();
    }
}
