package com.poetry.entity.Course.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Kwin
 * @Description:
 * @Date: Create in 10:43 2019-05-07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseListVo extends CourseBaseVo {
    @ApiModelProperty(value = "收藏人数")
    private Integer collectionNums = 0;

    @ApiModelProperty(value = "星数")
    private Integer starLevel;
}
