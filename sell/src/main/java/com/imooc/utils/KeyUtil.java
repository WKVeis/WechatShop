package com.imooc.utils;

import java.util.Random;

/**
 * Created by weikaixiang on 2018/10/23 0023.
 */
public class KeyUtil {
    /**
     * 生成唯一主键
     * 格式：时间+随机数
     *加入synchronized关键子防止多线程生成相同的随机结果数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        //System.currentTimeMillis();
        Integer number = random.nextInt(900000) + 100000;//生成6位；（90）+10生成两位
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
