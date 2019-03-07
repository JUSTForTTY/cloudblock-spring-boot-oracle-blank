package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu05button0010003")
public class CySysBlockSucu05button0010003 {
    @Id
    @Column(name = "cy_sys_block_sucu05button0010003_id")
    private String cySysBlockSucu05button0010003Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu05button0010003_name")
    private String cySysBlockSucu05button0010003Name;

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
    @Column(name = "cy_sys_block_sucu05button0010003_create_time")
    private Date cySysBlockSucu05button0010003CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu05button0010003_create_user")
    private String cySysBlockSucu05button0010003CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu05button0010003_modify_time")
    private Date cySysBlockSucu05button0010003ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu05button0010003_modify_user")
    private String cySysBlockSucu05button0010003ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu05button0010003_is_delete")
    private String cySysBlockSucu05button0010003IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu05button0010003_column_simple_json")
    private String cySysBlockSucu05button0010003ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu05button0010003_column_detail_json")
    private String cySysBlockSucu05button0010003ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu05button0010003_code")
    private String cySysBlockSucu05button0010003Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu05button0010003_json_code")
    private String cySysBlockSucu05button0010003JsonCode;

    /**
     * @return cy_sys_block_sucu05button0010003_id
     */
    public String getCySysBlockSucu05button0010003Id() {
        return cySysBlockSucu05button0010003Id;
    }

    /**
     * @param cySysBlockSucu05button0010003Id
     */
    public void setCySysBlockSucu05button0010003Id(String cySysBlockSucu05button0010003Id) {
        this.cySysBlockSucu05button0010003Id = cySysBlockSucu05button0010003Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu05button0010003_name - 积木名称
     */
    public String getCySysBlockSucu05button0010003Name() {
        return cySysBlockSucu05button0010003Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu05button0010003Name 积木名称
     */
    public void setCySysBlockSucu05button0010003Name(String cySysBlockSucu05button0010003Name) {
        this.cySysBlockSucu05button0010003Name = cySysBlockSucu05button0010003Name;
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
     * @return cy_sys_block_sucu05button0010003_create_time - 创建时间
     */
    public Date getCySysBlockSucu05button0010003CreateTime() {
        return cySysBlockSucu05button0010003CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu05button0010003CreateTime 创建时间
     */
    public void setCySysBlockSucu05button0010003CreateTime(Date cySysBlockSucu05button0010003CreateTime) {
        this.cySysBlockSucu05button0010003CreateTime = cySysBlockSucu05button0010003CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu05button0010003_create_user - 创建人
     */
    public String getCySysBlockSucu05button0010003CreateUser() {
        return cySysBlockSucu05button0010003CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu05button0010003CreateUser 创建人
     */
    public void setCySysBlockSucu05button0010003CreateUser(String cySysBlockSucu05button0010003CreateUser) {
        this.cySysBlockSucu05button0010003CreateUser = cySysBlockSucu05button0010003CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu05button0010003_modify_time - 更新时间
     */
    public Date getCySysBlockSucu05button0010003ModifyTime() {
        return cySysBlockSucu05button0010003ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu05button0010003ModifyTime 更新时间
     */
    public void setCySysBlockSucu05button0010003ModifyTime(Date cySysBlockSucu05button0010003ModifyTime) {
        this.cySysBlockSucu05button0010003ModifyTime = cySysBlockSucu05button0010003ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu05button0010003_modify_user - 更新人
     */
    public String getCySysBlockSucu05button0010003ModifyUser() {
        return cySysBlockSucu05button0010003ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu05button0010003ModifyUser 更新人
     */
    public void setCySysBlockSucu05button0010003ModifyUser(String cySysBlockSucu05button0010003ModifyUser) {
        this.cySysBlockSucu05button0010003ModifyUser = cySysBlockSucu05button0010003ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu05button0010003_is_delete - 是否删除
     */
    public String getCySysBlockSucu05button0010003IsDelete() {
        return cySysBlockSucu05button0010003IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu05button0010003IsDelete 是否删除
     */
    public void setCySysBlockSucu05button0010003IsDelete(String cySysBlockSucu05button0010003IsDelete) {
        this.cySysBlockSucu05button0010003IsDelete = cySysBlockSucu05button0010003IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu05button0010003_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu05button0010003ColumnSimpleJson() {
        return cySysBlockSucu05button0010003ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu05button0010003ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu05button0010003ColumnSimpleJson(String cySysBlockSucu05button0010003ColumnSimpleJson) {
        this.cySysBlockSucu05button0010003ColumnSimpleJson = cySysBlockSucu05button0010003ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu05button0010003_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu05button0010003ColumnDetailJson() {
        return cySysBlockSucu05button0010003ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu05button0010003ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu05button0010003ColumnDetailJson(String cySysBlockSucu05button0010003ColumnDetailJson) {
        this.cySysBlockSucu05button0010003ColumnDetailJson = cySysBlockSucu05button0010003ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu05button0010003_code - 积木代码信息
     */
    public String getCySysBlockSucu05button0010003Code() {
        return cySysBlockSucu05button0010003Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu05button0010003Code 积木代码信息
     */
    public void setCySysBlockSucu05button0010003Code(String cySysBlockSucu05button0010003Code) {
        this.cySysBlockSucu05button0010003Code = cySysBlockSucu05button0010003Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu05button0010003_json_code - 还原场景信息
     */
    public String getCySysBlockSucu05button0010003JsonCode() {
        return cySysBlockSucu05button0010003JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu05button0010003JsonCode 还原场景信息
     */
    public void setCySysBlockSucu05button0010003JsonCode(String cySysBlockSucu05button0010003JsonCode) {
        this.cySysBlockSucu05button0010003JsonCode = cySysBlockSucu05button0010003JsonCode;
    }
}