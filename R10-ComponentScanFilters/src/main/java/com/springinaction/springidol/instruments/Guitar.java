package com.springinaction.springidol.instruments;

/**
 * Author: Daniel
 */
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println(getClass().getSimpleName() + ".play()");
    }
}
