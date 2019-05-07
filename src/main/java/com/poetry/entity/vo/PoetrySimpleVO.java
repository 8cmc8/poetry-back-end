package com.poetry.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: PoetrySimpleVO <br/>
 * Description: <br/>
 * date: 2019-05-01 10:28<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoetrySimpleVO {
    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "诗词名称")
    private String poetryName;

    @ApiModelProperty(value = "朝代")
    private String dynasty;

    @ApiModelProperty(value = "作者")
    private String author;

    @ApiModelProperty(value = "内容")
    private String content;
}
