package com.poetry.dao;

import com.poetry.entity.Topic.Topic;
import com.poetry.entity.Topic.TopicComment;
import com.poetry.entity.Topic.vo.TopicCommentVo;
import com.poetry.entity.Topic.vo.TopicDetailVo;
import com.poetry.entity.Topic.vo.TopicListVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 13:07 2019-05-07
 */
public interface TopicDao {
    /**
     * 展示所有话题
     *
     * @return
     */
    List<TopicListVo> listAll();

    /**
     * 按话题id获取话题详情
     *
     * @param id
     * @return
     */
    TopicDetailVo selectTopicById(@Param("id") int id);

    /**
     * 按话题id获取话题评论
     *
     * @param id
     * @return
     */
    List<TopicCommentVo> selectTopicDetailById(@Param("id") int id);

    /**
     * 插入用户评论
     *
     * @param topicComment
     * @return
     */
    Integer insertTopicComment(@Param("topicComment") TopicComment topicComment);

    Integer insertTopic(@Param("topic") Topic topic);
}
