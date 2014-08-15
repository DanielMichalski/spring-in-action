import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import exceptions.PerformanceException;
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

        Performer performer = (Performer) context.getBean(PoeticJuggler.class);
        performer.perform();

        Stage stage = (Stage) context.getBean("stage");
        stage.test();
    }
}
