package com.poetry.entity.Topic;

import com.poetry.entity.Base.BaseEntity;
import lombok.Data;

/**
 * ClassName: TopicComment <br/>
 * Description: <br/>
 * date: 2019-04-25 22:40<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
public class TopicComment extends BaseEntity {
    private int id;
    private int userId;
    private int topicId;
    private String comment;
}
