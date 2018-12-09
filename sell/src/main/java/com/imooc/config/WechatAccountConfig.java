package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author by weikaixiang
 * @date 2018/12/7 0007.
 */
@Data
@Component
@ConfigurationProperties("/wechat")
public class WechatAccountConfig {
    private String mpAppId;
    private String mpAppSecret;
   //下面为支付模块的
    /**
     * 商户号
     */
    private String mchId;
    /**
     * 商户秘钥
     */
    private String mchKey;
    /**
     * 商户证书路径
     */
    private String keyPath;
    /**
     * 微信支付异步通知
     */
    private String notifyUrl;
}
