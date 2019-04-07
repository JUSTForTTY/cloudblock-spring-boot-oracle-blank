package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Table(name = "CSYS_MENU_PAGE_VIEW")
public class CsysMenuPageView {
    @Column(name = "CSYS_PAGE_ID")
    private String csysPageId;

    @Column(name = "CSYS_PAGE_NAME")
    private String csysPageName;

    @Column(name = "CSYS_PAGE_LAYOUT_ID")
    private String csysPageLayoutId;

    @Column(name = "CSYS_PAGE_SORT")
    private Integer csysPageSort;

    @Column(name = "CSYS_PAGE_ROUTH_PATH")
    private String csysPageRouthPath;

    @Column(name = "CSYS_PAGE_SELECTOR")
    private String csysPageSelector;

    @Column(name = "CSYS_PAGE_STATUS")
    private String csysPageStatus;

    @Column(name = "CSYS_PAGE_GITSTATUS")
    private String csysPageGitstatus;

    @Column(name = "CSYS_PAGE_TYPE")
    private String csysPageType;

    @Column(name = "CSYS_PAGE_CREATE_TIME")
    private Date csysPageCreateTime;

    @Column(name = "CSYS_PAGE_MODIFY_TIME")
    private Date csysPageModifyTime;

    @Column(name = "CSYS_PAGE_CREATE_USER")
    private String csysPageCreateUser;

    @Column(name = "CSYS_PAGE_MODIFY_USER")
    private String csysPageModifyUser;

    @Column(name = "CSYS_PAGE_IS_DELETE")
    private String csysPageIsDelete;

    @Column(name = "CSYS_PAGE_CODE_NAME")
    private String csysPageCodeName;

    @Column(name = "CY_SYS_PAGE_TEMP_ID")
    private String cySysPageTempId;

    @Column(name = "CSYS_PAGE_TIME")
    private Date csysPageTime;

    @Column(name = "CSYS_PAGE_DATE")
    private Date csysPageDate;

    @Id
    @Column(name = "CSYS_MENU_ID")
    private String csysMenuId;

    @Column(name = "CSYS_MENU_NAME")
    private String csysMenuName;

    @Column(name = "CSYS_MENU_PARENT_ID")
    private String csysMenuParentId;

    @Column(name = "CSYS_MENU_IS_END")
    private String csysMenuIsEnd;

    @Column(name = "CSYS_MENU_IS_OUTLINE")
    private String csysMenuIsOutline;

    @Column(name = "CSYS_MENU_SRC")
    private String csysMenuSrc;

    @Column(name = "CSYS_MENU_ACL")
    private String csysMenuAcl;

    @Column(name = "CSYS_MENU_IS_NEED_MARK")
    private String csysMenuIsNeedMark;

    @Column(name = "CSYS_MENU_MENO")
    private String csysMenuMeno;

    @Column(name = "CSYS_MENU_FLOW_NOTICE_BLOCK")
    private String csysMenuFlowNoticeBlock;

    @Column(name = "CSYS_WORKFLOW_ID")
    private String csysWorkflowId;

    @Column(name = "CSYS_MENU_ICON")
    private String csysMenuIcon;

    @Column(name = "CSYS_MENU_SORT")
    private Integer csysMenuSort;

    @Column(name = "CSYS_MENU_STATUS")
    private String csysMenuStatus;

    @Column(name = "CSYS_MENU_CREATE_TIME")
    private Date csysMenuCreateTime;

    @Column(name = "CSYS_MENU_MODIFY_TIME")
    private Date csysMenuModifyTime;

    @Column(name = "CSYS_MENU_CREATE_USER")
    private String csysMenuCreateUser;

    @Column(name = "CSYS_MENU_MODIFY_USER")
    private String csysMenuModifyUser;

    @Column(name = "CSYS_MENU_IS_DELETE")
    private String csysMenuIsDelete;

    @Column(name = "CSYS_MENU_DATE")
    private Date csysMenuDate;

    @Column(name = "CSYS_MENU_TIME")
    private Date csysMenuTime;

    @Transient
	private List children = new ArrayList();

	@Transient
	private Integer index;
	
	@Transient
	private boolean disabled;
	
	@Transient
	private boolean checked;
	
