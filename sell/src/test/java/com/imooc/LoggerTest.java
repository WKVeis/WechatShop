package com.imooc;
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
public class LoggerTest {
    /**getLogger中放的是当前类，表示打印的是当前类的日志，已经写死了，我们可用一种更好的方法灵活运用
     即引用注解@Slf4j,参照新写的测试类Test2
     **/
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){  //这里控制台只能输出info和error的信息，因为系统默认的日志级别是info，级别之上的error也能输出,
                           //而debug级别在info之下所以不能，通过找到slf4j包下的类Level查看级别
                           //查找类的快捷键ctrl+shift+alt+ n
         logger.debug("debug...");
         logger.info("info");
         logger.error("error");
    }
}
