package com.zhangyong.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Author 张勇
 * @Date 2019/10/27 19:30
 * @Version 1.0
 */
public class JedisPoolUtil {
    private static String host = "192.168.153.160";
    private static int port = 6379;
    private static String password = "1234";
    private static int db = 0;
    private static int timeout = 30000;
    private static int maxWaitMillis = 20000;

    private volatile static JedisPool pool = null; //懒汉式单例

    private JedisPoolUtil() {

    }

    private static JedisPool getJedisPool() {
        if (pool == null) {
            synchronized (JedisPoolUtil.class) {
                JedisPoolConfig cfg = new JedisPoolConfig();
                cfg.setMaxTotal(20);//连接池中最多连接数
                cfg.setMaxIdle(5);//连接池中连接最大空闲数

                cfg.setMaxWaitMillis(maxWaitMillis);

                //创建连接池对象
                if (pool == null) {
                    pool = new JedisPool(cfg, host, port, timeout, password, db);
                }
            }
        }
        return pool;
    }

    public static Jedis getJedis() {

        return getJedisPool().getResource(); //从连接池中取一个Jedis对象
    }

    public static void release(Jedis jedis) {
        if (jedis != null) {
            jedis.close();// 将jedis放回连接池
        }
    }
}
