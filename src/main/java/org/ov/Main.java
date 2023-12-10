package org.ov;

import org.ov.dto.*;

public class Main {
    public static void main(String[] args) {
        //Create objects
        SchoolManagementSystem sms = new SchoolManagementSystem();
        Department department = new Department("hi");
        Teacher teacher = new Teacher("l", "q", department);
        Student student = new Student("a", "d", department);
        Course course = new Course("math", 3.0, department);

        //sms.add
        sms.addStudent(student);
        sms.addCourse(course);
        sms.addDepartment(department);
        sms.addTeacher(teacher);

        //sms.find
        System.out.println("Find course: " + sms.findCourse("C001"));
        System.out.println("Find department: " + sms.findDepartment("D001"));
        System.out.println("Find student: " + sms.findStudent("S001"));
        System.out.println("Find teacher: " + sms.findTeacher("T001"));

        //sms.print
        sms.printCourses();
        sms.printDepartments();
        sms.printStudents();
        sms.printTeachers();

        //sms.modification
        sms.modifyCourseTeacher("T001", "C001");
        sms.registerCourse("S001", "C001");

        System.out.println(sms);
        System.out.println(department);
        System.out.println(teacher);
        System.out.println(student);
        System.out.println(course);

    }
}
