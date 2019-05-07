package com.poetry.service;

import com.poetry.entity.Topic.Topic;
import com.poetry.entity.Topic.TopicComment;
import com.poetry.entity.Topic.vo.TopicDetailVo;
import com.poetry.entity.Topic.vo.TopicListVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 13:12 2019-05-07
 */
public interface TopicService {
    List<TopicListVo> listAll();

    TopicDetailVo getTopicDetail(@RequestParam("topicId") int topicId);

    void userComment(@RequestBody TopicComment topicComment);

    void userTopic(@RequestBody Topic topic);
}
