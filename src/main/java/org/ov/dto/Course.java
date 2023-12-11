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
    
    public void registerStudent(Student studentName) {
        if (studentNum < 5 && !isStudentRegistered(String.valueOf(studentName))) {
            students[studentNum] = studentName;
            studentNum++;
        }
    }

    /**
     * tells if a course is registered
     *
     * @param studentName
     * @return if the course is registered
     * @author jiangaiGao
     */
    private boolean isStudentRegistered(String studentName) {
        for (int i = 0; i < studentNum; i++) {
            if (students[i] != null && students[i].equals(studentName)) {
                return true;
            }
        }
        return false;
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
