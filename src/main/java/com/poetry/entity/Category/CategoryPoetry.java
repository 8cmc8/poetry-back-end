package com.poetry.entity.Category;

import com.poetry.entity.Base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: CategoryPoetry <br/>
 * Description: <br/>
 * date: 2019-04-25 22:28<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryPoetry extends BaseEntity {
    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "诗词id")
    private int poetryId;

    @ApiModelProperty(value = "子目录id")
    private int childCategoryId;

    @ApiModelProperty(value = "子目录名称")
    private String childCategoryName;

    @ApiModelProperty(value = "诗名")
    private String poetryName;

    @ApiModelProperty(value = "图片地址")
    private String imageUrl;
}
