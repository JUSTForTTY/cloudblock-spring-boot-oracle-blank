package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu04weight0010005")
public class CySysBlockSucu04weight0010005 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu04weight0010005_id")
    private String cySysBlockSucu04weight0010005Id;

    /**
     * 名称
     */
    @Column(name = "cy_sys_block_sucu04weight0010005_name")
    private String cySysBlockSucu04weight0010005Name;

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
    @Column(name = "cy_sys_block_sucu04weight0010005_is_delete")
    private String cySysBlockSucu04weight0010005IsDelete;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu04weight0010005_create_user")
    private String cySysBlockSucu04weight0010005CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu04weight0010005_modify_user")
    private String cySysBlockSucu04weight0010005ModifyUser;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu04weight0010005_create_time")
    private Date cySysBlockSucu04weight0010005CreateTime;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu04weight0010005_modify_time")
    private Date cySysBlockSucu04weight0010005ModifyTime;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu04weight0010005_column_simple_json")
    private String cySysBlockSucu04weight0010005ColumnSimpleJson;

    /**
     * 数据详细数组
     */
    @Column(name = "cy_sys_block_sucu04weight0010005_column_detail_json")
    private String cySysBlockSucu04weight0010005ColumnDetailJson;

    /**
     * 代码信息
     */
    @Column(name = "cy_sys_block_sucu04weight0010005_code")
    private String cySysBlockSucu04weight0010005Code;

    /**
     * 详细json代码
     */
    @Column(name = "cy_sys_block_sucu04weight0010005_json_code")
    private String cySysBlockSucu04weight0010005JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu04weight0010005_id - 编号
     */
    public String getCySysBlockSucu04weight0010005Id() {
        return cySysBlockSucu04weight0010005Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu04weight0010005Id 编号
     */
    public void setCySysBlockSucu04weight0010005Id(String cySysBlockSucu04weight0010005Id) {
        this.cySysBlockSucu04weight0010005Id = cySysBlockSucu04weight0010005Id;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_block_sucu04weight0010005_name - 名称
     */
    public String getCySysBlockSucu04weight0010005Name() {
        return cySysBlockSucu04weight0010005Name;
    }

    /**
     * 设置名称
     *
     * @param cySysBlockSucu04weight0010005Name 名称
     */
    public void setCySysBlockSucu04weight0010005Name(String cySysBlockSucu04weight0010005Name) {
        this.cySysBlockSucu04weight0010005Name = cySysBlockSucu04weight0010005Name;
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
     * @return cy_sys_block_sucu04weight0010005_is_delete - 是否删除
     */
    public String getCySysBlockSucu04weight0010005IsDelete() {
        return cySysBlockSucu04weight0010005IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu04weight0010005IsDelete 是否删除
     */
    public void setCySysBlockSucu04weight0010005IsDelete(String cySysBlockSucu04weight0010005IsDelete) {
        this.cySysBlockSucu04weight0010005IsDelete = cySysBlockSucu04weight0010005IsDelete;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu04weight0010005_create_user - 创建人
     */
    public String getCySysBlockSucu04weight0010005CreateUser() {
        return cySysBlockSucu04weight0010005CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu04weight0010005CreateUser 创建人
     */
    public void setCySysBlockSucu04weight0010005CreateUser(String cySysBlockSucu04weight0010005CreateUser) {
        this.cySysBlockSucu04weight0010005CreateUser = cySysBlockSucu04weight0010005CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu04weight0010005_modify_user - 更新人
     */
    public String getCySysBlockSucu04weight0010005ModifyUser() {
        return cySysBlockSucu04weight0010005ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu04weight0010005ModifyUser 更新人
     */
    public void setCySysBlockSucu04weight0010005ModifyUser(String cySysBlockSucu04weight0010005ModifyUser) {
        this.cySysBlockSucu04weight0010005ModifyUser = cySysBlockSucu04weight0010005ModifyUser;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu04weight0010005_create_time - 创建时间
     */
    public Date getCySysBlockSucu04weight0010005CreateTime() {
        return cySysBlockSucu04weight0010005CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu04weight0010005CreateTime 创建时间
     */
    public void setCySysBlockSucu04weight0010005CreateTime(Date cySysBlockSucu04weight0010005CreateTime) {
        this.cySysBlockSucu04weight0010005CreateTime = cySysBlockSucu04weight0010005CreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu04weight0010005_modify_time - 更新时间
     */
    public Date getCySysBlockSucu04weight0010005ModifyTime() {
        return cySysBlockSucu04weight0010005ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu04weight0010005ModifyTime 更新时间
     */
    public void setCySysBlockSucu04weight0010005ModifyTime(Date cySysBlockSucu04weight0010005ModifyTime) {
        this.cySysBlockSucu04weight0010005ModifyTime = cySysBlockSucu04weight0010005ModifyTime;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu04weight0010005_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu04weight0010005ColumnSimpleJson() {
        return cySysBlockSucu04weight0010005ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu04weight0010005ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu04weight0010005ColumnSimpleJson(String cySysBlockSucu04weight0010005ColumnSimpleJson) {
        this.cySysBlockSucu04weight0010005ColumnSimpleJson = cySysBlockSucu04weight0010005ColumnSimpleJson;
    }

    /**
     * 获取数据详细数组
     *
     * @return cy_sys_block_sucu04weight0010005_column_detail_json - 数据详细数组
     */
    public String getCySysBlockSucu04weight0010005ColumnDetailJson() {
        return cySysBlockSucu04weight0010005ColumnDetailJson;
    }

    /**
     * 设置数据详细数组
     *
     * @param cySysBlockSucu04weight0010005ColumnDetailJson 数据详细数组
     */
    public void setCySysBlockSucu04weight0010005ColumnDetailJson(String cySysBlockSucu04weight0010005ColumnDetailJson) {
        this.cySysBlockSucu04weight0010005ColumnDetailJson = cySysBlockSucu04weight0010005ColumnDetailJson;
    }

    /**
     * 获取代码信息
     *
     * @return cy_sys_block_sucu04weight0010005_code - 代码信息
     */
    public String getCySysBlockSucu04weight0010005Code() {
        return cySysBlockSucu04weight0010005Code;
    }

    /**
     * 设置代码信息
     *
     * @param cySysBlockSucu04weight0010005Code 代码信息
     */
    public void setCySysBlockSucu04weight0010005Code(String cySysBlockSucu04weight0010005Code) {
        this.cySysBlockSucu04weight0010005Code = cySysBlockSucu04weight0010005Code;
    }

    /**
     * 获取详细json代码
     *
     * @return cy_sys_block_sucu04weight0010005_json_code - 详细json代码
     */
    public String getCySysBlockSucu04weight0010005JsonCode() {
        return cySysBlockSucu04weight0010005JsonCode;
    }

    /**
     * 设置详细json代码
     *
     * @param cySysBlockSucu04weight0010005JsonCode 详细json代码
     */
    public void setCySysBlockSucu04weight0010005JsonCode(String cySysBlockSucu04weight0010005JsonCode) {
        this.cySysBlockSucu04weight0010005JsonCode = cySysBlockSucu04weight0010005JsonCode;
    }
}