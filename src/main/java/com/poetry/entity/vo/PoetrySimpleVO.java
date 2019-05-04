package com.poetry.entity.vo;

/**
 * ClassName: PoetrySimpleVO <br/>
 * Description: <br/>
 * date: 2019-05-01 10:28<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class PoetrySimpleVO {
    private int id;
    private String poetryName;
    private String dynasty;
    private String author;
    private String content;

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

    @Override
    public String toString() {
        return "PoetrySimpleVO{" +
                "id=" + id +
                ", poetryName='" + poetryName + '\'' +
                ", dynasty='" + dynasty + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
