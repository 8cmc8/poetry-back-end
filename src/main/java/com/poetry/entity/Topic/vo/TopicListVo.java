package com.poetry.entity.Topic.vo;

import lombok.Data;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 13:06 2019-05-07
 */
@Data
public class TopicListVo {
    private int id;
    private String topicName;
    private String content;
    private int commentNums;
}
