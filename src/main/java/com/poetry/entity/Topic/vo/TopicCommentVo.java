package com.poetry.entity.Topic.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 13:30 2019-05-07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicCommentVo {
    @ApiModelProperty(value = "用户id")
    private int userId;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "评论")
    private String comment;
}
