package com.poetry.entity.Poetry;

import com.poetry.entity.Base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: PoetryComment <br/>
 * Description: <br/>
 * date: 2019-04-25 22:31<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoetryComment extends BaseEntity {
    @ApiModelProperty(value = "id")
    private int Id;

    @ApiModelProperty(value = "用户id")
    private int userId;

    @ApiModelProperty(value = "诗词id")
    private int poetryId;

    @ApiModelProperty(value = "评论")
    private String comment;
}
