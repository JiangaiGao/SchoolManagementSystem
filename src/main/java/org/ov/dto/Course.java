package org.ov.dto;

import java.util.Arrays;

public class Course {
    //fields
    private String id;
    private String courseName;
    private double credit;
    private Teacher teacher;
    private Department department;
    private int studentNum;
    private Student[] students;

    private static int nextId = 1;

    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.id = String.format("C%03d",nextId++);
    }

    @Override
    public String toString() {
        return "Course {" +
                "Id='" + id + '\'' +
                ", Course Name='" + courseName + '\'' +
                ", Credit=" + credit +
                ", Teacher=" + teacher +
                ", Department=" + department +
                ", Student Number=" + studentNum +
                ", Students=" + Arrays.toString(students) +
                '}';
    }
}
