package com.poetry.service.Impl;

import com.poetry.dao.CategoryDao;
import com.poetry.entity.Category.Category;
import com.poetry.entity.Category.VO.RootAndChildVO;
import com.poetry.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<Category> getAllRootCategory() {
        return categoryDao.getAllRootCategory();
    }

    @Override
    public List<Category> getAllChildCategory(int id) {
        return categoryDao.getAllChildCategory(id);
    }

    @Override
    public List<RootAndChildVO> getAllCategory() {
        List<RootAndChildVO> rootAndChildVOList = new ArrayList<>();
        //获得父类目List
        List<Category> root = categoryDao.getAllRootCategory();
        for (Category category : root) {
            RootAndChildVO rootAndChildVO = new RootAndChildVO();
            rootAndChildVO.setRoot(category);
            rootAndChildVO.setChild(categoryDao.getAllChildCategory(category.getId()));
            rootAndChildVOList.add(rootAndChildVO);
        }
        return rootAndChildVOList;
    }
}
