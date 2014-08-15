package com.dmichalski.mvc.service;

import com.dmichalski.mvc.model.Spittle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Author: Daniel
 */
@Service
public class SpitterService implements ISpitterService {

    private String[] names = {"spittle1", "spittle2", "spittle4"};

    @Override
    public List<Spittle> getRecentSpittles(int size) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            Spittle spittle = new Spittle();
            int randomIndex = random.nextInt(names.length);
            spittle.setName(names[randomIndex]);
            spittles.add(spittle);
        }

        return spittles;
    }
}
