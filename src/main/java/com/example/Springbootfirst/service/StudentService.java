package com.example.Springbootfirst.service;

import com.example.Springbootfirst.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}