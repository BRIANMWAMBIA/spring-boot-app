package com.student.student.service;

import com.student.student.Entity.CourseModel;
import com.student.student.Entity.StudentModel;
import com.student.student.repository.CourseRepository;
import com.student.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<StudentModel> getStudents() {
        List <StudentModel> studentModels = studentRepository.findAll();
        return studentModels;
    }
}
