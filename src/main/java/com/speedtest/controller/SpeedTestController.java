package com.speedtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeedTestController {

    @GetMapping("/getValue")
    public String getValue(){
        return "Hello";
    }
}
