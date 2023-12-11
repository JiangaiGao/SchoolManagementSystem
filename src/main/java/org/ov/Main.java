package org.ov;

import org.ov.dto.*;

public class Main {
    public static void main(String[] args) {
        //Create objects
        SchoolManagementSystem sms = new SchoolManagementSystem();
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Science");

        //sms.add
        sms.addStudent("Olivia", "Gao", department1);
        sms.addStudent("Sebastian", "Balbuena", department1);
        sms.addStudent("Jasmine", "Long", department2);
        sms.addCourse("Introduction to Programming", 3.0, department1);
        sms.addCourse("Quantum Mechanics", 3.0, department2);
        sms.addDepartment("Computer Science");
        sms.addDepartment("Science");
        sms.addDepartment("Mathematics");
        sms.addDepartment("Art");
        sms.addDepartment("Physical Education");
        sms.addDepartment("Languages");   //Max department reached.
        sms.addTeacher("Yi", "Wang", department1);
        sms.addTeacher("George", "Gao", department2);
        System.out.println();   //clean up

        //sms.modification
        sms.modifyCourseTeacher("T001", "C001");
        sms.modifyCourseTeacher("T002", "C001");
        sms.modifyCourseTeacher("T002", "C002");
        sms.registerCourse("S001", "C001");
        sms.registerCourse("S002", "C001");
        sms.registerCourse("S003", "C002");
        System.out.println();   //clean up

        //sms.find
        System.out.println(sms.findCourse("C001"));
        System.out.println(sms.findDepartment("D001"));
        System.out.println(sms.findStudent("S001"));
        System.out.println(sms.findTeacher("T001"));
        System.out.println(sms.findTeacher("T005"));   //Teacher not found.
        System.out.println();   //clean up

        //sms.print
        sms.printCourses();
        sms.printDepartments();
        sms.printStudents();
        sms.printTeachers();
    }
}
