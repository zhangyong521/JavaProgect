package com.zhangyong.log4;

import org.apache.log4j.Logger;

/**
 * @Author 张勇
 * @Date 2019/10/27 20:13
 * @Version 1.0
 */
public class Log4jTest {
    private static Logger logger = Logger.getLogger(Log4jTest.class);
    public static void main(String[] args) {
        logger.info("Info");// 记录info级别的信息
        logger.debug("Debug");// 记录debug级别的信息
        try {
            System.out.println(3 / 0);
        } catch (Exception e) {
            logger.error("Error");// 记录error级别的信息
        }
        logger.fatal("Fatal");
    }
}
