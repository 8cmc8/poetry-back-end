package com.poetry.entity.Course.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: UserCourseVo
 * Description:
 * date: 2019-05-10 19:51
 *
 * @author cmc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCourseVo {

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "课程id")
    private int courseId;
}
