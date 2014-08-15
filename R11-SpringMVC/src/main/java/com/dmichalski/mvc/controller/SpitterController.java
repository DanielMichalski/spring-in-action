package com.dmichalski.mvc.controller;

import com.dmichalski.mvc.model.Spitter;
import com.dmichalski.mvc.service.ISpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: Daniel
 */
@Controller
@RequestMapping("/spitters")
public class SpitterController {

    private ISpitterService spitterService;

    @Autowired
    public SpitterController(ISpitterService spitterService) {
        this.spitterService = spitterService;
    }

    @RequestMapping(value = "/spittles", method = RequestMethod.GET)
    public String listSpittlesForSpitter(
            @RequestParam("spitter") String userName, Model model) {

        Spitter spitter = spitterService.getSpitter(userName);
        model.addAttribute("spitter", spitter);
        model.addAttribute("spittleList", spitterService.getSpittlesForSpitter(userName));
        return "spittles/list";

    }
}
