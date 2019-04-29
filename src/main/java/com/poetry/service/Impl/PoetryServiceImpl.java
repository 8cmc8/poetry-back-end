package com.poetry.service.Impl;

import com.poetry.dao.PoetryDao;
import com.poetry.entity.CategoryPoetry;
import com.poetry.entity.Poetry;
import com.poetry.service.PoetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: PoetryServiceImpl <br/>
 * Description: <br/>
 * date: 2019-04-29 09:34<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Service
public class PoetryServiceImpl implements PoetryService {

    @Autowired
    private PoetryDao poetryDao;

    @Override
    public List<Poetry> getAll() {
        return poetryDao.getAllPoetry();
    }

    @Override
    public List<Poetry> getByName(String poetryName) {
        return poetryDao.getByPoetryName(poetryName);
    }

    @Override
    public List<Poetry> getByAuthor(String author) {
        return poetryDao.getByPoetryAuthor(author);
    }

    @Override
    public List<Poetry> getByDynasty(String dynasty) {
        return poetryDao.getByDynasty(dynasty);
    }

    @Override
    public List<CategoryPoetry> getByRootCategoryName(String rootCategoryName) {
        return poetryDao.getByRootCategoryName(rootCategoryName);
    }

    @Override
    public Boolean updatePoetry(Poetry poetry) {
        return poetryDao.updatePoetry(poetry) > 0;
    }

    @Override
    public Boolean deletePoetryById(int id) {
        return poetryDao.deleteByPoetryId(id) > 0;
    }

    @Override
    public Boolean deletePoetryByName(String poetryName) {
        return poetryDao.deleteByPoetryName(poetryName) > 0;
    }

    @Override
    public Boolean addPoetry(Poetry poetry) {
        return poetryDao.insertPoetry(poetry) > 0;
    }
}
