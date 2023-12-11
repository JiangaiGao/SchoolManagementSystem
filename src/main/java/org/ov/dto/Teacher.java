package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString

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
}
