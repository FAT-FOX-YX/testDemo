package com.example.demo.controller;


import com.example.demo.entity.UserConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableConfigurationProperties({UserConfig.class})
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    UserConfig userConfig;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "Greeting from Spring Boot";
    }

    @RequestMapping("/userConfig")
    public String userConfig() {
        return userConfig.toString();
    }
}
