package com.practise.spring.boot.application.demospringboot.repository;

import com.practise.spring.boot.application.demospringboot.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringBankRepository extends JpaRepository<Bank,Integer> {
}
