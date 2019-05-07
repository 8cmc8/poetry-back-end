package com.poetry.entity.Course;

import com.poetry.entity.Base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: CourseComment <br/>
 * Description: <br/>
 * date: 2019-04-25 22:38<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseComment extends BaseEntity {
    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "用户id")
    private int userId;

    @ApiModelProperty(value = "课程id")
    private int courseId;

    @ApiModelProperty(value = "星级")
    private int starLevel;

    @ApiModelProperty(value = "评论")
    private String comment;
}
