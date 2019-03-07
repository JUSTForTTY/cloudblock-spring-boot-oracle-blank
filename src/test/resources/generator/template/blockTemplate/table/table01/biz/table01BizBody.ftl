	/**
	 * 获取数据
	 * 
	 * @param TableDataBean
	 * @return
	 */
	public PageInfo get${@BlockCode}TableData(CsysUserView baseUserView, TableDataBean tableDataBean);

	/**
	 * 更新数据
	 * 
	 * @param TableDataBean
	 * @return
	 */
	public void update${@BlockCode}TableData(TableDataBean tableDataBean);

	/**
	 * 删除数据
	 * 
	 * @param tableName
	 * @param deleteFlag
	 * @param primaryMap
	 * @return
	 */
	public void logical${@BlockCode}DeleteData(String tableName, String deleteFlag, List<JsonBean> primaryMap);

	/**
	 * 物理删除
	 * 
	 * @param tableName
	 * @param primaryMap
	 */
	public void physical${@BlockCode}DeleteData(String tableName, List<JsonBean> primaryMap);