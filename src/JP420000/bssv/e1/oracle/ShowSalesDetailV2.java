/**
 * ShowSalesDetailV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ShowSalesDetailV2  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String agreementId;

    private java.lang.Integer agreementSupplement;

    private java.lang.String businessUnit;

    private JP420000.bssv.e1.oracle.CategoryCodesPurchasing categoryCodesPurchasing;

    private JP420000.bssv.e1.oracle.CategoryCodesSales categoryCodesSales;

    private java.lang.String company;

    private java.math.BigDecimal costExtendedDomestic;

    private java.math.BigDecimal costExtendedForeign;

    private java.math.BigDecimal costUnitPurchasingDomestic;

    private java.math.BigDecimal costUnitPurchasingForeign;

    private java.lang.String currencyCodeFrom;

    private java.lang.String customerPO;

    private java.util.Calendar dateAccounting;

    private java.util.Calendar dateActualShip;

    private java.util.Calendar dateCancel;

    private java.util.Calendar dateInvoice;

    private java.util.Calendar dateOrdered;

    private java.util.Calendar datePromisedDelivery;

    private java.util.Calendar datePromisedOriginal;

    private java.util.Calendar datePromisedShip;

    private java.util.Calendar dateRequested;

    private java.util.Calendar dateScheduledPick;

    private JP420000.bssv.e1.oracle.Entity deliverTo;

    private java.lang.Integer deliveryId;

    private JP420000.bssv.e1.oracle.Document document;

    private java.math.BigDecimal documentLineNumber;

    private java.lang.String dutyStatusCode;

    private java.lang.String endUseCode;

    private java.lang.Integer entityIdSupplier;

    private JP420000.bssv.e1.oracle.ShowSalesDetailLineBillingV2 lineBilling;

    private java.lang.String lineOfBusinessCode;

    private java.lang.String lineTypeCode;

    private JP420000.bssv.e1.oracle.ShowSalesDetailOriginalOrder originalOrder;

    private JP420000.bssv.e1.oracle.Entity parent;

    private java.lang.Integer pickSlipId;

    private JP420000.bssv.e1.oracle.ShowSalesDetailProduct product;

    private java.math.BigDecimal quantityBackOrdered;

    private java.math.BigDecimal quantityCanceled;

    private java.math.BigDecimal quantityOrdered;

    private java.math.BigDecimal quantityShippable;

    private java.math.BigDecimal rateExchangeOverride;

    private java.lang.String reference;

    private JP420000.bssv.e1.oracle.RelatedOrder relatedOrder;

    private JP420000.bssv.e1.oracle.Entity shipTo;

    private java.lang.Integer shipmentId;

    private JP420000.bssv.e1.oracle.Entity soldTo;

    private java.lang.String statusCodeLast;

    private java.lang.String statusCodeNext;

    private java.lang.Integer timePromisedDelivery;

    private java.lang.Integer timePromisedOriginal;

    private java.lang.Integer timePromisedShip;

    private java.lang.Integer timeRequested;

    private java.lang.Integer timeScheduledPick;

    private java.lang.String unitOfMeasureCodeTransaction;

    private JP420000.bssv.e1.oracle.UserReservedData userReservedData;

    public ShowSalesDetailV2() {
    }

    public ShowSalesDetailV2(
           java.lang.String agreementId,
           java.lang.Integer agreementSupplement,
           java.lang.String businessUnit,
           JP420000.bssv.e1.oracle.CategoryCodesPurchasing categoryCodesPurchasing,
           JP420000.bssv.e1.oracle.CategoryCodesSales categoryCodesSales,
           java.lang.String company,
           java.math.BigDecimal costExtendedDomestic,
           java.math.BigDecimal costExtendedForeign,
           java.math.BigDecimal costUnitPurchasingDomestic,
           java.math.BigDecimal costUnitPurchasingForeign,
           java.lang.String currencyCodeFrom,
           java.lang.String customerPO,
           java.util.Calendar dateAccounting,
           java.util.Calendar dateActualShip,
           java.util.Calendar dateCancel,
           java.util.Calendar dateInvoice,
           java.util.Calendar dateOrdered,
           java.util.Calendar datePromisedDelivery,
           java.util.Calendar datePromisedOriginal,
           java.util.Calendar datePromisedShip,
           java.util.Calendar dateRequested,
           java.util.Calendar dateScheduledPick,
           JP420000.bssv.e1.oracle.Entity deliverTo,
           java.lang.Integer deliveryId,
           JP420000.bssv.e1.oracle.Document document,
           java.math.BigDecimal documentLineNumber,
           java.lang.String dutyStatusCode,
           java.lang.String endUseCode,
           java.lang.Integer entityIdSupplier,
           JP420000.bssv.e1.oracle.ShowSalesDetailLineBillingV2 lineBilling,
           java.lang.String lineOfBusinessCode,
           java.lang.String lineTypeCode,
           JP420000.bssv.e1.oracle.ShowSalesDetailOriginalOrder originalOrder,
           JP420000.bssv.e1.oracle.Entity parent,
           java.lang.Integer pickSlipId,
           JP420000.bssv.e1.oracle.ShowSalesDetailProduct product,
           java.math.BigDecimal quantityBackOrdered,
           java.math.BigDecimal quantityCanceled,
           java.math.BigDecimal quantityOrdered,
           java.math.BigDecimal quantityShippable,
           java.math.BigDecimal rateExchangeOverride,
           java.lang.String reference,
           JP420000.bssv.e1.oracle.RelatedOrder relatedOrder,
           JP420000.bssv.e1.oracle.Entity shipTo,
           java.lang.Integer shipmentId,
           JP420000.bssv.e1.oracle.Entity soldTo,
           java.lang.String statusCodeLast,
           java.lang.String statusCodeNext,
           java.lang.Integer timePromisedDelivery,
           java.lang.Integer timePromisedOriginal,
           java.lang.Integer timePromisedShip,
           java.lang.Integer timeRequested,
           java.lang.Integer timeScheduledPick,
           java.lang.String unitOfMeasureCodeTransaction,
           JP420000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.agreementId = agreementId;
        this.agreementSupplement = agreementSupplement;
        this.businessUnit = businessUnit;
        this.categoryCodesPurchasing = categoryCodesPurchasing;
        this.categoryCodesSales = categoryCodesSales;
        this.company = company;
        this.costExtendedDomestic = costExtendedDomestic;
        this.costExtendedForeign = costExtendedForeign;
        this.costUnitPurchasingDomestic = costUnitPurchasingDomestic;
        this.costUnitPurchasingForeign = costUnitPurchasingForeign;
        this.currencyCodeFrom = currencyCodeFrom;
        this.customerPO = customerPO;
        this.dateAccounting = dateAccounting;
        this.dateActualShip = dateActualShip;
        this.dateCancel = dateCancel;
        this.dateInvoice = dateInvoice;
        this.dateOrdered = dateOrdered;
        this.datePromisedDelivery = datePromisedDelivery;
        this.datePromisedOriginal = datePromisedOriginal;
        this.datePromisedShip = datePromisedShip;
        this.dateRequested = dateRequested;
        this.dateScheduledPick = dateScheduledPick;
        this.deliverTo = deliverTo;
        this.deliveryId = deliveryId;
        this.document = document;
        this.documentLineNumber = documentLineNumber;
        this.dutyStatusCode = dutyStatusCode;
        this.endUseCode = endUseCode;
        this.entityIdSupplier = entityIdSupplier;
        this.lineBilling = lineBilling;
        this.lineOfBusinessCode = lineOfBusinessCode;
        this.lineTypeCode = lineTypeCode;
        this.originalOrder = originalOrder;
        this.parent = parent;
        this.pickSlipId = pickSlipId;
        this.product = product;
        this.quantityBackOrdered = quantityBackOrdered;
        this.quantityCanceled = quantityCanceled;
        this.quantityOrdered = quantityOrdered;
        this.quantityShippable = quantityShippable;
        this.rateExchangeOverride = rateExchangeOverride;
        this.reference = reference;
        this.relatedOrder = relatedOrder;
        this.shipTo = shipTo;
        this.shipmentId = shipmentId;
        this.soldTo = soldTo;
        this.statusCodeLast = statusCodeLast;
        this.statusCodeNext = statusCodeNext;
        this.timePromisedDelivery = timePromisedDelivery;
        this.timePromisedOriginal = timePromisedOriginal;
        this.timePromisedShip = timePromisedShip;
        this.timeRequested = timeRequested;
        this.timeScheduledPick = timeScheduledPick;
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the agreementId value for this ShowSalesDetailV2.
     * 
     * @return agreementId
     */
    public java.lang.String getAgreementId() {
        return agreementId;
    }


    /**
     * Sets the agreementId value for this ShowSalesDetailV2.
     * 
     * @param agreementId
     */
    public void setAgreementId(java.lang.String agreementId) {
        this.agreementId = agreementId;
    }


    /**
     * Gets the agreementSupplement value for this ShowSalesDetailV2.
     * 
     * @return agreementSupplement
     */
    public java.lang.Integer getAgreementSupplement() {
        return agreementSupplement;
    }


    /**
     * Sets the agreementSupplement value for this ShowSalesDetailV2.
     * 
     * @param agreementSupplement
     */
    public void setAgreementSupplement(java.lang.Integer agreementSupplement) {
        this.agreementSupplement = agreementSupplement;
    }


    /**
     * Gets the businessUnit value for this ShowSalesDetailV2.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this ShowSalesDetailV2.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the categoryCodesPurchasing value for this ShowSalesDetailV2.
     * 
     * @return categoryCodesPurchasing
     */
    public JP420000.bssv.e1.oracle.CategoryCodesPurchasing getCategoryCodesPurchasing() {
        return categoryCodesPurchasing;
    }


    /**
     * Sets the categoryCodesPurchasing value for this ShowSalesDetailV2.
     * 
     * @param categoryCodesPurchasing
     */
    public void setCategoryCodesPurchasing(JP420000.bssv.e1.oracle.CategoryCodesPurchasing categoryCodesPurchasing) {
        this.categoryCodesPurchasing = categoryCodesPurchasing;
    }


    /**
     * Gets the categoryCodesSales value for this ShowSalesDetailV2.
     * 
     * @return categoryCodesSales
     */
    public JP420000.bssv.e1.oracle.CategoryCodesSales getCategoryCodesSales() {
        return categoryCodesSales;
    }


    /**
     * Sets the categoryCodesSales value for this ShowSalesDetailV2.
     * 
     * @param categoryCodesSales
     */
    public void setCategoryCodesSales(JP420000.bssv.e1.oracle.CategoryCodesSales categoryCodesSales) {
        this.categoryCodesSales = categoryCodesSales;
    }


    /**
     * Gets the company value for this ShowSalesDetailV2.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ShowSalesDetailV2.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the costExtendedDomestic value for this ShowSalesDetailV2.
     * 
     * @return costExtendedDomestic
     */
    public java.math.BigDecimal getCostExtendedDomestic() {
        return costExtendedDomestic;
    }


    /**
     * Sets the costExtendedDomestic value for this ShowSalesDetailV2.
     * 
     * @param costExtendedDomestic
     */
    public void setCostExtendedDomestic(java.math.BigDecimal costExtendedDomestic) {
        this.costExtendedDomestic = costExtendedDomestic;
    }


    /**
     * Gets the costExtendedForeign value for this ShowSalesDetailV2.
     * 
     * @return costExtendedForeign
     */
    public java.math.BigDecimal getCostExtendedForeign() {
        return costExtendedForeign;
    }


    /**
     * Sets the costExtendedForeign value for this ShowSalesDetailV2.
     * 
     * @param costExtendedForeign
     */
    public void setCostExtendedForeign(java.math.BigDecimal costExtendedForeign) {
        this.costExtendedForeign = costExtendedForeign;
    }


    /**
     * Gets the costUnitPurchasingDomestic value for this ShowSalesDetailV2.
     * 
     * @return costUnitPurchasingDomestic
     */
    public java.math.BigDecimal getCostUnitPurchasingDomestic() {
        return costUnitPurchasingDomestic;
    }


    /**
     * Sets the costUnitPurchasingDomestic value for this ShowSalesDetailV2.
     * 
     * @param costUnitPurchasingDomestic
     */
    public void setCostUnitPurchasingDomestic(java.math.BigDecimal costUnitPurchasingDomestic) {
        this.costUnitPurchasingDomestic = costUnitPurchasingDomestic;
    }


    /**
     * Gets the costUnitPurchasingForeign value for this ShowSalesDetailV2.
     * 
     * @return costUnitPurchasingForeign
     */
    public java.math.BigDecimal getCostUnitPurchasingForeign() {
        return costUnitPurchasingForeign;
    }


    /**
     * Sets the costUnitPurchasingForeign value for this ShowSalesDetailV2.
     * 
     * @param costUnitPurchasingForeign
     */
    public void setCostUnitPurchasingForeign(java.math.BigDecimal costUnitPurchasingForeign) {
        this.costUnitPurchasingForeign = costUnitPurchasingForeign;
    }


    /**
     * Gets the currencyCodeFrom value for this ShowSalesDetailV2.
     * 
     * @return currencyCodeFrom
     */
    public java.lang.String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }


    /**
     * Sets the currencyCodeFrom value for this ShowSalesDetailV2.
     * 
     * @param currencyCodeFrom
     */
    public void setCurrencyCodeFrom(java.lang.String currencyCodeFrom) {
        this.currencyCodeFrom = currencyCodeFrom;
    }


    /**
     * Gets the customerPO value for this ShowSalesDetailV2.
     * 
     * @return customerPO
     */
    public java.lang.String getCustomerPO() {
        return customerPO;
    }


    /**
     * Sets the customerPO value for this ShowSalesDetailV2.
     * 
     * @param customerPO
     */
    public void setCustomerPO(java.lang.String customerPO) {
        this.customerPO = customerPO;
    }


    /**
     * Gets the dateAccounting value for this ShowSalesDetailV2.
     * 
     * @return dateAccounting
     */
    public java.util.Calendar getDateAccounting() {
        return dateAccounting;
    }


    /**
     * Sets the dateAccounting value for this ShowSalesDetailV2.
     * 
     * @param dateAccounting
     */
    public void setDateAccounting(java.util.Calendar dateAccounting) {
        this.dateAccounting = dateAccounting;
    }


    /**
     * Gets the dateActualShip value for this ShowSalesDetailV2.
     * 
     * @return dateActualShip
     */
    public java.util.Calendar getDateActualShip() {
        return dateActualShip;
    }


    /**
     * Sets the dateActualShip value for this ShowSalesDetailV2.
     * 
     * @param dateActualShip
     */
    public void setDateActualShip(java.util.Calendar dateActualShip) {
        this.dateActualShip = dateActualShip;
    }


    /**
     * Gets the dateCancel value for this ShowSalesDetailV2.
     * 
     * @return dateCancel
     */
    public java.util.Calendar getDateCancel() {
        return dateCancel;
    }


    /**
     * Sets the dateCancel value for this ShowSalesDetailV2.
     * 
     * @param dateCancel
     */
    public void setDateCancel(java.util.Calendar dateCancel) {
        this.dateCancel = dateCancel;
    }


    /**
     * Gets the dateInvoice value for this ShowSalesDetailV2.
     * 
     * @return dateInvoice
     */
    public java.util.Calendar getDateInvoice() {
        return dateInvoice;
    }


    /**
     * Sets the dateInvoice value for this ShowSalesDetailV2.
     * 
     * @param dateInvoice
     */
    public void setDateInvoice(java.util.Calendar dateInvoice) {
        this.dateInvoice = dateInvoice;
    }


    /**
     * Gets the dateOrdered value for this ShowSalesDetailV2.
     * 
     * @return dateOrdered
     */
    public java.util.Calendar getDateOrdered() {
        return dateOrdered;
    }


    /**
     * Sets the dateOrdered value for this ShowSalesDetailV2.
     * 
     * @param dateOrdered
     */
    public void setDateOrdered(java.util.Calendar dateOrdered) {
        this.dateOrdered = dateOrdered;
    }


    /**
     * Gets the datePromisedDelivery value for this ShowSalesDetailV2.
     * 
     * @return datePromisedDelivery
     */
    public java.util.Calendar getDatePromisedDelivery() {
        return datePromisedDelivery;
    }


    /**
     * Sets the datePromisedDelivery value for this ShowSalesDetailV2.
     * 
     * @param datePromisedDelivery
     */
    public void setDatePromisedDelivery(java.util.Calendar datePromisedDelivery) {
        this.datePromisedDelivery = datePromisedDelivery;
    }


    /**
     * Gets the datePromisedOriginal value for this ShowSalesDetailV2.
     * 
     * @return datePromisedOriginal
     */
    public java.util.Calendar getDatePromisedOriginal() {
        return datePromisedOriginal;
    }


    /**
     * Sets the datePromisedOriginal value for this ShowSalesDetailV2.
     * 
     * @param datePromisedOriginal
     */
    public void setDatePromisedOriginal(java.util.Calendar datePromisedOriginal) {
        this.datePromisedOriginal = datePromisedOriginal;
    }


    /**
     * Gets the datePromisedShip value for this ShowSalesDetailV2.
     * 
     * @return datePromisedShip
     */
    public java.util.Calendar getDatePromisedShip() {
        return datePromisedShip;
    }


    /**
     * Sets the datePromisedShip value for this ShowSalesDetailV2.
     * 
     * @param datePromisedShip
     */
    public void setDatePromisedShip(java.util.Calendar datePromisedShip) {
        this.datePromisedShip = datePromisedShip;
    }


    /**
     * Gets the dateRequested value for this ShowSalesDetailV2.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this ShowSalesDetailV2.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the dateScheduledPick value for this ShowSalesDetailV2.
     * 
     * @return dateScheduledPick
     */
    public java.util.Calendar getDateScheduledPick() {
        return dateScheduledPick;
    }


    /**
     * Sets the dateScheduledPick value for this ShowSalesDetailV2.
     * 
     * @param dateScheduledPick
     */
    public void setDateScheduledPick(java.util.Calendar dateScheduledPick) {
        this.dateScheduledPick = dateScheduledPick;
    }


    /**
     * Gets the deliverTo value for this ShowSalesDetailV2.
     * 
     * @return deliverTo
     */
    public JP420000.bssv.e1.oracle.Entity getDeliverTo() {
        return deliverTo;
    }


    /**
     * Sets the deliverTo value for this ShowSalesDetailV2.
     * 
     * @param deliverTo
     */
    public void setDeliverTo(JP420000.bssv.e1.oracle.Entity deliverTo) {
        this.deliverTo = deliverTo;
    }


    /**
     * Gets the deliveryId value for this ShowSalesDetailV2.
     * 
     * @return deliveryId
     */
    public java.lang.Integer getDeliveryId() {
        return deliveryId;
    }


    /**
     * Sets the deliveryId value for this ShowSalesDetailV2.
     * 
     * @param deliveryId
     */
    public void setDeliveryId(java.lang.Integer deliveryId) {
        this.deliveryId = deliveryId;
    }


    /**
     * Gets the document value for this ShowSalesDetailV2.
     * 
     * @return document
     */
    public JP420000.bssv.e1.oracle.Document getDocument() {
        return document;
    }


    /**
     * Sets the document value for this ShowSalesDetailV2.
     * 
     * @param document
     */
    public void setDocument(JP420000.bssv.e1.oracle.Document document) {
        this.document = document;
    }


    /**
     * Gets the documentLineNumber value for this ShowSalesDetailV2.
     * 
     * @return documentLineNumber
     */
    public java.math.BigDecimal getDocumentLineNumber() {
        return documentLineNumber;
    }


    /**
     * Sets the documentLineNumber value for this ShowSalesDetailV2.
     * 
     * @param documentLineNumber
     */
    public void setDocumentLineNumber(java.math.BigDecimal documentLineNumber) {
        this.documentLineNumber = documentLineNumber;
    }


    /**
     * Gets the dutyStatusCode value for this ShowSalesDetailV2.
     * 
     * @return dutyStatusCode
     */
    public java.lang.String getDutyStatusCode() {
        return dutyStatusCode;
    }


    /**
     * Sets the dutyStatusCode value for this ShowSalesDetailV2.
     * 
     * @param dutyStatusCode
     */
    public void setDutyStatusCode(java.lang.String dutyStatusCode) {
        this.dutyStatusCode = dutyStatusCode;
    }


    /**
     * Gets the endUseCode value for this ShowSalesDetailV2.
     * 
     * @return endUseCode
     */
    public java.lang.String getEndUseCode() {
        return endUseCode;
    }


    /**
     * Sets the endUseCode value for this ShowSalesDetailV2.
     * 
     * @param endUseCode
     */
    public void setEndUseCode(java.lang.String endUseCode) {
        this.endUseCode = endUseCode;
    }


    /**
     * Gets the entityIdSupplier value for this ShowSalesDetailV2.
     * 
     * @return entityIdSupplier
     */
    public java.lang.Integer getEntityIdSupplier() {
        return entityIdSupplier;
    }


    /**
     * Sets the entityIdSupplier value for this ShowSalesDetailV2.
     * 
     * @param entityIdSupplier
     */
    public void setEntityIdSupplier(java.lang.Integer entityIdSupplier) {
        this.entityIdSupplier = entityIdSupplier;
    }


    /**
     * Gets the lineBilling value for this ShowSalesDetailV2.
     * 
     * @return lineBilling
     */
    public JP420000.bssv.e1.oracle.ShowSalesDetailLineBillingV2 getLineBilling() {
        return lineBilling;
    }


    /**
     * Sets the lineBilling value for this ShowSalesDetailV2.
     * 
     * @param lineBilling
     */
    public void setLineBilling(JP420000.bssv.e1.oracle.ShowSalesDetailLineBillingV2 lineBilling) {
        this.lineBilling = lineBilling;
    }


    /**
     * Gets the lineOfBusinessCode value for this ShowSalesDetailV2.
     * 
     * @return lineOfBusinessCode
     */
    public java.lang.String getLineOfBusinessCode() {
        return lineOfBusinessCode;
    }


    /**
     * Sets the lineOfBusinessCode value for this ShowSalesDetailV2.
     * 
     * @param lineOfBusinessCode
     */
    public void setLineOfBusinessCode(java.lang.String lineOfBusinessCode) {
        this.lineOfBusinessCode = lineOfBusinessCode;
    }


    /**
     * Gets the lineTypeCode value for this ShowSalesDetailV2.
     * 
     * @return lineTypeCode
     */
    public java.lang.String getLineTypeCode() {
        return lineTypeCode;
    }


    /**
     * Sets the lineTypeCode value for this ShowSalesDetailV2.
     * 
     * @param lineTypeCode
     */
    public void setLineTypeCode(java.lang.String lineTypeCode) {
        this.lineTypeCode = lineTypeCode;
    }


    /**
     * Gets the originalOrder value for this ShowSalesDetailV2.
     * 
     * @return originalOrder
     */
    public JP420000.bssv.e1.oracle.ShowSalesDetailOriginalOrder getOriginalOrder() {
        return originalOrder;
    }


    /**
     * Sets the originalOrder value for this ShowSalesDetailV2.
     * 
     * @param originalOrder
     */
    public void setOriginalOrder(JP420000.bssv.e1.oracle.ShowSalesDetailOriginalOrder originalOrder) {
        this.originalOrder = originalOrder;
    }


    /**
     * Gets the parent value for this ShowSalesDetailV2.
     * 
     * @return parent
     */
    public JP420000.bssv.e1.oracle.Entity getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ShowSalesDetailV2.
     * 
     * @param parent
     */
    public void setParent(JP420000.bssv.e1.oracle.Entity parent) {
        this.parent = parent;
    }


    /**
     * Gets the pickSlipId value for this ShowSalesDetailV2.
     * 
     * @return pickSlipId
     */
    public java.lang.Integer getPickSlipId() {
        return pickSlipId;
    }


    /**
     * Sets the pickSlipId value for this ShowSalesDetailV2.
     * 
     * @param pickSlipId
     */
    public void setPickSlipId(java.lang.Integer pickSlipId) {
        this.pickSlipId = pickSlipId;
    }


    /**
     * Gets the product value for this ShowSalesDetailV2.
     * 
     * @return product
     */
    public JP420000.bssv.e1.oracle.ShowSalesDetailProduct getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ShowSalesDetailV2.
     * 
     * @param product
     */
    public void setProduct(JP420000.bssv.e1.oracle.ShowSalesDetailProduct product) {
        this.product = product;
    }


    /**
     * Gets the quantityBackOrdered value for this ShowSalesDetailV2.
     * 
     * @return quantityBackOrdered
     */
    public java.math.BigDecimal getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this ShowSalesDetailV2.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(java.math.BigDecimal quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the quantityCanceled value for this ShowSalesDetailV2.
     * 
     * @return quantityCanceled
     */
    public java.math.BigDecimal getQuantityCanceled() {
        return quantityCanceled;
    }


    /**
     * Sets the quantityCanceled value for this ShowSalesDetailV2.
     * 
     * @param quantityCanceled
     */
    public void setQuantityCanceled(java.math.BigDecimal quantityCanceled) {
        this.quantityCanceled = quantityCanceled;
    }


    /**
     * Gets the quantityOrdered value for this ShowSalesDetailV2.
     * 
     * @return quantityOrdered
     */
    public java.math.BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }


    /**
     * Sets the quantityOrdered value for this ShowSalesDetailV2.
     * 
     * @param quantityOrdered
     */
    public void setQuantityOrdered(java.math.BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }


    /**
     * Gets the quantityShippable value for this ShowSalesDetailV2.
     * 
     * @return quantityShippable
     */
    public java.math.BigDecimal getQuantityShippable() {
        return quantityShippable;
    }


    /**
     * Sets the quantityShippable value for this ShowSalesDetailV2.
     * 
     * @param quantityShippable
     */
    public void setQuantityShippable(java.math.BigDecimal quantityShippable) {
        this.quantityShippable = quantityShippable;
    }


    /**
     * Gets the rateExchangeOverride value for this ShowSalesDetailV2.
     * 
     * @return rateExchangeOverride
     */
    public java.math.BigDecimal getRateExchangeOverride() {
        return rateExchangeOverride;
    }


    /**
     * Sets the rateExchangeOverride value for this ShowSalesDetailV2.
     * 
     * @param rateExchangeOverride
     */
    public void setRateExchangeOverride(java.math.BigDecimal rateExchangeOverride) {
        this.rateExchangeOverride = rateExchangeOverride;
    }


    /**
     * Gets the reference value for this ShowSalesDetailV2.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this ShowSalesDetailV2.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the relatedOrder value for this ShowSalesDetailV2.
     * 
     * @return relatedOrder
     */
    public JP420000.bssv.e1.oracle.RelatedOrder getRelatedOrder() {
        return relatedOrder;
    }


    /**
     * Sets the relatedOrder value for this ShowSalesDetailV2.
     * 
     * @param relatedOrder
     */
    public void setRelatedOrder(JP420000.bssv.e1.oracle.RelatedOrder relatedOrder) {
        this.relatedOrder = relatedOrder;
    }


    /**
     * Gets the shipTo value for this ShowSalesDetailV2.
     * 
     * @return shipTo
     */
    public JP420000.bssv.e1.oracle.Entity getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this ShowSalesDetailV2.
     * 
     * @param shipTo
     */
    public void setShipTo(JP420000.bssv.e1.oracle.Entity shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the shipmentId value for this ShowSalesDetailV2.
     * 
     * @return shipmentId
     */
    public java.lang.Integer getShipmentId() {
        return shipmentId;
    }


    /**
     * Sets the shipmentId value for this ShowSalesDetailV2.
     * 
     * @param shipmentId
     */
    public void setShipmentId(java.lang.Integer shipmentId) {
        this.shipmentId = shipmentId;
    }


    /**
     * Gets the soldTo value for this ShowSalesDetailV2.
     * 
     * @return soldTo
     */
    public JP420000.bssv.e1.oracle.Entity getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this ShowSalesDetailV2.
     * 
     * @param soldTo
     */
    public void setSoldTo(JP420000.bssv.e1.oracle.Entity soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the statusCodeLast value for this ShowSalesDetailV2.
     * 
     * @return statusCodeLast
     */
    public java.lang.String getStatusCodeLast() {
        return statusCodeLast;
    }


    /**
     * Sets the statusCodeLast value for this ShowSalesDetailV2.
     * 
     * @param statusCodeLast
     */
    public void setStatusCodeLast(java.lang.String statusCodeLast) {
        this.statusCodeLast = statusCodeLast;
    }


    /**
     * Gets the statusCodeNext value for this ShowSalesDetailV2.
     * 
     * @return statusCodeNext
     */
    public java.lang.String getStatusCodeNext() {
        return statusCodeNext;
    }


    /**
     * Sets the statusCodeNext value for this ShowSalesDetailV2.
     * 
     * @param statusCodeNext
     */
    public void setStatusCodeNext(java.lang.String statusCodeNext) {
        this.statusCodeNext = statusCodeNext;
    }


    /**
     * Gets the timePromisedDelivery value for this ShowSalesDetailV2.
     * 
     * @return timePromisedDelivery
     */
    public java.lang.Integer getTimePromisedDelivery() {
        return timePromisedDelivery;
    }


    /**
     * Sets the timePromisedDelivery value for this ShowSalesDetailV2.
     * 
     * @param timePromisedDelivery
     */
    public void setTimePromisedDelivery(java.lang.Integer timePromisedDelivery) {
        this.timePromisedDelivery = timePromisedDelivery;
    }


    /**
     * Gets the timePromisedOriginal value for this ShowSalesDetailV2.
     * 
     * @return timePromisedOriginal
     */
    public java.lang.Integer getTimePromisedOriginal() {
        return timePromisedOriginal;
    }


    /**
     * Sets the timePromisedOriginal value for this ShowSalesDetailV2.
     * 
     * @param timePromisedOriginal
     */
    public void setTimePromisedOriginal(java.lang.Integer timePromisedOriginal) {
        this.timePromisedOriginal = timePromisedOriginal;
    }


    /**
     * Gets the timePromisedShip value for this ShowSalesDetailV2.
     * 
     * @return timePromisedShip
     */
    public java.lang.Integer getTimePromisedShip() {
        return timePromisedShip;
    }


    /**
     * Sets the timePromisedShip value for this ShowSalesDetailV2.
     * 
     * @param timePromisedShip
     */
    public void setTimePromisedShip(java.lang.Integer timePromisedShip) {
        this.timePromisedShip = timePromisedShip;
    }


    /**
     * Gets the timeRequested value for this ShowSalesDetailV2.
     * 
     * @return timeRequested
     */
    public java.lang.Integer getTimeRequested() {
        return timeRequested;
    }


    /**
     * Sets the timeRequested value for this ShowSalesDetailV2.
     * 
     * @param timeRequested
     */
    public void setTimeRequested(java.lang.Integer timeRequested) {
        this.timeRequested = timeRequested;
    }


    /**
     * Gets the timeScheduledPick value for this ShowSalesDetailV2.
     * 
     * @return timeScheduledPick
     */
    public java.lang.Integer getTimeScheduledPick() {
        return timeScheduledPick;
    }


    /**
     * Sets the timeScheduledPick value for this ShowSalesDetailV2.
     * 
     * @param timeScheduledPick
     */
    public void setTimeScheduledPick(java.lang.Integer timeScheduledPick) {
        this.timeScheduledPick = timeScheduledPick;
    }


    /**
     * Gets the unitOfMeasureCodeTransaction value for this ShowSalesDetailV2.
     * 
     * @return unitOfMeasureCodeTransaction
     */
    public java.lang.String getUnitOfMeasureCodeTransaction() {
        return unitOfMeasureCodeTransaction;
    }


    /**
     * Sets the unitOfMeasureCodeTransaction value for this ShowSalesDetailV2.
     * 
     * @param unitOfMeasureCodeTransaction
     */
    public void setUnitOfMeasureCodeTransaction(java.lang.String unitOfMeasureCodeTransaction) {
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }


    /**
     * Gets the userReservedData value for this ShowSalesDetailV2.
     * 
     * @return userReservedData
     */
    public JP420000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this ShowSalesDetailV2.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP420000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowSalesDetailV2)) return false;
        ShowSalesDetailV2 other = (ShowSalesDetailV2) obj;
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
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.categoryCodesPurchasing==null && other.getCategoryCodesPurchasing()==null) || 
             (this.categoryCodesPurchasing!=null &&
              this.categoryCodesPurchasing.equals(other.getCategoryCodesPurchasing()))) &&
            ((this.categoryCodesSales==null && other.getCategoryCodesSales()==null) || 
             (this.categoryCodesSales!=null &&
              this.categoryCodesSales.equals(other.getCategoryCodesSales()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.costExtendedDomestic==null && other.getCostExtendedDomestic()==null) || 
             (this.costExtendedDomestic!=null &&
              this.costExtendedDomestic.equals(other.getCostExtendedDomestic()))) &&
            ((this.costExtendedForeign==null && other.getCostExtendedForeign()==null) || 
             (this.costExtendedForeign!=null &&
              this.costExtendedForeign.equals(other.getCostExtendedForeign()))) &&
            ((this.costUnitPurchasingDomestic==null && other.getCostUnitPurchasingDomestic()==null) || 
             (this.costUnitPurchasingDomestic!=null &&
              this.costUnitPurchasingDomestic.equals(other.getCostUnitPurchasingDomestic()))) &&
            ((this.costUnitPurchasingForeign==null && other.getCostUnitPurchasingForeign()==null) || 
             (this.costUnitPurchasingForeign!=null &&
              this.costUnitPurchasingForeign.equals(other.getCostUnitPurchasingForeign()))) &&
            ((this.currencyCodeFrom==null && other.getCurrencyCodeFrom()==null) || 
             (this.currencyCodeFrom!=null &&
              this.currencyCodeFrom.equals(other.getCurrencyCodeFrom()))) &&
            ((this.customerPO==null && other.getCustomerPO()==null) || 
             (this.customerPO!=null &&
              this.customerPO.equals(other.getCustomerPO()))) &&
            ((this.dateAccounting==null && other.getDateAccounting()==null) || 
             (this.dateAccounting!=null &&
              this.dateAccounting.equals(other.getDateAccounting()))) &&
            ((this.dateActualShip==null && other.getDateActualShip()==null) || 
             (this.dateActualShip!=null &&
              this.dateActualShip.equals(other.getDateActualShip()))) &&
            ((this.dateCancel==null && other.getDateCancel()==null) || 
             (this.dateCancel!=null &&
              this.dateCancel.equals(other.getDateCancel()))) &&
            ((this.dateInvoice==null && other.getDateInvoice()==null) || 
             (this.dateInvoice!=null &&
              this.dateInvoice.equals(other.getDateInvoice()))) &&
            ((this.dateOrdered==null && other.getDateOrdered()==null) || 
             (this.dateOrdered!=null &&
              this.dateOrdered.equals(other.getDateOrdered()))) &&
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
            ((this.deliverTo==null && other.getDeliverTo()==null) || 
             (this.deliverTo!=null &&
              this.deliverTo.equals(other.getDeliverTo()))) &&
            ((this.deliveryId==null && other.getDeliveryId()==null) || 
             (this.deliveryId!=null &&
              this.deliveryId.equals(other.getDeliveryId()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              this.document.equals(other.getDocument()))) &&
            ((this.documentLineNumber==null && other.getDocumentLineNumber()==null) || 
             (this.documentLineNumber!=null &&
              this.documentLineNumber.equals(other.getDocumentLineNumber()))) &&
            ((this.dutyStatusCode==null && other.getDutyStatusCode()==null) || 
             (this.dutyStatusCode!=null &&
              this.dutyStatusCode.equals(other.getDutyStatusCode()))) &&
            ((this.endUseCode==null && other.getEndUseCode()==null) || 
             (this.endUseCode!=null &&
              this.endUseCode.equals(other.getEndUseCode()))) &&
            ((this.entityIdSupplier==null && other.getEntityIdSupplier()==null) || 
             (this.entityIdSupplier!=null &&
              this.entityIdSupplier.equals(other.getEntityIdSupplier()))) &&
            ((this.lineBilling==null && other.getLineBilling()==null) || 
             (this.lineBilling!=null &&
              this.lineBilling.equals(other.getLineBilling()))) &&
            ((this.lineOfBusinessCode==null && other.getLineOfBusinessCode()==null) || 
             (this.lineOfBusinessCode!=null &&
              this.lineOfBusinessCode.equals(other.getLineOfBusinessCode()))) &&
            ((this.lineTypeCode==null && other.getLineTypeCode()==null) || 
             (this.lineTypeCode!=null &&
              this.lineTypeCode.equals(other.getLineTypeCode()))) &&
            ((this.originalOrder==null && other.getOriginalOrder()==null) || 
             (this.originalOrder!=null &&
              this.originalOrder.equals(other.getOriginalOrder()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.pickSlipId==null && other.getPickSlipId()==null) || 
             (this.pickSlipId!=null &&
              this.pickSlipId.equals(other.getPickSlipId()))) &&
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
            ((this.rateExchangeOverride==null && other.getRateExchangeOverride()==null) || 
             (this.rateExchangeOverride!=null &&
              this.rateExchangeOverride.equals(other.getRateExchangeOverride()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.relatedOrder==null && other.getRelatedOrder()==null) || 
             (this.relatedOrder!=null &&
              this.relatedOrder.equals(other.getRelatedOrder()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.shipmentId==null && other.getShipmentId()==null) || 
             (this.shipmentId!=null &&
              this.shipmentId.equals(other.getShipmentId()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.statusCodeLast==null && other.getStatusCodeLast()==null) || 
             (this.statusCodeLast!=null &&
              this.statusCodeLast.equals(other.getStatusCodeLast()))) &&
            ((this.statusCodeNext==null && other.getStatusCodeNext()==null) || 
             (this.statusCodeNext!=null &&
              this.statusCodeNext.equals(other.getStatusCodeNext()))) &&
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
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCategoryCodesPurchasing() != null) {
            _hashCode += getCategoryCodesPurchasing().hashCode();
        }
        if (getCategoryCodesSales() != null) {
            _hashCode += getCategoryCodesSales().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getCostExtendedDomestic() != null) {
            _hashCode += getCostExtendedDomestic().hashCode();
        }
        if (getCostExtendedForeign() != null) {
            _hashCode += getCostExtendedForeign().hashCode();
        }
        if (getCostUnitPurchasingDomestic() != null) {
            _hashCode += getCostUnitPurchasingDomestic().hashCode();
        }
        if (getCostUnitPurchasingForeign() != null) {
            _hashCode += getCostUnitPurchasingForeign().hashCode();
        }
        if (getCurrencyCodeFrom() != null) {
            _hashCode += getCurrencyCodeFrom().hashCode();
        }
        if (getCustomerPO() != null) {
            _hashCode += getCustomerPO().hashCode();
        }
        if (getDateAccounting() != null) {
            _hashCode += getDateAccounting().hashCode();
        }
        if (getDateActualShip() != null) {
            _hashCode += getDateActualShip().hashCode();
        }
        if (getDateCancel() != null) {
            _hashCode += getDateCancel().hashCode();
        }
        if (getDateInvoice() != null) {
            _hashCode += getDateInvoice().hashCode();
        }
        if (getDateOrdered() != null) {
            _hashCode += getDateOrdered().hashCode();
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
        if (getDeliverTo() != null) {
            _hashCode += getDeliverTo().hashCode();
        }
        if (getDeliveryId() != null) {
            _hashCode += getDeliveryId().hashCode();
        }
        if (getDocument() != null) {
            _hashCode += getDocument().hashCode();
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
        if (getEntityIdSupplier() != null) {
            _hashCode += getEntityIdSupplier().hashCode();
        }
        if (getLineBilling() != null) {
            _hashCode += getLineBilling().hashCode();
        }
        if (getLineOfBusinessCode() != null) {
            _hashCode += getLineOfBusinessCode().hashCode();
        }
        if (getLineTypeCode() != null) {
            _hashCode += getLineTypeCode().hashCode();
        }
        if (getOriginalOrder() != null) {
            _hashCode += getOriginalOrder().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPickSlipId() != null) {
            _hashCode += getPickSlipId().hashCode();
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
        if (getRateExchangeOverride() != null) {
            _hashCode += getRateExchangeOverride().hashCode();
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
        if (getShipmentId() != null) {
            _hashCode += getShipmentId().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getStatusCodeLast() != null) {
            _hashCode += getStatusCodeLast().hashCode();
        }
        if (getStatusCodeNext() != null) {
            _hashCode += getStatusCodeNext().hashCode();
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
        new org.apache.axis.description.TypeDesc(ShowSalesDetailV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailV2"));
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
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnit"));
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
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costExtendedDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costExtendedDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costExtendedForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costExtendedForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costUnitPurchasingDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costUnitPurchasingDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costUnitPurchasingForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costUnitPurchasingForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("customerPO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateAccounting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateAccounting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("dateInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateInvoice"));
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
        elemField.setFieldName("deliverTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliverTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "document"));
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
        elemField.setFieldName("entityIdSupplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityIdSupplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailLineBillingV2"));
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
        elemField.setFieldName("originalOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailOriginalOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickSlipId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickSlipId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailProduct"));
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
        elemField.setFieldName("shipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
