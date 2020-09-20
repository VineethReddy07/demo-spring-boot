package com.practise.spring.boot.application.demospringboot.controller;

import com.practise.spring.boot.application.demospringboot.dataService.PlayerProfileJdbcService;
import com.practise.spring.boot.application.demospringboot.entity.Bank;
import com.practise.spring.boot.application.demospringboot.entity.Student;
import com.practise.spring.boot.application.demospringboot.mapper.Players;
import com.practise.spring.boot.application.demospringboot.repository.SpringBankRepository;
import com.practise.spring.boot.application.demospringboot.repository.SpringStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class SampleController {

    @Autowired
    PlayerProfileJdbcService service;

    @Autowired
    SpringStudentRepository repository;

    @Autowired
    SpringBankRepository bankRepository;


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

    @GetMapping("jpaRetrieve")
    public Optional<Student> retrieve() {
        return repository.findById(41);
    }

    @GetMapping("jpaUpdate")
    public Student jpaUpdate() {
        return repository.save(new Student(14, "DEVARAJ", 14, "MALE"));
    }

    @GetMapping("jpaInsert")
    public Student jpaInsert() {
        return repository.save(new Student(1257, "VASU", 0, "MALE"));
    }

    @GetMapping("jpaDelete")
    public void jpaDelete() {
        repository.deleteById(48);
    }

    @GetMapping("jpaRetrieveAll")
    public List<Student> retrieveAll() {
        return repository.findAll();
    }

    @GetMapping("retrieveAccount")
    public Optional<Bank> retrieveAccount() {
        return bankRepository.findById(bankRepository.findAll().stream().
                filter(accounts -> accounts.getAccountNumber() == 41).
                collect(Collectors.toList()).get(0).getAccountNumber());
    }

    @GetMapping("insertBank")
    public Bank bankInsert() {
        return bankRepository.save(new Bank(05, "Snigda", "Los Angeles", 26));
    }

    @GetMapping("updateName")
    public Bank updateName(Bank bank) {
         Optional<Bank> b= bankRepository.findById(bankRepository.findAll().stream().
                filter(accounts -> accounts.getAccountNumber() == 14).
                collect(Collectors.toList()).get(0).getAccountNumber());
         b.get().setName("Ravi");
         return bankRepository.save(b.get());

    }
}
