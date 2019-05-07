package com.poetry.entity.Topic.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 13:24 2019-05-07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicDetailVo extends TopicListVo {
    @ApiModelProperty(value = "话题所有评论")
    private List<TopicCommentVo> topicCommentList;
}
