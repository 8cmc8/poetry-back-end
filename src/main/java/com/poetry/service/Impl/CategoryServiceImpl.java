package com.poetry.service.Impl;

import com.poetry.dao.CategoryDao;
import com.poetry.entity.RootCategory;
import com.poetry.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: CategoryServiceImpl <br/>
 * Description: <br/>
 * date: 2019-05-01 12:55<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public List<RootCategory> getChildCategoryByRootCategoryName(String rootCategoryName) {
        return categoryDao.getChildCategoryByRootCategoryName(rootCategoryName);
    }
}
