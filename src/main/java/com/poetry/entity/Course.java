package com.poetry.entity;

/**
 * ClassName: Course <br/>
 * Description: <br/>
 * date: 2019-04-25 22:08<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class Course extends BaseEntity {
    private int id;
    private String courseName;
    private int categoryId;
    private String teacher;
    private String courseIntroduce;
    private String imageUrl;
    private int totalTime;
    private double coursePrice;
    private int free;   //1为免费，0为付费

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCourseIntroduce() {
        return courseIntroduce;
    }

    public void setCourseIntroduce(String courseIntroduce) {
        this.courseIntroduce = courseIntroduce;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", categoryId=" + categoryId +
                ", teacher='" + teacher + '\'' +
                ", courseIntroduce='" + courseIntroduce + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", totalTime=" + totalTime +
                ", coursePrice=" + coursePrice +
                ", free=" + free +
                '}';
    }
}
