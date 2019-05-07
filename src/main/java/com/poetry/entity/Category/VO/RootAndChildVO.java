package com.poetry.entity.Category.VO;

import com.poetry.entity.Category.Category;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName: RootAndChildVO <br/>
 * Description: <br/>
 * date: 2019-05-06 18:41<br/>
 *
 * @author admin<br />
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RootAndChildVO {
    @ApiModelProperty(value = "根目录")
    private Category root;

    @ApiModelProperty(value = "子目录")
    private List<Category> child;
}
