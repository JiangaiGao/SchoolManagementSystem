package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

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

    public void registerCourse(Course courseName) {
        if (courseNum < 5 && !isCourseRegistered(String.valueOf(courseName))) {
            courses[courseNum] = courseName;
            courseNum++;
            System.out.println("Student registered for course successfully.");
        } else if (courseNum >= 5) {
            System.out.println("Student has already registered the maximum number of courses.");
        } else {
            System.out.println("Student has already registered for this course.");
        }
    }

    private boolean isCourseRegistered(String courseName) {
        for (int i = 0; i < courseNum; i++) {
            if (courses[i] != null && courses[i].equals(courseName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * A toString method that returns the Array Courses as '[]' when course is null.
     *
     * @return Student with id, name, department, course number and courses.
     * @author jiangaiGao
     */
    @Override
    public String toString() {
        String coursesStr = "[";
        for (Course course : courses) {
            if (course != null) {
                coursesStr += course + ", ";
            }
        }
        coursesStr += "]";
        return "Student {" +
                "Id='" + studentId + '\'' +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", " + department +
                ", Course Number=" + courseNum +
                ", Courses=" + coursesStr +
                '}';
    }
}
