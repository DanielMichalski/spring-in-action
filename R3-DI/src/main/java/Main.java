import exceptions.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import performers.Performer;
import performers.PoeticJuggler;
import stage.Stage;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args)
            throws PerformanceException {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");


    }
}
