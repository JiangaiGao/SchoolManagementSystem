package org.ov.dto;

import java.util.Arrays;

public class Student {
    private String id;
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
        this.id = String.format("S%03d",nextId++);
    }

    @Override
    public String toString() {
        return "Student {" +
                "Id='" + id + '\'' +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Department=" + department +
                ", Course Number=" + courseNum +
                ", Courses=" + Arrays.toString(courses) +
                '}';
    }
}
