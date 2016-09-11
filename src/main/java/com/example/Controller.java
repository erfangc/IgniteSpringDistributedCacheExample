package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by erfangchen on 9/11/16.
 */
@RestController
public class Controller {
    private TestService service;

    @Autowired
    public Controller(TestService service) {
        this.service = service;
    }

    @RequestMapping("test")
    public String test(@RequestParam(required = false, defaultValue = "Erfang") String name) {
        return service.get(name);
    }
}
