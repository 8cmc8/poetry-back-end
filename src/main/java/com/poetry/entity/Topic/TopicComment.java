package com.poetry.entity.Topic;

import com.poetry.entity.Base.BaseEntity;

/**
 * ClassName: TopicComment <br/>
 * Description: <br/>
 * date: 2019-04-25 22:40<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class TopicComment extends BaseEntity {
    private int id;
    private int userId;
    private int topicId;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "TopicComment{" +
                "id=" + id +
                ", userId=" + userId +
                ", topicId=" + topicId +
                ", comment='" + comment + '\'' +
                '}';
    }
}
