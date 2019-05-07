package com.poetry.dao;

import com.poetry.entity.Category.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * ClassName: CategoryDaoTest <br/>
 * Description: <br/>
 * date: 2019-05-01 11:15<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class CategoryDaoTest {
    @Autowired
    private CategoryDao categoryDao;
    @Test
    public void getAllRootCategory() {
        List<Category> categories = categoryDao.getAllRootCategory();
        System.out.println(categories);
    }
    @Test
    public void getAllChildCategory() {
        List<Category> categories = categoryDao.getAllChildCategory(8);
        System.out.println(categories);
    }
}