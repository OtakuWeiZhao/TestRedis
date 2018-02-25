package testredis;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisListJava {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
		jedis.lpush("site-list", "github");
		jedis.lpush("site-list", "Google");
		jedis.lpush("site-list", "Taobao");
		List<String> list = jedis.lrange("site-list", 0, 2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("列表项为:" + list.get(i));
		}
	}
}
