package com.day2_homework.fileservice.Controllers;

import com.day2_homework.fileservice.models.Person;
import com.day2_homework.fileservice.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/persons")
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/persons/{id}")
    public ResponseEntity<Optional<Person>> getPerson(@PathVariable Long id){
        return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/persons")
    public ResponseEntity<Person> postFile(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

}
