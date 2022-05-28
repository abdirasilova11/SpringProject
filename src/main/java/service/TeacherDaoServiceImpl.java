package service;

import dao.TeacherDao;
import model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeacherDaoServiceImpl implements TeacherService {

    private TeacherDao teacherDao;

    @Autowired
    public TeacherDaoServiceImpl(TeacherDao teacherDao){
        this.teacherDao = teacherDao;
    }

    @Override
    public void addTeacher(Teacher teacher) {
teacherDao.addTeacher(teacher);
    }

    @Override
    public void updateTeacher(Long id, Teacher teacher) {
teacherDao.updateTeacher(id, teacher);
    }
    @Override
    public List<Teacher> teachers(Long id) {
        return teacherDao.teachers(id);
    }
    @Override
    public Teacher getTeacherById(Long id) {
        return teacherDao.getTeacherById(id);
    }
    @Override
    public void removeTeacherById(Long id) {
teacherDao.removeTeacherById(id);
    }
}
