package com.poetry.entity.Poetry.VO;

import lombok.Data;

/**
 * ClassName: SimplePoetryVO
 * Description:
 * date: 2019-05-07 14:36
 *
 * @author cmc
 */
@Data
public class SimplePoetryVO {
    private int id;
    private String poetryName;
    private String dynasty;
    private String author;
}
