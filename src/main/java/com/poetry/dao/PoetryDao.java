package com.poetry.dao;

import com.poetry.entity.Poetry;
import com.poetry.entity.vo.PoetrySimpleVO;

import java.util.List;

/**
 * ClassName: PoetryDao <br/>
 * Description: <br/>
 * date: 2019-05-01 10:22<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public interface PoetryDao {

    int insertPoetry(Poetry poetry);

    int updatePoetry(Poetry poetry);

    int deleteByPoetryName(String poetryName);

    int deleteByPoetryId(int poetryId);

    Poetry getByPoetryId(int poetryId);

    Poetry getByPoetryName(String poetryName);

    List<Poetry> getByPoetryDynasty(String dynasty);

    List<Poetry> getByPoetryAuthor(String author);

    List<Poetry> getAllPoetry();

    List<PoetrySimpleVO> getPoetrySimpleByChildCategoryName(String childCategoryName);
}