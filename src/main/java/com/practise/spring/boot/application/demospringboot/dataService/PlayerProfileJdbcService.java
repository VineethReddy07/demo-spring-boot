package com.practise.spring.boot.application.demospringboot.dataService;

import com.practise.spring.boot.application.demospringboot.mapper.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayerProfileJdbcService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Players> retrievePlayerProfile() {
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Players.class));

    }
}
