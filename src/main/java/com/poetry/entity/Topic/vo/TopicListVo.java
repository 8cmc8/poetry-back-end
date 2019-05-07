package com.poetry.entity.Topic.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 13:06 2019-05-07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicListVo {
    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "话题名称")
    private String topicName;

    @ApiModelProperty(value = "用户id")
    private int userId;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "收藏数")
    private int commentNums;
}
