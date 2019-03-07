package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu05button0010009")
public class CySysBlockSucu05button0010009 {
    @Id
    @Column(name = "cy_sys_block_sucu05button0010009_id")
    private String cySysBlockSucu05button0010009Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu05button0010009_name")
    private String cySysBlockSucu05button0010009Name;

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
    @Column(name = "cy_sys_block_sucu05button0010009_create_time")
    private Date cySysBlockSucu05button0010009CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu05button0010009_create_user")
    private String cySysBlockSucu05button0010009CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu05button0010009_modify_time")
    private Date cySysBlockSucu05button0010009ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu05button0010009_modify_user")
    private String cySysBlockSucu05button0010009ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu05button0010009_is_delete")
    private String cySysBlockSucu05button0010009IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu05button0010009_column_simple_json")
    private String cySysBlockSucu05button0010009ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu05button0010009_column_detail_json")
    private String cySysBlockSucu05button0010009ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu05button0010009_code")
    private String cySysBlockSucu05button0010009Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu05button0010009_json_code")
    private String cySysBlockSucu05button0010009JsonCode;

    /**
     * @return cy_sys_block_sucu05button0010009_id
     */
    public String getCySysBlockSucu05button0010009Id() {
        return cySysBlockSucu05button0010009Id;
    }

    /**
     * @param cySysBlockSucu05button0010009Id
     */
    public void setCySysBlockSucu05button0010009Id(String cySysBlockSucu05button0010009Id) {
        this.cySysBlockSucu05button0010009Id = cySysBlockSucu05button0010009Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu05button0010009_name - 积木名称
     */
    public String getCySysBlockSucu05button0010009Name() {
        return cySysBlockSucu05button0010009Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu05button0010009Name 积木名称
     */
    public void setCySysBlockSucu05button0010009Name(String cySysBlockSucu05button0010009Name) {
        this.cySysBlockSucu05button0010009Name = cySysBlockSucu05button0010009Name;
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
     * @return cy_sys_block_sucu05button0010009_create_time - 创建时间
     */
    public Date getCySysBlockSucu05button0010009CreateTime() {
        return cySysBlockSucu05button0010009CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu05button0010009CreateTime 创建时间
     */
    public void setCySysBlockSucu05button0010009CreateTime(Date cySysBlockSucu05button0010009CreateTime) {
        this.cySysBlockSucu05button0010009CreateTime = cySysBlockSucu05button0010009CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu05button0010009_create_user - 创建人
     */
    public String getCySysBlockSucu05button0010009CreateUser() {
        return cySysBlockSucu05button0010009CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu05button0010009CreateUser 创建人
     */
    public void setCySysBlockSucu05button0010009CreateUser(String cySysBlockSucu05button0010009CreateUser) {
        this.cySysBlockSucu05button0010009CreateUser = cySysBlockSucu05button0010009CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu05button0010009_modify_time - 更新时间
     */
    public Date getCySysBlockSucu05button0010009ModifyTime() {
        return cySysBlockSucu05button0010009ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu05button0010009ModifyTime 更新时间
     */
    public void setCySysBlockSucu05button0010009ModifyTime(Date cySysBlockSucu05button0010009ModifyTime) {
        this.cySysBlockSucu05button0010009ModifyTime = cySysBlockSucu05button0010009ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu05button0010009_modify_user - 更新人
     */
    public String getCySysBlockSucu05button0010009ModifyUser() {
        return cySysBlockSucu05button0010009ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu05button0010009ModifyUser 更新人
     */
    public void setCySysBlockSucu05button0010009ModifyUser(String cySysBlockSucu05button0010009ModifyUser) {
        this.cySysBlockSucu05button0010009ModifyUser = cySysBlockSucu05button0010009ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu05button0010009_is_delete - 是否删除
     */
    public String getCySysBlockSucu05button0010009IsDelete() {
        return cySysBlockSucu05button0010009IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu05button0010009IsDelete 是否删除
     */
    public void setCySysBlockSucu05button0010009IsDelete(String cySysBlockSucu05button0010009IsDelete) {
        this.cySysBlockSucu05button0010009IsDelete = cySysBlockSucu05button0010009IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu05button0010009_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu05button0010009ColumnSimpleJson() {
        return cySysBlockSucu05button0010009ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu05button0010009ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu05button0010009ColumnSimpleJson(String cySysBlockSucu05button0010009ColumnSimpleJson) {
        this.cySysBlockSucu05button0010009ColumnSimpleJson = cySysBlockSucu05button0010009ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu05button0010009_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu05button0010009ColumnDetailJson() {
        return cySysBlockSucu05button0010009ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu05button0010009ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu05button0010009ColumnDetailJson(String cySysBlockSucu05button0010009ColumnDetailJson) {
        this.cySysBlockSucu05button0010009ColumnDetailJson = cySysBlockSucu05button0010009ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu05button0010009_code - 积木代码信息
     */
    public String getCySysBlockSucu05button0010009Code() {
        return cySysBlockSucu05button0010009Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu05button0010009Code 积木代码信息
     */
    public void setCySysBlockSucu05button0010009Code(String cySysBlockSucu05button0010009Code) {
        this.cySysBlockSucu05button0010009Code = cySysBlockSucu05button0010009Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu05button0010009_json_code - 还原场景信息
     */
    public String getCySysBlockSucu05button0010009JsonCode() {
        return cySysBlockSucu05button0010009JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu05button0010009JsonCode 还原场景信息
     */
    public void setCySysBlockSucu05button0010009JsonCode(String cySysBlockSucu05button0010009JsonCode) {
        this.cySysBlockSucu05button0010009JsonCode = cySysBlockSucu05button0010009JsonCode;
    }
}