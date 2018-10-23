package com.imooc.dataobject;

import lombok.Data;
import org.springframework.data.domain.PageRequest;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by weikaixiang on 2018/10/23.
 */
@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;
    private String orderId;
    private String productId;
    private String productName;
    /**单价**/
    private BigDecimal productPrice;
    private Integer productQuantity;
    private String productIcon;
}
