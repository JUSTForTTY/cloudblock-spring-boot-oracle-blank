	@Override
	public PageInfo get${@BlockCode}TableData(CsysUserView baseUserView, TableDataBean tableDataBean) {
		PageHelper.startPage(tableDataBean.getNowPage(), tableDataBean.getPageSize());

		// 查询数据
		List<Map<String, Object>> list = ${pageNameLowerCamel}Service.get${@BlockCode}TableData(baseUserView, tableDataBean.getTableColumn(),
				tableDataBean.getTableName(), tableDataBean.getTableSort(), tableDataBean.getSearchMap(),
				tableDataBean.getDeleteFlag(), tableDataBean.getEngineMap());

		PageInfo pageInfo = new PageInfo(list);

		return pageInfo;
	}

	@Override
	public void update${@BlockCode}TableData(TableDataBean tableDataBean) {

		${pageNameLowerCamel}Service.update${@BlockCode}TableData(tableDataBean.getTableName(), tableDataBean.getUpdateMap(),
				tableDataBean.getPrimaryMap());
	}

	@Override
	public void logical${@BlockCode}DeleteData(String tableName, String deleteFlag, List<JsonBean> primaryMap) {

		${pageNameLowerCamel}Service.logical${@BlockCode}DeleteData(tableName, deleteFlag, primaryMap);
	}

	@Override
	public void physical${@BlockCode}DeleteData(String tableName, List<JsonBean> primaryMap) {

		${pageNameLowerCamel}Service.physical${@BlockCode}DeleteData(tableName, primaryMap);
	}