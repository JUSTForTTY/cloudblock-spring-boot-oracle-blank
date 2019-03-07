package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu04weight0030007")
public class CySysBlockSucu04weight0030007 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu04weight0030007_id")
    private String cySysBlockSucu04weight0030007Id;

    /**
     * 名称
     */
    @Column(name = "cy_sys_block_sucu04weight0030007_name")
    private String cySysBlockSucu04weight0030007Name;

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
    @Column(name = "cy_sys_block_sucu04weight0030007_is_delete")
    private String cySysBlockSucu04weight0030007IsDelete;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu04weight0030007_create_user")
    private String cySysBlockSucu04weight0030007CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu04weight0030007_modify_user")
    private String cySysBlockSucu04weight0030007ModifyUser;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu04weight0030007_create_time")
    private Date cySysBlockSucu04weight0030007CreateTime;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu04weight0030007_modify_time")
    private Date cySysBlockSucu04weight0030007ModifyTime;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu04weight0030007_column_simple_json")
    private String cySysBlockSucu04weight0030007ColumnSimpleJson;

    /**
     * 数据详细数组
     */
    @Column(name = "cy_sys_block_sucu04weight0030007_column_detail_json")
    private String cySysBlockSucu04weight0030007ColumnDetailJson;

    /**
     * 代码信息
     */
    @Column(name = "cy_sys_block_sucu04weight0030007_code")
    private String cySysBlockSucu04weight0030007Code;

    /**
     * 详细json代码
     */
    @Column(name = "cy_sys_block_sucu04weight0030007_json_code")
    private String cySysBlockSucu04weight0030007JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu04weight0030007_id - 编号
     */
    public String getCySysBlockSucu04weight0030007Id() {
        return cySysBlockSucu04weight0030007Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu04weight0030007Id 编号
     */
    public void setCySysBlockSucu04weight0030007Id(String cySysBlockSucu04weight0030007Id) {
        this.cySysBlockSucu04weight0030007Id = cySysBlockSucu04weight0030007Id;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_block_sucu04weight0030007_name - 名称
     */
    public String getCySysBlockSucu04weight0030007Name() {
        return cySysBlockSucu04weight0030007Name;
    }

    /**
     * 设置名称
     *
     * @param cySysBlockSucu04weight0030007Name 名称
     */
    public void setCySysBlockSucu04weight0030007Name(String cySysBlockSucu04weight0030007Name) {
        this.cySysBlockSucu04weight0030007Name = cySysBlockSucu04weight0030007Name;
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
     * @return cy_sys_block_sucu04weight0030007_is_delete - 是否删除
     */
    public String getCySysBlockSucu04weight0030007IsDelete() {
        return cySysBlockSucu04weight0030007IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu04weight0030007IsDelete 是否删除
     */
    public void setCySysBlockSucu04weight0030007IsDelete(String cySysBlockSucu04weight0030007IsDelete) {
        this.cySysBlockSucu04weight0030007IsDelete = cySysBlockSucu04weight0030007IsDelete;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu04weight0030007_create_user - 创建人
     */
    public String getCySysBlockSucu04weight0030007CreateUser() {
        return cySysBlockSucu04weight0030007CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu04weight0030007CreateUser 创建人
     */
    public void setCySysBlockSucu04weight0030007CreateUser(String cySysBlockSucu04weight0030007CreateUser) {
        this.cySysBlockSucu04weight0030007CreateUser = cySysBlockSucu04weight0030007CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu04weight0030007_modify_user - 更新人
     */
    public String getCySysBlockSucu04weight0030007ModifyUser() {
        return cySysBlockSucu04weight0030007ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu04weight0030007ModifyUser 更新人
     */
    public void setCySysBlockSucu04weight0030007ModifyUser(String cySysBlockSucu04weight0030007ModifyUser) {
        this.cySysBlockSucu04weight0030007ModifyUser = cySysBlockSucu04weight0030007ModifyUser;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu04weight0030007_create_time - 创建时间
     */
    public Date getCySysBlockSucu04weight0030007CreateTime() {
        return cySysBlockSucu04weight0030007CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu04weight0030007CreateTime 创建时间
     */
    public void setCySysBlockSucu04weight0030007CreateTime(Date cySysBlockSucu04weight0030007CreateTime) {
        this.cySysBlockSucu04weight0030007CreateTime = cySysBlockSucu04weight0030007CreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu04weight0030007_modify_time - 更新时间
     */
    public Date getCySysBlockSucu04weight0030007ModifyTime() {
        return cySysBlockSucu04weight0030007ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu04weight0030007ModifyTime 更新时间
     */
    public void setCySysBlockSucu04weight0030007ModifyTime(Date cySysBlockSucu04weight0030007ModifyTime) {
        this.cySysBlockSucu04weight0030007ModifyTime = cySysBlockSucu04weight0030007ModifyTime;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu04weight0030007_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu04weight0030007ColumnSimpleJson() {
        return cySysBlockSucu04weight0030007ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu04weight0030007ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu04weight0030007ColumnSimpleJson(String cySysBlockSucu04weight0030007ColumnSimpleJson) {
        this.cySysBlockSucu04weight0030007ColumnSimpleJson = cySysBlockSucu04weight0030007ColumnSimpleJson;
    }

    /**
     * 获取数据详细数组
     *
     * @return cy_sys_block_sucu04weight0030007_column_detail_json - 数据详细数组
     */
    public String getCySysBlockSucu04weight0030007ColumnDetailJson() {
        return cySysBlockSucu04weight0030007ColumnDetailJson;
    }

    /**
     * 设置数据详细数组
     *
     * @param cySysBlockSucu04weight0030007ColumnDetailJson 数据详细数组
     */
    public void setCySysBlockSucu04weight0030007ColumnDetailJson(String cySysBlockSucu04weight0030007ColumnDetailJson) {
        this.cySysBlockSucu04weight0030007ColumnDetailJson = cySysBlockSucu04weight0030007ColumnDetailJson;
    }

    /**
     * 获取代码信息
     *
     * @return cy_sys_block_sucu04weight0030007_code - 代码信息
     */
    public String getCySysBlockSucu04weight0030007Code() {
        return cySysBlockSucu04weight0030007Code;
    }

    /**
     * 设置代码信息
     *
     * @param cySysBlockSucu04weight0030007Code 代码信息
     */
    public void setCySysBlockSucu04weight0030007Code(String cySysBlockSucu04weight0030007Code) {
        this.cySysBlockSucu04weight0030007Code = cySysBlockSucu04weight0030007Code;
    }

    /**
     * 获取详细json代码
     *
     * @return cy_sys_block_sucu04weight0030007_json_code - 详细json代码
     */
    public String getCySysBlockSucu04weight0030007JsonCode() {
        return cySysBlockSucu04weight0030007JsonCode;
    }

    /**
     * 设置详细json代码
     *
     * @param cySysBlockSucu04weight0030007JsonCode 详细json代码
     */
    public void setCySysBlockSucu04weight0030007JsonCode(String cySysBlockSucu04weight0030007JsonCode) {
        this.cySysBlockSucu04weight0030007JsonCode = cySysBlockSucu04weight0030007JsonCode;
    }
}