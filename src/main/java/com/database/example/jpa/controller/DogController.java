package com.database.example.jpa.controller;

import com.database.example.jpa.domain.Dog;
import com.database.example.jpa.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/dogs")
@RequiredArgsConstructor
public class DogController {

    private final DogService dogService;

    @Value("${my.personal.message}")
    private String message;

    @GetMapping
    public List<Dog> getDogs() {
        return dogService.findDogs();
    }

    @PostMapping
    public Dog addDog(@Valid Dog dog) {
        return dogService.saveDog(dog);
    }

    @GetMapping("/message")
    public List<String> getMessage() {
        return List.of(message);
    }

    @GetMapping("/owner/{ownerID}")
    public Dog getDogByOwnerID(@PathVariable String ownerID) {
        return dogService.findByOwnerID(ownerID);
    }

    @GetMapping("/breedandage")
    public List<Dog> getDogsByBreedAndAge(String breed, Integer age) {
        return dogService.findByBreedAndAge(breed, age);
    }
}