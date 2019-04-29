package com.poetry.dao;

import com.poetry.entity.User;

import java.util.List;

/**
 * ClassName: UserDao <br/>
 * Description: <br/>
 * date: 2019-04-25 23:07<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public interface UserDao {
    int insertUser(User user);
    int updateUser(User user);
    int deleteByUserId(int id);
    int deleteByUserName(String userName);
    User getByUserId(int id);
    User getByUserName(String userName);
    List<User> getAllUser();
}
