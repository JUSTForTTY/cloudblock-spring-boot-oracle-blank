package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block")
public class CySysBlock {
    /**
     * 积木编号
     */
    @Id
    @Column(name = "cy_sys_block_id")
    private String id;

    /**
     * 积木内部编码
     */
    @Column(name = "cy_sys_block_code")
    private String cySysBlockCode;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_name")
    private String content;

    /**
     * 积木等级
     */
    @Column(name = "cy_sys_block_level")
    private String cySysBlockLevel;

    /**
     * 积木分类编号
     */
    @Column(name = "cy_sys_block_category_id")
    private String cySysBlockCategoryId;

    /**
     * 积木分类名称
     */
    @Column(name = "cy_sys_block_category_name")
    private String cySysBlockCategoryName;

    /**
     * 积木实例表
     */
    @Column(name = "cy_sys_block_runtime_table")
    private String cySysBlockRuntimeTable;

    /**
     * 积木拖拽代码
     */
    @Column(name = "cy_sys_block_html_drop_code")
    private String htmlcode;

    /**
     * 配置面板类名
     */
    @Column(name = "cy_sys_block_configuration_panel_classname")
    private String righthtmlcode;

    /**
     * 影响允许
     */
    @Column(name = "cy_sys_block_effectAllowed")
    private String effectAllowed;

    /**
     * 是否允许拖拽
     */
    @Column(name = "cy_sys_block_disable")
    private Boolean disable;

    /**
     * 处理
     */
    @Column(name = "cy_sys_block_handle")
    private Boolean handle;

    /**
     * icon图标
     */
    @Column(name = "cy_sys_block_sparecolumn1")
    private String icon;

    /**
     * 备用字段2
     */
    @Column(name = "cy_sys_block_sparecolumn2")
    private String cySysBlockSparecolumn2;

    /**
     * 积木版本
     */
    @Column(name = "cy_sys_block_version")
    private String cySysBlockVersion;

    /**
     * 积木来源
     */
    @Column(name = "cy_sys_block_resource")
    private String cySysBlockResource;

    /**
     * 排序
     */
    @Column(name = "cy_sys_block_sort")
    private Integer cySysBlockSort;

    /**
     * 数据bean名称
     */
    @Column(name = "cy_sys_block_beanname")
    private String cySysBlockBeanname;

    /**
     * 是否需要接口辅助
     */
    @Column(name = "cy_sys_block_is_needapi")
    private String cySysBlockIsNeedapi;

    /**
     * 接口代码模板
     */
    @Column(name = "cy_sys_block_codetemplate")
    private String cySysBlockCodetemplate;

    /**
     * 主分类（英文）
     */
    @Column(name = "cy_sys_main_category_name")
    private String cySysMainCategoryName;

    /**
     * 子类别名称
     */
    @Column(name = "cy_sys_sub_category_name")
    private String cySysSubCategoryName;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_create_time")
    private Date cySysBlockCreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_create_user")
    private String cySysBlockCreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_modify_time")
    private Date cySysBlockModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_modify_user")
    private String cySysBlockModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_is_delete")
    private String cySysBlockIsDelete;

    /**
     * 积木源码
     */
    @Column(name = "cy_sys_block_html_code")
    private String blockPageCode;

    /**
     * 拖拽配置
     */
    @Column(name = "cy_sys_block_drahset")
    private String dragSet;

    /**
     * 积木默认配置
     */
    @Column(name = "cy_sys_block_sets")
    private String sets;

    /**
     * 默认数据
     */
    @Column(name = "cy_sys_block_dateset")
    private String cySysBlockDateset;

    /**
     * 默认方法
     */
    @Column(name = "cy_sys_block_functions")
    private String cySysBlockFunctions;

    /**
     * 通用接口地址
     */
    @Column(name = "cy_sys_block_commonapi")
    private String cySysBlockCommonapi;

     

    /**
     * 获取积木内部编码
     *
     * @return cy_sys_block_code - 积木内部编码
     */
    public String getCySysBlockCode() {
        return cySysBlockCode;
    }

    /**
     * 设置积木内部编码
     *
     * @param cySysBlockCode 积木内部编码
     */
    public void setCySysBlockCode(String cySysBlockCode) {
        this.cySysBlockCode = cySysBlockCode;
    }

     

    /**
     * 获取积木等级
     *
     * @return cy_sys_block_level - 积木等级
     */
    public String getCySysBlockLevel() {
        return cySysBlockLevel;
    }

    /**
     * 设置积木等级
     *
     * @param cySysBlockLevel 积木等级
     */
    public void setCySysBlockLevel(String cySysBlockLevel) {
        this.cySysBlockLevel = cySysBlockLevel;
    }

