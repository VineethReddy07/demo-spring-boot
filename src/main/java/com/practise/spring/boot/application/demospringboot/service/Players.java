package com.practise.spring.boot.application.demospringboot.service;

public class Players {
    int jerseyNumber;
    String name;
    String attribute;

    public Players(int jerseyNumber, String name, String attribute) {
        this.jerseyNumber = jerseyNumber;
        this.name = name;
        this.attribute = attribute;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public String getAttribute() {
        return attribute;
    }

    @Override
    public String toString() {
        return "players{" +
                "jerseyNumber=" + jerseyNumber +
                ", name='" + name + '\'' +
                ", attribute='" + attribute + '\'' +
                '}';
    }
}
