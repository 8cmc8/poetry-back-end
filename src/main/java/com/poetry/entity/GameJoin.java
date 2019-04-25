package com.poetry.entity;

/**
 * ClassName: GameJoin <br/>
 * Description: <br/>
 * date: 2019-04-25 22:44<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class GameJoin extends BaseEntity {
    private int id;
    private int userId;
    private int gameId;
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

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "GameJoin{" +
                "id=" + id +
                ", userId=" + userId +
                ", gameId=" + gameId +
                ", comment='" + comment + '\'' +
                '}';
    }
}
