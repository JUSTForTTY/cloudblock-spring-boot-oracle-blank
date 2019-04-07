package com.company.project.outer.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_PAGE_BLOCK")
public class CsysPageBlock {
    @Id
    @Column(name = "CSYS_PAGE_BLOCK_ID")
    private String csysPageBlockId;

    @Column(name = "CSYS_PAGE_ID")
    private String csysPageId;

    @Column(name = "CSYS_PAGE_NAME")
    private String csysPageName;

    @Column(name = "CSYS_PAGE_DESC")
    private String csysPageDesc;

    @Column(name = "CSYS_BLOCK_RUNTIME_ID")
    private String csysBlockRuntimeId;

    @Column(name = "CSYS_WORKFLOW_ID")
    private String csysWorkflowId;

    @Column(name = "CSYS_WORKFLOW_NAME")
    private String csysWorkflowName;

    @Column(name = "CSYS_WORKFLOW_TYPE")
    private String csysWorkflowType;

    @Column(name = "CY_SYS_BLOCK_ID")
    private String cySysBlockId;

    @Column(name = "CY_SYS_BLOCK_NAME")
    private String cySysBlockName;

    @Column(name = "CY_SYS_BLOCK_CODE")
    private String cySysBlockCode;

    @Column(name = "CY_SYS_BLOCK_PARENT_ID")
    private String cySysBlockParentId;

    @Column(name = "CY_SYS_BLOCK_LEVEL")
    private String cySysBlockLevel;

    @Column(name = "CY_SYS_BLOCK_CATEGORY_ID")
    private String cySysBlockCategoryId;

    @Column(name = "CY_SYS_BLOCK_CATEGORY_NAME")
    private String cySysBlockCategoryName;

    @Column(name = "CSYS_PAGE_BLOCK_IS_AUTHORITY")
    private String csysPageBlockIsAuthority;

    @Column(name = "CSYS_PAGE_BLOCK_AUTHORITY")
    private String csysPageBlockAuthority;

    @Column(name = "CSYS_PAGE_BLOCK_IS_MAIN")
    private String csysPageBlockIsMain;

    @Column(name = "CSYS_PAGE_BLOCK_SORT")
    private Integer csysPageBlockSort;

    @Column(name = "CSYS_PAGE_BLOCK_API")
    private String csysPageBlockApi;

    @Column(name = "CSYS_PAGE_BLOCK_CREATE_USER")
    private String csysPageBlockCreateUser;

    @Column(name = "CSYS_PAGE_BLOCK_MODIFY_USER")
    private String csysPageBlockModifyUser;

    @Column(name = "CSYS_PAGE_BLOCK_CREATE_TIME")
    private Date csysPageBlockCreateTime;

    @Column(name = "CSYS_PAGE_BLOCK_MODIFY_TIME")
    private Date csysPageBlockModifyTime;

    @Column(name = "CSYS_PAGE_BLOCK_IS_DELETE")
    private String csysPageBlockIsDelete;

    @Column(name = "CSYS_PAGE_BLOCK_DATE")
    private Date csysPageBlockDate;

    @Column(name = "CSYS_PAGE_BLOCK_TIME")
    private Date csysPageBlockTime;

    @Column(name = "CSYS_PAGE_BLOCK_HTML_CODE")
    private String csysPageBlockHtmlCode;

    /**
     * @return CSYS_PAGE_BLOCK_ID
     */
    public String getCsysPageBlockId() {
        return csysPageBlockId;
    }

    /**
     * @param csysPageBlockId
     */
    public void setCsysPageBlockId(String csysPageBlockId) {
        this.csysPageBlockId = csysPageBlockId;
    }

    /**
     * @return CSYS_PAGE_ID
     */
    public String getCsysPageId() {
        return csysPageId;
    }

    /**
     * @param csysPageId
     */
    public void setCsysPageId(String csysPageId) {
        this.csysPageId = csysPageId;
    }

    /**
     * @return CSYS_PAGE_NAME
     */
    public String getCsysPageName() {
        return csysPageName;
    }

    /**
     * @param csysPageName
     */
    public void setCsysPageName(String csysPageName) {
        this.csysPageName = csysPageName;
    }

    /**
     * @return CSYS_PAGE_DESC
     */
    public String getCsysPageDesc() {
        return csysPageDesc;
    }

    /**
     * @param csysPageDesc
     */
    public void setCsysPageDesc(String csysPageDesc) {
        this.csysPageDesc = csysPageDesc;
    }

