package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cy_sys_block_sucu04weight0030006")
public class CySysBlockSucu04weight0030006 {
    /**
     * 编号
     */
    @Id
    @Column(name = "cy_sys_block_sucu04weight0030006_id")
    private String cySysBlockSucu04weight0030006Id;

    /**
     * 名称
     */
    @Column(name = "cy_sys_block_sucu04weight0030006_name")
    private String cySysBlockSucu04weight0030006Name;

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
    @Column(name = "cy_sys_block_sucu04weight0030006_is_delete")
    private String cySysBlockSucu04weight0030006IsDelete;

    /**
     * 创建人
     */
    @Column(name = "cy_sys_block_sucu04weight0030006_create_user")
    private String cySysBlockSucu04weight0030006CreateUser;

    /**
     * 更新人
     */
    @Column(name = "cy_sys_block_sucu04weight0030006_modify_user")
    private String cySysBlockSucu04weight0030006ModifyUser;

    /**
     * 创建时间
     */
    @Column(name = "cy_sys_block_sucu04weight0030006_create_time")
    private Date cySysBlockSucu04weight0030006CreateTime;

    /**
     * 更新时间
     */
    @Column(name = "cy_sys_block_sucu04weight0030006_modify_time")
    private Date cySysBlockSucu04weight0030006ModifyTime;

    /**
     * 字段简洁数组
     */
    @Column(name = "cy_sys_block_sucu04weight0030006_column_simple_json")
    private String cySysBlockSucu04weight0030006ColumnSimpleJson;

    /**
     * 数据详细数组
     */
    @Column(name = "cy_sys_block_sucu04weight0030006_column_detail_json")
    private String cySysBlockSucu04weight0030006ColumnDetailJson;

    /**
     * 代码信息
     */
    @Column(name = "cy_sys_block_sucu04weight0030006_code")
    private String cySysBlockSucu04weight0030006Code;

    /**
     * 详细json代码
     */
    @Column(name = "cy_sys_block_sucu04weight0030006_json_code")
    private String cySysBlockSucu04weight0030006JsonCode;

    /**
     * 获取编号
     *
     * @return cy_sys_block_sucu04weight0030006_id - 编号
     */
    public String getCySysBlockSucu04weight0030006Id() {
        return cySysBlockSucu04weight0030006Id;
    }

    /**
     * 设置编号
     *
     * @param cySysBlockSucu04weight0030006Id 编号
     */
    public void setCySysBlockSucu04weight0030006Id(String cySysBlockSucu04weight0030006Id) {
        this.cySysBlockSucu04weight0030006Id = cySysBlockSucu04weight0030006Id;
    }

    /**
     * 获取名称
     *
     * @return cy_sys_block_sucu04weight0030006_name - 名称
     */
    public String getCySysBlockSucu04weight0030006Name() {
        return cySysBlockSucu04weight0030006Name;
    }

