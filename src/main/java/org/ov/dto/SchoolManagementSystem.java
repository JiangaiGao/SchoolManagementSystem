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
    private int teacherNum = 0;
    private int courseNum = 0;
    private int departmentNum = 0;

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

    //All the empty methods
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department.getDepartmentId().equals(departmentId)) {
                return department;
            }
        }
        return null;
    }

    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
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
    public void addDepartment(Department department) {
        if (teacherNum < 5) {
            //add the department
            departments[departmentNum] = department;
        }
        else {
            //reach the cap
            System.out.printf("There are %d departments already", 5);
        }
    }

    //What's the third String :(
    public void addCourse(String courseName, double credit, String x) {
    }
    public void addCourse(Course course) {
        if (studentNum < 30) {
            //add the course
            courses[courseNum] = course;
        }
        else {
            //reach the cap
            System.out.printf("There are %d courses already", 30);
        }
    }

    public void addTeacher(String fName, String lName, String y) {
    }
    public void addTeacher(Teacher teacher) {
        if (teacherNum < 20) {
            //add the teacher
            teachers[teacherNum] = teacher;
        }
        else {
            //reach the cap
            System.out.printf("There are %d teachers already", 20);
        }
    }

    public void addStudent(String fName, String lName, String z) {
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
