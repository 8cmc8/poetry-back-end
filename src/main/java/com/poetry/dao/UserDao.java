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
    int insert(User user);
    int update(User user);
    int deleteById(int id);
    int deleteByName(String userName);
    User getById(int id);
    User getByName(String userName);
    List<User> getAll();
}
