package com.student.student.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity(name="students")
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {
    @Column(name="Name")
    private String Name;

    @Id
    @Column(name="RegNo")
    private String RegNo;

    @Column(name="CourseId")
    private Integer courseId;
}
