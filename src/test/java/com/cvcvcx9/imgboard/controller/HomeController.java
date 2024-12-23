package com.cvcvcx9.imgboard.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static final Logger log = LogManager.getLogger(HomeController.class);

    @GetMapping("")
    public String hello(){
        log.info("tes76222t");
        return "hello";
    }

}
