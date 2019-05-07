package com.poetry.entity.Base;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName: BaseEntity <br/>
 * Description: <br/>
 * date: 2019-04-25 22:01<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {
    @ApiModelProperty(value = "创建时间")
    private Date dateCreate;

    @ApiModelProperty(value = "更新时间")
    private Date dateUpdate;
}
