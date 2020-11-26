package com.wipro.assignment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    enum ValidName { John, Sam, Alice, Katie}

    @RequestMapping("/greetings")
    public ResponseEntity<String> greet(@RequestParam(value = "name") ValidName name){
        return new ResponseEntity<String>("Greetings " + name, HttpStatus.OK);
    }

}
