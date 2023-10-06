package com.example.demo.Person;

import com.example.demo.Animal.AnimalDto;

import java.util.ArrayList;
import java.util.List;

public class PersonDto {
    private int id;
    private String lastName;
    private String firstName;
    private List<AnimalDto> animals = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<AnimalDto> getAnimals() {
        return animals;
    }

    public void setAnimals(List<AnimalDto> animals) {
        this.animals = animals;
    }
}
