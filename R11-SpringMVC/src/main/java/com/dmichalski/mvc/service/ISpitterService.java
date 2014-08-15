package com.dmichalski.mvc.service;

import com.dmichalski.mvc.model.Spitter;
import com.dmichalski.mvc.model.Spittle;

import java.util.List;

/**
 * Author: Daniel
 */
public interface ISpitterService {

    List<Spittle> getRecentSpittles(int size);

    Spitter getSpitter(String username);

    List<Spittle> getSpittlesForSpitter(String username);
}
