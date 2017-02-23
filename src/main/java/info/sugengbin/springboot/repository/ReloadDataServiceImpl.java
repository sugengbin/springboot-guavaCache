package info.sugengbin.springboot.repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import info.sugengbin.springboot.domain.Config;

/**
 *
 * Date: 2017年2月23日<br/>
 * 
 * @author sugengbin
 */
@Service
public class ReloadDataServiceImpl implements ReloadDataService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public List<Config> findAllConfig() {
		logger.info("connect db........");
		// TODO reload from db
		List<Config> list = new ArrayList<>();
		list.add(new Config(1, "switch", "1"));
		list.add(new Config(2, "url", "https://bing.com"));
		return list;
	}

}
