package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu05button0020003")
public class CySysBlockSucu05button0020003 {
    @Id
    @Column(name = "cy_sys_block_sucu05button0020003_id")
    private String cySysBlockSucu05button0020003Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu05button0020003_name")
    private String cySysBlockSucu05button0020003Name;

    /**
     * 积木编号
     */
    @Column(name = "cy_sys_block_id")
    private String cySysBlockId;

    /**
     * 积木数据表编号
     */
    @Column(name = "cy_sys_view_explain_id")
    private String cySysViewExplainId;

    /**
     * 积木数据表
     */
    @Column(name = "cy_sys_view_explain_name")
    private String cySysViewExplainName;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu05button0020003_create_time")
    private Date cySysBlockSucu05button0020003CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu05button0020003_create_user")
    private String cySysBlockSucu05button0020003CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu05button0020003_modify_time")
    private Date cySysBlockSucu05button0020003ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu05button0020003_modify_user")
    private String cySysBlockSucu05button0020003ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu05button0020003_is_delete")
    private String cySysBlockSucu05button0020003IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu05button0020003_column_simple_json")
    private String cySysBlockSucu05button0020003ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu05button0020003_column_detail_json")
    private String cySysBlockSucu05button0020003ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu05button0020003_code")
    private String cySysBlockSucu05button0020003Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu05button0020003_json_code")
    private String cySysBlockSucu05button0020003JsonCode;

    /**
     * @return cy_sys_block_sucu05button0020003_id
     */
    public String getCySysBlockSucu05button0020003Id() {
        return cySysBlockSucu05button0020003Id;
    }

    /**
     * @param cySysBlockSucu05button0020003Id
     */
    public void setCySysBlockSucu05button0020003Id(String cySysBlockSucu05button0020003Id) {
        this.cySysBlockSucu05button0020003Id = cySysBlockSucu05button0020003Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu05button0020003_name - 积木名称
     */
    public String getCySysBlockSucu05button0020003Name() {
        return cySysBlockSucu05button0020003Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu05button0020003Name 积木名称
     */
    public void setCySysBlockSucu05button0020003Name(String cySysBlockSucu05button0020003Name) {
        this.cySysBlockSucu05button0020003Name = cySysBlockSucu05button0020003Name;
    }

    /**
     * 获取积木编号
     *
     * @return cy_sys_block_id - 积木编号
     */
    public String getCySysBlockId() {
        return cySysBlockId;
    }

    /**
     * 设置积木编号
     *
     * @param cySysBlockId 积木编号
     */
    public void setCySysBlockId(String cySysBlockId) {
        this.cySysBlockId = cySysBlockId;
    }

    /**
     * 获取积木数据表编号
     *
     * @return cy_sys_view_explain_id - 积木数据表编号
     */
    public String getCySysViewExplainId() {
        return cySysViewExplainId;
    }

    /**
     * 设置积木数据表编号
     *
     * @param cySysViewExplainId 积木数据表编号
     */
    public void setCySysViewExplainId(String cySysViewExplainId) {
        this.cySysViewExplainId = cySysViewExplainId;
    }

    /**
     * 获取积木数据表
     *
     * @return cy_sys_view_explain_name - 积木数据表
     */
    public String getCySysViewExplainName() {
        return cySysViewExplainName;
    }

    /**
     * 设置积木数据表
     *
     * @param cySysViewExplainName 积木数据表
     */
    public void setCySysViewExplainName(String cySysViewExplainName) {
        this.cySysViewExplainName = cySysViewExplainName;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu05button0020003_create_time - 创建时间
     */
    public Date getCySysBlockSucu05button0020003CreateTime() {
        return cySysBlockSucu05button0020003CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu05button0020003CreateTime 创建时间
     */
    public void setCySysBlockSucu05button0020003CreateTime(Date cySysBlockSucu05button0020003CreateTime) {
        this.cySysBlockSucu05button0020003CreateTime = cySysBlockSucu05button0020003CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu05button0020003_create_user - 创建人
     */
    public String getCySysBlockSucu05button0020003CreateUser() {
        return cySysBlockSucu05button0020003CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu05button0020003CreateUser 创建人
     */
    public void setCySysBlockSucu05button0020003CreateUser(String cySysBlockSucu05button0020003CreateUser) {
        this.cySysBlockSucu05button0020003CreateUser = cySysBlockSucu05button0020003CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu05button0020003_modify_time - 更新时间
     */
    public Date getCySysBlockSucu05button0020003ModifyTime() {
        return cySysBlockSucu05button0020003ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu05button0020003ModifyTime 更新时间
     */
    public void setCySysBlockSucu05button0020003ModifyTime(Date cySysBlockSucu05button0020003ModifyTime) {
        this.cySysBlockSucu05button0020003ModifyTime = cySysBlockSucu05button0020003ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu05button0020003_modify_user - 更新人
     */
    public String getCySysBlockSucu05button0020003ModifyUser() {
        return cySysBlockSucu05button0020003ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu05button0020003ModifyUser 更新人
     */
    public void setCySysBlockSucu05button0020003ModifyUser(String cySysBlockSucu05button0020003ModifyUser) {
        this.cySysBlockSucu05button0020003ModifyUser = cySysBlockSucu05button0020003ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu05button0020003_is_delete - 是否删除
     */
    public String getCySysBlockSucu05button0020003IsDelete() {
        return cySysBlockSucu05button0020003IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu05button0020003IsDelete 是否删除
     */
    public void setCySysBlockSucu05button0020003IsDelete(String cySysBlockSucu05button0020003IsDelete) {
        this.cySysBlockSucu05button0020003IsDelete = cySysBlockSucu05button0020003IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu05button0020003_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu05button0020003ColumnSimpleJson() {
        return cySysBlockSucu05button0020003ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu05button0020003ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu05button0020003ColumnSimpleJson(String cySysBlockSucu05button0020003ColumnSimpleJson) {
        this.cySysBlockSucu05button0020003ColumnSimpleJson = cySysBlockSucu05button0020003ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu05button0020003_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu05button0020003ColumnDetailJson() {
        return cySysBlockSucu05button0020003ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu05button0020003ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu05button0020003ColumnDetailJson(String cySysBlockSucu05button0020003ColumnDetailJson) {
        this.cySysBlockSucu05button0020003ColumnDetailJson = cySysBlockSucu05button0020003ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu05button0020003_code - 积木代码信息
     */
    public String getCySysBlockSucu05button0020003Code() {
        return cySysBlockSucu05button0020003Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu05button0020003Code 积木代码信息
     */
    public void setCySysBlockSucu05button0020003Code(String cySysBlockSucu05button0020003Code) {
        this.cySysBlockSucu05button0020003Code = cySysBlockSucu05button0020003Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu05button0020003_json_code - 还原场景信息
     */
    public String getCySysBlockSucu05button0020003JsonCode() {
        return cySysBlockSucu05button0020003JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu05button0020003JsonCode 还原场景信息
     */
    public void setCySysBlockSucu05button0020003JsonCode(String cySysBlockSucu05button0020003JsonCode) {
        this.cySysBlockSucu05button0020003JsonCode = cySysBlockSucu05button0020003JsonCode;
    }
}