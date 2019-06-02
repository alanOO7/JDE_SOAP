/**
 * ProcessSODetailV4.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ProcessSODetailV4  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String agreementId;

    private java.lang.Integer agreementSupplement;

    private JP420000.bssv.e1.oracle.ProcessSODetailBillingV2 billing;

    private java.lang.String businessUnit;

    private java.lang.String businessUnitDestination;

    private JP420000.bssv.e1.oracle.CategoryCodesPurchasing categoryCodesPurchasing;

    private JP420000.bssv.e1.oracle.CategoryCodesSales categoryCodesSales;

    private java.lang.String customerPO;

    private java.util.Calendar dateCancel;

    private java.util.Calendar datePromisedDelivery;

    private java.util.Calendar datePromisedOriginal;

    private java.util.Calendar datePromisedShip;

    private java.util.Calendar dateRequested;

    private java.util.Calendar dateScheduledPick;

    private java.math.BigDecimal documentLineNumber;

    private java.lang.String dutyStatusCode;

    private java.lang.String endUseCode;

    private java.lang.String lineOfBusinessCode;

    private java.lang.String lineTypeCode;

    private java.lang.String opportunityId;

    private JP420000.bssv.e1.oracle.ProcessSOOriginalOrder originalOrder;

    private java.lang.String priorityCode;

    private JP420000.bssv.e1.oracle.ProcessSODetailProcessing processing;

    private JP420000.bssv.e1.oracle.ProcessSODetailProductV2 product;

    private java.math.BigDecimal quantityBackOrdered;

    private java.math.BigDecimal quantityCanceled;

    private java.math.BigDecimal quantityOrdered;

    private java.math.BigDecimal quantityShippable;

    private java.lang.String reference;

    private JP420000.bssv.e1.oracle.RelatedOrder relatedOrder;

    private JP420000.bssv.e1.oracle.Entity shipTo;

    private java.lang.String statusCodeLast;

    private java.lang.String statusCodeNext;

    private JP420000.bssv.e1.oracle.Entity supplier;

    private java.lang.Integer timePromisedDelivery;

    private java.lang.Integer timePromisedOriginal;

    private java.lang.Integer timePromisedShip;

    private java.lang.Integer timeRequested;

    private java.lang.Integer timeScheduledPick;

    private java.lang.String unitOfMeasureCodeTransaction;

    private JP420000.bssv.e1.oracle.UserReservedData userReservedData;

    public ProcessSODetailV4() {
    }

    public ProcessSODetailV4(
           java.lang.String agreementId,
           java.lang.Integer agreementSupplement,
           JP420000.bssv.e1.oracle.ProcessSODetailBillingV2 billing,
           java.lang.String businessUnit,
           java.lang.String businessUnitDestination,
           JP420000.bssv.e1.oracle.CategoryCodesPurchasing categoryCodesPurchasing,
           JP420000.bssv.e1.oracle.CategoryCodesSales categoryCodesSales,
           java.lang.String customerPO,
           java.util.Calendar dateCancel,
           java.util.Calendar datePromisedDelivery,
           java.util.Calendar datePromisedOriginal,
           java.util.Calendar datePromisedShip,
           java.util.Calendar dateRequested,
           java.util.Calendar dateScheduledPick,
           java.math.BigDecimal documentLineNumber,
           java.lang.String dutyStatusCode,
           java.lang.String endUseCode,
           java.lang.String lineOfBusinessCode,
           java.lang.String lineTypeCode,
           java.lang.String opportunityId,
           JP420000.bssv.e1.oracle.ProcessSOOriginalOrder originalOrder,
           java.lang.String priorityCode,
           JP420000.bssv.e1.oracle.ProcessSODetailProcessing processing,
           JP420000.bssv.e1.oracle.ProcessSODetailProductV2 product,
           java.math.BigDecimal quantityBackOrdered,
           java.math.BigDecimal quantityCanceled,
           java.math.BigDecimal quantityOrdered,
           java.math.BigDecimal quantityShippable,
           java.lang.String reference,
           JP420000.bssv.e1.oracle.RelatedOrder relatedOrder,
           JP420000.bssv.e1.oracle.Entity shipTo,
           java.lang.String statusCodeLast,
           java.lang.String statusCodeNext,
           JP420000.bssv.e1.oracle.Entity supplier,
           java.lang.Integer timePromisedDelivery,
           java.lang.Integer timePromisedOriginal,
           java.lang.Integer timePromisedShip,
           java.lang.Integer timeRequested,
           java.lang.Integer timeScheduledPick,
           java.lang.String unitOfMeasureCodeTransaction,
           JP420000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.agreementId = agreementId;
        this.agreementSupplement = agreementSupplement;
        this.billing = billing;
        this.businessUnit = businessUnit;
        this.businessUnitDestination = businessUnitDestination;
        this.categoryCodesPurchasing = categoryCodesPurchasing;
        this.categoryCodesSales = categoryCodesSales;
        this.customerPO = customerPO;
        this.dateCancel = dateCancel;
        this.datePromisedDelivery = datePromisedDelivery;
        this.datePromisedOriginal = datePromisedOriginal;
        this.datePromisedShip = datePromisedShip;
        this.dateRequested = dateRequested;
        this.dateScheduledPick = dateScheduledPick;
        this.documentLineNumber = documentLineNumber;
        this.dutyStatusCode = dutyStatusCode;
        this.endUseCode = endUseCode;
        this.lineOfBusinessCode = lineOfBusinessCode;
        this.lineTypeCode = lineTypeCode;
        this.opportunityId = opportunityId;
        this.originalOrder = originalOrder;
        this.priorityCode = priorityCode;
        this.processing = processing;
        this.product = product;
        this.quantityBackOrdered = quantityBackOrdered;
        this.quantityCanceled = quantityCanceled;
        this.quantityOrdered = quantityOrdered;
        this.quantityShippable = quantityShippable;
        this.reference = reference;
        this.relatedOrder = relatedOrder;
        this.shipTo = shipTo;
        this.statusCodeLast = statusCodeLast;
        this.statusCodeNext = statusCodeNext;
        this.supplier = supplier;
        this.timePromisedDelivery = timePromisedDelivery;
        this.timePromisedOriginal = timePromisedOriginal;
        this.timePromisedShip = timePromisedShip;
        this.timeRequested = timeRequested;
        this.timeScheduledPick = timeScheduledPick;
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the agreementId value for this ProcessSODetailV4.
     * 
     * @return agreementId
     */
    public java.lang.String getAgreementId() {
        return agreementId;
    }


    /**
     * Sets the agreementId value for this ProcessSODetailV4.
     * 
     * @param agreementId
     */
    public void setAgreementId(java.lang.String agreementId) {
        this.agreementId = agreementId;
    }


    /**
     * Gets the agreementSupplement value for this ProcessSODetailV4.
     * 
     * @return agreementSupplement
     */
    public java.lang.Integer getAgreementSupplement() {
        return agreementSupplement;
    }


    /**
     * Sets the agreementSupplement value for this ProcessSODetailV4.
     * 
     * @param agreementSupplement
     */
    public void setAgreementSupplement(java.lang.Integer agreementSupplement) {
        this.agreementSupplement = agreementSupplement;
    }


    /**
     * Gets the billing value for this ProcessSODetailV4.
     * 
     * @return billing
     */
    public JP420000.bssv.e1.oracle.ProcessSODetailBillingV2 getBilling() {
        return billing;
    }


    /**
     * Sets the billing value for this ProcessSODetailV4.
     * 
     * @param billing
     */
    public void setBilling(JP420000.bssv.e1.oracle.ProcessSODetailBillingV2 billing) {
        this.billing = billing;
    }


    /**
     * Gets the businessUnit value for this ProcessSODetailV4.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this ProcessSODetailV4.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the businessUnitDestination value for this ProcessSODetailV4.
     * 
     * @return businessUnitDestination
     */
    public java.lang.String getBusinessUnitDestination() {
        return businessUnitDestination;
    }


    /**
     * Sets the businessUnitDestination value for this ProcessSODetailV4.
     * 
     * @param businessUnitDestination
     */
    public void setBusinessUnitDestination(java.lang.String businessUnitDestination) {
        this.businessUnitDestination = businessUnitDestination;
    }


    /**
     * Gets the categoryCodesPurchasing value for this ProcessSODetailV4.
     * 
     * @return categoryCodesPurchasing
     */
    public JP420000.bssv.e1.oracle.CategoryCodesPurchasing getCategoryCodesPurchasing() {
        return categoryCodesPurchasing;
    }


    /**
     * Sets the categoryCodesPurchasing value for this ProcessSODetailV4.
     * 
     * @param categoryCodesPurchasing
     */
    public void setCategoryCodesPurchasing(JP420000.bssv.e1.oracle.CategoryCodesPurchasing categoryCodesPurchasing) {
        this.categoryCodesPurchasing = categoryCodesPurchasing;
    }


    /**
     * Gets the categoryCodesSales value for this ProcessSODetailV4.
     * 
     * @return categoryCodesSales
     */
    public JP420000.bssv.e1.oracle.CategoryCodesSales getCategoryCodesSales() {
        return categoryCodesSales;
    }


    /**
     * Sets the categoryCodesSales value for this ProcessSODetailV4.
     * 
     * @param categoryCodesSales
     */
    public void setCategoryCodesSales(JP420000.bssv.e1.oracle.CategoryCodesSales categoryCodesSales) {
        this.categoryCodesSales = categoryCodesSales;
    }


    /**
     * Gets the customerPO value for this ProcessSODetailV4.
     * 
     * @return customerPO
     */
    public java.lang.String getCustomerPO() {
        return customerPO;
    }


    /**
     * Sets the customerPO value for this ProcessSODetailV4.
     * 
     * @param customerPO
     */
    public void setCustomerPO(java.lang.String customerPO) {
        this.customerPO = customerPO;
    }


    /**
     * Gets the dateCancel value for this ProcessSODetailV4.
     * 
     * @return dateCancel
     */
    public java.util.Calendar getDateCancel() {
        return dateCancel;
    }


    /**
     * Sets the dateCancel value for this ProcessSODetailV4.
     * 
     * @param dateCancel
     */
    public void setDateCancel(java.util.Calendar dateCancel) {
        this.dateCancel = dateCancel;
    }


    /**
     * Gets the datePromisedDelivery value for this ProcessSODetailV4.
     * 
     * @return datePromisedDelivery
     */
    public java.util.Calendar getDatePromisedDelivery() {
        return datePromisedDelivery;
    }


    /**
     * Sets the datePromisedDelivery value for this ProcessSODetailV4.
     * 
     * @param datePromisedDelivery
     */
    public void setDatePromisedDelivery(java.util.Calendar datePromisedDelivery) {
        this.datePromisedDelivery = datePromisedDelivery;
    }


    /**
     * Gets the datePromisedOriginal value for this ProcessSODetailV4.
     * 
     * @return datePromisedOriginal
     */
    public java.util.Calendar getDatePromisedOriginal() {
        return datePromisedOriginal;
    }


    /**
     * Sets the datePromisedOriginal value for this ProcessSODetailV4.
     * 
     * @param datePromisedOriginal
     */
    public void setDatePromisedOriginal(java.util.Calendar datePromisedOriginal) {
        this.datePromisedOriginal = datePromisedOriginal;
    }


    /**
     * Gets the datePromisedShip value for this ProcessSODetailV4.
     * 
     * @return datePromisedShip
     */
    public java.util.Calendar getDatePromisedShip() {
        return datePromisedShip;
    }


    /**
     * Sets the datePromisedShip value for this ProcessSODetailV4.
     * 
     * @param datePromisedShip
     */
    public void setDatePromisedShip(java.util.Calendar datePromisedShip) {
        this.datePromisedShip = datePromisedShip;
    }


    /**
     * Gets the dateRequested value for this ProcessSODetailV4.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this ProcessSODetailV4.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the dateScheduledPick value for this ProcessSODetailV4.
     * 
     * @return dateScheduledPick
     */
    public java.util.Calendar getDateScheduledPick() {
        return dateScheduledPick;
    }


    /**
     * Sets the dateScheduledPick value for this ProcessSODetailV4.
     * 
     * @param dateScheduledPick
     */
    public void setDateScheduledPick(java.util.Calendar dateScheduledPick) {
        this.dateScheduledPick = dateScheduledPick;
    }


    /**
     * Gets the documentLineNumber value for this ProcessSODetailV4.
     * 
     * @return documentLineNumber
     */
    public java.math.BigDecimal getDocumentLineNumber() {
        return documentLineNumber;
    }


    /**
     * Sets the documentLineNumber value for this ProcessSODetailV4.
     * 
     * @param documentLineNumber
     */
    public void setDocumentLineNumber(java.math.BigDecimal documentLineNumber) {
        this.documentLineNumber = documentLineNumber;
    }


    /**
     * Gets the dutyStatusCode value for this ProcessSODetailV4.
     * 
     * @return dutyStatusCode
     */
    public java.lang.String getDutyStatusCode() {
        return dutyStatusCode;
    }


    /**
     * Sets the dutyStatusCode value for this ProcessSODetailV4.
     * 
     * @param dutyStatusCode
     */
    public void setDutyStatusCode(java.lang.String dutyStatusCode) {
        this.dutyStatusCode = dutyStatusCode;
    }


    /**
     * Gets the endUseCode value for this ProcessSODetailV4.
     * 
     * @return endUseCode
     */
    public java.lang.String getEndUseCode() {
        return endUseCode;
    }


    /**
     * Sets the endUseCode value for this ProcessSODetailV4.
     * 
     * @param endUseCode
     */
    public void setEndUseCode(java.lang.String endUseCode) {
        this.endUseCode = endUseCode;
    }


    /**
     * Gets the lineOfBusinessCode value for this ProcessSODetailV4.
     * 
     * @return lineOfBusinessCode
     */
    public java.lang.String getLineOfBusinessCode() {
        return lineOfBusinessCode;
    }


    /**
     * Sets the lineOfBusinessCode value for this ProcessSODetailV4.
     * 
     * @param lineOfBusinessCode
     */
    public void setLineOfBusinessCode(java.lang.String lineOfBusinessCode) {
        this.lineOfBusinessCode = lineOfBusinessCode;
    }


    /**
     * Gets the lineTypeCode value for this ProcessSODetailV4.
     * 
     * @return lineTypeCode
     */
    public java.lang.String getLineTypeCode() {
        return lineTypeCode;
    }


    /**
     * Sets the lineTypeCode value for this ProcessSODetailV4.
     * 
     * @param lineTypeCode
     */
    public void setLineTypeCode(java.lang.String lineTypeCode) {
        this.lineTypeCode = lineTypeCode;
    }


    /**
     * Gets the opportunityId value for this ProcessSODetailV4.
     * 
     * @return opportunityId
     */
    public java.lang.String getOpportunityId() {
        return opportunityId;
    }


    /**
     * Sets the opportunityId value for this ProcessSODetailV4.
     * 
     * @param opportunityId
     */
    public void setOpportunityId(java.lang.String opportunityId) {
        this.opportunityId = opportunityId;
    }


    /**
     * Gets the originalOrder value for this ProcessSODetailV4.
     * 
     * @return originalOrder
     */
    public JP420000.bssv.e1.oracle.ProcessSOOriginalOrder getOriginalOrder() {
        return originalOrder;
    }


    /**
     * Sets the originalOrder value for this ProcessSODetailV4.
     * 
     * @param originalOrder
     */
    public void setOriginalOrder(JP420000.bssv.e1.oracle.ProcessSOOriginalOrder originalOrder) {
        this.originalOrder = originalOrder;
    }


    /**
     * Gets the priorityCode value for this ProcessSODetailV4.
     * 
     * @return priorityCode
     */
    public java.lang.String getPriorityCode() {
        return priorityCode;
    }


    /**
     * Sets the priorityCode value for this ProcessSODetailV4.
     * 
     * @param priorityCode
     */
    public void setPriorityCode(java.lang.String priorityCode) {
        this.priorityCode = priorityCode;
    }


    /**
     * Gets the processing value for this ProcessSODetailV4.
     * 
     * @return processing
     */
    public JP420000.bssv.e1.oracle.ProcessSODetailProcessing getProcessing() {
        return processing;
    }


    /**
     * Sets the processing value for this ProcessSODetailV4.
     * 
     * @param processing
     */
    public void setProcessing(JP420000.bssv.e1.oracle.ProcessSODetailProcessing processing) {
        this.processing = processing;
    }


    /**
     * Gets the product value for this ProcessSODetailV4.
     * 
     * @return product
     */
    public JP420000.bssv.e1.oracle.ProcessSODetailProductV2 getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ProcessSODetailV4.
     * 
     * @param product
     */
    public void setProduct(JP420000.bssv.e1.oracle.ProcessSODetailProductV2 product) {
        this.product = product;
    }


    /**
     * Gets the quantityBackOrdered value for this ProcessSODetailV4.
     * 
     * @return quantityBackOrdered
     */
    public java.math.BigDecimal getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this ProcessSODetailV4.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(java.math.BigDecimal quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the quantityCanceled value for this ProcessSODetailV4.
     * 
     * @return quantityCanceled
     */
    public java.math.BigDecimal getQuantityCanceled() {
        return quantityCanceled;
    }


    /**
     * Sets the quantityCanceled value for this ProcessSODetailV4.
     * 
     * @param quantityCanceled
     */
    public void setQuantityCanceled(java.math.BigDecimal quantityCanceled) {
        this.quantityCanceled = quantityCanceled;
    }


    /**
     * Gets the quantityOrdered value for this ProcessSODetailV4.
     * 
     * @return quantityOrdered
     */
    public java.math.BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }


    /**
     * Sets the quantityOrdered value for this ProcessSODetailV4.
     * 
     * @param quantityOrdered
     */
    public void setQuantityOrdered(java.math.BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }


    /**
     * Gets the quantityShippable value for this ProcessSODetailV4.
     * 
     * @return quantityShippable
     */
    public java.math.BigDecimal getQuantityShippable() {
        return quantityShippable;
    }


    /**
     * Sets the quantityShippable value for this ProcessSODetailV4.
     * 
     * @param quantityShippable
     */
    public void setQuantityShippable(java.math.BigDecimal quantityShippable) {
        this.quantityShippable = quantityShippable;
    }


    /**
     * Gets the reference value for this ProcessSODetailV4.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this ProcessSODetailV4.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the relatedOrder value for this ProcessSODetailV4.
     * 
     * @return relatedOrder
     */
    public JP420000.bssv.e1.oracle.RelatedOrder getRelatedOrder() {
        return relatedOrder;
    }


    /**
     * Sets the relatedOrder value for this ProcessSODetailV4.
     * 
     * @param relatedOrder
     */
    public void setRelatedOrder(JP420000.bssv.e1.oracle.RelatedOrder relatedOrder) {
        this.relatedOrder = relatedOrder;
    }


    /**
     * Gets the shipTo value for this ProcessSODetailV4.
     * 
     * @return shipTo
     */
    public JP420000.bssv.e1.oracle.Entity getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this ProcessSODetailV4.
     * 
     * @param shipTo
     */
    public void setShipTo(JP420000.bssv.e1.oracle.Entity shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the statusCodeLast value for this ProcessSODetailV4.
     * 
     * @return statusCodeLast
     */
    public java.lang.String getStatusCodeLast() {
        return statusCodeLast;
    }


    /**
     * Sets the statusCodeLast value for this ProcessSODetailV4.
     * 
     * @param statusCodeLast
     */
    public void setStatusCodeLast(java.lang.String statusCodeLast) {
        this.statusCodeLast = statusCodeLast;
    }


    /**
     * Gets the statusCodeNext value for this ProcessSODetailV4.
     * 
     * @return statusCodeNext
     */
    public java.lang.String getStatusCodeNext() {
        return statusCodeNext;
    }


    /**
     * Sets the statusCodeNext value for this ProcessSODetailV4.
     * 
     * @param statusCodeNext
     */
    public void setStatusCodeNext(java.lang.String statusCodeNext) {
        this.statusCodeNext = statusCodeNext;
    }


    /**
     * Gets the supplier value for this ProcessSODetailV4.
     * 
     * @return supplier
     */
    public JP420000.bssv.e1.oracle.Entity getSupplier() {
        return supplier;
    }


    /**
     * Sets the supplier value for this ProcessSODetailV4.
     * 
     * @param supplier
     */
    public void setSupplier(JP420000.bssv.e1.oracle.Entity supplier) {
        this.supplier = supplier;
    }


    /**
     * Gets the timePromisedDelivery value for this ProcessSODetailV4.
     * 
     * @return timePromisedDelivery
     */
    public java.lang.Integer getTimePromisedDelivery() {
        return timePromisedDelivery;
    }


    /**
     * Sets the timePromisedDelivery value for this ProcessSODetailV4.
     * 
     * @param timePromisedDelivery
     */
    public void setTimePromisedDelivery(java.lang.Integer timePromisedDelivery) {
        this.timePromisedDelivery = timePromisedDelivery;
    }


    /**
     * Gets the timePromisedOriginal value for this ProcessSODetailV4.
     * 
     * @return timePromisedOriginal
     */
    public java.lang.Integer getTimePromisedOriginal() {
        return timePromisedOriginal;
    }


    /**
     * Sets the timePromisedOriginal value for this ProcessSODetailV4.
     * 
     * @param timePromisedOriginal
     */
    public void setTimePromisedOriginal(java.lang.Integer timePromisedOriginal) {
        this.timePromisedOriginal = timePromisedOriginal;
    }


    /**
     * Gets the timePromisedShip value for this ProcessSODetailV4.
     * 
     * @return timePromisedShip
     */
    public java.lang.Integer getTimePromisedShip() {
        return timePromisedShip;
    }


    /**
     * Sets the timePromisedShip value for this ProcessSODetailV4.
     * 
     * @param timePromisedShip
     */
    public void setTimePromisedShip(java.lang.Integer timePromisedShip) {
        this.timePromisedShip = timePromisedShip;
    }


    /**
     * Gets the timeRequested value for this ProcessSODetailV4.
     * 
     * @return timeRequested
     */
    public java.lang.Integer getTimeRequested() {
        return timeRequested;
    }


    /**
     * Sets the timeRequested value for this ProcessSODetailV4.
     * 
     * @param timeRequested
     */
    public void setTimeRequested(java.lang.Integer timeRequested) {
        this.timeRequested = timeRequested;
    }


    /**
     * Gets the timeScheduledPick value for this ProcessSODetailV4.
     * 
     * @return timeScheduledPick
     */
    public java.lang.Integer getTimeScheduledPick() {
        return timeScheduledPick;
    }


    /**
     * Sets the timeScheduledPick value for this ProcessSODetailV4.
     * 
     * @param timeScheduledPick
     */
    public void setTimeScheduledPick(java.lang.Integer timeScheduledPick) {
        this.timeScheduledPick = timeScheduledPick;
    }


    /**
     * Gets the unitOfMeasureCodeTransaction value for this ProcessSODetailV4.
     * 
     * @return unitOfMeasureCodeTransaction
     */
    public java.lang.String getUnitOfMeasureCodeTransaction() {
        return unitOfMeasureCodeTransaction;
    }


    /**
     * Sets the unitOfMeasureCodeTransaction value for this ProcessSODetailV4.
     * 
     * @param unitOfMeasureCodeTransaction
     */
    public void setUnitOfMeasureCodeTransaction(java.lang.String unitOfMeasureCodeTransaction) {
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }


    /**
     * Gets the userReservedData value for this ProcessSODetailV4.
     * 
     * @return userReservedData
     */
    public JP420000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this ProcessSODetailV4.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP420000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessSODetailV4)) return false;
        ProcessSODetailV4 other = (ProcessSODetailV4) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.agreementId==null && other.getAgreementId()==null) || 
             (this.agreementId!=null &&
              this.agreementId.equals(other.getAgreementId()))) &&
            ((this.agreementSupplement==null && other.getAgreementSupplement()==null) || 
             (this.agreementSupplement!=null &&
              this.agreementSupplement.equals(other.getAgreementSupplement()))) &&
            ((this.billing==null && other.getBilling()==null) || 
             (this.billing!=null &&
              this.billing.equals(other.getBilling()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.businessUnitDestination==null && other.getBusinessUnitDestination()==null) || 
             (this.businessUnitDestination!=null &&
              this.businessUnitDestination.equals(other.getBusinessUnitDestination()))) &&
            ((this.categoryCodesPurchasing==null && other.getCategoryCodesPurchasing()==null) || 
             (this.categoryCodesPurchasing!=null &&
              this.categoryCodesPurchasing.equals(other.getCategoryCodesPurchasing()))) &&
            ((this.categoryCodesSales==null && other.getCategoryCodesSales()==null) || 
             (this.categoryCodesSales!=null &&
              this.categoryCodesSales.equals(other.getCategoryCodesSales()))) &&
            ((this.customerPO==null && other.getCustomerPO()==null) || 
             (this.customerPO!=null &&
              this.customerPO.equals(other.getCustomerPO()))) &&
            ((this.dateCancel==null && other.getDateCancel()==null) || 
             (this.dateCancel!=null &&
              this.dateCancel.equals(other.getDateCancel()))) &&
            ((this.datePromisedDelivery==null && other.getDatePromisedDelivery()==null) || 
             (this.datePromisedDelivery!=null &&
              this.datePromisedDelivery.equals(other.getDatePromisedDelivery()))) &&
            ((this.datePromisedOriginal==null && other.getDatePromisedOriginal()==null) || 
             (this.datePromisedOriginal!=null &&
              this.datePromisedOriginal.equals(other.getDatePromisedOriginal()))) &&
            ((this.datePromisedShip==null && other.getDatePromisedShip()==null) || 
             (this.datePromisedShip!=null &&
              this.datePromisedShip.equals(other.getDatePromisedShip()))) &&
            ((this.dateRequested==null && other.getDateRequested()==null) || 
             (this.dateRequested!=null &&
              this.dateRequested.equals(other.getDateRequested()))) &&
            ((this.dateScheduledPick==null && other.getDateScheduledPick()==null) || 
             (this.dateScheduledPick!=null &&
              this.dateScheduledPick.equals(other.getDateScheduledPick()))) &&
            ((this.documentLineNumber==null && other.getDocumentLineNumber()==null) || 
             (this.documentLineNumber!=null &&
              this.documentLineNumber.equals(other.getDocumentLineNumber()))) &&
            ((this.dutyStatusCode==null && other.getDutyStatusCode()==null) || 
             (this.dutyStatusCode!=null &&
              this.dutyStatusCode.equals(other.getDutyStatusCode()))) &&
            ((this.endUseCode==null && other.getEndUseCode()==null) || 
             (this.endUseCode!=null &&
              this.endUseCode.equals(other.getEndUseCode()))) &&
            ((this.lineOfBusinessCode==null && other.getLineOfBusinessCode()==null) || 
             (this.lineOfBusinessCode!=null &&
              this.lineOfBusinessCode.equals(other.getLineOfBusinessCode()))) &&
            ((this.lineTypeCode==null && other.getLineTypeCode()==null) || 
             (this.lineTypeCode!=null &&
              this.lineTypeCode.equals(other.getLineTypeCode()))) &&
            ((this.opportunityId==null && other.getOpportunityId()==null) || 
             (this.opportunityId!=null &&
              this.opportunityId.equals(other.getOpportunityId()))) &&
            ((this.originalOrder==null && other.getOriginalOrder()==null) || 
             (this.originalOrder!=null &&
              this.originalOrder.equals(other.getOriginalOrder()))) &&
            ((this.priorityCode==null && other.getPriorityCode()==null) || 
             (this.priorityCode!=null &&
              this.priorityCode.equals(other.getPriorityCode()))) &&
            ((this.processing==null && other.getProcessing()==null) || 
             (this.processing!=null &&
              this.processing.equals(other.getProcessing()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              this.quantityBackOrdered.equals(other.getQuantityBackOrdered()))) &&
            ((this.quantityCanceled==null && other.getQuantityCanceled()==null) || 
             (this.quantityCanceled!=null &&
              this.quantityCanceled.equals(other.getQuantityCanceled()))) &&
            ((this.quantityOrdered==null && other.getQuantityOrdered()==null) || 
             (this.quantityOrdered!=null &&
              this.quantityOrdered.equals(other.getQuantityOrdered()))) &&
            ((this.quantityShippable==null && other.getQuantityShippable()==null) || 
             (this.quantityShippable!=null &&
              this.quantityShippable.equals(other.getQuantityShippable()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.relatedOrder==null && other.getRelatedOrder()==null) || 
             (this.relatedOrder!=null &&
              this.relatedOrder.equals(other.getRelatedOrder()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.statusCodeLast==null && other.getStatusCodeLast()==null) || 
             (this.statusCodeLast!=null &&
              this.statusCodeLast.equals(other.getStatusCodeLast()))) &&
            ((this.statusCodeNext==null && other.getStatusCodeNext()==null) || 
             (this.statusCodeNext!=null &&
              this.statusCodeNext.equals(other.getStatusCodeNext()))) &&
            ((this.supplier==null && other.getSupplier()==null) || 
             (this.supplier!=null &&
              this.supplier.equals(other.getSupplier()))) &&
            ((this.timePromisedDelivery==null && other.getTimePromisedDelivery()==null) || 
             (this.timePromisedDelivery!=null &&
              this.timePromisedDelivery.equals(other.getTimePromisedDelivery()))) &&
            ((this.timePromisedOriginal==null && other.getTimePromisedOriginal()==null) || 
             (this.timePromisedOriginal!=null &&
              this.timePromisedOriginal.equals(other.getTimePromisedOriginal()))) &&
            ((this.timePromisedShip==null && other.getTimePromisedShip()==null) || 
             (this.timePromisedShip!=null &&
              this.timePromisedShip.equals(other.getTimePromisedShip()))) &&
            ((this.timeRequested==null && other.getTimeRequested()==null) || 
             (this.timeRequested!=null &&
              this.timeRequested.equals(other.getTimeRequested()))) &&
            ((this.timeScheduledPick==null && other.getTimeScheduledPick()==null) || 
             (this.timeScheduledPick!=null &&
              this.timeScheduledPick.equals(other.getTimeScheduledPick()))) &&
            ((this.unitOfMeasureCodeTransaction==null && other.getUnitOfMeasureCodeTransaction()==null) || 
             (this.unitOfMeasureCodeTransaction!=null &&
              this.unitOfMeasureCodeTransaction.equals(other.getUnitOfMeasureCodeTransaction()))) &&
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
        if (getAgreementId() != null) {
            _hashCode += getAgreementId().hashCode();
        }
        if (getAgreementSupplement() != null) {
            _hashCode += getAgreementSupplement().hashCode();
        }
        if (getBilling() != null) {
            _hashCode += getBilling().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getBusinessUnitDestination() != null) {
            _hashCode += getBusinessUnitDestination().hashCode();
        }
        if (getCategoryCodesPurchasing() != null) {
            _hashCode += getCategoryCodesPurchasing().hashCode();
        }
        if (getCategoryCodesSales() != null) {
            _hashCode += getCategoryCodesSales().hashCode();
        }
        if (getCustomerPO() != null) {
            _hashCode += getCustomerPO().hashCode();
        }
        if (getDateCancel() != null) {
            _hashCode += getDateCancel().hashCode();
        }
        if (getDatePromisedDelivery() != null) {
            _hashCode += getDatePromisedDelivery().hashCode();
        }
        if (getDatePromisedOriginal() != null) {
            _hashCode += getDatePromisedOriginal().hashCode();
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
        if (getDocumentLineNumber() != null) {
            _hashCode += getDocumentLineNumber().hashCode();
        }
        if (getDutyStatusCode() != null) {
            _hashCode += getDutyStatusCode().hashCode();
        }
        if (getEndUseCode() != null) {
            _hashCode += getEndUseCode().hashCode();
        }
        if (getLineOfBusinessCode() != null) {
            _hashCode += getLineOfBusinessCode().hashCode();
        }
        if (getLineTypeCode() != null) {
            _hashCode += getLineTypeCode().hashCode();
        }
        if (getOpportunityId() != null) {
            _hashCode += getOpportunityId().hashCode();
        }
        if (getOriginalOrder() != null) {
            _hashCode += getOriginalOrder().hashCode();
        }
        if (getPriorityCode() != null) {
            _hashCode += getPriorityCode().hashCode();
        }
        if (getProcessing() != null) {
            _hashCode += getProcessing().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getQuantityBackOrdered() != null) {
            _hashCode += getQuantityBackOrdered().hashCode();
        }
        if (getQuantityCanceled() != null) {
            _hashCode += getQuantityCanceled().hashCode();
        }
        if (getQuantityOrdered() != null) {
            _hashCode += getQuantityOrdered().hashCode();
        }
        if (getQuantityShippable() != null) {
            _hashCode += getQuantityShippable().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getRelatedOrder() != null) {
            _hashCode += getRelatedOrder().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getStatusCodeLast() != null) {
            _hashCode += getStatusCodeLast().hashCode();
        }
        if (getStatusCodeNext() != null) {
            _hashCode += getStatusCodeNext().hashCode();
        }
        if (getSupplier() != null) {
            _hashCode += getSupplier().hashCode();
        }
        if (getTimePromisedDelivery() != null) {
            _hashCode += getTimePromisedDelivery().hashCode();
        }
        if (getTimePromisedOriginal() != null) {
            _hashCode += getTimePromisedOriginal().hashCode();
        }
        if (getTimePromisedShip() != null) {
            _hashCode += getTimePromisedShip().hashCode();
        }
        if (getTimeRequested() != null) {
            _hashCode += getTimeRequested().hashCode();
        }
        if (getTimeScheduledPick() != null) {
            _hashCode += getTimeScheduledPick().hashCode();
        }
        if (getUnitOfMeasureCodeTransaction() != null) {
            _hashCode += getUnitOfMeasureCodeTransaction().hashCode();
        }
        if (getUserReservedData() != null) {
            _hashCode += getUserReservedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessSODetailV4.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailV4"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementSupplement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreementSupplement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailBillingV2"));
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
        elemField.setFieldName("businessUnitDestination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnitDestination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryCodesPurchasing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryCodesPurchasing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "categoryCodesPurchasing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryCodesSales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryCodesSales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "categoryCodesSales"));
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
        elemField.setFieldName("datePromisedDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePromisedDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePromisedOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePromisedOriginal"));
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
        elemField.setFieldName("documentLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutyStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dutyStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endUseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endUseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusinessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineOfBusinessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opportunityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOOriginalOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priorityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailProcessing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailProductV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCanceled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityCanceled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityShippable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityShippable"));
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
        elemField.setFieldName("relatedOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "relatedOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCodeLast");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCodeLast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCodeNext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCodeNext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
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
        elemField.setFieldName("timePromisedOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timePromisedOriginal"));
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
        elemField.setFieldName("unitOfMeasureCodeTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodeTransaction"));
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
