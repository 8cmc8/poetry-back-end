package com.poetry.service;

import com.poetry.entity.Category.Category;
import com.poetry.entity.Category.VO.RootAndChildVO;

import java.util.List;

/**
 * ClassName: CategoryService <br/>
 * Description: <br/>
 * date: 2019-05-01 12:54<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public interface CategoryService {
    //返回所有父类目
    List<Category> getAllRootCategory();
    //根据父类目id返回子类目
    List<Category> getAllChildCategory(int id);
    //返回所有组合后的类目
    List<RootAndChildVO> getAllCategory();
}
