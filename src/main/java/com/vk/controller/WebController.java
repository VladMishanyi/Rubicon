package com.vk.controller;


import org.apache.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by User on 2017-05-22.
 */
@Controller
@ComponentScan(basePackages = {"com.vk.service", "com.vk.chain"})
@RequestMapping(value = "/admin")
public class WebController {

    private final Logger LOGGER = Logger.getLogger(WebController.class);

    @RequestMapping(value = "/winder", method = RequestMethod.GET)
    public String getIndex(){
        return "winder";
    }
}
