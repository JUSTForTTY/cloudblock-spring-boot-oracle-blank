package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_layout")
public class CySysLayout {
    /**
     * 布局编号
     */
    @Id
    @Column(name = "cy_sys_layout_id")
    private String id;

    /**
     * 布局内部编码
     */
    @Column(name = "cy_sys_layout_code")
    private String cySysLayoutCode;

    /**
     * 布局名称
     */
    @Column(name = "cy_sys_layout_name")
    private String content;

    /**
     * 布局等级
     */
    @Column(name = "cy_sys_layout_level")
    private String cySysLayoutLevel;

    /**
     * 布局分类编号
     */
    @Column(name = "cy_sys_layout_category_id")
    private String cySysLayoutCategoryId;

    /**
     * 布局分类名称
     */
    @Column(name = "cy_sys_layout_category_name")
    private String cySysLayoutCategoryName;

    /**
     * 配置面板类名
     */
    @Column(name = "cy_sys_layout_configuration_panel_classname")
    private String righthtmlcode;

    /**
     * 影响允许
     */
    @Column(name = "cy_sys_layout_effectAllowed")
    private String effectAllowed;

    /**
     * 是否允许拖拽
     */
    @Column(name = "cy_sys_layout_disable")
    private Boolean disable;

    /**
     * 处理
     */
    @Column(name = "cy_sys_layout_handle")
    private Boolean cySysLayoutHandle;

    /**
     * 布局块数据容器
     */
    @Column(name = "cy_sys_layout_layoutdata")
    private String layoutdata;

    /**
     * icon图标
     */
    @Column(name = "cy_sys_layout_sparecolumn1")
    private String icon;

    /**
     * 生成类型
     */
    @Column(name = "cy_sys_layout_sparecolumn2")
    private String cySysLayoutSparecolumn2;

    /**
     * 布局版本
     */
    @Column(name = "cy_sys_layout_version")
    private String cySysLayoutVersion;

    /**
     * 布局来源
     */
    @Column(name = "cy_sys_layout_resource")
    private String cySysLayoutResource;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_layout_create_time")
    private Date cySysLayoutCreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_layout_create_user")
    private String cySysLayoutCreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_layout_modify_time")
    private Date cySysLayoutModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_layout_modify_user")
    private String cySysLayoutModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_layout_is_delete")
    private String cySysLayoutIsDelete;

    /**
     * 布局源码
     */
    @Column(name = "cy_sys_layout_html_code")
    private String blockPageCode;

    /**
     * 布局拖拽代码
     */
    @Column(name = "cy_sys_layout_html_drop_code")
    private String htmlcode;

    /**
     * 拖拽配置
     */
    @Column(name = "cy_sys_layout_drahset")
    private String dragSet;

    /**
     * 布局默认配置
     */
    @Column(name = "cy_sys_layout_sets")
    private String sets;

    @Transient
	private String blocktype="layout";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCySysLayoutCode() {
		return cySysLayoutCode;
	}

	public void setCySysLayoutCode(String cySysLayoutCode) {
		this.cySysLayoutCode = cySysLayoutCode;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCySysLayoutLevel() {
		return cySysLayoutLevel;
	}

	public void setCySysLayoutLevel(String cySysLayoutLevel) {
		this.cySysLayoutLevel = cySysLayoutLevel;
	}

	public String getCySysLayoutCategoryId() {
		return cySysLayoutCategoryId;
	}

	public void setCySysLayoutCategoryId(String cySysLayoutCategoryId) {
		this.cySysLayoutCategoryId = cySysLayoutCategoryId;
	}

	public String getCySysLayoutCategoryName() {
		return cySysLayoutCategoryName;
	}

	public void setCySysLayoutCategoryName(String cySysLayoutCategoryName) {
		this.cySysLayoutCategoryName = cySysLayoutCategoryName;
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

	public Boolean getCySysLayoutHandle() {
		return cySysLayoutHandle;
	}

	public void setCySysLayoutHandle(Boolean cySysLayoutHandle) {
		this.cySysLayoutHandle = cySysLayoutHandle;
	}

	public String getLayoutdata() {
		return layoutdata;
	}

	public void setLayoutdata(String layoutdata) {
		this.layoutdata = layoutdata;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getCySysLayoutSparecolumn2() {
		return cySysLayoutSparecolumn2;
	}

	public void setCySysLayoutSparecolumn2(String cySysLayoutSparecolumn2) {
		this.cySysLayoutSparecolumn2 = cySysLayoutSparecolumn2;
	}

	public String getCySysLayoutVersion() {
		return cySysLayoutVersion;
	}

	public void setCySysLayoutVersion(String cySysLayoutVersion) {
		this.cySysLayoutVersion = cySysLayoutVersion;
	}

	public String getCySysLayoutResource() {
		return cySysLayoutResource;
	}

	public void setCySysLayoutResource(String cySysLayoutResource) {
		this.cySysLayoutResource = cySysLayoutResource;
	}

	public Date getCySysLayoutCreateTime() {
		return cySysLayoutCreateTime;
	}

	public void setCySysLayoutCreateTime(Date cySysLayoutCreateTime) {
		this.cySysLayoutCreateTime = cySysLayoutCreateTime;
	}

	public String getCySysLayoutCreateUser() {
		return cySysLayoutCreateUser;
	}

	public void setCySysLayoutCreateUser(String cySysLayoutCreateUser) {
		this.cySysLayoutCreateUser = cySysLayoutCreateUser;
	}

	public Date getCySysLayoutModifyTime() {
		return cySysLayoutModifyTime;
	}

	public void setCySysLayoutModifyTime(Date cySysLayoutModifyTime) {
		this.cySysLayoutModifyTime = cySysLayoutModifyTime;
	}

	public String getCySysLayoutModifyUser() {
		return cySysLayoutModifyUser;
	}

	public void setCySysLayoutModifyUser(String cySysLayoutModifyUser) {
		this.cySysLayoutModifyUser = cySysLayoutModifyUser;
	}

	public String getCySysLayoutIsDelete() {
		return cySysLayoutIsDelete;
	}

	public void setCySysLayoutIsDelete(String cySysLayoutIsDelete) {
		this.cySysLayoutIsDelete = cySysLayoutIsDelete;
	}

	public String getBlockPageCode() {
		return blockPageCode;
	}

	public void setBlockPageCode(String blockPageCode) {
		this.blockPageCode = blockPageCode;
	}

	public String getHtmlcode() {
		return htmlcode;
	}

	public void setHtmlcode(String htmlcode) {
		this.htmlcode = htmlcode;
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

	public String getBlocktype() {
		return blocktype;
	}

	public void setBlocktype(String blocktype) {
		this.blocktype = blocktype;
	}
    
}