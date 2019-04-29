package com.poetry.dao;

import com.poetry.entity.CategoryPoetry;
import com.poetry.entity.Poetry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: PoetryDao <br/>
 * Description: <br/>
 * date: 2019-04-28 23:07<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public interface PoetryDao {
    int insertPoetry(Poetry poetry);
    int updatePoetry(Poetry poetry);
    int deleteByPoetryId(int id);
    int deleteByPoetryName(String peotryName);
    //id为0，时表示设置类目
    int insertPoetryCategory(@Param("poetryId") int poetryId, @Param("childCategoryName")String childCategoryName, @Param("rootCategoryName")String rootCategoryName);
    List<Poetry> getAllPoetry();
    List<Poetry> getByPoetryName(String poetryName);
    List<Poetry> getByPoetryAuthor(String author);
    List<Poetry> getByDynasty(String dynasty);
    List<Poetry> getPoetryByChildCategoryName(String childCategoryName);
    List<CategoryPoetry> getByRootCategoryName(String rootCategoryName);
}
