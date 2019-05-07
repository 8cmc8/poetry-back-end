package com.poetry.entity.Category;

import com.poetry.entity.Base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Category
 * Description:
 * date: 2019-05-06 19:54
 *
 * @author cmc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseEntity {
    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "目录名称")
    private String categoryName;

    @ApiModelProperty(value = "图片地址")
    private String imageUrl;

    @ApiModelProperty(value = "上级目录code")
    private int parentCode;
}
