package com.vsinfologic.studentsystem.controller;

import com.vsinfologic.studentsystem.model.Student;
import com.vsinfologic.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentConroller {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is Added";

    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
