package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13.
 */
public interface CategoryService {
    /**主要提供给卖家端
     * 查询单个
     * 查询全部
     */
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    /**主要给卖家端所用
     *
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);

}
