package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by weikaixiang on 2018/10/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository repository;
    @Test
    public  void saveTest(){
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setOrderId("148");
        orderDetail.setDetailId("1213");
        orderDetail.setProductIcon("jjj");
        orderDetail.setProductId("222");
        orderDetail.setProductName("大萝卜");
        orderDetail.setProductPrice(new BigDecimal(33.2));
        orderDetail.setProductQuantity(333);
        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList=repository.findByOrderId("148");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}