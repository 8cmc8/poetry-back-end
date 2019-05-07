package com.poetry.dao;

import com.poetry.entity.Poetry.Poetry;
import com.poetry.entity.vo.PoetryChildCategoryVO;
import com.poetry.entity.vo.PoetrySimpleVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * ClassName: PoetryDaoTest <br/>
 * Description: <br/>
 * date: 2019-05-01 10:39<br/>
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
        poetry.setPoetryName("元日");
        poetry.setDynasty("宋");
        poetry.setAuthor("王安石");
        poetry.setAnnotation("1.元日：农历正月初一，即春节。\n" +
                "2.爆竹：古人烧竹子时使竹子爆裂发出的响声。用来驱鬼避邪，后来演变成放鞭炮。\n" +
                "3.一岁除：一年已尽。除，逝去。\n" +
                "4.屠苏：“指屠苏酒，饮屠苏酒也是古代过年时的一种习俗，大年初一全家合饮这种用屠苏草浸泡的酒，以驱邪避瘟疫，求得长寿。\n" +
                "5.千门万户：形容门户众多，人口稠密。\n" +
                "6.曈曈：日出时光亮而温暖的样子。\n" +
                "7.桃：桃符，古代一种风俗，农历正月初一时人们用桃木板写上神荼、郁垒两位神灵的名字，悬挂在门旁，用来压邪。也作春联。");
        poetry.setContent("春眠不觉晓，处处闻啼鸟。\n" +
                "\n" +
                "夜来风雨声，花落知多少。");
        poetry.setTrans("阵阵轰鸣的爆竹声中，旧的一年已经过去；和暖的春风吹来了新年，人们欢乐地畅饮着新酿的屠苏酒。初升的太阳照耀着千家万户，他们都忙着把旧的桃符取下，换上新的桃符。");
        poetry.setImageUrl("http://img3.imgtn.bdimg.com/it/u=296329884,2979594225&fm=26&gp=0.jpg");
        poetryDao.insertPoetry(poetry);
    }
    @Test
    public void getPoetrySimpleByChildCategoryName() {
        List<PoetrySimpleVO> poetrySimpleVOList = poetryDao.getPoetrySimpleByChildCategoryName("宋词");
        System.out.print(poetrySimpleVOList);
    }
    @Test
    public void getByPoetryId() {
        Poetry poetry = poetryDao.getByPoetryId(5);
        System.out.print(poetry);
    }
    @Test
    public void getAll() {
        List<Poetry> poetries = poetryDao.getAllPoetry();
        System.out.println(poetries);
    }
    @Test
    public void getPoetryChildCategoryByPoetryId() {
        List<PoetryChildCategoryVO> poetryChildCategoryVOList = poetryDao.getPoetryChildCategoryByPoetryId(4);
        System.out.println(poetryChildCategoryVOList);
    }
}