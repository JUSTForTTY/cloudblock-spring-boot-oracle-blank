package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu08searchweiget0020001")
public class CySysBlockSucu08searchweiget0020001 {
    @Id
    @Column(name = "cy_sys_block_sucu08searchweiget0020001_id")
    private String cySysBlockSucu08searchweiget0020001Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0020001_name")
    private String cySysBlockSucu08searchweiget0020001Name;

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
    @Column(name = "cy_sys_block_sucu08searchweiget0020001_create_time")
    private Date cySysBlockSucu08searchweiget0020001CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0020001_create_user")
    private String cySysBlockSucu08searchweiget0020001CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0020001_modify_time")
    private Date cySysBlockSucu08searchweiget0020001ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0020001_modify_user")
    private String cySysBlockSucu08searchweiget0020001ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0020001_is_delete")
    private String cySysBlockSucu08searchweiget0020001IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0020001_column_simple_json")
    private String cySysBlockSucu08searchweiget0020001ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0020001_column_detail_json")
    private String cySysBlockSucu08searchweiget0020001ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0020001_code")
    private String cySysBlockSucu08searchweiget0020001Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0020001_json_code")
    private String cySysBlockSucu08searchweiget0020001JsonCode;

    /**
     * @return cy_sys_block_sucu08searchweiget0020001_id
     */
    public String getCySysBlockSucu08searchweiget0020001Id() {
        return cySysBlockSucu08searchweiget0020001Id;
    }

    /**
     * @param cySysBlockSucu08searchweiget0020001Id
     */
    public void setCySysBlockSucu08searchweiget0020001Id(String cySysBlockSucu08searchweiget0020001Id) {
        this.cySysBlockSucu08searchweiget0020001Id = cySysBlockSucu08searchweiget0020001Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu08searchweiget0020001_name - 积木名称
     */
    public String getCySysBlockSucu08searchweiget0020001Name() {
        return cySysBlockSucu08searchweiget0020001Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu08searchweiget0020001Name 积木名称
     */
    public void setCySysBlockSucu08searchweiget0020001Name(String cySysBlockSucu08searchweiget0020001Name) {
        this.cySysBlockSucu08searchweiget0020001Name = cySysBlockSucu08searchweiget0020001Name;
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
     * @return cy_sys_block_sucu08searchweiget0020001_create_time - 创建时间
     */
    public Date getCySysBlockSucu08searchweiget0020001CreateTime() {
        return cySysBlockSucu08searchweiget0020001CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu08searchweiget0020001CreateTime 创建时间
     */
    public void setCySysBlockSucu08searchweiget0020001CreateTime(Date cySysBlockSucu08searchweiget0020001CreateTime) {
        this.cySysBlockSucu08searchweiget0020001CreateTime = cySysBlockSucu08searchweiget0020001CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu08searchweiget0020001_create_user - 创建人
     */
    public String getCySysBlockSucu08searchweiget0020001CreateUser() {
        return cySysBlockSucu08searchweiget0020001CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu08searchweiget0020001CreateUser 创建人
     */
    public void setCySysBlockSucu08searchweiget0020001CreateUser(String cySysBlockSucu08searchweiget0020001CreateUser) {
        this.cySysBlockSucu08searchweiget0020001CreateUser = cySysBlockSucu08searchweiget0020001CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu08searchweiget0020001_modify_time - 更新人
     */
    public Date getCySysBlockSucu08searchweiget0020001ModifyTime() {
        return cySysBlockSucu08searchweiget0020001ModifyTime;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu08searchweiget0020001ModifyTime 更新人
     */
    public void setCySysBlockSucu08searchweiget0020001ModifyTime(Date cySysBlockSucu08searchweiget0020001ModifyTime) {
        this.cySysBlockSucu08searchweiget0020001ModifyTime = cySysBlockSucu08searchweiget0020001ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu08searchweiget0020001_modify_user - 更新人
     */
    public String getCySysBlockSucu08searchweiget0020001ModifyUser() {
        return cySysBlockSucu08searchweiget0020001ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu08searchweiget0020001ModifyUser 更新人
     */
    public void setCySysBlockSucu08searchweiget0020001ModifyUser(String cySysBlockSucu08searchweiget0020001ModifyUser) {
        this.cySysBlockSucu08searchweiget0020001ModifyUser = cySysBlockSucu08searchweiget0020001ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu08searchweiget0020001_is_delete - 是否删除
     */
    public String getCySysBlockSucu08searchweiget0020001IsDelete() {
        return cySysBlockSucu08searchweiget0020001IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu08searchweiget0020001IsDelete 是否删除
     */
    public void setCySysBlockSucu08searchweiget0020001IsDelete(String cySysBlockSucu08searchweiget0020001IsDelete) {
        this.cySysBlockSucu08searchweiget0020001IsDelete = cySysBlockSucu08searchweiget0020001IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu08searchweiget0020001_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu08searchweiget0020001ColumnSimpleJson() {
        return cySysBlockSucu08searchweiget0020001ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu08searchweiget0020001ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu08searchweiget0020001ColumnSimpleJson(String cySysBlockSucu08searchweiget0020001ColumnSimpleJson) {
        this.cySysBlockSucu08searchweiget0020001ColumnSimpleJson = cySysBlockSucu08searchweiget0020001ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu08searchweiget0020001_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu08searchweiget0020001ColumnDetailJson() {
        return cySysBlockSucu08searchweiget0020001ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu08searchweiget0020001ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu08searchweiget0020001ColumnDetailJson(String cySysBlockSucu08searchweiget0020001ColumnDetailJson) {
        this.cySysBlockSucu08searchweiget0020001ColumnDetailJson = cySysBlockSucu08searchweiget0020001ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu08searchweiget0020001_code - 积木代码信息
     */
    public String getCySysBlockSucu08searchweiget0020001Code() {
        return cySysBlockSucu08searchweiget0020001Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu08searchweiget0020001Code 积木代码信息
     */
    public void setCySysBlockSucu08searchweiget0020001Code(String cySysBlockSucu08searchweiget0020001Code) {
        this.cySysBlockSucu08searchweiget0020001Code = cySysBlockSucu08searchweiget0020001Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu08searchweiget0020001_json_code - 还原场景信息
     */
    public String getCySysBlockSucu08searchweiget0020001JsonCode() {
        return cySysBlockSucu08searchweiget0020001JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu08searchweiget0020001JsonCode 还原场景信息
     */
    public void setCySysBlockSucu08searchweiget0020001JsonCode(String cySysBlockSucu08searchweiget0020001JsonCode) {
        this.cySysBlockSucu08searchweiget0020001JsonCode = cySysBlockSucu08searchweiget0020001JsonCode;
    }
}