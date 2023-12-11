package org.ov;

import org.ov.dto.*;

public class Main {
    public static void main(String[] args) {
        //Create objects
        SchoolManagementSystem sms = new SchoolManagementSystem();
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Science");
        Department department3 = new Department("Science");
        Department department4 = new Department("Science");
        Department department5 = new Department("Science");
        Department department6 = new Department("Science");
        Teacher teacher1 = new Teacher("Yi", "Wang", department1);
        Teacher teacher2 = new Teacher("George", "Gao", department2);
        Student student1 = new Student("Olivia", "Gao", department1);
        Student student2 = new Student("Sebastian", "Balbuena", department1);
        Student student3 = new Student("Jasmine", "Long", department2);
        Course course1 = new Course("Introduction to Programming", 3.0, department1);
        Course course2 = new Course("Quantum Mechanics", 3.0, department2);

        //sms.add
        sms.addStudent(student1);
        sms.addStudent(student2);
        sms.addStudent(student3);
        sms.addCourse(course1);
        sms.addCourse(course2);
        sms.addDepartment(department1);
        sms.addDepartment(department2);
        sms.addDepartment(department3);
        sms.addDepartment(department4);
        sms.addDepartment(department5);
        sms.addDepartment(department6);   //Max department reached.
        sms.addTeacher(teacher1);
        sms.addTeacher(teacher2);

        //sms.modification
        sms.modifyCourseTeacher("T001", "C001");
        sms.modifyCourseTeacher("T002", "C001");
        sms.modifyCourseTeacher("T002", "C002");
        sms.registerCourse("S001", "C001");
        sms.registerCourse("S002", "C001");
        sms.registerCourse("S003", "C002");

        //sms.find
        System.out.println(sms.findCourse("C001"));
        System.out.println(sms.findDepartment("D001"));
        System.out.println(sms.findStudent("S001"));
        System.out.println(sms.findTeacher("T001"));
        System.out.println(sms.findTeacher("T005"));   //Teacher not found.

        //sms.print
        sms.printCourses();
        sms.printDepartments();
        sms.printStudents();
        sms.printTeachers();
    }
}
