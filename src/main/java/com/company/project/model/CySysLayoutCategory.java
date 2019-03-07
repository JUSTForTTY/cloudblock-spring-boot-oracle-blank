package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Table(name = "cy_sys_layout_category")
public class CySysLayoutCategory {
    /**
     * 布局分类表
     */
    @Id
    @Column(name = "cy_sys_layout_category_id")
    private String cySysLayoutCategoryId;

    /**
     * 布局分类名称
     */
    @Column(name = "cy_sys_layout_category_name")
    private String cySysLayoutCategoryName;

    /**
     * 布局分类父类编号
     */
    @Column(name = "cy_sys_layout_category_parent_id")
    private String cySysLayoutCategoryParentId;

    /**
     * 布局使用场景（0：pc管理 1：手机商城 2：pc展示）
     */
    @Column(name = "cy_sys_layout_category_sence")
    private String cySysLayoutCategorySence;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_layout_category_create_time")
    private Date cySysLayoutCategoryCreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_layout_category_create_user")
    private String cySysLayoutCategoryCreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_layout_category_modify_time")
    private Date cySysLayoutCategoryModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_layout_category_modify_user")
    private String cySysLayoutCategoryModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_layout_category_is_delete")
    private String cySysLayoutCategoryIsDelete;

    @Transient
	private List child = new ArrayList();
	
	@Transient
	private Integer index;
    /**
     * 获取布局分类表
     *
     * @return cy_sys_layout_category_id - 布局分类表
     */
    public String getCySysLayoutCategoryId() {
        return cySysLayoutCategoryId;
    }

    /**
     * 设置布局分类表
     *
     * @param cySysLayoutCategoryId 布局分类表
     */
    public void setCySysLayoutCategoryId(String cySysLayoutCategoryId) {
        this.cySysLayoutCategoryId = cySysLayoutCategoryId;
    }

    /**
     * 获取布局分类名称
     *
     * @return cy_sys_layout_category_name - 布局分类名称
     */
    public String getCySysLayoutCategoryName() {
        return cySysLayoutCategoryName;
    }

    /**
     * 设置布局分类名称
     *
     * @param cySysLayoutCategoryName 布局分类名称
     */
    public void setCySysLayoutCategoryName(String cySysLayoutCategoryName) {
        this.cySysLayoutCategoryName = cySysLayoutCategoryName;
    }

    /**
     * 获取布局分类父类编号
     *
     * @return cy_sys_layout_category_parent_id - 布局分类父类编号
     */
    public String getCySysLayoutCategoryParentId() {
        return cySysLayoutCategoryParentId;
    }

    /**
     * 设置布局分类父类编号
     *
     * @param cySysLayoutCategoryParentId 布局分类父类编号
     */
    public void setCySysLayoutCategoryParentId(String cySysLayoutCategoryParentId) {
        this.cySysLayoutCategoryParentId = cySysLayoutCategoryParentId;
    }

    /**
     * 获取布局使用场景（0：pc管理 1：手机商城 2：pc展示）
     *
     * @return cy_sys_layout_category_sence - 布局使用场景（0：pc管理 1：手机商城 2：pc展示）
     */
    public String getCySysLayoutCategorySence() {
        return cySysLayoutCategorySence;
    }

    /**
     * 设置布局使用场景（0：pc管理 1：手机商城 2：pc展示）
     *
     * @param cySysLayoutCategorySence 布局使用场景（0：pc管理 1：手机商城 2：pc展示）
     */
    public void setCySysLayoutCategorySence(String cySysLayoutCategorySence) {
        this.cySysLayoutCategorySence = cySysLayoutCategorySence;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_layout_category_create_time - 创建时间
     */
    public Date getCySysLayoutCategoryCreateTime() {
        return cySysLayoutCategoryCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysLayoutCategoryCreateTime 创建时间
     */
    public void setCySysLayoutCategoryCreateTime(Date cySysLayoutCategoryCreateTime) {
        this.cySysLayoutCategoryCreateTime = cySysLayoutCategoryCreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_layout_category_create_user - 创建人
     */
    public String getCySysLayoutCategoryCreateUser() {
        return cySysLayoutCategoryCreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysLayoutCategoryCreateUser 创建人
     */
    public void setCySysLayoutCategoryCreateUser(String cySysLayoutCategoryCreateUser) {
        this.cySysLayoutCategoryCreateUser = cySysLayoutCategoryCreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_layout_category_modify_time - 更新时间
     */
    public Date getCySysLayoutCategoryModifyTime() {
        return cySysLayoutCategoryModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysLayoutCategoryModifyTime 更新时间
     */
    public void setCySysLayoutCategoryModifyTime(Date cySysLayoutCategoryModifyTime) {
        this.cySysLayoutCategoryModifyTime = cySysLayoutCategoryModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_layout_category_modify_user - 更新人
     */
    public String getCySysLayoutCategoryModifyUser() {
        return cySysLayoutCategoryModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysLayoutCategoryModifyUser 更新人
     */
    public void setCySysLayoutCategoryModifyUser(String cySysLayoutCategoryModifyUser) {
        this.cySysLayoutCategoryModifyUser = cySysLayoutCategoryModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_layout_category_is_delete - 是否删除
     */
    public String getCySysLayoutCategoryIsDelete() {
        return cySysLayoutCategoryIsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysLayoutCategoryIsDelete 是否删除
     */
    public void setCySysLayoutCategoryIsDelete(String cySysLayoutCategoryIsDelete) {
        this.cySysLayoutCategoryIsDelete = cySysLayoutCategoryIsDelete;
    }

	public List getChild() {
		return child;
	}

	public void setChild(List child) {
		this.child = child;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}
    
}