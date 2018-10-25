package com.epam.training.StudentRegistration;
import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public List<Student> getStudents(int recordsLimit, int pageNo);
    public void save(Student t);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);

}
