package com.poetry.service;

import com.poetry.entity.Poetry;
import com.poetry.entity.vo.PoetryChildCategoryVO;
import com.poetry.entity.vo.PoetrySimpleVO;

import java.util.List;

/**
 * ClassName: PoetryService <br/>
 * Description: <br/>
 * date: 2019-05-01 12:21<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public interface PoetryService {
    boolean insertPoetry(Poetry poetry);

    boolean updatePoetry(Poetry poetry);

    boolean deleteByPoetryName(String poetryName);

    boolean deleteByPoetryId(int poetryId);

    Poetry getByPoetryId(int poetryId);

    Poetry getByPoetryName(String poetryName);

    List<Poetry> getByPoetryDynasty(String dynasty);

    List<Poetry> getByPoetryAuthor(String author);

    List<Poetry> getAllPoetry();

    List<PoetrySimpleVO> getPoetrySimpleByChildCategoryName(String childCategoryName);

    List<PoetryChildCategoryVO> getPoetryChildCategoryByPoetryId(int poetryId);
}
