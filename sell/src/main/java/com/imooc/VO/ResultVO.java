package com.imooc.VO;


import lombok.Data;

import javax.persistence.Entity;

/**
 * http请求返回的最外层对象
 * Created by weikaixiang on 2018/10/18.
 */
@Data
public class ResultVO<T> {
    /**错误码**/
    private Integer code;
    /**提示信息**/
    private String msg;
    /**具体内容**/
    private T data;
}
