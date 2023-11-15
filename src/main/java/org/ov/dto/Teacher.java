package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter

public class Teacher {
    private String id;
    private String firstName;
    private String lastName;
    private Department department;

    private static int nextId = 1;

    public Teacher(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.id = String.format("T%03d",nextId++);
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "Id='" + id + '\'' +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Department=" + department +
                '}';
    }
}
