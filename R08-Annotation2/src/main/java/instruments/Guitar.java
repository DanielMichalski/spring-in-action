package instruments;

import org.springframework.beans.factory.annotation.Value;

/**
 * Author: Daniel
 */
@StringedInstrument
public class Guitar implements Instrument {
    @Value("${guitar.guitarName}")
    private String nameOfGuitar;

    @Override
    public void play() {
        System.out.println(getClass().getName() + ".play()");
        System.out.println("nameOfGuitar = " + nameOfGuitar);
    }
}
