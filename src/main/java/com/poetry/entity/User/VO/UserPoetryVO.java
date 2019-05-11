package com.poetry.entity.User.VO;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: UserPoetryVO
 * Description:
 * date: 2019-05-08 11:24
 *
 * @author cmc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPoetryVO {
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "诗词id")
    private int poetryId;
}
