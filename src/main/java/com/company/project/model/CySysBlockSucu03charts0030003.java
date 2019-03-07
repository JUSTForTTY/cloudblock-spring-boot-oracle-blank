package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu03charts0030003")
public class CySysBlockSucu03charts0030003 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu03charts0030003_id")
    private String cySysBlockSucu03charts0030003Id;

    /**
     * 名称
     */
    @Column(name = "cy_sys_block_sucu03charts0030003_name")
    private String cySysBlockSucu03charts0030003Name;

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
    @Column(name = "cy_sys_block_sucu03charts0030003_is_delete")
    private String cySysBlockSucu03charts0030003IsDelete;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu03charts0030003_create_user")
    private String cySysBlockSucu03charts0030003CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu03charts0030003_modify_user")
    private String cySysBlockSucu03charts0030003ModifyUser;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu03charts0030003_create_time")
    private Date cySysBlockSucu03charts0030003CreateTime;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu03charts0030003_modify_time")
    private Date cySysBlockSucu03charts0030003ModifyTime;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu03charts0030003_column_simple_json")
    private String cySysBlockSucu03charts0030003ColumnSimpleJson;

    /**
     * 数据详细数组
     */
    @Column(name = "cy_sys_block_sucu03charts0030003_column_detail_json")
    private String cySysBlockSucu03charts0030003ColumnDetailJson;

    /**
     * 代码信息
     */
    @Column(name = "cy_sys_block_sucu03charts0030003_code")
    private String cySysBlockSucu03charts0030003Code;

    /**
     * 详细json代码
     */
    @Column(name = "cy_sys_block_sucu03charts0030003_json_code")
    private String cySysBlockSucu03charts0030003JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu03charts0030003_id - 编号
     */
    public String getCySysBlockSucu03charts0030003Id() {
        return cySysBlockSucu03charts0030003Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu03charts0030003Id 编号
     */
    public void setCySysBlockSucu03charts0030003Id(String cySysBlockSucu03charts0030003Id) {
        this.cySysBlockSucu03charts0030003Id = cySysBlockSucu03charts0030003Id;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_block_sucu03charts0030003_name - 名称
     */
    public String getCySysBlockSucu03charts0030003Name() {
        return cySysBlockSucu03charts0030003Name;
    }

    /**
     * 设置名称
     *
     * @param cySysBlockSucu03charts0030003Name 名称
     */
    public void setCySysBlockSucu03charts0030003Name(String cySysBlockSucu03charts0030003Name) {
        this.cySysBlockSucu03charts0030003Name = cySysBlockSucu03charts0030003Name;
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
     * @return cy_sys_block_sucu03charts0030003_is_delete - 是否删除
     */
    public String getCySysBlockSucu03charts0030003IsDelete() {
        return cySysBlockSucu03charts0030003IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu03charts0030003IsDelete 是否删除
     */
    public void setCySysBlockSucu03charts0030003IsDelete(String cySysBlockSucu03charts0030003IsDelete) {
        this.cySysBlockSucu03charts0030003IsDelete = cySysBlockSucu03charts0030003IsDelete;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu03charts0030003_create_user - 创建人
     */
    public String getCySysBlockSucu03charts0030003CreateUser() {
        return cySysBlockSucu03charts0030003CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu03charts0030003CreateUser 创建人
     */
    public void setCySysBlockSucu03charts0030003CreateUser(String cySysBlockSucu03charts0030003CreateUser) {
        this.cySysBlockSucu03charts0030003CreateUser = cySysBlockSucu03charts0030003CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu03charts0030003_modify_user - 更新人
     */
    public String getCySysBlockSucu03charts0030003ModifyUser() {
        return cySysBlockSucu03charts0030003ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu03charts0030003ModifyUser 更新人
     */
    public void setCySysBlockSucu03charts0030003ModifyUser(String cySysBlockSucu03charts0030003ModifyUser) {
        this.cySysBlockSucu03charts0030003ModifyUser = cySysBlockSucu03charts0030003ModifyUser;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu03charts0030003_create_time - 创建时间
     */
    public Date getCySysBlockSucu03charts0030003CreateTime() {
        return cySysBlockSucu03charts0030003CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu03charts0030003CreateTime 创建时间
     */
    public void setCySysBlockSucu03charts0030003CreateTime(Date cySysBlockSucu03charts0030003CreateTime) {
        this.cySysBlockSucu03charts0030003CreateTime = cySysBlockSucu03charts0030003CreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu03charts0030003_modify_time - 更新时间
     */
    public Date getCySysBlockSucu03charts0030003ModifyTime() {
        return cySysBlockSucu03charts0030003ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu03charts0030003ModifyTime 更新时间
     */
    public void setCySysBlockSucu03charts0030003ModifyTime(Date cySysBlockSucu03charts0030003ModifyTime) {
        this.cySysBlockSucu03charts0030003ModifyTime = cySysBlockSucu03charts0030003ModifyTime;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu03charts0030003_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu03charts0030003ColumnSimpleJson() {
        return cySysBlockSucu03charts0030003ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu03charts0030003ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu03charts0030003ColumnSimpleJson(String cySysBlockSucu03charts0030003ColumnSimpleJson) {
        this.cySysBlockSucu03charts0030003ColumnSimpleJson = cySysBlockSucu03charts0030003ColumnSimpleJson;
    }

    /**
     * 获取数据详细数组
     *
     * @return cy_sys_block_sucu03charts0030003_column_detail_json - 数据详细数组
     */
    public String getCySysBlockSucu03charts0030003ColumnDetailJson() {
        return cySysBlockSucu03charts0030003ColumnDetailJson;
    }

    /**
     * 设置数据详细数组
     *
     * @param cySysBlockSucu03charts0030003ColumnDetailJson 数据详细数组
     */
    public void setCySysBlockSucu03charts0030003ColumnDetailJson(String cySysBlockSucu03charts0030003ColumnDetailJson) {
        this.cySysBlockSucu03charts0030003ColumnDetailJson = cySysBlockSucu03charts0030003ColumnDetailJson;
    }

    /**
     * 获取代码信息
     *
     * @return cy_sys_block_sucu03charts0030003_code - 代码信息
     */
    public String getCySysBlockSucu03charts0030003Code() {
        return cySysBlockSucu03charts0030003Code;
    }

    /**
     * 设置代码信息
     *
     * @param cySysBlockSucu03charts0030003Code 代码信息
     */
    public void setCySysBlockSucu03charts0030003Code(String cySysBlockSucu03charts0030003Code) {
        this.cySysBlockSucu03charts0030003Code = cySysBlockSucu03charts0030003Code;
    }

    /**
     * 获取详细json代码
     *
     * @return cy_sys_block_sucu03charts0030003_json_code - 详细json代码
     */
    public String getCySysBlockSucu03charts0030003JsonCode() {
        return cySysBlockSucu03charts0030003JsonCode;
    }

    /**
     * 设置详细json代码
     *
     * @param cySysBlockSucu03charts0030003JsonCode 详细json代码
     */
    public void setCySysBlockSucu03charts0030003JsonCode(String cySysBlockSucu03charts0030003JsonCode) {
        this.cySysBlockSucu03charts0030003JsonCode = cySysBlockSucu03charts0030003JsonCode;
    }
}