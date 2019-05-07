package com.poetry.entity.Game;

import com.poetry.entity.Base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Game <br/>
 * Description: <br/>
 * date: 2019-04-25 22:17<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game extends BaseEntity {
    @ApiModelProperty(value = "id")
    private int id;

    @ApiModelProperty(value = "游戏名")
    private String gameName;

    @ApiModelProperty(value = "游戏类目id")
    private int categoryId;

    @ApiModelProperty(value = "游戏规则")
    private String rule;

    @ApiModelProperty(value = "参与人数")
    private int comment;
}
