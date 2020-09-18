package com.practise.spring.boot.application.demospringboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private int studentID;
    private String name;
    private int marks;
    private String gender;

    public Student() {
    }

    public Student(int studentID, String name, int marks, String gender) {
        this.studentID = studentID;
        this.name = name;
        this.marks = marks;
        this.gender = gender;
    }

    public Student(String name, int marks, String gender) {
        this.name = name;
        this.marks = marks;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
