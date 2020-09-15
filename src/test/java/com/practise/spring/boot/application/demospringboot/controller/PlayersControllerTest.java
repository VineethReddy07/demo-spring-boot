package com.practise.spring.boot.application.demospringboot.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

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