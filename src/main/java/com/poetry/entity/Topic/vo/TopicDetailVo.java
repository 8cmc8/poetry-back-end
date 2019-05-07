package com.poetry.entity.Topic.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 13:24 2019-05-07
 */
@Data
public class TopicDetailVo extends TopicListVo {
    private List<TopicCommentVo> topicCommentList;
}
