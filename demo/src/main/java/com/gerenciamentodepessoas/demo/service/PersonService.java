package com.gerenciamentodepessoas.demo.service;

import com.gerenciamentodepessoas.demo.model.Person;
import com.gerenciamentodepessoas.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {

    @Autowired
    private PersonRepository personRepository;

}
