package com.poetry.entity.Course;

import com.poetry.entity.Base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Course <br/>
 * Description: <br/>
 * date: 2019-04-25 22:08<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course extends BaseEntity {
    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "课程名称")
    private String courseName;

    @ApiModelProperty(value = "目录id")
    private int categoryId;

    @ApiModelProperty(value = "主讲人")
    private String teacher;

    @ApiModelProperty(value = "课程简介")
    private String courseIntroduce;

    @ApiModelProperty(value = "图片地址")
    private String imageUrl;

    @ApiModelProperty(value = "课程总时长")
    private int totalTime;

    @ApiModelProperty(value = "课程价格")
    private double coursePrice;

    @ApiModelProperty(value = "是否免费")
    private int free;   //1为免费，0为付费
}
