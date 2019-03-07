package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu08searchweiget0050001")
public class CySysBlockSucu08searchweiget0050001 {
    @Id
    @Column(name = "cy_sys_block_sucu08searchweiget0050001_id")
    private String cySysBlockSucu08searchweiget0050001Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0050001_name")
    private String cySysBlockSucu08searchweiget0050001Name;

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
    @Column(name = "cy_sys_block_sucu08searchweiget0050001_create_time")
    private Date cySysBlockSucu08searchweiget0050001CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0050001_create_user")
    private String cySysBlockSucu08searchweiget0050001CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0050001_modify_time")
    private Date cySysBlockSucu08searchweiget0050001ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0050001_modify_user")
    private String cySysBlockSucu08searchweiget0050001ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0050001_is_delete")
    private String cySysBlockSucu08searchweiget0050001IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0050001_column_simple_json")
    private String cySysBlockSucu08searchweiget0050001ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0050001_column_detail_json")
    private String cySysBlockSucu08searchweiget0050001ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0050001_code")
    private String cySysBlockSucu08searchweiget0050001Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0050001_json_code")
    private String cySysBlockSucu08searchweiget0050001JsonCode;

    /**
     * @return cy_sys_block_sucu08searchweiget0050001_id
     */
    public String getCySysBlockSucu08searchweiget0050001Id() {
        return cySysBlockSucu08searchweiget0050001Id;
    }

    /**
     * @param cySysBlockSucu08searchweiget0050001Id
     */
    public void setCySysBlockSucu08searchweiget0050001Id(String cySysBlockSucu08searchweiget0050001Id) {
        this.cySysBlockSucu08searchweiget0050001Id = cySysBlockSucu08searchweiget0050001Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu08searchweiget0050001_name - 积木名称
     */
    public String getCySysBlockSucu08searchweiget0050001Name() {
        return cySysBlockSucu08searchweiget0050001Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu08searchweiget0050001Name 积木名称
     */
    public void setCySysBlockSucu08searchweiget0050001Name(String cySysBlockSucu08searchweiget0050001Name) {
        this.cySysBlockSucu08searchweiget0050001Name = cySysBlockSucu08searchweiget0050001Name;
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
     * @return cy_sys_block_sucu08searchweiget0050001_create_time - 创建时间
     */
    public Date getCySysBlockSucu08searchweiget0050001CreateTime() {
        return cySysBlockSucu08searchweiget0050001CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu08searchweiget0050001CreateTime 创建时间
     */
    public void setCySysBlockSucu08searchweiget0050001CreateTime(Date cySysBlockSucu08searchweiget0050001CreateTime) {
        this.cySysBlockSucu08searchweiget0050001CreateTime = cySysBlockSucu08searchweiget0050001CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu08searchweiget0050001_create_user - 创建人
     */
    public String getCySysBlockSucu08searchweiget0050001CreateUser() {
        return cySysBlockSucu08searchweiget0050001CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu08searchweiget0050001CreateUser 创建人
     */
    public void setCySysBlockSucu08searchweiget0050001CreateUser(String cySysBlockSucu08searchweiget0050001CreateUser) {
        this.cySysBlockSucu08searchweiget0050001CreateUser = cySysBlockSucu08searchweiget0050001CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu08searchweiget0050001_modify_time - 更新人
     */
    public Date getCySysBlockSucu08searchweiget0050001ModifyTime() {
        return cySysBlockSucu08searchweiget0050001ModifyTime;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu08searchweiget0050001ModifyTime 更新人
     */
    public void setCySysBlockSucu08searchweiget0050001ModifyTime(Date cySysBlockSucu08searchweiget0050001ModifyTime) {
        this.cySysBlockSucu08searchweiget0050001ModifyTime = cySysBlockSucu08searchweiget0050001ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu08searchweiget0050001_modify_user - 更新人
     */
    public String getCySysBlockSucu08searchweiget0050001ModifyUser() {
        return cySysBlockSucu08searchweiget0050001ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu08searchweiget0050001ModifyUser 更新人
     */
    public void setCySysBlockSucu08searchweiget0050001ModifyUser(String cySysBlockSucu08searchweiget0050001ModifyUser) {
        this.cySysBlockSucu08searchweiget0050001ModifyUser = cySysBlockSucu08searchweiget0050001ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu08searchweiget0050001_is_delete - 是否删除
     */
    public String getCySysBlockSucu08searchweiget0050001IsDelete() {
        return cySysBlockSucu08searchweiget0050001IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu08searchweiget0050001IsDelete 是否删除
     */
    public void setCySysBlockSucu08searchweiget0050001IsDelete(String cySysBlockSucu08searchweiget0050001IsDelete) {
        this.cySysBlockSucu08searchweiget0050001IsDelete = cySysBlockSucu08searchweiget0050001IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu08searchweiget0050001_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu08searchweiget0050001ColumnSimpleJson() {
        return cySysBlockSucu08searchweiget0050001ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu08searchweiget0050001ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu08searchweiget0050001ColumnSimpleJson(String cySysBlockSucu08searchweiget0050001ColumnSimpleJson) {
        this.cySysBlockSucu08searchweiget0050001ColumnSimpleJson = cySysBlockSucu08searchweiget0050001ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu08searchweiget0050001_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu08searchweiget0050001ColumnDetailJson() {
        return cySysBlockSucu08searchweiget0050001ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu08searchweiget0050001ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu08searchweiget0050001ColumnDetailJson(String cySysBlockSucu08searchweiget0050001ColumnDetailJson) {
        this.cySysBlockSucu08searchweiget0050001ColumnDetailJson = cySysBlockSucu08searchweiget0050001ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu08searchweiget0050001_code - 积木代码信息
     */
    public String getCySysBlockSucu08searchweiget0050001Code() {
        return cySysBlockSucu08searchweiget0050001Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu08searchweiget0050001Code 积木代码信息
     */
    public void setCySysBlockSucu08searchweiget0050001Code(String cySysBlockSucu08searchweiget0050001Code) {
        this.cySysBlockSucu08searchweiget0050001Code = cySysBlockSucu08searchweiget0050001Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu08searchweiget0050001_json_code - 还原场景信息
     */
    public String getCySysBlockSucu08searchweiget0050001JsonCode() {
        return cySysBlockSucu08searchweiget0050001JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu08searchweiget0050001JsonCode 还原场景信息
     */
    public void setCySysBlockSucu08searchweiget0050001JsonCode(String cySysBlockSucu08searchweiget0050001JsonCode) {
        this.cySysBlockSucu08searchweiget0050001JsonCode = cySysBlockSucu08searchweiget0050001JsonCode;
    }
}