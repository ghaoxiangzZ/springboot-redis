package com.ghaoxiang.springbootredis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ghaoxiang.springbootredis.dao.RedisDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(SpringbootRedisApplicationTests.class);

	@Autowired
	RedisDao redisDao;

	@Test
	public void testRedis() {
		redisDao.setKey("name", "ghaoxiangzZ");
		redisDao.setKey("sex", "man");
		logger.info(redisDao.getValue("name"));
		logger.info(redisDao.getValue("sex"));
	}
}

