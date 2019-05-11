import com.zz.Application;
import com.zz.entity.User;
import com.zz.service.RedisTemplateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class RedisTest {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplateService redisTemplateService;
    @Test
    public void test()  {
        // 保存字符串
        stringRedisTemplate.opsForValue().set("aaa", "111");
    }

    @Test
    public void test1()  {
        // 取字符串
        String val=stringRedisTemplate.opsForValue().get("tt");
        System.out.println(val);
    }
    @Test
    public void redisTestObject(){

        User user = new User();
        user.setId(11);
        user.setUsername("test");
        user.setPassword("hello redis");
        redisTemplateService.set("key1",user);

        User us = redisTemplateService.get("key1",User.class);
        System.out.println(us.getUsername()+":  "+us.getPassword());
    }
}
