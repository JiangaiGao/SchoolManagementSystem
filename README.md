# SchoolManagementSystem
Author: Jiangai Gao

For unknown reasons i cant put courses to string or the code crash... i give up sorry teacher i suck <:(

Project creates a school management system with basic functionalities, like register personals, find objects with Ids, etc.
- includes different classes such as:
  - SchoolManagementSystem: includes all methods(findDepartment; addDepartment; printDepartments; findStudent; addStudent; printStudents;          findTeacher; addTeacher; printTeachers; findCourse; addcourse; printCourse), manages different classes:
  - Student: represents students in a school, with names, Ids, registered courses, department
  - Course: represents classes in a school, with names, Ids, credits, assigned teacher, registered students and department
  - Teacher: represents teachers in a school, with names, Ids, assigned courses, department
  - Department: represents departments in a school, with names and Ids.

A SchoolManagementSystem that:
1. Contains different departments (max 5), each department has an id that increases each time.
2. Contains an amount of students (max 200), each student has an id that increases each time. 
   Each student can register an amount of courses (max 5).
3. Contains an amount of teachers (max 20), each teacher has an id that increases each time.
4. Contains an amount of courses (max 30), each course has an id that increases each time.
   Each course is taught by one teacher and can be registered by a number of students (max 5).
6. Is able to add a new department, a new student, a new teacher, a new course.
7. Is able to display all departments in a school, only display the department that is not null;
   display all students in a school, only display the student that is not null. And only display
   the names of courses and department if there is any;
   display all teachers in a school, only display the teacher that is not null. And only display
   the names of course and department if there is any;
   display all courses in a school, only display the course that is not null. And only display
   the names of teacher, students, and department if there is any.
8. Search a department, a teacher, a course or a student based on an Id. If the Id does not match with anything in the objects, return null.
9. Assign a teacher to a specific course, based on teacherId and courseId, if no teacher or course can be found with those ids, print a message.
10. Register a course for a student, based on studentId and courseId, which will check
    If the studentId or courseId does not match with anything, print a message.
    If the student has register max amount courses (5), print a message.
    If the course has be registered by the max number of students (5), print a message.
    If the course has be registered by the student already, it cannot be registered again, print a message.
    Else add the course to the student’s registered courses array, and also add the student to the course’s registered students array.
