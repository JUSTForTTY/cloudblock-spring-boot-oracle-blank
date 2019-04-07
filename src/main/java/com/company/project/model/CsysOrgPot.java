package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Table(name = "CSYS_ORG_POT")
public class CsysOrgPot {
    @Id
    @Column(name = "CSYS_ORG_POT_ID")
    private String csysOrgPotId;

    @Column(name = "CSYS_ORG_STRUCE_ID")
    private String csysOrgStruceId;

    @Column(name = "CSYS_ORG_POT_NAME")
    private String csysOrgPotName;

    @Column(name = "CSYS_ORG_POT_PARENT_ID")
    private String csysOrgPotParentId;

    @Column(name = "CSYS_ORG_POT_LEVEL")
    private String csysOrgPotLevel;

    @Column(name = "CSYS_ORG_POT_TYPE")
    private String csysOrgPotType;

    @Column(name = "CSYS_ORG_POT_TABLE")
    private String csysOrgPotTable;

    @Column(name = "CSYS_ORG_POT_TABLE_ID")
    private String csysOrgPotTableId;

    @Column(name = "CSYS_ORG_POT_CREATE_TIME")
    private Date csysOrgPotCreateTime;

    @Column(name = "CSYS_ORG_POT_CREATE_USER")
    private String csysOrgPotCreateUser;

    @Column(name = "CSYS_ORG_POT_MODIFY_TIME")
    private Date csysOrgPotModifyTime;

    @Column(name = "CSYS_ORG_POT_MODIFY_USER")
    private String csysOrgPotModifyUser;

    @Column(name = "CSYS_ORG_POT_IS_DELETE")
    private String csysOrgPotIsDelete;

    @Column(name = "CSYS_ORG_POT_TIME")
    private Object csysOrgPotTime;

    @Column(name = "CSYS_ORG_POT_DATE")
    private Date csysOrgPotDate;

    @Transient
   	private List children = new ArrayList();

   	@Transient
   	private String title;
   	
   	@Transient
   	private String key;
    
   	@Transient
	private boolean expanded;
   	
   	@Transient
	private String isLeaf;
    /**
     * @return CSYS_ORG_POT_ID
     */
    public String getCsysOrgPotId() {
        return csysOrgPotId;
    }

    /**
     * @param csysOrgPotId
     */
    public void setCsysOrgPotId(String csysOrgPotId) {
        this.csysOrgPotId = csysOrgPotId;
    }

    /**
     * @return CSYS_ORG_STRUCE_ID
     */
    public String getCsysOrgStruceId() {
        return csysOrgStruceId;
    }

    /**
     * @param csysOrgStruceId
     */
    public void setCsysOrgStruceId(String csysOrgStruceId) {
        this.csysOrgStruceId = csysOrgStruceId;
    }

    /**
     * @return CSYS_ORG_POT_NAME
     */
    public String getCsysOrgPotName() {
        return csysOrgPotName;
    }

    /**
     * @param csysOrgPotName
     */
    public void setCsysOrgPotName(String csysOrgPotName) {
        this.csysOrgPotName = csysOrgPotName;
    }

    /**
     * @return CSYS_ORG_POT_PARENT_ID
     */
    public String getCsysOrgPotParentId() {
        return csysOrgPotParentId;
    }

    /**
     * @param csysOrgPotParentId
     */
    public void setCsysOrgPotParentId(String csysOrgPotParentId) {
        this.csysOrgPotParentId = csysOrgPotParentId;
    }

    /**
     * @return CSYS_ORG_POT_LEVEL
     */
    public String getCsysOrgPotLevel() {
        return csysOrgPotLevel;
    }

    /**
     * @param csysOrgPotLevel
     */
    public void setCsysOrgPotLevel(String csysOrgPotLevel) {
        this.csysOrgPotLevel = csysOrgPotLevel;
    }

