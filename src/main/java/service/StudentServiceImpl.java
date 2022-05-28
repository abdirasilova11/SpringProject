package service;

import dao.StudentDao;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    private StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void addStudent(Student s) {
studentDao.addStudent(s);
    }

    @Override
    public void updateStudent(Long id, Student s) {
studentDao.updateStudent(id, s);
    }

    @Override
    public List<Student> students(Long id) {
        return studentDao.students(id);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public void removeStudentById(Long id) {
studentDao.removeStudentById(id);
    }
}
