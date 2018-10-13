package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Arrays;
import java.util.List;
/**
 * Created by Administrator on 2018/10/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;
    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory=categoryService.findOne(2);
        Assert.assertNotEquals(new Integer(2),productCategory.getCategoryId());

    }

    @Test
    public void findAll() throws Exception {
      List<ProductCategory> productCategoryList=categoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> productCategoryList=categoryService.findByCategoryTypeIn(Arrays.asList(1,2,2));
        Assert.assertNotEquals(0,productCategoryList.size());

    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory=new ProductCategory("天下无敌",9);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);


    }
}