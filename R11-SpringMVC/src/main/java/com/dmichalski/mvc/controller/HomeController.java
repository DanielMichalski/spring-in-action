package com.dmichalski.mvc.controller;

import com.dmichalski.mvc.service.ISpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

    public static final int DEFAULT_SPITTLES_PER_PAGE = 25;

    private ISpitterService spitterService;

    @Autowired
    public HomeController(ISpitterService spitterService) {
        this.spitterService = spitterService;
    }

    @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.put("spittles", spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
		return "home";
	}
}