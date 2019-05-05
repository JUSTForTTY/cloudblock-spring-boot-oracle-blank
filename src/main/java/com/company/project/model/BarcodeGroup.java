package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "BARCODE_GROUP")
public class BarcodeGroup {
    @Id
    @Column(name = "BARCODE_GROUP_ID")
    private String barcodeGroupId;

    @Column(name = "PRO_BAR_CODE")
    private String proBarCode;

    @Column(name = "BARCODE_GROUP_CODE")
    private String barcodeGroupCode;

    @Column(name = "GROUP_TYPE")
    private String groupType;

    @Column(name = "BARCODE_GROUP_CREATE_USER")
    private String barcodeGroupCreateUser;

    @Column(name = "BARCODE_GROUP_CREATE_TIME")
    private Date barcodeGroupCreateTime;

    @Column(name = "BARCODE_GROUP_MODIFY_USER")
    private String barcodeGroupModifyUser;

    @Column(name = "BARCODE_GROUP_MODIFY_TIME")
    private Date barcodeGroupModifyTime;

    @Column(name = "BARCODE_GROUP_IS_DELETE")
    private String barcodeGroupIsDelete;

    @Column(name = "MARK_TIME")
    private Date markTime;

    @Column(name = "MARK_DATE")
    private Date markDate;

    @Column(name = "REMARK")
    private String remark;

    /**
     * @return BARCODE_GROUP_ID
     */
    public String getBarcodeGroupId() {
        return barcodeGroupId;
    }

    /**
     * @param barcodeGroupId
     */
    public void setBarcodeGroupId(String barcodeGroupId) {
        this.barcodeGroupId = barcodeGroupId;
    }

    /**
     * @return PRO_BAR_CODE
     */
    public String getProBarCode() {
        return proBarCode;
    }

    /**
     * @param proBarCode
     */
    public void setProBarCode(String proBarCode) {
        this.proBarCode = proBarCode;
    }

    /**
     * @return BARCODE_GROUP_CODE
     */
    public String getBarcodeGroupCode() {
        return barcodeGroupCode;
    }

    /**
     * @param barcodeGroupCode
     */
    public void setBarcodeGroupCode(String barcodeGroupCode) {
        this.barcodeGroupCode = barcodeGroupCode;
    }

    /**
     * @return GROUP_TYPE
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * @param groupType
     */
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    /**
     * @return BARCODE_GROUP_CREATE_USER
     */
    public String getBarcodeGroupCreateUser() {
        return barcodeGroupCreateUser;
    }

    /**
     * @param barcodeGroupCreateUser
     */
    public void setBarcodeGroupCreateUser(String barcodeGroupCreateUser) {
        this.barcodeGroupCreateUser = barcodeGroupCreateUser;
    }

    /**
     * @return BARCODE_GROUP_CREATE_TIME
     */
    public Date getBarcodeGroupCreateTime() {
        return barcodeGroupCreateTime;
    }

    /**
     * @param barcodeGroupCreateTime
     */
    public void setBarcodeGroupCreateTime(Date barcodeGroupCreateTime) {
        this.barcodeGroupCreateTime = barcodeGroupCreateTime;
    }

    /**
     * @return BARCODE_GROUP_MODIFY_USER
     */
    public String getBarcodeGroupModifyUser() {
        return barcodeGroupModifyUser;
    }

    /**
     * @param barcodeGroupModifyUser
     */
    public void setBarcodeGroupModifyUser(String barcodeGroupModifyUser) {
        this.barcodeGroupModifyUser = barcodeGroupModifyUser;
    }

    /**
     * @return BARCODE_GROUP_MODIFY_TIME
     */
    public Date getBarcodeGroupModifyTime() {
        return barcodeGroupModifyTime;
    }

    /**
     * @param barcodeGroupModifyTime
     */
    public void setBarcodeGroupModifyTime(Date barcodeGroupModifyTime) {
        this.barcodeGroupModifyTime = barcodeGroupModifyTime;
    }

    /**
     * @return BARCODE_GROUP_IS_DELETE
     */
    public String getBarcodeGroupIsDelete() {
        return barcodeGroupIsDelete;
    }

    /**
     * @param barcodeGroupIsDelete
     */
    public void setBarcodeGroupIsDelete(String barcodeGroupIsDelete) {
        this.barcodeGroupIsDelete = barcodeGroupIsDelete;
    }

    /**
     * @return MARK_TIME
     */
    public Date getMarkTime() {
        return markTime;
    }

    /**
     * @param markTime
     */
    public void setMarkTime(Date markTime) {
        this.markTime = markTime;
    }

    /**
     * @return MARK_DATE
     */
    public Date getMarkDate() {
        return markDate;
    }

    /**
     * @param markDate
     */
    public void setMarkDate(Date markDate) {
        this.markDate = markDate;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}