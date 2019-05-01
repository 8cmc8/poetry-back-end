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
