package info.sugengbin.springboot.cache;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * Date: 2017年2月23日<br/>
 * 
 * @author sugengbin
 */
@Component
public class ConfigUtil {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private RefreshableCache refreshableCache;

	/**
	 * 
	 * @param key
	 * @return
	 */
	private String configBy(String key) {
		logger.info("get config.............");
		Map<String, String> configList = refreshableCache.reloadConfig("configCache");
		return configList.get(key);
	}

	/**
	 * 
	 * @return
	 */
	public boolean isOpen() {
		boolean isOpen = false;
		try {
			isOpen = configBy("switch").equals("1");
		} catch (Exception e) {
			// TODO
		}
		return isOpen;
	}

	/**
	 * 
	 * @return
	 */
	public String url() {
		return configBy("url");
	}

}
