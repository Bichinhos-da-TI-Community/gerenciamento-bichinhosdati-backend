package com.gerenciamentodepessoas.demo.controller;

import com.gerenciamentodepessoas.demo.model.Person;
import com.gerenciamentodepessoas.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bichinhosdati/person")
public class PersonController {
    @Autowired
    private PersonService personService;

}
