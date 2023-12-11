package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter

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

    /**
     * Register a course to the student
     * @param courseName
     *
     * @author jiangaiGao
     */
    public void registerCourse(Course courseName) {
        if (courseNum < 5) {
            courses[courseNum] = courseName;
            courseNum++;
        }
    }

    /**
     * A toString method that returns the Array Courses as '[]' when course is null.
     *
     * @return Student with id, name, department, course number and courses.
     * @author jiangaiGao
     */
    @Override
    public String toString() {
        return "Student {" +
                "Id='" + studentId + '\'' +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", " + department +
                ", Course Number=" + courseNum +
                ", Courses=" + '}';
    }
}
