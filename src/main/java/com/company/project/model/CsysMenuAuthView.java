package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Table(name = "CSYS_MENU_AUTH_VIEW")
public class CsysMenuAuthView {
    @Column(name = "CSYS_MENU_ID")
    private String csysMenuId;

    @Column(name = "CSYS_MENU_NAME")
    private String text;

    @Column(name = "CSYS_PAGE_ID")
    private String csysPageId;

    @Column(name = "CSYS_MENU_PARENT_ID")
    private String csysMenuParentId;

    @Column(name = "CSYS_MENU_IS_END")
    private String csysMenuIsEnd;

    @Column(name = "CSYS_MENU_IS_OUTLINE")
    private String csysMenuIsOutline;

    @Column(name = "CSYS_MENU_SRC")
    private String link;

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
    private String icon;

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

    @Id
    @Column(name = "CSYS_MENU_AUTH_ID")
    private String csysMenuAuthId;

    @Column(name = "CSYS_ROLE_ID")
    private String csysRoleId;

    @Column(name = "CSYS_ROLE_NAME")
    private String csysRoleName;

    @Column(name = "CSYS_DEPARTMENT_ID")
    private String csysDepartmentId;

    @Column(name = "CSYS_DEPARTMENT_NAME")
    private String csysDepartmentName;

    @Column(name = "CSYS_MENU_AUTH_CREATE_TIME")
    private Date csysMenuAuthCreateTime;

    @Column(name = "CSYS_MENU_AUTH_CREATE_USER")
    private String csysMenuAuthCreateUser;

    @Column(name = "CSYS_MENU_AUTH_MODIFY_TIME")
    private Date csysMenuAuthModifyTime;

    @Column(name = "CSYS_MENU_AUTH_MODIFY_USER")
    private String csysMenuAuthModifyUser;

    @Column(name = "CSYS_MENU_AUTH_IS_DELETE")
    private String csysMenuAuthIsDelete;

    @Column(name = "CSYS_MENU_AUTH_TIME")
    private Date csysMenuAuthTime;

    @Column(name = "CSYS_MENU_AUTH_DATE")
    private Date csysMenuAuthDate;

    @Transient
	private List children = new ArrayList();
    
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
    public String getText() {
        return text;
    }

    /**
     * @param csysMenuName
     */
    public void setText(String text) {
        this.text = text;
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
    public String getLink() {
        return link;
    }

    /**
     * @param csysMenuSrc
     */
    public void setLink(String link) {
        this.link = link;
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
    public String getIcon() {
        return icon;
    }

    /**
     * @param csysMenuIcon
     */
    public void setIcon(String icon) {
        this.icon = icon;
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

    /**
     * @return CSYS_MENU_AUTH_ID
     */
    public String getCsysMenuAuthId() {
        return csysMenuAuthId;
    }

    /**
     * @param csysMenuAuthId
     */
    public void setCsysMenuAuthId(String csysMenuAuthId) {
        this.csysMenuAuthId = csysMenuAuthId;
    }

    /**
     * @return CSYS_ROLE_ID
     */
    public String getCsysRoleId() {
        return csysRoleId;
    }

    /**
     * @param csysRoleId
     */
    public void setCsysRoleId(String csysRoleId) {
        this.csysRoleId = csysRoleId;
    }

    /**
     * @return CSYS_ROLE_NAME
     */
    public String getCsysRoleName() {
        return csysRoleName;
    }

    /**
     * @param csysRoleName
     */
    public void setCsysRoleName(String csysRoleName) {
        this.csysRoleName = csysRoleName;
    }

    /**
     * @return CSYS_DEPARTMENT_ID
     */
    public String getCsysDepartmentId() {
        return csysDepartmentId;
    }

    /**
     * @param csysDepartmentId
     */
    public void setCsysDepartmentId(String csysDepartmentId) {
        this.csysDepartmentId = csysDepartmentId;
    }

    /**
     * @return CSYS_DEPARTMENT_NAME
     */
    public String getCsysDepartmentName() {
        return csysDepartmentName;
    }

    /**
     * @param csysDepartmentName
     */
    public void setCsysDepartmentName(String csysDepartmentName) {
        this.csysDepartmentName = csysDepartmentName;
    }

    /**
     * @return CSYS_MENU_AUTH_CREATE_TIME
     */
    public Date getCsysMenuAuthCreateTime() {
        return csysMenuAuthCreateTime;
    }

    /**
     * @param csysMenuAuthCreateTime
     */
    public void setCsysMenuAuthCreateTime(Date csysMenuAuthCreateTime) {
        this.csysMenuAuthCreateTime = csysMenuAuthCreateTime;
    }

    /**
     * @return CSYS_MENU_AUTH_CREATE_USER
     */
    public String getCsysMenuAuthCreateUser() {
        return csysMenuAuthCreateUser;
    }

    /**
     * @param csysMenuAuthCreateUser
     */
    public void setCsysMenuAuthCreateUser(String csysMenuAuthCreateUser) {
        this.csysMenuAuthCreateUser = csysMenuAuthCreateUser;
    }

    /**
     * @return CSYS_MENU_AUTH_MODIFY_TIME
     */
    public Date getCsysMenuAuthModifyTime() {
        return csysMenuAuthModifyTime;
    }

    /**
     * @param csysMenuAuthModifyTime
     */
    public void setCsysMenuAuthModifyTime(Date csysMenuAuthModifyTime) {
        this.csysMenuAuthModifyTime = csysMenuAuthModifyTime;
    }

    /**
     * @return CSYS_MENU_AUTH_MODIFY_USER
     */
    public String getCsysMenuAuthModifyUser() {
        return csysMenuAuthModifyUser;
    }

    /**
     * @param csysMenuAuthModifyUser
     */
    public void setCsysMenuAuthModifyUser(String csysMenuAuthModifyUser) {
        this.csysMenuAuthModifyUser = csysMenuAuthModifyUser;
    }

    /**
     * @return CSYS_MENU_AUTH_IS_DELETE
     */
    public String getCsysMenuAuthIsDelete() {
        return csysMenuAuthIsDelete;
    }

    /**
     * @param csysMenuAuthIsDelete
     */
    public void setCsysMenuAuthIsDelete(String csysMenuAuthIsDelete) {
        this.csysMenuAuthIsDelete = csysMenuAuthIsDelete;
    }

    /**
     * @return CSYS_MENU_AUTH_TIME
     */
    public Date getCsysMenuAuthTime() {
        return csysMenuAuthTime;
    }

    /**
     * @param csysMenuAuthTime
     */
    public void setCsysMenuAuthTime(Date csysMenuAuthTime) {
        this.csysMenuAuthTime = csysMenuAuthTime;
    }

    /**
     * @return CSYS_MENU_AUTH_DATE
     */
    public Date getCsysMenuAuthDate() {
        return csysMenuAuthDate;
    }

    /**
     * @param csysMenuAuthDate
     */
    public void setCsysMenuAuthDate(Date csysMenuAuthDate) {
        this.csysMenuAuthDate = csysMenuAuthDate;
    }

	public List getChildren() {
		return children;
	}

	public void setChildren(List children) {
		this.children = children;
	}
    
	@Override  
	public boolean equals(Object obj) {  
	    CsysMenuAuthView s=(CsysMenuAuthView)obj;   
	    return csysMenuId.equals(s.csysMenuId) ;   
	}  
	@Override  
	public int hashCode() {  
	    String in = csysMenuId ;  
	    return in.hashCode();  
	} 
}