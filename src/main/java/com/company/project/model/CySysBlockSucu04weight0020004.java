package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu04weight0020004")
public class CySysBlockSucu04weight0020004 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu04weight0020004_id")
    private String cySysBlockSucu04weight0020004Id;

    /**
     * 名称
     */
    @Column(name = "cy_sys_block_sucu04weight0020004_name")
    private String cySysBlockSucu04weight0020004Name;

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
    @Column(name = "cy_sys_block_sucu04weight0020004_is_delete")
    private String cySysBlockSucu04weight0020004IsDelete;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu04weight0020004_create_user")
    private String cySysBlockSucu04weight0020004CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu04weight0020004_modify_user")
    private String cySysBlockSucu04weight0020004ModifyUser;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu04weight0020004_create_time")
    private Date cySysBlockSucu04weight0020004CreateTime;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu04weight0020004_modify_time")
    private Date cySysBlockSucu04weight0020004ModifyTime;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu04weight0020004_column_simple_json")
    private String cySysBlockSucu04weight0020004ColumnSimpleJson;

    /**
     * 数据详细数组
     */
    @Column(name = "cy_sys_block_sucu04weight0020004_column_detail_json")
    private String cySysBlockSucu04weight0020004ColumnDetailJson;

    /**
     * 代码信息
     */
    @Column(name = "cy_sys_block_sucu04weight0020004_code")
    private String cySysBlockSucu04weight0020004Code;

    /**
     * 详细json代码
     */
    @Column(name = "cy_sys_block_sucu04weight0020004_json_code")
    private String cySysBlockSucu04weight0020004JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu04weight0020004_id - 编号
     */
    public String getCySysBlockSucu04weight0020004Id() {
        return cySysBlockSucu04weight0020004Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu04weight0020004Id 编号
     */
    public void setCySysBlockSucu04weight0020004Id(String cySysBlockSucu04weight0020004Id) {
        this.cySysBlockSucu04weight0020004Id = cySysBlockSucu04weight0020004Id;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_block_sucu04weight0020004_name - 名称
     */
    public String getCySysBlockSucu04weight0020004Name() {
        return cySysBlockSucu04weight0020004Name;
    }

    /**
     * 设置名称
     *
     * @param cySysBlockSucu04weight0020004Name 名称
     */
    public void setCySysBlockSucu04weight0020004Name(String cySysBlockSucu04weight0020004Name) {
        this.cySysBlockSucu04weight0020004Name = cySysBlockSucu04weight0020004Name;
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
     * @return cy_sys_block_sucu04weight0020004_is_delete - 是否删除
     */
    public String getCySysBlockSucu04weight0020004IsDelete() {
        return cySysBlockSucu04weight0020004IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu04weight0020004IsDelete 是否删除
     */
    public void setCySysBlockSucu04weight0020004IsDelete(String cySysBlockSucu04weight0020004IsDelete) {
        this.cySysBlockSucu04weight0020004IsDelete = cySysBlockSucu04weight0020004IsDelete;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu04weight0020004_create_user - 创建人
     */
    public String getCySysBlockSucu04weight0020004CreateUser() {
        return cySysBlockSucu04weight0020004CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu04weight0020004CreateUser 创建人
     */
    public void setCySysBlockSucu04weight0020004CreateUser(String cySysBlockSucu04weight0020004CreateUser) {
        this.cySysBlockSucu04weight0020004CreateUser = cySysBlockSucu04weight0020004CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu04weight0020004_modify_user - 更新人
     */
    public String getCySysBlockSucu04weight0020004ModifyUser() {
        return cySysBlockSucu04weight0020004ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu04weight0020004ModifyUser 更新人
     */
    public void setCySysBlockSucu04weight0020004ModifyUser(String cySysBlockSucu04weight0020004ModifyUser) {
        this.cySysBlockSucu04weight0020004ModifyUser = cySysBlockSucu04weight0020004ModifyUser;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu04weight0020004_create_time - 创建时间
     */
    public Date getCySysBlockSucu04weight0020004CreateTime() {
        return cySysBlockSucu04weight0020004CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu04weight0020004CreateTime 创建时间
     */
    public void setCySysBlockSucu04weight0020004CreateTime(Date cySysBlockSucu04weight0020004CreateTime) {
        this.cySysBlockSucu04weight0020004CreateTime = cySysBlockSucu04weight0020004CreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu04weight0020004_modify_time - 更新时间
     */
    public Date getCySysBlockSucu04weight0020004ModifyTime() {
        return cySysBlockSucu04weight0020004ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu04weight0020004ModifyTime 更新时间
     */
    public void setCySysBlockSucu04weight0020004ModifyTime(Date cySysBlockSucu04weight0020004ModifyTime) {
        this.cySysBlockSucu04weight0020004ModifyTime = cySysBlockSucu04weight0020004ModifyTime;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu04weight0020004_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu04weight0020004ColumnSimpleJson() {
        return cySysBlockSucu04weight0020004ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu04weight0020004ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu04weight0020004ColumnSimpleJson(String cySysBlockSucu04weight0020004ColumnSimpleJson) {
        this.cySysBlockSucu04weight0020004ColumnSimpleJson = cySysBlockSucu04weight0020004ColumnSimpleJson;
    }

    /**
     * 获取数据详细数组
     *
     * @return cy_sys_block_sucu04weight0020004_column_detail_json - 数据详细数组
     */
    public String getCySysBlockSucu04weight0020004ColumnDetailJson() {
        return cySysBlockSucu04weight0020004ColumnDetailJson;
    }

    /**
     * 设置数据详细数组
     *
     * @param cySysBlockSucu04weight0020004ColumnDetailJson 数据详细数组
     */
    public void setCySysBlockSucu04weight0020004ColumnDetailJson(String cySysBlockSucu04weight0020004ColumnDetailJson) {
        this.cySysBlockSucu04weight0020004ColumnDetailJson = cySysBlockSucu04weight0020004ColumnDetailJson;
    }

    /**
     * 获取代码信息
     *
     * @return cy_sys_block_sucu04weight0020004_code - 代码信息
     */
    public String getCySysBlockSucu04weight0020004Code() {
        return cySysBlockSucu04weight0020004Code;
    }

    /**
     * 设置代码信息
     *
     * @param cySysBlockSucu04weight0020004Code 代码信息
     */
    public void setCySysBlockSucu04weight0020004Code(String cySysBlockSucu04weight0020004Code) {
        this.cySysBlockSucu04weight0020004Code = cySysBlockSucu04weight0020004Code;
    }

    /**
     * 获取详细json代码
     *
     * @return cy_sys_block_sucu04weight0020004_json_code - 详细json代码
     */
    public String getCySysBlockSucu04weight0020004JsonCode() {
        return cySysBlockSucu04weight0020004JsonCode;
    }

    /**
     * 设置详细json代码
     *
     * @param cySysBlockSucu04weight0020004JsonCode 详细json代码
     */
    public void setCySysBlockSucu04weight0020004JsonCode(String cySysBlockSucu04weight0020004JsonCode) {
        this.cySysBlockSucu04weight0020004JsonCode = cySysBlockSucu04weight0020004JsonCode;
    }
}