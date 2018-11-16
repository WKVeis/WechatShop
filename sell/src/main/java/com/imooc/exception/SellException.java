package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by weikaixiang on 2018/10/23 0023.
 */
public class SellException extends RuntimeException {
    private Integer code;
    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());//把message里面的内容传到父类（super)的构造方法中去
        this.code=resultEnum.getCode();
    }
    public SellException(Integer code,String message){
        super(message);
        this.code=code;
    }
}
