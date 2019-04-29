package com.poetry.service;

import com.poetry.entity.User;

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
    /**
     * Description:根据用户名查询
     *
     * @author: cmc
     * @date: 2019-04-28 22:12
      @param: userName 用户名
     *@return: UserDao.class
     */
    User getByName(String userName);
    Boolean addUser(User user);
    Boolean updateUser(User user);
    Boolean deleteById(int id);
    Boolean deleteByName(String userName);
    List<User> getAll();
}
