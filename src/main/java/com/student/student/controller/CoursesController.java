package com.student.student.controller;


import com.student.student.DTO.CourseDto;
import com.student.student.Entity.CourseModel;
import com.student.student.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/courses")
public class CoursesController {
    @Autowired
   private CourseService courseService;
    //Retrieve courses table
    @GetMapping
    public List<CourseModel> getCourses() {
    System.out.println("testing");
        return courseService.getCourses();
         }
    //Insert new course into the table
    @PostMapping
    public void createCourse(@RequestBody CourseModel course)  {

        courseService.createCourse(course);
    }
    // Select course by id
    @GetMapping(path="{courseId}")
    public CourseModel getCourseById(@PathVariable("courseId") int id)  {
       return courseService.getCourseById(id);
    }
    //Update course title
    public void updateCourse(int id, CourseModel course)  {}
    //Delete course from table
//    @DeleteMapping(path="{courseId}")
//    public void deleteCourse(@PathVariable("courseId") int id)  {
//        courseService.deleteCourse(id);
//    }



}
