package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 * Created by weikaixiang on 2018/10/23.
 */
@Data
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    /**买家微信**/
    private String buyerOpenid;
    /**订单总金额**/
    private BigDecimal orderAmount;
    /**订单状态，默认状态新下单**/
    private Integer orderStatus ;
    /**支付状态，默认未支付**/
    private Integer payStatus;
    /**创建时间**/
    private Date createTime;
    /**更新时间**/
    private Date updateTime;
    private List<OrderDetail> orderDetailList;

}
