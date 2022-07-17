package com.training.springboottraining.controllers;

import com.training.springboottraining.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        return List.of(new Student(UUID.randomUUID(),"Alessandro", "Parrino", "email@gmail.com", Student.Gender.MALE));
    }
}
