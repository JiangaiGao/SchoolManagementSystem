package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter

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

    @Override
    public String toString() {
        return "Department {" +
                "Id='" + departmentId + '\'' +
                ", Department Name='" + departmentName + '\'' +
                '}';
    }
}
