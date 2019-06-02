/**
 * ProcessSOHeaderV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ProcessSOHeaderV3  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String attachmentText;

    private JP420000.bssv.e1.oracle.ProcessSOHeaderBillingV2 billing;

    private java.lang.String businessUnit;

    private java.lang.String carrierGLN;

    private java.lang.String company;

    private java.lang.String currencyCodeTo;

    private java.lang.String customerPO;

    private java.util.Calendar dateCancel;

    private java.util.Calendar dateOrdered;

    private java.util.Calendar dateRequested;

    private java.util.Calendar dateScheduledPick;

    private JP420000.bssv.e1.oracle.Entity deliverTo;

    private java.lang.String deliverToGLN;

    private JP420000.bssv.e1.oracle.ProcessSODetailV2[] detail;

    private java.lang.String forwardToGLN;

    private JP420000.bssv.e1.oracle.Entity forwardedTo;

    private java.lang.String holdOrderCode;

    private java.lang.String invoiceToGLN;

    private JP420000.bssv.e1.oracle.Entity invoicedTo;

    private java.lang.String orderTakenBy;

    private java.lang.String orderedBy;

    private JP420000.bssv.e1.oracle.Entity paidBy;

    private java.lang.String paidByGLN;

    private JP420000.bssv.e1.oracle.ProcessSOHeaderProcessing processing;

    private java.math.BigDecimal rateExchange;

    private JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey;

    private JP420000.bssv.e1.oracle.ProcessSOCustomerV2 shipTo;

    private JP420000.bssv.e1.oracle.ProcessSOCustomerV2 soldTo;

    private java.lang.Integer timeRequested;

    private java.lang.Integer timeScheduledPick;

    private JP420000.bssv.e1.oracle.UserReservedData userReservedData;

    public ProcessSOHeaderV3() {
    }

    public ProcessSOHeaderV3(
           java.lang.String attachmentText,
           JP420000.bssv.e1.oracle.ProcessSOHeaderBillingV2 billing,
           java.lang.String businessUnit,
           java.lang.String carrierGLN,
           java.lang.String company,
           java.lang.String currencyCodeTo,
           java.lang.String customerPO,
           java.util.Calendar dateCancel,
           java.util.Calendar dateOrdered,
           java.util.Calendar dateRequested,
           java.util.Calendar dateScheduledPick,
           JP420000.bssv.e1.oracle.Entity deliverTo,
           java.lang.String deliverToGLN,
           JP420000.bssv.e1.oracle.ProcessSODetailV2[] detail,
           java.lang.String forwardToGLN,
           JP420000.bssv.e1.oracle.Entity forwardedTo,
           java.lang.String holdOrderCode,
           java.lang.String invoiceToGLN,
           JP420000.bssv.e1.oracle.Entity invoicedTo,
           java.lang.String orderTakenBy,
           java.lang.String orderedBy,
           JP420000.bssv.e1.oracle.Entity paidBy,
           java.lang.String paidByGLN,
           JP420000.bssv.e1.oracle.ProcessSOHeaderProcessing processing,
           java.math.BigDecimal rateExchange,
           JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey,
           JP420000.bssv.e1.oracle.ProcessSOCustomerV2 shipTo,
           JP420000.bssv.e1.oracle.ProcessSOCustomerV2 soldTo,
           java.lang.Integer timeRequested,
           java.lang.Integer timeScheduledPick,
           JP420000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.attachmentText = attachmentText;
        this.billing = billing;
        this.businessUnit = businessUnit;
        this.carrierGLN = carrierGLN;
        this.company = company;
        this.currencyCodeTo = currencyCodeTo;
        this.customerPO = customerPO;
        this.dateCancel = dateCancel;
        this.dateOrdered = dateOrdered;
        this.dateRequested = dateRequested;
        this.dateScheduledPick = dateScheduledPick;
        this.deliverTo = deliverTo;
        this.deliverToGLN = deliverToGLN;
        this.detail = detail;
        this.forwardToGLN = forwardToGLN;
        this.forwardedTo = forwardedTo;
        this.holdOrderCode = holdOrderCode;
        this.invoiceToGLN = invoiceToGLN;
        this.invoicedTo = invoicedTo;
        this.orderTakenBy = orderTakenBy;
        this.orderedBy = orderedBy;
        this.paidBy = paidBy;
        this.paidByGLN = paidByGLN;
        this.processing = processing;
        this.rateExchange = rateExchange;
        this.salesOrderKey = salesOrderKey;
        this.shipTo = shipTo;
        this.soldTo = soldTo;
        this.timeRequested = timeRequested;
        this.timeScheduledPick = timeScheduledPick;
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the attachmentText value for this ProcessSOHeaderV3.
     * 
     * @return attachmentText
     */
    public java.lang.String getAttachmentText() {
        return attachmentText;
    }


    /**
     * Sets the attachmentText value for this ProcessSOHeaderV3.
     * 
     * @param attachmentText
     */
    public void setAttachmentText(java.lang.String attachmentText) {
        this.attachmentText = attachmentText;
    }


    /**
     * Gets the billing value for this ProcessSOHeaderV3.
     * 
     * @return billing
     */
    public JP420000.bssv.e1.oracle.ProcessSOHeaderBillingV2 getBilling() {
        return billing;
    }


    /**
     * Sets the billing value for this ProcessSOHeaderV3.
     * 
     * @param billing
     */
    public void setBilling(JP420000.bssv.e1.oracle.ProcessSOHeaderBillingV2 billing) {
        this.billing = billing;
    }


    /**
     * Gets the businessUnit value for this ProcessSOHeaderV3.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this ProcessSOHeaderV3.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the carrierGLN value for this ProcessSOHeaderV3.
     * 
     * @return carrierGLN
     */
    public java.lang.String getCarrierGLN() {
        return carrierGLN;
    }


    /**
     * Sets the carrierGLN value for this ProcessSOHeaderV3.
     * 
     * @param carrierGLN
     */
    public void setCarrierGLN(java.lang.String carrierGLN) {
        this.carrierGLN = carrierGLN;
    }


    /**
     * Gets the company value for this ProcessSOHeaderV3.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ProcessSOHeaderV3.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the currencyCodeTo value for this ProcessSOHeaderV3.
     * 
     * @return currencyCodeTo
     */
    public java.lang.String getCurrencyCodeTo() {
        return currencyCodeTo;
    }


    /**
     * Sets the currencyCodeTo value for this ProcessSOHeaderV3.
     * 
     * @param currencyCodeTo
     */
    public void setCurrencyCodeTo(java.lang.String currencyCodeTo) {
        this.currencyCodeTo = currencyCodeTo;
    }


    /**
     * Gets the customerPO value for this ProcessSOHeaderV3.
     * 
     * @return customerPO
     */
    public java.lang.String getCustomerPO() {
        return customerPO;
    }


    /**
     * Sets the customerPO value for this ProcessSOHeaderV3.
     * 
     * @param customerPO
     */
    public void setCustomerPO(java.lang.String customerPO) {
        this.customerPO = customerPO;
    }


    /**
     * Gets the dateCancel value for this ProcessSOHeaderV3.
     * 
     * @return dateCancel
     */
    public java.util.Calendar getDateCancel() {
        return dateCancel;
    }


    /**
     * Sets the dateCancel value for this ProcessSOHeaderV3.
     * 
     * @param dateCancel
     */
    public void setDateCancel(java.util.Calendar dateCancel) {
        this.dateCancel = dateCancel;
    }


    /**
     * Gets the dateOrdered value for this ProcessSOHeaderV3.
     * 
     * @return dateOrdered
     */
    public java.util.Calendar getDateOrdered() {
        return dateOrdered;
    }


    /**
     * Sets the dateOrdered value for this ProcessSOHeaderV3.
     * 
     * @param dateOrdered
     */
    public void setDateOrdered(java.util.Calendar dateOrdered) {
        this.dateOrdered = dateOrdered;
    }


    /**
     * Gets the dateRequested value for this ProcessSOHeaderV3.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this ProcessSOHeaderV3.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the dateScheduledPick value for this ProcessSOHeaderV3.
     * 
     * @return dateScheduledPick
     */
    public java.util.Calendar getDateScheduledPick() {
        return dateScheduledPick;
    }


    /**
     * Sets the dateScheduledPick value for this ProcessSOHeaderV3.
     * 
     * @param dateScheduledPick
     */
    public void setDateScheduledPick(java.util.Calendar dateScheduledPick) {
        this.dateScheduledPick = dateScheduledPick;
    }


    /**
     * Gets the deliverTo value for this ProcessSOHeaderV3.
     * 
     * @return deliverTo
     */
    public JP420000.bssv.e1.oracle.Entity getDeliverTo() {
        return deliverTo;
    }


    /**
     * Sets the deliverTo value for this ProcessSOHeaderV3.
     * 
     * @param deliverTo
     */
    public void setDeliverTo(JP420000.bssv.e1.oracle.Entity deliverTo) {
        this.deliverTo = deliverTo;
    }


    /**
     * Gets the deliverToGLN value for this ProcessSOHeaderV3.
     * 
     * @return deliverToGLN
     */
    public java.lang.String getDeliverToGLN() {
        return deliverToGLN;
    }


    /**
     * Sets the deliverToGLN value for this ProcessSOHeaderV3.
     * 
     * @param deliverToGLN
     */
    public void setDeliverToGLN(java.lang.String deliverToGLN) {
        this.deliverToGLN = deliverToGLN;
    }


    /**
     * Gets the detail value for this ProcessSOHeaderV3.
     * 
     * @return detail
     */
    public JP420000.bssv.e1.oracle.ProcessSODetailV2[] getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this ProcessSOHeaderV3.
     * 
     * @param detail
     */
    public void setDetail(JP420000.bssv.e1.oracle.ProcessSODetailV2[] detail) {
        this.detail = detail;
    }

    public JP420000.bssv.e1.oracle.ProcessSODetailV2 getDetail(int i) {
        return this.detail[i];
    }

    public void setDetail(int i, JP420000.bssv.e1.oracle.ProcessSODetailV2 _value) {
        this.detail[i] = _value;
    }


    /**
     * Gets the forwardToGLN value for this ProcessSOHeaderV3.
     * 
     * @return forwardToGLN
     */
    public java.lang.String getForwardToGLN() {
        return forwardToGLN;
    }


    /**
     * Sets the forwardToGLN value for this ProcessSOHeaderV3.
     * 
     * @param forwardToGLN
     */
    public void setForwardToGLN(java.lang.String forwardToGLN) {
        this.forwardToGLN = forwardToGLN;
    }


    /**
     * Gets the forwardedTo value for this ProcessSOHeaderV3.
     * 
     * @return forwardedTo
     */
    public JP420000.bssv.e1.oracle.Entity getForwardedTo() {
        return forwardedTo;
    }


    /**
     * Sets the forwardedTo value for this ProcessSOHeaderV3.
     * 
     * @param forwardedTo
     */
    public void setForwardedTo(JP420000.bssv.e1.oracle.Entity forwardedTo) {
        this.forwardedTo = forwardedTo;
    }


    /**
     * Gets the holdOrderCode value for this ProcessSOHeaderV3.
     * 
     * @return holdOrderCode
     */
    public java.lang.String getHoldOrderCode() {
        return holdOrderCode;
    }


    /**
     * Sets the holdOrderCode value for this ProcessSOHeaderV3.
     * 
     * @param holdOrderCode
     */
    public void setHoldOrderCode(java.lang.String holdOrderCode) {
        this.holdOrderCode = holdOrderCode;
    }


    /**
     * Gets the invoiceToGLN value for this ProcessSOHeaderV3.
     * 
     * @return invoiceToGLN
     */
    public java.lang.String getInvoiceToGLN() {
        return invoiceToGLN;
    }


    /**
     * Sets the invoiceToGLN value for this ProcessSOHeaderV3.
     * 
     * @param invoiceToGLN
     */
    public void setInvoiceToGLN(java.lang.String invoiceToGLN) {
        this.invoiceToGLN = invoiceToGLN;
    }


    /**
     * Gets the invoicedTo value for this ProcessSOHeaderV3.
     * 
     * @return invoicedTo
     */
    public JP420000.bssv.e1.oracle.Entity getInvoicedTo() {
        return invoicedTo;
    }


    /**
     * Sets the invoicedTo value for this ProcessSOHeaderV3.
     * 
     * @param invoicedTo
     */
    public void setInvoicedTo(JP420000.bssv.e1.oracle.Entity invoicedTo) {
        this.invoicedTo = invoicedTo;
    }


    /**
     * Gets the orderTakenBy value for this ProcessSOHeaderV3.
     * 
     * @return orderTakenBy
     */
    public java.lang.String getOrderTakenBy() {
        return orderTakenBy;
    }


    /**
     * Sets the orderTakenBy value for this ProcessSOHeaderV3.
     * 
     * @param orderTakenBy
     */
    public void setOrderTakenBy(java.lang.String orderTakenBy) {
        this.orderTakenBy = orderTakenBy;
    }


    /**
     * Gets the orderedBy value for this ProcessSOHeaderV3.
     * 
     * @return orderedBy
     */
    public java.lang.String getOrderedBy() {
        return orderedBy;
    }


    /**
     * Sets the orderedBy value for this ProcessSOHeaderV3.
     * 
     * @param orderedBy
     */
    public void setOrderedBy(java.lang.String orderedBy) {
        this.orderedBy = orderedBy;
    }


    /**
     * Gets the paidBy value for this ProcessSOHeaderV3.
     * 
     * @return paidBy
     */
    public JP420000.bssv.e1.oracle.Entity getPaidBy() {
        return paidBy;
    }


    /**
     * Sets the paidBy value for this ProcessSOHeaderV3.
     * 
     * @param paidBy
     */
    public void setPaidBy(JP420000.bssv.e1.oracle.Entity paidBy) {
        this.paidBy = paidBy;
    }


    /**
     * Gets the paidByGLN value for this ProcessSOHeaderV3.
     * 
     * @return paidByGLN
     */
    public java.lang.String getPaidByGLN() {
        return paidByGLN;
    }


    /**
     * Sets the paidByGLN value for this ProcessSOHeaderV3.
     * 
     * @param paidByGLN
     */
    public void setPaidByGLN(java.lang.String paidByGLN) {
        this.paidByGLN = paidByGLN;
    }


    /**
     * Gets the processing value for this ProcessSOHeaderV3.
     * 
     * @return processing
     */
    public JP420000.bssv.e1.oracle.ProcessSOHeaderProcessing getProcessing() {
        return processing;
    }


    /**
     * Sets the processing value for this ProcessSOHeaderV3.
     * 
     * @param processing
     */
    public void setProcessing(JP420000.bssv.e1.oracle.ProcessSOHeaderProcessing processing) {
        this.processing = processing;
    }


    /**
     * Gets the rateExchange value for this ProcessSOHeaderV3.
     * 
     * @return rateExchange
     */
    public java.math.BigDecimal getRateExchange() {
        return rateExchange;
    }


    /**
     * Sets the rateExchange value for this ProcessSOHeaderV3.
     * 
     * @param rateExchange
     */
    public void setRateExchange(java.math.BigDecimal rateExchange) {
        this.rateExchange = rateExchange;
    }


    /**
     * Gets the salesOrderKey value for this ProcessSOHeaderV3.
     * 
     * @return salesOrderKey
     */
    public JP420000.bssv.e1.oracle.SalesOrderKey getSalesOrderKey() {
        return salesOrderKey;
    }


    /**
     * Sets the salesOrderKey value for this ProcessSOHeaderV3.
     * 
     * @param salesOrderKey
     */
    public void setSalesOrderKey(JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey) {
        this.salesOrderKey = salesOrderKey;
    }


    /**
     * Gets the shipTo value for this ProcessSOHeaderV3.
     * 
     * @return shipTo
     */
    public JP420000.bssv.e1.oracle.ProcessSOCustomerV2 getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this ProcessSOHeaderV3.
     * 
     * @param shipTo
     */
    public void setShipTo(JP420000.bssv.e1.oracle.ProcessSOCustomerV2 shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the soldTo value for this ProcessSOHeaderV3.
     * 
     * @return soldTo
     */
    public JP420000.bssv.e1.oracle.ProcessSOCustomerV2 getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this ProcessSOHeaderV3.
     * 
     * @param soldTo
     */
    public void setSoldTo(JP420000.bssv.e1.oracle.ProcessSOCustomerV2 soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the timeRequested value for this ProcessSOHeaderV3.
     * 
     * @return timeRequested
     */
    public java.lang.Integer getTimeRequested() {
        return timeRequested;
    }


    /**
     * Sets the timeRequested value for this ProcessSOHeaderV3.
     * 
     * @param timeRequested
     */
    public void setTimeRequested(java.lang.Integer timeRequested) {
        this.timeRequested = timeRequested;
    }


    /**
     * Gets the timeScheduledPick value for this ProcessSOHeaderV3.
     * 
     * @return timeScheduledPick
     */
    public java.lang.Integer getTimeScheduledPick() {
        return timeScheduledPick;
    }


    /**
     * Sets the timeScheduledPick value for this ProcessSOHeaderV3.
     * 
     * @param timeScheduledPick
     */
    public void setTimeScheduledPick(java.lang.Integer timeScheduledPick) {
        this.timeScheduledPick = timeScheduledPick;
    }


    /**
     * Gets the userReservedData value for this ProcessSOHeaderV3.
     * 
     * @return userReservedData
     */
    public JP420000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this ProcessSOHeaderV3.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP420000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessSOHeaderV3)) return false;
        ProcessSOHeaderV3 other = (ProcessSOHeaderV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachmentText==null && other.getAttachmentText()==null) || 
             (this.attachmentText!=null &&
              this.attachmentText.equals(other.getAttachmentText()))) &&
            ((this.billing==null && other.getBilling()==null) || 
             (this.billing!=null &&
              this.billing.equals(other.getBilling()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.carrierGLN==null && other.getCarrierGLN()==null) || 
             (this.carrierGLN!=null &&
              this.carrierGLN.equals(other.getCarrierGLN()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.currencyCodeTo==null && other.getCurrencyCodeTo()==null) || 
             (this.currencyCodeTo!=null &&
              this.currencyCodeTo.equals(other.getCurrencyCodeTo()))) &&
            ((this.customerPO==null && other.getCustomerPO()==null) || 
             (this.customerPO!=null &&
              this.customerPO.equals(other.getCustomerPO()))) &&
            ((this.dateCancel==null && other.getDateCancel()==null) || 
             (this.dateCancel!=null &&
              this.dateCancel.equals(other.getDateCancel()))) &&
            ((this.dateOrdered==null && other.getDateOrdered()==null) || 
             (this.dateOrdered!=null &&
              this.dateOrdered.equals(other.getDateOrdered()))) &&
            ((this.dateRequested==null && other.getDateRequested()==null) || 
             (this.dateRequested!=null &&
              this.dateRequested.equals(other.getDateRequested()))) &&
            ((this.dateScheduledPick==null && other.getDateScheduledPick()==null) || 
             (this.dateScheduledPick!=null &&
              this.dateScheduledPick.equals(other.getDateScheduledPick()))) &&
            ((this.deliverTo==null && other.getDeliverTo()==null) || 
             (this.deliverTo!=null &&
              this.deliverTo.equals(other.getDeliverTo()))) &&
            ((this.deliverToGLN==null && other.getDeliverToGLN()==null) || 
             (this.deliverToGLN!=null &&
              this.deliverToGLN.equals(other.getDeliverToGLN()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              java.util.Arrays.equals(this.detail, other.getDetail()))) &&
            ((this.forwardToGLN==null && other.getForwardToGLN()==null) || 
             (this.forwardToGLN!=null &&
              this.forwardToGLN.equals(other.getForwardToGLN()))) &&
            ((this.forwardedTo==null && other.getForwardedTo()==null) || 
             (this.forwardedTo!=null &&
              this.forwardedTo.equals(other.getForwardedTo()))) &&
            ((this.holdOrderCode==null && other.getHoldOrderCode()==null) || 
             (this.holdOrderCode!=null &&
              this.holdOrderCode.equals(other.getHoldOrderCode()))) &&
            ((this.invoiceToGLN==null && other.getInvoiceToGLN()==null) || 
             (this.invoiceToGLN!=null &&
              this.invoiceToGLN.equals(other.getInvoiceToGLN()))) &&
            ((this.invoicedTo==null && other.getInvoicedTo()==null) || 
             (this.invoicedTo!=null &&
              this.invoicedTo.equals(other.getInvoicedTo()))) &&
            ((this.orderTakenBy==null && other.getOrderTakenBy()==null) || 
             (this.orderTakenBy!=null &&
              this.orderTakenBy.equals(other.getOrderTakenBy()))) &&
            ((this.orderedBy==null && other.getOrderedBy()==null) || 
             (this.orderedBy!=null &&
              this.orderedBy.equals(other.getOrderedBy()))) &&
            ((this.paidBy==null && other.getPaidBy()==null) || 
             (this.paidBy!=null &&
              this.paidBy.equals(other.getPaidBy()))) &&
            ((this.paidByGLN==null && other.getPaidByGLN()==null) || 
             (this.paidByGLN!=null &&
              this.paidByGLN.equals(other.getPaidByGLN()))) &&
            ((this.processing==null && other.getProcessing()==null) || 
             (this.processing!=null &&
              this.processing.equals(other.getProcessing()))) &&
            ((this.rateExchange==null && other.getRateExchange()==null) || 
             (this.rateExchange!=null &&
              this.rateExchange.equals(other.getRateExchange()))) &&
            ((this.salesOrderKey==null && other.getSalesOrderKey()==null) || 
             (this.salesOrderKey!=null &&
              this.salesOrderKey.equals(other.getSalesOrderKey()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.timeRequested==null && other.getTimeRequested()==null) || 
             (this.timeRequested!=null &&
              this.timeRequested.equals(other.getTimeRequested()))) &&
            ((this.timeScheduledPick==null && other.getTimeScheduledPick()==null) || 
             (this.timeScheduledPick!=null &&
              this.timeScheduledPick.equals(other.getTimeScheduledPick()))) &&
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
        if (getAttachmentText() != null) {
            _hashCode += getAttachmentText().hashCode();
        }
        if (getBilling() != null) {
            _hashCode += getBilling().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCarrierGLN() != null) {
            _hashCode += getCarrierGLN().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getCurrencyCodeTo() != null) {
            _hashCode += getCurrencyCodeTo().hashCode();
        }
        if (getCustomerPO() != null) {
            _hashCode += getCustomerPO().hashCode();
        }
        if (getDateCancel() != null) {
            _hashCode += getDateCancel().hashCode();
        }
        if (getDateOrdered() != null) {
            _hashCode += getDateOrdered().hashCode();
        }
        if (getDateRequested() != null) {
            _hashCode += getDateRequested().hashCode();
        }
        if (getDateScheduledPick() != null) {
            _hashCode += getDateScheduledPick().hashCode();
        }
        if (getDeliverTo() != null) {
            _hashCode += getDeliverTo().hashCode();
        }
        if (getDeliverToGLN() != null) {
            _hashCode += getDeliverToGLN().hashCode();
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
        if (getForwardToGLN() != null) {
            _hashCode += getForwardToGLN().hashCode();
        }
        if (getForwardedTo() != null) {
            _hashCode += getForwardedTo().hashCode();
        }
        if (getHoldOrderCode() != null) {
            _hashCode += getHoldOrderCode().hashCode();
        }
        if (getInvoiceToGLN() != null) {
            _hashCode += getInvoiceToGLN().hashCode();
        }
        if (getInvoicedTo() != null) {
            _hashCode += getInvoicedTo().hashCode();
        }
        if (getOrderTakenBy() != null) {
            _hashCode += getOrderTakenBy().hashCode();
        }
        if (getOrderedBy() != null) {
            _hashCode += getOrderedBy().hashCode();
        }
        if (getPaidBy() != null) {
            _hashCode += getPaidBy().hashCode();
        }
        if (getPaidByGLN() != null) {
            _hashCode += getPaidByGLN().hashCode();
        }
        if (getProcessing() != null) {
            _hashCode += getProcessing().hashCode();
        }
        if (getRateExchange() != null) {
            _hashCode += getRateExchange().hashCode();
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
        if (getTimeRequested() != null) {
            _hashCode += getTimeRequested().hashCode();
        }
        if (getTimeScheduledPick() != null) {
            _hashCode += getTimeScheduledPick().hashCode();
        }
        if (getUserReservedData() != null) {
            _hashCode += getUserReservedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessSOHeaderV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderBillingV2"));
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
        elemField.setFieldName("carrierGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrierGLN"));
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
        elemField.setFieldName("currencyCodeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCodeTo"));
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
        elemField.setFieldName("dateCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOrdered"));
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
        elemField.setFieldName("deliverTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliverTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverToGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliverToGLN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardToGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwardToGLN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("holdOrderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdOrderCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceToGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceToGLN"));
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
        elemField.setFieldName("paidBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paidBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidByGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paidByGLN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderProcessing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateExchange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateExchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOCustomerV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOCustomerV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeScheduledPick");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeScheduledPick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
