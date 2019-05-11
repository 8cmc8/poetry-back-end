package com.poetry.service.Impl;

import com.poetry.dao.CourseDao;
import com.poetry.entity.Course.Course;
import com.poetry.entity.Course.vo.CourseListVo;
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
    public List<CourseListVo> listAll() {
        List<CourseListVo> courseListVos = courseDao.listAll();
        for (CourseListVo courseListVo : courseListVos) {
            System.out.println(courseListVo);
        }
        return courseListVos;
    }

    @Override
    public Course selectCourseById(int id) {
        return courseDao.selectCourseById(id);
    }

    @Override
    public Boolean insertCourseCollection(int userId, int courseId) {
        int i = courseDao.insertCourseCollection(userId,courseId);
        return i > 0;
    }

    @Override
    public List<Course> getAllCollectedCourseByUserId(int userId) {
        List<Course> allCollectedCourseByUserId = courseDao.getAllCollectedCourseByUserId(userId);
        return allCollectedCourseByUserId;
    }

    @Override
    public Boolean deleteCollectedCourse(int userId, int courseId) {
        int i = courseDao.deleteCollectedCourse(userId, courseId);
        return i > 0;
    }

    @Override
    public Boolean commitCourseStar(int userId, int courseId, int starLevel) {
        int i = courseDao.commitCourseStar(userId, courseId, starLevel);
        return i > 0;
    }

    //    @Override
//    public List<Course> getCourseAll() {
//        return courseDao.getCourseAll();
//    }
//
//    @Override
//    public Course getCourseByCourseName(String courseName) {
//
//        return courseDao.getCourseByCourseName(courseName);
//    }
//
//    @Override
//    public List<CourseSection> getCourseSectionByCourseId(int courseId) {
//        return courseDao.getCourseSectionByCourseId(courseId);
//    }
//
//    @Override
//    public List<CourseComment> getCourseCommentByCourseId(int courseId) {
//        return courseDao.getCourseCommentByCourseId(courseId);
//    }
//
//    @Override
//    public List<CourseCollection> getCourseCollectionByCourseId(int courseId) {
//        return courseDao.getCourseCollectionByCourseId(courseId);
//    }
}
