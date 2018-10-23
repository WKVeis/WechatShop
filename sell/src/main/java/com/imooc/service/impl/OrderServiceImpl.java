package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dataobject.OrderMaster;
import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import com.imooc.dto.OrderDTO;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.repository.OrderDetailRepository;
import com.imooc.repository.OrderMasterRepository;
import com.imooc.service.OrderService;
import com.imooc.service.ProductService;
import com.imooc.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by weikaixiang on 2018/10/23.
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private OrderMasterRepository orderMasterRepository;
    @Override
    @Transactional   //加一个事务的注解，功能：发生异常的时候事务回滚不做任何操作！重点
    public OrderDTO create(OrderDTO orderDTO) {
        String orderId=KeyUtil.genUniqueKey();
        BigDecimal orderAmount=new BigDecimal(BigInteger.ZERO);
        //查询商品（数量，价格）
        //List<CartDTO> cartDTOList=new ArrayList<>();
        for(OrderDetail orderDetail: orderDTO.getOrderDetailList()){
            ProductInfo productInfo = productService.findOne(orderDetail.getProductId());
            if(productInfo==null){  //一个=是赋值，两个=是对比相等
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            /**计算订单总价
            BigDeciaml特有的乘法
             orderDetail.getProductPrice().multiply(new BigDecimal(orderDetail.getProductQuantity()))为一件商品总价
             **/
            orderAmount = orderDetail.getProductPrice().multiply(new BigDecimal(orderDetail.getProductQuantity()))
                    .add(orderAmount);

            //订单详情入库
            orderDetail.setDetailId(KeyUtil.genUniqueKey());
            orderDetail.setOrderId(orderId);//这个订单在创建的时候就生成了
            BeanUtils.copyProperties(productInfo,orderDetail);//spring的一个方法，将productInfo的属性拷贝到orderDetail
            orderDetailRepository.save(orderDetail);

          /**  CartDTO cartDTO=new CartDTO(orderDetail.getProductId(),orderDetail.getProductQuantity());
            cartDTOList.add(cartDTO);**/
        }
        // 写入数据库
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId(orderId);
        orderMaster.setOrderAmount(orderAmount);
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMasterRepository.save(orderMaster);
        //扣库存
        //使用java8新方法lambada返回一个集合，前面提到过
        List<CartDTO> cartDTOList=orderDTO.getOrderDetailList().stream().map(e ->
              new CartDTO(e.getProductId(),e.getProductQuantity())).collect(Collectors.toList());
        productService.decreaseStock(cartDTOList);
        return orderDTO;
    }

    @Override
    public OrderDTO findByOne(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
