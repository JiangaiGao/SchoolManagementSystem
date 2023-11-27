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

    //Constructor
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

    //All the empty methods
    public Department findDepartment(String departmentId) {
        return null;
    }

    public Student findStudent(String studentId) {
        return null;
    }

    public Course findCourse(String courseId) {
        return null;
    }

    public Teacher findTeacher(String teacherId) {
        return null;
    }

    public void printTeachers() {

    }

    public void printStudents() {

    }

    public void printDepartments() {

    }

    public void printCourses() {

    }

    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    public void addDepartment(String departmentName) {

    }

    //What's the third String :(
    public void addCourse(String courseName, double credit, String x) {

    }

    public void addTeacher(String fName, String lName, String y) {

    }

    public void addStudent(String fName, String lName, String z) {

    }

    public void registerCourse(String studentId, String courseID) {

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
