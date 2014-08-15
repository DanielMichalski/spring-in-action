import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import people.BraveKnight;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        BraveKnight knight = (BraveKnight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
