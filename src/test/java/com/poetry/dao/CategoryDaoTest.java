package com.poetry.dao;

import com.poetry.entity.RootCategory;
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
    public void getChildCategoryByRootCategoryName() {
        List<RootCategory> rootCategories = categoryDao.getChildCategoryByRootCategoryName("选集");
        System.out.print(rootCategories);
    }
}