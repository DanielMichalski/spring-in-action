package com.dmichalski.mvc.controller;

import com.dmichalski.mvc.model.Spittle;
import com.dmichalski.mvc.service.SpitterService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.ui.ModelMap;

import java.util.Arrays;
import java.util.List;

import static com.dmichalski.mvc.controller.HomeController.DEFAULT_SPITTLES_PER_PAGE;

public class HomeControllerTest {

    @Test
    public void shouldDisplayRecetSpittles() throws Exception {

        List<Spittle> expectedSptittles =
                Arrays.asList(new Spittle(), new Spittle(), new Spittle());

        SpitterService spitterService =
                Mockito.mock(SpitterService.class);

        Mockito.when(spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE)).
                thenReturn(expectedSptittles);

        HomeController homeController =
                new HomeController(spitterService);

        ModelMap model = new ModelMap();
        String viewName = homeController.printWelcome(model);

        Assert.assertEquals("home", viewName);
        Assert.assertSame(expectedSptittles, model.get("spittles"));
        Mockito.verify(spitterService).getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE);
    }
}