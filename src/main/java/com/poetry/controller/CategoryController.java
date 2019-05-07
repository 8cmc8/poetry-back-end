package com.poetry.controller;

import com.poetry.common.Result;
import com.poetry.entity.Category.VO.RootAndChildVO;
import com.poetry.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: CategoryController <br/>
 * Description: <br/>
 * date: 2019-05-01 12:57<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/category")
@Api(value = "/category", tags = "目录")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/rootAndChild")
    @ApiOperation(value = "展示所有目录", tags = "目录")
    public Result<List<RootAndChildVO>> getAllCategory() {
        List<RootAndChildVO> rootAndChildVOS = categoryService.getAllCategory();
        if (rootAndChildVOS != null) {
            return Result.success(rootAndChildVOS);
        }
        return Result.fail("无类目记录");
    }
//    @RequestMapping("/child")
//    @ResponseBody
//    public Result<List<RootCategory>> getChildCategory(@RequestParam String rootCategoryName) {
//        List<RootCategory> rootCategories = categoryService.getChildCategoryByRootCategoryName(rootCategoryName);
//        if(rootCategories != null) {
//            return Result.success(rootCategories);
//        }
//        return Result.fail("该父类目下无子目录");
//    }
//    @RequestMapping("/root")
//    @ResponseBody
//    public Result<List<RootCategory>> getRootCategory() {
//        List<RootCategory> rootCategories = categoryDao.getAllRootCategory();
//
//        if(rootCategories != null) {
//            return Result.success(rootCategories);
//        }
//        return Result.fail("无类目记录");
//    }
//
//    private static List<RootAndChildVo> removeDuplicateRootAndChildVo(List<RootAndChildVo> rootAndChildVoList) {
//        Set<RootAndChildVo> set = new TreeSet<RootAndChildVo>(new Comparator<RootAndChildVo>() {
//            public int compare(RootAndChildVo a, RootAndChildVo b) {
//                // 字符串则按照asicc码升序排列
//                return a.getRootCategoryName().compareTo(b.getRootCategoryName());
//            }
//        });
//
//        set.addAll(rootAndChildVoList);
//        return new ArrayList<RootAndChildVo>(set);
//    }
//    //返回完整类目信息
//    @RequestMapping("/rootAndChild")
//    @ResponseBody
//    public Result<List<RootAndChildVO>> getRootCategory() {
//        List<RootAndChildVO> rootAndChildVOS = categoryDao.getAllRootCategory();
//
//        if(rootCategories != null) {
//            return Result.success(rootCategories);
//        }
//        return Result.fail("无类目记录");
//    }
}
