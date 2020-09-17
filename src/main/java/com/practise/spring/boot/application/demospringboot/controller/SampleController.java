package com.practise.spring.boot.application.demospringboot.controller;

import com.practise.spring.boot.application.demospringboot.dataService.PlayerProfileJdbcService;
import com.practise.spring.boot.application.demospringboot.mapper.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class SampleController {

    @Autowired
    PlayerProfileJdbcService service;

    @GetMapping("/HelloWorld")
    public String print() {
        return "HelloWorld" + " " + LocalDate.now();
    }

    @GetMapping("retrievePlayerProfile")
    public List<Players> dataRetrieve() {
        return service.retrievePlayerProfile();
    }

}
