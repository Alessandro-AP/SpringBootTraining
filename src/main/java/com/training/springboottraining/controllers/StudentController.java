package com.training.springboottraining.controllers;

import com.training.springboottraining.models.Student;
import com.training.springboottraining.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("add_student")
    public Boolean addNewStudent(@RequestBody Student student){
        System.out.println(student);
        return true;
    }
}
