package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu05button0010005")
public class CySysBlockSucu05button0010005 {
    @Id
    @Column(name = "cy_sys_block_sucu05button0010005_id")
    private String cySysBlockSucu05button0010005Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu05button0010005_name")
    private String cySysBlockSucu05button0010005Name;

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
    @Column(name = "cy_sys_block_sucu05button0010005_create_time")
    private Date cySysBlockSucu05button0010005CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu05button0010005_create_user")
    private String cySysBlockSucu05button0010005CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu05button0010005_modify_time")
    private Date cySysBlockSucu05button0010005ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu05button0010005_modify_user")
    private String cySysBlockSucu05button0010005ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu05button0010005_is_delete")
    private String cySysBlockSucu05button0010005IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu05button0010005_column_simple_json")
    private String cySysBlockSucu05button0010005ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu05button0010005_column_detail_json")
    private String cySysBlockSucu05button0010005ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu05button0010005_code")
    private String cySysBlockSucu05button0010005Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu05button0010005_json_code")
    private String cySysBlockSucu05button0010005JsonCode;

    /**
     * @return cy_sys_block_sucu05button0010005_id
     */
    public String getCySysBlockSucu05button0010005Id() {
        return cySysBlockSucu05button0010005Id;
    }

    /**
     * @param cySysBlockSucu05button0010005Id
     */
    public void setCySysBlockSucu05button0010005Id(String cySysBlockSucu05button0010005Id) {
        this.cySysBlockSucu05button0010005Id = cySysBlockSucu05button0010005Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu05button0010005_name - 积木名称
     */
    public String getCySysBlockSucu05button0010005Name() {
        return cySysBlockSucu05button0010005Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu05button0010005Name 积木名称
     */
    public void setCySysBlockSucu05button0010005Name(String cySysBlockSucu05button0010005Name) {
        this.cySysBlockSucu05button0010005Name = cySysBlockSucu05button0010005Name;
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
     * @return cy_sys_block_sucu05button0010005_create_time - 创建时间
     */
    public Date getCySysBlockSucu05button0010005CreateTime() {
        return cySysBlockSucu05button0010005CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu05button0010005CreateTime 创建时间
     */
    public void setCySysBlockSucu05button0010005CreateTime(Date cySysBlockSucu05button0010005CreateTime) {
        this.cySysBlockSucu05button0010005CreateTime = cySysBlockSucu05button0010005CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu05button0010005_create_user - 创建人
     */
    public String getCySysBlockSucu05button0010005CreateUser() {
        return cySysBlockSucu05button0010005CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu05button0010005CreateUser 创建人
     */
    public void setCySysBlockSucu05button0010005CreateUser(String cySysBlockSucu05button0010005CreateUser) {
        this.cySysBlockSucu05button0010005CreateUser = cySysBlockSucu05button0010005CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu05button0010005_modify_time - 更新时间
     */
    public Date getCySysBlockSucu05button0010005ModifyTime() {
        return cySysBlockSucu05button0010005ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu05button0010005ModifyTime 更新时间
     */
    public void setCySysBlockSucu05button0010005ModifyTime(Date cySysBlockSucu05button0010005ModifyTime) {
        this.cySysBlockSucu05button0010005ModifyTime = cySysBlockSucu05button0010005ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu05button0010005_modify_user - 更新人
     */
    public String getCySysBlockSucu05button0010005ModifyUser() {
        return cySysBlockSucu05button0010005ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu05button0010005ModifyUser 更新人
     */
    public void setCySysBlockSucu05button0010005ModifyUser(String cySysBlockSucu05button0010005ModifyUser) {
        this.cySysBlockSucu05button0010005ModifyUser = cySysBlockSucu05button0010005ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu05button0010005_is_delete - 是否删除
     */
    public String getCySysBlockSucu05button0010005IsDelete() {
        return cySysBlockSucu05button0010005IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu05button0010005IsDelete 是否删除
     */
    public void setCySysBlockSucu05button0010005IsDelete(String cySysBlockSucu05button0010005IsDelete) {
        this.cySysBlockSucu05button0010005IsDelete = cySysBlockSucu05button0010005IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu05button0010005_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu05button0010005ColumnSimpleJson() {
        return cySysBlockSucu05button0010005ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu05button0010005ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu05button0010005ColumnSimpleJson(String cySysBlockSucu05button0010005ColumnSimpleJson) {
        this.cySysBlockSucu05button0010005ColumnSimpleJson = cySysBlockSucu05button0010005ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu05button0010005_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu05button0010005ColumnDetailJson() {
        return cySysBlockSucu05button0010005ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu05button0010005ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu05button0010005ColumnDetailJson(String cySysBlockSucu05button0010005ColumnDetailJson) {
        this.cySysBlockSucu05button0010005ColumnDetailJson = cySysBlockSucu05button0010005ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu05button0010005_code - 积木代码信息
     */
    public String getCySysBlockSucu05button0010005Code() {
        return cySysBlockSucu05button0010005Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu05button0010005Code 积木代码信息
     */
    public void setCySysBlockSucu05button0010005Code(String cySysBlockSucu05button0010005Code) {
        this.cySysBlockSucu05button0010005Code = cySysBlockSucu05button0010005Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu05button0010005_json_code - 还原场景信息
     */
    public String getCySysBlockSucu05button0010005JsonCode() {
        return cySysBlockSucu05button0010005JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu05button0010005JsonCode 还原场景信息
     */
    public void setCySysBlockSucu05button0010005JsonCode(String cySysBlockSucu05button0010005JsonCode) {
        this.cySysBlockSucu05button0010005JsonCode = cySysBlockSucu05button0010005JsonCode;
    }
}