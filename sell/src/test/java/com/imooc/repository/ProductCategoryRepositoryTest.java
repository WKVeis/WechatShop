package com.imooc.repository;
import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.Id;
import org.springframework.test.context.junit4.SpringRunner;
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
        //ProductCategory productCategory=repository.findOne(1)；
    }
    @Test
    public void saveTest(){
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryId(4);
        productCategory.setCategoryName("天下无双");
        productCategory.setCategoryType(5);
        repository.save(productCategory);

    }
}