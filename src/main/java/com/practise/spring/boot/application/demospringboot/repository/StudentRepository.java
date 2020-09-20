package com.practise.spring.boot.application.demospringboot.repository;

import com.practise.spring.boot.application.demospringboot.entity.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Student> findAll(){
        TypedQuery<Student> namedQuery = entityManager.createNamedQuery("find_all_students", Student.class);
        return namedQuery.getResultList();
    }

    public Student findByID(int id){
        return entityManager.find(Student.class,id);
    }

    public Student update(Student student){
        return entityManager.merge(student);
    }

    public Student insert(Student student){
        return entityManager.merge(student);
    }
    public void delete(int id){
        Student student=findByID(id);
         entityManager.remove(student);
    }
}
