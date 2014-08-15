import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import performers.Performer;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Performer kenny = (Performer) context.getBean("kenny");
        Performer carl = (Performer) context.getBean("carl");

        kenny.perform();
        carl.perform();
    }
}
