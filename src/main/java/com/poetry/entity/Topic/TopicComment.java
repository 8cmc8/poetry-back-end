package com.poetry.entity.Topic;

import com.poetry.entity.Base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: TopicComment <br/>
 * Description: <br/>
 * date: 2019-04-25 22:40<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicComment extends BaseEntity {
    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "用户id")
    private int userId;

    @ApiModelProperty(value = "话题id")
    private int topicId;

    @ApiModelProperty(value = "评论")
    private String comment;
}
