package com.poetry.service;

import com.poetry.entity.Course;
import com.poetry.entity.CourseCollection;
import com.poetry.entity.CourseComment;
import com.poetry.entity.CourseSection;

import java.util.List;

/**
 * ClassName: CourseService <br/>
 * Description: <br/>
 * date: 2019-05-03 17:39<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public interface CourseService {
    List<Course> getCourseAll();
    Course getCourseByCourseName(String courseName);
    List<CourseSection> getCourseSectionByCourseId(int courseId);
    List<CourseComment> getCourseCommentByCourseId(int courseId);
    List<CourseCollection> getCourseCollectionByCourseId(int courseId);
}
