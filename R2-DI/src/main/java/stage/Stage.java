package stage;

/**
 * Author: Daniel
 */
public class Stage {
    private Stage() {

    }

    public void test() {
        System.out.println("Stage");
    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
