package com.practise.spring.boot.application.demospringboot.controller;

import com.practise.spring.boot.application.demospringboot.service.Players;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class PlayersController {

    @GetMapping("players")
    public List<Players> getDetails(){
        List<Players> playersList=List.of(new Players(7,"M.S.Dhoni","WK-Batsman"));
        return playersList;
    }

    @GetMapping("/HelloWorld")
    public String print(){
        return "HelloWorld" + LocalDateTime.now();
    }
}
