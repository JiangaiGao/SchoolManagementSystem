package org.ov.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter

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

    //Find
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department != null && department.getDepartmentId().equals(departmentId)) {
                return department;
            }
        }
        return null;
    }

    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (student != null && student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course != null && course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher != null && teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    //Print
    public void printTeachers() {
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println("Teacher ID: " + teacher.getTeacherId() +
                        ", Name: " + teacher.getFirstName() + " " + teacher.getLastName());
            }
        }
    }

    public void printStudents() {
        for (Student student : students) {
            if (student != null) {
                System.out.println("Student ID: " + student.getStudentId() +
                        ", Name: " + student.getFirstName() + " " + student.getLastName());
                //if (student.getCourses() != null) {
                    //System.out.println("  Courses:");
                    //for (Course course : student.getCourses()) {
                        //System.out.println("    - " + course.getCourseName());
                    //}
                //}
            }
        }
    }

    public void printDepartments() {
        for (Department department : departments) {
            if (department != null) {
                System.out.println("Department ID: " + department.getDepartmentId() +
                        ", Name: " + department.getDepartmentName());
            }
        }
    }

    public void printCourses() {
        for (Course course : courses) {
            if (course != null) {
                System.out.println("Course ID: " + course.getCourseId() +
                        ", Name: " + course.getCourseName());
                if (course.getTeacher() != null) {
                    System.out.println("  Teacher: " + course.getTeacher().getFirstName() +
                            course.getTeacher().getLastName());
                }
//                if (course.getStudents() != null) {
//                    System.out.println("  Students:");
//                    for (Student student : course.getStudents()) {
//                        System.out.println("    - " + student.getFirstName() +
//                                student.getLastName());
//                    }
//                }
            }
        }
    }

    //Add
    public void addDepartment(String departmentName) {
    }
    public void addDepartment(Department department) {
        if (departmentNum < 5) {
            //add the department
            departments[departmentNum] = department;
            departmentNum++;
            System.out.printf("Add department %s successfully.\n", department);
        }
        else {
            //reach the cap
            System.out.println("There are 5 departments already");
        }
    }

    //What's the third String :(
    public void addCourse(String courseName, double credit, String x) {
    }
    public void addCourse(Course course) {
        if (courseNum < 30) {
            //add the course
            courses[courseNum] = course;
            courseNum++;
            System.out.printf("Add course %s successfully.\n", course);
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
            teacherNum++;
            System.out.printf("Add teacher %s successfully.\n", teacher);
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
            studentNum++;
            System.out.printf("Add student %s successfully.\n", student);
        }
        else {
            //reach the cap
            System.out.printf("There are %d students already", 200);
        }
    }

    //Modification
    public void modifyCourseTeacher(String teacherId, String courseId) {
        Teacher teacher = findTeacher(teacherId);
        Course course = findCourse(courseId);

        if (teacher != null && course != null) {
            if (course.getTeacher() == null) {
                course.setTeacher(teacher);
                System.out.println("Course " + courseId + " is taught by teacher " + teacherId);
            } else {
                System.out.println("Course " + courseId + " is already taught by a teacher.");
            }
        } else {
            System.out.println("Teacher or course not found.");
        }
    }

    public void registerCourse(String studentId, String courseId) {
        Student student = findStudent(studentId);
        Course course = findCourse(courseId);

        if (student != null && course != null) {
            student.setCourses(courses);
            System.out.println("Course " + courseId + " registered for student " + studentId);
        } else {
            System.out.println("Student or course not found.");
        }
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
