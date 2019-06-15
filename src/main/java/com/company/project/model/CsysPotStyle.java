package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CSYS_POT_STYLE")
public class CsysPotStyle {
    @Id
    @Column(name = "CSYS_POT_STYLE_ID")
    private String csysPotStyleId;

    @Column(name = "CSYS_POT_STYLE_NAME")
    private String csysPotStyleName;

    @Column(name = "CSYS_POT_STYLE_COLOR")
    private String csysPotStyleColor;

    @Column(name = "CSYS_POT_STYLE_DESC")
    private String csysPotStyleDesc;

    @Column(name = "CSYS_POT_STYLE_CREATE_TIME")
    private Date csysPotStyleCreateTime;

    @Column(name = "CSYS_POT_STYLE_CREATE_USER")
    private String csysPotStyleCreateUser;

    @Column(name = "CSYS_POT_STYLE_MODIFY_USER")
    private String csysPotStyleModifyUser;

    @Column(name = "CSYS_POT_STYLE_MODIFY_TIME")
    private Date csysPotStyleModifyTime;

    @Column(name = "CSYS_POT_STYLE_IS_DELETE")
    private String csysPotStyleIsDelete;

    @Column(name = "CSYS_POT_STYLE_TIME")
    private Date csysPotStyleTime;

    @Column(name = "CSYS_POT_STYLE_DATE")
    private Date csysPotStyleDate;

    @Column(name = "CSYS_POT_STYLE_SHAPE")
    private String csysPotStyleShape;

    /**
     * @return CSYS_POT_STYLE_ID
     */
    public String getCsysPotStyleId() {
        return csysPotStyleId;
    }

    /**
     * @param csysPotStyleId
     */
    public void setCsysPotStyleId(String csysPotStyleId) {
        this.csysPotStyleId = csysPotStyleId;
    }

    /**
     * @return CSYS_POT_STYLE_NAME
     */
    public String getCsysPotStyleName() {
        return csysPotStyleName;
    }

    /**
     * @param csysPotStyleName
     */
    public void setCsysPotStyleName(String csysPotStyleName) {
        this.csysPotStyleName = csysPotStyleName;
    }

    /**
     * @return CSYS_POT_STYLE_COLOR
     */
    public String getCsysPotStyleColor() {
        return csysPotStyleColor;
    }

    /**
     * @param csysPotStyleColor
     */
    public void setCsysPotStyleColor(String csysPotStyleColor) {
        this.csysPotStyleColor = csysPotStyleColor;
    }

    /**
     * @return CSYS_POT_STYLE_DESC
     */
    public String getCsysPotStyleDesc() {
        return csysPotStyleDesc;
    }

    /**
     * @param csysPotStyleDesc
     */
    public void setCsysPotStyleDesc(String csysPotStyleDesc) {
        this.csysPotStyleDesc = csysPotStyleDesc;
    }

    /**
     * @return CSYS_POT_STYLE_CREATE_TIME
     */
    public Date getCsysPotStyleCreateTime() {
        return csysPotStyleCreateTime;
    }

    /**
     * @param csysPotStyleCreateTime
     */
    public void setCsysPotStyleCreateTime(Date csysPotStyleCreateTime) {
        this.csysPotStyleCreateTime = csysPotStyleCreateTime;
    }

    /**
     * @return CSYS_POT_STYLE_CREATE_USER
     */
    public String getCsysPotStyleCreateUser() {
        return csysPotStyleCreateUser;
    }

    /**
     * @param csysPotStyleCreateUser
     */
    public void setCsysPotStyleCreateUser(String csysPotStyleCreateUser) {
        this.csysPotStyleCreateUser = csysPotStyleCreateUser;
    }

    /**
     * @return CSYS_POT_STYLE_MODIFY_USER
     */
    public String getCsysPotStyleModifyUser() {
        return csysPotStyleModifyUser;
    }

    /**
     * @param csysPotStyleModifyUser
     */
    public void setCsysPotStyleModifyUser(String csysPotStyleModifyUser) {
        this.csysPotStyleModifyUser = csysPotStyleModifyUser;
    }

    /**
     * @return CSYS_POT_STYLE_MODIFY_TIME
     */
    public Date getCsysPotStyleModifyTime() {
        return csysPotStyleModifyTime;
    }

    /**
     * @param csysPotStyleModifyTime
     */
    public void setCsysPotStyleModifyTime(Date csysPotStyleModifyTime) {
        this.csysPotStyleModifyTime = csysPotStyleModifyTime;
    }

    /**
     * @return CSYS_POT_STYLE_IS_DELETE
     */
    public String getCsysPotStyleIsDelete() {
        return csysPotStyleIsDelete;
    }

    /**
     * @param csysPotStyleIsDelete
     */
    public void setCsysPotStyleIsDelete(String csysPotStyleIsDelete) {
        this.csysPotStyleIsDelete = csysPotStyleIsDelete;
    }

    /**
     * @return CSYS_POT_STYLE_TIME
     */
    public Date getCsysPotStyleTime() {
        return csysPotStyleTime;
    }

    /**
     * @param csysPotStyleTime
     */
    public void setCsysPotStyleTime(Date csysPotStyleTime) {
        this.csysPotStyleTime = csysPotStyleTime;
    }

    /**
     * @return CSYS_POT_STYLE_DATE
     */
    public Date getCsysPotStyleDate() {
        return csysPotStyleDate;
    }

    /**
     * @param csysPotStyleDate
     */
    public void setCsysPotStyleDate(Date csysPotStyleDate) {
        this.csysPotStyleDate = csysPotStyleDate;
    }

    /**
     * @return CSYS_POT_STYLE_SHAPE
     */
    public String getCsysPotStyleShape() {
        return csysPotStyleShape;
    }

    /**
     * @param csysPotStyleShape
     */
    public void setCsysPotStyleShape(String csysPotStyleShape) {
        this.csysPotStyleShape = csysPotStyleShape;
    }
}