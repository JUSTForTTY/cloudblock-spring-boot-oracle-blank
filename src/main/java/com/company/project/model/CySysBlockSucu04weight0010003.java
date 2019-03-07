package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu04weight0010003")
public class CySysBlockSucu04weight0010003 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu04weight0010003_id")
    private String cySysBlockSucu04weight0010003Id;

    /**
     * 名称
     */
    @Column(name = "cy_sys_block_sucu04weight0010003_name")
    private String cySysBlockSucu04weight0010003Name;

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
    @Column(name = "cy_sys_block_sucu04weight0010003_is_delete")
    private String cySysBlockSucu04weight0010003IsDelete;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu04weight0010003_create_user")
    private String cySysBlockSucu04weight0010003CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu04weight0010003_modify_user")
    private String cySysBlockSucu04weight0010003ModifyUser;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu04weight0010003_create_time")
    private Date cySysBlockSucu04weight0010003CreateTime;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu04weight0010003_modify_time")
    private Date cySysBlockSucu04weight0010003ModifyTime;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu04weight0010003_column_simple_json")
    private String cySysBlockSucu04weight0010003ColumnSimpleJson;

    /**
     * 数据详细数组
     */
    @Column(name = "cy_sys_block_sucu04weight0010003_column_detail_json")
    private String cySysBlockSucu04weight0010003ColumnDetailJson;

    /**
     * 代码信息
     */
    @Column(name = "cy_sys_block_sucu04weight0010003_code")
    private String cySysBlockSucu04weight0010003Code;

    /**
     * 详细json代码
     */
    @Column(name = "cy_sys_block_sucu04weight0010003_json_code")
    private String cySysBlockSucu04weight0010003JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu04weight0010003_id - 编号
     */
    public String getCySysBlockSucu04weight0010003Id() {
        return cySysBlockSucu04weight0010003Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu04weight0010003Id 编号
     */
    public void setCySysBlockSucu04weight0010003Id(String cySysBlockSucu04weight0010003Id) {
        this.cySysBlockSucu04weight0010003Id = cySysBlockSucu04weight0010003Id;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_block_sucu04weight0010003_name - 名称
     */
    public String getCySysBlockSucu04weight0010003Name() {
        return cySysBlockSucu04weight0010003Name;
    }

    /**
     * 设置名称
     *
     * @param cySysBlockSucu04weight0010003Name 名称
     */
    public void setCySysBlockSucu04weight0010003Name(String cySysBlockSucu04weight0010003Name) {
        this.cySysBlockSucu04weight0010003Name = cySysBlockSucu04weight0010003Name;
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
     * @return cy_sys_block_sucu04weight0010003_is_delete - 是否删除
     */
    public String getCySysBlockSucu04weight0010003IsDelete() {
        return cySysBlockSucu04weight0010003IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu04weight0010003IsDelete 是否删除
     */
    public void setCySysBlockSucu04weight0010003IsDelete(String cySysBlockSucu04weight0010003IsDelete) {
        this.cySysBlockSucu04weight0010003IsDelete = cySysBlockSucu04weight0010003IsDelete;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu04weight0010003_create_user - 创建人
     */
    public String getCySysBlockSucu04weight0010003CreateUser() {
        return cySysBlockSucu04weight0010003CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu04weight0010003CreateUser 创建人
     */
    public void setCySysBlockSucu04weight0010003CreateUser(String cySysBlockSucu04weight0010003CreateUser) {
        this.cySysBlockSucu04weight0010003CreateUser = cySysBlockSucu04weight0010003CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu04weight0010003_modify_user - 更新人
     */
    public String getCySysBlockSucu04weight0010003ModifyUser() {
        return cySysBlockSucu04weight0010003ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu04weight0010003ModifyUser 更新人
     */
    public void setCySysBlockSucu04weight0010003ModifyUser(String cySysBlockSucu04weight0010003ModifyUser) {
        this.cySysBlockSucu04weight0010003ModifyUser = cySysBlockSucu04weight0010003ModifyUser;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu04weight0010003_create_time - 创建时间
     */
    public Date getCySysBlockSucu04weight0010003CreateTime() {
        return cySysBlockSucu04weight0010003CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu04weight0010003CreateTime 创建时间
     */
    public void setCySysBlockSucu04weight0010003CreateTime(Date cySysBlockSucu04weight0010003CreateTime) {
        this.cySysBlockSucu04weight0010003CreateTime = cySysBlockSucu04weight0010003CreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu04weight0010003_modify_time - 更新时间
     */
    public Date getCySysBlockSucu04weight0010003ModifyTime() {
        return cySysBlockSucu04weight0010003ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu04weight0010003ModifyTime 更新时间
     */
    public void setCySysBlockSucu04weight0010003ModifyTime(Date cySysBlockSucu04weight0010003ModifyTime) {
        this.cySysBlockSucu04weight0010003ModifyTime = cySysBlockSucu04weight0010003ModifyTime;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu04weight0010003_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu04weight0010003ColumnSimpleJson() {
        return cySysBlockSucu04weight0010003ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu04weight0010003ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu04weight0010003ColumnSimpleJson(String cySysBlockSucu04weight0010003ColumnSimpleJson) {
        this.cySysBlockSucu04weight0010003ColumnSimpleJson = cySysBlockSucu04weight0010003ColumnSimpleJson;
    }

    /**
     * 获取数据详细数组
     *
     * @return cy_sys_block_sucu04weight0010003_column_detail_json - 数据详细数组
     */
    public String getCySysBlockSucu04weight0010003ColumnDetailJson() {
        return cySysBlockSucu04weight0010003ColumnDetailJson;
    }

    /**
     * 设置数据详细数组
     *
     * @param cySysBlockSucu04weight0010003ColumnDetailJson 数据详细数组
     */
    public void setCySysBlockSucu04weight0010003ColumnDetailJson(String cySysBlockSucu04weight0010003ColumnDetailJson) {
        this.cySysBlockSucu04weight0010003ColumnDetailJson = cySysBlockSucu04weight0010003ColumnDetailJson;
    }

    /**
     * 获取代码信息
     *
     * @return cy_sys_block_sucu04weight0010003_code - 代码信息
     */
    public String getCySysBlockSucu04weight0010003Code() {
        return cySysBlockSucu04weight0010003Code;
    }

    /**
     * 设置代码信息
     *
     * @param cySysBlockSucu04weight0010003Code 代码信息
     */
    public void setCySysBlockSucu04weight0010003Code(String cySysBlockSucu04weight0010003Code) {
        this.cySysBlockSucu04weight0010003Code = cySysBlockSucu04weight0010003Code;
    }

    /**
     * 获取详细json代码
     *
     * @return cy_sys_block_sucu04weight0010003_json_code - 详细json代码
     */
    public String getCySysBlockSucu04weight0010003JsonCode() {
        return cySysBlockSucu04weight0010003JsonCode;
    }

    /**
     * 设置详细json代码
     *
     * @param cySysBlockSucu04weight0010003JsonCode 详细json代码
     */
    public void setCySysBlockSucu04weight0010003JsonCode(String cySysBlockSucu04weight0010003JsonCode) {
        this.cySysBlockSucu04weight0010003JsonCode = cySysBlockSucu04weight0010003JsonCode;
    }
}