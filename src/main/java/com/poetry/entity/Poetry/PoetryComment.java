package com.poetry.entity.Poetry;

import com.poetry.entity.Base.BaseEntity;

/**
 * ClassName: PoetryComment <br/>
 * Description: <br/>
 * date: 2019-04-25 22:31<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class PoetryComment extends BaseEntity {
    private int Id;
    private int userId;
    private int poetryId;
    private String comment;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPoetryId() {
        return poetryId;
    }

    public void setPoetryId(int poetryId) {
        this.poetryId = poetryId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "PoetryComment{" +
                "Id=" + Id +
                ", userId=" + userId +
                ", poetryId=" + poetryId +
                ", comment='" + comment + '\'' +
                '}';
    }
}
