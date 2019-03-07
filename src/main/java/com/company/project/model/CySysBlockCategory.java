package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Table(name = "cy_sys_block_category")
public class CySysBlockCategory {
    /**
     * 积木分类表
     */
    @Id
    @Column(name = "cy_sys_block_category_id")
    private String cySysBlockCategoryId;

    /**
     * 积木分类名称
     */
    @Column(name = "cy_sys_block_category_name")
    private String cySysBlockCategoryName;

    /**
     * 积木分类编号
     */
    @Column(name = "cy_sys_block_category_parent_id")
    private String cySysBlockCategoryParentId;

    /**
     * 积木使用场景（0：pc管理 1：手机商城 2：pc展示）
     */
    @Column(name = "cy_sys_block_category_sence")
    private String cySysBlockCategorySence;

    /**
     * 排序
     */
    @Column(name = "cy_sys_block_category_sort")
    private Integer cySysBlockCategorySort;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_category_create_time")
    private Date cySysBlockCategoryCreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_category_create_user")
    private String cySysBlockCategoryCreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_category_modify_time")
    private Date cySysBlockCategoryModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_category_modify_user")
    private String cySysBlockCategoryModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_category_is_delete")
    private String cySysBlockCategoryIsDelete;

    @Transient
	private List child = new ArrayList();

	@Transient
	private Integer index;
    /**
     * 获取积木分类表
     *
     * @return cy_sys_block_category_id - 积木分类表
     */
    public String getCySysBlockCategoryId() {
        return cySysBlockCategoryId;
    }

    /**
     * 设置积木分类表
     *
     * @param cySysBlockCategoryId 积木分类表
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
     * 获取积木分类编号
     *
     * @return cy_sys_block_category_parent_id - 积木分类编号
     */
    public String getCySysBlockCategoryParentId() {
        return cySysBlockCategoryParentId;
    }

    /**
     * 设置积木分类编号
     *
     * @param cySysBlockCategoryParentId 积木分类编号
     */
    public void setCySysBlockCategoryParentId(String cySysBlockCategoryParentId) {
        this.cySysBlockCategoryParentId = cySysBlockCategoryParentId;
    }

    /**
     * 获取积木使用场景（0：pc管理 1：手机商城 2：pc展示）
     *
     * @return cy_sys_block_category_sence - 积木使用场景（0：pc管理 1：手机商城 2：pc展示）
     */
    public String getCySysBlockCategorySence() {
        return cySysBlockCategorySence;
    }

    /**
     * 设置积木使用场景（0：pc管理 1：手机商城 2：pc展示）
     *
     * @param cySysBlockCategorySence 积木使用场景（0：pc管理 1：手机商城 2：pc展示）
     */
    public void setCySysBlockCategorySence(String cySysBlockCategorySence) {
        this.cySysBlockCategorySence = cySysBlockCategorySence;
    }

    /**
     * 获取排序
     *
     * @return cy_sys_block_category_sort - 排序
     */
    public Integer getCySysBlockCategorySort() {
        return cySysBlockCategorySort;
    }

    /**
     * 设置排序
     *
     * @param cySysBlockCategorySort 排序
     */
    public void setCySysBlockCategorySort(Integer cySysBlockCategorySort) {
        this.cySysBlockCategorySort = cySysBlockCategorySort;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_category_create_time - 创建时间
     */
    public Date getCySysBlockCategoryCreateTime() {
        return cySysBlockCategoryCreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockCategoryCreateTime 创建时间
     */
    public void setCySysBlockCategoryCreateTime(Date cySysBlockCategoryCreateTime) {
        this.cySysBlockCategoryCreateTime = cySysBlockCategoryCreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_category_create_user - 创建人
     */
    public String getCySysBlockCategoryCreateUser() {
        return cySysBlockCategoryCreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockCategoryCreateUser 创建人
     */
    public void setCySysBlockCategoryCreateUser(String cySysBlockCategoryCreateUser) {
        this.cySysBlockCategoryCreateUser = cySysBlockCategoryCreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_category_modify_time - 更新时间
     */
    public Date getCySysBlockCategoryModifyTime() {
        return cySysBlockCategoryModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockCategoryModifyTime 更新时间
     */
    public void setCySysBlockCategoryModifyTime(Date cySysBlockCategoryModifyTime) {
        this.cySysBlockCategoryModifyTime = cySysBlockCategoryModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_category_modify_user - 更新人
     */
    public String getCySysBlockCategoryModifyUser() {
        return cySysBlockCategoryModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockCategoryModifyUser 更新人
     */
    public void setCySysBlockCategoryModifyUser(String cySysBlockCategoryModifyUser) {
        this.cySysBlockCategoryModifyUser = cySysBlockCategoryModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_category_is_delete - 是否删除
     */
    public String getCySysBlockCategoryIsDelete() {
        return cySysBlockCategoryIsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockCategoryIsDelete 是否删除
     */
    public void setCySysBlockCategoryIsDelete(String cySysBlockCategoryIsDelete) {
        this.cySysBlockCategoryIsDelete = cySysBlockCategoryIsDelete;
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