package com.github.arkadiusz_stadnik.week5.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class CarController {
    public CarController() {
        RestTemplate restTemplate = new RestTemplate();
        AnimalFact[] forObject = restTemplate.getForObject("https://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount=6",
                AnimalFact[].class);
        for (AnimalFact a:forObject) {
            System.out.println(a.getText() + "\n");
        }
    }
}
