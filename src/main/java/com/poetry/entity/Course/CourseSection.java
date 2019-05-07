package com.poetry.entity.Course;

import com.poetry.entity.Base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: CourseSection <br/>
 * Description: <br/>
 * date: 2019-04-25 22:34<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseSection extends BaseEntity {
    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "课程id")
    private int courseId;

    @ApiModelProperty(value = "章节名")
    private String sectionName;

    @ApiModelProperty(value = "章节简介")
    private String sectionIntroduce;

    @ApiModelProperty(value = "章节总时长")
    private int sectionTime;

    @ApiModelProperty(value = "地址链接")
    private String videoUrl;

    @ApiModelProperty(value = "章节序号")
    private String sectionOrder;
}
