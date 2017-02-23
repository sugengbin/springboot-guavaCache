package info.sugengbin.springboot.cache;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.CacheManager;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.google.common.cache.CacheBuilder;

/**
 *
 * Date: 2016年9月22日<br/>
 * 
 * @author sugengbin
 */
@Configuration
public class GuavaCacheConfig {

	@Primary
	@Bean(name = "firstCacheManager")
	public CacheManager cacheManager() {
		GuavaCacheManager cacheManager = new GuavaCacheManager("guavaCache");
		CacheBuilder<Object, Object> cacheBuilder = CacheBuilder.newBuilder().maximumSize(100).expireAfterWrite(1,
				TimeUnit.MINUTES);
		cacheManager.setCacheBuilder(cacheBuilder);
		return cacheManager;
	}

	@Bean(name = "secondCacheManager")
	public CacheManager secondCacheManager() {
		GuavaCacheManager cacheManager = new GuavaCacheManager("secondCache");
		CacheBuilder<Object, Object> cacheBuilder = CacheBuilder.newBuilder().maximumSize(100).expireAfterWrite(2,
				TimeUnit.MINUTES);
		cacheManager.setCacheBuilder(cacheBuilder);
		return cacheManager;
	}
}
