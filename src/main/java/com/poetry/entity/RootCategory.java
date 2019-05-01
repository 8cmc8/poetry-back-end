package com.poetry.entity;

/**
 * ClassName: RootCategory <br/>
 * Description: <br/>
 * date: 2019-05-01 10:20<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class RootCategory extends BaseEntity {
    private int id;
    private String childCategoryName;
    private String rootCategoryName;
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

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

    public String getRootCategoryName() {
        return rootCategoryName;
    }

    public void setRootCategoryName(String rootCategoryName) {
        this.rootCategoryName = rootCategoryName;
    }

    @Override
    public String toString() {
        return "RootCategory{" +
                "id=" + id +
                ", childCategoryName='" + childCategoryName + '\'' +
                ", rootCategoryName='" + rootCategoryName + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
