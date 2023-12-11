package org.ov;

import org.ov.dto.*;

public class Main {
    public static void main(String[] args) {
        //Create objects
        SchoolManagementSystem sms = new SchoolManagementSystem();
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Science");
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
        sms.addTeacher(teacher1);
        sms.addTeacher(teacher2);
        course1.addStudent(student1);
        course1.addStudent(student2);
        course2.addStudent(student3);

        //sms.find
        System.out.println(sms.findCourse("C001"));
        System.out.println(sms.findCourse("C002"));
        System.out.println(sms.findDepartment("D001"));
        System.out.println(sms.findDepartment("D002"));
        System.out.println(sms.findStudent("S001"));
        System.out.println(sms.findStudent("S002"));
        System.out.println(sms.findStudent("S003"));
        System.out.println(sms.findStudent("S004"));
        System.out.println(sms.findTeacher("T001"));
        System.out.println(sms.findTeacher("T002"));
        System.out.println(sms.findTeacher("T003"));

        //sms.print
        sms.printCourses();
        sms.printDepartments();
        sms.printStudents();
        sms.printTeachers();

        //sms.modification
        sms.modifyCourseTeacher("T001", "C001");
        //sms.registerCourse("S001", "C001");

        System.out.println(teacher2);
        System.out.println(teacher1);
//        System.out.println(sms);
//        System.out.println(department);
//        System.out.println(teacher);
//        System.out.println(student);
//        System.out.println(course);

    }
}
