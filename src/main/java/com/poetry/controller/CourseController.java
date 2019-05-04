package com.poetry.controller;

import com.poetry.common.Result;
import com.poetry.entity.Course;
import com.poetry.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName: CourseController <br/>
 * Description: <br/>
 * date: 2019-05-03 17:45<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/simpleList")
    @ResponseBody
    public Result<List<Course>> getAll() {
        List<Course> courseList = courseService.getCourseAll();
        if(courseList != null) {
            return Result.success(courseList);
        }
        return Result.fail("无课程");
    }


}
