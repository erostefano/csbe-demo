package com.example.demo.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Optional<Person> getPerson() {
        return personRepository.findById(1);
    }
}
