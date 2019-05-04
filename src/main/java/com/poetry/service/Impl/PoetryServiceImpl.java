package com.poetry.service.Impl;

import com.poetry.dao.PoetryDao;
import com.poetry.entity.Poetry;
import com.poetry.entity.vo.PoetryChildCategoryVO;
import com.poetry.entity.vo.PoetrySimpleVO;
import com.poetry.service.PoetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: PoetryServiceImpl <br/>
 * Description: <br/>
 * date: 2019-05-01 12:25<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Service
public class PoetryServiceImpl implements PoetryService {
    @Autowired
    private PoetryDao poetryDao;
    @Override
    public boolean insertPoetry(Poetry poetry) {
        return poetryDao.insertPoetry(poetry) > 0;
    }

    @Override
    public boolean updatePoetry(Poetry poetry) {
        return poetryDao.updatePoetry(poetry) > 0;
    }

    @Override
    public boolean deleteByPoetryName(String poetryName) {
        return poetryDao.deleteByPoetryName(poetryName) > 0;
    }

    @Override
    public boolean deleteByPoetryId(int poetryId) {
        return poetryDao.deleteByPoetryId(poetryId) > 0;
    }

    @Override
    public Poetry getByPoetryId(int poetryId) {
        return poetryDao.getByPoetryId(poetryId);
    }

    @Override
    public Poetry getByPoetryName(String poetryName) {
        return poetryDao.getByPoetryName(poetryName);
    }

    @Override
    public List<Poetry> getByPoetryDynasty(String dynasty) {
        return poetryDao.getByPoetryDynasty(dynasty);
    }

    @Override
    public List<Poetry> getByPoetryAuthor(String author) {
        return poetryDao.getByPoetryAuthor(author);
    }

    @Override
    public List<Poetry> getAllPoetry() {
        return poetryDao.getAllPoetry();
    }

    @Override
    public List<PoetrySimpleVO> getPoetrySimpleByChildCategoryName(String childCategoryName) {
        return poetryDao.getPoetrySimpleByChildCategoryName(childCategoryName);
    }

    @Override
    public List<PoetryChildCategoryVO> getPoetryChildCategoryByPoetryId(int poetryId) {
        return poetryDao.getPoetryChildCategoryByPoetryId(poetryId);
    }
}
