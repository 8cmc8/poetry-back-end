package com.poetry.dao;

import com.poetry.entity.Category.Category;

import java.util.List;

/**
 * ClassName: CategoryDao <br/>
 * Description: <br/>
 * date: 2019-05-01 10:25<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public interface CategoryDao {
    //返回所有父类目
    List<Category> getAllRootCategory();
    //根据父类目id返回子类目
    List<Category> getAllChildCategory(int id);
//    List<RootCategory> getChildCategoryByRootCategoryName(String rootCategoryName);
//    List<RootCategory> getAllRootCategory();
//    List<String> getAllRootCategoryName();
//    List<String> getAllChildCategoryNameByRootCategoryName(String rootCategoryName);
//    List<RootCategory> getAllRootAndChildCategory();
}
