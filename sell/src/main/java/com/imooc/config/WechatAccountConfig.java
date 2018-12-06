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
}
