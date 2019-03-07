	@PostMapping(value = "/${@BlockCode}TableData")
	public Result get${@BlockCode}TableData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody TableDataBean tableDataBean) {

		Map<String, String> param = new HashMap<>();

		/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token, refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken = authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			return ResultGenerator.genUnauthorizedResult(param);

		}
		/*---------------------------end 授权验证------------------------*/

		try {
			// 获取用户信息
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView=new CsysUserView();

			baseUserView.setCsysUserRefreshToken(refreshtoken);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/

			PageInfo pageInfo = ${pageNameLowerCamel}Biz.get${@BlockCode}TableData(baseUserList.get(0), tableDataBean);

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(pageInfo, param);

		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}

	}
	
	
	// 更新表格数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口
	@PutMapping(value = "/${@BlockCode}tableData")
	public Result ${@BlockCode}PutTableData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token, @RequestBody TableDataBean tableDataBean) {

		Map<String, String> param = new HashMap<>();

		/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token, refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken = authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			return ResultGenerator.genUnauthorizedResult(param);

		}
		/*---------------------------end 授权验证------------------------*/

		try {
			// 获取用户信息
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView=new CsysUserView();

			baseUserView.setCsysUserRefreshToken(refreshtoken);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/

			${pageNameLowerCamel}Biz.update${@BlockCode}TableData(tableDataBean);

			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(param);

		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}

	}

	// 物理删除表格数据-通用方法,此方法仅限测试工具时使用，正式生产环境不使用通用接口
	@DeleteMapping(value = "/${@BlockCode}physicalDeleteData")
	public Result ${@BlockCode}PhysicalDeleteData(@RequestHeader(value = "access_token") String access_token,
			@RequestHeader(value = "refresh_token") String refresh_token,
			@RequestBody List<DeleteDataBean> deleteBeanList) {

		Map<String, String> param = new HashMap<>();

		/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token, refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken = authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			return ResultGenerator.genUnauthorizedResult(param);

		}
		/*---------------------------end 授权验证------------------------*/

		try {
			// 获取用户信息
			/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView=new CsysUserView();

			baseUserView.setCsysUserRefreshToken(refreshtoken);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

			/*--------------end 此段代码可优化成redis-----------------------*/

			for (DeleteDataBean deleteBean : deleteBeanList) {

				${pageNameLowerCamel}Biz.physical${@BlockCode}DeleteData(deleteBean.getTableName(), deleteBean.getPrimaryMap());
			}
			if (tokenRefreshFlag) {
				param.put("access_token", token);
				param.put("refresh_token", refreshtoken);

			}
			return ResultGenerator.genSuccessResult(param);

		} catch (Exception e) {

			return ResultGenerator.genServerErrorResult(param);

		}

	}
	
	