package com.poetry.entity;

import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * ClassName: CategoryChildPoetry <br/>
 * Description: <br/>
 * date: 2019-04-25 22:26<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class CategoryChildPoetry extends BaseEntity {
    private int id;
    private int parentId;
    private String categoryName;
    private String categoryDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Override
    public String toString() {
        return "CategoryChildPoetry{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDescription='" + categoryDescription + '\'' +
                '}';
    }
}
