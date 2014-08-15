package performers;

import exceptions.PerformanceException;
import instruments.Instrument;

import java.util.Collection;

/**
 * Author: Daniel
 */
public class OneManBand implements Performer {

    private Collection<Instrument> instruments;

    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (Instrument instrument : instruments) {
            instrument.play();
        }

    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
