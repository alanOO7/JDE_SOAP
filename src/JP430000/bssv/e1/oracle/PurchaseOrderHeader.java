/**
 * PurchaseOrderHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderHeader  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.Integer RMAId;

    private java.lang.String RMAType;

    private java.lang.String adjustmentScheduleCode;

    private java.lang.String approvalRouteCode;

    private java.lang.String businessUnit;

    private JP430000.bssv.e1.oracle.Entity buyer;

    private java.lang.Integer changeOrderNumber;

    private java.lang.String currencyCodeFrom;

    private java.lang.String currencyCodeTo;

    private JP430000.bssv.e1.oracle.PurchaseOrderDatesHeader dates;

    private JP430000.bssv.e1.oracle.PurchaseOrderDeliveryHeader delivery;

    private java.lang.String description1;

    private JP430000.bssv.e1.oracle.PurchaseOrderDetail[] detail;

    private java.lang.String evaluatedReceiptSettlement;

    private java.lang.String holdOrderCode;

    private java.lang.Boolean isTextAssociated;

    private java.lang.String orderTakenBy;

    private java.lang.String orderedBy;

    private java.lang.String paymentTermsCode;

    private java.math.BigDecimal percentRetainage;

    private java.lang.String printAIADocument;

    private java.lang.String printMessageCode;

    private JP430000.bssv.e1.oracle.PurchaseOrderProcessing processing;

    private JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey;

    private java.math.BigDecimal rateExchangeOverride;

    private java.lang.String reference;

    private java.lang.String remark;

    private java.lang.String sendMethodCode;

    private JP430000.bssv.e1.oracle.PurchaseOrderShipToAddressHeader shipToAddress;

    private JP430000.bssv.e1.oracle.PurchaseOrderSupplierAddressHeader supplierAddress;

    private java.lang.String supplierPriceGroupCode;

    private java.lang.String supplierSO;

    private JP430000.bssv.e1.oracle.PurchaseOrderTaxHeader tax;

    private java.lang.Integer triangulationRateFromCurrency;

    private java.lang.Integer triangulationRateToCurrency;

    private JP430000.bssv.e1.oracle.UserReservedData userReservedData;

    public PurchaseOrderHeader() {
    }

    public PurchaseOrderHeader(
           java.lang.Integer RMAId,
           java.lang.String RMAType,
           java.lang.String adjustmentScheduleCode,
           java.lang.String approvalRouteCode,
           java.lang.String businessUnit,
           JP430000.bssv.e1.oracle.Entity buyer,
           java.lang.Integer changeOrderNumber,
           java.lang.String currencyCodeFrom,
           java.lang.String currencyCodeTo,
           JP430000.bssv.e1.oracle.PurchaseOrderDatesHeader dates,
           JP430000.bssv.e1.oracle.PurchaseOrderDeliveryHeader delivery,
           java.lang.String description1,
           JP430000.bssv.e1.oracle.PurchaseOrderDetail[] detail,
           java.lang.String evaluatedReceiptSettlement,
           java.lang.String holdOrderCode,
           java.lang.Boolean isTextAssociated,
           java.lang.String orderTakenBy,
           java.lang.String orderedBy,
           java.lang.String paymentTermsCode,
           java.math.BigDecimal percentRetainage,
           java.lang.String printAIADocument,
           java.lang.String printMessageCode,
           JP430000.bssv.e1.oracle.PurchaseOrderProcessing processing,
           JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey,
           java.math.BigDecimal rateExchangeOverride,
           java.lang.String reference,
           java.lang.String remark,
           java.lang.String sendMethodCode,
           JP430000.bssv.e1.oracle.PurchaseOrderShipToAddressHeader shipToAddress,
           JP430000.bssv.e1.oracle.PurchaseOrderSupplierAddressHeader supplierAddress,
           java.lang.String supplierPriceGroupCode,
           java.lang.String supplierSO,
           JP430000.bssv.e1.oracle.PurchaseOrderTaxHeader tax,
           java.lang.Integer triangulationRateFromCurrency,
           java.lang.Integer triangulationRateToCurrency,
           JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.RMAId = RMAId;
        this.RMAType = RMAType;
        this.adjustmentScheduleCode = adjustmentScheduleCode;
        this.approvalRouteCode = approvalRouteCode;
        this.businessUnit = businessUnit;
        this.buyer = buyer;
        this.changeOrderNumber = changeOrderNumber;
        this.currencyCodeFrom = currencyCodeFrom;
        this.currencyCodeTo = currencyCodeTo;
        this.dates = dates;
        this.delivery = delivery;
        this.description1 = description1;
        this.detail = detail;
        this.evaluatedReceiptSettlement = evaluatedReceiptSettlement;
        this.holdOrderCode = holdOrderCode;
        this.isTextAssociated = isTextAssociated;
        this.orderTakenBy = orderTakenBy;
        this.orderedBy = orderedBy;
        this.paymentTermsCode = paymentTermsCode;
        this.percentRetainage = percentRetainage;
        this.printAIADocument = printAIADocument;
        this.printMessageCode = printMessageCode;
        this.processing = processing;
        this.purchaseOrderKey = purchaseOrderKey;
        this.rateExchangeOverride = rateExchangeOverride;
        this.reference = reference;
        this.remark = remark;
        this.sendMethodCode = sendMethodCode;
        this.shipToAddress = shipToAddress;
        this.supplierAddress = supplierAddress;
        this.supplierPriceGroupCode = supplierPriceGroupCode;
        this.supplierSO = supplierSO;
        this.tax = tax;
        this.triangulationRateFromCurrency = triangulationRateFromCurrency;
        this.triangulationRateToCurrency = triangulationRateToCurrency;
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the RMAId value for this PurchaseOrderHeader.
     * 
     * @return RMAId
     */
    public java.lang.Integer getRMAId() {
        return RMAId;
    }


    /**
     * Sets the RMAId value for this PurchaseOrderHeader.
     * 
     * @param RMAId
     */
    public void setRMAId(java.lang.Integer RMAId) {
        this.RMAId = RMAId;
    }


    /**
     * Gets the RMAType value for this PurchaseOrderHeader.
     * 
     * @return RMAType
     */
    public java.lang.String getRMAType() {
        return RMAType;
    }


    /**
     * Sets the RMAType value for this PurchaseOrderHeader.
     * 
     * @param RMAType
     */
    public void setRMAType(java.lang.String RMAType) {
        this.RMAType = RMAType;
    }


    /**
     * Gets the adjustmentScheduleCode value for this PurchaseOrderHeader.
     * 
     * @return adjustmentScheduleCode
     */
    public java.lang.String getAdjustmentScheduleCode() {
        return adjustmentScheduleCode;
    }


    /**
     * Sets the adjustmentScheduleCode value for this PurchaseOrderHeader.
     * 
     * @param adjustmentScheduleCode
     */
    public void setAdjustmentScheduleCode(java.lang.String adjustmentScheduleCode) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
    }


    /**
     * Gets the approvalRouteCode value for this PurchaseOrderHeader.
     * 
     * @return approvalRouteCode
     */
    public java.lang.String getApprovalRouteCode() {
        return approvalRouteCode;
    }


    /**
     * Sets the approvalRouteCode value for this PurchaseOrderHeader.
     * 
     * @param approvalRouteCode
     */
    public void setApprovalRouteCode(java.lang.String approvalRouteCode) {
        this.approvalRouteCode = approvalRouteCode;
    }


    /**
     * Gets the businessUnit value for this PurchaseOrderHeader.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this PurchaseOrderHeader.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the buyer value for this PurchaseOrderHeader.
     * 
     * @return buyer
     */
    public JP430000.bssv.e1.oracle.Entity getBuyer() {
        return buyer;
    }


    /**
     * Sets the buyer value for this PurchaseOrderHeader.
     * 
     * @param buyer
     */
    public void setBuyer(JP430000.bssv.e1.oracle.Entity buyer) {
        this.buyer = buyer;
    }


    /**
     * Gets the changeOrderNumber value for this PurchaseOrderHeader.
     * 
     * @return changeOrderNumber
     */
    public java.lang.Integer getChangeOrderNumber() {
        return changeOrderNumber;
    }


    /**
     * Sets the changeOrderNumber value for this PurchaseOrderHeader.
     * 
     * @param changeOrderNumber
     */
    public void setChangeOrderNumber(java.lang.Integer changeOrderNumber) {
        this.changeOrderNumber = changeOrderNumber;
    }


    /**
     * Gets the currencyCodeFrom value for this PurchaseOrderHeader.
     * 
     * @return currencyCodeFrom
     */
    public java.lang.String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }


    /**
     * Sets the currencyCodeFrom value for this PurchaseOrderHeader.
     * 
     * @param currencyCodeFrom
     */
    public void setCurrencyCodeFrom(java.lang.String currencyCodeFrom) {
        this.currencyCodeFrom = currencyCodeFrom;
    }


    /**
     * Gets the currencyCodeTo value for this PurchaseOrderHeader.
     * 
     * @return currencyCodeTo
     */
    public java.lang.String getCurrencyCodeTo() {
        return currencyCodeTo;
    }


    /**
     * Sets the currencyCodeTo value for this PurchaseOrderHeader.
     * 
     * @param currencyCodeTo
     */
    public void setCurrencyCodeTo(java.lang.String currencyCodeTo) {
        this.currencyCodeTo = currencyCodeTo;
    }


    /**
     * Gets the dates value for this PurchaseOrderHeader.
     * 
     * @return dates
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderDatesHeader getDates() {
        return dates;
    }


    /**
     * Sets the dates value for this PurchaseOrderHeader.
     * 
     * @param dates
     */
    public void setDates(JP430000.bssv.e1.oracle.PurchaseOrderDatesHeader dates) {
        this.dates = dates;
    }


    /**
     * Gets the delivery value for this PurchaseOrderHeader.
     * 
     * @return delivery
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderDeliveryHeader getDelivery() {
        return delivery;
    }


    /**
     * Sets the delivery value for this PurchaseOrderHeader.
     * 
     * @param delivery
     */
    public void setDelivery(JP430000.bssv.e1.oracle.PurchaseOrderDeliveryHeader delivery) {
        this.delivery = delivery;
    }


    /**
     * Gets the description1 value for this PurchaseOrderHeader.
     * 
     * @return description1
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this PurchaseOrderHeader.
     * 
     * @param description1
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the detail value for this PurchaseOrderHeader.
     * 
     * @return detail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderDetail[] getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this PurchaseOrderHeader.
     * 
     * @param detail
     */
    public void setDetail(JP430000.bssv.e1.oracle.PurchaseOrderDetail[] detail) {
        this.detail = detail;
    }

    public JP430000.bssv.e1.oracle.PurchaseOrderDetail getDetail(int i) {
        return this.detail[i];
    }

    public void setDetail(int i, JP430000.bssv.e1.oracle.PurchaseOrderDetail _value) {
        this.detail[i] = _value;
    }


    /**
     * Gets the evaluatedReceiptSettlement value for this PurchaseOrderHeader.
     * 
     * @return evaluatedReceiptSettlement
     */
    public java.lang.String getEvaluatedReceiptSettlement() {
        return evaluatedReceiptSettlement;
    }


    /**
     * Sets the evaluatedReceiptSettlement value for this PurchaseOrderHeader.
     * 
     * @param evaluatedReceiptSettlement
     */
    public void setEvaluatedReceiptSettlement(java.lang.String evaluatedReceiptSettlement) {
        this.evaluatedReceiptSettlement = evaluatedReceiptSettlement;
    }


    /**
     * Gets the holdOrderCode value for this PurchaseOrderHeader.
     * 
     * @return holdOrderCode
     */
    public java.lang.String getHoldOrderCode() {
        return holdOrderCode;
    }


    /**
     * Sets the holdOrderCode value for this PurchaseOrderHeader.
     * 
     * @param holdOrderCode
     */
    public void setHoldOrderCode(java.lang.String holdOrderCode) {
        this.holdOrderCode = holdOrderCode;
    }


    /**
     * Gets the isTextAssociated value for this PurchaseOrderHeader.
     * 
     * @return isTextAssociated
     */
    public java.lang.Boolean getIsTextAssociated() {
        return isTextAssociated;
    }


    /**
     * Sets the isTextAssociated value for this PurchaseOrderHeader.
     * 
     * @param isTextAssociated
     */
    public void setIsTextAssociated(java.lang.Boolean isTextAssociated) {
        this.isTextAssociated = isTextAssociated;
    }


    /**
     * Gets the orderTakenBy value for this PurchaseOrderHeader.
     * 
     * @return orderTakenBy
     */
    public java.lang.String getOrderTakenBy() {
        return orderTakenBy;
    }


    /**
     * Sets the orderTakenBy value for this PurchaseOrderHeader.
     * 
     * @param orderTakenBy
     */
    public void setOrderTakenBy(java.lang.String orderTakenBy) {
        this.orderTakenBy = orderTakenBy;
    }


    /**
     * Gets the orderedBy value for this PurchaseOrderHeader.
     * 
     * @return orderedBy
     */
    public java.lang.String getOrderedBy() {
        return orderedBy;
    }


    /**
     * Sets the orderedBy value for this PurchaseOrderHeader.
     * 
     * @param orderedBy
     */
    public void setOrderedBy(java.lang.String orderedBy) {
        this.orderedBy = orderedBy;
    }


    /**
     * Gets the paymentTermsCode value for this PurchaseOrderHeader.
     * 
     * @return paymentTermsCode
     */
    public java.lang.String getPaymentTermsCode() {
        return paymentTermsCode;
    }


    /**
     * Sets the paymentTermsCode value for this PurchaseOrderHeader.
     * 
     * @param paymentTermsCode
     */
    public void setPaymentTermsCode(java.lang.String paymentTermsCode) {
        this.paymentTermsCode = paymentTermsCode;
    }


    /**
     * Gets the percentRetainage value for this PurchaseOrderHeader.
     * 
     * @return percentRetainage
     */
    public java.math.BigDecimal getPercentRetainage() {
        return percentRetainage;
    }


    /**
     * Sets the percentRetainage value for this PurchaseOrderHeader.
     * 
     * @param percentRetainage
     */
    public void setPercentRetainage(java.math.BigDecimal percentRetainage) {
        this.percentRetainage = percentRetainage;
    }


    /**
     * Gets the printAIADocument value for this PurchaseOrderHeader.
     * 
     * @return printAIADocument
     */
    public java.lang.String getPrintAIADocument() {
        return printAIADocument;
    }


    /**
     * Sets the printAIADocument value for this PurchaseOrderHeader.
     * 
     * @param printAIADocument
     */
    public void setPrintAIADocument(java.lang.String printAIADocument) {
        this.printAIADocument = printAIADocument;
    }


    /**
     * Gets the printMessageCode value for this PurchaseOrderHeader.
     * 
     * @return printMessageCode
     */
    public java.lang.String getPrintMessageCode() {
        return printMessageCode;
    }


    /**
     * Sets the printMessageCode value for this PurchaseOrderHeader.
     * 
     * @param printMessageCode
     */
    public void setPrintMessageCode(java.lang.String printMessageCode) {
        this.printMessageCode = printMessageCode;
    }


    /**
     * Gets the processing value for this PurchaseOrderHeader.
     * 
     * @return processing
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderProcessing getProcessing() {
        return processing;
    }


    /**
     * Sets the processing value for this PurchaseOrderHeader.
     * 
     * @param processing
     */
    public void setProcessing(JP430000.bssv.e1.oracle.PurchaseOrderProcessing processing) {
        this.processing = processing;
    }


    /**
     * Gets the purchaseOrderKey value for this PurchaseOrderHeader.
     * 
     * @return purchaseOrderKey
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderKey getPurchaseOrderKey() {
        return purchaseOrderKey;
    }


    /**
     * Sets the purchaseOrderKey value for this PurchaseOrderHeader.
     * 
     * @param purchaseOrderKey
     */
    public void setPurchaseOrderKey(JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey) {
        this.purchaseOrderKey = purchaseOrderKey;
    }


    /**
     * Gets the rateExchangeOverride value for this PurchaseOrderHeader.
     * 
     * @return rateExchangeOverride
     */
    public java.math.BigDecimal getRateExchangeOverride() {
        return rateExchangeOverride;
    }


    /**
     * Sets the rateExchangeOverride value for this PurchaseOrderHeader.
     * 
     * @param rateExchangeOverride
     */
    public void setRateExchangeOverride(java.math.BigDecimal rateExchangeOverride) {
        this.rateExchangeOverride = rateExchangeOverride;
    }


    /**
     * Gets the reference value for this PurchaseOrderHeader.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this PurchaseOrderHeader.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the remark value for this PurchaseOrderHeader.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this PurchaseOrderHeader.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the sendMethodCode value for this PurchaseOrderHeader.
     * 
     * @return sendMethodCode
     */
    public java.lang.String getSendMethodCode() {
        return sendMethodCode;
    }


    /**
     * Sets the sendMethodCode value for this PurchaseOrderHeader.
     * 
     * @param sendMethodCode
     */
    public void setSendMethodCode(java.lang.String sendMethodCode) {
        this.sendMethodCode = sendMethodCode;
    }


    /**
     * Gets the shipToAddress value for this PurchaseOrderHeader.
     * 
     * @return shipToAddress
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderShipToAddressHeader getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this PurchaseOrderHeader.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(JP430000.bssv.e1.oracle.PurchaseOrderShipToAddressHeader shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the supplierAddress value for this PurchaseOrderHeader.
     * 
     * @return supplierAddress
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderSupplierAddressHeader getSupplierAddress() {
        return supplierAddress;
    }


    /**
     * Sets the supplierAddress value for this PurchaseOrderHeader.
     * 
     * @param supplierAddress
     */
    public void setSupplierAddress(JP430000.bssv.e1.oracle.PurchaseOrderSupplierAddressHeader supplierAddress) {
        this.supplierAddress = supplierAddress;
    }


    /**
     * Gets the supplierPriceGroupCode value for this PurchaseOrderHeader.
     * 
     * @return supplierPriceGroupCode
     */
    public java.lang.String getSupplierPriceGroupCode() {
        return supplierPriceGroupCode;
    }


    /**
     * Sets the supplierPriceGroupCode value for this PurchaseOrderHeader.
     * 
     * @param supplierPriceGroupCode
     */
    public void setSupplierPriceGroupCode(java.lang.String supplierPriceGroupCode) {
        this.supplierPriceGroupCode = supplierPriceGroupCode;
    }


    /**
     * Gets the supplierSO value for this PurchaseOrderHeader.
     * 
     * @return supplierSO
     */
    public java.lang.String getSupplierSO() {
        return supplierSO;
    }


    /**
     * Sets the supplierSO value for this PurchaseOrderHeader.
     * 
     * @param supplierSO
     */
    public void setSupplierSO(java.lang.String supplierSO) {
        this.supplierSO = supplierSO;
    }


    /**
     * Gets the tax value for this PurchaseOrderHeader.
     * 
     * @return tax
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderTaxHeader getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this PurchaseOrderHeader.
     * 
     * @param tax
     */
    public void setTax(JP430000.bssv.e1.oracle.PurchaseOrderTaxHeader tax) {
        this.tax = tax;
    }


    /**
     * Gets the triangulationRateFromCurrency value for this PurchaseOrderHeader.
     * 
     * @return triangulationRateFromCurrency
     */
    public java.lang.Integer getTriangulationRateFromCurrency() {
        return triangulationRateFromCurrency;
    }


    /**
     * Sets the triangulationRateFromCurrency value for this PurchaseOrderHeader.
     * 
     * @param triangulationRateFromCurrency
     */
    public void setTriangulationRateFromCurrency(java.lang.Integer triangulationRateFromCurrency) {
        this.triangulationRateFromCurrency = triangulationRateFromCurrency;
    }


    /**
     * Gets the triangulationRateToCurrency value for this PurchaseOrderHeader.
     * 
     * @return triangulationRateToCurrency
     */
    public java.lang.Integer getTriangulationRateToCurrency() {
        return triangulationRateToCurrency;
    }


    /**
     * Sets the triangulationRateToCurrency value for this PurchaseOrderHeader.
     * 
     * @param triangulationRateToCurrency
     */
    public void setTriangulationRateToCurrency(java.lang.Integer triangulationRateToCurrency) {
        this.triangulationRateToCurrency = triangulationRateToCurrency;
    }


    /**
     * Gets the userReservedData value for this PurchaseOrderHeader.
     * 
     * @return userReservedData
     */
    public JP430000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this PurchaseOrderHeader.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderHeader)) return false;
        PurchaseOrderHeader other = (PurchaseOrderHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.RMAId==null && other.getRMAId()==null) || 
             (this.RMAId!=null &&
              this.RMAId.equals(other.getRMAId()))) &&
            ((this.RMAType==null && other.getRMAType()==null) || 
             (this.RMAType!=null &&
              this.RMAType.equals(other.getRMAType()))) &&
            ((this.adjustmentScheduleCode==null && other.getAdjustmentScheduleCode()==null) || 
             (this.adjustmentScheduleCode!=null &&
              this.adjustmentScheduleCode.equals(other.getAdjustmentScheduleCode()))) &&
            ((this.approvalRouteCode==null && other.getApprovalRouteCode()==null) || 
             (this.approvalRouteCode!=null &&
              this.approvalRouteCode.equals(other.getApprovalRouteCode()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.buyer==null && other.getBuyer()==null) || 
             (this.buyer!=null &&
              this.buyer.equals(other.getBuyer()))) &&
            ((this.changeOrderNumber==null && other.getChangeOrderNumber()==null) || 
             (this.changeOrderNumber!=null &&
              this.changeOrderNumber.equals(other.getChangeOrderNumber()))) &&
            ((this.currencyCodeFrom==null && other.getCurrencyCodeFrom()==null) || 
             (this.currencyCodeFrom!=null &&
              this.currencyCodeFrom.equals(other.getCurrencyCodeFrom()))) &&
            ((this.currencyCodeTo==null && other.getCurrencyCodeTo()==null) || 
             (this.currencyCodeTo!=null &&
              this.currencyCodeTo.equals(other.getCurrencyCodeTo()))) &&
            ((this.dates==null && other.getDates()==null) || 
             (this.dates!=null &&
              this.dates.equals(other.getDates()))) &&
            ((this.delivery==null && other.getDelivery()==null) || 
             (this.delivery!=null &&
              this.delivery.equals(other.getDelivery()))) &&
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              java.util.Arrays.equals(this.detail, other.getDetail()))) &&
            ((this.evaluatedReceiptSettlement==null && other.getEvaluatedReceiptSettlement()==null) || 
             (this.evaluatedReceiptSettlement!=null &&
              this.evaluatedReceiptSettlement.equals(other.getEvaluatedReceiptSettlement()))) &&
            ((this.holdOrderCode==null && other.getHoldOrderCode()==null) || 
             (this.holdOrderCode!=null &&
              this.holdOrderCode.equals(other.getHoldOrderCode()))) &&
            ((this.isTextAssociated==null && other.getIsTextAssociated()==null) || 
             (this.isTextAssociated!=null &&
              this.isTextAssociated.equals(other.getIsTextAssociated()))) &&
            ((this.orderTakenBy==null && other.getOrderTakenBy()==null) || 
             (this.orderTakenBy!=null &&
              this.orderTakenBy.equals(other.getOrderTakenBy()))) &&
            ((this.orderedBy==null && other.getOrderedBy()==null) || 
             (this.orderedBy!=null &&
              this.orderedBy.equals(other.getOrderedBy()))) &&
            ((this.paymentTermsCode==null && other.getPaymentTermsCode()==null) || 
             (this.paymentTermsCode!=null &&
              this.paymentTermsCode.equals(other.getPaymentTermsCode()))) &&
            ((this.percentRetainage==null && other.getPercentRetainage()==null) || 
             (this.percentRetainage!=null &&
              this.percentRetainage.equals(other.getPercentRetainage()))) &&
            ((this.printAIADocument==null && other.getPrintAIADocument()==null) || 
             (this.printAIADocument!=null &&
              this.printAIADocument.equals(other.getPrintAIADocument()))) &&
            ((this.printMessageCode==null && other.getPrintMessageCode()==null) || 
             (this.printMessageCode!=null &&
              this.printMessageCode.equals(other.getPrintMessageCode()))) &&
            ((this.processing==null && other.getProcessing()==null) || 
             (this.processing!=null &&
              this.processing.equals(other.getProcessing()))) &&
            ((this.purchaseOrderKey==null && other.getPurchaseOrderKey()==null) || 
             (this.purchaseOrderKey!=null &&
              this.purchaseOrderKey.equals(other.getPurchaseOrderKey()))) &&
            ((this.rateExchangeOverride==null && other.getRateExchangeOverride()==null) || 
             (this.rateExchangeOverride!=null &&
              this.rateExchangeOverride.equals(other.getRateExchangeOverride()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.sendMethodCode==null && other.getSendMethodCode()==null) || 
             (this.sendMethodCode!=null &&
              this.sendMethodCode.equals(other.getSendMethodCode()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.supplierAddress==null && other.getSupplierAddress()==null) || 
             (this.supplierAddress!=null &&
              this.supplierAddress.equals(other.getSupplierAddress()))) &&
            ((this.supplierPriceGroupCode==null && other.getSupplierPriceGroupCode()==null) || 
             (this.supplierPriceGroupCode!=null &&
              this.supplierPriceGroupCode.equals(other.getSupplierPriceGroupCode()))) &&
            ((this.supplierSO==null && other.getSupplierSO()==null) || 
             (this.supplierSO!=null &&
              this.supplierSO.equals(other.getSupplierSO()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.triangulationRateFromCurrency==null && other.getTriangulationRateFromCurrency()==null) || 
             (this.triangulationRateFromCurrency!=null &&
              this.triangulationRateFromCurrency.equals(other.getTriangulationRateFromCurrency()))) &&
            ((this.triangulationRateToCurrency==null && other.getTriangulationRateToCurrency()==null) || 
             (this.triangulationRateToCurrency!=null &&
              this.triangulationRateToCurrency.equals(other.getTriangulationRateToCurrency()))) &&
            ((this.userReservedData==null && other.getUserReservedData()==null) || 
             (this.userReservedData!=null &&
              this.userReservedData.equals(other.getUserReservedData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRMAId() != null) {
            _hashCode += getRMAId().hashCode();
        }
        if (getRMAType() != null) {
            _hashCode += getRMAType().hashCode();
        }
        if (getAdjustmentScheduleCode() != null) {
            _hashCode += getAdjustmentScheduleCode().hashCode();
        }
        if (getApprovalRouteCode() != null) {
            _hashCode += getApprovalRouteCode().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getBuyer() != null) {
            _hashCode += getBuyer().hashCode();
        }
        if (getChangeOrderNumber() != null) {
            _hashCode += getChangeOrderNumber().hashCode();
        }
        if (getCurrencyCodeFrom() != null) {
            _hashCode += getCurrencyCodeFrom().hashCode();
        }
        if (getCurrencyCodeTo() != null) {
            _hashCode += getCurrencyCodeTo().hashCode();
        }
        if (getDates() != null) {
            _hashCode += getDates().hashCode();
        }
        if (getDelivery() != null) {
            _hashCode += getDelivery().hashCode();
        }
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvaluatedReceiptSettlement() != null) {
            _hashCode += getEvaluatedReceiptSettlement().hashCode();
        }
        if (getHoldOrderCode() != null) {
            _hashCode += getHoldOrderCode().hashCode();
        }
        if (getIsTextAssociated() != null) {
            _hashCode += getIsTextAssociated().hashCode();
        }
        if (getOrderTakenBy() != null) {
            _hashCode += getOrderTakenBy().hashCode();
        }
        if (getOrderedBy() != null) {
            _hashCode += getOrderedBy().hashCode();
        }
        if (getPaymentTermsCode() != null) {
            _hashCode += getPaymentTermsCode().hashCode();
        }
        if (getPercentRetainage() != null) {
            _hashCode += getPercentRetainage().hashCode();
        }
        if (getPrintAIADocument() != null) {
            _hashCode += getPrintAIADocument().hashCode();
        }
        if (getPrintMessageCode() != null) {
            _hashCode += getPrintMessageCode().hashCode();
        }
        if (getProcessing() != null) {
            _hashCode += getProcessing().hashCode();
        }
        if (getPurchaseOrderKey() != null) {
            _hashCode += getPurchaseOrderKey().hashCode();
        }
        if (getRateExchangeOverride() != null) {
            _hashCode += getRateExchangeOverride().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getSendMethodCode() != null) {
            _hashCode += getSendMethodCode().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getSupplierAddress() != null) {
            _hashCode += getSupplierAddress().hashCode();
        }
        if (getSupplierPriceGroupCode() != null) {
            _hashCode += getSupplierPriceGroupCode().hashCode();
        }
        if (getSupplierSO() != null) {
            _hashCode += getSupplierSO().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getTriangulationRateFromCurrency() != null) {
            _hashCode += getTriangulationRateFromCurrency().hashCode();
        }
        if (getTriangulationRateToCurrency() != null) {
            _hashCode += getTriangulationRateToCurrency().hashCode();
        }
        if (getUserReservedData() != null) {
            _hashCode += getUserReservedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMAId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RMAId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMAType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RMAType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentScheduleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentScheduleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalRouteCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvalRouteCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCodeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCodeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCodeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCodeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDatesHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDeliveryHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evaluatedReceiptSettlement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evaluatedReceiptSettlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdOrderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdOrderCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTextAssociated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isTextAssociated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderTakenBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderTakenBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTermsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentTermsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentRetainage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentRetainage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printAIADocument");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printAIADocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printMessageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printMessageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderProcessing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateExchangeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateExchangeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendMethodCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendMethodCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipToAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShipToAddressHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplierAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderSupplierAddressHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierPriceGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplierPriceGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierSO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplierSO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderTaxHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triangulationRateFromCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triangulationRateFromCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triangulationRateToCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triangulationRateToCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userReservedData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userReservedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "userReservedData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
