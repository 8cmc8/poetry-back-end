package com.poetry.entity;

/**
 * ClassName: CourseSection <br/>
 * Description: <br/>
 * date: 2019-04-25 22:34<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class CourseSection extends BaseEntity {
    private int id;
    private int courseId;
    private String sectionName;
    private String sectionIntroduce;
    private int sectionTime;
    private String videoUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionIntroduce() {
        return sectionIntroduce;
    }

    public void setSectionIntroduce(String sectionIntroduce) {
        this.sectionIntroduce = sectionIntroduce;
    }

    public int getSectionTime() {
        return sectionTime;
    }

    public void setSectionTime(int sectionTime) {
        this.sectionTime = sectionTime;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        return "CourseSection{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", sectionName='" + sectionName + '\'' +
                ", sectionIntroduce='" + sectionIntroduce + '\'' +
                ", sectionTime=" + sectionTime +
                ", videoUrl='" + videoUrl + '\'' +
                '}';
    }
}
