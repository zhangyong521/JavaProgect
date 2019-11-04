package com.zhangyong.log4;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Author 张勇
 * @Date 2019/10/27 20:20
 * @Version 1.0
 */
public class Log4j2Test {
    private static Logger logger = LogManager.getLogger(Log4j2Test.class.getName());

    public static void main(String[] args) {
        logger.info("Info");
        logger.debug("Debug");
        try {
            System.out.println(3 / 0);
        } catch (Exception e) {
            logger.error("Error");
            logger.fatal("Fatal");
        }
    }
}