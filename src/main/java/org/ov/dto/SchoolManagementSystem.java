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
        System.out.println("Displaying all teachers:\n----------");
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
    }

    public void printStudents() {
        System.out.println("Displaying all students:\n----------");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
//                if (student.getCourses() != null) {
//                    System.out.println("  Courses:");
//                    for (Course course : student.getCourses()) {
//                        System.out.println("    - " + course.getCourseName());
//                    }
//                }
            }
        }
    }

    public void printDepartments() {
        System.out.println("Displaying all departments:\n----------");
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    public void printCourses() {
        System.out.println("Displaying all courses:\n----------");
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
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
    public void addDepartment(Department department) {
        if (departmentNum < 5) {
            //add the department
            departments[departmentNum] = department;
            departmentNum++;
            System.out.println("Add department " + department + " successfully.");
        }
        else {
            //reach the cap
            System.out.println("Max department reached, add a new department failed.");
        }
    }

    public void addCourse(Course course) {
        if (courseNum < 30) {
            //add the course
            courses[courseNum] = course;
            courseNum++;
            System.out.println("Add course " + course + " successfully.");
        }
        else {
            //reach the cap
            System.out.println("Max course reached, add a new course failed.");
        }
    }

    public void addTeacher(Teacher teacher) {
        if (teacherNum < 20) {
            //add the teacher
            teachers[teacherNum] = teacher;
            teacherNum++;
            System.out.println("Add teacher " + teacher + " successfully.");
        }
        else {
            //reach the cap
            System.out.println("Max teacher reached, add a new teacher failed.");
        }
    }

    public void addStudent(Student student) {
        if (studentNum < 200) {
            //add the student
            students[studentNum] = student;
            studentNum++;
            System.out.println("Add student " + student + " successfully.");
        }
        else {
            //reach the cap
            System.out.println("Max student reached, add a new student failed.");
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
