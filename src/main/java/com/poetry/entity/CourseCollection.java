package com.poetry.entity;

/**
 * ClassName: CourseCollection <br/>
 * Description: <br/>
 * date: 2019-04-25 22:37<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class CourseCollection extends BaseEntity {
    private int id;
    private int userId;
    private int courseId;

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

    @Override
    public String toString() {
        return "CourseCollection{" +
                "id=" + id +
                ", userId=" + userId +
                ", courseId=" + courseId +
                '}';
    }
}
