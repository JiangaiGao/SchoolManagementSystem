package org.ov;

import org.ov.dto.*;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem sms = new SchoolManagementSystem();
        Department de = new Department("hi");
        Teacher te = new Teacher("l", "q", de);
        Student stu = new Student("a", "d", de);
        Course co = new Course("math", 3.0, de);
        sms.addStudent(stu);
        //sms.add

        System.out.println(sms);
        System.out.println(de);
        System.out.println(te);
        System.out.println(stu);
        System.out.println(co);
    }
}
