package com.poetry.entity.vo;

/**
 * ClassName: PoetryChildCategoryVO <br/>
 * Description: <br/>
 * date: 2019-05-03 14:46<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
public class PoetryChildCategoryVO {
    private String childCategoryName;

    public String getChildCategoryName() {
        return childCategoryName;
    }

    public void setChildCategoryName(String childCategoryName) {
        this.childCategoryName = childCategoryName;
    }

    @Override
    public String toString() {
        return "PoetryChildCategoryVO{" +
                "childCategoryName='" + childCategoryName + '\'' +
                '}';
    }
}
