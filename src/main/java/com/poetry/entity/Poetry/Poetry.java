package com.poetry.entity.Poetry;

import com.poetry.entity.Base.BaseEntity;

/**
 * ClassName: PoetryDao <br/>
 * Description: <br/>
 * date: 2019-04-25 22:04<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class Poetry extends BaseEntity {
    private int id;
    private String poetryName;
    private String dynasty;
    private String author;
    private String content;
    private String annotation;
    private String trans;
    private String imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoetryName() {
        return poetryName;
    }

    public void setPoetryName(String poetryName) {
        this.poetryName = poetryName;
    }

    public String getDynasty() {
        return dynasty;
    }

    public void setDynasty(String dynasty) {
        this.dynasty = dynasty;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "PoetryDao{" +
                "id=" + id +
                ", poetryName='" + poetryName + '\'' +
                ", dynasty='" + dynasty + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", annotation='" + annotation + '\'' +
                ", trans='" + trans + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}