package com.poetry.entity;

/**
 * ClassName: CategoryPoetry <br/>
 * Description: <br/>
 * date: 2019-04-25 22:28<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class CategoryPoetry extends BaseEntity {
    private int id;
    private String childCategoryName;
    private int poetryId;
    private String imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChildCategoryName() {
        return childCategoryName;
    }

    public void setChildCategoryName(String childCategoryName) {
        this.childCategoryName = childCategoryName;
    }

    public int getPoetryId() {
        return poetryId;
    }

    public void setPoetryId(int poetryId) {
        this.poetryId = poetryId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "CategoryPoetry{" +
                "id=" + id +
                ", childCategoryName='" + childCategoryName + '\'' +
                ", poetryId=" + poetryId +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
