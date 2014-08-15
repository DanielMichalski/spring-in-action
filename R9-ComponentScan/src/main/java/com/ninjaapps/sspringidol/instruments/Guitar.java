package com.ninjaapps.sspringidol.instruments;

import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
@Component("guitar")
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
