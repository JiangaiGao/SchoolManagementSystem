package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString

public class SchoolManagementSystem {
    //Fields
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
        this.courses = new Course[30];
        this.teachers = new Teacher[20];
        this.departments = new Department[5];
    }

    /**
     * Search for a department with an id
     *
     * @param departmentId
     * @return the department that matches the id
     * @author jiangaiGao
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department != null && department.getDepartmentId().equals(departmentId)) {
                return department;
            }
        }
        return null;
    }

    /**
     * Search for a student with an id
     *
     * @param studentId
     * @return the student that matches the id
     * @author jiangaiGao
     */
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student != null && student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Search for a course with an id
     *
     * @param courseId
     * @return the course that matches the id
     * @author jiangaiGao
     */
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course != null && course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    /**
     * Search for a teacher with an id
     *
     * @param teacherId
     * @return the teacher that matches the id
     * @author jiangaiGao
     */
    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher != null && teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    /**
     * Display all teachers that are not null.
     */
    public void printTeachers() {
        System.out.println("Displaying all teachers:\n----------");
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
        System.out.println();   //clean up
    }

    /**
     * Display all students that are not null.
     */
    public void printStudents() {
        System.out.println("Displaying all students:\n----------");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
        System.out.println();   //clean up
    }

    /**
     * Display all departments that are not null.
     */
    public void printDepartments() {
        System.out.println("Displaying all departments:\n----------");
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
        System.out.println();   //clean up
    }

    /**
     * Display all courses that are not null.
     */
    public void printCourses() {
        System.out.println("Displaying all courses:\n----------");
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
        System.out.println();   //clean up
    }

    /**
     * Add a department in the school management system, max 5.
     * @param departmentName
     */
    public void addDepartment(String departmentName) {
        if (departmentNum < 5) {
            departments[departmentNum] = new Department(departmentName);
            departmentNum++;
            System.out.println("Add department " + departmentName + " successfully.");
        }
        else {
            //reach the cap
            System.out.println("Max department reached, add a new department failed.");
        }
    }

    /**
     * Add a course in the school management system, max 30.
     * @param courseName
     * @param credit
     * @param department
     */
    public void addCourse(String courseName, double credit, Department department) {
        if (courseNum < 30) {
            //add the course
            courses[courseNum] = new Course(courseName, credit, department);
            courseNum++;
            System.out.println("Add course " + courseName + " successfully.");
        }
        else {
            //reach the cap
            System.out.println("Max course reached, add a new course failed.");
        }
    }

    /**
     * Add a teacher in the school management system, max 20.
     * @param firstName
     * @param lastName
     * @param department
     */
    public void addTeacher(String firstName, String lastName, Department department) {
        if (teacherNum < 20) {
            //add the teacher
            teachers[teacherNum] = new Teacher(firstName, lastName, department);
            teacherNum++;
            System.out.println("Add teacher " + firstName + " " + lastName + " successfully.");
        }
        else {
            //reach the cap
            System.out.println("Max teacher reached, add a new teacher failed.");
        }
    }

    /**
     * Add a student in the school management system, max 200.
     * @param firstName
     * @param lastName
     * @param department
     */
    public void addStudent(String firstName, String lastName, Department department) {
        if (studentNum < 200) {
            //add the student
            students[studentNum] = new Student(firstName, lastName, department);
            studentNum++;
            System.out.println("Add student " + firstName + " " + lastName + " successfully.");
        }
        else {
            //reach the cap
            System.out.println("Max student reached, add a new student failed.");
        }
    }

    /**
     * assign a teacher to a course,
     * if there is already a teacher teaching, print a message.
     * if the input ids are wrong, print a message.
     * @param teacherId
     * @param courseId
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        Teacher teacher = findTeacher(teacherId);
        Course course = findCourse(courseId);

        if (teacher != null && course != null) {
            if (course.getTeacher() == null) {
                course.setTeacher(teacher);
                System.out.println(course + " teacher info updated successfully.");
            } else {
                System.out.println("Course " + courseId + " is already taught by a teacher.");
            }
        } else {
            System.out.println("Teacher or course not found.");
        }
    }

    /**
     * sign up a student in a course,
     * if student's already registered to 5 courses, print a message.
     * if the course is full, print a message.
     * if the input ids are wrong, print a message.
     * @param studentId
     * @param courseId
     */
    public void registerCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);

        if (student != null && course != null) {
            if (course.getStudentNum() < 5 && student.getCourseNum() < 5) {
                course.registerStudent(student);
                student.registerCourse(course);
                System.out.println("Student registered for the course successfully.\n" +
                        "Latest student info: " + student +
                        "\nLatest course info: " + course);
            } else if (course.getStudentNum() >= 5) {
                System.out.println("Max student reached, add a new student failed..");
            } else {
                System.out.println("Max course reached, add a new course failed.");
            }
        } else {
            System.out.println("Student or course not found with id. Register failed.");
        }
    }
}
