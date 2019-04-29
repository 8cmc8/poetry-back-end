package com.poetry.dao;

import com.poetry.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: UserDaoTest <br/>
 * Description: <br/>
 * date: 2019-04-26 11:35<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class UserDaoTest {
    
    @Autowired
    private UserDao userDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUserName("cmc");
        user.setPassword("123456");
        user.setGender(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1997-7-4");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setBirthday(date);
        userDao.insertUser(user);
    }

    @Test
    public void deleteUser() {
        userDao.deleteByUserId(1);
        userDao.deleteByUserId(3);
        userDao.deleteByUserId(4);
        userDao.deleteByUserId(7);
        userDao.deleteByUserName("cmc");
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(11);
        user.setUserName("cc");
        user.setPassword("123456werewr");
        user.setGender(1);
        userDao.updateUser(user);
    }

    @Test
    public void getByUserId() {
        User user = userDao.getByUserId(11);
        System.out.print(user);

    }

    @Test
    public void getByUserName() {
        User user = userDao.getByUserName("cmc");
        System.out.print(user);
    }
    @Test
    public void getAllUser() {
        List<User> user = userDao.getAllUser();
        Iterator<User> u = user.iterator();
        while(u.hasNext()) {
            System.out.print(u.next());
        }
        System.out.print(user);
    }
}