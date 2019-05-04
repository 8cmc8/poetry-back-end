package com.poetry.service;

import com.poetry.entity.RootCategory;

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
    List<RootCategory> getChildCategoryByRootCategoryName(String rootCategoryName);
    List<RootCategory> getAllRootCategory();
}
