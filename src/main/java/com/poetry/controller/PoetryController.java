package com.poetry.controller;

import com.poetry.common.Result;
import com.poetry.entity.Poetry;
import com.poetry.entity.vo.PoetrySimpleVO;
import com.poetry.service.PoetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * ClassName: PoetryController <br/>
 * Description: <br/>
 * date: 2019-05-01 12:29<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/poetry")
public class PoetryController {
    @Autowired
    private PoetryService poetryService;
    @RequestMapping("/simpleList")
    public Result<List<PoetrySimpleVO>> getPoetrySimple(@RequestParam String childCategoryName) {
        List<PoetrySimpleVO> poetrySimpleVOList = poetryService.getPoetrySimpleByChildCategoryName(childCategoryName);
        if (poetrySimpleVOList != null) {
            return Result.success(poetrySimpleVOList);
        }
        return Result.fail("该类目下无诗词");
    }
    @RequestMapping("/detail")
    public Result<Poetry> getPoetryDetail(@RequestParam int poetryId) {
        Poetry poetry = poetryService.getByPoetryId(poetryId);
        if (poetry != null) {
            return Result.success(poetry);
        }
        return Result.fail("诗词不存在");
    }
}
