package com.poetry.entity.Course;

import com.poetry.entity.Base.BaseEntity;

/**
 * ClassName: CourseOrder <br/>
 * Description: <br/>
 * date: 2019-04-25 22:54<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class CourseOrder extends BaseEntity {
    private int id;
    private int userId;
    private int courseId;
    private double dealPrice;

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

    public double getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(double dealPrice) {
        this.dealPrice = dealPrice;
    }

    @Override
    public String toString() {
        return "CourseOrder{" +
                "id=" + id +
                ", userId=" + userId +
                ", courseId=" + courseId +
                ", dealPrice=" + dealPrice +
                '}';
    }
}
