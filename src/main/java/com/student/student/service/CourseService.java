package com.student.student.service;

import com.student.student.DTO.CourseDto;
import com.student.student.Entity.CourseModel;
import com.student.student.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

public List<CourseModel> getCourses() {
    List <CourseModel> courseModels = courseRepository.findAll();
    return courseModels;
    }
 public void createCourse(CourseModel course){
     System.out.println(course);
     courseRepository.save(course);
 }
 public CourseModel getCourseById(int id){
    return courseRepository.getReferenceById(id);
 }
 public void deleteCourse(int courseId) {
    boolean exists=courseRepository.existsById(courseId);
    if(!exists) {
        throw new IllegalThreadStateException("course with id" +courseId+ "does not exist");
    }
    courseRepository.deleteById(courseId);

 }
 public void updateCourse () {

 }
}