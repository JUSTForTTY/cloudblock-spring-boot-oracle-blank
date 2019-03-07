package com.company.project.biz;


/**
 * Created by tty on 2018/08/22.
 */
public interface CommonBiz {

	/**
	 * 获取sequence
	 * 
	 * @param tableName
	 * @return
	 */
	public String getSequence(String tableName);

	/**
	 * 获取sequence
	 * 
	 * @param tableName
	 * @return
	 */
	public String getOracleSequence(String tableName);


}
