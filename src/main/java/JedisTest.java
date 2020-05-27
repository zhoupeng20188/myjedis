import redis.clients.jedis.Jedis;

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.223.129", 6379);
        System.out.println(jedis.ping());
        jedis.set("k1","v1");
        System.out.println(jedis.get("k1"));
    }
}
