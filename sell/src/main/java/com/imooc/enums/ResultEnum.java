package com.imooc.enums;

import lombok.Getter;

/**
 * Created by Administrator on 2018/10/23 0023.
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10 ,"商品不存在"),//将小写变成大写用快捷键ctrl+shift+u
    PRODUCT_STOCK_ERROR(11,"库存不正确"),
    ;
    private Integer code;
    private String message;
    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
