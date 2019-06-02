/**
 * ShowSalesHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ShowSalesHeader  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.Integer RMAId;

    private java.lang.String RMAType;

    private java.lang.String adjustmentScheduleCode;

    private java.math.BigDecimal amountTotalOrderDomestic;

    private java.math.BigDecimal amountTotalOrderForeign;

    private java.lang.String businessUnit;

    private java.lang.String company;

    private java.lang.String currencyCodeFrom;

    private java.lang.String currencyModeCode;

    private java.lang.String customerPO;

    private java.lang.String customerPriceGroupCode;

    private java.util.Calendar dateActualShip;

    private java.util.Calendar dateCancel;

    private java.util.Calendar datePromisedShip;

    private java.util.Calendar dateRequested;

    private java.util.Calendar dateScheduledPick;

    private java.util.Calendar dateTransaction;

    private JP420000.bssv.e1.oracle.Entity deliverTo;

    private java.lang.String deliveryInstruction1;

    private java.lang.String deliveryInstruction2;

    private JP420000.bssv.e1.oracle.ShowSalesDetail[] detail;

    private java.lang.Integer entityIdCarrier;

    private JP420000.bssv.e1.oracle.Entity forwardedTo;

    private java.lang.String freightHandlingCode;

    private java.lang.String holdOrderCode;

    private JP420000.bssv.e1.oracle.Entity invoicedTo;

    private java.lang.String modeOfTransport;

    private java.lang.String orderTakenBy;

    private java.lang.String orderedBy;

    private JP420000.bssv.e1.oracle.OriginalOrder originalOrder;

    private JP420000.bssv.e1.oracle.Entity paidBy;

    private java.lang.String paymentInstrumentCode;

    private java.lang.String paymentTermsCode;

    private java.math.BigDecimal percentDiscountTrade;

    private java.lang.String printMessageCode;

    private java.math.BigDecimal rateExchangeOverride;

    private java.lang.String reasonCode;

    private java.lang.String routeCode;

    private JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey;

    private JP420000.bssv.e1.oracle.ShowSalesShipTo shipTo;

    private JP420000.bssv.e1.oracle.Entity soldTo;

    private java.lang.String stopCode;

    private java.lang.String taxExplanationCode;

    private java.lang.String taxRateAreaCode;

    private JP420000.bssv.e1.oracle.UserReservedData userReservedData;

    private java.lang.String zoneNumber;

    public ShowSalesHeader() {
    }

    public ShowSalesHeader(
           java.lang.Integer RMAId,
           java.lang.String RMAType,
           java.lang.String adjustmentScheduleCode,
           java.math.BigDecimal amountTotalOrderDomestic,
           java.math.BigDecimal amountTotalOrderForeign,
           java.lang.String businessUnit,
           java.lang.String company,
           java.lang.String currencyCodeFrom,
           java.lang.String currencyModeCode,
           java.lang.String customerPO,
           java.lang.String customerPriceGroupCode,
           java.util.Calendar dateActualShip,
           java.util.Calendar dateCancel,
           java.util.Calendar datePromisedShip,
           java.util.Calendar dateRequested,
           java.util.Calendar dateScheduledPick,
           java.util.Calendar dateTransaction,
           JP420000.bssv.e1.oracle.Entity deliverTo,
           java.lang.String deliveryInstruction1,
           java.lang.String deliveryInstruction2,
           JP420000.bssv.e1.oracle.ShowSalesDetail[] detail,
           java.lang.Integer entityIdCarrier,
           JP420000.bssv.e1.oracle.Entity forwardedTo,
           java.lang.String freightHandlingCode,
           java.lang.String holdOrderCode,
           JP420000.bssv.e1.oracle.Entity invoicedTo,
           java.lang.String modeOfTransport,
           java.lang.String orderTakenBy,
           java.lang.String orderedBy,
           JP420000.bssv.e1.oracle.OriginalOrder originalOrder,
           JP420000.bssv.e1.oracle.Entity paidBy,
           java.lang.String paymentInstrumentCode,
           java.lang.String paymentTermsCode,
           java.math.BigDecimal percentDiscountTrade,
           java.lang.String printMessageCode,
           java.math.BigDecimal rateExchangeOverride,
           java.lang.String reasonCode,
           java.lang.String routeCode,
           JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey,
           JP420000.bssv.e1.oracle.ShowSalesShipTo shipTo,
           JP420000.bssv.e1.oracle.Entity soldTo,
           java.lang.String stopCode,
           java.lang.String taxExplanationCode,
           java.lang.String taxRateAreaCode,
           JP420000.bssv.e1.oracle.UserReservedData userReservedData,
           java.lang.String zoneNumber) {
        this.RMAId = RMAId;
        this.RMAType = RMAType;
        this.adjustmentScheduleCode = adjustmentScheduleCode;
        this.amountTotalOrderDomestic = amountTotalOrderDomestic;
        this.amountTotalOrderForeign = amountTotalOrderForeign;
        this.businessUnit = businessUnit;
        this.company = company;
        this.currencyCodeFrom = currencyCodeFrom;
        this.currencyModeCode = currencyModeCode;
        this.customerPO = customerPO;
        this.customerPriceGroupCode = customerPriceGroupCode;
        this.dateActualShip = dateActualShip;
        this.dateCancel = dateCancel;
        this.datePromisedShip = datePromisedShip;
        this.dateRequested = dateRequested;
        this.dateScheduledPick = dateScheduledPick;
        this.dateTransaction = dateTransaction;
        this.deliverTo = deliverTo;
        this.deliveryInstruction1 = deliveryInstruction1;
        this.deliveryInstruction2 = deliveryInstruction2;
        this.detail = detail;
        this.entityIdCarrier = entityIdCarrier;
        this.forwardedTo = forwardedTo;
        this.freightHandlingCode = freightHandlingCode;
        this.holdOrderCode = holdOrderCode;
        this.invoicedTo = invoicedTo;
        this.modeOfTransport = modeOfTransport;
        this.orderTakenBy = orderTakenBy;
        this.orderedBy = orderedBy;
        this.originalOrder = originalOrder;
        this.paidBy = paidBy;
        this.paymentInstrumentCode = paymentInstrumentCode;
        this.paymentTermsCode = paymentTermsCode;
        this.percentDiscountTrade = percentDiscountTrade;
        this.printMessageCode = printMessageCode;
        this.rateExchangeOverride = rateExchangeOverride;
        this.reasonCode = reasonCode;
        this.routeCode = routeCode;
        this.salesOrderKey = salesOrderKey;
        this.shipTo = shipTo;
        this.soldTo = soldTo;
        this.stopCode = stopCode;
        this.taxExplanationCode = taxExplanationCode;
        this.taxRateAreaCode = taxRateAreaCode;
        this.userReservedData = userReservedData;
        this.zoneNumber = zoneNumber;
    }


    /**
     * Gets the RMAId value for this ShowSalesHeader.
     * 
     * @return RMAId
     */
    public java.lang.Integer getRMAId() {
        return RMAId;
    }


    /**
     * Sets the RMAId value for this ShowSalesHeader.
     * 
     * @param RMAId
     */
    public void setRMAId(java.lang.Integer RMAId) {
        this.RMAId = RMAId;
    }


    /**
     * Gets the RMAType value for this ShowSalesHeader.
     * 
     * @return RMAType
     */
    public java.lang.String getRMAType() {
        return RMAType;
    }


    /**
     * Sets the RMAType value for this ShowSalesHeader.
     * 
     * @param RMAType
     */
    public void setRMAType(java.lang.String RMAType) {
        this.RMAType = RMAType;
    }


    /**
     * Gets the adjustmentScheduleCode value for this ShowSalesHeader.
     * 
     * @return adjustmentScheduleCode
     */
    public java.lang.String getAdjustmentScheduleCode() {
        return adjustmentScheduleCode;
    }


    /**
     * Sets the adjustmentScheduleCode value for this ShowSalesHeader.
     * 
     * @param adjustmentScheduleCode
     */
    public void setAdjustmentScheduleCode(java.lang.String adjustmentScheduleCode) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
    }


    /**
     * Gets the amountTotalOrderDomestic value for this ShowSalesHeader.
     * 
     * @return amountTotalOrderDomestic
     */
    public java.math.BigDecimal getAmountTotalOrderDomestic() {
        return amountTotalOrderDomestic;
    }


    /**
     * Sets the amountTotalOrderDomestic value for this ShowSalesHeader.
     * 
     * @param amountTotalOrderDomestic
     */
    public void setAmountTotalOrderDomestic(java.math.BigDecimal amountTotalOrderDomestic) {
        this.amountTotalOrderDomestic = amountTotalOrderDomestic;
    }


    /**
     * Gets the amountTotalOrderForeign value for this ShowSalesHeader.
     * 
     * @return amountTotalOrderForeign
     */
    public java.math.BigDecimal getAmountTotalOrderForeign() {
        return amountTotalOrderForeign;
    }


    /**
     * Sets the amountTotalOrderForeign value for this ShowSalesHeader.
     * 
     * @param amountTotalOrderForeign
     */
    public void setAmountTotalOrderForeign(java.math.BigDecimal amountTotalOrderForeign) {
        this.amountTotalOrderForeign = amountTotalOrderForeign;
    }


    /**
     * Gets the businessUnit value for this ShowSalesHeader.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this ShowSalesHeader.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the company value for this ShowSalesHeader.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ShowSalesHeader.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the currencyCodeFrom value for this ShowSalesHeader.
     * 
     * @return currencyCodeFrom
     */
    public java.lang.String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }


    /**
     * Sets the currencyCodeFrom value for this ShowSalesHeader.
     * 
     * @param currencyCodeFrom
     */
    public void setCurrencyCodeFrom(java.lang.String currencyCodeFrom) {
        this.currencyCodeFrom = currencyCodeFrom;
    }


    /**
     * Gets the currencyModeCode value for this ShowSalesHeader.
     * 
     * @return currencyModeCode
     */
    public java.lang.String getCurrencyModeCode() {
        return currencyModeCode;
    }


    /**
     * Sets the currencyModeCode value for this ShowSalesHeader.
     * 
     * @param currencyModeCode
     */
    public void setCurrencyModeCode(java.lang.String currencyModeCode) {
        this.currencyModeCode = currencyModeCode;
    }


    /**
     * Gets the customerPO value for this ShowSalesHeader.
     * 
     * @return customerPO
     */
    public java.lang.String getCustomerPO() {
        return customerPO;
    }


    /**
     * Sets the customerPO value for this ShowSalesHeader.
     * 
     * @param customerPO
     */
    public void setCustomerPO(java.lang.String customerPO) {
        this.customerPO = customerPO;
    }


    /**
     * Gets the customerPriceGroupCode value for this ShowSalesHeader.
     * 
     * @return customerPriceGroupCode
     */
    public java.lang.String getCustomerPriceGroupCode() {
        return customerPriceGroupCode;
    }


    /**
     * Sets the customerPriceGroupCode value for this ShowSalesHeader.
     * 
     * @param customerPriceGroupCode
     */
    public void setCustomerPriceGroupCode(java.lang.String customerPriceGroupCode) {
        this.customerPriceGroupCode = customerPriceGroupCode;
    }


    /**
     * Gets the dateActualShip value for this ShowSalesHeader.
     * 
     * @return dateActualShip
     */
    public java.util.Calendar getDateActualShip() {
        return dateActualShip;
    }


    /**
     * Sets the dateActualShip value for this ShowSalesHeader.
     * 
     * @param dateActualShip
     */
    public void setDateActualShip(java.util.Calendar dateActualShip) {
        this.dateActualShip = dateActualShip;
    }


    /**
     * Gets the dateCancel value for this ShowSalesHeader.
     * 
     * @return dateCancel
     */
    public java.util.Calendar getDateCancel() {
        return dateCancel;
    }


    /**
     * Sets the dateCancel value for this ShowSalesHeader.
     * 
     * @param dateCancel
     */
    public void setDateCancel(java.util.Calendar dateCancel) {
        this.dateCancel = dateCancel;
    }


    /**
     * Gets the datePromisedShip value for this ShowSalesHeader.
     * 
     * @return datePromisedShip
     */
    public java.util.Calendar getDatePromisedShip() {
        return datePromisedShip;
    }


    /**
     * Sets the datePromisedShip value for this ShowSalesHeader.
     * 
     * @param datePromisedShip
     */
    public void setDatePromisedShip(java.util.Calendar datePromisedShip) {
        this.datePromisedShip = datePromisedShip;
    }


    /**
     * Gets the dateRequested value for this ShowSalesHeader.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this ShowSalesHeader.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the dateScheduledPick value for this ShowSalesHeader.
     * 
     * @return dateScheduledPick
     */
    public java.util.Calendar getDateScheduledPick() {
        return dateScheduledPick;
    }


    /**
     * Sets the dateScheduledPick value for this ShowSalesHeader.
     * 
     * @param dateScheduledPick
     */
    public void setDateScheduledPick(java.util.Calendar dateScheduledPick) {
        this.dateScheduledPick = dateScheduledPick;
    }


    /**
     * Gets the dateTransaction value for this ShowSalesHeader.
     * 
     * @return dateTransaction
     */
    public java.util.Calendar getDateTransaction() {
        return dateTransaction;
    }


    /**
     * Sets the dateTransaction value for this ShowSalesHeader.
     * 
     * @param dateTransaction
     */
    public void setDateTransaction(java.util.Calendar dateTransaction) {
        this.dateTransaction = dateTransaction;
    }


    /**
     * Gets the deliverTo value for this ShowSalesHeader.
     * 
     * @return deliverTo
     */
    public JP420000.bssv.e1.oracle.Entity getDeliverTo() {
        return deliverTo;
    }


    /**
     * Sets the deliverTo value for this ShowSalesHeader.
     * 
     * @param deliverTo
     */
    public void setDeliverTo(JP420000.bssv.e1.oracle.Entity deliverTo) {
        this.deliverTo = deliverTo;
    }


    /**
     * Gets the deliveryInstruction1 value for this ShowSalesHeader.
     * 
     * @return deliveryInstruction1
     */
    public java.lang.String getDeliveryInstruction1() {
        return deliveryInstruction1;
    }


    /**
     * Sets the deliveryInstruction1 value for this ShowSalesHeader.
     * 
     * @param deliveryInstruction1
     */
    public void setDeliveryInstruction1(java.lang.String deliveryInstruction1) {
        this.deliveryInstruction1 = deliveryInstruction1;
    }


    /**
     * Gets the deliveryInstruction2 value for this ShowSalesHeader.
     * 
     * @return deliveryInstruction2
     */
    public java.lang.String getDeliveryInstruction2() {
        return deliveryInstruction2;
    }


    /**
     * Sets the deliveryInstruction2 value for this ShowSalesHeader.
     * 
     * @param deliveryInstruction2
     */
    public void setDeliveryInstruction2(java.lang.String deliveryInstruction2) {
        this.deliveryInstruction2 = deliveryInstruction2;
    }


    /**
     * Gets the detail value for this ShowSalesHeader.
     * 
     * @return detail
     */
    public JP420000.bssv.e1.oracle.ShowSalesDetail[] getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this ShowSalesHeader.
     * 
     * @param detail
     */
    public void setDetail(JP420000.bssv.e1.oracle.ShowSalesDetail[] detail) {
        this.detail = detail;
    }

    public JP420000.bssv.e1.oracle.ShowSalesDetail getDetail(int i) {
        return this.detail[i];
    }

    public void setDetail(int i, JP420000.bssv.e1.oracle.ShowSalesDetail _value) {
        this.detail[i] = _value;
    }


    /**
     * Gets the entityIdCarrier value for this ShowSalesHeader.
     * 
     * @return entityIdCarrier
     */
    public java.lang.Integer getEntityIdCarrier() {
        return entityIdCarrier;
    }


    /**
     * Sets the entityIdCarrier value for this ShowSalesHeader.
     * 
     * @param entityIdCarrier
     */
    public void setEntityIdCarrier(java.lang.Integer entityIdCarrier) {
        this.entityIdCarrier = entityIdCarrier;
    }


    /**
     * Gets the forwardedTo value for this ShowSalesHeader.
     * 
     * @return forwardedTo
     */
    public JP420000.bssv.e1.oracle.Entity getForwardedTo() {
        return forwardedTo;
    }


    /**
     * Sets the forwardedTo value for this ShowSalesHeader.
     * 
     * @param forwardedTo
     */
    public void setForwardedTo(JP420000.bssv.e1.oracle.Entity forwardedTo) {
        this.forwardedTo = forwardedTo;
    }


    /**
     * Gets the freightHandlingCode value for this ShowSalesHeader.
     * 
     * @return freightHandlingCode
     */
    public java.lang.String getFreightHandlingCode() {
        return freightHandlingCode;
    }


    /**
     * Sets the freightHandlingCode value for this ShowSalesHeader.
     * 
     * @param freightHandlingCode
     */
    public void setFreightHandlingCode(java.lang.String freightHandlingCode) {
        this.freightHandlingCode = freightHandlingCode;
    }


    /**
     * Gets the holdOrderCode value for this ShowSalesHeader.
     * 
     * @return holdOrderCode
     */
    public java.lang.String getHoldOrderCode() {
        return holdOrderCode;
    }


    /**
     * Sets the holdOrderCode value for this ShowSalesHeader.
     * 
     * @param holdOrderCode
     */
    public void setHoldOrderCode(java.lang.String holdOrderCode) {
        this.holdOrderCode = holdOrderCode;
    }


    /**
     * Gets the invoicedTo value for this ShowSalesHeader.
     * 
     * @return invoicedTo
     */
    public JP420000.bssv.e1.oracle.Entity getInvoicedTo() {
        return invoicedTo;
    }


    /**
     * Sets the invoicedTo value for this ShowSalesHeader.
     * 
     * @param invoicedTo
     */
    public void setInvoicedTo(JP420000.bssv.e1.oracle.Entity invoicedTo) {
        this.invoicedTo = invoicedTo;
    }


    /**
     * Gets the modeOfTransport value for this ShowSalesHeader.
     * 
     * @return modeOfTransport
     */
    public java.lang.String getModeOfTransport() {
        return modeOfTransport;
    }


    /**
     * Sets the modeOfTransport value for this ShowSalesHeader.
     * 
     * @param modeOfTransport
     */
    public void setModeOfTransport(java.lang.String modeOfTransport) {
        this.modeOfTransport = modeOfTransport;
    }


    /**
     * Gets the orderTakenBy value for this ShowSalesHeader.
     * 
     * @return orderTakenBy
     */
    public java.lang.String getOrderTakenBy() {
        return orderTakenBy;
    }


    /**
     * Sets the orderTakenBy value for this ShowSalesHeader.
     * 
     * @param orderTakenBy
     */
    public void setOrderTakenBy(java.lang.String orderTakenBy) {
        this.orderTakenBy = orderTakenBy;
    }


    /**
     * Gets the orderedBy value for this ShowSalesHeader.
     * 
     * @return orderedBy
     */
    public java.lang.String getOrderedBy() {
        return orderedBy;
    }


    /**
     * Sets the orderedBy value for this ShowSalesHeader.
     * 
     * @param orderedBy
     */
    public void setOrderedBy(java.lang.String orderedBy) {
        this.orderedBy = orderedBy;
    }


    /**
     * Gets the originalOrder value for this ShowSalesHeader.
     * 
     * @return originalOrder
     */
    public JP420000.bssv.e1.oracle.OriginalOrder getOriginalOrder() {
        return originalOrder;
    }


    /**
     * Sets the originalOrder value for this ShowSalesHeader.
     * 
     * @param originalOrder
     */
    public void setOriginalOrder(JP420000.bssv.e1.oracle.OriginalOrder originalOrder) {
        this.originalOrder = originalOrder;
    }


    /**
     * Gets the paidBy value for this ShowSalesHeader.
     * 
     * @return paidBy
     */
    public JP420000.bssv.e1.oracle.Entity getPaidBy() {
        return paidBy;
    }


    /**
     * Sets the paidBy value for this ShowSalesHeader.
     * 
     * @param paidBy
     */
    public void setPaidBy(JP420000.bssv.e1.oracle.Entity paidBy) {
        this.paidBy = paidBy;
    }


    /**
     * Gets the paymentInstrumentCode value for this ShowSalesHeader.
     * 
     * @return paymentInstrumentCode
     */
    public java.lang.String getPaymentInstrumentCode() {
        return paymentInstrumentCode;
    }


    /**
     * Sets the paymentInstrumentCode value for this ShowSalesHeader.
     * 
     * @param paymentInstrumentCode
     */
    public void setPaymentInstrumentCode(java.lang.String paymentInstrumentCode) {
        this.paymentInstrumentCode = paymentInstrumentCode;
    }


    /**
     * Gets the paymentTermsCode value for this ShowSalesHeader.
     * 
     * @return paymentTermsCode
     */
    public java.lang.String getPaymentTermsCode() {
        return paymentTermsCode;
    }


    /**
     * Sets the paymentTermsCode value for this ShowSalesHeader.
     * 
     * @param paymentTermsCode
     */
    public void setPaymentTermsCode(java.lang.String paymentTermsCode) {
        this.paymentTermsCode = paymentTermsCode;
    }


    /**
     * Gets the percentDiscountTrade value for this ShowSalesHeader.
     * 
     * @return percentDiscountTrade
     */
    public java.math.BigDecimal getPercentDiscountTrade() {
        return percentDiscountTrade;
    }


    /**
     * Sets the percentDiscountTrade value for this ShowSalesHeader.
     * 
     * @param percentDiscountTrade
     */
    public void setPercentDiscountTrade(java.math.BigDecimal percentDiscountTrade) {
        this.percentDiscountTrade = percentDiscountTrade;
    }


    /**
     * Gets the printMessageCode value for this ShowSalesHeader.
     * 
     * @return printMessageCode
     */
    public java.lang.String getPrintMessageCode() {
        return printMessageCode;
    }


    /**
     * Sets the printMessageCode value for this ShowSalesHeader.
     * 
     * @param printMessageCode
     */
    public void setPrintMessageCode(java.lang.String printMessageCode) {
        this.printMessageCode = printMessageCode;
    }


    /**
     * Gets the rateExchangeOverride value for this ShowSalesHeader.
     * 
     * @return rateExchangeOverride
     */
    public java.math.BigDecimal getRateExchangeOverride() {
        return rateExchangeOverride;
    }


    /**
     * Sets the rateExchangeOverride value for this ShowSalesHeader.
     * 
     * @param rateExchangeOverride
     */
    public void setRateExchangeOverride(java.math.BigDecimal rateExchangeOverride) {
        this.rateExchangeOverride = rateExchangeOverride;
    }


    /**
     * Gets the reasonCode value for this ShowSalesHeader.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this ShowSalesHeader.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the routeCode value for this ShowSalesHeader.
     * 
     * @return routeCode
     */
    public java.lang.String getRouteCode() {
        return routeCode;
    }


    /**
     * Sets the routeCode value for this ShowSalesHeader.
     * 
     * @param routeCode
     */
    public void setRouteCode(java.lang.String routeCode) {
        this.routeCode = routeCode;
    }


    /**
     * Gets the salesOrderKey value for this ShowSalesHeader.
     * 
     * @return salesOrderKey
     */
    public JP420000.bssv.e1.oracle.SalesOrderKey getSalesOrderKey() {
        return salesOrderKey;
    }


    /**
     * Sets the salesOrderKey value for this ShowSalesHeader.
     * 
     * @param salesOrderKey
     */
    public void setSalesOrderKey(JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey) {
        this.salesOrderKey = salesOrderKey;
    }


    /**
     * Gets the shipTo value for this ShowSalesHeader.
     * 
     * @return shipTo
     */
    public JP420000.bssv.e1.oracle.ShowSalesShipTo getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this ShowSalesHeader.
     * 
     * @param shipTo
     */
    public void setShipTo(JP420000.bssv.e1.oracle.ShowSalesShipTo shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the soldTo value for this ShowSalesHeader.
     * 
     * @return soldTo
     */
    public JP420000.bssv.e1.oracle.Entity getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this ShowSalesHeader.
     * 
     * @param soldTo
     */
    public void setSoldTo(JP420000.bssv.e1.oracle.Entity soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the stopCode value for this ShowSalesHeader.
     * 
     * @return stopCode
     */
    public java.lang.String getStopCode() {
        return stopCode;
    }


    /**
     * Sets the stopCode value for this ShowSalesHeader.
     * 
     * @param stopCode
     */
    public void setStopCode(java.lang.String stopCode) {
        this.stopCode = stopCode;
    }


    /**
     * Gets the taxExplanationCode value for this ShowSalesHeader.
     * 
     * @return taxExplanationCode
     */
    public java.lang.String getTaxExplanationCode() {
        return taxExplanationCode;
    }


    /**
     * Sets the taxExplanationCode value for this ShowSalesHeader.
     * 
     * @param taxExplanationCode
     */
    public void setTaxExplanationCode(java.lang.String taxExplanationCode) {
        this.taxExplanationCode = taxExplanationCode;
    }


    /**
     * Gets the taxRateAreaCode value for this ShowSalesHeader.
     * 
     * @return taxRateAreaCode
     */
    public java.lang.String getTaxRateAreaCode() {
        return taxRateAreaCode;
    }


    /**
     * Sets the taxRateAreaCode value for this ShowSalesHeader.
     * 
     * @param taxRateAreaCode
     */
    public void setTaxRateAreaCode(java.lang.String taxRateAreaCode) {
        this.taxRateAreaCode = taxRateAreaCode;
    }


    /**
     * Gets the userReservedData value for this ShowSalesHeader.
     * 
     * @return userReservedData
     */
    public JP420000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this ShowSalesHeader.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP420000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the zoneNumber value for this ShowSalesHeader.
     * 
     * @return zoneNumber
     */
    public java.lang.String getZoneNumber() {
        return zoneNumber;
    }


    /**
     * Sets the zoneNumber value for this ShowSalesHeader.
     * 
     * @param zoneNumber
     */
    public void setZoneNumber(java.lang.String zoneNumber) {
        this.zoneNumber = zoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowSalesHeader)) return false;
        ShowSalesHeader other = (ShowSalesHeader) obj;
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
            ((this.amountTotalOrderDomestic==null && other.getAmountTotalOrderDomestic()==null) || 
             (this.amountTotalOrderDomestic!=null &&
              this.amountTotalOrderDomestic.equals(other.getAmountTotalOrderDomestic()))) &&
            ((this.amountTotalOrderForeign==null && other.getAmountTotalOrderForeign()==null) || 
             (this.amountTotalOrderForeign!=null &&
              this.amountTotalOrderForeign.equals(other.getAmountTotalOrderForeign()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.currencyCodeFrom==null && other.getCurrencyCodeFrom()==null) || 
             (this.currencyCodeFrom!=null &&
              this.currencyCodeFrom.equals(other.getCurrencyCodeFrom()))) &&
            ((this.currencyModeCode==null && other.getCurrencyModeCode()==null) || 
             (this.currencyModeCode!=null &&
              this.currencyModeCode.equals(other.getCurrencyModeCode()))) &&
            ((this.customerPO==null && other.getCustomerPO()==null) || 
             (this.customerPO!=null &&
              this.customerPO.equals(other.getCustomerPO()))) &&
            ((this.customerPriceGroupCode==null && other.getCustomerPriceGroupCode()==null) || 
             (this.customerPriceGroupCode!=null &&
              this.customerPriceGroupCode.equals(other.getCustomerPriceGroupCode()))) &&
            ((this.dateActualShip==null && other.getDateActualShip()==null) || 
             (this.dateActualShip!=null &&
              this.dateActualShip.equals(other.getDateActualShip()))) &&
            ((this.dateCancel==null && other.getDateCancel()==null) || 
             (this.dateCancel!=null &&
              this.dateCancel.equals(other.getDateCancel()))) &&
            ((this.datePromisedShip==null && other.getDatePromisedShip()==null) || 
             (this.datePromisedShip!=null &&
              this.datePromisedShip.equals(other.getDatePromisedShip()))) &&
            ((this.dateRequested==null && other.getDateRequested()==null) || 
             (this.dateRequested!=null &&
              this.dateRequested.equals(other.getDateRequested()))) &&
            ((this.dateScheduledPick==null && other.getDateScheduledPick()==null) || 
             (this.dateScheduledPick!=null &&
              this.dateScheduledPick.equals(other.getDateScheduledPick()))) &&
            ((this.dateTransaction==null && other.getDateTransaction()==null) || 
             (this.dateTransaction!=null &&
              this.dateTransaction.equals(other.getDateTransaction()))) &&
            ((this.deliverTo==null && other.getDeliverTo()==null) || 
             (this.deliverTo!=null &&
              this.deliverTo.equals(other.getDeliverTo()))) &&
            ((this.deliveryInstruction1==null && other.getDeliveryInstruction1()==null) || 
             (this.deliveryInstruction1!=null &&
              this.deliveryInstruction1.equals(other.getDeliveryInstruction1()))) &&
            ((this.deliveryInstruction2==null && other.getDeliveryInstruction2()==null) || 
             (this.deliveryInstruction2!=null &&
              this.deliveryInstruction2.equals(other.getDeliveryInstruction2()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              java.util.Arrays.equals(this.detail, other.getDetail()))) &&
            ((this.entityIdCarrier==null && other.getEntityIdCarrier()==null) || 
             (this.entityIdCarrier!=null &&
              this.entityIdCarrier.equals(other.getEntityIdCarrier()))) &&
            ((this.forwardedTo==null && other.getForwardedTo()==null) || 
             (this.forwardedTo!=null &&
              this.forwardedTo.equals(other.getForwardedTo()))) &&
            ((this.freightHandlingCode==null && other.getFreightHandlingCode()==null) || 
             (this.freightHandlingCode!=null &&
              this.freightHandlingCode.equals(other.getFreightHandlingCode()))) &&
            ((this.holdOrderCode==null && other.getHoldOrderCode()==null) || 
             (this.holdOrderCode!=null &&
              this.holdOrderCode.equals(other.getHoldOrderCode()))) &&
            ((this.invoicedTo==null && other.getInvoicedTo()==null) || 
             (this.invoicedTo!=null &&
              this.invoicedTo.equals(other.getInvoicedTo()))) &&
            ((this.modeOfTransport==null && other.getModeOfTransport()==null) || 
             (this.modeOfTransport!=null &&
              this.modeOfTransport.equals(other.getModeOfTransport()))) &&
            ((this.orderTakenBy==null && other.getOrderTakenBy()==null) || 
             (this.orderTakenBy!=null &&
              this.orderTakenBy.equals(other.getOrderTakenBy()))) &&
            ((this.orderedBy==null && other.getOrderedBy()==null) || 
             (this.orderedBy!=null &&
              this.orderedBy.equals(other.getOrderedBy()))) &&
            ((this.originalOrder==null && other.getOriginalOrder()==null) || 
             (this.originalOrder!=null &&
              this.originalOrder.equals(other.getOriginalOrder()))) &&
            ((this.paidBy==null && other.getPaidBy()==null) || 
             (this.paidBy!=null &&
              this.paidBy.equals(other.getPaidBy()))) &&
            ((this.paymentInstrumentCode==null && other.getPaymentInstrumentCode()==null) || 
             (this.paymentInstrumentCode!=null &&
              this.paymentInstrumentCode.equals(other.getPaymentInstrumentCode()))) &&
            ((this.paymentTermsCode==null && other.getPaymentTermsCode()==null) || 
             (this.paymentTermsCode!=null &&
              this.paymentTermsCode.equals(other.getPaymentTermsCode()))) &&
            ((this.percentDiscountTrade==null && other.getPercentDiscountTrade()==null) || 
             (this.percentDiscountTrade!=null &&
              this.percentDiscountTrade.equals(other.getPercentDiscountTrade()))) &&
            ((this.printMessageCode==null && other.getPrintMessageCode()==null) || 
             (this.printMessageCode!=null &&
              this.printMessageCode.equals(other.getPrintMessageCode()))) &&
            ((this.rateExchangeOverride==null && other.getRateExchangeOverride()==null) || 
             (this.rateExchangeOverride!=null &&
              this.rateExchangeOverride.equals(other.getRateExchangeOverride()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.routeCode==null && other.getRouteCode()==null) || 
             (this.routeCode!=null &&
              this.routeCode.equals(other.getRouteCode()))) &&
            ((this.salesOrderKey==null && other.getSalesOrderKey()==null) || 
             (this.salesOrderKey!=null &&
              this.salesOrderKey.equals(other.getSalesOrderKey()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.stopCode==null && other.getStopCode()==null) || 
             (this.stopCode!=null &&
              this.stopCode.equals(other.getStopCode()))) &&
            ((this.taxExplanationCode==null && other.getTaxExplanationCode()==null) || 
             (this.taxExplanationCode!=null &&
              this.taxExplanationCode.equals(other.getTaxExplanationCode()))) &&
            ((this.taxRateAreaCode==null && other.getTaxRateAreaCode()==null) || 
             (this.taxRateAreaCode!=null &&
              this.taxRateAreaCode.equals(other.getTaxRateAreaCode()))) &&
            ((this.userReservedData==null && other.getUserReservedData()==null) || 
             (this.userReservedData!=null &&
              this.userReservedData.equals(other.getUserReservedData()))) &&
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
        if (getRMAId() != null) {
            _hashCode += getRMAId().hashCode();
        }
        if (getRMAType() != null) {
            _hashCode += getRMAType().hashCode();
        }
        if (getAdjustmentScheduleCode() != null) {
            _hashCode += getAdjustmentScheduleCode().hashCode();
        }
        if (getAmountTotalOrderDomestic() != null) {
            _hashCode += getAmountTotalOrderDomestic().hashCode();
        }
        if (getAmountTotalOrderForeign() != null) {
            _hashCode += getAmountTotalOrderForeign().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getCurrencyCodeFrom() != null) {
            _hashCode += getCurrencyCodeFrom().hashCode();
        }
        if (getCurrencyModeCode() != null) {
            _hashCode += getCurrencyModeCode().hashCode();
        }
        if (getCustomerPO() != null) {
            _hashCode += getCustomerPO().hashCode();
        }
        if (getCustomerPriceGroupCode() != null) {
            _hashCode += getCustomerPriceGroupCode().hashCode();
        }
        if (getDateActualShip() != null) {
            _hashCode += getDateActualShip().hashCode();
        }
        if (getDateCancel() != null) {
            _hashCode += getDateCancel().hashCode();
        }
        if (getDatePromisedShip() != null) {
            _hashCode += getDatePromisedShip().hashCode();
        }
        if (getDateRequested() != null) {
            _hashCode += getDateRequested().hashCode();
        }
        if (getDateScheduledPick() != null) {
            _hashCode += getDateScheduledPick().hashCode();
        }
        if (getDateTransaction() != null) {
            _hashCode += getDateTransaction().hashCode();
        }
        if (getDeliverTo() != null) {
            _hashCode += getDeliverTo().hashCode();
        }
        if (getDeliveryInstruction1() != null) {
            _hashCode += getDeliveryInstruction1().hashCode();
        }
        if (getDeliveryInstruction2() != null) {
            _hashCode += getDeliveryInstruction2().hashCode();
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
        if (getEntityIdCarrier() != null) {
            _hashCode += getEntityIdCarrier().hashCode();
        }
        if (getForwardedTo() != null) {
            _hashCode += getForwardedTo().hashCode();
        }
        if (getFreightHandlingCode() != null) {
            _hashCode += getFreightHandlingCode().hashCode();
        }
        if (getHoldOrderCode() != null) {
            _hashCode += getHoldOrderCode().hashCode();
        }
        if (getInvoicedTo() != null) {
            _hashCode += getInvoicedTo().hashCode();
        }
        if (getModeOfTransport() != null) {
            _hashCode += getModeOfTransport().hashCode();
        }
        if (getOrderTakenBy() != null) {
            _hashCode += getOrderTakenBy().hashCode();
        }
        if (getOrderedBy() != null) {
            _hashCode += getOrderedBy().hashCode();
        }
        if (getOriginalOrder() != null) {
            _hashCode += getOriginalOrder().hashCode();
        }
        if (getPaidBy() != null) {
            _hashCode += getPaidBy().hashCode();
        }
        if (getPaymentInstrumentCode() != null) {
            _hashCode += getPaymentInstrumentCode().hashCode();
        }
        if (getPaymentTermsCode() != null) {
            _hashCode += getPaymentTermsCode().hashCode();
        }
        if (getPercentDiscountTrade() != null) {
            _hashCode += getPercentDiscountTrade().hashCode();
        }
        if (getPrintMessageCode() != null) {
            _hashCode += getPrintMessageCode().hashCode();
        }
        if (getRateExchangeOverride() != null) {
            _hashCode += getRateExchangeOverride().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getRouteCode() != null) {
            _hashCode += getRouteCode().hashCode();
        }
        if (getSalesOrderKey() != null) {
            _hashCode += getSalesOrderKey().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getStopCode() != null) {
            _hashCode += getStopCode().hashCode();
        }
        if (getTaxExplanationCode() != null) {
            _hashCode += getTaxExplanationCode().hashCode();
        }
        if (getTaxRateAreaCode() != null) {
            _hashCode += getTaxRateAreaCode().hashCode();
        }
        if (getUserReservedData() != null) {
            _hashCode += getUserReservedData().hashCode();
        }
        if (getZoneNumber() != null) {
            _hashCode += getZoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShowSalesHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesHeader"));
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
        elemField.setFieldName("amountTotalOrderDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountTotalOrderDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountTotalOrderForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountTotalOrderForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company"));
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
        elemField.setFieldName("customerPO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPriceGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerPriceGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateActualShip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateActualShip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePromisedShip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePromisedShip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateScheduledPick");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateScheduledPick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliverTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
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
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityIdCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityIdCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwardedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
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
        elemField.setFieldName("holdOrderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdOrderCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoicedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeOfTransport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeOfTransport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("originalOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "originalOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paidBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInstrumentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentInstrumentCode"));
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
        elemField.setFieldName("percentDiscountTrade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentDiscountTrade"));
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
        elemField.setFieldName("rateExchangeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateExchangeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salesOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "salesOrderKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesShipTo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stopCode"));
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
        elemField.setFieldName("userReservedData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userReservedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "userReservedData"));
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
