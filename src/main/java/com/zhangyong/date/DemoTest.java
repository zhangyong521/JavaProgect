package com.zhangyong.date;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @Author 张勇
 * @Date 2019/10/21 15:59
 * @Version 1.0
 */
public class DemoTest {
    @Test
    public void dateAPI() {
        System.out.println("------java8输出年月份格式---------");
        LocalDate localDate = LocalDate.of(1999, 9, 21);
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());

        System.out.println("--------把字符串转为年月份格式----------");
        LocalDate localDateParse = LocalDate.parse("1990-01-01");
        System.out.println(localDateParse);
        System.out.println(localDateParse.getYear());

        System.out.println("---------java8输出时间格式------------");
        LocalTime localTime = LocalTime.of(3, 20);
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());

        System.out.println("-------把字符串转为时间格式---------");
        LocalTime localTimeparse = LocalTime.parse("11:35");
        System.out.println(localTimeparse);

        System.out.println("-------java8输出年月日时间格式---------");
        LocalDateTime localDateTime = LocalDateTime.of(1999, 9, 21, 12, 13, 12);
        System.out.println(localDateTime);

        System.out.println("-------java8输出现在的时间格式---------");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate now1 = now.toLocalDate();
        System.out.println(now1);
        LocalTime now2 = now.toLocalTime();
        System.out.println(now2);

        System.out.println("-------把字符串转为时间格式---------");
        LocalDateTime LocalDateTimeparse = LocalDateTime.parse("2999-09-21T11:44:11");
        System.out.println(LocalDateTimeparse);
        System.out.println(LocalDateTimeparse.getMinute());

        System.out.println("-----dateAPI完成-----------");
    }

    /**
     * 时区java8新特性
     */
    @Test
    public void zonedDateTime() {

        // 从默认时区的系统时钟获取当前的日期时间
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("当前时间以及时区：" + zonedDateTime);

        // 获得时区
        ZoneId zone = zonedDateTime.getZone();
        System.out.println("时区：" + zone);

        // 获得指定时区时间
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("指定时区和时间：" + zonedDateTime2);

        // 获取指定时区的本地时间
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Colombo"));
        System.out.println("指定要比较的时区斯里兰卡：" + localDateTime);
    }

    /**
     * 01. java.util.Date --> java.time.LocalDateTime
     */
    @Test
    public void UDateToLocalDateTime() {
        java.util.Date date = new java.util.Date();
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        System.out.println(localDateTime);

    }

    /**
     *  02. java.util.Date --> java.time.LocalDate
     */
    @Test
    public void UDateToLocalDate(){
        java.util.Date date = new java.util.Date();
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
    }

    /**
     *  03. java.util.Date --> java.time.LocalTime
     */
    @Test
    public void UDateToLocalTime(){
        java.util.Date date =new java.util.Date();
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);
    }

    /**
     * 04. java.time.LocalDateTime --> java.util.Date
     */
    @Test
    public void LocalDateTimeToUdate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zoneId).toInstant();
        java.util.Date date = Date.from(instant);
        System.out.println(date);
    }

    /**
     * 05. java.time.LocalDate --> java.util.Date
     */
    @Test
    public void LocalDateToUdate(){
        LocalDate localDate = LocalDate.now();
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay().atZone(zoneId).toInstant();
        java.util.Date date = Date.from(instant);
        System.out.println(date);
    }

    /**
     * 06. java.time.LocalTime --> java.util.Date
     */
    @Test
    public void LocalTimeToUdate(){
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zoneId).toInstant();
        java.util.Date date = Date.from(instant);
        System.out.println(date);
    }
}

