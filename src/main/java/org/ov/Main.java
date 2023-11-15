package org.ov;

import org.ov.dto.Course;
import org.ov.dto.Department;
import org.ov.dto.Student;
import org.ov.dto.Teacher;

public class Main {
    public static void main(String[] args) {
        //Grrrr free meeeee im trapped in this code for eternity >:(((((
        Department de = new Department("hi");
        System.out.println(de);

        Teacher te = new Teacher("l", "q", de);
        System.out.println(te);

        Student stu = new Student("a", "d", de);
        System.out.println(stu);

        Course co = new Course("math", 3.0, de);
        System.out.println(co);
    }
}