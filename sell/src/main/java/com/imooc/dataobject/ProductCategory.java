package com.imooc.dataobject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 类目表
 * Created by weikaixiang on 2018/10/7 0007.
 */
@Entity
public class ProductCategory {
    /** 加入一些注解使数据库映射为对象@Entity等
      主键，自增类型**/
    @Id
    @GeneratedValue
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;

}