    /**
     * 设置名称
     *
     * @param cySysBlockSucu04weight0030006Name 名称
     */
    public void setCySysBlockSucu04weight0030006Name(String cySysBlockSucu04weight0030006Name) {
        this.cySysBlockSucu04weight0030006Name = cySysBlockSucu04weight0030006Name;
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
     * @return cy_sys_block_sucu04weight0030006_is_delete - 是否删除
     */
    public String getCySysBlockSucu04weight0030006IsDelete() {
        return cySysBlockSucu04weight0030006IsDelete;
    }

    /**
     * 设置是否删除
     *
     * @param cySysBlockSucu04weight0030006IsDelete 是否删除
     */
    public void setCySysBlockSucu04weight0030006IsDelete(String cySysBlockSucu04weight0030006IsDelete) {
        this.cySysBlockSucu04weight0030006IsDelete = cySysBlockSucu04weight0030006IsDelete;
    }

    /**
     * 获取创建人
     *
     * @return cy_sys_block_sucu04weight0030006_create_user - 创建人
     */
    public String getCySysBlockSucu04weight0030006CreateUser() {
        return cySysBlockSucu04weight0030006CreateUser;
    }

    /**
     * 设置创建人
     *
     * @param cySysBlockSucu04weight0030006CreateUser 创建人
     */
    public void setCySysBlockSucu04weight0030006CreateUser(String cySysBlockSucu04weight0030006CreateUser) {
        this.cySysBlockSucu04weight0030006CreateUser = cySysBlockSucu04weight0030006CreateUser;
    }

    /**
     * 获取更新人
     *
     * @return cy_sys_block_sucu04weight0030006_modify_user - 更新人
     */
    public String getCySysBlockSucu04weight0030006ModifyUser() {
        return cySysBlockSucu04weight0030006ModifyUser;
    }

    /**
     * 设置更新人
     *
     * @param cySysBlockSucu04weight0030006ModifyUser 更新人
     */
    public void setCySysBlockSucu04weight0030006ModifyUser(String cySysBlockSucu04weight0030006ModifyUser) {
        this.cySysBlockSucu04weight0030006ModifyUser = cySysBlockSucu04weight0030006ModifyUser;
    }

    /**
     * 获取创建时间
     *
     * @return cy_sys_block_sucu04weight0030006_create_time - 创建时间
     */
    public Date getCySysBlockSucu04weight0030006CreateTime() {
        return cySysBlockSucu04weight0030006CreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param cySysBlockSucu04weight0030006CreateTime 创建时间
     */
    public void setCySysBlockSucu04weight0030006CreateTime(Date cySysBlockSucu04weight0030006CreateTime) {
        this.cySysBlockSucu04weight0030006CreateTime = cySysBlockSucu04weight0030006CreateTime;
    }

    /**
     * 获取更新时间
     *
     * @return cy_sys_block_sucu04weight0030006_modify_time - 更新时间
     */
    public Date getCySysBlockSucu04weight0030006ModifyTime() {
        return cySysBlockSucu04weight0030006ModifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param cySysBlockSucu04weight0030006ModifyTime 更新时间
     */
    public void setCySysBlockSucu04weight0030006ModifyTime(Date cySysBlockSucu04weight0030006ModifyTime) {
        this.cySysBlockSucu04weight0030006ModifyTime = cySysBlockSucu04weight0030006ModifyTime;
    }

    /**
     * 获取字段简洁数组
     *
     * @return cy_sys_block_sucu04weight0030006_column_simple_json - 字段简洁数组
     */
    public String getCySysBlockSucu04weight0030006ColumnSimpleJson() {
        return cySysBlockSucu04weight0030006ColumnSimpleJson;
    }

    /**
     * 设置字段简洁数组
     *
     * @param cySysBlockSucu04weight0030006ColumnSimpleJson 字段简洁数组
     */
    public void setCySysBlockSucu04weight0030006ColumnSimpleJson(String cySysBlockSucu04weight0030006ColumnSimpleJson) {
        this.cySysBlockSucu04weight0030006ColumnSimpleJson = cySysBlockSucu04weight0030006ColumnSimpleJson;
    }

    /**
     * 获取数据详细数组
     *
     * @return cy_sys_block_sucu04weight0030006_column_detail_json - 数据详细数组
     */
    public String getCySysBlockSucu04weight0030006ColumnDetailJson() {
        return cySysBlockSucu04weight0030006ColumnDetailJson;
    }

    /**
     * 设置数据详细数组
     *
     * @param cySysBlockSucu04weight0030006ColumnDetailJson 数据详细数组
     */
    public void setCySysBlockSucu04weight0030006ColumnDetailJson(String cySysBlockSucu04weight0030006ColumnDetailJson) {
        this.cySysBlockSucu04weight0030006ColumnDetailJson = cySysBlockSucu04weight0030006ColumnDetailJson;
    }

    /**
     * 获取代码信息
     *
     * @return cy_sys_block_sucu04weight0030006_code - 代码信息
     */
    public String getCySysBlockSucu04weight0030006Code() {
        return cySysBlockSucu04weight0030006Code;
    }

    /**
     * 设置代码信息
     *
     * @param cySysBlockSucu04weight0030006Code 代码信息
     */
    public void setCySysBlockSucu04weight0030006Code(String cySysBlockSucu04weight0030006Code) {
        this.cySysBlockSucu04weight0030006Code = cySysBlockSucu04weight0030006Code;
    }

    /**
     * 获取详细json代码
     *
     * @return cy_sys_block_sucu04weight0030006_json_code - 详细json代码
     */
    public String getCySysBlockSucu04weight0030006JsonCode() {
        return cySysBlockSucu04weight0030006JsonCode;
    }

    /**
     * 设置详细json代码
     *
     * @param cySysBlockSucu04weight0030006JsonCode 详细json代码
     */
    public void setCySysBlockSucu04weight0030006JsonCode(String cySysBlockSucu04weight0030006JsonCode) {
        this.cySysBlockSucu04weight0030006JsonCode = cySysBlockSucu04weight0030006JsonCode;
    }
}