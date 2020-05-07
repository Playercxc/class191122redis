package com.atguigu.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Protocol;

import java.util.List;

public class jedisCodeTest {
    public static void main(String[] args) {

        String ipAddress = "hadoop102";
        int port = Protocol.DEFAULT_PORT;

        Jedis jedis = new Jedis(ipAddress, port);


        System.out.println(jedis.ping());
        Long lpush = jedis.lpush("animal", "cat","dog");

        System.out.println(lpush);

        List<String> animal = jedis.lrange("animal", 0, -1);
        for (String s : animal) {
            System.out.println(s);
        }



        //

    }
}
