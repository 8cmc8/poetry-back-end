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
    private int poetryId;
    private int categoryChildId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoetryId() {
        return poetryId;
    }

    public void setPoetryId(int poetryId) {
        this.poetryId = poetryId;
    }

    public int getCategoryChildId() {
        return categoryChildId;
    }

    public void setCategoryChildId(int categoryChildId) {
        this.categoryChildId = categoryChildId;
    }

    @Override
    public String toString() {
        return "CategoryPoetry{" +
                "id=" + id +
                ", poetryId=" + poetryId +
                ", categoryChildId=" + categoryChildId +
                '}';
    }
}
