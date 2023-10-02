package com.example.demo.Person;

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
        return personDto;
    }

    public List<PersonDto> getPersons() {
        return personRepository
                .findAll()
                .stream().map(person -> {
                    PersonDto personDto = new PersonDto();
                    personDto.setLastName(person.getLastName());
                    personDto.setFirstName(person.getFirstName());
                    return personDto;
                })
                .toList();
    }

}
