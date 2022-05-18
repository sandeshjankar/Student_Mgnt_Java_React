package com.vsinfologic.studentsystem.service;

import com.vsinfologic.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
