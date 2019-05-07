package com.poetry.controller;

import com.poetry.common.Result;
import com.poetry.entity.User.User;
import com.poetry.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    UserService userService;

    @PostMapping("/login")
    @ApiOperation(value = "登陆", tags = "用户")
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
}
