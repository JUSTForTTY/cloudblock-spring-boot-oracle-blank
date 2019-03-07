package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu05button0020002")
public class CySysBlockSucu05button0020002 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu05button0020002_id")
    private String cySysBlockSucu05button0020002Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu05button0020002_name")
    private String cySysBlockSucu05button0020002Name;

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
    @Column(name = "cy_sys_block_sucu05button0020002_create_time")
    private Date cySysBlockSucu05button0020002CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu05button0020002_create_user")
    private String cySysBlockSucu05button0020002CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu05button0020002_modify_time")
    private Date cySysBlockSucu05button0020002ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu05button0020002_modify_user")
    private String cySysBlockSucu05button0020002ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu05button0020002_is_delete")
    private String cySysBlockSucu05button0020002IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu05button0020002_column_simple_json")
    private String cySysBlockSucu05button0020002ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu05button0020002_column_detail_json")
    private String cySysBlockSucu05button0020002ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu05button0020002_code")
    private String cySysBlockSucu05button0020002Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu05button0020002_json_code")
    private String cySysBlockSucu05button0020002JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu05button0020002_id - 编号
     */
    public String getCySysBlockSucu05button0020002Id() {
        return cySysBlockSucu05button0020002Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu05button0020002Id 编号
     */
    public void setCySysBlockSucu05button0020002Id(String cySysBlockSucu05button0020002Id) {
        this.cySysBlockSucu05button0020002Id = cySysBlockSucu05button0020002Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu05button0020002_name - 积木名称
     */
    public String getCySysBlockSucu05button0020002Name() {
        return cySysBlockSucu05button0020002Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu05button0020002Name 积木名称
     */
    public void setCySysBlockSucu05button0020002Name(String cySysBlockSucu05button0020002Name) {
        this.cySysBlockSucu05button0020002Name = cySysBlockSucu05button0020002Name;
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
     * @return cy_sys_block_sucu05button0020002_create_time - 创建时间
     */
    public Date getCySysBlockSucu05button0020002CreateTime() {
        return cySysBlockSucu05button0020002CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu05button0020002CreateTime 创建时间
     */
    public void setCySysBlockSucu05button0020002CreateTime(Date cySysBlockSucu05button0020002CreateTime) {
        this.cySysBlockSucu05button0020002CreateTime = cySysBlockSucu05button0020002CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu05button0020002_create_user - 创建人
     */
    public String getCySysBlockSucu05button0020002CreateUser() {
        return cySysBlockSucu05button0020002CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu05button0020002CreateUser 创建人
     */
    public void setCySysBlockSucu05button0020002CreateUser(String cySysBlockSucu05button0020002CreateUser) {
        this.cySysBlockSucu05button0020002CreateUser = cySysBlockSucu05button0020002CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu05button0020002_modify_time - 更新时间
     */
    public Date getCySysBlockSucu05button0020002ModifyTime() {
        return cySysBlockSucu05button0020002ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu05button0020002ModifyTime 更新时间
     */
    public void setCySysBlockSucu05button0020002ModifyTime(Date cySysBlockSucu05button0020002ModifyTime) {
        this.cySysBlockSucu05button0020002ModifyTime = cySysBlockSucu05button0020002ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu05button0020002_modify_user - 更新人
     */
    public String getCySysBlockSucu05button0020002ModifyUser() {
        return cySysBlockSucu05button0020002ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu05button0020002ModifyUser 更新人
     */
    public void setCySysBlockSucu05button0020002ModifyUser(String cySysBlockSucu05button0020002ModifyUser) {
        this.cySysBlockSucu05button0020002ModifyUser = cySysBlockSucu05button0020002ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu05button0020002_is_delete - 是否删除
     */
    public String getCySysBlockSucu05button0020002IsDelete() {
        return cySysBlockSucu05button0020002IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu05button0020002IsDelete 是否删除
     */
    public void setCySysBlockSucu05button0020002IsDelete(String cySysBlockSucu05button0020002IsDelete) {
        this.cySysBlockSucu05button0020002IsDelete = cySysBlockSucu05button0020002IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu05button0020002_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu05button0020002ColumnSimpleJson() {
        return cySysBlockSucu05button0020002ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu05button0020002ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu05button0020002ColumnSimpleJson(String cySysBlockSucu05button0020002ColumnSimpleJson) {
        this.cySysBlockSucu05button0020002ColumnSimpleJson = cySysBlockSucu05button0020002ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu05button0020002_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu05button0020002ColumnDetailJson() {
        return cySysBlockSucu05button0020002ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu05button0020002ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu05button0020002ColumnDetailJson(String cySysBlockSucu05button0020002ColumnDetailJson) {
        this.cySysBlockSucu05button0020002ColumnDetailJson = cySysBlockSucu05button0020002ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu05button0020002_code - 积木代码信息
     */
    public String getCySysBlockSucu05button0020002Code() {
        return cySysBlockSucu05button0020002Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu05button0020002Code 积木代码信息
     */
    public void setCySysBlockSucu05button0020002Code(String cySysBlockSucu05button0020002Code) {
        this.cySysBlockSucu05button0020002Code = cySysBlockSucu05button0020002Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu05button0020002_json_code - 还原场景信息
     */
    public String getCySysBlockSucu05button0020002JsonCode() {
        return cySysBlockSucu05button0020002JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu05button0020002JsonCode 还原场景信息
     */
    public void setCySysBlockSucu05button0020002JsonCode(String cySysBlockSucu05button0020002JsonCode) {
        this.cySysBlockSucu05button0020002JsonCode = cySysBlockSucu05button0020002JsonCode;
    }
}