	@Transient
	private boolean showoptionbtn;
	
	@Transient
	private boolean isExpanded;
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
     * @return CSYS_PAGE_LAYOUT_ID
     */
    public String getCsysPageLayoutId() {
        return csysPageLayoutId;
    }

    /**
     * @param csysPageLayoutId
     */
    public void setCsysPageLayoutId(String csysPageLayoutId) {
        this.csysPageLayoutId = csysPageLayoutId;
    }

    /**
     * @return CSYS_PAGE_SORT
     */
    public Integer getCsysPageSort() {
        return csysPageSort;
    }

    /**
     * @param csysPageSort
     */
    public void setCsysPageSort(Integer csysPageSort) {
        this.csysPageSort = csysPageSort;
    }

    /**
     * @return CSYS_PAGE_ROUTH_PATH
     */
    public String getCsysPageRouthPath() {
        return csysPageRouthPath;
    }

    /**
     * @param csysPageRouthPath
     */
    public void setCsysPageRouthPath(String csysPageRouthPath) {
        this.csysPageRouthPath = csysPageRouthPath;
    }

    /**
     * @return CSYS_PAGE_SELECTOR
     */
    public String getCsysPageSelector() {
        return csysPageSelector;
    }

    /**
     * @param csysPageSelector
     */
    public void setCsysPageSelector(String csysPageSelector) {
        this.csysPageSelector = csysPageSelector;
    }

    /**
     * @return CSYS_PAGE_STATUS
     */
    public String getCsysPageStatus() {
        return csysPageStatus;
    }

    /**
     * @param csysPageStatus
     */
    public void setCsysPageStatus(String csysPageStatus) {
        this.csysPageStatus = csysPageStatus;
    }

    /**
     * @return CSYS_PAGE_GITSTATUS
     */
    public String getCsysPageGitstatus() {
        return csysPageGitstatus;
    }

    /**
     * @param csysPageGitstatus
     */
    public void setCsysPageGitstatus(String csysPageGitstatus) {
        this.csysPageGitstatus = csysPageGitstatus;
    }

    /**
     * @return CSYS_PAGE_TYPE
     */
    public String getCsysPageType() {
        return csysPageType;
    }

    /**
     * @param csysPageType
     */
    public void setCsysPageType(String csysPageType) {
        this.csysPageType = csysPageType;
    }

    /**
     * @return CSYS_PAGE_CREATE_TIME
     */
    public Date getCsysPageCreateTime() {
        return csysPageCreateTime;
    }

    /**
     * @param csysPageCreateTime
     */
    public void setCsysPageCreateTime(Date csysPageCreateTime) {
        this.csysPageCreateTime = csysPageCreateTime;
    }

    /**
     * @return CSYS_PAGE_MODIFY_TIME
     */
    public Date getCsysPageModifyTime() {
        return csysPageModifyTime;
    }

    /**
     * @param csysPageModifyTime
     */
    public void setCsysPageModifyTime(Date csysPageModifyTime) {
        this.csysPageModifyTime = csysPageModifyTime;
    }

    /**
     * @return CSYS_PAGE_CREATE_USER
     */
    public String getCsysPageCreateUser() {
        return csysPageCreateUser;
    }

    /**
     * @param csysPageCreateUser
     */
    public void setCsysPageCreateUser(String csysPageCreateUser) {
        this.csysPageCreateUser = csysPageCreateUser;
    }

    /**
     * @return CSYS_PAGE_MODIFY_USER
     */
    public String getCsysPageModifyUser() {
        return csysPageModifyUser;
    }

    /**
     * @param csysPageModifyUser
     */
    public void setCsysPageModifyUser(String csysPageModifyUser) {
        this.csysPageModifyUser = csysPageModifyUser;
    }

    /**
     * @return CSYS_PAGE_IS_DELETE
     */
    public String getCsysPageIsDelete() {
        return csysPageIsDelete;
    }

    /**
     * @param csysPageIsDelete
     */
    public void setCsysPageIsDelete(String csysPageIsDelete) {
        this.csysPageIsDelete = csysPageIsDelete;
    }

    /**
     * @return CSYS_PAGE_CODE_NAME
     */
    public String getCsysPageCodeName() {
        return csysPageCodeName;
    }

