package com.example.demo.util.redis;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

public class RedisUtil {

    private RedisUtil(){}

    private static JedisPool jedisPool;

    private static int maxTotal;

    private static int maxWaitMillis;

    private static String host;

    private static int port;

    /**
     * 读取application.yml中jedis的配置文件
     */
    static {
        ResourceBundle rb = ResourceBundle.getBundle("jedis.yml");
        maxTotal = Integer.parseInt(rb.getString("jedis.maxTotal"));
        maxWaitMillis = Integer.parseInt(rb.getString("jedis.maxWaitMillis"));
        host = rb.getString("jedis.host");
        port = Integer.parseInt(rb.getString("jedis.port"));
    }

    /**
     * 创建连接池
     */
    static {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(maxTotal);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        jedisPool = new JedisPool(jedisPoolConfig, host, port);
    }

    /**
     * 获取redis
     * @return
     */
    public static Jedis getRedis() {
        return jedisPool.getResource();
    }

    /**
     * 关闭redis
     */
    public static void closeRedis(Jedis jedis) {
        if (jedis != null) {
            jedis.close();
        }
    }
}
