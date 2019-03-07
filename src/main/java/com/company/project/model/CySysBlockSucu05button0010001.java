package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu05button0010001")
public class CySysBlockSucu05button0010001 {
    @Id
    @Column(name = "cy_sys_block_sucu05button0010001_id")
    private String cySysBlockSucu05button0010001Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu05button0010001_name")
    private String cySysBlockSucu05button0010001Name;

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
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu05button0010001_column_simple_json")
    private String cySysBlockSucu05button0010001ColumnSimpleJson;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu05button0010001_create_time")
    private Date cySysBlockSucu05button0010001CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu05button0010001_create_user")
    private String cySysBlockSucu05button0010001CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu05button0010001_modify_time")
    private Date cySysBlockSucu05button0010001ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu05button0010001_modify_user")
    private String cySysBlockSucu05button0010001ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu05button0010001_is_delete")
    private String cySysBlockSucu05button0010001IsDelete;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu05button0010001_column_detail_json")
    private String cySysBlockSucu05button0010001ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu05button0010001_code")
    private String cySysBlockSucu05button0010001Code;

    /**
     * 指向选择器
     */
    @Column(name = "cy_sys_block_sucu05button0010001_json_code")
    private String cySysBlockSucu05button0010001JsonCode;

    /**
     * @return cy_sys_block_sucu05button0010001_id
     */
    public String getCySysBlockSucu05button0010001Id() {
        return cySysBlockSucu05button0010001Id;
    }

    /**
     * @param cySysBlockSucu05button0010001Id
     */
    public void setCySysBlockSucu05button0010001Id(String cySysBlockSucu05button0010001Id) {
        this.cySysBlockSucu05button0010001Id = cySysBlockSucu05button0010001Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu05button0010001_name - 积木名称
     */
    public String getCySysBlockSucu05button0010001Name() {
        return cySysBlockSucu05button0010001Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu05button0010001Name 积木名称
     */
    public void setCySysBlockSucu05button0010001Name(String cySysBlockSucu05button0010001Name) {
        this.cySysBlockSucu05button0010001Name = cySysBlockSucu05button0010001Name;
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
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu05button0010001_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu05button0010001ColumnSimpleJson() {
        return cySysBlockSucu05button0010001ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu05button0010001ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu05button0010001ColumnSimpleJson(String cySysBlockSucu05button0010001ColumnSimpleJson) {
        this.cySysBlockSucu05button0010001ColumnSimpleJson = cySysBlockSucu05button0010001ColumnSimpleJson;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu05button0010001_create_time - 创建时间
     */
    public Date getCySysBlockSucu05button0010001CreateTime() {
        return cySysBlockSucu05button0010001CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu05button0010001CreateTime 创建时间
     */
    public void setCySysBlockSucu05button0010001CreateTime(Date cySysBlockSucu05button0010001CreateTime) {
        this.cySysBlockSucu05button0010001CreateTime = cySysBlockSucu05button0010001CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu05button0010001_create_user - 创建人
     */
    public String getCySysBlockSucu05button0010001CreateUser() {
        return cySysBlockSucu05button0010001CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu05button0010001CreateUser 创建人
     */
    public void setCySysBlockSucu05button0010001CreateUser(String cySysBlockSucu05button0010001CreateUser) {
        this.cySysBlockSucu05button0010001CreateUser = cySysBlockSucu05button0010001CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu05button0010001_modify_time - 更新时间
     */
    public Date getCySysBlockSucu05button0010001ModifyTime() {
        return cySysBlockSucu05button0010001ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu05button0010001ModifyTime 更新时间
     */
    public void setCySysBlockSucu05button0010001ModifyTime(Date cySysBlockSucu05button0010001ModifyTime) {
        this.cySysBlockSucu05button0010001ModifyTime = cySysBlockSucu05button0010001ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu05button0010001_modify_user - 更新人
     */
    public String getCySysBlockSucu05button0010001ModifyUser() {
        return cySysBlockSucu05button0010001ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu05button0010001ModifyUser 更新人
     */
    public void setCySysBlockSucu05button0010001ModifyUser(String cySysBlockSucu05button0010001ModifyUser) {
        this.cySysBlockSucu05button0010001ModifyUser = cySysBlockSucu05button0010001ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu05button0010001_is_delete - 是否删除
     */
    public String getCySysBlockSucu05button0010001IsDelete() {
        return cySysBlockSucu05button0010001IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu05button0010001IsDelete 是否删除
     */
    public void setCySysBlockSucu05button0010001IsDelete(String cySysBlockSucu05button0010001IsDelete) {
        this.cySysBlockSucu05button0010001IsDelete = cySysBlockSucu05button0010001IsDelete;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu05button0010001_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu05button0010001ColumnDetailJson() {
        return cySysBlockSucu05button0010001ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu05button0010001ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu05button0010001ColumnDetailJson(String cySysBlockSucu05button0010001ColumnDetailJson) {
        this.cySysBlockSucu05button0010001ColumnDetailJson = cySysBlockSucu05button0010001ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu05button0010001_code - 积木代码信息
     */
    public String getCySysBlockSucu05button0010001Code() {
        return cySysBlockSucu05button0010001Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu05button0010001Code 积木代码信息
     */
    public void setCySysBlockSucu05button0010001Code(String cySysBlockSucu05button0010001Code) {
        this.cySysBlockSucu05button0010001Code = cySysBlockSucu05button0010001Code;
    }

    /**
     * 获取指向选择器
     *
     * @return cy_sys_block_sucu05button0010001_json_code - 指向选择器
     */
    public String getCySysBlockSucu05button0010001JsonCode() {
        return cySysBlockSucu05button0010001JsonCode;
    }

    /**
     * 设置指向选择器
     *
     * @param cySysBlockSucu05button0010001JsonCode 指向选择器
     */
    public void setCySysBlockSucu05button0010001JsonCode(String cySysBlockSucu05button0010001JsonCode) {
        this.cySysBlockSucu05button0010001JsonCode = cySysBlockSucu05button0010001JsonCode;
    }
}