/**
 * PurchaseOrderShowHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderShowHeader  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String activityReasonCode;

    private java.lang.String adjustmentScheduleCode;

    private java.math.BigDecimal amountGross;

    private java.math.BigDecimal amountOpen;

    private java.lang.String approvedRoutingBy;

    private java.lang.String businessUnit;

    private java.lang.String conditionsOfTransportCode;

    private java.lang.String container;

    private java.lang.String currencyCodeBase;

    private java.lang.String currencyCodeFrom;

    private java.lang.String currencyModeCode;

    private JP430000.bssv.e1.oracle.PurchaseOrderShowDates dates;

    private java.lang.String deliveryInstruction1;

    private java.lang.String deliveryInstruction2;

    private java.lang.String description1;

    private JP430000.bssv.e1.oracle.PurchaseOrderShowDetail[] detail;

    private java.lang.Integer entityIdBuyer;

    private java.lang.Integer entityIdCarrier;

    private java.lang.Integer entityIdMarkfor;

    private java.lang.Integer entityIdShipTo;

    private java.lang.Integer entityIdSupplier;

    private java.lang.String freightHandlingCode;

    private java.lang.String holdCode;

    private java.lang.Boolean isFreightApplied;

    private java.lang.Boolean isFreightCalculated;

    private java.lang.Boolean isPrepaid;

    private java.lang.Boolean isQuantityPosted;

    private java.lang.Boolean isTextAssociated;

    private java.lang.String itemPriceGroupCode;

    private java.lang.String languageCode;

    private java.lang.String logicControl;

    private java.lang.String modeOfTransportCode;

    private java.lang.String nameRemark;

    private java.lang.Integer numberOfInvoices;

    private java.lang.String orderTakenBy;

    private java.lang.String orderedBy;

    private java.lang.String paymentTermsCode;

    private java.math.BigDecimal percentRetainage;

    private java.lang.String printMessageCode;

    private java.lang.String processingModeCode;

    private JP430000.bssv.e1.oracle.PurchaseOrderShowKey purchaseOrderShowKey;

    private java.lang.String purgeCode;

    private java.math.BigDecimal rateExchangeOverride;

    private java.lang.String retainageRule;

    private java.lang.String sendMethodCode;

    private java.lang.String statusOrderCode;

    private java.lang.String taxExemptCertificate;

    private java.lang.String taxExplanationCode;

    private java.lang.String taxRateAreaCode;

    private java.lang.Integer timePromisedDelivery;

    private java.lang.Integer timePromisedShip;

    private java.lang.String transactionNature;

    private java.lang.String typeMatch;

    private java.lang.String unitOfMeasureCodeVolume;

    private java.lang.String unitOfMeasureCodeWeight;

    private JP430000.bssv.e1.oracle.UserReservedData userReservedData;

    private java.lang.String voucherCode;

    private java.lang.String zoneNumber;

    public PurchaseOrderShowHeader() {
    }

    public PurchaseOrderShowHeader(
           java.lang.String activityReasonCode,
           java.lang.String adjustmentScheduleCode,
           java.math.BigDecimal amountGross,
           java.math.BigDecimal amountOpen,
           java.lang.String approvedRoutingBy,
           java.lang.String businessUnit,
           java.lang.String conditionsOfTransportCode,
           java.lang.String container,
           java.lang.String currencyCodeBase,
           java.lang.String currencyCodeFrom,
           java.lang.String currencyModeCode,
           JP430000.bssv.e1.oracle.PurchaseOrderShowDates dates,
           java.lang.String deliveryInstruction1,
           java.lang.String deliveryInstruction2,
           java.lang.String description1,
           JP430000.bssv.e1.oracle.PurchaseOrderShowDetail[] detail,
           java.lang.Integer entityIdBuyer,
           java.lang.Integer entityIdCarrier,
           java.lang.Integer entityIdMarkfor,
           java.lang.Integer entityIdShipTo,
           java.lang.Integer entityIdSupplier,
           java.lang.String freightHandlingCode,
           java.lang.String holdCode,
           java.lang.Boolean isFreightApplied,
           java.lang.Boolean isFreightCalculated,
           java.lang.Boolean isPrepaid,
           java.lang.Boolean isQuantityPosted,
           java.lang.Boolean isTextAssociated,
           java.lang.String itemPriceGroupCode,
           java.lang.String languageCode,
           java.lang.String logicControl,
           java.lang.String modeOfTransportCode,
           java.lang.String nameRemark,
           java.lang.Integer numberOfInvoices,
           java.lang.String orderTakenBy,
           java.lang.String orderedBy,
           java.lang.String paymentTermsCode,
           java.math.BigDecimal percentRetainage,
           java.lang.String printMessageCode,
           java.lang.String processingModeCode,
           JP430000.bssv.e1.oracle.PurchaseOrderShowKey purchaseOrderShowKey,
           java.lang.String purgeCode,
           java.math.BigDecimal rateExchangeOverride,
           java.lang.String retainageRule,
           java.lang.String sendMethodCode,
           java.lang.String statusOrderCode,
           java.lang.String taxExemptCertificate,
           java.lang.String taxExplanationCode,
           java.lang.String taxRateAreaCode,
           java.lang.Integer timePromisedDelivery,
           java.lang.Integer timePromisedShip,
           java.lang.String transactionNature,
           java.lang.String typeMatch,
           java.lang.String unitOfMeasureCodeVolume,
           java.lang.String unitOfMeasureCodeWeight,
           JP430000.bssv.e1.oracle.UserReservedData userReservedData,
           java.lang.String voucherCode,
           java.lang.String zoneNumber) {
        this.activityReasonCode = activityReasonCode;
        this.adjustmentScheduleCode = adjustmentScheduleCode;
        this.amountGross = amountGross;
        this.amountOpen = amountOpen;
        this.approvedRoutingBy = approvedRoutingBy;
        this.businessUnit = businessUnit;
        this.conditionsOfTransportCode = conditionsOfTransportCode;
        this.container = container;
        this.currencyCodeBase = currencyCodeBase;
        this.currencyCodeFrom = currencyCodeFrom;
        this.currencyModeCode = currencyModeCode;
        this.dates = dates;
        this.deliveryInstruction1 = deliveryInstruction1;
        this.deliveryInstruction2 = deliveryInstruction2;
        this.description1 = description1;
        this.detail = detail;
        this.entityIdBuyer = entityIdBuyer;
        this.entityIdCarrier = entityIdCarrier;
        this.entityIdMarkfor = entityIdMarkfor;
        this.entityIdShipTo = entityIdShipTo;
        this.entityIdSupplier = entityIdSupplier;
        this.freightHandlingCode = freightHandlingCode;
        this.holdCode = holdCode;
        this.isFreightApplied = isFreightApplied;
        this.isFreightCalculated = isFreightCalculated;
        this.isPrepaid = isPrepaid;
        this.isQuantityPosted = isQuantityPosted;
        this.isTextAssociated = isTextAssociated;
        this.itemPriceGroupCode = itemPriceGroupCode;
        this.languageCode = languageCode;
        this.logicControl = logicControl;
        this.modeOfTransportCode = modeOfTransportCode;
        this.nameRemark = nameRemark;
        this.numberOfInvoices = numberOfInvoices;
        this.orderTakenBy = orderTakenBy;
        this.orderedBy = orderedBy;
        this.paymentTermsCode = paymentTermsCode;
        this.percentRetainage = percentRetainage;
        this.printMessageCode = printMessageCode;
        this.processingModeCode = processingModeCode;
        this.purchaseOrderShowKey = purchaseOrderShowKey;
        this.purgeCode = purgeCode;
        this.rateExchangeOverride = rateExchangeOverride;
        this.retainageRule = retainageRule;
        this.sendMethodCode = sendMethodCode;
        this.statusOrderCode = statusOrderCode;
        this.taxExemptCertificate = taxExemptCertificate;
        this.taxExplanationCode = taxExplanationCode;
        this.taxRateAreaCode = taxRateAreaCode;
        this.timePromisedDelivery = timePromisedDelivery;
        this.timePromisedShip = timePromisedShip;
        this.transactionNature = transactionNature;
        this.typeMatch = typeMatch;
        this.unitOfMeasureCodeVolume = unitOfMeasureCodeVolume;
        this.unitOfMeasureCodeWeight = unitOfMeasureCodeWeight;
        this.userReservedData = userReservedData;
        this.voucherCode = voucherCode;
        this.zoneNumber = zoneNumber;
    }


    /**
     * Gets the activityReasonCode value for this PurchaseOrderShowHeader.
     * 
     * @return activityReasonCode
     */
    public java.lang.String getActivityReasonCode() {
        return activityReasonCode;
    }


    /**
     * Sets the activityReasonCode value for this PurchaseOrderShowHeader.
     * 
     * @param activityReasonCode
     */
    public void setActivityReasonCode(java.lang.String activityReasonCode) {
        this.activityReasonCode = activityReasonCode;
    }


    /**
     * Gets the adjustmentScheduleCode value for this PurchaseOrderShowHeader.
     * 
     * @return adjustmentScheduleCode
     */
    public java.lang.String getAdjustmentScheduleCode() {
        return adjustmentScheduleCode;
    }


    /**
     * Sets the adjustmentScheduleCode value for this PurchaseOrderShowHeader.
     * 
     * @param adjustmentScheduleCode
     */
    public void setAdjustmentScheduleCode(java.lang.String adjustmentScheduleCode) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
    }


    /**
     * Gets the amountGross value for this PurchaseOrderShowHeader.
     * 
     * @return amountGross
     */
    public java.math.BigDecimal getAmountGross() {
        return amountGross;
    }


    /**
     * Sets the amountGross value for this PurchaseOrderShowHeader.
     * 
     * @param amountGross
     */
    public void setAmountGross(java.math.BigDecimal amountGross) {
        this.amountGross = amountGross;
    }


    /**
     * Gets the amountOpen value for this PurchaseOrderShowHeader.
     * 
     * @return amountOpen
     */
    public java.math.BigDecimal getAmountOpen() {
        return amountOpen;
    }


    /**
     * Sets the amountOpen value for this PurchaseOrderShowHeader.
     * 
     * @param amountOpen
     */
    public void setAmountOpen(java.math.BigDecimal amountOpen) {
        this.amountOpen = amountOpen;
    }


    /**
     * Gets the approvedRoutingBy value for this PurchaseOrderShowHeader.
     * 
     * @return approvedRoutingBy
     */
    public java.lang.String getApprovedRoutingBy() {
        return approvedRoutingBy;
    }


    /**
     * Sets the approvedRoutingBy value for this PurchaseOrderShowHeader.
     * 
     * @param approvedRoutingBy
     */
    public void setApprovedRoutingBy(java.lang.String approvedRoutingBy) {
        this.approvedRoutingBy = approvedRoutingBy;
    }


    /**
     * Gets the businessUnit value for this PurchaseOrderShowHeader.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this PurchaseOrderShowHeader.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the conditionsOfTransportCode value for this PurchaseOrderShowHeader.
     * 
     * @return conditionsOfTransportCode
     */
    public java.lang.String getConditionsOfTransportCode() {
        return conditionsOfTransportCode;
    }


    /**
     * Sets the conditionsOfTransportCode value for this PurchaseOrderShowHeader.
     * 
     * @param conditionsOfTransportCode
     */
    public void setConditionsOfTransportCode(java.lang.String conditionsOfTransportCode) {
        this.conditionsOfTransportCode = conditionsOfTransportCode;
    }


    /**
     * Gets the container value for this PurchaseOrderShowHeader.
     * 
     * @return container
     */
    public java.lang.String getContainer() {
        return container;
    }


    /**
     * Sets the container value for this PurchaseOrderShowHeader.
     * 
     * @param container
     */
    public void setContainer(java.lang.String container) {
        this.container = container;
    }


    /**
     * Gets the currencyCodeBase value for this PurchaseOrderShowHeader.
     * 
     * @return currencyCodeBase
     */
    public java.lang.String getCurrencyCodeBase() {
        return currencyCodeBase;
    }


    /**
     * Sets the currencyCodeBase value for this PurchaseOrderShowHeader.
     * 
     * @param currencyCodeBase
     */
    public void setCurrencyCodeBase(java.lang.String currencyCodeBase) {
        this.currencyCodeBase = currencyCodeBase;
    }


    /**
     * Gets the currencyCodeFrom value for this PurchaseOrderShowHeader.
     * 
     * @return currencyCodeFrom
     */
    public java.lang.String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }


    /**
     * Sets the currencyCodeFrom value for this PurchaseOrderShowHeader.
     * 
     * @param currencyCodeFrom
     */
    public void setCurrencyCodeFrom(java.lang.String currencyCodeFrom) {
        this.currencyCodeFrom = currencyCodeFrom;
    }


    /**
     * Gets the currencyModeCode value for this PurchaseOrderShowHeader.
     * 
     * @return currencyModeCode
     */
    public java.lang.String getCurrencyModeCode() {
        return currencyModeCode;
    }


    /**
     * Sets the currencyModeCode value for this PurchaseOrderShowHeader.
     * 
     * @param currencyModeCode
     */
    public void setCurrencyModeCode(java.lang.String currencyModeCode) {
        this.currencyModeCode = currencyModeCode;
    }


    /**
     * Gets the dates value for this PurchaseOrderShowHeader.
     * 
     * @return dates
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderShowDates getDates() {
        return dates;
    }


    /**
     * Sets the dates value for this PurchaseOrderShowHeader.
     * 
     * @param dates
     */
    public void setDates(JP430000.bssv.e1.oracle.PurchaseOrderShowDates dates) {
        this.dates = dates;
    }


    /**
     * Gets the deliveryInstruction1 value for this PurchaseOrderShowHeader.
     * 
     * @return deliveryInstruction1
     */
    public java.lang.String getDeliveryInstruction1() {
        return deliveryInstruction1;
    }


    /**
     * Sets the deliveryInstruction1 value for this PurchaseOrderShowHeader.
     * 
     * @param deliveryInstruction1
     */
    public void setDeliveryInstruction1(java.lang.String deliveryInstruction1) {
        this.deliveryInstruction1 = deliveryInstruction1;
    }


    /**
     * Gets the deliveryInstruction2 value for this PurchaseOrderShowHeader.
     * 
     * @return deliveryInstruction2
     */
    public java.lang.String getDeliveryInstruction2() {
        return deliveryInstruction2;
    }


    /**
     * Sets the deliveryInstruction2 value for this PurchaseOrderShowHeader.
     * 
     * @param deliveryInstruction2
     */
    public void setDeliveryInstruction2(java.lang.String deliveryInstruction2) {
        this.deliveryInstruction2 = deliveryInstruction2;
    }


    /**
     * Gets the description1 value for this PurchaseOrderShowHeader.
     * 
     * @return description1
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this PurchaseOrderShowHeader.
     * 
     * @param description1
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the detail value for this PurchaseOrderShowHeader.
     * 
     * @return detail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderShowDetail[] getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this PurchaseOrderShowHeader.
     * 
     * @param detail
     */
    public void setDetail(JP430000.bssv.e1.oracle.PurchaseOrderShowDetail[] detail) {
        this.detail = detail;
    }

    public JP430000.bssv.e1.oracle.PurchaseOrderShowDetail getDetail(int i) {
        return this.detail[i];
    }

    public void setDetail(int i, JP430000.bssv.e1.oracle.PurchaseOrderShowDetail _value) {
        this.detail[i] = _value;
    }


    /**
     * Gets the entityIdBuyer value for this PurchaseOrderShowHeader.
     * 
     * @return entityIdBuyer
     */
    public java.lang.Integer getEntityIdBuyer() {
        return entityIdBuyer;
    }


    /**
     * Sets the entityIdBuyer value for this PurchaseOrderShowHeader.
     * 
     * @param entityIdBuyer
     */
    public void setEntityIdBuyer(java.lang.Integer entityIdBuyer) {
        this.entityIdBuyer = entityIdBuyer;
    }


    /**
     * Gets the entityIdCarrier value for this PurchaseOrderShowHeader.
     * 
     * @return entityIdCarrier
     */
    public java.lang.Integer getEntityIdCarrier() {
        return entityIdCarrier;
    }


    /**
     * Sets the entityIdCarrier value for this PurchaseOrderShowHeader.
     * 
     * @param entityIdCarrier
     */
    public void setEntityIdCarrier(java.lang.Integer entityIdCarrier) {
        this.entityIdCarrier = entityIdCarrier;
    }


    /**
     * Gets the entityIdMarkfor value for this PurchaseOrderShowHeader.
     * 
     * @return entityIdMarkfor
     */
    public java.lang.Integer getEntityIdMarkfor() {
        return entityIdMarkfor;
    }


    /**
     * Sets the entityIdMarkfor value for this PurchaseOrderShowHeader.
     * 
     * @param entityIdMarkfor
     */
    public void setEntityIdMarkfor(java.lang.Integer entityIdMarkfor) {
        this.entityIdMarkfor = entityIdMarkfor;
    }


    /**
     * Gets the entityIdShipTo value for this PurchaseOrderShowHeader.
     * 
     * @return entityIdShipTo
     */
    public java.lang.Integer getEntityIdShipTo() {
        return entityIdShipTo;
    }


    /**
     * Sets the entityIdShipTo value for this PurchaseOrderShowHeader.
     * 
     * @param entityIdShipTo
     */
    public void setEntityIdShipTo(java.lang.Integer entityIdShipTo) {
        this.entityIdShipTo = entityIdShipTo;
    }


    /**
     * Gets the entityIdSupplier value for this PurchaseOrderShowHeader.
     * 
     * @return entityIdSupplier
     */
    public java.lang.Integer getEntityIdSupplier() {
        return entityIdSupplier;
    }


    /**
     * Sets the entityIdSupplier value for this PurchaseOrderShowHeader.
     * 
     * @param entityIdSupplier
     */
    public void setEntityIdSupplier(java.lang.Integer entityIdSupplier) {
        this.entityIdSupplier = entityIdSupplier;
    }


    /**
     * Gets the freightHandlingCode value for this PurchaseOrderShowHeader.
     * 
     * @return freightHandlingCode
     */
    public java.lang.String getFreightHandlingCode() {
        return freightHandlingCode;
    }


    /**
     * Sets the freightHandlingCode value for this PurchaseOrderShowHeader.
     * 
     * @param freightHandlingCode
     */
    public void setFreightHandlingCode(java.lang.String freightHandlingCode) {
        this.freightHandlingCode = freightHandlingCode;
    }


    /**
     * Gets the holdCode value for this PurchaseOrderShowHeader.
     * 
     * @return holdCode
     */
    public java.lang.String getHoldCode() {
        return holdCode;
    }


    /**
     * Sets the holdCode value for this PurchaseOrderShowHeader.
     * 
     * @param holdCode
     */
    public void setHoldCode(java.lang.String holdCode) {
        this.holdCode = holdCode;
    }


    /**
     * Gets the isFreightApplied value for this PurchaseOrderShowHeader.
     * 
     * @return isFreightApplied
     */
    public java.lang.Boolean getIsFreightApplied() {
        return isFreightApplied;
    }


    /**
     * Sets the isFreightApplied value for this PurchaseOrderShowHeader.
     * 
     * @param isFreightApplied
     */
    public void setIsFreightApplied(java.lang.Boolean isFreightApplied) {
        this.isFreightApplied = isFreightApplied;
    }


    /**
     * Gets the isFreightCalculated value for this PurchaseOrderShowHeader.
     * 
     * @return isFreightCalculated
     */
    public java.lang.Boolean getIsFreightCalculated() {
        return isFreightCalculated;
    }


    /**
     * Sets the isFreightCalculated value for this PurchaseOrderShowHeader.
     * 
     * @param isFreightCalculated
     */
    public void setIsFreightCalculated(java.lang.Boolean isFreightCalculated) {
        this.isFreightCalculated = isFreightCalculated;
    }


    /**
     * Gets the isPrepaid value for this PurchaseOrderShowHeader.
     * 
     * @return isPrepaid
     */
    public java.lang.Boolean getIsPrepaid() {
        return isPrepaid;
    }


    /**
     * Sets the isPrepaid value for this PurchaseOrderShowHeader.
     * 
     * @param isPrepaid
     */
    public void setIsPrepaid(java.lang.Boolean isPrepaid) {
        this.isPrepaid = isPrepaid;
    }


    /**
     * Gets the isQuantityPosted value for this PurchaseOrderShowHeader.
     * 
     * @return isQuantityPosted
     */
    public java.lang.Boolean getIsQuantityPosted() {
        return isQuantityPosted;
    }


    /**
     * Sets the isQuantityPosted value for this PurchaseOrderShowHeader.
     * 
     * @param isQuantityPosted
     */
    public void setIsQuantityPosted(java.lang.Boolean isQuantityPosted) {
        this.isQuantityPosted = isQuantityPosted;
    }


    /**
     * Gets the isTextAssociated value for this PurchaseOrderShowHeader.
     * 
     * @return isTextAssociated
     */
    public java.lang.Boolean getIsTextAssociated() {
        return isTextAssociated;
    }


    /**
     * Sets the isTextAssociated value for this PurchaseOrderShowHeader.
     * 
     * @param isTextAssociated
     */
    public void setIsTextAssociated(java.lang.Boolean isTextAssociated) {
        this.isTextAssociated = isTextAssociated;
    }


    /**
     * Gets the itemPriceGroupCode value for this PurchaseOrderShowHeader.
     * 
     * @return itemPriceGroupCode
     */
    public java.lang.String getItemPriceGroupCode() {
        return itemPriceGroupCode;
    }


    /**
     * Sets the itemPriceGroupCode value for this PurchaseOrderShowHeader.
     * 
     * @param itemPriceGroupCode
     */
    public void setItemPriceGroupCode(java.lang.String itemPriceGroupCode) {
        this.itemPriceGroupCode = itemPriceGroupCode;
    }


    /**
     * Gets the languageCode value for this PurchaseOrderShowHeader.
     * 
     * @return languageCode
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this PurchaseOrderShowHeader.
     * 
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the logicControl value for this PurchaseOrderShowHeader.
     * 
     * @return logicControl
     */
    public java.lang.String getLogicControl() {
        return logicControl;
    }


    /**
     * Sets the logicControl value for this PurchaseOrderShowHeader.
     * 
     * @param logicControl
     */
    public void setLogicControl(java.lang.String logicControl) {
        this.logicControl = logicControl;
    }


    /**
     * Gets the modeOfTransportCode value for this PurchaseOrderShowHeader.
     * 
     * @return modeOfTransportCode
     */
    public java.lang.String getModeOfTransportCode() {
        return modeOfTransportCode;
    }


    /**
     * Sets the modeOfTransportCode value for this PurchaseOrderShowHeader.
     * 
     * @param modeOfTransportCode
     */
    public void setModeOfTransportCode(java.lang.String modeOfTransportCode) {
        this.modeOfTransportCode = modeOfTransportCode;
    }


    /**
     * Gets the nameRemark value for this PurchaseOrderShowHeader.
     * 
     * @return nameRemark
     */
    public java.lang.String getNameRemark() {
        return nameRemark;
    }


    /**
     * Sets the nameRemark value for this PurchaseOrderShowHeader.
     * 
     * @param nameRemark
     */
    public void setNameRemark(java.lang.String nameRemark) {
        this.nameRemark = nameRemark;
    }


    /**
     * Gets the numberOfInvoices value for this PurchaseOrderShowHeader.
     * 
     * @return numberOfInvoices
     */
    public java.lang.Integer getNumberOfInvoices() {
        return numberOfInvoices;
    }


    /**
     * Sets the numberOfInvoices value for this PurchaseOrderShowHeader.
     * 
     * @param numberOfInvoices
     */
    public void setNumberOfInvoices(java.lang.Integer numberOfInvoices) {
        this.numberOfInvoices = numberOfInvoices;
    }


    /**
     * Gets the orderTakenBy value for this PurchaseOrderShowHeader.
     * 
     * @return orderTakenBy
     */
    public java.lang.String getOrderTakenBy() {
        return orderTakenBy;
    }


    /**
     * Sets the orderTakenBy value for this PurchaseOrderShowHeader.
     * 
     * @param orderTakenBy
     */
    public void setOrderTakenBy(java.lang.String orderTakenBy) {
        this.orderTakenBy = orderTakenBy;
    }


    /**
     * Gets the orderedBy value for this PurchaseOrderShowHeader.
     * 
     * @return orderedBy
     */
    public java.lang.String getOrderedBy() {
        return orderedBy;
    }


    /**
     * Sets the orderedBy value for this PurchaseOrderShowHeader.
     * 
     * @param orderedBy
     */
    public void setOrderedBy(java.lang.String orderedBy) {
        this.orderedBy = orderedBy;
    }


    /**
     * Gets the paymentTermsCode value for this PurchaseOrderShowHeader.
     * 
     * @return paymentTermsCode
     */
    public java.lang.String getPaymentTermsCode() {
        return paymentTermsCode;
    }


    /**
     * Sets the paymentTermsCode value for this PurchaseOrderShowHeader.
     * 
     * @param paymentTermsCode
     */
    public void setPaymentTermsCode(java.lang.String paymentTermsCode) {
        this.paymentTermsCode = paymentTermsCode;
    }


    /**
     * Gets the percentRetainage value for this PurchaseOrderShowHeader.
     * 
     * @return percentRetainage
     */
    public java.math.BigDecimal getPercentRetainage() {
        return percentRetainage;
    }


    /**
     * Sets the percentRetainage value for this PurchaseOrderShowHeader.
     * 
     * @param percentRetainage
     */
    public void setPercentRetainage(java.math.BigDecimal percentRetainage) {
        this.percentRetainage = percentRetainage;
    }


    /**
     * Gets the printMessageCode value for this PurchaseOrderShowHeader.
     * 
     * @return printMessageCode
     */
    public java.lang.String getPrintMessageCode() {
        return printMessageCode;
    }


    /**
     * Sets the printMessageCode value for this PurchaseOrderShowHeader.
     * 
     * @param printMessageCode
     */
    public void setPrintMessageCode(java.lang.String printMessageCode) {
        this.printMessageCode = printMessageCode;
    }


    /**
     * Gets the processingModeCode value for this PurchaseOrderShowHeader.
     * 
     * @return processingModeCode
     */
    public java.lang.String getProcessingModeCode() {
        return processingModeCode;
    }


    /**
     * Sets the processingModeCode value for this PurchaseOrderShowHeader.
     * 
     * @param processingModeCode
     */
    public void setProcessingModeCode(java.lang.String processingModeCode) {
        this.processingModeCode = processingModeCode;
    }


    /**
     * Gets the purchaseOrderShowKey value for this PurchaseOrderShowHeader.
     * 
     * @return purchaseOrderShowKey
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderShowKey getPurchaseOrderShowKey() {
        return purchaseOrderShowKey;
    }


    /**
     * Sets the purchaseOrderShowKey value for this PurchaseOrderShowHeader.
     * 
     * @param purchaseOrderShowKey
     */
    public void setPurchaseOrderShowKey(JP430000.bssv.e1.oracle.PurchaseOrderShowKey purchaseOrderShowKey) {
        this.purchaseOrderShowKey = purchaseOrderShowKey;
    }


    /**
     * Gets the purgeCode value for this PurchaseOrderShowHeader.
     * 
     * @return purgeCode
     */
    public java.lang.String getPurgeCode() {
        return purgeCode;
    }


    /**
     * Sets the purgeCode value for this PurchaseOrderShowHeader.
     * 
     * @param purgeCode
     */
    public void setPurgeCode(java.lang.String purgeCode) {
        this.purgeCode = purgeCode;
    }


    /**
     * Gets the rateExchangeOverride value for this PurchaseOrderShowHeader.
     * 
     * @return rateExchangeOverride
     */
    public java.math.BigDecimal getRateExchangeOverride() {
        return rateExchangeOverride;
    }


    /**
     * Sets the rateExchangeOverride value for this PurchaseOrderShowHeader.
     * 
     * @param rateExchangeOverride
     */
    public void setRateExchangeOverride(java.math.BigDecimal rateExchangeOverride) {
        this.rateExchangeOverride = rateExchangeOverride;
    }


    /**
     * Gets the retainageRule value for this PurchaseOrderShowHeader.
     * 
     * @return retainageRule
     */
    public java.lang.String getRetainageRule() {
        return retainageRule;
    }


    /**
     * Sets the retainageRule value for this PurchaseOrderShowHeader.
     * 
     * @param retainageRule
     */
    public void setRetainageRule(java.lang.String retainageRule) {
        this.retainageRule = retainageRule;
    }


    /**
     * Gets the sendMethodCode value for this PurchaseOrderShowHeader.
     * 
     * @return sendMethodCode
     */
    public java.lang.String getSendMethodCode() {
        return sendMethodCode;
    }


    /**
     * Sets the sendMethodCode value for this PurchaseOrderShowHeader.
     * 
     * @param sendMethodCode
     */
    public void setSendMethodCode(java.lang.String sendMethodCode) {
        this.sendMethodCode = sendMethodCode;
    }


    /**
     * Gets the statusOrderCode value for this PurchaseOrderShowHeader.
     * 
     * @return statusOrderCode
     */
    public java.lang.String getStatusOrderCode() {
        return statusOrderCode;
    }


    /**
     * Sets the statusOrderCode value for this PurchaseOrderShowHeader.
     * 
     * @param statusOrderCode
     */
    public void setStatusOrderCode(java.lang.String statusOrderCode) {
        this.statusOrderCode = statusOrderCode;
    }


    /**
     * Gets the taxExemptCertificate value for this PurchaseOrderShowHeader.
     * 
     * @return taxExemptCertificate
     */
    public java.lang.String getTaxExemptCertificate() {
        return taxExemptCertificate;
    }


    /**
     * Sets the taxExemptCertificate value for this PurchaseOrderShowHeader.
     * 
     * @param taxExemptCertificate
     */
    public void setTaxExemptCertificate(java.lang.String taxExemptCertificate) {
        this.taxExemptCertificate = taxExemptCertificate;
    }


    /**
     * Gets the taxExplanationCode value for this PurchaseOrderShowHeader.
     * 
     * @return taxExplanationCode
     */
    public java.lang.String getTaxExplanationCode() {
        return taxExplanationCode;
    }


    /**
     * Sets the taxExplanationCode value for this PurchaseOrderShowHeader.
     * 
     * @param taxExplanationCode
     */
    public void setTaxExplanationCode(java.lang.String taxExplanationCode) {
        this.taxExplanationCode = taxExplanationCode;
    }


    /**
     * Gets the taxRateAreaCode value for this PurchaseOrderShowHeader.
     * 
     * @return taxRateAreaCode
     */
    public java.lang.String getTaxRateAreaCode() {
        return taxRateAreaCode;
    }


    /**
     * Sets the taxRateAreaCode value for this PurchaseOrderShowHeader.
     * 
     * @param taxRateAreaCode
     */
    public void setTaxRateAreaCode(java.lang.String taxRateAreaCode) {
        this.taxRateAreaCode = taxRateAreaCode;
    }


    /**
     * Gets the timePromisedDelivery value for this PurchaseOrderShowHeader.
     * 
     * @return timePromisedDelivery
     */
    public java.lang.Integer getTimePromisedDelivery() {
        return timePromisedDelivery;
    }


    /**
     * Sets the timePromisedDelivery value for this PurchaseOrderShowHeader.
     * 
     * @param timePromisedDelivery
     */
    public void setTimePromisedDelivery(java.lang.Integer timePromisedDelivery) {
        this.timePromisedDelivery = timePromisedDelivery;
    }


    /**
     * Gets the timePromisedShip value for this PurchaseOrderShowHeader.
     * 
     * @return timePromisedShip
     */
    public java.lang.Integer getTimePromisedShip() {
        return timePromisedShip;
    }


    /**
     * Sets the timePromisedShip value for this PurchaseOrderShowHeader.
     * 
     * @param timePromisedShip
     */
    public void setTimePromisedShip(java.lang.Integer timePromisedShip) {
        this.timePromisedShip = timePromisedShip;
    }


    /**
     * Gets the transactionNature value for this PurchaseOrderShowHeader.
     * 
     * @return transactionNature
     */
    public java.lang.String getTransactionNature() {
        return transactionNature;
    }


    /**
     * Sets the transactionNature value for this PurchaseOrderShowHeader.
     * 
     * @param transactionNature
     */
    public void setTransactionNature(java.lang.String transactionNature) {
        this.transactionNature = transactionNature;
    }


    /**
     * Gets the typeMatch value for this PurchaseOrderShowHeader.
     * 
     * @return typeMatch
     */
    public java.lang.String getTypeMatch() {
        return typeMatch;
    }


    /**
     * Sets the typeMatch value for this PurchaseOrderShowHeader.
     * 
     * @param typeMatch
     */
    public void setTypeMatch(java.lang.String typeMatch) {
        this.typeMatch = typeMatch;
    }


    /**
     * Gets the unitOfMeasureCodeVolume value for this PurchaseOrderShowHeader.
     * 
     * @return unitOfMeasureCodeVolume
     */
    public java.lang.String getUnitOfMeasureCodeVolume() {
        return unitOfMeasureCodeVolume;
    }


    /**
     * Sets the unitOfMeasureCodeVolume value for this PurchaseOrderShowHeader.
     * 
     * @param unitOfMeasureCodeVolume
     */
    public void setUnitOfMeasureCodeVolume(java.lang.String unitOfMeasureCodeVolume) {
        this.unitOfMeasureCodeVolume = unitOfMeasureCodeVolume;
    }


    /**
     * Gets the unitOfMeasureCodeWeight value for this PurchaseOrderShowHeader.
     * 
     * @return unitOfMeasureCodeWeight
     */
    public java.lang.String getUnitOfMeasureCodeWeight() {
        return unitOfMeasureCodeWeight;
    }


    /**
     * Sets the unitOfMeasureCodeWeight value for this PurchaseOrderShowHeader.
     * 
     * @param unitOfMeasureCodeWeight
     */
    public void setUnitOfMeasureCodeWeight(java.lang.String unitOfMeasureCodeWeight) {
        this.unitOfMeasureCodeWeight = unitOfMeasureCodeWeight;
    }


    /**
     * Gets the userReservedData value for this PurchaseOrderShowHeader.
     * 
     * @return userReservedData
     */
    public JP430000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this PurchaseOrderShowHeader.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the voucherCode value for this PurchaseOrderShowHeader.
     * 
     * @return voucherCode
     */
    public java.lang.String getVoucherCode() {
        return voucherCode;
    }


    /**
     * Sets the voucherCode value for this PurchaseOrderShowHeader.
     * 
     * @param voucherCode
     */
    public void setVoucherCode(java.lang.String voucherCode) {
        this.voucherCode = voucherCode;
    }


    /**
     * Gets the zoneNumber value for this PurchaseOrderShowHeader.
     * 
     * @return zoneNumber
     */
    public java.lang.String getZoneNumber() {
        return zoneNumber;
    }


    /**
     * Sets the zoneNumber value for this PurchaseOrderShowHeader.
     * 
     * @param zoneNumber
     */
    public void setZoneNumber(java.lang.String zoneNumber) {
        this.zoneNumber = zoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderShowHeader)) return false;
        PurchaseOrderShowHeader other = (PurchaseOrderShowHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activityReasonCode==null && other.getActivityReasonCode()==null) || 
             (this.activityReasonCode!=null &&
              this.activityReasonCode.equals(other.getActivityReasonCode()))) &&
            ((this.adjustmentScheduleCode==null && other.getAdjustmentScheduleCode()==null) || 
             (this.adjustmentScheduleCode!=null &&
              this.adjustmentScheduleCode.equals(other.getAdjustmentScheduleCode()))) &&
            ((this.amountGross==null && other.getAmountGross()==null) || 
             (this.amountGross!=null &&
              this.amountGross.equals(other.getAmountGross()))) &&
            ((this.amountOpen==null && other.getAmountOpen()==null) || 
             (this.amountOpen!=null &&
              this.amountOpen.equals(other.getAmountOpen()))) &&
            ((this.approvedRoutingBy==null && other.getApprovedRoutingBy()==null) || 
             (this.approvedRoutingBy!=null &&
              this.approvedRoutingBy.equals(other.getApprovedRoutingBy()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.conditionsOfTransportCode==null && other.getConditionsOfTransportCode()==null) || 
             (this.conditionsOfTransportCode!=null &&
              this.conditionsOfTransportCode.equals(other.getConditionsOfTransportCode()))) &&
            ((this.container==null && other.getContainer()==null) || 
             (this.container!=null &&
              this.container.equals(other.getContainer()))) &&
            ((this.currencyCodeBase==null && other.getCurrencyCodeBase()==null) || 
             (this.currencyCodeBase!=null &&
              this.currencyCodeBase.equals(other.getCurrencyCodeBase()))) &&
            ((this.currencyCodeFrom==null && other.getCurrencyCodeFrom()==null) || 
             (this.currencyCodeFrom!=null &&
              this.currencyCodeFrom.equals(other.getCurrencyCodeFrom()))) &&
            ((this.currencyModeCode==null && other.getCurrencyModeCode()==null) || 
             (this.currencyModeCode!=null &&
              this.currencyModeCode.equals(other.getCurrencyModeCode()))) &&
            ((this.dates==null && other.getDates()==null) || 
             (this.dates!=null &&
              this.dates.equals(other.getDates()))) &&
            ((this.deliveryInstruction1==null && other.getDeliveryInstruction1()==null) || 
             (this.deliveryInstruction1!=null &&
              this.deliveryInstruction1.equals(other.getDeliveryInstruction1()))) &&
            ((this.deliveryInstruction2==null && other.getDeliveryInstruction2()==null) || 
             (this.deliveryInstruction2!=null &&
              this.deliveryInstruction2.equals(other.getDeliveryInstruction2()))) &&
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              java.util.Arrays.equals(this.detail, other.getDetail()))) &&
            ((this.entityIdBuyer==null && other.getEntityIdBuyer()==null) || 
             (this.entityIdBuyer!=null &&
              this.entityIdBuyer.equals(other.getEntityIdBuyer()))) &&
            ((this.entityIdCarrier==null && other.getEntityIdCarrier()==null) || 
             (this.entityIdCarrier!=null &&
              this.entityIdCarrier.equals(other.getEntityIdCarrier()))) &&
            ((this.entityIdMarkfor==null && other.getEntityIdMarkfor()==null) || 
             (this.entityIdMarkfor!=null &&
              this.entityIdMarkfor.equals(other.getEntityIdMarkfor()))) &&
            ((this.entityIdShipTo==null && other.getEntityIdShipTo()==null) || 
             (this.entityIdShipTo!=null &&
              this.entityIdShipTo.equals(other.getEntityIdShipTo()))) &&
            ((this.entityIdSupplier==null && other.getEntityIdSupplier()==null) || 
             (this.entityIdSupplier!=null &&
              this.entityIdSupplier.equals(other.getEntityIdSupplier()))) &&
            ((this.freightHandlingCode==null && other.getFreightHandlingCode()==null) || 
             (this.freightHandlingCode!=null &&
              this.freightHandlingCode.equals(other.getFreightHandlingCode()))) &&
            ((this.holdCode==null && other.getHoldCode()==null) || 
             (this.holdCode!=null &&
              this.holdCode.equals(other.getHoldCode()))) &&
            ((this.isFreightApplied==null && other.getIsFreightApplied()==null) || 
             (this.isFreightApplied!=null &&
              this.isFreightApplied.equals(other.getIsFreightApplied()))) &&
            ((this.isFreightCalculated==null && other.getIsFreightCalculated()==null) || 
             (this.isFreightCalculated!=null &&
              this.isFreightCalculated.equals(other.getIsFreightCalculated()))) &&
            ((this.isPrepaid==null && other.getIsPrepaid()==null) || 
             (this.isPrepaid!=null &&
              this.isPrepaid.equals(other.getIsPrepaid()))) &&
            ((this.isQuantityPosted==null && other.getIsQuantityPosted()==null) || 
             (this.isQuantityPosted!=null &&
              this.isQuantityPosted.equals(other.getIsQuantityPosted()))) &&
            ((this.isTextAssociated==null && other.getIsTextAssociated()==null) || 
             (this.isTextAssociated!=null &&
              this.isTextAssociated.equals(other.getIsTextAssociated()))) &&
            ((this.itemPriceGroupCode==null && other.getItemPriceGroupCode()==null) || 
             (this.itemPriceGroupCode!=null &&
              this.itemPriceGroupCode.equals(other.getItemPriceGroupCode()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.logicControl==null && other.getLogicControl()==null) || 
             (this.logicControl!=null &&
              this.logicControl.equals(other.getLogicControl()))) &&
            ((this.modeOfTransportCode==null && other.getModeOfTransportCode()==null) || 
             (this.modeOfTransportCode!=null &&
              this.modeOfTransportCode.equals(other.getModeOfTransportCode()))) &&
            ((this.nameRemark==null && other.getNameRemark()==null) || 
             (this.nameRemark!=null &&
              this.nameRemark.equals(other.getNameRemark()))) &&
            ((this.numberOfInvoices==null && other.getNumberOfInvoices()==null) || 
             (this.numberOfInvoices!=null &&
              this.numberOfInvoices.equals(other.getNumberOfInvoices()))) &&
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
            ((this.printMessageCode==null && other.getPrintMessageCode()==null) || 
             (this.printMessageCode!=null &&
              this.printMessageCode.equals(other.getPrintMessageCode()))) &&
            ((this.processingModeCode==null && other.getProcessingModeCode()==null) || 
             (this.processingModeCode!=null &&
              this.processingModeCode.equals(other.getProcessingModeCode()))) &&
            ((this.purchaseOrderShowKey==null && other.getPurchaseOrderShowKey()==null) || 
             (this.purchaseOrderShowKey!=null &&
              this.purchaseOrderShowKey.equals(other.getPurchaseOrderShowKey()))) &&
            ((this.purgeCode==null && other.getPurgeCode()==null) || 
             (this.purgeCode!=null &&
              this.purgeCode.equals(other.getPurgeCode()))) &&
            ((this.rateExchangeOverride==null && other.getRateExchangeOverride()==null) || 
             (this.rateExchangeOverride!=null &&
              this.rateExchangeOverride.equals(other.getRateExchangeOverride()))) &&
            ((this.retainageRule==null && other.getRetainageRule()==null) || 
             (this.retainageRule!=null &&
              this.retainageRule.equals(other.getRetainageRule()))) &&
            ((this.sendMethodCode==null && other.getSendMethodCode()==null) || 
             (this.sendMethodCode!=null &&
              this.sendMethodCode.equals(other.getSendMethodCode()))) &&
            ((this.statusOrderCode==null && other.getStatusOrderCode()==null) || 
             (this.statusOrderCode!=null &&
              this.statusOrderCode.equals(other.getStatusOrderCode()))) &&
            ((this.taxExemptCertificate==null && other.getTaxExemptCertificate()==null) || 
             (this.taxExemptCertificate!=null &&
              this.taxExemptCertificate.equals(other.getTaxExemptCertificate()))) &&
            ((this.taxExplanationCode==null && other.getTaxExplanationCode()==null) || 
             (this.taxExplanationCode!=null &&
              this.taxExplanationCode.equals(other.getTaxExplanationCode()))) &&
            ((this.taxRateAreaCode==null && other.getTaxRateAreaCode()==null) || 
             (this.taxRateAreaCode!=null &&
              this.taxRateAreaCode.equals(other.getTaxRateAreaCode()))) &&
            ((this.timePromisedDelivery==null && other.getTimePromisedDelivery()==null) || 
             (this.timePromisedDelivery!=null &&
              this.timePromisedDelivery.equals(other.getTimePromisedDelivery()))) &&
            ((this.timePromisedShip==null && other.getTimePromisedShip()==null) || 
             (this.timePromisedShip!=null &&
              this.timePromisedShip.equals(other.getTimePromisedShip()))) &&
            ((this.transactionNature==null && other.getTransactionNature()==null) || 
             (this.transactionNature!=null &&
              this.transactionNature.equals(other.getTransactionNature()))) &&
            ((this.typeMatch==null && other.getTypeMatch()==null) || 
             (this.typeMatch!=null &&
              this.typeMatch.equals(other.getTypeMatch()))) &&
            ((this.unitOfMeasureCodeVolume==null && other.getUnitOfMeasureCodeVolume()==null) || 
             (this.unitOfMeasureCodeVolume!=null &&
              this.unitOfMeasureCodeVolume.equals(other.getUnitOfMeasureCodeVolume()))) &&
            ((this.unitOfMeasureCodeWeight==null && other.getUnitOfMeasureCodeWeight()==null) || 
             (this.unitOfMeasureCodeWeight!=null &&
              this.unitOfMeasureCodeWeight.equals(other.getUnitOfMeasureCodeWeight()))) &&
            ((this.userReservedData==null && other.getUserReservedData()==null) || 
             (this.userReservedData!=null &&
              this.userReservedData.equals(other.getUserReservedData()))) &&
            ((this.voucherCode==null && other.getVoucherCode()==null) || 
             (this.voucherCode!=null &&
              this.voucherCode.equals(other.getVoucherCode()))) &&
            ((this.zoneNumber==null && other.getZoneNumber()==null) || 
             (this.zoneNumber!=null &&
              this.zoneNumber.equals(other.getZoneNumber())));
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
        if (getActivityReasonCode() != null) {
            _hashCode += getActivityReasonCode().hashCode();
        }
        if (getAdjustmentScheduleCode() != null) {
            _hashCode += getAdjustmentScheduleCode().hashCode();
        }
        if (getAmountGross() != null) {
            _hashCode += getAmountGross().hashCode();
        }
        if (getAmountOpen() != null) {
            _hashCode += getAmountOpen().hashCode();
        }
        if (getApprovedRoutingBy() != null) {
            _hashCode += getApprovedRoutingBy().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getConditionsOfTransportCode() != null) {
            _hashCode += getConditionsOfTransportCode().hashCode();
        }
        if (getContainer() != null) {
            _hashCode += getContainer().hashCode();
        }
        if (getCurrencyCodeBase() != null) {
            _hashCode += getCurrencyCodeBase().hashCode();
        }
        if (getCurrencyCodeFrom() != null) {
            _hashCode += getCurrencyCodeFrom().hashCode();
        }
        if (getCurrencyModeCode() != null) {
            _hashCode += getCurrencyModeCode().hashCode();
        }
        if (getDates() != null) {
            _hashCode += getDates().hashCode();
        }
        if (getDeliveryInstruction1() != null) {
            _hashCode += getDeliveryInstruction1().hashCode();
        }
        if (getDeliveryInstruction2() != null) {
            _hashCode += getDeliveryInstruction2().hashCode();
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
        if (getEntityIdBuyer() != null) {
            _hashCode += getEntityIdBuyer().hashCode();
        }
        if (getEntityIdCarrier() != null) {
            _hashCode += getEntityIdCarrier().hashCode();
        }
        if (getEntityIdMarkfor() != null) {
            _hashCode += getEntityIdMarkfor().hashCode();
        }
        if (getEntityIdShipTo() != null) {
            _hashCode += getEntityIdShipTo().hashCode();
        }
        if (getEntityIdSupplier() != null) {
            _hashCode += getEntityIdSupplier().hashCode();
        }
        if (getFreightHandlingCode() != null) {
            _hashCode += getFreightHandlingCode().hashCode();
        }
        if (getHoldCode() != null) {
            _hashCode += getHoldCode().hashCode();
        }
        if (getIsFreightApplied() != null) {
            _hashCode += getIsFreightApplied().hashCode();
        }
        if (getIsFreightCalculated() != null) {
            _hashCode += getIsFreightCalculated().hashCode();
        }
        if (getIsPrepaid() != null) {
            _hashCode += getIsPrepaid().hashCode();
        }
        if (getIsQuantityPosted() != null) {
            _hashCode += getIsQuantityPosted().hashCode();
        }
        if (getIsTextAssociated() != null) {
            _hashCode += getIsTextAssociated().hashCode();
        }
        if (getItemPriceGroupCode() != null) {
            _hashCode += getItemPriceGroupCode().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getLogicControl() != null) {
            _hashCode += getLogicControl().hashCode();
        }
        if (getModeOfTransportCode() != null) {
            _hashCode += getModeOfTransportCode().hashCode();
        }
        if (getNameRemark() != null) {
            _hashCode += getNameRemark().hashCode();
        }
        if (getNumberOfInvoices() != null) {
            _hashCode += getNumberOfInvoices().hashCode();
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
        if (getPrintMessageCode() != null) {
            _hashCode += getPrintMessageCode().hashCode();
        }
        if (getProcessingModeCode() != null) {
            _hashCode += getProcessingModeCode().hashCode();
        }
        if (getPurchaseOrderShowKey() != null) {
            _hashCode += getPurchaseOrderShowKey().hashCode();
        }
        if (getPurgeCode() != null) {
            _hashCode += getPurgeCode().hashCode();
        }
        if (getRateExchangeOverride() != null) {
            _hashCode += getRateExchangeOverride().hashCode();
        }
        if (getRetainageRule() != null) {
            _hashCode += getRetainageRule().hashCode();
        }
        if (getSendMethodCode() != null) {
            _hashCode += getSendMethodCode().hashCode();
        }
        if (getStatusOrderCode() != null) {
            _hashCode += getStatusOrderCode().hashCode();
        }
        if (getTaxExemptCertificate() != null) {
            _hashCode += getTaxExemptCertificate().hashCode();
        }
        if (getTaxExplanationCode() != null) {
            _hashCode += getTaxExplanationCode().hashCode();
        }
        if (getTaxRateAreaCode() != null) {
            _hashCode += getTaxRateAreaCode().hashCode();
        }
        if (getTimePromisedDelivery() != null) {
            _hashCode += getTimePromisedDelivery().hashCode();
        }
        if (getTimePromisedShip() != null) {
            _hashCode += getTimePromisedShip().hashCode();
        }
        if (getTransactionNature() != null) {
            _hashCode += getTransactionNature().hashCode();
        }
        if (getTypeMatch() != null) {
            _hashCode += getTypeMatch().hashCode();
        }
        if (getUnitOfMeasureCodeVolume() != null) {
            _hashCode += getUnitOfMeasureCodeVolume().hashCode();
        }
        if (getUnitOfMeasureCodeWeight() != null) {
            _hashCode += getUnitOfMeasureCodeWeight().hashCode();
        }
        if (getUserReservedData() != null) {
            _hashCode += getUserReservedData().hashCode();
        }
        if (getVoucherCode() != null) {
            _hashCode += getVoucherCode().hashCode();
        }
        if (getZoneNumber() != null) {
            _hashCode += getZoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderShowHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityReasonCode"));
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
        elemField.setFieldName("amountGross");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountGross"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvedRoutingBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvedRoutingBy"));
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
        elemField.setFieldName("conditionsOfTransportCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conditionsOfTransportCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("container");
        elemField.setXmlName(new javax.xml.namespace.QName("", "container"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCodeBase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCodeBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("currencyModeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyModeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowDates"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstruction1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryInstruction1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstruction2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryInstruction2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityIdBuyer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityIdBuyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityIdCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityIdCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityIdMarkfor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityIdMarkfor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityIdShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityIdShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityIdSupplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityIdSupplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightHandlingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freightHandlingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFreightApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isFreightApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFreightCalculated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isFreightCalculated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrepaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPrepaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isQuantityPosted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isQuantityPosted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("itemPriceGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemPriceGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicControl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logicControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeOfTransportCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeOfTransportCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameRemark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameRemark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfInvoices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfInvoices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("printMessageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printMessageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingModeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processingModeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderShowKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrderShowKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purgeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purgeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("retainageRule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retainageRule"));
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
        elemField.setFieldName("statusOrderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusOrderCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxExemptCertificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExplanationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxExplanationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRateAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxRateAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePromisedDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timePromisedDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePromisedShip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timePromisedShip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionNature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodeVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodeVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodeWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodeWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voucherCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
