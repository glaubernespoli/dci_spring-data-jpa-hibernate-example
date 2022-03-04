package com.database.example.jpa.repository;

import com.database.example.jpa.domain.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {

    /**
     * Returns a single dog with the specific owner ID.
     * @param ownerID ID of the owner
     * @return a dog
     */
    Optional<Dog> findByOwnerID(String ownerID);

    /**
     * Returns a list of dogs where both the breed AND the age match the given values
     * @param breed the breed
     * @param age the age
     * @return list of dogs
     */
    List<Dog> findByBreedAndAge(String breed, Integer age);

    /**
     * Returns a list of dogs that have either the given name or that have the given owner ID.
     *
     * @param name name of the dog
     * @param ownerID ID of the owner
     * @return list of dogs
     */
    List<Dog> findByNameOrOwnerID(String name, String ownerID);

    /**
     * Returns a list of dogs where the birthdate is between the given dates.
     * PS: Not tested, should work...
     *
     * @param init the initial date
     * @param end the end date
     * @return list of dogs
     */
    List<Dog> findByBirthDateBetween(LocalDate init, LocalDate end);
}
