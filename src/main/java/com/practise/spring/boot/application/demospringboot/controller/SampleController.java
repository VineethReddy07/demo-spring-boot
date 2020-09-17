package com.practise.spring.boot.application.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class SampleController {

    @GetMapping("/HelloWorld")
    public String print() {
        return "HelloWorld" + " " + LocalDate.now();
    }
}
