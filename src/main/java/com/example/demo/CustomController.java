package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class CustomController {

    @RequestMapping(value = "/custom", method = RequestMethod.GET)
    public String custom() {
        return "custom";
    }
}
