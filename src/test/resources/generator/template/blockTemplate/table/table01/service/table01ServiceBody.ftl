	/**
	 * 获取表格数据信息
	 * 
	 * @param column
	 * @param tableName
	 * @param tableSort
	 * @param searchMap
	 * @param deleteFlag
	 * @return
	 */
	public List<Map<String, Object>> get${@BlockCode}TableData(CsysUserView baseUserView, String[] column, String tableName,
			List<JsonBean> tableSort, Map<String, List<SearchSubJsonBean>> searchMap, List<JsonBean> deleteFlag,
			Map<String, List<JsonBean>> engineMap);

	/**
	 * 更新表格数据信息
	 * 
	 * @param tableName
	 * @param updateMap
	 * @param primaryMap
	 * @return
	 */
	public void update${@BlockCode}TableData(String tableName, List<JsonBean> updateMap, List<JsonBean> primaryMap);

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