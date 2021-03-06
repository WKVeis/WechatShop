package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by weikaixiang on 2018/10/17.
 */
public interface ProductService {
    /**
     * 前面两个是
     * 提供给卖家端**/

    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);//CartDTO在dto包里有定义
    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
