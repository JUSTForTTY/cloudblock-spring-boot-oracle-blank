	@Override
	public List<Map<String, Object>> get${@BlockCode}TableData(CsysUserView baseUserView, String[] column, String tableName,
			List<JsonBean> tableSort, Map<String, List<SearchSubJsonBean>> searchMap, List<JsonBean> deleteFlag,
			Map<String, List<JsonBean>> engineMap) {
		String columndata = "";

		for (int i = 0; i < column.length; i++) {

			columndata += column[i] + ",";
		}
		columndata = columndata.substring(0, columndata.length() - 1);

		String sql = "select " + columndata + " from  " + tableName + " where 1=1";

		// 删除标记暂时支持一个字段
		if (!deleteFlag.isEmpty()) {

			for (JsonBean entry : deleteFlag) {
				if (null != entry.getName() && !"".equals(entry.getName())) {
					sql += " and ";

					sql += "" + entry.getName() + " = '" + entry.getValue() + "' ";

				} else {

				}

			}

		}

		// 遍历搜索条件
		if (!searchMap.isEmpty()) {

			sql += " and ";

			for (Map.Entry<String, List<SearchSubJsonBean>> entry : searchMap.entrySet()) {

				sql += "(";
				for (SearchSubJsonBean subentry : entry.getValue()) {

					if ("between".equals(subentry.getName()) || "not between".equals(subentry.getName())) {
						if ("dateformat".equals(subentry.getType())) {
							sql += "(   DATE_FORMAT(" + entry.getKey() + ",'" + subentry.getInstruction() + "') "
									+ subentry.getName() + "  DATE_FORMAT('" + subentry.getValue1() + "','"
									+ subentry.getInstruction() + "') and  DATE_FORMAT('" + subentry.getValue2() + "','"
									+ subentry.getInstruction() + "')) or";
						} else {
							sql += "(" + entry.getKey() + " " + subentry.getName() + "  '" + subentry.getValue1()
									+ "' and  '" + subentry.getValue2() + "') or";
						}

					} else if ("like".equals(subentry.getName())) {

						if ("dateformat".equals(subentry.getType())) {
							sql += " DATE_FORMAT(" + entry.getKey() + ",'" + subentry.getInstruction() + "') "
									+ subentry.getName() + "  DATE_FORMAT('" + subentry.getValue1() + "','"
									+ subentry.getInstruction() + "') or";
						} else {
							sql += " " + entry.getKey() + " " + subentry.getName() + "  '%" + subentry.getValue1()
									+ "%' or";
						}

					} else {
						if ("dateformat".equals(subentry.getType())) {

							sql += " DATE_FORMAT(" + entry.getKey() + ",'" + subentry.getInstruction() + "') "
									+ subentry.getName() + "  DATE_FORMAT('" + subentry.getValue1() + "','"
									+ subentry.getInstruction() + "') or";
						} else {

							sql += " " + entry.getKey() + " " + subentry.getName() + "  '" + subentry.getValue1()
									+ "' or";
						}

					}

				}
				sql = sql.substring(0, sql.length() - 2);

				sql += ")";

				sql += " and";

			}

			sql = sql.substring(0, sql.length() - 3);

		}

		// 引擎
		if (!engineMap.isEmpty()) {
			for (Map.Entry<String, List<JsonBean>> entry : engineMap.entrySet()) {
				for (JsonBean jsonBean : entry.getValue()) {
					// 是否需要组织架构
					if ("organizeField".equals(jsonBean.getName()))
						sql += " and " + jsonBean.getValue() + " in("
								+ organizeInterfaces.getOrganizeUserSql(baseUserView, null) + ") ";
				}
			}
		}

		if (!tableSort.isEmpty()) {
			sql += " order by ";
			for (JsonBean entry : tableSort) {

				sql += "" + entry.getName() + " " + entry.getValue() + " ,";

			}

			sql = sql.substring(0, sql.length() - 1);

		}

		System.out.println(sql);
		return systemMapper.selectPublicItemList(sql);
	}

	public void update${@BlockCode}TableData(String tableName, List<JsonBean> updateMap, List<JsonBean> primaryMap) {
		String sql = "update " + tableName + " ";

		if (!updateMap.isEmpty()) {
			sql += " set ";

			for (JsonBean entry : updateMap) {

				sql += "" + entry.getName() + " = '" + entry.getValue() + "' ,";
			}

			sql = sql.substring(0, sql.length() - 1);

		}

		if (!primaryMap.isEmpty()) {
			sql += " where  ";

			for (JsonBean entry : primaryMap) {

				sql += "" + entry.getName() + " = '" + entry.getValue() + "' and";
			}

			sql = sql.substring(0, sql.length() - 3);

		} else {
			sql += " where 1=2 ";
		}

		systemMapper.updatePublicItem(sql);
	}

	@Override
	public void logical${@BlockCode}DeleteData(String tableName, String deleteFlag, List<JsonBean> primaryMap) {

		String sql = "update " + tableName + " set " + deleteFlag + " ='1' ";

		if (!primaryMap.isEmpty()) {
			sql += " where  ";

			for (JsonBean entry : primaryMap) {

				sql += "" + entry.getName() + " = '" + entry.getValue() + "' and";
			}

			sql = sql.substring(0, sql.length() - 3);

		} else {

			sql += " where 1=2 ";
		}
		systemMapper.updatePublicItem(sql);
	}

	@Override
	public void physical${@BlockCode}DeleteData(String tableName, List<JsonBean> primaryMap) {
		String sql = "delete from " + tableName + "";

		if (!primaryMap.isEmpty()) {
			sql += " where  ";

			for (JsonBean entry : primaryMap) {

				sql += "" + entry.getName() + " = '" + entry.getValue() + "' and";
			}

			sql = sql.substring(0, sql.length() - 3);

		} else {
			sql += " where 1=2 ";
		}
		systemMapper.deletePublicItem(sql);

	}