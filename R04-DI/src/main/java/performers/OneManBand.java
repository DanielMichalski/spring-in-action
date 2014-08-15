package performers;

import instruments.Instrument;
import javafx.scene.input.InputMethodTextRun;

import java.util.Map;

/**
 * Author: Daniel
 */
public class OneManBand implements Performer {
    private Map<String, Instrument> instruments;
    private String val;

    public OneManBand() {
    }

    @Override
    public void perform() {
        for (String key : instruments.keySet()) {
            System.out.print(key + " ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
        System.out.println("val = " + val);
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setCount(String val) {
        this.val = val;
    }
}
