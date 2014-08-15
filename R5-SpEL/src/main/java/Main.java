import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        MyClassWithPI classWithPI = (MyClassWithPI) context.getBean("classWithPI");
        System.out.println("PI = " + classWithPI.getPI());
    }
}
