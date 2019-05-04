package com.poetry.dao;

import com.poetry.entity.RootCategory;

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
    List<RootCategory> getChildCategoryByRootCategoryName(String rootCategoryName);
    List<RootCategory> getAllRootCategory();
}
