package com.ninjaapps.sspringidol.performers;

import com.ninjaapps.sspringidol.instruments.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
@Component("eddie")
public class Instrumentalist implements Performer {
    @Autowired
    @Qualifier("guitar")
    private Instrument insrument;

    @Override
    public void perform() {
        System.out.println(getClass().getSimpleName() + ".perform() on " + insrument);
    }
}
