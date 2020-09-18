package com.practise.spring.boot.application.demospringboot.dataService;

import com.practise.spring.boot.application.demospringboot.mapper.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;

@Component
public class PlayerProfileJdbcService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Players> retrievePlayerProfile() {
        return jdbcTemplate.query
                ("select * from person", new BeanPropertyRowMapper<Players>(Players.class));

    }

    public Players findById(int id) {
        return jdbcTemplate.queryForObject
                ("select * from person where id=?", new Object[]{id},
                        new BeanPropertyRowMapper<Players>(Players.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update
                ("delete from person where id=?", new Object[]{id});
    }

    public int insertInfo(Players players){
        return jdbcTemplate.update
                (" insert into person(id,name,location,birth_date) "
                 + " values(?,?,?,?) ",
                 new Object[]{players.getId(),players.getName(),
                 players.getLocation(),new Timestamp(players.getBirthDate().getTime())});
    }

    public int update(Players players){
        return jdbcTemplate.update
                (" update person " +
                " set name=?, location=?, birth_date=? "
                + " where id=? ",
                        new Object[]{players.getName(),players.getLocation(),players.getBirthDate(),players.getId()});
    }
}
