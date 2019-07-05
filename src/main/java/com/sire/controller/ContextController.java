package com.sire.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContextController {
    @RequestMapping("/index")
    public String index(){
        return "hello";
    }
}
