package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by weikaixiang on 2018/10/17.
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    /**
     * 状态0上架，1下架
     **/
    private Integer productStatus;
    /**类目编号**/
    private Integer categoryType;

}
