组织架构查询数据方案：
方法：1.以人为单位：
		前提：首先查出当前用户组织架构下的所有人
     		方案 a: 查询表格数据时加条件：创建人 in（所有人） ，缺点：因为所有人不确定且数量较大会导致效率很慢，所以此法弃用 
     		方案 b: 查询完所有数据后，进行逐条数据比较，判断每条记录的创建人是否在所有人当中，若存在则返回数据，不存在则过滤，将满足条件的数据返回
     				（注意：处理时需考虑分页的情况）。 缺点：若数据量很大的情况下（有千万），纯粹查所有数据就需要耗费近百秒时间，所以此法弃用 
     				
	 	方案c: 查询数据时采用表连接过滤数据：即查出当前用户权限表里所有节点下的所有人和用户表进行内联
	 		    
方法：
	2.以组织架构节点为单位：
		前提：首先查出当前用户组织架构下的所有节点	
			 方案a：用户表中创建记录时将所属组织架构节点保存在用户表中
			 		缺点：破坏用户表结构，需增加组织架构字段
			 		问题：若用户存在多个组织则无法存储
			 	下一步：用户表数据in(所有节点)	
			 		
			 方案b：用户表中创建记录时将所属组织架构节点保存在用户表的附属表中，一条记录对应当前用户的多个组织架构节点
			 
			 方案c: 用户表和权限表做视图，视图中包含了用户的节点 
			 	下一步：用户表数据in(所有节点)
			 		
	 				
问题：
	1.用户创建数据时，需不需要存储所属组织架构，因为存在一个人所属多个组织架构的情况，用户登录时可能会选择所属组织架构
		比如：一个人 所属市场部助理（上级为市场部经理）和销售部助理（上级为销售部部经理） ，登录时选择市场部助理：那么此时创建的数据，应该市场部经理可以看到，而销售部经理看不到。
			解决办法：创建的记录需要分市场部节点和销售部节点
	2.用户换组织架构节点，之前的数据怎么看，解决办法：解决办法：创建的记录需要分市场部节点和销售部节点
	
	
方案a：  耗时：9.286s
	 sql :
		select t_test002_name  from t_test002 where t_test002_is_delete = '0'
		 	and t_test002_create_user in 
		 		(select cy_sys_base_user_id from cy_sys_organizational_structure_point_authority 
		 				where cy_sys_organizational_structure_point_authority_is_delete = '0' 
		 					and cy_sys_organizational_structure_id = 'SUCUCySysOrganizationalStructure20181127000036'
		 					 and cy_sys_organizational_structure_point_id in ('SUCUCySysOrganizationalStructurePoint20181127000095')
		 		) limit 1,100	
		 		
		 		
方案c:  耗时：10.546s
	sql : 	
			select t_test002_name  from t_test002 a
		 		right join 
		  				(select cy_sys_base_user_id from cy_sys_organizational_structure_point_authority 
		  					where cy_sys_organizational_structure_point_authority_is_delete = '0' 
		  						and cy_sys_organizational_structure_id = 'SUCUCySysOrganizationalStructure20181127000036' 
		  						and cy_sys_organizational_structure_point_id in ('SUCUCySysOrganizationalStructurePoint20181127000095')
		  				 )
					 b on t_test002_create_user = cy_sys_base_user_id
					 where t_test002_is_delete = '0' limit 1,100
					 
方案d: 耗时：9.753s
		select t_test002_name  from t_test002 a 
			left join 
				(select cy_sys_base_user_id from cy_sys_organizational_structure_point_authority 
					where cy_sys_organizational_structure_point_authority_is_delete = '0' 
					and cy_sys_organizational_structure_id = 'SUCUCySysOrganizationalStructure20181127000036'
					and cy_sys_organizational_structure_point_id in ('SUCUCySysOrganizationalStructurePoint20181127000095')
				) b on a.t_test002_create_user = b.cy_sys_base_user_id  
 			where t_test002_is_delete = '0'  and b.cy_sys_base_user_id is not null limit 1,100			 
	