package testredis;

import redis.clients.jedis.Jedis;

public class RedisStringJava {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
		jedis.set("zhaoweikey", "woshizhaowei");
		System.out.println("redis存储的字符串为: " + jedis.get("zhaoweikey"));
		System.out.println("redis存储的字符串为: " + jedis.get("mykey"));
	}
}
