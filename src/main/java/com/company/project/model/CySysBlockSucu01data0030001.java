package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu01data0030001")
public class CySysBlockSucu01data0030001 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu01data0030001_id")
    private String cySysBlockSucu01data0030001Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu01data0030001_name")
    private String cySysBlockSucu01data0030001Name;

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
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu01data0030001_column_simple_json")
    private String cySysBlockSucu01data0030001ColumnSimpleJson;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu01data0030001_create_time")
    private Date cySysBlockSucu01data0030001CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu01data0030001_create_user")
    private String cySysBlockSucu01data0030001CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu01data0030001_modify_time")
    private Date cySysBlockSucu01data0030001ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu01data0030001_modify_user")
    private String cySysBlockSucu01data0030001ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu01data0030001_is_delete")
    private String cySysBlockSucu01data0030001IsDelete;

    /**
     * 字段详细数据
     */
    @Column(name = "cy_sys_block_sucu01data0030001_column_detail_json")
    private String cySysBlockSucu01data0030001ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu01data0030001_code")
    private String cySysBlockSucu01data0030001Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu01data0030001_json_code")
    private String cySysBlockSucu01data0030001JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu01data0030001_id - 编号
     */
    public String getCySysBlockSucu01data0030001Id() {
        return cySysBlockSucu01data0030001Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu01data0030001Id 编号
     */
    public void setCySysBlockSucu01data0030001Id(String cySysBlockSucu01data0030001Id) {
        this.cySysBlockSucu01data0030001Id = cySysBlockSucu01data0030001Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu01data0030001_name - 积木名称
     */
    public String getCySysBlockSucu01data0030001Name() {
        return cySysBlockSucu01data0030001Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu01data0030001Name 积木名称
     */
    public void setCySysBlockSucu01data0030001Name(String cySysBlockSucu01data0030001Name) {
        this.cySysBlockSucu01data0030001Name = cySysBlockSucu01data0030001Name;
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
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu01data0030001_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu01data0030001ColumnSimpleJson() {
        return cySysBlockSucu01data0030001ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu01data0030001ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu01data0030001ColumnSimpleJson(String cySysBlockSucu01data0030001ColumnSimpleJson) {
        this.cySysBlockSucu01data0030001ColumnSimpleJson = cySysBlockSucu01data0030001ColumnSimpleJson;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu01data0030001_create_time - 创建时间
     */
    public Date getCySysBlockSucu01data0030001CreateTime() {
        return cySysBlockSucu01data0030001CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu01data0030001CreateTime 创建时间
     */
    public void setCySysBlockSucu01data0030001CreateTime(Date cySysBlockSucu01data0030001CreateTime) {
        this.cySysBlockSucu01data0030001CreateTime = cySysBlockSucu01data0030001CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu01data0030001_create_user - 创建人
     */
    public String getCySysBlockSucu01data0030001CreateUser() {
        return cySysBlockSucu01data0030001CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu01data0030001CreateUser 创建人
     */
    public void setCySysBlockSucu01data0030001CreateUser(String cySysBlockSucu01data0030001CreateUser) {
        this.cySysBlockSucu01data0030001CreateUser = cySysBlockSucu01data0030001CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu01data0030001_modify_time - 更新时间
     */
    public Date getCySysBlockSucu01data0030001ModifyTime() {
        return cySysBlockSucu01data0030001ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu01data0030001ModifyTime 更新时间
     */
    public void setCySysBlockSucu01data0030001ModifyTime(Date cySysBlockSucu01data0030001ModifyTime) {
        this.cySysBlockSucu01data0030001ModifyTime = cySysBlockSucu01data0030001ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu01data0030001_modify_user - 更新人
     */
    public String getCySysBlockSucu01data0030001ModifyUser() {
        return cySysBlockSucu01data0030001ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu01data0030001ModifyUser 更新人
     */
    public void setCySysBlockSucu01data0030001ModifyUser(String cySysBlockSucu01data0030001ModifyUser) {
        this.cySysBlockSucu01data0030001ModifyUser = cySysBlockSucu01data0030001ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu01data0030001_is_delete - 是否删除
     */
    public String getCySysBlockSucu01data0030001IsDelete() {
        return cySysBlockSucu01data0030001IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu01data0030001IsDelete 是否删除
     */
    public void setCySysBlockSucu01data0030001IsDelete(String cySysBlockSucu01data0030001IsDelete) {
        this.cySysBlockSucu01data0030001IsDelete = cySysBlockSucu01data0030001IsDelete;
    }

    /**
     * 获取字段详细数据
     *
     * @return cy_sys_block_sucu01data0030001_column_detail_json - 字段详细数据
     */
    public String getCySysBlockSucu01data0030001ColumnDetailJson() {
        return cySysBlockSucu01data0030001ColumnDetailJson;
    }

    /**
     * 设置字段详细数据
     *
     * @param cySysBlockSucu01data0030001ColumnDetailJson 字段详细数据
     */
    public void setCySysBlockSucu01data0030001ColumnDetailJson(String cySysBlockSucu01data0030001ColumnDetailJson) {
        this.cySysBlockSucu01data0030001ColumnDetailJson = cySysBlockSucu01data0030001ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu01data0030001_code - 积木代码信息
     */
    public String getCySysBlockSucu01data0030001Code() {
        return cySysBlockSucu01data0030001Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu01data0030001Code 积木代码信息
     */
    public void setCySysBlockSucu01data0030001Code(String cySysBlockSucu01data0030001Code) {
        this.cySysBlockSucu01data0030001Code = cySysBlockSucu01data0030001Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu01data0030001_json_code - 还原场景信息
     */
    public String getCySysBlockSucu01data0030001JsonCode() {
        return cySysBlockSucu01data0030001JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu01data0030001JsonCode 还原场景信息
     */
    public void setCySysBlockSucu01data0030001JsonCode(String cySysBlockSucu01data0030001JsonCode) {
        this.cySysBlockSucu01data0030001JsonCode = cySysBlockSucu01data0030001JsonCode;
    }
}