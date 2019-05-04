package com.poetry.entity.vo;

/**
 * ClassName: CourseSimpleVO <br/>
 * Description: <br/>
 * date: 2019-05-03 16:33<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class CourseSimpleVO {
    private String imageUrl;
    private String courseName;
    private int free;
    private int coursePrice;
    private int starLevel;
    private int comment;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    public int getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(int starLevel) {
        this.starLevel = starLevel;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CourseSimpleVO{" +
                "imageUrl='" + imageUrl + '\'' +
                ", courseName='" + courseName + '\'' +
                ", free=" + free +
                ", coursePrice=" + coursePrice +
                ", starLevel=" + starLevel +
                ", comment=" + comment +
                '}';
    }
}
