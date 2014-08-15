package com.springinaction.springidol.performers;

import com.springinaction.springidol.instruments.Instrument;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Author: Daniel
 */
public class Eddie implements Performer, InitializingBean, DisposableBean {
    @Autowired
    @Qualifier("guitar")
    private Instrument instrument;

    @PostConstruct
    public void startUp() {
        System.out.println("Starting...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties have been set...");
    }

    @Override
    public void perform() {
        System.out.println(getClass().getSimpleName() + ".perform()");
    }

    @PreDestroy
    public void shutDown() {
        System.out.println("Closing...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying...");
    }
}
