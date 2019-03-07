package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu05button0010007")
public class CySysBlockSucu05button0010007 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu05button0010007_id")
    private String cySysBlockSucu05button0010007Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu05button0010007_name")
    private String cySysBlockSucu05button0010007Name;

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
    @Column(name = "cy_sys_block_sucu05button0010007_create_time")
    private Date cySysBlockSucu05button0010007CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu05button0010007_create_user")
    private String cySysBlockSucu05button0010007CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu05button0010007_modify_time")
    private Date cySysBlockSucu05button0010007ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu05button0010007_modify_user")
    private String cySysBlockSucu05button0010007ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu05button0010007_is_delete")
    private String cySysBlockSucu05button0010007IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu05button0010007_column_simple_json")
    private String cySysBlockSucu05button0010007ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu05button0010007_column_detail_json")
    private String cySysBlockSucu05button0010007ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu05button0010007_code")
    private String cySysBlockSucu05button0010007Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu05button0010007_json_code")
    private String cySysBlockSucu05button0010007JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu05button0010007_id - 编号
     */
    public String getCySysBlockSucu05button0010007Id() {
        return cySysBlockSucu05button0010007Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu05button0010007Id 编号
     */
    public void setCySysBlockSucu05button0010007Id(String cySysBlockSucu05button0010007Id) {
        this.cySysBlockSucu05button0010007Id = cySysBlockSucu05button0010007Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu05button0010007_name - 积木名称
     */
    public String getCySysBlockSucu05button0010007Name() {
        return cySysBlockSucu05button0010007Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu05button0010007Name 积木名称
     */
    public void setCySysBlockSucu05button0010007Name(String cySysBlockSucu05button0010007Name) {
        this.cySysBlockSucu05button0010007Name = cySysBlockSucu05button0010007Name;
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
     * @return cy_sys_block_sucu05button0010007_create_time - 创建时间
     */
    public Date getCySysBlockSucu05button0010007CreateTime() {
        return cySysBlockSucu05button0010007CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu05button0010007CreateTime 创建时间
     */
    public void setCySysBlockSucu05button0010007CreateTime(Date cySysBlockSucu05button0010007CreateTime) {
        this.cySysBlockSucu05button0010007CreateTime = cySysBlockSucu05button0010007CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu05button0010007_create_user - 创建人
     */
    public String getCySysBlockSucu05button0010007CreateUser() {
        return cySysBlockSucu05button0010007CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu05button0010007CreateUser 创建人
     */
    public void setCySysBlockSucu05button0010007CreateUser(String cySysBlockSucu05button0010007CreateUser) {
        this.cySysBlockSucu05button0010007CreateUser = cySysBlockSucu05button0010007CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu05button0010007_modify_time - 更新时间
     */
    public Date getCySysBlockSucu05button0010007ModifyTime() {
        return cySysBlockSucu05button0010007ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu05button0010007ModifyTime 更新时间
     */
    public void setCySysBlockSucu05button0010007ModifyTime(Date cySysBlockSucu05button0010007ModifyTime) {
        this.cySysBlockSucu05button0010007ModifyTime = cySysBlockSucu05button0010007ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu05button0010007_modify_user - 更新人
     */
    public String getCySysBlockSucu05button0010007ModifyUser() {
        return cySysBlockSucu05button0010007ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu05button0010007ModifyUser 更新人
     */
    public void setCySysBlockSucu05button0010007ModifyUser(String cySysBlockSucu05button0010007ModifyUser) {
        this.cySysBlockSucu05button0010007ModifyUser = cySysBlockSucu05button0010007ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu05button0010007_is_delete - 是否删除
     */
    public String getCySysBlockSucu05button0010007IsDelete() {
        return cySysBlockSucu05button0010007IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu05button0010007IsDelete 是否删除
     */
    public void setCySysBlockSucu05button0010007IsDelete(String cySysBlockSucu05button0010007IsDelete) {
        this.cySysBlockSucu05button0010007IsDelete = cySysBlockSucu05button0010007IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu05button0010007_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu05button0010007ColumnSimpleJson() {
        return cySysBlockSucu05button0010007ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu05button0010007ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu05button0010007ColumnSimpleJson(String cySysBlockSucu05button0010007ColumnSimpleJson) {
        this.cySysBlockSucu05button0010007ColumnSimpleJson = cySysBlockSucu05button0010007ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu05button0010007_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu05button0010007ColumnDetailJson() {
        return cySysBlockSucu05button0010007ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu05button0010007ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu05button0010007ColumnDetailJson(String cySysBlockSucu05button0010007ColumnDetailJson) {
        this.cySysBlockSucu05button0010007ColumnDetailJson = cySysBlockSucu05button0010007ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu05button0010007_code - 积木代码信息
     */
    public String getCySysBlockSucu05button0010007Code() {
        return cySysBlockSucu05button0010007Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu05button0010007Code 积木代码信息
     */
    public void setCySysBlockSucu05button0010007Code(String cySysBlockSucu05button0010007Code) {
        this.cySysBlockSucu05button0010007Code = cySysBlockSucu05button0010007Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu05button0010007_json_code - 还原场景信息
     */
    public String getCySysBlockSucu05button0010007JsonCode() {
        return cySysBlockSucu05button0010007JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu05button0010007JsonCode 还原场景信息
     */
    public void setCySysBlockSucu05button0010007JsonCode(String cySysBlockSucu05button0010007JsonCode) {
        this.cySysBlockSucu05button0010007JsonCode = cySysBlockSucu05button0010007JsonCode;
    }
}