    /**
     * @return CSYS_ORG_POT_TYPE
     */
    public String getCsysOrgPotType() {
        return csysOrgPotType;
    }

    /**
     * @param csysOrgPotType
     */
    public void setCsysOrgPotType(String csysOrgPotType) {
        this.csysOrgPotType = csysOrgPotType;
    }

    /**
     * @return CSYS_ORG_POT_TABLE
     */
    public String getCsysOrgPotTable() {
        return csysOrgPotTable;
    }

    /**
     * @param csysOrgPotTable
     */
    public void setCsysOrgPotTable(String csysOrgPotTable) {
        this.csysOrgPotTable = csysOrgPotTable;
    }

    /**
     * @return CSYS_ORG_POT_TABLE_ID
     */
    public String getCsysOrgPotTableId() {
        return csysOrgPotTableId;
    }

    /**
     * @param csysOrgPotTableId
     */
    public void setCsysOrgPotTableId(String csysOrgPotTableId) {
        this.csysOrgPotTableId = csysOrgPotTableId;
    }

    /**
     * @return CSYS_ORG_POT_CREATE_TIME
     */
    public Date getCsysOrgPotCreateTime() {
        return csysOrgPotCreateTime;
    }

    /**
     * @param csysOrgPotCreateTime
     */
    public void setCsysOrgPotCreateTime(Date csysOrgPotCreateTime) {
        this.csysOrgPotCreateTime = csysOrgPotCreateTime;
    }

    /**
     * @return CSYS_ORG_POT_CREATE_USER
     */
    public String getCsysOrgPotCreateUser() {
        return csysOrgPotCreateUser;
    }

    /**
     * @param csysOrgPotCreateUser
     */
    public void setCsysOrgPotCreateUser(String csysOrgPotCreateUser) {
        this.csysOrgPotCreateUser = csysOrgPotCreateUser;
    }

    /**
     * @return CSYS_ORG_POT_MODIFY_TIME
     */
    public Date getCsysOrgPotModifyTime() {
        return csysOrgPotModifyTime;
    }

    /**
     * @param csysOrgPotModifyTime
     */
    public void setCsysOrgPotModifyTime(Date csysOrgPotModifyTime) {
        this.csysOrgPotModifyTime = csysOrgPotModifyTime;
    }

    /**
     * @return CSYS_ORG_POT_MODIFY_USER
     */
    public String getCsysOrgPotModifyUser() {
        return csysOrgPotModifyUser;
    }

    /**
     * @param csysOrgPotModifyUser
     */
    public void setCsysOrgPotModifyUser(String csysOrgPotModifyUser) {
        this.csysOrgPotModifyUser = csysOrgPotModifyUser;
    }

    /**
     * @return CSYS_ORG_POT_IS_DELETE
     */
    public String getCsysOrgPotIsDelete() {
        return csysOrgPotIsDelete;
    }

    /**
     * @param csysOrgPotIsDelete
     */
    public void setCsysOrgPotIsDelete(String csysOrgPotIsDelete) {
        this.csysOrgPotIsDelete = csysOrgPotIsDelete;
    }

    /**
     * @return CSYS_ORG_POT_TIME
     */
    public Object getCsysOrgPotTime() {
        return csysOrgPotTime;
    }

    /**
     * @param csysOrgPotTime
     */
    public void setCsysOrgPotTime(Object csysOrgPotTime) {
        this.csysOrgPotTime = csysOrgPotTime;
    }

    /**
     * @return CSYS_ORG_POT_DATE
     */
    public Date getCsysOrgPotDate() {
        return csysOrgPotDate;
    }

    /**
     * @param csysOrgPotDate
     */
    public void setCsysOrgPotDate(Date csysOrgPotDate) {
        this.csysOrgPotDate = csysOrgPotDate;
    }

	public List getChildren() {
		return children;
	}

	public void setChildren(List children) {
		this.children = children;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean isExpanded() {
		return expanded;
	}

	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}

	public String getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}
    
}