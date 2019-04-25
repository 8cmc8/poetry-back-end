package com.poetry.entity;

/**
 * ClassName: PoetryCollection <br/>
 * Description: <br/>
 * date: 2019-04-25 22:30<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class PoetryCollection extends BaseEntity {
    private int id;
    private int userId;
    private int poetryId;

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

    public int getPoetryId() {
        return poetryId;
    }

    public void setPoetryId(int poetryId) {
        this.poetryId = poetryId;
    }

    @Override
    public String toString() {
        return "PoetryCollection{" +
                "id=" + id +
                ", userId=" + userId +
                ", poetryId=" + poetryId +
                '}';
    }
}
