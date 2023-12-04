package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@EqualsAndHashCode
@Getter
@Setter

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private Department department;
    private int courseNum;
    private Course[] courses;

    private static int nextId = 1;

    public Student(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.studentId = String.format("S%03d",nextId++);
        this.courses = new Course[5];
    }

    @Override
    public String toString() {
        return "Student {" +
                "Id='" + studentId + '\'' +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Department=" + department +
                ", Course Number=" + courseNum +
                ", Courses=" + Arrays.toString(courses) +
                '}';
    }
}
