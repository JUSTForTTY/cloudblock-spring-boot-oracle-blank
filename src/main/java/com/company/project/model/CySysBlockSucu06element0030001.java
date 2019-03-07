package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu06element0030001")
public class CySysBlockSucu06element0030001 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu06element0030001_id")
    private String cySysBlockSucu06element0030001Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu06element0030001_name")
    private String cySysBlockSucu06element0030001Name;

    /**
     * 积木编号
     */
    @Column(name = "cy_sys_block_id")
    private String cySysBlockId;

    /**
     * 所属实例积木
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
    @Column(name = "cy_sys_block_sucu06element0030001_create_time")
    private Date cySysBlockSucu06element0030001CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu06element0030001_create_user")
    private String cySysBlockSucu06element0030001CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu06element0030001_modify_time")
    private Date cySysBlockSucu06element0030001ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu06element0030001_modify_user")
    private String cySysBlockSucu06element0030001ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu06element0030001_is_delete")
    private String cySysBlockSucu06element0030001IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu06element0030001_column_simple_json")
    private String cySysBlockSucu06element0030001ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu06element0030001_column_detail_json")
    private String cySysBlockSucu06element0030001ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu06element0030001_code")
    private String cySysBlockSucu06element0030001Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu06element0030001_json_code")
    private String cySysBlockSucu06element0030001JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu06element0030001_id - 编号
     */
    public String getCySysBlockSucu06element0030001Id() {
        return cySysBlockSucu06element0030001Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu06element0030001Id 编号
     */
    public void setCySysBlockSucu06element0030001Id(String cySysBlockSucu06element0030001Id) {
        this.cySysBlockSucu06element0030001Id = cySysBlockSucu06element0030001Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu06element0030001_name - 积木名称
     */
    public String getCySysBlockSucu06element0030001Name() {
        return cySysBlockSucu06element0030001Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu06element0030001Name 积木名称
     */
    public void setCySysBlockSucu06element0030001Name(String cySysBlockSucu06element0030001Name) {
        this.cySysBlockSucu06element0030001Name = cySysBlockSucu06element0030001Name;
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
     * 获取所属实例积木
     *
     * @return cy_sys_view_explain_id - 所属实例积木
     */
    public String getCySysViewExplainId() {
        return cySysViewExplainId;
    }

    /**
     * 设置所属实例积木
     *
     * @param cySysViewExplainId 所属实例积木
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
     * @return cy_sys_block_sucu06element0030001_create_time - 创建时间
     */
    public Date getCySysBlockSucu06element0030001CreateTime() {
        return cySysBlockSucu06element0030001CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu06element0030001CreateTime 创建时间
     */
    public void setCySysBlockSucu06element0030001CreateTime(Date cySysBlockSucu06element0030001CreateTime) {
        this.cySysBlockSucu06element0030001CreateTime = cySysBlockSucu06element0030001CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu06element0030001_create_user - 创建人
     */
    public String getCySysBlockSucu06element0030001CreateUser() {
        return cySysBlockSucu06element0030001CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu06element0030001CreateUser 创建人
     */
    public void setCySysBlockSucu06element0030001CreateUser(String cySysBlockSucu06element0030001CreateUser) {
        this.cySysBlockSucu06element0030001CreateUser = cySysBlockSucu06element0030001CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu06element0030001_modify_time - 更新时间
     */
    public Date getCySysBlockSucu06element0030001ModifyTime() {
        return cySysBlockSucu06element0030001ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu06element0030001ModifyTime 更新时间
     */
    public void setCySysBlockSucu06element0030001ModifyTime(Date cySysBlockSucu06element0030001ModifyTime) {
        this.cySysBlockSucu06element0030001ModifyTime = cySysBlockSucu06element0030001ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu06element0030001_modify_user - 更新人
     */
    public String getCySysBlockSucu06element0030001ModifyUser() {
        return cySysBlockSucu06element0030001ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu06element0030001ModifyUser 更新人
     */
    public void setCySysBlockSucu06element0030001ModifyUser(String cySysBlockSucu06element0030001ModifyUser) {
        this.cySysBlockSucu06element0030001ModifyUser = cySysBlockSucu06element0030001ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu06element0030001_is_delete - 是否删除
     */
    public String getCySysBlockSucu06element0030001IsDelete() {
        return cySysBlockSucu06element0030001IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu06element0030001IsDelete 是否删除
     */
    public void setCySysBlockSucu06element0030001IsDelete(String cySysBlockSucu06element0030001IsDelete) {
        this.cySysBlockSucu06element0030001IsDelete = cySysBlockSucu06element0030001IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu06element0030001_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu06element0030001ColumnSimpleJson() {
        return cySysBlockSucu06element0030001ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu06element0030001ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu06element0030001ColumnSimpleJson(String cySysBlockSucu06element0030001ColumnSimpleJson) {
        this.cySysBlockSucu06element0030001ColumnSimpleJson = cySysBlockSucu06element0030001ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu06element0030001_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu06element0030001ColumnDetailJson() {
        return cySysBlockSucu06element0030001ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu06element0030001ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu06element0030001ColumnDetailJson(String cySysBlockSucu06element0030001ColumnDetailJson) {
        this.cySysBlockSucu06element0030001ColumnDetailJson = cySysBlockSucu06element0030001ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu06element0030001_code - 积木代码信息
     */
    public String getCySysBlockSucu06element0030001Code() {
        return cySysBlockSucu06element0030001Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu06element0030001Code 积木代码信息
     */
    public void setCySysBlockSucu06element0030001Code(String cySysBlockSucu06element0030001Code) {
        this.cySysBlockSucu06element0030001Code = cySysBlockSucu06element0030001Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu06element0030001_json_code - 还原场景信息
     */
    public String getCySysBlockSucu06element0030001JsonCode() {
        return cySysBlockSucu06element0030001JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu06element0030001JsonCode 还原场景信息
     */
    public void setCySysBlockSucu06element0030001JsonCode(String cySysBlockSucu06element0030001JsonCode) {
        this.cySysBlockSucu06element0030001JsonCode = cySysBlockSucu06element0030001JsonCode;
    }
}