    /**
     * 获取积木分类编号
     *
     * @return cy_sys_block_category_id - 积木分类编号
     */
    public String getCySysBlockCategoryId() {
        return cySysBlockCategoryId;
    }

    /**
     * 设置积木分类编号
     *
     * @param cySysBlockCategoryId 积木分类编号
     */
    public void setCySysBlockCategoryId(String cySysBlockCategoryId) {
        this.cySysBlockCategoryId = cySysBlockCategoryId;
    }

    /**
     * 获取积木分类名称
     *
     * @return cy_sys_block_category_name - 积木分类名称
     */
    public String getCySysBlockCategoryName() {
        return cySysBlockCategoryName;
    }

    /**
     * 设置积木分类名称
     *
     * @param cySysBlockCategoryName 积木分类名称
     */
    public void setCySysBlockCategoryName(String cySysBlockCategoryName) {
        this.cySysBlockCategoryName = cySysBlockCategoryName;
    }

    /**
     * 获取积木实例表
     *
     * @return cy_sys_block_runtime_table - 积木实例表
     */
    public String getCySysBlockRuntimeTable() {
        return cySysBlockRuntimeTable;
    }

    /**
     * 设置积木实例表
     *
     * @param cySysBlockRuntimeTable 积木实例表
     */
    public void setCySysBlockRuntimeTable(String cySysBlockRuntimeTable) {
        this.cySysBlockRuntimeTable = cySysBlockRuntimeTable;
    }

     
     

    /**
     * 获取备用字段2
     *
     * @return cy_sys_block_sparecolumn2 - 备用字段2
     */
    public String getCySysBlockSparecolumn2() {
        return cySysBlockSparecolumn2;
    }

    /**
     * 设置备用字段2
     *
     * @param cySysBlockSparecolumn2 备用字段2
     */
    public void setCySysBlockSparecolumn2(String cySysBlockSparecolumn2) {
        this.cySysBlockSparecolumn2 = cySysBlockSparecolumn2;
    }

    /**
     * 获取积木版本
     *
     * @return cy_sys_block_version - 积木版本
     */
    public String getCySysBlockVersion() {
        return cySysBlockVersion;
    }

    /**
     * 设置积木版本
     *
     * @param cySysBlockVersion 积木版本
     */
    public void setCySysBlockVersion(String cySysBlockVersion) {
        this.cySysBlockVersion = cySysBlockVersion;
    }

    /**
     * 获取积木来源
     *
     * @return cy_sys_block_resource - 积木来源
     */
    public String getCySysBlockResource() {
        return cySysBlockResource;
    }

    /**
     * 设置积木来源
     *
     * @param cySysBlockResource 积木来源
     */
    public void setCySysBlockResource(String cySysBlockResource) {
        this.cySysBlockResource = cySysBlockResource;
    }

    /**
     * 获取排序
     *
     * @return cy_sys_block_sort - 排序
     */
    public Integer getCySysBlockSort() {
        return cySysBlockSort;
    }

    /**
     * 设置排序
     *
     * @param cySysBlockSort 排序
     */
    public void setCySysBlockSort(Integer cySysBlockSort) {
        this.cySysBlockSort = cySysBlockSort;
    }

    /**
     * 获取数据bean名称
     *
     * @return cy_sys_block_beanname - 数据bean名称
     */
    public String getCySysBlockBeanname() {
        return cySysBlockBeanname;
    }

    /**
     * 设置数据bean名称
     *
     * @param cySysBlockBeanname 数据bean名称
     */
    public void setCySysBlockBeanname(String cySysBlockBeanname) {
        this.cySysBlockBeanname = cySysBlockBeanname;
    }

    /**
     * 获取是否需要接口辅助
     *
     * @return cy_sys_block_is_needapi - 是否需要接口辅助
     */
    public String getCySysBlockIsNeedapi() {
        return cySysBlockIsNeedapi;
    }

    /**
     * 设置是否需要接口辅助
     *
     * @param cySysBlockIsNeedapi 是否需要接口辅助
     */
    public void setCySysBlockIsNeedapi(String cySysBlockIsNeedapi) {
        this.cySysBlockIsNeedapi = cySysBlockIsNeedapi;
    }

    /**
     * 获取接口代码模板
     *
     * @return cy_sys_block_codetemplate - 接口代码模板
     */
    public String getCySysBlockCodetemplate() {
        return cySysBlockCodetemplate;
    }

    /**
     * 设置接口代码模板
     *
     * @param cySysBlockCodetemplate 接口代码模板
     */
    public void setCySysBlockCodetemplate(String cySysBlockCodetemplate) {
        this.cySysBlockCodetemplate = cySysBlockCodetemplate;
    }

    /**
     * 获取主分类（英文）
     *
     * @return cy_sys_main_category_name - 主分类（英文）
     */
    public String getCySysMainCategoryName() {
        return cySysMainCategoryName;
    }

