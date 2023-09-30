package com.example.demo.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonDto getPerson(int id) {
        Person person = personRepository.findById(id).orElseThrow();
        PersonDto personDto = new PersonDto();
        personDto.setLastName(person.getLastName());
        personDto.setFirstName(person.getFirstName());
        return personDto;
    }
}