    /**
     * @param csysPageCodeName
     */
    public void setCsysPageCodeName(String csysPageCodeName) {
        this.csysPageCodeName = csysPageCodeName;
    }

    /**
     * @return CY_SYS_PAGE_TEMP_ID
     */
    public String getCySysPageTempId() {
        return cySysPageTempId;
    }

    /**
     * @param cySysPageTempId
     */
    public void setCySysPageTempId(String cySysPageTempId) {
        this.cySysPageTempId = cySysPageTempId;
    }

    /**
     * @return CSYS_PAGE_TIME
     */
    public Date getCsysPageTime() {
        return csysPageTime;
    }

    /**
     * @param csysPageTime
     */
    public void setCsysPageTime(Date csysPageTime) {
        this.csysPageTime = csysPageTime;
    }

    /**
     * @return CSYS_PAGE_DATE
     */
    public Date getCsysPageDate() {
        return csysPageDate;
    }

    /**
     * @param csysPageDate
     */
    public void setCsysPageDate(Date csysPageDate) {
        this.csysPageDate = csysPageDate;
    }

    /**
     * @return CSYS_MENU_ID
     */
    public String getCsysMenuId() {
        return csysMenuId;
    }

    /**
     * @param csysMenuId
     */
    public void setCsysMenuId(String csysMenuId) {
        this.csysMenuId = csysMenuId;
    }

    /**
     * @return CSYS_MENU_NAME
     */
    public String getCsysMenuName() {
        return csysMenuName;
    }

    /**
     * @param csysMenuName
     */
    public void setCsysMenuName(String csysMenuName) {
        this.csysMenuName = csysMenuName;
    }

    /**
     * @return CSYS_MENU_PARENT_ID
     */
    public String getCsysMenuParentId() {
        return csysMenuParentId;
    }

    /**
     * @param csysMenuParentId
     */
    public void setCsysMenuParentId(String csysMenuParentId) {
        this.csysMenuParentId = csysMenuParentId;
    }

    /**
     * @return CSYS_MENU_IS_END
     */
    public String getCsysMenuIsEnd() {
        return csysMenuIsEnd;
    }

    /**
     * @param csysMenuIsEnd
     */
    public void setCsysMenuIsEnd(String csysMenuIsEnd) {
        this.csysMenuIsEnd = csysMenuIsEnd;
    }

    /**
     * @return CSYS_MENU_IS_OUTLINE
     */
    public String getCsysMenuIsOutline() {
        return csysMenuIsOutline;
    }

    /**
     * @param csysMenuIsOutline
     */
    public void setCsysMenuIsOutline(String csysMenuIsOutline) {
        this.csysMenuIsOutline = csysMenuIsOutline;
    }

    /**
     * @return CSYS_MENU_SRC
     */
    public String getCsysMenuSrc() {
        return csysMenuSrc;
    }

    /**
     * @param csysMenuSrc
     */
    public void setCsysMenuSrc(String csysMenuSrc) {
        this.csysMenuSrc = csysMenuSrc;
    }

    /**
     * @return CSYS_MENU_ACL
     */
    public String getCsysMenuAcl() {
        return csysMenuAcl;
    }

    /**
     * @param csysMenuAcl
     */
    public void setCsysMenuAcl(String csysMenuAcl) {
        this.csysMenuAcl = csysMenuAcl;
    }

    /**
     * @return CSYS_MENU_IS_NEED_MARK
     */
    public String getCsysMenuIsNeedMark() {
        return csysMenuIsNeedMark;
    }

    /**
     * @param csysMenuIsNeedMark
     */
    public void setCsysMenuIsNeedMark(String csysMenuIsNeedMark) {
        this.csysMenuIsNeedMark = csysMenuIsNeedMark;
    }

    /**
     * @return CSYS_MENU_MENO
     */
    public String getCsysMenuMeno() {
        return csysMenuMeno;
    }

    /**
     * @param csysMenuMeno
     */
    public void setCsysMenuMeno(String csysMenuMeno) {
        this.csysMenuMeno = csysMenuMeno;
    }

    /**
     * @return CSYS_MENU_FLOW_NOTICE_BLOCK
     */
    public String getCsysMenuFlowNoticeBlock() {
        return csysMenuFlowNoticeBlock;
    }

