package com.example.demo.Person;

import com.example.demo.Animal.AnimalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonDto getPerson(int id) {
        Person person = personRepository.findById(id);
        PersonDto personDto = new PersonDto();
        personDto.setLastName(person.getLastName());
        personDto.setFirstName(person.getFirstName());
        personDto.setAnimals(person.getAnimals().stream().map(animal -> {
            AnimalDto animalDto = new AnimalDto();
            animalDto.setId(animal.getId());
            animalDto.setName(animal.getName());
            return animalDto;
        }).toList());
        return personDto;
    }

    public List<PersonDto> getPersons() {
        return personRepository
                .findAll()
                .stream().map(person -> {
                    PersonDto personDto = new PersonDto();
                    personDto.setLastName(person.getLastName());
                    personDto.setFirstName(person.getFirstName());
                    personDto.setAnimals(person.getAnimals().stream().map(animal -> {
                        AnimalDto animalDto = new AnimalDto();
                        animalDto.setId(animal.getId());
                        animalDto.setName(animal.getName());
                        return animalDto;
                    }).toList());
                    return personDto;
                })
                .toList();
    }
}
