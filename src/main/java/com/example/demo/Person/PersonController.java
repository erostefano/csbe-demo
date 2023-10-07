package com.example.demo.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> addPerson(@RequestBody PersonDto personDto) {
        personService.addPerson(personDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Person added");
    }

    @DeleteMapping("/persons/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable int id) {
        personService.deletePerson(id);
        return ResponseEntity.status(HttpStatus.OK).body("Person deleted");
    }

}
