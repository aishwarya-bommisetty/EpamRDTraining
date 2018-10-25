package com.epam.training.StudentRegistration;

import java.util.List;

public class StudentService {

    static StudentDaoImplementation dao = new StudentDaoImplementation();

    public boolean Register(String name, int rollNo) {

        Student student=new Student(name, rollNo);
        dao.save(student);
        return true;
    }

    public List<Student> get() {
        List<Student> student = dao.getAllStudents();
        return student;
    }

    /**
     * Method for checking if id is same or not.
     * @param student
     * @throws NotUniqueIdException
     */
    public void idSame(Student student) throws NotUniqueIdException {
      List<Student> studentList = get();
      for(Student std : studentList) {
        if( std.getRollNo() == student.getRollNo()) {
          throw new NotUniqueIdException("Student id is not unique");
        }
      }
    }
    public boolean search(Find find)
    {
        List<Student> students=dao.getAllStudents();
        for (Student obj : students) {
            boolean check = find.check(obj);
        if ((true == check)) {
            obj.toString();
            return true;
        }
        }
        return false;
    }
}