    /**
     * @param csysMenuFlowNoticeBlock
     */
    public void setCsysMenuFlowNoticeBlock(String csysMenuFlowNoticeBlock) {
        this.csysMenuFlowNoticeBlock = csysMenuFlowNoticeBlock;
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
     * @return CSYS_MENU_ICON
     */
    public String getCsysMenuIcon() {
        return csysMenuIcon;
    }

    /**
     * @param csysMenuIcon
     */
    public void setCsysMenuIcon(String csysMenuIcon) {
        this.csysMenuIcon = csysMenuIcon;
    }

    /**
     * @return CSYS_MENU_SORT
     */
    public Integer getCsysMenuSort() {
        return csysMenuSort;
    }

    /**
     * @param csysMenuSort
     */
    public void setCsysMenuSort(Integer csysMenuSort) {
        this.csysMenuSort = csysMenuSort;
    }

    /**
     * @return CSYS_MENU_STATUS
     */
    public String getCsysMenuStatus() {
        return csysMenuStatus;
    }

    /**
     * @param csysMenuStatus
     */
    public void setCsysMenuStatus(String csysMenuStatus) {
        this.csysMenuStatus = csysMenuStatus;
    }

    /**
     * @return CSYS_MENU_CREATE_TIME
     */
    public Date getCsysMenuCreateTime() {
        return csysMenuCreateTime;
    }

    /**
     * @param csysMenuCreateTime
     */
    public void setCsysMenuCreateTime(Date csysMenuCreateTime) {
        this.csysMenuCreateTime = csysMenuCreateTime;
    }

    /**
     * @return CSYS_MENU_MODIFY_TIME
     */
    public Date getCsysMenuModifyTime() {
        return csysMenuModifyTime;
    }

    /**
     * @param csysMenuModifyTime
     */
    public void setCsysMenuModifyTime(Date csysMenuModifyTime) {
        this.csysMenuModifyTime = csysMenuModifyTime;
    }

    /**
     * @return CSYS_MENU_CREATE_USER
     */
    public String getCsysMenuCreateUser() {
        return csysMenuCreateUser;
    }

    /**
     * @param csysMenuCreateUser
     */
    public void setCsysMenuCreateUser(String csysMenuCreateUser) {
        this.csysMenuCreateUser = csysMenuCreateUser;
    }

    /**
     * @return CSYS_MENU_MODIFY_USER
     */
    public String getCsysMenuModifyUser() {
        return csysMenuModifyUser;
    }

    /**
     * @param csysMenuModifyUser
     */
    public void setCsysMenuModifyUser(String csysMenuModifyUser) {
        this.csysMenuModifyUser = csysMenuModifyUser;
    }

    /**
     * @return CSYS_MENU_IS_DELETE
     */
    public String getCsysMenuIsDelete() {
        return csysMenuIsDelete;
    }

    /**
     * @param csysMenuIsDelete
     */
    public void setCsysMenuIsDelete(String csysMenuIsDelete) {
        this.csysMenuIsDelete = csysMenuIsDelete;
    }

    /**
     * @return CSYS_MENU_DATE
     */
    public Date getCsysMenuDate() {
        return csysMenuDate;
    }

    /**
     * @param csysMenuDate
     */
    public void setCsysMenuDate(Date csysMenuDate) {
        this.csysMenuDate = csysMenuDate;
    }

    /**
     * @return CSYS_MENU_TIME
     */
    public Date getCsysMenuTime() {
        return csysMenuTime;
    }

    /**
     * @param csysMenuTime
     */
    public void setCsysMenuTime(Date csysMenuTime) {
        this.csysMenuTime = csysMenuTime;
    }

	public List getChildren() {
		return children;
	}

	public void setChildren(List children) {
		this.children = children;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public boolean isShowoptionbtn() {
		return showoptionbtn;
	}

	public void setShowoptionbtn(boolean showoptionbtn) {
		this.showoptionbtn = showoptionbtn;
	}

	public boolean isExpanded() {
		return isExpanded;
	}

	public void setExpanded(boolean isExpanded) {
		this.isExpanded = isExpanded;
	}
    
}