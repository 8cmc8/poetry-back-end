package com.poetry.entity.Topic;

import com.poetry.entity.Base.BaseEntity;
import lombok.Data;

/**
 * ClassName: Topic <br/>
 * Description: <br/>
 * date: 2019-04-25 22:11<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
public class Topic extends BaseEntity {
    private int id;
    private String topicName;
    private String content;
    private int comment = 0;
}
