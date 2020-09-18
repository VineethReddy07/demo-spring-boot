package com.practise.spring.boot.application.demospringboot.repository;

import com.practise.spring.boot.application.demospringboot.entity.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class JpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Student findByID(int id){
        return entityManager.find(Student.class,id);
    }
}
