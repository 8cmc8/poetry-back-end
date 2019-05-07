package com.poetry.service.Impl;

import com.poetry.dao.CourseDao;
import com.poetry.entity.Course.Course;
import com.poetry.entity.Course.CourseCollection;
import com.poetry.entity.Course.CourseComment;
import com.poetry.entity.Course.CourseSection;
import com.poetry.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: CourseServiceImpl <br/>
 * Description: <br/>
 * date: 2019-05-03 17:42<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourseAll() {
        return courseDao.getCourseAll();
    }

    @Override
    public Course getCourseByCourseName(String courseName) {

        return courseDao.getCourseByCourseName(courseName);
    }

    @Override
    public List<CourseSection> getCourseSectionByCourseId(int courseId) {
        return courseDao.getCourseSectionByCourseId(courseId);
    }

    @Override
    public List<CourseComment> getCourseCommentByCourseId(int courseId) {
        return courseDao.getCourseCommentByCourseId(courseId);
    }

    @Override
    public List<CourseCollection> getCourseCollectionByCourseId(int courseId) {
        return courseDao.getCourseCollectionByCourseId(courseId);
    }
}
