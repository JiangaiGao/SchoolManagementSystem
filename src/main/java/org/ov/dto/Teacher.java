package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter

public class Teacher {
    //Fields
    private String teacherId;
    private String firstName;
    private String lastName;
    private Department department;

    private static int nextId = 1;

    //Constructor
    public Teacher(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.teacherId = String.format("T%03d",nextId++);
    }

    //toString
    @Override
    public String toString() {
        return "Teacher {" +
                "Id='" + teacherId + '\'' +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", " + department +
                '}';
    }
}
