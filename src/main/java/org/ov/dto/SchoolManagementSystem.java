package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.sql.SQLOutput;
import java.util.Arrays;

@EqualsAndHashCode
@Getter
@Setter

public class SchoolManagementSystem {
    private int studentNum = 0;
    private Student[] students;
    private Course[] courses;
    private Teacher[] teachers;
    private Department[] departments;

    public SchoolManagementSystem() {
        this.students = new Student[200];
        //this.courses = courses;
        //this.teachers = teachers;
        //this.departments = departments;
    }

    public void addStudent(Student student) {
        if (studentNum < 200) {
            //add the student
            students[studentNum] = student;
        }
        else {
            //reach the cap
            System.out.printf("There are %d students already", 200);
        }
    }

    @Override
    public String toString() {
        String studentsStr = "[";
        for (Student student : students) {
            if (student != null) {
                studentsStr += "]";
            }

        }
        return "SchoolManagementSystem {" +
                "Students=" + studentsStr;// +
                //", Courses=" + Arrays.toString(courses) +
                //", Teachers=" + Arrays.toString(teachers) +
                //", Departments=" + Arrays.toString(departments) +
                //'}';
    }
}
