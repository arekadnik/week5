package com.github.arkadiusz_stadnik.week5.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogApi {

    private List<Dog> dogList;

    public DogApi() {
        this.dogList = new ArrayList<>();
        dogList.add(new Dog("burek", "husky"));
        dogList.add(new Dog("reksio", "kundel"));
        dogList.add(new Dog("mija", "lew"));
    }

    @GetMapping
    public List<Dog> getDog(@RequestHeader int amount) {
        return dogList.subList(0, amount);
    }
    @PostMapping
    public void addDog(@RequestBody Dog dog) {
       dogList.add(dog);
    }
}
