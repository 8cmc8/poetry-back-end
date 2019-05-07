package com.poetry.entity.Poetry;

import com.poetry.entity.Base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: PoetryDao <br/>
 * Description: <br/>
 * date: 2019-04-25 22:04<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Poetry extends BaseEntity {
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

    @ApiModelProperty(value = "注释")
    private String annotation;

    @ApiModelProperty(value = "译文")
    private String trans;

    @ApiModelProperty(value = "图片地址")
    private String imageUrl;
}
