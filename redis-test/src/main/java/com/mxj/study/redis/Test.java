package com.mxj.study.redis;

import redis.clients.jedis.Jedis;

/**
 * @author xinjie.ma
 * @date 2018-08-02
 * Description:
 */
public class Test {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.56.100", 6379);
        jedis.set("name", "winthesky");
        System.out.println(jedis.get("name"));
    }

}
