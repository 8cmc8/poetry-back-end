package com.poetry.controller;

import com.poetry.common.Result;
import com.poetry.dao.PoetryDao;
import com.poetry.entity.Poetry.Poetry;
import com.poetry.entity.Poetry.VO.SimplePoetryVO;
import com.poetry.entity.vo.PoetryChildCategoryVO;
import com.poetry.entity.vo.PoetrySimpleVO;
import com.poetry.service.PoetryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: PoetryController <br/>
 * Description: <br/>
 * date: 2019-05-01 12:29<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/poetry")
@Api(value = "/poetry", tags = "诗词")
public class PoetryController {
    private Logger logger = LoggerFactory.getLogger(PoetryController.class);

    @Autowired
    private PoetryService poetryService;

    @Autowired
    private PoetryDao poetryDao;

    @GetMapping("/simpleListAll")
    @ApiOperation(value = "展示所有诗词", tags = "诗词")
    public Result<List<SimplePoetryVO>> getAllSimplePoetry() {
        try{
            List<SimplePoetryVO> allSimplePoetry = poetryDao.getAllSimplePoetry();
            if (allSimplePoetry != null) {
                return Result.success(allSimplePoetry);
            }
        }catch(Exception e) {
            logger.error("",e);
        }
        return Result.fail("无诗词");
    }

    @GetMapping("/simpleListByName")
    @ApiOperation(value = "按类目名获取诗词", tags = "诗词")
    public Result<List<SimplePoetryVO>> getAllSimplePoetryByName(@RequestParam("name") String childCategoryName) {
        try{
            List<SimplePoetryVO> allSimplePoetryByName = poetryDao.getAllSimplePoetryByName(childCategoryName);
            if (allSimplePoetryByName != null) {
                return Result.success(allSimplePoetryByName);
            }
        }catch(Exception e) {
            logger.error("",e);
        }
        return Result.fail("无诗词");
    }

    @GetMapping("/simpleList")
    @ApiOperation(value = "按类目名获取诗词", tags = "诗词")
    public Result<List<PoetrySimpleVO>> getPoetrySimple(@RequestParam String childCategoryName) {
        try {
            List<PoetrySimpleVO> poetrySimpleVOList = poetryService.getPoetrySimpleByChildCategoryName(childCategoryName);
            if (poetrySimpleVOList != null) {
                return Result.success(poetrySimpleVOList);
            }
        } catch (Exception e) {
            logger.error("", e);
        }

        return Result.fail("该类目下无诗词");
    }

    @GetMapping("/detail")
    @ApiOperation(value = "按id获取诗词详情", tags = "诗词")
    public Result<Poetry> getPoetryDetail(@RequestParam("id") int poetryId) {
        try {
            Poetry poetry = poetryService.getByPoetryId(poetryId);
            if (poetry != null) {
                return Result.success(poetry);
            }
        } catch (Exception e) {
            logger.error("", e);
        }
        return Result.fail("诗词不存在");
    }

    @GetMapping("/getAll")
    public Result<List<Poetry>> getAll(){
        List<Poetry> poetries = poetryService.getAllPoetry();
        return Result.success(poetries);
    }

    @GetMapping("/category")
    public Result<List<PoetryChildCategoryVO>> getChildCategory(@RequestParam String poetryName){
        int poetryId = poetryService.getByPoetryName(poetryName).getId();
        List<PoetryChildCategoryVO> poetryChildCategoryVOList = poetryService.getPoetryChildCategoryByPoetryId(poetryId);
        return Result.success(poetryChildCategoryVOList);
    }
}
