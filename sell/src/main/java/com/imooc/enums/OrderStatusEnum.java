package com.imooc.enums;

import lombok.Getter;

/**
 * Created by weikaixiang on 2018/10/22.
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新下单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;
    private Integer code;
    private String message;
    OrderStatusEnum(Integer code, String message) {   //构造方法里面得参数对象位置不能变！
        this.code = code;
        this.message = message;
    }
}
