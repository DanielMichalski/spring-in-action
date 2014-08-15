package performers;

import instruments.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Author: Daniel
 */
public class Kenny implements Performer {
    private String song;

    @Autowired
    @Qualifier ("instrument2")
    private Instrument instrument;

    @Override
    public void perform() {
        System.out.println(getClass().getName() + ".perform()");
        System.out.println("instrument3 = " + instrument);
        System.out.println("song = " + song);
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
