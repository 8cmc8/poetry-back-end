package com.poetry.entity.Category;

import lombok.Data;

import java.util.List;

/**
 * ClassName: RootAndChildVO <br/>
 * Description: <br/>
 * date: 2019-05-06 18:41<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
public class RootAndChildVO {
    private Category root;
    private List<Category> child;
}
