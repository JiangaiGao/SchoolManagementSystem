package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@EqualsAndHashCode
@Getter
@Setter

public class Course {
    //Fields
    private String courseId;
    private String courseName;
    private double credit;
    private Teacher teacher;
    private Department department;
    private int studentNum;
    private Student[] students;

    private static int nextId = 1;

    //Constructor
    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.courseId = String.format("C%03d",nextId++);
        this.students = new Student[5];
    }

    //toString
    @Override
    public String toString() {
        String studentsStr = "[";
        for (Student student : students) {
            if (student != null) {
                studentsStr += "]";
            }
        }
        return "Course {" +
                "Id='" + courseId + '\'' +
                ", Course Name='" + courseName + '\'' +
                ", Credit=" + credit +
                ", Teacher=" + teacher +
                ", Department=" + department +
                ", Student Number=" + studentNum +
                ", Students=" + studentsStr +
                '}';
    }
}
