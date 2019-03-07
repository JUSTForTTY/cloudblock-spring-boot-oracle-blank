package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu05button0010008")
public class CySysBlockSucu05button0010008 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu05button0010008_id")
    private String cySysBlockSucu05button0010008Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu05button0010008_name")
    private String cySysBlockSucu05button0010008Name;

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
    @Column(name = "cy_sys_block_sucu05button0010008_create_time")
    private Date cySysBlockSucu05button0010008CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu05button0010008_create_user")
    private String cySysBlockSucu05button0010008CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu05button0010008_modify_time")
    private Date cySysBlockSucu05button0010008ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu05button0010008_modify_user")
    private String cySysBlockSucu05button0010008ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu05button0010008_is_delete")
    private String cySysBlockSucu05button0010008IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu05button0010008_column_simple_json")
    private String cySysBlockSucu05button0010008ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu05button0010008_column_detail_json")
    private String cySysBlockSucu05button0010008ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu05button0010008_code")
    private String cySysBlockSucu05button0010008Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu05button0010008_json_code")
    private String cySysBlockSucu05button0010008JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu05button0010008_id - 编号
     */
    public String getCySysBlockSucu05button0010008Id() {
        return cySysBlockSucu05button0010008Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu05button0010008Id 编号
     */
    public void setCySysBlockSucu05button0010008Id(String cySysBlockSucu05button0010008Id) {
        this.cySysBlockSucu05button0010008Id = cySysBlockSucu05button0010008Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu05button0010008_name - 积木名称
     */
    public String getCySysBlockSucu05button0010008Name() {
        return cySysBlockSucu05button0010008Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu05button0010008Name 积木名称
     */
    public void setCySysBlockSucu05button0010008Name(String cySysBlockSucu05button0010008Name) {
        this.cySysBlockSucu05button0010008Name = cySysBlockSucu05button0010008Name;
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
     * @return cy_sys_block_sucu05button0010008_create_time - 创建时间
     */
    public Date getCySysBlockSucu05button0010008CreateTime() {
        return cySysBlockSucu05button0010008CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu05button0010008CreateTime 创建时间
     */
    public void setCySysBlockSucu05button0010008CreateTime(Date cySysBlockSucu05button0010008CreateTime) {
        this.cySysBlockSucu05button0010008CreateTime = cySysBlockSucu05button0010008CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu05button0010008_create_user - 创建人
     */
    public String getCySysBlockSucu05button0010008CreateUser() {
        return cySysBlockSucu05button0010008CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu05button0010008CreateUser 创建人
     */
    public void setCySysBlockSucu05button0010008CreateUser(String cySysBlockSucu05button0010008CreateUser) {
        this.cySysBlockSucu05button0010008CreateUser = cySysBlockSucu05button0010008CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu05button0010008_modify_time - 更新时间
     */
    public Date getCySysBlockSucu05button0010008ModifyTime() {
        return cySysBlockSucu05button0010008ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu05button0010008ModifyTime 更新时间
     */
    public void setCySysBlockSucu05button0010008ModifyTime(Date cySysBlockSucu05button0010008ModifyTime) {
        this.cySysBlockSucu05button0010008ModifyTime = cySysBlockSucu05button0010008ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu05button0010008_modify_user - 更新人
     */
    public String getCySysBlockSucu05button0010008ModifyUser() {
        return cySysBlockSucu05button0010008ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu05button0010008ModifyUser 更新人
     */
    public void setCySysBlockSucu05button0010008ModifyUser(String cySysBlockSucu05button0010008ModifyUser) {
        this.cySysBlockSucu05button0010008ModifyUser = cySysBlockSucu05button0010008ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu05button0010008_is_delete - 是否删除
     */
    public String getCySysBlockSucu05button0010008IsDelete() {
        return cySysBlockSucu05button0010008IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu05button0010008IsDelete 是否删除
     */
    public void setCySysBlockSucu05button0010008IsDelete(String cySysBlockSucu05button0010008IsDelete) {
        this.cySysBlockSucu05button0010008IsDelete = cySysBlockSucu05button0010008IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu05button0010008_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu05button0010008ColumnSimpleJson() {
        return cySysBlockSucu05button0010008ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu05button0010008ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu05button0010008ColumnSimpleJson(String cySysBlockSucu05button0010008ColumnSimpleJson) {
        this.cySysBlockSucu05button0010008ColumnSimpleJson = cySysBlockSucu05button0010008ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu05button0010008_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu05button0010008ColumnDetailJson() {
        return cySysBlockSucu05button0010008ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu05button0010008ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu05button0010008ColumnDetailJson(String cySysBlockSucu05button0010008ColumnDetailJson) {
        this.cySysBlockSucu05button0010008ColumnDetailJson = cySysBlockSucu05button0010008ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu05button0010008_code - 积木代码信息
     */
    public String getCySysBlockSucu05button0010008Code() {
        return cySysBlockSucu05button0010008Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu05button0010008Code 积木代码信息
     */
    public void setCySysBlockSucu05button0010008Code(String cySysBlockSucu05button0010008Code) {
        this.cySysBlockSucu05button0010008Code = cySysBlockSucu05button0010008Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu05button0010008_json_code - 还原场景信息
     */
    public String getCySysBlockSucu05button0010008JsonCode() {
        return cySysBlockSucu05button0010008JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu05button0010008JsonCode 还原场景信息
     */
    public void setCySysBlockSucu05button0010008JsonCode(String cySysBlockSucu05button0010008JsonCode) {
        this.cySysBlockSucu05button0010008JsonCode = cySysBlockSucu05button0010008JsonCode;
    }
}