    /**
     * @return CSYS_BLOCK_RUNTIME_ID
     */
    public String getCsysBlockRuntimeId() {
        return csysBlockRuntimeId;
    }

    /**
     * @param csysBlockRuntimeId
     */
    public void setCsysBlockRuntimeId(String csysBlockRuntimeId) {
        this.csysBlockRuntimeId = csysBlockRuntimeId;
    }

    /**
     * @return CSYS_WORKFLOW_ID
     */
    public String getCsysWorkflowId() {
        return csysWorkflowId;
    }

    /**
     * @param csysWorkflowId
     */
    public void setCsysWorkflowId(String csysWorkflowId) {
        this.csysWorkflowId = csysWorkflowId;
    }

    /**
     * @return CSYS_WORKFLOW_NAME
     */
    public String getCsysWorkflowName() {
        return csysWorkflowName;
    }

    /**
     * @param csysWorkflowName
     */
    public void setCsysWorkflowName(String csysWorkflowName) {
        this.csysWorkflowName = csysWorkflowName;
    }

    /**
     * @return CSYS_WORKFLOW_TYPE
     */
    public String getCsysWorkflowType() {
        return csysWorkflowType;
    }

    /**
     * @param csysWorkflowType
     */
    public void setCsysWorkflowType(String csysWorkflowType) {
        this.csysWorkflowType = csysWorkflowType;
    }

    /**
     * @return CY_SYS_BLOCK_ID
     */
    public String getCySysBlockId() {
        return cySysBlockId;
    }

    /**
     * @param cySysBlockId
     */
    public void setCySysBlockId(String cySysBlockId) {
        this.cySysBlockId = cySysBlockId;
    }

    /**
     * @return CY_SYS_BLOCK_NAME
     */
    public String getCySysBlockName() {
        return cySysBlockName;
    }

    /**
     * @param cySysBlockName
     */
    public void setCySysBlockName(String cySysBlockName) {
        this.cySysBlockName = cySysBlockName;
    }

    /**
     * @return CY_SYS_BLOCK_CODE
     */
    public String getCySysBlockCode() {
        return cySysBlockCode;
    }

    /**
     * @param cySysBlockCode
     */
    public void setCySysBlockCode(String cySysBlockCode) {
        this.cySysBlockCode = cySysBlockCode;
    }

    /**
     * @return CY_SYS_BLOCK_PARENT_ID
     */
    public String getCySysBlockParentId() {
        return cySysBlockParentId;
    }

    /**
     * @param cySysBlockParentId
     */
    public void setCySysBlockParentId(String cySysBlockParentId) {
        this.cySysBlockParentId = cySysBlockParentId;
    }

    /**
     * @return CY_SYS_BLOCK_LEVEL
     */
    public String getCySysBlockLevel() {
        return cySysBlockLevel;
    }

    /**
     * @param cySysBlockLevel
     */
    public void setCySysBlockLevel(String cySysBlockLevel) {
        this.cySysBlockLevel = cySysBlockLevel;
    }

    /**
     * @return CY_SYS_BLOCK_CATEGORY_ID
     */
    public String getCySysBlockCategoryId() {
        return cySysBlockCategoryId;
    }

    /**
     * @param cySysBlockCategoryId
     */
    public void setCySysBlockCategoryId(String cySysBlockCategoryId) {
        this.cySysBlockCategoryId = cySysBlockCategoryId;
    }

    /**
     * @return CY_SYS_BLOCK_CATEGORY_NAME
     */
    public String getCySysBlockCategoryName() {
        return cySysBlockCategoryName;
    }

    /**
     * @param cySysBlockCategoryName
     */
    public void setCySysBlockCategoryName(String cySysBlockCategoryName) {
        this.cySysBlockCategoryName = cySysBlockCategoryName;
    }

    /**
     * @return CSYS_PAGE_BLOCK_IS_AUTHORITY
     */
    public String getCsysPageBlockIsAuthority() {
        return csysPageBlockIsAuthority;
    }

    /**
     * @param csysPageBlockIsAuthority
     */
    public void setCsysPageBlockIsAuthority(String csysPageBlockIsAuthority) {
        this.csysPageBlockIsAuthority = csysPageBlockIsAuthority;
    }

    /**
     * @return CSYS_PAGE_BLOCK_AUTHORITY
     */
    public String getCsysPageBlockAuthority() {
        return csysPageBlockAuthority;
    }

