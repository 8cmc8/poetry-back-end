package com.poetry.service;

import com.poetry.entity.Poetry.Poetry;
import com.poetry.entity.User.User;

import java.util.List;

/**
 * ClassName: UserService <br/>
 * Description: <br/>
 * date: 2019-04-28 22:02<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public interface UserService {
    User getByName(String userName);
    User getById(int id);
    List<User> getAllNotId(int id);
    Boolean addUser(User user);
    Boolean updateUser(User user);
    Boolean deleteById(int id);
    Boolean deleteCollectedPoetry(int userId, int poetryId);
    Boolean deleteByName(String userName);
    List<User> getAll();
    Boolean insertCollectionWithPoetry(int userId,int poetryId);
    List<Poetry> getAllCollectedPoetryByUserName(String userName);
}
