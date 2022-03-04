package com.database.example.jpa.service;

import com.database.example.jpa.domain.Dog;
import com.database.example.jpa.repository.DogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DogService {

    private final DogRepository dogRepository;

    public List<Dog> findDogs() {
        return dogRepository.findAll();
    }

    public Dog saveDog(Dog dog) {
        return dogRepository.save(dog);
    }

    public Dog findByOwnerID(String ownerID) {
        return dogRepository.findByOwnerID(ownerID).orElse(null);
    }

    public List<Dog> findByBreedAndAge(String breed, Integer age) {
        return dogRepository.findByBreedAndAge(breed, age);
    }
}
