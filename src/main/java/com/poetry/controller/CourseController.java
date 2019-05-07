package com.poetry.controller;

import com.poetry.common.Result;
import com.poetry.entity.Course.Course;
import com.poetry.entity.Course.vo.CourseListVo;
import com.poetry.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: CourseController <br/>
 * Description: <br/>
 * date: 2019-05-03 17:45<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    private Logger logger = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private CourseService courseService;

    //    @RequestMapping("/simpleList")
//    @ResponseBody
//    public Result<List<Course>> getAll() {
//        List<Course> courseList = courseService.getCourseAll();
//        if(courseList != null) {
//            return Result.success(courseList);
//        }
//        return Result.fail("无课程");
//    }
    @GetMapping("/listAll")
    public Result listAll() {
        try {
            List<CourseListVo> courseListVos = courseService.listAll();
            return Result.success(courseListVos);
        } catch (Exception e) {
            logger.error("", e);
        }
        return Result.fail();
    }

    @GetMapping("/selectCourseById")
    public Result selectCourseById(@RequestParam("id") int id) {
        try {
            Course course = courseService.selectCourseById(id);
            return Result.success(course);
        } catch (Exception e) {
            logger.error("", e);
        }
        return Result.fail();
    }
}
