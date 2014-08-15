package instruments;

/**
 * Author: Daniel
 */
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println(getClass().getName() + ".play()");
    }

    @Override
    public String toString() {
        return "Guitar";
    }
}
