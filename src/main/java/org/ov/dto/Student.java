package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@EqualsAndHashCode
@Getter
@Setter
@ToString

public class Student {
    //Fields
    private String studentId;
    private String firstName;
    private String lastName;
    private Department department;
    private int courseNum;
    private Course[] courses;

    private static int nextId = 1;

    //Constructor
    public Student(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.studentId = String.format("S%03d",nextId++);
        this.courses = new Course[5];
    }
}
