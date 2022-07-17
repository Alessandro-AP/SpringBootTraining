package com.training.springboottraining.controllers;

import com.training.springboottraining.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getAllStudents() throws InterruptedException {
        Thread.sleep(2000);
        return List.of(
                new Student(UUID.randomUUID(),"Alessandro", "Parrino", "email@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(),"Alessandro", "Parrino", "email@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(),"Alessandro", "Parrino", "email@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(),"Alessandro", "Parrino", "email@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(),"Alessandro", "Parrino", "email@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(),"Alessandro", "Parrino", "email@gmail.com", Student.Gender.MALE)
                );
    }
}
