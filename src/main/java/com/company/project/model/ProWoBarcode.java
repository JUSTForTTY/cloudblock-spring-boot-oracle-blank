package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "PRO_WO_BARCODE")
public class ProWoBarcode {
    @Id
    @Column(name = "PRO_WO_BARCODE_ID")
    private String proWoBarcodeId;

    @Column(name = "PRO_BAR_CODE")
    private String proBarCode;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "WO_CODE")
    private String woCode;

    @Column(name = "PRO_WO_BARCODE_CREATE_USER")
    private String proWoBarcodeCreateUser;

    @Column(name = "PRO_WO_BARCODE_CREATE_TIME")
    private Date proWoBarcodeCreateTime;

    @Column(name = "PRO_WO_BARCODE_MODIFY_USER")
    private String proWoBarcodeModifyUser;

    @Column(name = "PRO_WO_BARCODE_MODIFY_TIME")
    private Date proWoBarcodeModifyTime;

    @Column(name = "PRO_WO_BARCODE_IS_DELETE")
    private String proWoBarcodeIsDelete;

    @Column(name = "MARK_TIME")
    private Date markTime;

    @Column(name = "MARK_DATE")
    private Date markDate;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "BARCODE_GOOD_BADE")
    private String barcodeGoodBade;

    @Column(name = "PRODUCT_STATUS")
    private String productStatus;

    @Column(name = "CSYS_WORKFLOW_NAME")
    private String csysWorkflowName;

    @Column(name = "CSYS_WORKFLOW_STATUS")
    private String csysWorkflowStatus;

    @Column(name = "CSYS_POT_NAME")
    private String csysPotName;

    @Column(name = "OP_DESC")
    private String opDesc;

    @Column(name = "FACTORY_CODE")
    private String factoryCode;

    @Column(name = "WORK_SHOP_CODE")
    private String workShopCode;

    @Column(name = "SECTION_CODE")
    private String sectionCode;

    @Column(name = "PRO_LINE_CODE")
    private String proLineCode;

    @Column(name = "RESOURCE_CODE")
    private String resourceCode;

    @Column(name = "SHIFT_TYPE_CODE")
    private String shiftTypeCode;

    @Column(name = "SHIFT_CODE")
    private String shiftCode;

    @Column(name = "TIME_SLOT_CODE")
    private String timeSlotCode;

    @Column(name = "WORKER_CODE")
    private String workerCode;

    @Column(name = "BARCODE_START")
    private String barcodeStart;

    @Column(name = "BARCODE_END")
    private String barcodeEnd;

    @Column(name = "BINDING_WAY")
    private String bindingWay;

    @Column(name = "FLAG1")
    private String flag1;

    @Column(name = "FLAG2")
    private String flag2;

    @Column(name = "FLAG3")
    private String flag3;

    @Column(name = "FLAG4")
    private String flag4;

    @Column(name = "FLAG5")
    private String flag5;

    /**
     * @return PRO_WO_BARCODE_ID
     */
    public String getProWoBarcodeId() {
        return proWoBarcodeId;
    }

    /**
     * @param proWoBarcodeId
     */
    public void setProWoBarcodeId(String proWoBarcodeId) {
        this.proWoBarcodeId = proWoBarcodeId;
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
     * @return PRODUCT_CODE
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * @return WO_CODE
     */
    public String getWoCode() {
        return woCode;
    }

    /**
     * @param woCode
     */
    public void setWoCode(String woCode) {
        this.woCode = woCode;
    }

    /**
     * @return PRO_WO_BARCODE_CREATE_USER
     */
    public String getProWoBarcodeCreateUser() {
        return proWoBarcodeCreateUser;
    }

    /**
     * @param proWoBarcodeCreateUser
     */
    public void setProWoBarcodeCreateUser(String proWoBarcodeCreateUser) {
        this.proWoBarcodeCreateUser = proWoBarcodeCreateUser;
    }

    /**
     * @return PRO_WO_BARCODE_CREATE_TIME
     */
    public Date getProWoBarcodeCreateTime() {
        return proWoBarcodeCreateTime;
    }

    /**
     * @param proWoBarcodeCreateTime
     */
    public void setProWoBarcodeCreateTime(Date proWoBarcodeCreateTime) {
        this.proWoBarcodeCreateTime = proWoBarcodeCreateTime;
    }

    /**
     * @return PRO_WO_BARCODE_MODIFY_USER
     */
    public String getProWoBarcodeModifyUser() {
        return proWoBarcodeModifyUser;
    }

    /**
     * @param proWoBarcodeModifyUser
     */
    public void setProWoBarcodeModifyUser(String proWoBarcodeModifyUser) {
        this.proWoBarcodeModifyUser = proWoBarcodeModifyUser;
    }

    /**
     * @return PRO_WO_BARCODE_MODIFY_TIME
     */
    public Date getProWoBarcodeModifyTime() {
        return proWoBarcodeModifyTime;
    }

    /**
     * @param proWoBarcodeModifyTime
     */
    public void setProWoBarcodeModifyTime(Date proWoBarcodeModifyTime) {
        this.proWoBarcodeModifyTime = proWoBarcodeModifyTime;
    }

    /**
     * @return PRO_WO_BARCODE_IS_DELETE
     */
    public String getProWoBarcodeIsDelete() {
        return proWoBarcodeIsDelete;
    }

    /**
     * @param proWoBarcodeIsDelete
     */
    public void setProWoBarcodeIsDelete(String proWoBarcodeIsDelete) {
        this.proWoBarcodeIsDelete = proWoBarcodeIsDelete;
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

    /**
     * @return BARCODE_GOOD_BADE
     */
    public String getBarcodeGoodBade() {
        return barcodeGoodBade;
    }

    /**
     * @param barcodeGoodBade
     */
    public void setBarcodeGoodBade(String barcodeGoodBade) {
        this.barcodeGoodBade = barcodeGoodBade;
    }

    /**
     * @return PRODUCT_STATUS
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * @param productStatus
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
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
     * @return CSYS_WORKFLOW_STATUS
     */
    public String getCsysWorkflowStatus() {
        return csysWorkflowStatus;
    }

    /**
     * @param csysWorkflowStatus
     */
    public void setCsysWorkflowStatus(String csysWorkflowStatus) {
        this.csysWorkflowStatus = csysWorkflowStatus;
    }

    /**
     * @return CSYS_POT_NAME
     */
    public String getCsysPotName() {
        return csysPotName;
    }

    /**
     * @param csysPotName
     */
    public void setCsysPotName(String csysPotName) {
        this.csysPotName = csysPotName;
    }

    /**
     * @return OP_DESC
     */
    public String getOpDesc() {
        return opDesc;
    }

    /**
     * @param opDesc
     */
    public void setOpDesc(String opDesc) {
        this.opDesc = opDesc;
    }

    /**
     * @return FACTORY_CODE
     */
    public String getFactoryCode() {
        return factoryCode;
    }

    /**
     * @param factoryCode
     */
    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    /**
     * @return WORK_SHOP_CODE
     */
    public String getWorkShopCode() {
        return workShopCode;
    }

    /**
     * @param workShopCode
     */
    public void setWorkShopCode(String workShopCode) {
        this.workShopCode = workShopCode;
    }

    /**
     * @return SECTION_CODE
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * @param sectionCode
     */
    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    /**
     * @return PRO_LINE_CODE
     */
    public String getProLineCode() {
        return proLineCode;
    }

    /**
     * @param proLineCode
     */
    public void setProLineCode(String proLineCode) {
        this.proLineCode = proLineCode;
    }

    /**
     * @return RESOURCE_CODE
     */
    public String getResourceCode() {
        return resourceCode;
    }

    /**
     * @param resourceCode
     */
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    /**
     * @return SHIFT_TYPE_CODE
     */
    public String getShiftTypeCode() {
        return shiftTypeCode;
    }

    /**
     * @param shiftTypeCode
     */
    public void setShiftTypeCode(String shiftTypeCode) {
        this.shiftTypeCode = shiftTypeCode;
    }

    /**
     * @return SHIFT_CODE
     */
    public String getShiftCode() {
        return shiftCode;
    }

    /**
     * @param shiftCode
     */
    public void setShiftCode(String shiftCode) {
        this.shiftCode = shiftCode;
    }

    /**
     * @return TIME_SLOT_CODE
     */
    public String getTimeSlotCode() {
        return timeSlotCode;
    }

    /**
     * @param timeSlotCode
     */
    public void setTimeSlotCode(String timeSlotCode) {
        this.timeSlotCode = timeSlotCode;
    }

    /**
     * @return WORKER_CODE
     */
    public String getWorkerCode() {
        return workerCode;
    }

    /**
     * @param workerCode
     */
    public void setWorkerCode(String workerCode) {
        this.workerCode = workerCode;
    }

    /**
     * @return BARCODE_START
     */
    public String getBarcodeStart() {
        return barcodeStart;
    }

    /**
     * @param barcodeStart
     */
    public void setBarcodeStart(String barcodeStart) {
        this.barcodeStart = barcodeStart;
    }

    /**
     * @return BARCODE_END
     */
    public String getBarcodeEnd() {
        return barcodeEnd;
    }

    /**
     * @param barcodeEnd
     */
    public void setBarcodeEnd(String barcodeEnd) {
        this.barcodeEnd = barcodeEnd;
    }

    /**
     * @return BINDING_WAY
     */
    public String getBindingWay() {
        return bindingWay;
    }

    /**
     * @param bindingWay
     */
    public void setBindingWay(String bindingWay) {
        this.bindingWay = bindingWay;
    }

    /**
     * @return FLAG1
     */
    public String getFlag1() {
        return flag1;
    }

    /**
     * @param flag1
     */
    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }

    /**
     * @return FLAG2
     */
    public String getFlag2() {
        return flag2;
    }

    /**
     * @param flag2
     */
    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    /**
     * @return FLAG3
     */
    public String getFlag3() {
        return flag3;
    }

    /**
     * @param flag3
     */
    public void setFlag3(String flag3) {
        this.flag3 = flag3;
    }

    /**
     * @return FLAG4
     */
    public String getFlag4() {
        return flag4;
    }

    /**
     * @param flag4
     */
    public void setFlag4(String flag4) {
        this.flag4 = flag4;
    }

    /**
     * @return FLAG5
     */
    public String getFlag5() {
        return flag5;
    }

    /**
     * @param flag5
     */
    public void setFlag5(String flag5) {
        this.flag5 = flag5;
    }
}