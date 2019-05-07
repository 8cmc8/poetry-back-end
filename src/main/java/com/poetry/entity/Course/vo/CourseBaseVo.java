package com.poetry.entity.Course.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 10:37 2019-05-07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseBaseVo {
    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "目录名称")
    private String courseName;

    @ApiModelProperty(value = "图片地址")
    private String imageUrl;
}
