package com.imooc.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.domain.Page;

/**
 * Created by weikaixiang on 2018/11/12.
 * 作为订单控制层创建订单传入的参数
 */
@Data
public class OrderForm {
    /**
     * 买家的姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;
    /**
     * 买家的手机号
     */
    @NotEmpty(message = "手机号必填")
    private String phone;
    /**
     * 买家的地址
     */
    @NotEmpty(message = "地址必填")
    private String address;
    /**
     * 买家的微信openiD
     */
    @NotEmpty(message="买家openid")
    private String openid;
    /**
     * 购物车
     */
    @NotEmpty(message = "购物车不能为空")
    private String items;
}