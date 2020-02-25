package com.example.JpaDemo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface DogRepository extends CrudRepository<Dog, Long> {

    List<Dog> findByName(String name);

    List<Dog> findByAgeGreaterThan(int age);

    List<Dog> findByNameAndAgeGreaterThan(String pluto, int i);

    @Query("SELECT d FROM Dog d WHERE d.age = ?1")
    Iterable<Dog> findDogsWithQueryAge(int i);


}
