package com.poetry.service;

import com.poetry.entity.CategoryPoetry;
import com.poetry.entity.Poetry;

import java.util.List;

/**
 * ClassName: PoetryService <br/>
 * Description: <br/>
 * date: 2019-04-29 09:33<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public interface PoetryService {
    List<Poetry> getAll();
    List<Poetry> getByName(String poetryName);
    List<Poetry> getByAuthor(String author);
    List<Poetry> getByDynasty(String dynasty);
    List<CategoryPoetry> getByRootCategoryName(String rootCategoryName);
    Boolean updatePoetry(Poetry poetry);
    Boolean deletePoetryById(int id);
    Boolean deletePoetryByName(String poetryName);
    Boolean addPoetry(Poetry poetry);
}
