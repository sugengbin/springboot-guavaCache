package info.sugengbin.springboot.repository;

import java.util.List;

import info.sugengbin.springboot.domain.Config;

/**
 *
 * Date: 2017年2月23日<br/>
 * 
 * @author sugengbin
 */
public interface ReloadDataService {

	List<Config> findAllConfig();
}
