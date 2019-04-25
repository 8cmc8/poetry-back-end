package com.poetry.entity;

/**
 * ClassName: CategoryRootPoetry <br/>
 * Description: <br/>
 * date: 2019-04-25 22:24<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class CategoryRootPoetry extends BaseEntity {
    private int id;
    private String categoryName;
    private String categoryDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "CategoryRootPoetry{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDescription='" + categoryDescription + '\'' +
                '}';
    }
}
