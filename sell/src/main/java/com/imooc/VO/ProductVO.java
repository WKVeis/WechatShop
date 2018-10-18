package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.imooc.dataobject.ProductInfo;
import lombok.Data;
import java.util.List;

/**
 * 商品（包含类目）
 * Created by Administrator on 2018/10/18.
 */
@Data
public class ProductVO {
    @JsonProperty("name")//json的格式显示
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
