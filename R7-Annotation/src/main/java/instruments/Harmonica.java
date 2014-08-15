package instruments;

/**
 * Author: Daniel
 */
public class Harmonica implements Instrument {
    @Override
    public void play() {
        System.out.println(getClass().getName() + ".play()");
    }
}
