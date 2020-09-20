package com.practise.spring.boot.application.demospringboot.repository;

import com.practise.spring.boot.application.demospringboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringStudentRepository extends JpaRepository<Student,Integer> {
}
