package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu05button0010004")
public class CySysBlockSucu05button0010004 {
    @Id
    @Column(name = "cy_sys_block_sucu05button0010004_id")
    private String cySysBlockSucu05button0010004Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu05button0010004_name")
    private String cySysBlockSucu05button0010004Name;

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
    @Column(name = "cy_sys_block_sucu05button0010004_create_time")
    private Date cySysBlockSucu05button0010004CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu05button0010004_create_user")
    private String cySysBlockSucu05button0010004CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu05button0010004_modify_time")
    private Date cySysBlockSucu05button0010004ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu05button0010004_modify_user")
    private String cySysBlockSucu05button0010004ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu05button0010004_is_delete")
    private String cySysBlockSucu05button0010004IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu05button0010004_column_simple_json")
    private String cySysBlockSucu05button0010004ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu05button0010004_column_detail_json")
    private String cySysBlockSucu05button0010004ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu05button0010004_code")
    private String cySysBlockSucu05button0010004Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu05button0010004_json_code")
    private String cySysBlockSucu05button0010004JsonCode;

    /**
     * @return cy_sys_block_sucu05button0010004_id
     */
    public String getCySysBlockSucu05button0010004Id() {
        return cySysBlockSucu05button0010004Id;
    }

    /**
     * @param cySysBlockSucu05button0010004Id
     */
    public void setCySysBlockSucu05button0010004Id(String cySysBlockSucu05button0010004Id) {
        this.cySysBlockSucu05button0010004Id = cySysBlockSucu05button0010004Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu05button0010004_name - 积木名称
     */
    public String getCySysBlockSucu05button0010004Name() {
        return cySysBlockSucu05button0010004Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu05button0010004Name 积木名称
     */
    public void setCySysBlockSucu05button0010004Name(String cySysBlockSucu05button0010004Name) {
        this.cySysBlockSucu05button0010004Name = cySysBlockSucu05button0010004Name;
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
     * @return cy_sys_block_sucu05button0010004_create_time - 创建时间
     */
    public Date getCySysBlockSucu05button0010004CreateTime() {
        return cySysBlockSucu05button0010004CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu05button0010004CreateTime 创建时间
     */
    public void setCySysBlockSucu05button0010004CreateTime(Date cySysBlockSucu05button0010004CreateTime) {
        this.cySysBlockSucu05button0010004CreateTime = cySysBlockSucu05button0010004CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu05button0010004_create_user - 创建人
     */
    public String getCySysBlockSucu05button0010004CreateUser() {
        return cySysBlockSucu05button0010004CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu05button0010004CreateUser 创建人
     */
    public void setCySysBlockSucu05button0010004CreateUser(String cySysBlockSucu05button0010004CreateUser) {
        this.cySysBlockSucu05button0010004CreateUser = cySysBlockSucu05button0010004CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu05button0010004_modify_time - 更新时间
     */
    public Date getCySysBlockSucu05button0010004ModifyTime() {
        return cySysBlockSucu05button0010004ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu05button0010004ModifyTime 更新时间
     */
    public void setCySysBlockSucu05button0010004ModifyTime(Date cySysBlockSucu05button0010004ModifyTime) {
        this.cySysBlockSucu05button0010004ModifyTime = cySysBlockSucu05button0010004ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu05button0010004_modify_user - 更新人
     */
    public String getCySysBlockSucu05button0010004ModifyUser() {
        return cySysBlockSucu05button0010004ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu05button0010004ModifyUser 更新人
     */
    public void setCySysBlockSucu05button0010004ModifyUser(String cySysBlockSucu05button0010004ModifyUser) {
        this.cySysBlockSucu05button0010004ModifyUser = cySysBlockSucu05button0010004ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu05button0010004_is_delete - 是否删除
     */
    public String getCySysBlockSucu05button0010004IsDelete() {
        return cySysBlockSucu05button0010004IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu05button0010004IsDelete 是否删除
     */
    public void setCySysBlockSucu05button0010004IsDelete(String cySysBlockSucu05button0010004IsDelete) {
        this.cySysBlockSucu05button0010004IsDelete = cySysBlockSucu05button0010004IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu05button0010004_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu05button0010004ColumnSimpleJson() {
        return cySysBlockSucu05button0010004ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu05button0010004ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu05button0010004ColumnSimpleJson(String cySysBlockSucu05button0010004ColumnSimpleJson) {
        this.cySysBlockSucu05button0010004ColumnSimpleJson = cySysBlockSucu05button0010004ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu05button0010004_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu05button0010004ColumnDetailJson() {
        return cySysBlockSucu05button0010004ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu05button0010004ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu05button0010004ColumnDetailJson(String cySysBlockSucu05button0010004ColumnDetailJson) {
        this.cySysBlockSucu05button0010004ColumnDetailJson = cySysBlockSucu05button0010004ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu05button0010004_code - 积木代码信息
     */
    public String getCySysBlockSucu05button0010004Code() {
        return cySysBlockSucu05button0010004Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu05button0010004Code 积木代码信息
     */
    public void setCySysBlockSucu05button0010004Code(String cySysBlockSucu05button0010004Code) {
        this.cySysBlockSucu05button0010004Code = cySysBlockSucu05button0010004Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu05button0010004_json_code - 还原场景信息
     */
    public String getCySysBlockSucu05button0010004JsonCode() {
        return cySysBlockSucu05button0010004JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu05button0010004JsonCode 还原场景信息
     */
    public void setCySysBlockSucu05button0010004JsonCode(String cySysBlockSucu05button0010004JsonCode) {
        this.cySysBlockSucu05button0010004JsonCode = cySysBlockSucu05button0010004JsonCode;
    }
}