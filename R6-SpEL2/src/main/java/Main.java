import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        Guy guy = (Guy) context.getBean("guy");
        System.out.println(guy.getChoosenCity());
        System.out.println(guy.getName());

        SystemTest systemTest = (SystemTest) context.getBean("systemTest");
        System.out.println(systemTest.getHome());
    }
}
