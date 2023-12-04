package org.ov;

import org.ov.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem sms = new SchoolManagementSystem();
        Department de = new Department("hi");
        Teacher te = new Teacher("l", "q", de);
        Student stu = new Student("a", "d", de);
        Course co = new Course("math", 3.0, de);
        //sms.add
        sms.addStudent(stu);
        sms.addCourse(co);
        sms.addDepartment(de);
        sms.addTeacher(te);

        //sms.find
        sms.findCourse("C001");
        sms.findDepartment("D001");
        sms.findStudent("S001");
        sms.findTeacher("T001");

        //sms.print
        sms.printCourses();
        sms.printDepartments();
        sms.printStudents();
        sms.printTeachers();

        //sms.modification
        sms.modifyCourseTeacher("T001", "C001");
        sms.registerCourse("S001", "C001");

        System.out.println(sms);
        System.out.println(de);
        System.out.println(te);
        System.out.println(stu);
        System.out.println(co);
    }
}
