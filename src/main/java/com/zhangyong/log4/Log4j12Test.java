package com.zhangyong.log4;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author 张勇
 * @Date 2019/10/28 14:06
 * @Version 1.0
 */
@Slf4j
public class Log4j12Test {
    public static void main(String[] args) {
        String testInfo = "Free flying flowers are like dreams";
        log.info("The test info is :{}", testInfo);
    }
}
