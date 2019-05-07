package com.poetry.dao;

import com.poetry.entity.Course.Course;
import com.poetry.entity.Course.CourseCollection;
import com.poetry.entity.Course.CourseComment;
import com.poetry.entity.Course.CourseSection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * ClassName: CourseDaoTest <br/>
 * Description: <br/>
 * date: 2019-05-03 17:32<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class CourseDaoTest {
    @Autowired
    private CourseDao courseDao;
    @Test
    public void getCourseByCourseName() {
        Course rootCategories = courseDao.getCourseByCourseName("选集");
        System.out.print(rootCategories);
    }
    @Test
    public void getCourseSectionByCourseId() {
        List<CourseSection> rootCategories = courseDao.getCourseSectionByCourseId(1);
        System.out.println(rootCategories);
    }
    @Test
    public void getCourseCommentByCourseId() {
        List<CourseComment> rootCategories = courseDao.getCourseCommentByCourseId(1);
        System.out.print(rootCategories);
    }
    @Test
    public void getCourseCollectionByCourseId() {
        List<CourseCollection> rootCategories = courseDao.getCourseCollectionByCourseId(1);
        System.out.print(rootCategories);
    }
    @Test
    public void getCourseAll() {
        List<Course> courseAll = courseDao.getCourseAll();
        System.out.println(courseAll);
    }
}