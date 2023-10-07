package com.example.demo.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons/{id}")
    public PersonDto getPerson(@PathVariable int id) {
        return personService.getPerson(id);
    }

    @GetMapping("/persons")
    public List<PersonDto> getPersons() {
        return personService.getPersons();
    }

    @PostMapping("/persons")
    public void addPerson(@RequestBody PersonDto personDto) {

    }
}
