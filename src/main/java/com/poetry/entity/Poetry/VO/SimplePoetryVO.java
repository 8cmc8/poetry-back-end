package com.poetry.entity.Poetry.VO;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: SimplePoetryVO
 * Description:
 * date: 2019-05-07 14:36
 *
 * @author cmc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimplePoetryVO {
    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "诗词名称")
    private String poetryName;

    @ApiModelProperty(value = "朝代")
    private String dynasty;

    @ApiModelProperty(value = "作者")
    private String author;
}
