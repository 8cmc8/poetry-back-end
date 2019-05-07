package com.poetry.entity.Course;

import com.poetry.entity.Base.BaseEntity;

/**
 * ClassName: CourseComment <br/>
 * Description: <br/>
 * date: 2019-04-25 22:38<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class CourseComment extends BaseEntity {
    private int id;
    private int userId;
    private int courseId;
    private int starLevel;
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

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(int starLevel) {
        this.starLevel = starLevel;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CourseComment{" +
                "id=" + id +
                ", userId=" + userId +
                ", courseId=" + courseId +
                ", starLevel=" + starLevel +
                ", comment='" + comment + '\'' +
                '}';
    }
}
