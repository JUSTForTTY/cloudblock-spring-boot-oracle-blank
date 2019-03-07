package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu04weight0010001")
public class CySysBlockSucu04weight0010001 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu04weight0010001_id")
    private String cySysBlockSucu04weight0010001Id;

    /**
     * 名称
     */
    @Column(name = "cy_sys_block_sucu04weight0010001_name")
    private String cySysBlockSucu04weight0010001Name;

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
    @Column(name = "cy_sys_block_sucu04weight0010001_is_delete")
    private String cySysBlockSucu04weight0010001IsDelete;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu04weight0010001_create_user")
    private String cySysBlockSucu04weight0010001CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu04weight0010001_modify_user")
    private String cySysBlockSucu04weight0010001ModifyUser;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu04weight0010001_create_time")
    private Date cySysBlockSucu04weight0010001CreateTime;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu04weight0010001_modify_time")
    private Date cySysBlockSucu04weight0010001ModifyTime;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu04weight0010001_column_simple_json")
    private String cySysBlockSucu04weight0010001ColumnSimpleJson;

    /**
     * 数据详细数组
     */
    @Column(name = "cy_sys_block_sucu04weight0010001_column_detail_json")
    private String cySysBlockSucu04weight0010001ColumnDetailJson;

    /**
     * 代码信息
     */
    @Column(name = "cy_sys_block_sucu04weight0010001_code")
    private String cySysBlockSucu04weight0010001Code;

    /**
     * 详细json代码
     */
    @Column(name = "cy_sys_block_sucu04weight0010001_json_code")
    private String cySysBlockSucu04weight0010001JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu04weight0010001_id - 编号
     */
    public String getCySysBlockSucu04weight0010001Id() {
        return cySysBlockSucu04weight0010001Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu04weight0010001Id 编号
     */
    public void setCySysBlockSucu04weight0010001Id(String cySysBlockSucu04weight0010001Id) {
        this.cySysBlockSucu04weight0010001Id = cySysBlockSucu04weight0010001Id;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_block_sucu04weight0010001_name - 名称
     */
    public String getCySysBlockSucu04weight0010001Name() {
        return cySysBlockSucu04weight0010001Name;
    }

    /**
     * 设置名称
     *
     * @param cySysBlockSucu04weight0010001Name 名称
     */
    public void setCySysBlockSucu04weight0010001Name(String cySysBlockSucu04weight0010001Name) {
        this.cySysBlockSucu04weight0010001Name = cySysBlockSucu04weight0010001Name;
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
     * @return cy_sys_block_sucu04weight0010001_is_delete - 是否删除
     */
    public String getCySysBlockSucu04weight0010001IsDelete() {
        return cySysBlockSucu04weight0010001IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu04weight0010001IsDelete 是否删除
     */
    public void setCySysBlockSucu04weight0010001IsDelete(String cySysBlockSucu04weight0010001IsDelete) {
        this.cySysBlockSucu04weight0010001IsDelete = cySysBlockSucu04weight0010001IsDelete;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu04weight0010001_create_user - 创建人
     */
    public String getCySysBlockSucu04weight0010001CreateUser() {
        return cySysBlockSucu04weight0010001CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu04weight0010001CreateUser 创建人
     */
    public void setCySysBlockSucu04weight0010001CreateUser(String cySysBlockSucu04weight0010001CreateUser) {
        this.cySysBlockSucu04weight0010001CreateUser = cySysBlockSucu04weight0010001CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu04weight0010001_modify_user - 更新人
     */
    public String getCySysBlockSucu04weight0010001ModifyUser() {
        return cySysBlockSucu04weight0010001ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu04weight0010001ModifyUser 更新人
     */
    public void setCySysBlockSucu04weight0010001ModifyUser(String cySysBlockSucu04weight0010001ModifyUser) {
        this.cySysBlockSucu04weight0010001ModifyUser = cySysBlockSucu04weight0010001ModifyUser;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu04weight0010001_create_time - 创建时间
     */
    public Date getCySysBlockSucu04weight0010001CreateTime() {
        return cySysBlockSucu04weight0010001CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu04weight0010001CreateTime 创建时间
     */
    public void setCySysBlockSucu04weight0010001CreateTime(Date cySysBlockSucu04weight0010001CreateTime) {
        this.cySysBlockSucu04weight0010001CreateTime = cySysBlockSucu04weight0010001CreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu04weight0010001_modify_time - 更新时间
     */
    public Date getCySysBlockSucu04weight0010001ModifyTime() {
        return cySysBlockSucu04weight0010001ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu04weight0010001ModifyTime 更新时间
     */
    public void setCySysBlockSucu04weight0010001ModifyTime(Date cySysBlockSucu04weight0010001ModifyTime) {
        this.cySysBlockSucu04weight0010001ModifyTime = cySysBlockSucu04weight0010001ModifyTime;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu04weight0010001_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu04weight0010001ColumnSimpleJson() {
        return cySysBlockSucu04weight0010001ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu04weight0010001ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu04weight0010001ColumnSimpleJson(String cySysBlockSucu04weight0010001ColumnSimpleJson) {
        this.cySysBlockSucu04weight0010001ColumnSimpleJson = cySysBlockSucu04weight0010001ColumnSimpleJson;
    }

    /**
     * 获取数据详细数组
     *
     * @return cy_sys_block_sucu04weight0010001_column_detail_json - 数据详细数组
     */
    public String getCySysBlockSucu04weight0010001ColumnDetailJson() {
        return cySysBlockSucu04weight0010001ColumnDetailJson;
    }

    /**
     * 设置数据详细数组
     *
     * @param cySysBlockSucu04weight0010001ColumnDetailJson 数据详细数组
     */
    public void setCySysBlockSucu04weight0010001ColumnDetailJson(String cySysBlockSucu04weight0010001ColumnDetailJson) {
        this.cySysBlockSucu04weight0010001ColumnDetailJson = cySysBlockSucu04weight0010001ColumnDetailJson;
    }

    /**
     * 获取代码信息
     *
     * @return cy_sys_block_sucu04weight0010001_code - 代码信息
     */
    public String getCySysBlockSucu04weight0010001Code() {
        return cySysBlockSucu04weight0010001Code;
    }

    /**
     * 设置代码信息
     *
     * @param cySysBlockSucu04weight0010001Code 代码信息
     */
    public void setCySysBlockSucu04weight0010001Code(String cySysBlockSucu04weight0010001Code) {
        this.cySysBlockSucu04weight0010001Code = cySysBlockSucu04weight0010001Code;
    }

    /**
     * 获取详细json代码
     *
     * @return cy_sys_block_sucu04weight0010001_json_code - 详细json代码
     */
    public String getCySysBlockSucu04weight0010001JsonCode() {
        return cySysBlockSucu04weight0010001JsonCode;
    }

    /**
     * 设置详细json代码
     *
     * @param cySysBlockSucu04weight0010001JsonCode 详细json代码
     */
    public void setCySysBlockSucu04weight0010001JsonCode(String cySysBlockSucu04weight0010001JsonCode) {
        this.cySysBlockSucu04weight0010001JsonCode = cySysBlockSucu04weight0010001JsonCode;
    }
}