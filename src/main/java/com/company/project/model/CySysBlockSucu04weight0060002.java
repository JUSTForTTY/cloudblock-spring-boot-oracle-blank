package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu04weight0060002")
public class CySysBlockSucu04weight0060002 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu04weight0060002_id")
    private String cySysBlockSucu04weight0060002Id;

    /**
     * 名称
     */
    @Column(name = "cy_sys_block_sucu04weight0060002_name")
    private String cySysBlockSucu04weight0060002Name;

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
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu04weight0060002_is_delete")
    private String cySysBlockSucu04weight0060002IsDelete;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu04weight0060002_create_user")
    private String cySysBlockSucu04weight0060002CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu04weight0060002_modify_user")
    private String cySysBlockSucu04weight0060002ModifyUser;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu04weight0060002_create_time")
    private Date cySysBlockSucu04weight0060002CreateTime;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu04weight0060002_modify_time")
    private Date cySysBlockSucu04weight0060002ModifyTime;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu04weight0060002_column_simple_json")
    private String cySysBlockSucu04weight0060002ColumnSimpleJson;

    /**
     * 数据详细数组
     */
    @Column(name = "cy_sys_block_sucu04weight0060002_column_detail_json")
    private String cySysBlockSucu04weight0060002ColumnDetailJson;

    /**
     * 代码信息
     */
    @Column(name = "cy_sys_block_sucu04weight0060002_code")
    private String cySysBlockSucu04weight0060002Code;

    /**
     * 详细json代码
     */
    @Column(name = "cy_sys_block_sucu04weight0060002_json_code")
    private String cySysBlockSucu04weight0060002JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu04weight0060002_id - 编号
     */
    public String getCySysBlockSucu04weight0060002Id() {
        return cySysBlockSucu04weight0060002Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu04weight0060002Id 编号
     */
    public void setCySysBlockSucu04weight0060002Id(String cySysBlockSucu04weight0060002Id) {
        this.cySysBlockSucu04weight0060002Id = cySysBlockSucu04weight0060002Id;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_block_sucu04weight0060002_name - 名称
     */
    public String getCySysBlockSucu04weight0060002Name() {
        return cySysBlockSucu04weight0060002Name;
    }

    /**
     * 设置名称
     *
     * @param cySysBlockSucu04weight0060002Name 名称
     */
    public void setCySysBlockSucu04weight0060002Name(String cySysBlockSucu04weight0060002Name) {
        this.cySysBlockSucu04weight0060002Name = cySysBlockSucu04weight0060002Name;
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
     * 获取是否删除
     *
     * @return cy_sys_block_sucu04weight0060002_is_delete - 是否删除
     */
    public String getCySysBlockSucu04weight0060002IsDelete() {
        return cySysBlockSucu04weight0060002IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu04weight0060002IsDelete 是否删除
     */
    public void setCySysBlockSucu04weight0060002IsDelete(String cySysBlockSucu04weight0060002IsDelete) {
        this.cySysBlockSucu04weight0060002IsDelete = cySysBlockSucu04weight0060002IsDelete;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu04weight0060002_create_user - 创建人
     */
    public String getCySysBlockSucu04weight0060002CreateUser() {
        return cySysBlockSucu04weight0060002CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu04weight0060002CreateUser 创建人
     */
    public void setCySysBlockSucu04weight0060002CreateUser(String cySysBlockSucu04weight0060002CreateUser) {
        this.cySysBlockSucu04weight0060002CreateUser = cySysBlockSucu04weight0060002CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu04weight0060002_modify_user - 更新人
     */
    public String getCySysBlockSucu04weight0060002ModifyUser() {
        return cySysBlockSucu04weight0060002ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu04weight0060002ModifyUser 更新人
     */
    public void setCySysBlockSucu04weight0060002ModifyUser(String cySysBlockSucu04weight0060002ModifyUser) {
        this.cySysBlockSucu04weight0060002ModifyUser = cySysBlockSucu04weight0060002ModifyUser;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu04weight0060002_create_time - 创建时间
     */
    public Date getCySysBlockSucu04weight0060002CreateTime() {
        return cySysBlockSucu04weight0060002CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu04weight0060002CreateTime 创建时间
     */
    public void setCySysBlockSucu04weight0060002CreateTime(Date cySysBlockSucu04weight0060002CreateTime) {
        this.cySysBlockSucu04weight0060002CreateTime = cySysBlockSucu04weight0060002CreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu04weight0060002_modify_time - 更新时间
     */
    public Date getCySysBlockSucu04weight0060002ModifyTime() {
        return cySysBlockSucu04weight0060002ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu04weight0060002ModifyTime 更新时间
     */
    public void setCySysBlockSucu04weight0060002ModifyTime(Date cySysBlockSucu04weight0060002ModifyTime) {
        this.cySysBlockSucu04weight0060002ModifyTime = cySysBlockSucu04weight0060002ModifyTime;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu04weight0060002_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu04weight0060002ColumnSimpleJson() {
        return cySysBlockSucu04weight0060002ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu04weight0060002ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu04weight0060002ColumnSimpleJson(String cySysBlockSucu04weight0060002ColumnSimpleJson) {
        this.cySysBlockSucu04weight0060002ColumnSimpleJson = cySysBlockSucu04weight0060002ColumnSimpleJson;
    }

    /**
     * 获取数据详细数组
     *
     * @return cy_sys_block_sucu04weight0060002_column_detail_json - 数据详细数组
     */
    public String getCySysBlockSucu04weight0060002ColumnDetailJson() {
        return cySysBlockSucu04weight0060002ColumnDetailJson;
    }

    /**
     * 设置数据详细数组
     *
     * @param cySysBlockSucu04weight0060002ColumnDetailJson 数据详细数组
     */
    public void setCySysBlockSucu04weight0060002ColumnDetailJson(String cySysBlockSucu04weight0060002ColumnDetailJson) {
        this.cySysBlockSucu04weight0060002ColumnDetailJson = cySysBlockSucu04weight0060002ColumnDetailJson;
    }

    /**
     * 获取代码信息
     *
     * @return cy_sys_block_sucu04weight0060002_code - 代码信息
     */
    public String getCySysBlockSucu04weight0060002Code() {
        return cySysBlockSucu04weight0060002Code;
    }

    /**
     * 设置代码信息
     *
     * @param cySysBlockSucu04weight0060002Code 代码信息
     */
    public void setCySysBlockSucu04weight0060002Code(String cySysBlockSucu04weight0060002Code) {
        this.cySysBlockSucu04weight0060002Code = cySysBlockSucu04weight0060002Code;
    }

    /**
     * 获取详细json代码
     *
     * @return cy_sys_block_sucu04weight0060002_json_code - 详细json代码
     */
    public String getCySysBlockSucu04weight0060002JsonCode() {
        return cySysBlockSucu04weight0060002JsonCode;
    }

    /**
     * 设置详细json代码
     *
     * @param cySysBlockSucu04weight0060002JsonCode 详细json代码
     */
    public void setCySysBlockSucu04weight0060002JsonCode(String cySysBlockSucu04weight0060002JsonCode) {
        this.cySysBlockSucu04weight0060002JsonCode = cySysBlockSucu04weight0060002JsonCode;
    }
}