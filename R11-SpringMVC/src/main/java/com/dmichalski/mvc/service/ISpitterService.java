package com.dmichalski.mvc.service;

import com.dmichalski.mvc.model.Spittle;

import java.util.List;

/**
 * Author: Daniel
 */
public interface ISpitterService {
    List<Spittle> getRecentSpittles(int size);
}
