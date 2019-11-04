package com.zhangyong.log4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Author 张勇
 * @Date 2019/10/28 11:21
 * @Version 1.0
 */
public class Slf4jTest {
    private static final Logger logger=LoggerFactory.getLogger(Slf4jTest.class);

    public static void main(String[] args) {
        logger.info("带参日志测试:{}","参数111");
        String key = "k1";
        try {
            System.out.println(3/0);
        } catch (Exception e) {
            logger.error("strSet():{} error:{}",key,e.getMessage());
        }

    }
}