    /**
     * @param csysPageBlockAuthority
     */
    public void setCsysPageBlockAuthority(String csysPageBlockAuthority) {
        this.csysPageBlockAuthority = csysPageBlockAuthority;
    }

    /**
     * @return CSYS_PAGE_BLOCK_IS_MAIN
     */
    public String getCsysPageBlockIsMain() {
        return csysPageBlockIsMain;
    }

    /**
     * @param csysPageBlockIsMain
     */
    public void setCsysPageBlockIsMain(String csysPageBlockIsMain) {
        this.csysPageBlockIsMain = csysPageBlockIsMain;
    }

    /**
     * @return CSYS_PAGE_BLOCK_SORT
     */
    public Integer getCsysPageBlockSort() {
        return csysPageBlockSort;
    }

    /**
     * @param csysPageBlockSort
     */
    public void setCsysPageBlockSort(Integer csysPageBlockSort) {
        this.csysPageBlockSort = csysPageBlockSort;
    }

    /**
     * @return CSYS_PAGE_BLOCK_API
     */
    public String getCsysPageBlockApi() {
        return csysPageBlockApi;
    }

    /**
     * @param csysPageBlockApi
     */
    public void setCsysPageBlockApi(String csysPageBlockApi) {
        this.csysPageBlockApi = csysPageBlockApi;
    }

    /**
     * @return CSYS_PAGE_BLOCK_CREATE_USER
     */
    public String getCsysPageBlockCreateUser() {
        return csysPageBlockCreateUser;
    }

    /**
     * @param csysPageBlockCreateUser
     */
    public void setCsysPageBlockCreateUser(String csysPageBlockCreateUser) {
        this.csysPageBlockCreateUser = csysPageBlockCreateUser;
    }

    /**
     * @return CSYS_PAGE_BLOCK_MODIFY_USER
     */
    public String getCsysPageBlockModifyUser() {
        return csysPageBlockModifyUser;
    }

    /**
     * @param csysPageBlockModifyUser
     */
    public void setCsysPageBlockModifyUser(String csysPageBlockModifyUser) {
        this.csysPageBlockModifyUser = csysPageBlockModifyUser;
    }

    /**
     * @return CSYS_PAGE_BLOCK_CREATE_TIME
     */
    public Date getCsysPageBlockCreateTime() {
        return csysPageBlockCreateTime;
    }

    /**
     * @param csysPageBlockCreateTime
     */
    public void setCsysPageBlockCreateTime(Date csysPageBlockCreateTime) {
        this.csysPageBlockCreateTime = csysPageBlockCreateTime;
    }

    /**
     * @return CSYS_PAGE_BLOCK_MODIFY_TIME
     */
    public Date getCsysPageBlockModifyTime() {
        return csysPageBlockModifyTime;
    }

    /**
     * @param csysPageBlockModifyTime
     */
    public void setCsysPageBlockModifyTime(Date csysPageBlockModifyTime) {
        this.csysPageBlockModifyTime = csysPageBlockModifyTime;
    }

    /**
     * @return CSYS_PAGE_BLOCK_IS_DELETE
     */
    public String getCsysPageBlockIsDelete() {
        return csysPageBlockIsDelete;
    }

    /**
     * @param csysPageBlockIsDelete
     */
    public void setCsysPageBlockIsDelete(String csysPageBlockIsDelete) {
        this.csysPageBlockIsDelete = csysPageBlockIsDelete;
    }

    /**
     * @return CSYS_PAGE_BLOCK_DATE
     */
    public Date getCsysPageBlockDate() {
        return csysPageBlockDate;
    }

    /**
     * @param csysPageBlockDate
     */
    public void setCsysPageBlockDate(Date csysPageBlockDate) {
        this.csysPageBlockDate = csysPageBlockDate;
    }

    /**
     * @return CSYS_PAGE_BLOCK_TIME
     */
    public Date getCsysPageBlockTime() {
        return csysPageBlockTime;
    }

    /**
     * @param csysPageBlockTime
     */
    public void setCsysPageBlockTime(Date csysPageBlockTime) {
        this.csysPageBlockTime = csysPageBlockTime;
    }

    /**
     * @return CSYS_PAGE_BLOCK_HTML_CODE
     */
    public String getCsysPageBlockHtmlCode() {
        return csysPageBlockHtmlCode;
    }

    /**
     * @param csysPageBlockHtmlCode
     */
    public void setCsysPageBlockHtmlCode(String csysPageBlockHtmlCode) {
        this.csysPageBlockHtmlCode = csysPageBlockHtmlCode;
    }
}