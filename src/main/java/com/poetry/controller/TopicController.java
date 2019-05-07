package com.poetry.controller;

import com.poetry.common.Result;
import com.poetry.entity.Topic.Topic;
import com.poetry.entity.Topic.TopicComment;
import com.poetry.entity.Topic.vo.TopicDetailVo;
import com.poetry.entity.Topic.vo.TopicListVo;
import com.poetry.service.TopicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 13:14 2019-05-07
 */
@RestController
@RequestMapping("/topic")
public class TopicController {

    private Logger logger = LoggerFactory.getLogger(TopicController.class);

    @Autowired
    TopicService topicService;

    /**
     * 展示所有话题（不分页）
     *
     * @return
     */
    @GetMapping("/listAll")
    public Result listAll() {
        try {
            List<TopicListVo> topicListVos = topicService.listAll();
            return Result.success(topicListVos);
        } catch (Exception e) {
            logger.error("", e);
        }
        return Result.fail();
    }

    /**
     * 按话题id获取话题详情
     *
     * @param topicId
     * @return
     */
    @GetMapping("/getTopicDetail")
    public Result getTopicDetail(@RequestParam("topicId") int topicId) {
        try {
            TopicDetailVo topicDetail = topicService.getTopicDetail(topicId);
            return Result.success(topicDetail);
        } catch (Exception e) {
            logger.error("", e);
        }
        return Result.fail();
    }

    /**
     * 用户评论
     *
     * @param topicComment
     * @return
     */
    @PostMapping("/userComment")
    public Result userComment(@RequestBody TopicComment topicComment) {
        try {
            topicService.userComment(topicComment);
            return Result.success();
        } catch (Exception e) {
            logger.error("", e);
        }
        return Result.fail();
    }

    /**
     * 用户新建话题
     * @param topic
     * @return
     */
    @PostMapping("/userTopic")
    public Result userTopic(@RequestBody Topic topic) {
        try {
            topicService.userTopic(topic);
            return Result.success();
        } catch (Exception e) {
            logger.error("", e);
        }
        return Result.fail();
    }
}
