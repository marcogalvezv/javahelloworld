package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    @CrossOrigin("*")
    @GetMapping
    public List<Person> HelloWorld()
    {
        List<Person> people = new ArrayList<>();
        Person p = new Person();
        p.id="1";
        p.name="Marco";
        p.lastName= "Galvez";
        people.add(p);
        return people;
    }

    public class Person
    {
      public String id;
      public String name;
      public String lastName;
    }
}

