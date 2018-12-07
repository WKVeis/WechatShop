package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by weikaixiang
 * @date 2018/12/7 0007.
 */
@RestController
@Slf4j
@RequestMapping("/weixin")
public class WeixinController {
    @GetMapping("/auth")
    public void auth(){
        log.info("获取授权code的auth方法");

    }
    @GetMapping("/auth1")
    public void auth1(@RequestParam("code") String code) {
        log.info("code={}", code);
    }
}
