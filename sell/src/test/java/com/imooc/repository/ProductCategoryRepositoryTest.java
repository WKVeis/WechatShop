package com.imooc.repository;
import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.Id;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by weikaixiang on 2018/10/7 0007.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findoneTest(){
        ProductCategory productCategory=repository.findOne(4);
        System.out.println(productCategory.toString());
    }
    /**@Test
    public void saveTest(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("nba是我的最爱"); //因为在实体哪里加了ID注解自动增长，所以可以不用设置id
        productCategory.setCategoryType(5);
        repository.save(productCategory);
    }**/
    @Test
    public void saveTest(){
        ProductCategory productCategory=new ProductCategory("男生的喜欢" , 7);
        ProductCategory result=repository.save(productCategory);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        List<ProductCategory> result=repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());//此处可以打断点Debug调试一样用来查看结果
    }

}