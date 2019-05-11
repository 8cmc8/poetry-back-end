package com.poetry.controller;

import com.poetry.common.Result;
import com.poetry.dao.UserDao;
import com.poetry.entity.Poetry.Poetry;
import com.poetry.entity.Poetry.PoetryCollection;
import com.poetry.entity.User.User;
import com.poetry.entity.User.VO.UserPoetryVO;
import com.poetry.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: UserController <br/>
 * Description: <br/>
 * date: 2019-04-28 21:45<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/user")
@Api(value = "/user", tags = "用户")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ApiOperation(value = "登录", tags = "用户")
    public Result login(@RequestBody User user) {
        String userName = user.getUserName();
        List<User> users = userService.getAll();
        int flag = 0;
        for (User u : users
        ) {
            if (u.getUserName().equals(userName)) {
                flag++;
                break;
            }
        }
        if (flag == 0) {
            return Result.fail("用户名不存在");
        }
        if (!user.getPassword().equals(userService.getByName(userName).getPassword())) {
            return Result.fail("密码错误");
        }
        return Result.success(userName).setMsg("登录成功");
    }

    @PostMapping("/register")
    @ApiOperation(value = "注册", tags = "用户")
    public Result register(@RequestBody User user) {
        String userName = user.getUserName();
        List<User> users = userService.getAll();
        for (User u : users
        ) {
            if (u.getUserName().equals(userName)) {
                return Result.fail("用户名已被使用");
            }
        }
        userService.addUser(user);
        return Result.success().setMsg("注册成功");
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改信息", tags = "用户")
    public Result update(@RequestBody User user) {
        List<User> users = userService.getAllNotId(user.getId());
        String name = user.getUserName();
        boolean flag = false;
        for (User u : users) {
            if (u.getUserName().equals(name)){
                flag = true;
                break;
            }
        }
        if (flag) {
            return Result.fail("用户名已存在");
        }else {
            userService.updateUser(user);
            return Result.success().setMsg("更新成功");
        }
    }

    @GetMapping("/basicInfo")
    @ApiOperation(value = "根据用户名获取用户", tags = "用户")
    public Result<User> getByUserName(@RequestParam("userName")String userName){
        User user = userService.getByName(userName);
        if(user != null) {
            return Result.success(user);
        }
        return Result.fail("用户不存在");
    }
    @PostMapping("/collection/poetry")
    @ApiOperation(value = "收藏诗词", tags = "用户")
    public Result register(@RequestBody UserPoetryVO userPoetryVO) {
        User user = userService.getByName(userPoetryVO.getUserName());
        int userId = user.getId();
        int poetryId = userPoetryVO.getPoetryId();
        Boolean aBoolean = userService.insertCollectionWithPoetry(userId, poetryId);
        if(aBoolean){
            return Result.success().setMsg("收藏成功");
        }
        return Result.fail("您已经收藏过了");
    }
    @GetMapping("/collected")
    @ApiOperation(value = "根据用户名获取已收藏的诗词", tags = "用户")
    public Result<List<Poetry>> getCollectedPoetryByUserName(@RequestParam("userName")String userName){
        List<Poetry> allCollectedPoetryByUserName = userService.getAllCollectedPoetryByUserName(userName);
        if(allCollectedPoetryByUserName.size() != 0) {
            return Result.success(allCollectedPoetryByUserName);
        }
        return Result.fail("未收藏过任何诗词");
    }
    @PostMapping("/deleteCollected")
    @ApiOperation(value = "根据userId和poetryId删除已收藏的诗词", tags = "用户")
    public Result deleteCollectedPoetry(@RequestBody PoetryCollection poetryCollection){
        int userId = poetryCollection.getUserId();
        int poetryId = poetryCollection.getPoetryId();
        Boolean aBoolean = userService.deleteCollectedPoetry(userId, poetryId);
        if (aBoolean) {
            return Result.success().setMsg("取消收藏成功");
        }
        return Result.fail("取消收藏失败");
    }
}