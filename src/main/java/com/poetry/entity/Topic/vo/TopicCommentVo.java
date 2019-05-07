package com.poetry.entity.Topic.vo;

import lombok.Data;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 13:30 2019-05-07
 */
@Data
public class TopicCommentVo {
    private int userId;
    private String userName;
    private String comment;
}
