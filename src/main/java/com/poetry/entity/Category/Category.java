package com.poetry.entity.Category;

import com.poetry.entity.Base.BaseEntity;
import lombok.Data;

/**
 * ClassName: Category
 * Description:
 * date: 2019-05-06 19:54
 *
 * @author cmc
 */
@Data
public class Category extends BaseEntity {
    private int id;
    private String categoryName;
    private String imageUrl;
    private int parentCode;
}
