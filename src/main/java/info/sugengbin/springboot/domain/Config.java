package info.sugengbin.springboot.domain;

import java.io.Serializable;

/**
 *
 * Date: 2017年2月23日<br/>
 * 
 * @author sugengbin
 */
public class Config implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4455434682656907358L;
	private int id;
	private String paramKey;
	private String paramValue;
	private String paramDesc;

	public Config() {
	}

	public Config(int id, String paramKey, String paramValue) {
		this.id = id;
		this.paramKey = paramKey;
		this.paramValue = paramValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParamKey() {
		return paramKey;
	}

	public void setParamKey(String paramKey) {
		this.paramKey = paramKey;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public String getParamDesc() {
		return paramDesc;
	}

	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}

}
