package com.poetry.entity;

/**
 * ClassName: Topic <br/>
 * Description: <br/>
 * date: 2019-04-25 22:11<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class Topic extends BaseEntity{
    private int id;
    private String topicName;
    private String content;
    private int comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", topicName='" + topicName + '\'' +
                ", content='" + content + '\'' +
                ", comment=" + comment +
                '}';
    }
}
