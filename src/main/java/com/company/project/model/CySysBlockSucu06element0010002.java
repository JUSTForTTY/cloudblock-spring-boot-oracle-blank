package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu06element0010002")
public class CySysBlockSucu06element0010002 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu06element0010002_id")
    private String cySysBlockSucu06element0010002Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu06element0010002_name")
    private String cySysBlockSucu06element0010002Name;

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
    @Column(name = "cy_sys_block_sucu06element0010002_create_time")
    private Date cySysBlockSucu06element0010002CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu06element0010002_create_user")
    private String cySysBlockSucu06element0010002CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu06element0010002_modify_time")
    private Date cySysBlockSucu06element0010002ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu06element0010002_modify_user")
    private String cySysBlockSucu06element0010002ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu06element0010002_is_delete")
    private String cySysBlockSucu06element0010002IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu06element0010002_column_simple_json")
    private String cySysBlockSucu06element0010002ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu06element0010002_column_detail_json")
    private String cySysBlockSucu06element0010002ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu06element0010002_code")
    private String cySysBlockSucu06element0010002Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu06element0010002_json_code")
    private String cySysBlockSucu06element0010002JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu06element0010002_id - 编号
     */
    public String getCySysBlockSucu06element0010002Id() {
        return cySysBlockSucu06element0010002Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu06element0010002Id 编号
     */
    public void setCySysBlockSucu06element0010002Id(String cySysBlockSucu06element0010002Id) {
        this.cySysBlockSucu06element0010002Id = cySysBlockSucu06element0010002Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu06element0010002_name - 积木名称
     */
    public String getCySysBlockSucu06element0010002Name() {
        return cySysBlockSucu06element0010002Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu06element0010002Name 积木名称
     */
    public void setCySysBlockSucu06element0010002Name(String cySysBlockSucu06element0010002Name) {
        this.cySysBlockSucu06element0010002Name = cySysBlockSucu06element0010002Name;
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
     * @return cy_sys_block_sucu06element0010002_create_time - 创建时间
     */
    public Date getCySysBlockSucu06element0010002CreateTime() {
        return cySysBlockSucu06element0010002CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu06element0010002CreateTime 创建时间
     */
    public void setCySysBlockSucu06element0010002CreateTime(Date cySysBlockSucu06element0010002CreateTime) {
        this.cySysBlockSucu06element0010002CreateTime = cySysBlockSucu06element0010002CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu06element0010002_create_user - 创建人
     */
    public String getCySysBlockSucu06element0010002CreateUser() {
        return cySysBlockSucu06element0010002CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu06element0010002CreateUser 创建人
     */
    public void setCySysBlockSucu06element0010002CreateUser(String cySysBlockSucu06element0010002CreateUser) {
        this.cySysBlockSucu06element0010002CreateUser = cySysBlockSucu06element0010002CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu06element0010002_modify_time - 更新时间
     */
    public Date getCySysBlockSucu06element0010002ModifyTime() {
        return cySysBlockSucu06element0010002ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu06element0010002ModifyTime 更新时间
     */
    public void setCySysBlockSucu06element0010002ModifyTime(Date cySysBlockSucu06element0010002ModifyTime) {
        this.cySysBlockSucu06element0010002ModifyTime = cySysBlockSucu06element0010002ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu06element0010002_modify_user - 更新人
     */
    public String getCySysBlockSucu06element0010002ModifyUser() {
        return cySysBlockSucu06element0010002ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu06element0010002ModifyUser 更新人
     */
    public void setCySysBlockSucu06element0010002ModifyUser(String cySysBlockSucu06element0010002ModifyUser) {
        this.cySysBlockSucu06element0010002ModifyUser = cySysBlockSucu06element0010002ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu06element0010002_is_delete - 是否删除
     */
    public String getCySysBlockSucu06element0010002IsDelete() {
        return cySysBlockSucu06element0010002IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu06element0010002IsDelete 是否删除
     */
    public void setCySysBlockSucu06element0010002IsDelete(String cySysBlockSucu06element0010002IsDelete) {
        this.cySysBlockSucu06element0010002IsDelete = cySysBlockSucu06element0010002IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu06element0010002_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu06element0010002ColumnSimpleJson() {
        return cySysBlockSucu06element0010002ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu06element0010002ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu06element0010002ColumnSimpleJson(String cySysBlockSucu06element0010002ColumnSimpleJson) {
        this.cySysBlockSucu06element0010002ColumnSimpleJson = cySysBlockSucu06element0010002ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu06element0010002_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu06element0010002ColumnDetailJson() {
        return cySysBlockSucu06element0010002ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu06element0010002ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu06element0010002ColumnDetailJson(String cySysBlockSucu06element0010002ColumnDetailJson) {
        this.cySysBlockSucu06element0010002ColumnDetailJson = cySysBlockSucu06element0010002ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu06element0010002_code - 积木代码信息
     */
    public String getCySysBlockSucu06element0010002Code() {
        return cySysBlockSucu06element0010002Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu06element0010002Code 积木代码信息
     */
    public void setCySysBlockSucu06element0010002Code(String cySysBlockSucu06element0010002Code) {
        this.cySysBlockSucu06element0010002Code = cySysBlockSucu06element0010002Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu06element0010002_json_code - 还原场景信息
     */
    public String getCySysBlockSucu06element0010002JsonCode() {
        return cySysBlockSucu06element0010002JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu06element0010002JsonCode 还原场景信息
     */
    public void setCySysBlockSucu06element0010002JsonCode(String cySysBlockSucu06element0010002JsonCode) {
        this.cySysBlockSucu06element0010002JsonCode = cySysBlockSucu06element0010002JsonCode;
    }
}