package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 * Created by weikaixiang on 2018/10/22.
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    /**订单ID**/
    @Id
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    /**买家微信**/
    private String buyerOpenid;
    /**订单总金额**/
    private BigDecimal orderAmount;
    /**订单状态，默认状态新下单**/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /**支付状态，默认未支付**/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /**创建时间**/
    private Date createTime;
    /**更新时间**/
    private Date updateTime;
 /*   @Transient    //下面这行代码关联的是另外一个表，使用这个注解，该代码就不会在OrderMaster数据库中查找
    private List<OrderDetail> orderDetailList;*/
}
