package com.epam.training.StudentRegistration;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentDaoImplementation implements StudentDao {

  //list is working as a database
    List<Student> students;

    public StudentDaoImplementation(){
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert",0);
        Student student2 = new Student("John",1);
        students.add(student1);
        students.add(student2);
     }

     public void deleteStudent(Student student) {
        students.remove(student);
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
     }

     //retrieve list of students from the database
     public List<Student> getAllStudents() {
        return students;
     }

     public List<Student> getStudents(int recordsLimit, int pageNo) {
         int maxPages = 0;

         if (students.size() % recordsLimit == 0)
             maxPages = students.size() / recordsLimit;
         else
             maxPages = students.size() / recordsLimit + 1;

         if (pageNo > maxPages)
             return new ArrayList<Student>(0);

         List<Student> fetchedList = new LinkedList<>();

         for (int index = recordsLimit * (pageNo - 1); index < students.size() && index < recordsLimit * pageNo; index++)
             fetchedList.add(students.get(index));

         return fetchedList;
     }


     public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
     }


    public void save(Student t) {
        students.add(t);
    }



}
