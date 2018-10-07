package com.imooc;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by weikaixiang on 2018/10/6 0006.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j  //因为引用了注解，可直接注解引用当前类生成的注解对象（该注解由lombok依赖提供）
public class LoggerTest2 {
        //  private final Logger logger = LoggerFactory.getLogger(LoggerTest2.class);
    @Test
    public void test1(){
          String name="weikaix";
          String password="123";
         log.debug("debug...");
         log.info("name:" + name + "password:" + password);
         log.info("name:{},password:{}",name,password);
         log.error("error");
    }
}
