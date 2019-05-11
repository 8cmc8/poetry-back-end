package com.poetry.controller;

import com.poetry.common.Result;
import com.poetry.entity.Course.Course;
import com.poetry.entity.Course.CourseCollection;
import com.poetry.entity.Course.vo.CourseListVo;
import com.poetry.entity.Course.vo.UserCourseStarVo;
import com.poetry.entity.Course.vo.UserCourseVo;
import com.poetry.entity.Poetry.Poetry;
import com.poetry.entity.Poetry.PoetryCollection;
import com.poetry.entity.User.User;
import com.poetry.service.CourseService;
import com.poetry.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@Api(value = "/course", tags = "课程")
public class CourseController {

    private Logger logger = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private CourseService courseService;

    @Autowired
    private UserService userService;

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
    @ApiOperation(value = "展示所有课程", tags = "课程")
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
    @ApiOperation(value = "按id查找课程", tags = "课程")
    public Result selectCourseById(@RequestParam("id") int id) {
        try {
            Course course = courseService.selectCourseById(id);
            return Result.success(course);
        } catch (Exception e) {
            logger.error("", e);
        }
        return Result.fail();
    }
    @GetMapping("/detail")
    @ApiOperation(value = "按id查找课程详细", tags = "课程")
    public Result<Course> getCourseDetailByCourseId(@RequestParam("id") int id) {
        try {
            Course course = courseService.selectCourseById(id);
            return Result.success(course);
        } catch (Exception e) {
            logger.error("", e);
        }
        return Result.fail("未找到课程详情");
    }
    @PostMapping("/collection")
    @ApiOperation(value = "收藏课程", tags = "课程")
    public Result getCourseDetailByCourseId(@RequestBody UserCourseVo userCourseVo) {
        try {
            User user = userService.getByName(userCourseVo.getUserName());
            int userId = user.getId();
            int courseId = userCourseVo.getCourseId();
            Boolean aBoolean = courseService.insertCourseCollection(userId, courseId);
            if(aBoolean){
                return Result.success().setMsg("收藏成功");
            }
            return Result.fail("您已经收藏过了");
        } catch (Exception e) {
            logger.error("", e);
        }
        return Result.fail("您已经收藏过了");
    }
    @GetMapping("/collected")
    @ApiOperation(value = "根据用户名获取已收藏的课程", tags = "课程")
    public Result<List<Course>> getCollectedCourseByUserName(@RequestParam("userName")String userName){
        User user = userService.getByName(userName);
        int userId = user.getId();
        List<Course> allCollectedCourseByUserId = courseService.getAllCollectedCourseByUserId(userId);
        if(allCollectedCourseByUserId.size() != 0) {
            return Result.success(allCollectedCourseByUserId);
        }
        return Result.fail("未收藏过任何诗词");
    }
    @PostMapping("/deleteCollected")
    @ApiOperation(value = "根据userId和poetryId删除已收藏的课程", tags = "课程")
    public Result deleteCollectedCourse(@RequestBody CourseCollection courseCollection){
        int userId = courseCollection.getUserId();
        int courseId = courseCollection.getCourseId();
        Boolean aBoolean = courseService.deleteCollectedCourse(userId, courseId);
        if (aBoolean) {
            return Result.success().setMsg("取消收藏成功");
        }
        return Result.fail("取消收藏失败");
    }
    @PostMapping("/commitStar")
    @ApiOperation(value = "提交课程评价", tags = "课程")
    public Result commitCourseStar(@RequestBody UserCourseStarVo userCourseStarVo){
        int courseId = userCourseStarVo.getCourseId();
        int userId = userCourseStarVo.getUserId();
        int starLevel = userCourseStarVo.getStarLevel();
        Boolean aBoolean = courseService.commitCourseStar(userId, courseId, starLevel);
        if (aBoolean) {
            return Result.success().setMsg("评价成功");
        }
        return Result.fail("您已经评价过了");
    }
}
