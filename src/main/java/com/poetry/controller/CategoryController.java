package com.poetry.controller;

import com.poetry.common.Result;
import com.poetry.entity.RootCategory;
import com.poetry.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * ClassName: CategoryController <br/>
 * Description: <br/>
 * date: 2019-05-01 12:57<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/child")
    public Result<List<RootCategory>> getChildCategory(@RequestParam String rootCategoryName) {
        List<RootCategory> rootCategories = categoryService.getChildCategoryByRootCategoryName(rootCategoryName);
        if(rootCategories != null) {
            return Result.success(rootCategories);
        }
        return Result.fail("该父类目下无子目录");
    }
}
