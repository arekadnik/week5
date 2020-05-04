package com.github.arkadiusz_stadnik.week5.api;

import org.springframework.stereotype.Component;


public class Dog {
    private String name;
    private String breed;

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
