package service;

import dao.CourseDao;
import model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{

    private CourseDao courseDao;

    @Autowired
    public CourseServiceImpl(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    @Override
    public void updateCourse(Long id, Course c) {
        courseDao.updateCourse(id,c);
    }

    @Override
    public List<Course> courseList(Long id) {
        return courseDao.courseList(id);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseDao.getCourseById(id);
    }

    @Override
    public void removeCourseById(Long id) {
        courseDao.removeCourseById(id);
    }

    @Override
    public List<Course> getAll() {
        return courseDao.getAll();
    }
}
