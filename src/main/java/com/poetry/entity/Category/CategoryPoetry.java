package com.poetry.entity.Category;

import com.poetry.entity.Base.BaseEntity;
import lombok.Data;

/**
 * ClassName: CategoryPoetry <br/>
 * Description: <br/>
 * date: 2019-04-25 22:28<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
public class CategoryPoetry extends BaseEntity {
    private int id;
    private int poetryId;
    private int childCategoryId;
    private String childCategoryName;
    private String poetryName;
    private String imageUrl;
}
