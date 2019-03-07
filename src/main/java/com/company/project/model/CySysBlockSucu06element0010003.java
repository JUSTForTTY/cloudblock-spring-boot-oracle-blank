package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu06element0010003")
public class CySysBlockSucu06element0010003 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu06element0010003_id")
    private String cySysBlockSucu06element0010003Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu06element0010003_name")
    private String cySysBlockSucu06element0010003Name;

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
    @Column(name = "cy_sys_block_sucu06element0010003_create_time")
    private Date cySysBlockSucu06element0010003CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu06element0010003_create_user")
    private String cySysBlockSucu06element0010003CreateUser;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu06element0010003_modify_time")
    private Date cySysBlockSucu06element0010003ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu06element0010003_modify_user")
    private String cySysBlockSucu06element0010003ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu06element0010003_is_delete")
    private String cySysBlockSucu06element0010003IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu06element0010003_column_simple_json")
    private String cySysBlockSucu06element0010003ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu06element0010003_column_detail_json")
    private String cySysBlockSucu06element0010003ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu06element0010003_code")
    private String cySysBlockSucu06element0010003Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu06element0010003_json_code")
    private String cySysBlockSucu06element0010003JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu06element0010003_id - 编号
     */
    public String getCySysBlockSucu06element0010003Id() {
        return cySysBlockSucu06element0010003Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu06element0010003Id 编号
     */
    public void setCySysBlockSucu06element0010003Id(String cySysBlockSucu06element0010003Id) {
        this.cySysBlockSucu06element0010003Id = cySysBlockSucu06element0010003Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu06element0010003_name - 积木名称
     */
    public String getCySysBlockSucu06element0010003Name() {
        return cySysBlockSucu06element0010003Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu06element0010003Name 积木名称
     */
    public void setCySysBlockSucu06element0010003Name(String cySysBlockSucu06element0010003Name) {
        this.cySysBlockSucu06element0010003Name = cySysBlockSucu06element0010003Name;
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
     * @return cy_sys_block_sucu06element0010003_create_time - 创建时间
     */
    public Date getCySysBlockSucu06element0010003CreateTime() {
        return cySysBlockSucu06element0010003CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu06element0010003CreateTime 创建时间
     */
    public void setCySysBlockSucu06element0010003CreateTime(Date cySysBlockSucu06element0010003CreateTime) {
        this.cySysBlockSucu06element0010003CreateTime = cySysBlockSucu06element0010003CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu06element0010003_create_user - 创建人
     */
    public String getCySysBlockSucu06element0010003CreateUser() {
        return cySysBlockSucu06element0010003CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu06element0010003CreateUser 创建人
     */
    public void setCySysBlockSucu06element0010003CreateUser(String cySysBlockSucu06element0010003CreateUser) {
        this.cySysBlockSucu06element0010003CreateUser = cySysBlockSucu06element0010003CreateUser;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu06element0010003_modify_time - 更新时间
     */
    public Date getCySysBlockSucu06element0010003ModifyTime() {
        return cySysBlockSucu06element0010003ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu06element0010003ModifyTime 更新时间
     */
    public void setCySysBlockSucu06element0010003ModifyTime(Date cySysBlockSucu06element0010003ModifyTime) {
        this.cySysBlockSucu06element0010003ModifyTime = cySysBlockSucu06element0010003ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu06element0010003_modify_user - 更新人
     */
    public String getCySysBlockSucu06element0010003ModifyUser() {
        return cySysBlockSucu06element0010003ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu06element0010003ModifyUser 更新人
     */
    public void setCySysBlockSucu06element0010003ModifyUser(String cySysBlockSucu06element0010003ModifyUser) {
        this.cySysBlockSucu06element0010003ModifyUser = cySysBlockSucu06element0010003ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu06element0010003_is_delete - 是否删除
     */
    public String getCySysBlockSucu06element0010003IsDelete() {
        return cySysBlockSucu06element0010003IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu06element0010003IsDelete 是否删除
     */
    public void setCySysBlockSucu06element0010003IsDelete(String cySysBlockSucu06element0010003IsDelete) {
        this.cySysBlockSucu06element0010003IsDelete = cySysBlockSucu06element0010003IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu06element0010003_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu06element0010003ColumnSimpleJson() {
        return cySysBlockSucu06element0010003ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu06element0010003ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu06element0010003ColumnSimpleJson(String cySysBlockSucu06element0010003ColumnSimpleJson) {
        this.cySysBlockSucu06element0010003ColumnSimpleJson = cySysBlockSucu06element0010003ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu06element0010003_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu06element0010003ColumnDetailJson() {
        return cySysBlockSucu06element0010003ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu06element0010003ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu06element0010003ColumnDetailJson(String cySysBlockSucu06element0010003ColumnDetailJson) {
        this.cySysBlockSucu06element0010003ColumnDetailJson = cySysBlockSucu06element0010003ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu06element0010003_code - 积木代码信息
     */
    public String getCySysBlockSucu06element0010003Code() {
        return cySysBlockSucu06element0010003Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu06element0010003Code 积木代码信息
     */
    public void setCySysBlockSucu06element0010003Code(String cySysBlockSucu06element0010003Code) {
        this.cySysBlockSucu06element0010003Code = cySysBlockSucu06element0010003Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu06element0010003_json_code - 还原场景信息
     */
    public String getCySysBlockSucu06element0010003JsonCode() {
        return cySysBlockSucu06element0010003JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu06element0010003JsonCode 还原场景信息
     */
    public void setCySysBlockSucu06element0010003JsonCode(String cySysBlockSucu06element0010003JsonCode) {
        this.cySysBlockSucu06element0010003JsonCode = cySysBlockSucu06element0010003JsonCode;
    }
}