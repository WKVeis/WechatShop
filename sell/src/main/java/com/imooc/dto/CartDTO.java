package com.imooc.dto;

import lombok.Data;

/**购物车
 * Created by weikaixiang on 2018/10/24 0024.
 */
@Data
public class CartDTO {
    /** 商品ID**/
    private String productId;
    /**数量**/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
