package com.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/index")
    public Object index() {
        logger.debug("===========debug");
        logger.info("============info");
        logger.warn("============warn");
        logger.error("===========error");
        return "success";
    }
}