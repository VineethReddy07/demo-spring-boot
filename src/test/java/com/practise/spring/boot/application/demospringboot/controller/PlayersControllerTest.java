package com.practise.spring.boot.application.demospringboot.controller;

import com.practise.spring.boot.application.demospringboot.service.Players;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PlayersControllerTest {
    @InjectMocks
    PlayersController controller;


    @Test
    void printTest() {
        String s = "HelloWorld" + " " + LocalDate.now();
        assertEquals(s, controller.print());
    }
}