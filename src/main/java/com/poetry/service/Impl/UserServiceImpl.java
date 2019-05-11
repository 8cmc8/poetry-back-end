package com.poetry.service.Impl;

import com.poetry.dao.PoetryDao;
import com.poetry.dao.UserDao;
import com.poetry.entity.Poetry.Poetry;
import com.poetry.entity.User.User;
import com.poetry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserServiceImpl <br/>
 * Description: <br/>
 * date: 2019-04-28 22:18<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    PoetryDao poetryDao;

    @Override
    public User getByName(String userName) {
        return userDao.getByUserName(userName);
    }

    @Override
    public Boolean addUser(User user) {
        int i = userDao.insertUser(user);
        return i > 0;
    }

    @Override
    public Boolean updateUser(User user) {
        int i = userDao.updateUser(user);
        return i > 0;
    }

    @Override
    public Boolean deleteById(int id) {
        int i = userDao.deleteByUserId(id);
        return i > 0;
    }

    @Override
    public Boolean deleteByName(String userName) {
        int i = userDao.deleteByUserName(userName);
        return i > 0;
    }

    @Override
    public List<User> getAll() {
        return userDao.getAllUser();
    }

    @Override
    public Boolean insertCollectionWithPoetry(int userId, int poetryId) {
        int i = userDao.insertCollectionWithPoetry(userId,poetryId);
        return i > 0;
    }

    @Override
    public User getById(int id) {
        return userDao.getByUserId(id);
    }

    @Override
    public List<User> getAllNotId(int id) {
        return userDao.getAllNotId(id);
    }

    @Override
    public List<Poetry> getAllCollectedPoetryByUserName(String userName) {
        int userId = userDao.getByUserName(userName).getId();
        List<Poetry> allCollectedPoetryByUserId = poetryDao.getAllCollectedPoetryByUserId(userId);
        return allCollectedPoetryByUserId;
    }

    @Override
    public Boolean deleteCollectedPoetry(int userId, int poetryId) {
        int i = userDao.deleteCollectedPoetryBy2Id(userId,poetryId);
        return i > 0;
    }
}
