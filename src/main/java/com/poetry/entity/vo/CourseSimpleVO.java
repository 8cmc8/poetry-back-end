package com.poetry.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: CourseSimpleVO <br/>
 * Description: <br/>
 * date: 2019-05-03 16:33<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseSimpleVO {
    @ApiModelProperty(value = "图片地址")
    private String imageUrl;

    @ApiModelProperty(value = "课程名称")
    private String courseName;

    @ApiModelProperty(value = "是否免费")
    private int free;

    @ApiModelProperty(value = "课程价格")
    private int coursePrice;

    @ApiModelProperty(value = "星级")
    private int starLevel;

    @ApiModelProperty(value = "收藏数")
    private int commentNums;
}
