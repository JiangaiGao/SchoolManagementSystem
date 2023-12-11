package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString

public class Department {
    //Fields
    private String departmentId;
    private String departmentName;

    private static int nextId = 1;

    //Constructor
    public Department(String departmentName) {
        this.departmentId = String.format("D%03d",nextId++);
        this.departmentName = departmentName;
    }
}
