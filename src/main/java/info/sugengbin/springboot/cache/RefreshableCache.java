package info.sugengbin.springboot.cache;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import info.sugengbin.springboot.domain.Config;
import info.sugengbin.springboot.repository.ReloadDataService;

/**
 *
 * Date: 2016年9月22日<br/>
 * 
 * @author sugengbin
 */
@Component
public class RefreshableCache {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private ReloadDataService reloadDataService;

	@Cacheable(value = "guavaCache", cacheManager = "firstCacheManager")
	public Map<String, String> reloadConfig(String cacheKey) {
		logger.info("reload config.............");
		List<Config> configs = reloadDataService.findAllConfig();
		Map<String, String> result = configs.stream()
				.collect(Collectors.toMap(Config::getParamKey, Config::getParamValue));
		return result;
	}

}
