package com.imooc.service.impl;

import com.google.gson.Gson;
import com.imooc.dto.OrderDTO;
import com.imooc.service.PayService;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import com.lly835.bestpay.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author by weikaixiang
 * @date 2018/12/9 0009.
 */
@Service
@Slf4j
public class PayServiceImpl implements PayService {
    private final String ORDER_NAME = "点餐订单";
    @Autowired
    private BestPayServiceImpl bestPayService;

    @Override
    public void create(OrderDTO orderDTO) {

        PayRequest payRequest = new PayRequest();
        payRequest.setOpenid(orderDTO.getBuyerOpenid());
        payRequest.setOrderAmount(orderDTO.getOrderAmount().doubleValue());
        payRequest.setOrderId(orderDTO.getOrderId());
        payRequest.setOrderName(ORDER_NAME);
        payRequest.setPayTypeEnum(BestPayTypeEnum.WXPAY_H5);
        log.info("【微信支付】request={}", JsonUtil.toJson(payRequest) );
        bestPayService.pay(payRequest);
        PayResponse payResponse = new PayResponse();
        log.info("【微信支付】reponse={}", JsonUtil.toJson(payResponse));
    }
}
