package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu08searchweiget0030003")
public class CySysBlockSucu08searchweiget0030003 {
    @Id
    @Column(name = "cy_sys_block_sucu08searchweiget0030003_id")
    private String cySysBlockSucu08searchweiget0030003Id;

    /**
     * 积木名称
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0030003_name")
    private String cySysBlockSucu08searchweiget0030003Name;

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
    @Column(name = "cy_sys_block_sucu08searchweiget0030003_create_time")
    private Date cySysBlockSucu08searchweiget0030003CreateTime;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0030003_create_user")
    private String cySysBlockSucu08searchweiget0030003CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0030003_modify_time")
    private Date cySysBlockSucu08searchweiget0030003ModifyTime;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0030003_modify_user")
    private String cySysBlockSucu08searchweiget0030003ModifyUser;

    /**
     * 是否删除
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0030003_is_delete")
    private String cySysBlockSucu08searchweiget0030003IsDelete;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0030003_column_simple_json")
    private String cySysBlockSucu08searchweiget0030003ColumnSimpleJson;

    /**
     * 字段详细数组
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0030003_column_detail_json")
    private String cySysBlockSucu08searchweiget0030003ColumnDetailJson;

    /**
     * 积木代码信息
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0030003_code")
    private String cySysBlockSucu08searchweiget0030003Code;

    /**
     * 还原场景信息
     */
    @Column(name = "cy_sys_block_sucu08searchweiget0030003_json_code")
    private String cySysBlockSucu08searchweiget0030003JsonCode;

    /**
     * @return cy_sys_block_sucu08searchweiget0030003_id
     */
    public String getCySysBlockSucu08searchweiget0030003Id() {
        return cySysBlockSucu08searchweiget0030003Id;
    }

    /**
     * @param cySysBlockSucu08searchweiget0030003Id
     */
    public void setCySysBlockSucu08searchweiget0030003Id(String cySysBlockSucu08searchweiget0030003Id) {
        this.cySysBlockSucu08searchweiget0030003Id = cySysBlockSucu08searchweiget0030003Id;
    }

    /**
     * 获取积木名称
     *
     * @return cy_sys_block_sucu08searchweiget0030003_name - 积木名称
     */
    public String getCySysBlockSucu08searchweiget0030003Name() {
        return cySysBlockSucu08searchweiget0030003Name;
    }

