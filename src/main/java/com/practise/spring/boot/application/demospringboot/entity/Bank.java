package com.practise.spring.boot.application.demospringboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bank {
    @Id
    private int accountNumber;

    private String name;
    private String address;
    private int age;

    public Bank() {
    }
    public Bank(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public Bank(int accountNumber, String name, String address, int age) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
