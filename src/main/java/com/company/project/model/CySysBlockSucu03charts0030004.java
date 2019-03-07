package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu03charts0030004")
public class CySysBlockSucu03charts0030004 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu03charts0030004_id")
    private String cySysBlockSucu03charts0030004Id;

    /**
     * 名称
     */
    @Column(name = "cy_sys_block_sucu03charts0030004_name")
    private String cySysBlockSucu03charts0030004Name;

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
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu03charts0030004_is_delete")
    private String cySysBlockSucu03charts0030004IsDelete;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu03charts0030004_create_user")
    private String cySysBlockSucu03charts0030004CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu03charts0030004_modify_user")
    private String cySysBlockSucu03charts0030004ModifyUser;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu03charts0030004_create_time")
    private Date cySysBlockSucu03charts0030004CreateTime;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu03charts0030004_modify_time")
    private Date cySysBlockSucu03charts0030004ModifyTime;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu03charts0030004_column_simple_json")
    private String cySysBlockSucu03charts0030004ColumnSimpleJson;

    /**
     * 数据详细数组
     */
    @Column(name = "cy_sys_block_sucu03charts0030004_column_detail_json")
    private String cySysBlockSucu03charts0030004ColumnDetailJson;

    /**
     * 代码信息
     */
    @Column(name = "cy_sys_block_sucu03charts0030004_code")
    private String cySysBlockSucu03charts0030004Code;

    /**
     * 详细json代码
     */
    @Column(name = "cy_sys_block_sucu03charts0030004_json_code")
    private String cySysBlockSucu03charts0030004JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu03charts0030004_id - 编号
     */
    public String getCySysBlockSucu03charts0030004Id() {
        return cySysBlockSucu03charts0030004Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu03charts0030004Id 编号
     */
    public void setCySysBlockSucu03charts0030004Id(String cySysBlockSucu03charts0030004Id) {
        this.cySysBlockSucu03charts0030004Id = cySysBlockSucu03charts0030004Id;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_block_sucu03charts0030004_name - 名称
     */
    public String getCySysBlockSucu03charts0030004Name() {
        return cySysBlockSucu03charts0030004Name;
    }

    /**
     * 设置名称
     *
     * @param cySysBlockSucu03charts0030004Name 名称
     */
    public void setCySysBlockSucu03charts0030004Name(String cySysBlockSucu03charts0030004Name) {
        this.cySysBlockSucu03charts0030004Name = cySysBlockSucu03charts0030004Name;
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
     * 获取是否删除
     *
     * @return cy_sys_block_sucu03charts0030004_is_delete - 是否删除
     */
    public String getCySysBlockSucu03charts0030004IsDelete() {
        return cySysBlockSucu03charts0030004IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu03charts0030004IsDelete 是否删除
     */
    public void setCySysBlockSucu03charts0030004IsDelete(String cySysBlockSucu03charts0030004IsDelete) {
        this.cySysBlockSucu03charts0030004IsDelete = cySysBlockSucu03charts0030004IsDelete;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu03charts0030004_create_user - 创建人
     */
    public String getCySysBlockSucu03charts0030004CreateUser() {
        return cySysBlockSucu03charts0030004CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu03charts0030004CreateUser 创建人
     */
    public void setCySysBlockSucu03charts0030004CreateUser(String cySysBlockSucu03charts0030004CreateUser) {
        this.cySysBlockSucu03charts0030004CreateUser = cySysBlockSucu03charts0030004CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu03charts0030004_modify_user - 更新人
     */
    public String getCySysBlockSucu03charts0030004ModifyUser() {
        return cySysBlockSucu03charts0030004ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu03charts0030004ModifyUser 更新人
     */
    public void setCySysBlockSucu03charts0030004ModifyUser(String cySysBlockSucu03charts0030004ModifyUser) {
        this.cySysBlockSucu03charts0030004ModifyUser = cySysBlockSucu03charts0030004ModifyUser;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu03charts0030004_create_time - 创建时间
     */
    public Date getCySysBlockSucu03charts0030004CreateTime() {
        return cySysBlockSucu03charts0030004CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu03charts0030004CreateTime 创建时间
     */
    public void setCySysBlockSucu03charts0030004CreateTime(Date cySysBlockSucu03charts0030004CreateTime) {
        this.cySysBlockSucu03charts0030004CreateTime = cySysBlockSucu03charts0030004CreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu03charts0030004_modify_time - 更新时间
     */
    public Date getCySysBlockSucu03charts0030004ModifyTime() {
        return cySysBlockSucu03charts0030004ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu03charts0030004ModifyTime 更新时间
     */
    public void setCySysBlockSucu03charts0030004ModifyTime(Date cySysBlockSucu03charts0030004ModifyTime) {
        this.cySysBlockSucu03charts0030004ModifyTime = cySysBlockSucu03charts0030004ModifyTime;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu03charts0030004_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu03charts0030004ColumnSimpleJson() {
        return cySysBlockSucu03charts0030004ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu03charts0030004ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu03charts0030004ColumnSimpleJson(String cySysBlockSucu03charts0030004ColumnSimpleJson) {
        this.cySysBlockSucu03charts0030004ColumnSimpleJson = cySysBlockSucu03charts0030004ColumnSimpleJson;
    }

    /**
     * 获取数据详细数组
     *
     * @return cy_sys_block_sucu03charts0030004_column_detail_json - 数据详细数组
     */
    public String getCySysBlockSucu03charts0030004ColumnDetailJson() {
        return cySysBlockSucu03charts0030004ColumnDetailJson;
    }

    /**
     * 设置数据详细数组
     *
     * @param cySysBlockSucu03charts0030004ColumnDetailJson 数据详细数组
     */
    public void setCySysBlockSucu03charts0030004ColumnDetailJson(String cySysBlockSucu03charts0030004ColumnDetailJson) {
        this.cySysBlockSucu03charts0030004ColumnDetailJson = cySysBlockSucu03charts0030004ColumnDetailJson;
    }

    /**
     * 获取代码信息
     *
     * @return cy_sys_block_sucu03charts0030004_code - 代码信息
     */
    public String getCySysBlockSucu03charts0030004Code() {
        return cySysBlockSucu03charts0030004Code;
    }

    /**
     * 设置代码信息
     *
     * @param cySysBlockSucu03charts0030004Code 代码信息
     */
    public void setCySysBlockSucu03charts0030004Code(String cySysBlockSucu03charts0030004Code) {
        this.cySysBlockSucu03charts0030004Code = cySysBlockSucu03charts0030004Code;
    }

    /**
     * 获取详细json代码
     *
     * @return cy_sys_block_sucu03charts0030004_json_code - 详细json代码
     */
    public String getCySysBlockSucu03charts0030004JsonCode() {
        return cySysBlockSucu03charts0030004JsonCode;
    }

    /**
     * 设置详细json代码
     *
     * @param cySysBlockSucu03charts0030004JsonCode 详细json代码
     */
    public void setCySysBlockSucu03charts0030004JsonCode(String cySysBlockSucu03charts0030004JsonCode) {
        this.cySysBlockSucu03charts0030004JsonCode = cySysBlockSucu03charts0030004JsonCode;
    }
}