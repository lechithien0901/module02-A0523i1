package ss08_mvc_refactoring.pratice.service;

import ss08_mvc_refactoring.pratice.model.Student;
import ss08_mvc_refactoring.pratice.respository.IStudentRepository;
import ss08_mvc_refactoring.pratice.respository.StudentRespository;

public class StudentService implements IStudentService {
    IStudentRepository iStudentRepository=new StudentRespository();

    @Override
    public Student[] findAll() {
        return iStudentRepository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        iStudentRepository.addStudent(student);
    }

    @Override
    public void fixStudent() {
         iStudentRepository.fixStudent();
    }

    @Override
    public void deleteStudent() {
        iStudentRepository.deleteStudent();
    }

}
