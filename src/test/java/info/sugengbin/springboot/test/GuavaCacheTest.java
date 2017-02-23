package info.sugengbin.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import info.sugengbin.springboot.Application;
import info.sugengbin.springboot.cache.ConfigUtil;

/**
 *
 * Date: 2017年2月23日<br/>
 * 
 * @author sugengbin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class GuavaCacheTest {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ConfigUtil configUtil;

	@Test
	public void testCache() {
		logger.info("isOpen:{}", configUtil.isOpen());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		logger.info("isOpen:{}", configUtil.isOpen());
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
		}
		logger.info("isOpen:{}", configUtil.isOpen());
	}
}
