package com.student.student.controller;

import com.student.student.Entity.CourseModel;
import com.student.student.Entity.StudentModel;
import com.student.student.service.CourseService;
import com.student.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    //Retrieve students table
    @GetMapping
    public List<StudentModel> getStudents() {
        return studentService.getStudents();
    }
}
