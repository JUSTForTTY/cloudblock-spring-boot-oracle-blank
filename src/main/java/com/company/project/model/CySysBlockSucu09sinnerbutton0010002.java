package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu09sinnerbutton0010002")
public class CySysBlockSucu09sinnerbutton0010002 {
    @Id
    @Column(name = "cy_sys_block_sucu09sinnerbutton0010002_id")
    private String cySysBlockSucu09sinnerbutton0010002Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu09sinnerbutton0010002_name")
    private String cySysBlockSucu09sinnerbutton0010002Name;

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
    @Column(name = "cy_sys_block_sucu09sinnerbutton0010002_create_time")
    private Date cySysBlockSucu09sinnerbutton0010002CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu09sinnerbutton0010002_create_user")
    private String cySysBlockSucu09sinnerbutton0010002CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu09sinnerbutton0010002_modify_time")
    private Date cySysBlockSucu09sinnerbutton0010002ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu09sinnerbutton0010002_modify_user")
    private String cySysBlockSucu09sinnerbutton0010002ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu09sinnerbutton0010002_is_delete")
    private String cySysBlockSucu09sinnerbutton0010002IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu09sinnerbutton0010002_column_simple_json")
    private String cySysBlockSucu09sinnerbutton0010002ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu09sinnerbutton0010002_column_detail_json")
    private String cySysBlockSucu09sinnerbutton0010002ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu09sinnerbutton0010002_code")
    private String cySysBlockSucu09sinnerbutton0010002Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu09sinnerbutton0010002_json_code")
    private String cySysBlockSucu09sinnerbutton0010002JsonCode;

    /**
     * @return cy_sys_block_sucu09sinnerbutton0010002_id
     */
    public String getCySysBlockSucu09sinnerbutton0010002Id() {
        return cySysBlockSucu09sinnerbutton0010002Id;
    }

    /**
     * @param cySysBlockSucu09sinnerbutton0010002Id
     */
    public void setCySysBlockSucu09sinnerbutton0010002Id(String cySysBlockSucu09sinnerbutton0010002Id) {
        this.cySysBlockSucu09sinnerbutton0010002Id = cySysBlockSucu09sinnerbutton0010002Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu09sinnerbutton0010002_name - 积木名称
     */
    public String getCySysBlockSucu09sinnerbutton0010002Name() {
        return cySysBlockSucu09sinnerbutton0010002Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu09sinnerbutton0010002Name 积木名称
     */
    public void setCySysBlockSucu09sinnerbutton0010002Name(String cySysBlockSucu09sinnerbutton0010002Name) {
        this.cySysBlockSucu09sinnerbutton0010002Name = cySysBlockSucu09sinnerbutton0010002Name;
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
     * @return cy_sys_block_sucu09sinnerbutton0010002_create_time - 创建时间
     */
    public Date getCySysBlockSucu09sinnerbutton0010002CreateTime() {
        return cySysBlockSucu09sinnerbutton0010002CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu09sinnerbutton0010002CreateTime 创建时间
     */
    public void setCySysBlockSucu09sinnerbutton0010002CreateTime(Date cySysBlockSucu09sinnerbutton0010002CreateTime) {
        this.cySysBlockSucu09sinnerbutton0010002CreateTime = cySysBlockSucu09sinnerbutton0010002CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu09sinnerbutton0010002_create_user - 创建人
     */
    public String getCySysBlockSucu09sinnerbutton0010002CreateUser() {
        return cySysBlockSucu09sinnerbutton0010002CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu09sinnerbutton0010002CreateUser 创建人
     */
    public void setCySysBlockSucu09sinnerbutton0010002CreateUser(String cySysBlockSucu09sinnerbutton0010002CreateUser) {
        this.cySysBlockSucu09sinnerbutton0010002CreateUser = cySysBlockSucu09sinnerbutton0010002CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu09sinnerbutton0010002_modify_time - 更新时间
     */
    public Date getCySysBlockSucu09sinnerbutton0010002ModifyTime() {
        return cySysBlockSucu09sinnerbutton0010002ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu09sinnerbutton0010002ModifyTime 更新时间
     */
    public void setCySysBlockSucu09sinnerbutton0010002ModifyTime(Date cySysBlockSucu09sinnerbutton0010002ModifyTime) {
        this.cySysBlockSucu09sinnerbutton0010002ModifyTime = cySysBlockSucu09sinnerbutton0010002ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu09sinnerbutton0010002_modify_user - 更新人
     */
    public String getCySysBlockSucu09sinnerbutton0010002ModifyUser() {
        return cySysBlockSucu09sinnerbutton0010002ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu09sinnerbutton0010002ModifyUser 更新人
     */
    public void setCySysBlockSucu09sinnerbutton0010002ModifyUser(String cySysBlockSucu09sinnerbutton0010002ModifyUser) {
        this.cySysBlockSucu09sinnerbutton0010002ModifyUser = cySysBlockSucu09sinnerbutton0010002ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu09sinnerbutton0010002_is_delete - 是否删除
     */
    public String getCySysBlockSucu09sinnerbutton0010002IsDelete() {
        return cySysBlockSucu09sinnerbutton0010002IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu09sinnerbutton0010002IsDelete 是否删除
     */
    public void setCySysBlockSucu09sinnerbutton0010002IsDelete(String cySysBlockSucu09sinnerbutton0010002IsDelete) {
        this.cySysBlockSucu09sinnerbutton0010002IsDelete = cySysBlockSucu09sinnerbutton0010002IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu09sinnerbutton0010002_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu09sinnerbutton0010002ColumnSimpleJson() {
        return cySysBlockSucu09sinnerbutton0010002ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu09sinnerbutton0010002ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu09sinnerbutton0010002ColumnSimpleJson(String cySysBlockSucu09sinnerbutton0010002ColumnSimpleJson) {
        this.cySysBlockSucu09sinnerbutton0010002ColumnSimpleJson = cySysBlockSucu09sinnerbutton0010002ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu09sinnerbutton0010002_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu09sinnerbutton0010002ColumnDetailJson() {
        return cySysBlockSucu09sinnerbutton0010002ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu09sinnerbutton0010002ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu09sinnerbutton0010002ColumnDetailJson(String cySysBlockSucu09sinnerbutton0010002ColumnDetailJson) {
        this.cySysBlockSucu09sinnerbutton0010002ColumnDetailJson = cySysBlockSucu09sinnerbutton0010002ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu09sinnerbutton0010002_code - 积木代码信息
     */
    public String getCySysBlockSucu09sinnerbutton0010002Code() {
        return cySysBlockSucu09sinnerbutton0010002Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu09sinnerbutton0010002Code 积木代码信息
     */
    public void setCySysBlockSucu09sinnerbutton0010002Code(String cySysBlockSucu09sinnerbutton0010002Code) {
        this.cySysBlockSucu09sinnerbutton0010002Code = cySysBlockSucu09sinnerbutton0010002Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu09sinnerbutton0010002_json_code - 还原场景信息
     */
    public String getCySysBlockSucu09sinnerbutton0010002JsonCode() {
        return cySysBlockSucu09sinnerbutton0010002JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu09sinnerbutton0010002JsonCode 还原场景信息
     */
    public void setCySysBlockSucu09sinnerbutton0010002JsonCode(String cySysBlockSucu09sinnerbutton0010002JsonCode) {
        this.cySysBlockSucu09sinnerbutton0010002JsonCode = cySysBlockSucu09sinnerbutton0010002JsonCode;
    }
}