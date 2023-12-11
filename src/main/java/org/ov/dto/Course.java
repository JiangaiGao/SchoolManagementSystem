package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@EqualsAndHashCode
@Getter
@Setter

public class Course {
    //Fields
    private String courseId;
    private String courseName;
    private double credit;
    private Teacher teacher;
    private Department department;
    private int studentNum;
    private Student[] students;

    private static int nextId = 1;

    //Constructor
    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.courseId = String.format("C%03d",nextId++);
        this.students = new Student[5];
    }

    /**
     * sign up a student in a course,
     * if student's already registered, print a message.
     * if the course is full, print a message.
     * if the input ids are wrong, print a message.
     * @param student
     */
    public void registerStudent(Student student) {
        if (studentNum < 5) {
            boolean isAlreadyRegistered = false;
            for (int i = 0; i < studentNum; i++) {
                if (students[i] != null && students[i].equals(student)) {
                    isAlreadyRegistered = true;
                    break;
                }
            }
            if (!isAlreadyRegistered) {
                students[studentNum] = student;
                studentNum++;
                System.out.println("Student register course successfully.");
            } else {
                System.out.println("Student is already registered for this course.");
            }
        } else {
            System.out.println("Course fully registered. Cannot register more students.");
        }
    }

    /**
     * A toString method that returns the Array Students as '[]' when student is null.
     *
     * @return Course with id, name, credit, teacher, department, student number and students.
     * @author jiangaiGao
     */
    @Override
    public String toString() {
        String studentsStr = "[";
        for (Student student : students) {
            if (student != null) {
                studentsStr += student + ", ";
            }
        }
        studentsStr += "]";

        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credit=" + credit +
                ", " + teacher +
                ", " + department +
                ", studentNum=" + studentNum +
                ", students=" + studentsStr +
                '}';
    }
}
