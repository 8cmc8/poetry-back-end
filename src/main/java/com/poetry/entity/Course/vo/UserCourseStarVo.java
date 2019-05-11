package com.poetry.entity.Course.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: UserCourseStarVo
 * Description:
 * date: 2019-05-10 22:27
 *
 * @author cmc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCourseStarVo {

    @ApiModelProperty(value = "用户Id")
    private int  userId;

    @ApiModelProperty(value = "课程id")
    private int courseId;

    @ApiModelProperty(value = "评价星级")
    private int starLevel;

}
