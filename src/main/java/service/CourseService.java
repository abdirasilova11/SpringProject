package service;

import model.Course;

import java.util.List;

public interface CourseService {
    void addCourse(Course course);
    void updateCourse(Long id,Course c);
    List<Course> courseList(Long id);
    Course getCourseById(Long id);
    void removeCourseById(Long id);
    List<Course> getAll();
}
