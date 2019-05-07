package com.poetry.dao;

import com.poetry.entity.Course.Course;
import com.poetry.entity.Course.vo.CourseListVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: CourseDao <br/>
 * Description: <br/>
 * date: 2019-05-03 14:07<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public interface CourseDao {
    //    List<Course> getCourseAll();
//    Course getCourseByCourseName(String courseName);
//    List<CourseSection> getCourseSectionByCourseId(int courseId);
//    List<CourseComment> getCourseCommentByCourseId(int courseId);
//    List<CourseCollection> getCourseCollectionByCourseId(int courseId);
    List<CourseListVo> listAll();

    Course selectCourseById(@Param("id") int id);
}