    /**
     * 设置积木名称
     *
     * @param cySysBlockSucu08searchweiget0030003Name 积木名称
     */
    public void setCySysBlockSucu08searchweiget0030003Name(String cySysBlockSucu08searchweiget0030003Name) {
        this.cySysBlockSucu08searchweiget0030003Name = cySysBlockSucu08searchweiget0030003Name;
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
     * @return cy_sys_block_sucu08searchweiget0030003_create_time - 创建时间
     */
    public Date getCySysBlockSucu08searchweiget0030003CreateTime() {
        return cySysBlockSucu08searchweiget0030003CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu08searchweiget0030003CreateTime 创建时间
     */
    public void setCySysBlockSucu08searchweiget0030003CreateTime(Date cySysBlockSucu08searchweiget0030003CreateTime) {
        this.cySysBlockSucu08searchweiget0030003CreateTime = cySysBlockSucu08searchweiget0030003CreateTime;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu08searchweiget0030003_create_user - 创建人
     */
    public String getCySysBlockSucu08searchweiget0030003CreateUser() {
        return cySysBlockSucu08searchweiget0030003CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu08searchweiget0030003CreateUser 创建人
     */
    public void setCySysBlockSucu08searchweiget0030003CreateUser(String cySysBlockSucu08searchweiget0030003CreateUser) {
        this.cySysBlockSucu08searchweiget0030003CreateUser = cySysBlockSucu08searchweiget0030003CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu08searchweiget0030003_modify_time - 更新人
     */
    public Date getCySysBlockSucu08searchweiget0030003ModifyTime() {
        return cySysBlockSucu08searchweiget0030003ModifyTime;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu08searchweiget0030003ModifyTime 更新人
     */
    public void setCySysBlockSucu08searchweiget0030003ModifyTime(Date cySysBlockSucu08searchweiget0030003ModifyTime) {
        this.cySysBlockSucu08searchweiget0030003ModifyTime = cySysBlockSucu08searchweiget0030003ModifyTime;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu08searchweiget0030003_modify_user - 更新人
     */
    public String getCySysBlockSucu08searchweiget0030003ModifyUser() {
        return cySysBlockSucu08searchweiget0030003ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu08searchweiget0030003ModifyUser 更新人
     */
    public void setCySysBlockSucu08searchweiget0030003ModifyUser(String cySysBlockSucu08searchweiget0030003ModifyUser) {
        this.cySysBlockSucu08searchweiget0030003ModifyUser = cySysBlockSucu08searchweiget0030003ModifyUser;
    }

    /**
     * 获取是否删除
     *
     * @return cy_sys_block_sucu08searchweiget0030003_is_delete - 是否删除
     */
    public String getCySysBlockSucu08searchweiget0030003IsDelete() {
        return cySysBlockSucu08searchweiget0030003IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu08searchweiget0030003IsDelete 是否删除
     */
    public void setCySysBlockSucu08searchweiget0030003IsDelete(String cySysBlockSucu08searchweiget0030003IsDelete) {
        this.cySysBlockSucu08searchweiget0030003IsDelete = cySysBlockSucu08searchweiget0030003IsDelete;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu08searchweiget0030003_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu08searchweiget0030003ColumnSimpleJson() {
        return cySysBlockSucu08searchweiget0030003ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu08searchweiget0030003ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu08searchweiget0030003ColumnSimpleJson(String cySysBlockSucu08searchweiget0030003ColumnSimpleJson) {
        this.cySysBlockSucu08searchweiget0030003ColumnSimpleJson = cySysBlockSucu08searchweiget0030003ColumnSimpleJson;
    }

    /**
     * 获取字段详细数组
     *
     * @return cy_sys_block_sucu08searchweiget0030003_column_detail_json - 字段详细数组
     */
    public String getCySysBlockSucu08searchweiget0030003ColumnDetailJson() {
        return cySysBlockSucu08searchweiget0030003ColumnDetailJson;
    }

    /**
     * 设置字段详细数组
     *
     * @param cySysBlockSucu08searchweiget0030003ColumnDetailJson 字段详细数组
     */
    public void setCySysBlockSucu08searchweiget0030003ColumnDetailJson(String cySysBlockSucu08searchweiget0030003ColumnDetailJson) {
        this.cySysBlockSucu08searchweiget0030003ColumnDetailJson = cySysBlockSucu08searchweiget0030003ColumnDetailJson;
    }

    /**
     * 获取积木代码信息
     *
     * @return cy_sys_block_sucu08searchweiget0030003_code - 积木代码信息
     */
    public String getCySysBlockSucu08searchweiget0030003Code() {
        return cySysBlockSucu08searchweiget0030003Code;
    }

    /**
     * 设置积木代码信息
     *
     * @param cySysBlockSucu08searchweiget0030003Code 积木代码信息
     */
    public void setCySysBlockSucu08searchweiget0030003Code(String cySysBlockSucu08searchweiget0030003Code) {
        this.cySysBlockSucu08searchweiget0030003Code = cySysBlockSucu08searchweiget0030003Code;
    }

    /**
     * 获取还原场景信息
     *
     * @return cy_sys_block_sucu08searchweiget0030003_json_code - 还原场景信息
     */
    public String getCySysBlockSucu08searchweiget0030003JsonCode() {
        return cySysBlockSucu08searchweiget0030003JsonCode;
    }

    /**
     * 设置还原场景信息
     *
     * @param cySysBlockSucu08searchweiget0030003JsonCode 还原场景信息
     */
    public void setCySysBlockSucu08searchweiget0030003JsonCode(String cySysBlockSucu08searchweiget0030003JsonCode) {
        this.cySysBlockSucu08searchweiget0030003JsonCode = cySysBlockSucu08searchweiget0030003JsonCode;
    }
}