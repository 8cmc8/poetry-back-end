package com.poetry.dao;

import com.poetry.entity.CategoryPoetry;
import com.poetry.entity.Poetry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * ClassName: PoetryDaoTest <br/>
 * Description: <br/>
 * date: 2019-04-29 10:42<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class PoetryDaoTest {
    @Autowired
    private PoetryDao poetryDao;
    @Test
    public void insertPoetry() {
        Poetry poetry = new Poetry();
        poetry.setPoetryName("静夜思");
        poetry.setDynasty("唐");
        poetry.setAuthor("李白");
        poetry.setContent("床前明月光，疑是地上霜，举头望明月，低头思故乡");
        poetry.setAnnotation("床：（注释内容）；地上霜：（注释内容）；");
        poetry.setTrans("译文内容");
        poetry.setImageUrl("url");
        poetryDao.insertPoetry(poetry);
    }
    @Test
    public void updatePoetry() {
        Poetry poetry = new Poetry();
        poetry.setId(1);
        poetry.setAnnotation("床");
        poetryDao.updatePoetry(poetry);
    }
    @Test
    public void deleteByPoetryId() {
        poetryDao.deleteByPoetryId(2);
    }
    @Test
    public void deleteByPoetryName() {
        poetryDao.deleteByPoetryName("静夜思");
    }
    @Test
    public void insertPoetryCategory() {
        poetryDao.insertPoetryCategory(3,"唐诗三百首","选集");
    }
    @Test
    public void getAllPoetry() {
        List<Poetry> poetrys = poetryDao.getByPoetryName("静夜思");
        System.out.print(poetrys);
    }
    @Test
    public void getByPoetryName() {
        List<Poetry> poetrys = poetryDao.getAllPoetry();
        System.out.print(poetrys);
    }
    @Test
    public void getByPoetryAuthor() {
        List<Poetry> poetrys = poetryDao.getByPoetryAuthor("李白");
        System.out.print(poetrys);
    }
    @Test
    public void getByDynasty() {
        List<Poetry> poetries = poetryDao.getByDynasty("唐");
        System.out.print(poetries);
    }
    @Test
    public void getPoetryIdByChildCategoryName() {
        List<Poetry> poetries = poetryDao.getPoetryByChildCategoryName("唐诗三百首");
        System.out.print(poetries);
    }
    @Test
    public void getByRootCategoryName() {
        List<CategoryPoetry> categoryPoetries = poetryDao.getByRootCategoryName("选集");
        System.out.print(categoryPoetries);
    }

}