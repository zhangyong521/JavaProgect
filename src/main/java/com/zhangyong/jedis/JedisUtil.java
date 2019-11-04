package com.zhangyong.jedis;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;

/**
 * @Author 张勇
 * @Date 2019/10/28 14:17
 * @Version 1.0
 */
@Slf4j
public class JedisUtil {
    /**
     * 字符串设置Key-value-expire
     *
     * @param key
     * @param value
     * @param expire 过期时间，值为-1时永不过期
     * @return 成功返回OK
     */
    public static String strSet(String key, String value, int expire) {

        Jedis jedis = null;
        String res = null;

        try {
            jedis = JedisPoolUtil.getJedis();
            res = jedis.set(key, value);
            if (expire != -1) {
                jedis.expire(key, expire);
            }
        } catch (Exception e) {
            log.error("strSet{}error:{}", key, e);
        } finally {
            JedisPoolUtil.release(jedis);
        }
        return res;
    }

    /**
     * 字符串设置key-value
     *
     * @param key
     * @param value
     * @return 成功返回ok
     */
    public static String strSet(String key, String value) {
        return strSet(key, value, -1);
    }

    /**
     * 根据key获取字符串的值
     *
     * @param key
     * @return
     */

    public static String strGet(String key) {

        Jedis jedis = null;
        String res = null;

        try {
            jedis = JedisPoolUtil.getJedis();
            res = jedis.get(key);
        } catch (Exception e) {
            log.error("strSet{}error:{}", key, e);
        } finally {
            JedisPoolUtil.release(jedis);
        }
        return res;
    }

    /**
     * 从右边开始往List中添加数据
     *
     * @param key
     * @param value
     * @return 返回值为添加list的个数
     */

    public static long listRPush(String key, String... value) {
        Jedis jedis = null;
        long res = -1;
        try {
            jedis = JedisPoolUtil.getJedis();
            res = jedis.rpush(key, value);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("listRPush():{},error:{}", key, value);
        } finally {
            JedisPoolUtil.release(jedis);
        }

        return res;
    }

    /**
     * 取出存入list中的值
     *
     * @param key
     * @param start
     * @param end
     * @return 返回值为数组list的值
     */
    public static List<String> listLrange(String key, int start, int end) {
        List<String> res = null;
        Jedis jedis = null;
        try {
            jedis = JedisPoolUtil.getJedis();
            res = jedis.lrange(key, start, end);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("listRPush():{} {} {},error:{}", key, start, end);
        } finally {
            JedisPoolUtil.release(jedis);
        }
        return res;
    }

    /**
     * 刪除Key
     *
     * @param key
     * @return 成功返回1
     */
    public static long del(String key) {
        long res = 1;
        Jedis jedis = null;
        try {
            jedis = JedisPoolUtil.getJedis();
            res = jedis.del(key);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("del():{},error:{}", key);
        } finally {
            JedisPoolUtil.release(jedis);
        }
        return res;
    }
    ////////////////hash操作

    /**
     * mapHset 操作
     *
     * @param key
     * @param field
     * @param value
     * @return 返回值为1
     */

    public static long mapHset(String key, String field, String value) {
        long res = -1;
        Jedis jedis = null;
        try {
            jedis = JedisPoolUtil.getJedis();
            res = jedis.hset(key, field, value);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("mapHset(){}{}{},errors{}", key, field, value, e);
        } finally {
            JedisPoolUtil.release(jedis);
        }
        return res;
    }

    /**
     * mapHget 获取值
     *
     * @param key
     * @param field
     * @return
     */
    public static String mapHget(String key, String field) {
        String res = null;
        Jedis jedis = null;
        try {
            jedis = JedisPoolUtil.getJedis();
            res = jedis.hget(key, field);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("mapHget() {} {} , errors {}", key, field, e);
        } finally {
            JedisPoolUtil.release(jedis);
        }
        return res;
    }

    /**
     * 设置map值
     *
     * @param key
     * @param map
     * @return 返回值 OK
     */
    public static String mapHmset(String key, Map<String, String> map) {
        String res = null;
        Jedis jedis = null;
        try {
            jedis = JedisPoolUtil.getJedis();
            res = jedis.hmset(key, map);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("mapHmset() {} {} , errors {}", key, map, e);
        } finally {
            JedisPoolUtil.release(jedis);
        }
        return res;

    }

    /**
     * mapHmget獲取值
     *
     * @param key
     * @param fields
     * @return
     */
    public static List<String> mapHmget(String key, String... fields) {
        List<String> res = null;
        Jedis jedis = null;

        try {
            jedis = JedisPoolUtil.getJedis();
            res = jedis.hmget(key, fields);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("mapHmget(){}{},errors{}", key, fields, e);
        } finally {
            JedisPoolUtil.release(jedis);
        }
        return res;
    }

}
