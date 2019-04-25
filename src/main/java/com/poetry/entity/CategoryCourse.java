package com.poetry.entity;

/**
 * ClassName: CategoryCourse <br/>
 * Description: <br/>
 * date: 2019-04-25 22:33<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class CategoryCourse extends BaseEntity {
    private int id;
    private String categoryName;

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

    @Override
    public String toString() {
        return "CategoryCourse{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
