package com.poetry.entity.Game;

import com.poetry.entity.Base.BaseEntity;

/**
 * ClassName: Game <br/>
 * Description: <br/>
 * date: 2019-04-25 22:17<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class Game extends BaseEntity {
    private int id;
    private String gameName;
    private int categoryId;
    private String rule;
    private int comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", gameName='" + gameName + '\'' +
                ", categoryId=" + categoryId +
                ", rule='" + rule + '\'' +
                ", comment=" + comment +
                '}';
    }
}