    /**
     * 设置主分类（英文）
     *
     * @param cySysMainCategoryName 主分类（英文）
     */
    public void setCySysMainCategoryName(String cySysMainCategoryName) {
        this.cySysMainCategoryName = cySysMainCategoryName;
    }

    /**
     * 获取子类别名称
     *
     * @return cy_sys_sub_category_name - 子类别名称
     */
    public String getCySysSubCategoryName() {
        return cySysSubCategoryName;
    }

    /**
     * 设置子类别名称
     *
     * @param cySysSubCategoryName 子类别名称
     */
    public void setCySysSubCategoryName(String cySysSubCategoryName) {
        this.cySysSubCategoryName = cySysSubCategoryName;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_create_time - 创建时间
     */
    public Date getCySysBlockCreateTime() {
        return cySysBlockCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockCreateTime 创建时间
     */
    public void setCySysBlockCreateTime(Date cySysBlockCreateTime) {
        this.cySysBlockCreateTime = cySysBlockCreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_create_user - 创建人
     */
    public String getCySysBlockCreateUser() {
        return cySysBlockCreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockCreateUser 创建人
     */
    public void setCySysBlockCreateUser(String cySysBlockCreateUser) {
        this.cySysBlockCreateUser = cySysBlockCreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_modify_time - 更新时间
     */
    public Date getCySysBlockModifyTime() {
        return cySysBlockModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockModifyTime 更新时间
     */
    public void setCySysBlockModifyTime(Date cySysBlockModifyTime) {
        this.cySysBlockModifyTime = cySysBlockModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_modify_user - 更新人
     */
    public String getCySysBlockModifyUser() {
        return cySysBlockModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockModifyUser 更新人
     */
    public void setCySysBlockModifyUser(String cySysBlockModifyUser) {
        this.cySysBlockModifyUser = cySysBlockModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_is_delete - 是否删除
     */
    public String getCySysBlockIsDelete() {
        return cySysBlockIsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockIsDelete 是否删除
     */
    public void setCySysBlockIsDelete(String cySysBlockIsDelete) {
        this.cySysBlockIsDelete = cySysBlockIsDelete;
    }

    

    /**
     * 获取默认数据
     *
     * @return cy_sys_block_dateset - 默认数据
     */
    public String getCySysBlockDateset() {
        return cySysBlockDateset;
    }

    /**
     * 设置默认数据
     *
     * @param cySysBlockDateset 默认数据
     */
    public void setCySysBlockDateset(String cySysBlockDateset) {
        this.cySysBlockDateset = cySysBlockDateset;
    }

    /**
     * 获取默认方法
     *
     * @return cy_sys_block_functions - 默认方法
     */
    public String getCySysBlockFunctions() {
        return cySysBlockFunctions;
    }

    /**
     * 设置默认方法
     *
     * @param cySysBlockFunctions 默认方法
     */
    public void setCySysBlockFunctions(String cySysBlockFunctions) {
        this.cySysBlockFunctions = cySysBlockFunctions;
    }

    /**
     * 获取通用接口地址
     *
     * @return cy_sys_block_commonapi - 通用接口地址
     */
    public String getCySysBlockCommonapi() {
        return cySysBlockCommonapi;
    }

    /**
     * 设置通用接口地址
     *
     * @param cySysBlockCommonapi 通用接口地址
     */
    public void setCySysBlockCommonapi(String cySysBlockCommonapi) {
        this.cySysBlockCommonapi = cySysBlockCommonapi;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getHtmlcode() {
		return htmlcode;
	}

	public void setHtmlcode(String htmlcode) {
		this.htmlcode = htmlcode;
	}

	public String getRighthtmlcode() {
		return righthtmlcode;
	}

	public void setRighthtmlcode(String righthtmlcode) {
		this.righthtmlcode = righthtmlcode;
	}

	public String getEffectAllowed() {
		return effectAllowed;
	}

	public void setEffectAllowed(String effectAllowed) {
		this.effectAllowed = effectAllowed;
	}

	public Boolean getDisable() {
		return disable;
	}

	public void setDisable(Boolean disable) {
		this.disable = disable;
	}

	public Boolean getHandle() {
		return handle;
	}

	public void setHandle(Boolean handle) {
		this.handle = handle;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getBlockPageCode() {
		return blockPageCode;
	}

	public void setBlockPageCode(String blockPageCode) {
		this.blockPageCode = blockPageCode;
	}

	public String getDragSet() {
		return dragSet;
	}

	public void setDragSet(String dragSet) {
		this.dragSet = dragSet;
	}

	public String getSets() {
		return sets;
	}

	public void setSets(String sets) {
		this.sets = sets;
	}
    
}