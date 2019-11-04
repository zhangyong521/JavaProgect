package com.zhangyong.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Author 张勇
 * @Date 2019/10/27 19:17
 * @Version 1.0
 */
public class DemoTest {

    private static String host ="127.0.0.1";
    private static int port = 6379;
    private static String password = "1234";
    private static int db = 0;
    private static int timeout = 30000;

    public static void main(String[] args) {
        JedisPoolConfig cfg = new JedisPoolConfig();
        cfg.setMaxTotal(20);//连接池中最多连接数
        cfg.setMaxIdle(5);//连接池中连接最大空闲数

        //创建连接池对象
        JedisPool pool = new JedisPool(cfg, host, port, timeout, password, db);
        Jedis jedis = pool.getResource();//获取jedis对象

        jedis.set("k1","hello world");

        String val = jedis.get("k1");
        System.out.println(val);

        jedis.close();
        pool.close();
        System.out.println("finish");
    }

}
