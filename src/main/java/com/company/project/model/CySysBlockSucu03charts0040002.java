package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu03charts0040002")
public class CySysBlockSucu03charts0040002 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu03charts0040002_id")
    private String cySysBlockSucu03charts0040002Id;

    /**
     * 名称
     */
    @Column(name = "cy_sys_block_sucu03charts0040002_name")
    private String cySysBlockSucu03charts0040002Name;

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
    @Column(name = "cy_sys_block_sucu03charts0040002_is_delete")
    private String cySysBlockSucu03charts0040002IsDelete;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu03charts0040002_create_user")
    private String cySysBlockSucu03charts0040002CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu03charts0040002_modify_user")
    private String cySysBlockSucu03charts0040002ModifyUser;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu03charts0040002_create_time")
    private Date cySysBlockSucu03charts0040002CreateTime;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu03charts0040002_modify_time")
    private Date cySysBlockSucu03charts0040002ModifyTime;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu03charts0040002_column_simple_json")
    private String cySysBlockSucu03charts0040002ColumnSimpleJson;

    /**
     * 数据详细数组
     */
    @Column(name = "cy_sys_block_sucu03charts0040002_column_detail_json")
    private String cySysBlockSucu03charts0040002ColumnDetailJson;

    /**
     * 代码信息
     */
    @Column(name = "cy_sys_block_sucu03charts0040002_code")
    private String cySysBlockSucu03charts0040002Code;

    /**
     * 详细json代码
     */
    @Column(name = "cy_sys_block_sucu03charts0040002_json_code")
    private String cySysBlockSucu03charts0040002JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu03charts0040002_id - 编号
     */
    public String getCySysBlockSucu03charts0040002Id() {
        return cySysBlockSucu03charts0040002Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu03charts0040002Id 编号
     */
    public void setCySysBlockSucu03charts0040002Id(String cySysBlockSucu03charts0040002Id) {
        this.cySysBlockSucu03charts0040002Id = cySysBlockSucu03charts0040002Id;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_block_sucu03charts0040002_name - 名称
     */
    public String getCySysBlockSucu03charts0040002Name() {
        return cySysBlockSucu03charts0040002Name;
    }

    /**
     * 设置名称
     *
     * @param cySysBlockSucu03charts0040002Name 名称
     */
    public void setCySysBlockSucu03charts0040002Name(String cySysBlockSucu03charts0040002Name) {
        this.cySysBlockSucu03charts0040002Name = cySysBlockSucu03charts0040002Name;
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
     * @return cy_sys_block_sucu03charts0040002_is_delete - 是否删除
     */
    public String getCySysBlockSucu03charts0040002IsDelete() {
        return cySysBlockSucu03charts0040002IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu03charts0040002IsDelete 是否删除
     */
    public void setCySysBlockSucu03charts0040002IsDelete(String cySysBlockSucu03charts0040002IsDelete) {
        this.cySysBlockSucu03charts0040002IsDelete = cySysBlockSucu03charts0040002IsDelete;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu03charts0040002_create_user - 创建人
     */
    public String getCySysBlockSucu03charts0040002CreateUser() {
        return cySysBlockSucu03charts0040002CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu03charts0040002CreateUser 创建人
     */
    public void setCySysBlockSucu03charts0040002CreateUser(String cySysBlockSucu03charts0040002CreateUser) {
        this.cySysBlockSucu03charts0040002CreateUser = cySysBlockSucu03charts0040002CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu03charts0040002_modify_user - 更新人
     */
    public String getCySysBlockSucu03charts0040002ModifyUser() {
        return cySysBlockSucu03charts0040002ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu03charts0040002ModifyUser 更新人
     */
    public void setCySysBlockSucu03charts0040002ModifyUser(String cySysBlockSucu03charts0040002ModifyUser) {
        this.cySysBlockSucu03charts0040002ModifyUser = cySysBlockSucu03charts0040002ModifyUser;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu03charts0040002_create_time - 创建时间
     */
    public Date getCySysBlockSucu03charts0040002CreateTime() {
        return cySysBlockSucu03charts0040002CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu03charts0040002CreateTime 创建时间
     */
    public void setCySysBlockSucu03charts0040002CreateTime(Date cySysBlockSucu03charts0040002CreateTime) {
        this.cySysBlockSucu03charts0040002CreateTime = cySysBlockSucu03charts0040002CreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu03charts0040002_modify_time - 更新时间
     */
    public Date getCySysBlockSucu03charts0040002ModifyTime() {
        return cySysBlockSucu03charts0040002ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu03charts0040002ModifyTime 更新时间
     */
    public void setCySysBlockSucu03charts0040002ModifyTime(Date cySysBlockSucu03charts0040002ModifyTime) {
        this.cySysBlockSucu03charts0040002ModifyTime = cySysBlockSucu03charts0040002ModifyTime;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu03charts0040002_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu03charts0040002ColumnSimpleJson() {
        return cySysBlockSucu03charts0040002ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu03charts0040002ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu03charts0040002ColumnSimpleJson(String cySysBlockSucu03charts0040002ColumnSimpleJson) {
        this.cySysBlockSucu03charts0040002ColumnSimpleJson = cySysBlockSucu03charts0040002ColumnSimpleJson;
    }

    /**
     * 获取数据详细数组
     *
     * @return cy_sys_block_sucu03charts0040002_column_detail_json - 数据详细数组
     */
    public String getCySysBlockSucu03charts0040002ColumnDetailJson() {
        return cySysBlockSucu03charts0040002ColumnDetailJson;
    }

    /**
     * 设置数据详细数组
     *
     * @param cySysBlockSucu03charts0040002ColumnDetailJson 数据详细数组
     */
    public void setCySysBlockSucu03charts0040002ColumnDetailJson(String cySysBlockSucu03charts0040002ColumnDetailJson) {
        this.cySysBlockSucu03charts0040002ColumnDetailJson = cySysBlockSucu03charts0040002ColumnDetailJson;
    }

    /**
     * 获取代码信息
     *
     * @return cy_sys_block_sucu03charts0040002_code - 代码信息
     */
    public String getCySysBlockSucu03charts0040002Code() {
        return cySysBlockSucu03charts0040002Code;
    }

    /**
     * 设置代码信息
     *
     * @param cySysBlockSucu03charts0040002Code 代码信息
     */
    public void setCySysBlockSucu03charts0040002Code(String cySysBlockSucu03charts0040002Code) {
        this.cySysBlockSucu03charts0040002Code = cySysBlockSucu03charts0040002Code;
    }

    /**
     * 获取详细json代码
     *
     * @return cy_sys_block_sucu03charts0040002_json_code - 详细json代码
     */
    public String getCySysBlockSucu03charts0040002JsonCode() {
        return cySysBlockSucu03charts0040002JsonCode;
    }

    /**
     * 设置详细json代码
     *
     * @param cySysBlockSucu03charts0040002JsonCode 详细json代码
     */
    public void setCySysBlockSucu03charts0040002JsonCode(String cySysBlockSucu03charts0040002JsonCode) {
        this.cySysBlockSucu03charts0040002JsonCode = cySysBlockSucu03charts0040002JsonCode;
    }
}