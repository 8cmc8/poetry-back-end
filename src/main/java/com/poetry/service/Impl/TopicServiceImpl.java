package com.poetry.service.Impl;

import com.poetry.dao.TopicDao;
import com.poetry.entity.Topic.Topic;
import com.poetry.entity.Topic.TopicComment;
import com.poetry.entity.Topic.vo.TopicCommentVo;
import com.poetry.entity.Topic.vo.TopicDetailVo;
import com.poetry.entity.Topic.vo.TopicListVo;
import com.poetry.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 13:12 2019-05-07
 */
@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    TopicDao topicDao;

    @Override
    public List<TopicListVo> listAll() {
        return topicDao.listAll();
    }

    @Override
    public TopicDetailVo getTopicDetail(int topicId) {
        TopicDetailVo topicDetailVo = topicDao.selectTopicById(topicId);
        List<TopicCommentVo> topicCommentVos = topicDao.selectTopicDetailById(topicId);
        topicDetailVo.setTopicCommentList(topicCommentVos);
        return topicDetailVo;
    }

    @Override
    public void userComment(TopicComment topicComment) {
        topicDao.insertTopicComment(topicComment);
    }

    @Override
    public void userTopic(Topic topic) {
        topicDao.insertTopic(topic);
    }
}
