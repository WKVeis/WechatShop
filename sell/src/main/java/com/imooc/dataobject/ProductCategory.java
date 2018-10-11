package com.imooc.dataobject;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 类目表
 * Created by weikaixiang on 2018/10/7 0007.
 */
@Entity
@Data
public class ProductCategory {
    /** 加入一些注解使数据库映射为对象@Entity等
      主键，自增类型**/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//设置数据库主键字段自动增长
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }
}
