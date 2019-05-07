package com.poetry.controller;

import com.poetry.common.Result;
import com.poetry.entity.User.User;
import com.poetry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName: UserController <br/>
 * Description: <br/>
 * date: 2019-04-28 21:45<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestBody User user) {
        String userName = user.getUserName();
        List<User> users = userService.getAll();
        int flag = 0;
        for (User u:users
        ) {
            if (u.getUserName().equals(userName)) {
                flag ++;
                break;
            }
        }
        if (flag == 0){
            return Result.fail("用户名不存在");
        }
        if(!user.getPassword().equals(userService.getByName(userName).getPassword())){
            return Result.fail("密码错误");
        }
        return Result.success(userName).setMsg("登录成功");
    }
    @RequestMapping("/register")
    @ResponseBody
    public Result register(@RequestBody User user) {
        String userName = user.getUserName();
        List<User> users = userService.getAll();
        for (User u:users
        ) {
            if (u.getUserName().equals(userName)) {
                return Result.fail("用户名已被使用");
            }
        }
        userService.addUser(user);
        return Result.success().setMsg("注册成功");
    }
}
