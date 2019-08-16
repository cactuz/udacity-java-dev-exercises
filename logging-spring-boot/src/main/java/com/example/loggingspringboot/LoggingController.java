package com.example.loggingspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoggingController {
    Logger logger = LoggerFactory.getLogger(LoggingController.class);  //need to create a logger

    @RequestMapping({"hello", "/log"})  //the /log triggers logging
    public String logDemo() {
        logger.info("/hello triggered. Log entry made.");

        return "Logging done";
    }
}
