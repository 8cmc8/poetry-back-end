package com.poetry.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: PoetryChildCategoryVO <br/>
 * Description: <br/>
 * date: 2019-05-03 14:46<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoetryChildCategoryVO {
    @ApiModelProperty(value = "子目录名称")
    private String childCategoryName;
}
