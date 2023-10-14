package com.example.demo.Auth;

import com.example.demo.Person.Person;
import com.example.demo.Person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private PersonRepository personRepository;

    public void register(RegistrationDto registrationDto) {
        Person person = new Person();
        person.setFirstName(registrationDto.getFirstName());
        person.setLastName(registrationDto.getLastName());
        person.setUserName(registrationDto.getUserName());
        person.setPassword(registrationDto.getPassword());
        personRepository.save(person);
    }
}
