package instruments;

/**
 * Author: Daniel
 */
public class Cymbal implements Instrument {
    @Override
    public void play() {
        System.out.println(getClass().getName() + ".play()");
    }
}
