package com.ninjaapps.sspringidol;

import com.ninjaapps.sspringidol.performers.Instrumentalist;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Instrumentalist eddie = (Instrumentalist) context.getBean("eddie");
        eddie.perform();
    }
}
