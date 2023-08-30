package ss08_mvc_refactoring.pratice.service;

import ss08_mvc_refactoring.pratice.model.Student;

public interface IStudentService {
    Student []findAll();
   void addStudent(Student student);
    void fixStudent();
    void deleteStudent();

}
