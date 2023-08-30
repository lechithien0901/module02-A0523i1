package ss08_mvc_refactoring.pratice.respository;

import ss08_mvc_refactoring.pratice.model.Student;

public interface IStudentRepository {
 Student[] findAll();
void addStudent(Student student);
void fixStudent();
 void deleteStudent();
 int getSize();
}
