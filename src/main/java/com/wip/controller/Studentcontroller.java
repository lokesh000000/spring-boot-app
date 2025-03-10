package com.wip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wip.entity.Student;
import com.wip.respository.StudentRepository;

@RestController
@RequestMapping("/students")
public class Studentcontroller {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public Student createUser(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> getAllUsers() {
        return studentRepository.findAll();
    }
}
