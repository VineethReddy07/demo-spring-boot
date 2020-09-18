package com.practise.spring.boot.application.demospringboot.controller;

import com.practise.spring.boot.application.demospringboot.dataService.PlayerProfileJdbcService;
import com.practise.spring.boot.application.demospringboot.mapper.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SampleController {

    @Autowired
    PlayerProfileJdbcService service;

    @GetMapping("/HelloWorld")
    public String print() {
        return "HelloWorld" + " " + LocalDate.now();
    }

    @GetMapping("retrievePlayersProfile")
    public List<Players> dataRetrieve() {
        return service.retrievePlayerProfile();
    }

    @GetMapping("retrievePlayerInfo")
    public Players infoRetrieve() {
        return service.findById
                (service.retrievePlayerProfile().stream().filter(players ->
                        players.getId() == 41).collect(Collectors.toList()).get(0).getId());
    }

    @GetMapping("deleteInfo")
    public int deleteInfo() {
        return service.deleteById
                (service.retrievePlayerProfile().stream().filter(players ->
                        players.getId() == 07).collect(Collectors.toList()).get(0).getId());

    }

    @GetMapping("insertInfo")
    public int insertInfo() {
        return service.insertInfo
                (new Players(6, "Ravinder", "Hyderabad", new Date()));
    }

    @GetMapping("updateInfo")
    public int updateInfo() {
        return service.update
                (new Players(6, "Anita", "Hyderabad", new Date()));
    }

}
