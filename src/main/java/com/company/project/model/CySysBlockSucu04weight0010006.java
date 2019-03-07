package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu04weight0010006")
public class CySysBlockSucu04weight0010006 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu04weight0010006_id")
    private String cySysBlockSucu04weight0010006Id;

    /**
     * 名称
     */
    @Column(name = "cy_sys_block_sucu04weight0010006_name")
    private String cySysBlockSucu04weight0010006Name;

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
    @Column(name = "cy_sys_block_sucu04weight0010006_is_delete")
    private String cySysBlockSucu04weight0010006IsDelete;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu04weight0010006_create_user")
    private String cySysBlockSucu04weight0010006CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu04weight0010006_modify_user")
    private String cySysBlockSucu04weight0010006ModifyUser;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu04weight0010006_create_time")
    private Date cySysBlockSucu04weight0010006CreateTime;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu04weight0010006_modify_time")
    private Date cySysBlockSucu04weight0010006ModifyTime;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu04weight0010006_column_simple_json")
    private String cySysBlockSucu04weight0010006ColumnSimpleJson;

    /**
     * 数据详细数组
     */
    @Column(name = "cy_sys_block_sucu04weight0010006_column_detail_json")
    private String cySysBlockSucu04weight0010006ColumnDetailJson;

    /**
     * 代码信息
     */
    @Column(name = "cy_sys_block_sucu04weight0010006_code")
    private String cySysBlockSucu04weight0010006Code;

    /**
     * 详细json代码
     */
    @Column(name = "cy_sys_block_sucu04weight0010006_json_code")
    private String cySysBlockSucu04weight0010006JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu04weight0010006_id - 编号
     */
    public String getCySysBlockSucu04weight0010006Id() {
        return cySysBlockSucu04weight0010006Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu04weight0010006Id 编号
     */
    public void setCySysBlockSucu04weight0010006Id(String cySysBlockSucu04weight0010006Id) {
        this.cySysBlockSucu04weight0010006Id = cySysBlockSucu04weight0010006Id;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_block_sucu04weight0010006_name - 名称
     */
    public String getCySysBlockSucu04weight0010006Name() {
        return cySysBlockSucu04weight0010006Name;
    }

    /**
     * 设置名称
     *
     * @param cySysBlockSucu04weight0010006Name 名称
     */
    public void setCySysBlockSucu04weight0010006Name(String cySysBlockSucu04weight0010006Name) {
        this.cySysBlockSucu04weight0010006Name = cySysBlockSucu04weight0010006Name;
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
     * @return cy_sys_block_sucu04weight0010006_is_delete - 是否删除
     */
    public String getCySysBlockSucu04weight0010006IsDelete() {
        return cySysBlockSucu04weight0010006IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu04weight0010006IsDelete 是否删除
     */
    public void setCySysBlockSucu04weight0010006IsDelete(String cySysBlockSucu04weight0010006IsDelete) {
        this.cySysBlockSucu04weight0010006IsDelete = cySysBlockSucu04weight0010006IsDelete;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu04weight0010006_create_user - 创建人
     */
    public String getCySysBlockSucu04weight0010006CreateUser() {
        return cySysBlockSucu04weight0010006CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu04weight0010006CreateUser 创建人
     */
    public void setCySysBlockSucu04weight0010006CreateUser(String cySysBlockSucu04weight0010006CreateUser) {
        this.cySysBlockSucu04weight0010006CreateUser = cySysBlockSucu04weight0010006CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu04weight0010006_modify_user - 更新人
     */
    public String getCySysBlockSucu04weight0010006ModifyUser() {
        return cySysBlockSucu04weight0010006ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu04weight0010006ModifyUser 更新人
     */
    public void setCySysBlockSucu04weight0010006ModifyUser(String cySysBlockSucu04weight0010006ModifyUser) {
        this.cySysBlockSucu04weight0010006ModifyUser = cySysBlockSucu04weight0010006ModifyUser;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu04weight0010006_create_time - 创建时间
     */
    public Date getCySysBlockSucu04weight0010006CreateTime() {
        return cySysBlockSucu04weight0010006CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu04weight0010006CreateTime 创建时间
     */
    public void setCySysBlockSucu04weight0010006CreateTime(Date cySysBlockSucu04weight0010006CreateTime) {
        this.cySysBlockSucu04weight0010006CreateTime = cySysBlockSucu04weight0010006CreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu04weight0010006_modify_time - 更新时间
     */
    public Date getCySysBlockSucu04weight0010006ModifyTime() {
        return cySysBlockSucu04weight0010006ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu04weight0010006ModifyTime 更新时间
     */
    public void setCySysBlockSucu04weight0010006ModifyTime(Date cySysBlockSucu04weight0010006ModifyTime) {
        this.cySysBlockSucu04weight0010006ModifyTime = cySysBlockSucu04weight0010006ModifyTime;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu04weight0010006_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu04weight0010006ColumnSimpleJson() {
        return cySysBlockSucu04weight0010006ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu04weight0010006ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu04weight0010006ColumnSimpleJson(String cySysBlockSucu04weight0010006ColumnSimpleJson) {
        this.cySysBlockSucu04weight0010006ColumnSimpleJson = cySysBlockSucu04weight0010006ColumnSimpleJson;
    }

    /**
     * 获取数据详细数组
     *
     * @return cy_sys_block_sucu04weight0010006_column_detail_json - 数据详细数组
     */
    public String getCySysBlockSucu04weight0010006ColumnDetailJson() {
        return cySysBlockSucu04weight0010006ColumnDetailJson;
    }

    /**
     * 设置数据详细数组
     *
     * @param cySysBlockSucu04weight0010006ColumnDetailJson 数据详细数组
     */
    public void setCySysBlockSucu04weight0010006ColumnDetailJson(String cySysBlockSucu04weight0010006ColumnDetailJson) {
        this.cySysBlockSucu04weight0010006ColumnDetailJson = cySysBlockSucu04weight0010006ColumnDetailJson;
    }

    /**
     * 获取代码信息
     *
     * @return cy_sys_block_sucu04weight0010006_code - 代码信息
     */
    public String getCySysBlockSucu04weight0010006Code() {
        return cySysBlockSucu04weight0010006Code;
    }

    /**
     * 设置代码信息
     *
     * @param cySysBlockSucu04weight0010006Code 代码信息
     */
    public void setCySysBlockSucu04weight0010006Code(String cySysBlockSucu04weight0010006Code) {
        this.cySysBlockSucu04weight0010006Code = cySysBlockSucu04weight0010006Code;
    }

    /**
     * 获取详细json代码
     *
     * @return cy_sys_block_sucu04weight0010006_json_code - 详细json代码
     */
    public String getCySysBlockSucu04weight0010006JsonCode() {
        return cySysBlockSucu04weight0010006JsonCode;
    }

    /**
     * 设置详细json代码
     *
     * @param cySysBlockSucu04weight0010006JsonCode 详细json代码
     */
    public void setCySysBlockSucu04weight0010006JsonCode(String cySysBlockSucu04weight0010006JsonCode) {
        this.cySysBlockSucu04weight0010006JsonCode = cySysBlockSucu04weight0010006JsonCode;
    }
}