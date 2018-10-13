package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 类目表
 * Created by weikaixiang on 2018/10/7 0007.
 */
@Entity
@DynamicUpdate  //此注解可以自动更改数据库时间字段的值
@Data
public class ProductCategory {
    /** 加入一些注解使数据库映射为对象@Entity等
      主键，自增类型**/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//设置数据库主键字段自动增长
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
    public ProductCategory(){
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
