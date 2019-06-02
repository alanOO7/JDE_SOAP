/**
 * GetSalesDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class GetSalesDetail  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String agreementId;

    private java.lang.String businessUnit;

    private JP420000.bssv.e1.oracle.Entity carrier;

    private JP420000.bssv.e1.oracle.CategoryCodesPurchasing categoryCodesPurchasing;

    private JP420000.bssv.e1.oracle.CategoryCodesSales categoryCodesSales;

    private java.lang.String company;

    private java.lang.String currencyCodeFrom;

    private java.lang.String customerPO;

    private java.util.Calendar dateAccounting;

    private java.util.Calendar dateActualShip;

    private java.util.Calendar dateCancel;

    private java.util.Calendar dateInvoice;

    private java.util.Calendar datePriceEffective;

    private java.util.Calendar datePromisedDelivery;

    private java.util.Calendar datePromisedOriginal;

    private java.util.Calendar dateRequested;

    private java.util.Calendar dateScheduledPick;

    private java.util.Calendar dateTransaction;

    private JP420000.bssv.e1.oracle.Entity deliverTo;

    private java.lang.Integer deliveryId;

    private java.lang.String description1;

    private java.lang.String description2;

    private JP420000.bssv.e1.oracle.Document document;

    private java.math.BigDecimal documentLineNumber;

    private java.lang.String freightHandlingCode;

    private java.lang.String modeOfTransportCode;

    private JP420000.bssv.e1.oracle.OriginalOrder originalOrder;

    private JP420000.bssv.e1.oracle.Entity parent;

    private java.lang.Integer pickSlipId;

    private java.math.BigDecimal priceUnitDomestic;

    private java.math.BigDecimal priceUnitForeign;

    private JP420000.bssv.e1.oracle.GetDetailProduct product;

    private java.math.BigDecimal quantityBackOrdered;

    private java.math.BigDecimal quantityCanceled;

    private java.math.BigDecimal quantityOrdered;

    private java.math.BigDecimal quantityShippable;

    private java.math.BigDecimal rateExchangeOverride;

    private JP420000.bssv.e1.oracle.RelatedOrder relatedOrder;

    private JP420000.bssv.e1.oracle.Entity shipTo;

    private java.lang.Integer shipmentId;

    private JP420000.bssv.e1.oracle.Entity soldTo;

    private java.lang.String unitOfMeasureCodePricing;

    private java.lang.String unitOfMeasureCodeTransaction;

    public GetSalesDetail() {
    }

    public GetSalesDetail(
           java.lang.String agreementId,
           java.lang.String businessUnit,
           JP420000.bssv.e1.oracle.Entity carrier,
           JP420000.bssv.e1.oracle.CategoryCodesPurchasing categoryCodesPurchasing,
           JP420000.bssv.e1.oracle.CategoryCodesSales categoryCodesSales,
           java.lang.String company,
           java.lang.String currencyCodeFrom,
           java.lang.String customerPO,
           java.util.Calendar dateAccounting,
           java.util.Calendar dateActualShip,
           java.util.Calendar dateCancel,
           java.util.Calendar dateInvoice,
           java.util.Calendar datePriceEffective,
           java.util.Calendar datePromisedDelivery,
           java.util.Calendar datePromisedOriginal,
           java.util.Calendar dateRequested,
           java.util.Calendar dateScheduledPick,
           java.util.Calendar dateTransaction,
           JP420000.bssv.e1.oracle.Entity deliverTo,
           java.lang.Integer deliveryId,
           java.lang.String description1,
           java.lang.String description2,
           JP420000.bssv.e1.oracle.Document document,
           java.math.BigDecimal documentLineNumber,
           java.lang.String freightHandlingCode,
           java.lang.String modeOfTransportCode,
           JP420000.bssv.e1.oracle.OriginalOrder originalOrder,
           JP420000.bssv.e1.oracle.Entity parent,
           java.lang.Integer pickSlipId,
           java.math.BigDecimal priceUnitDomestic,
           java.math.BigDecimal priceUnitForeign,
           JP420000.bssv.e1.oracle.GetDetailProduct product,
           java.math.BigDecimal quantityBackOrdered,
           java.math.BigDecimal quantityCanceled,
           java.math.BigDecimal quantityOrdered,
           java.math.BigDecimal quantityShippable,
           java.math.BigDecimal rateExchangeOverride,
           JP420000.bssv.e1.oracle.RelatedOrder relatedOrder,
           JP420000.bssv.e1.oracle.Entity shipTo,
           java.lang.Integer shipmentId,
           JP420000.bssv.e1.oracle.Entity soldTo,
           java.lang.String unitOfMeasureCodePricing,
           java.lang.String unitOfMeasureCodeTransaction) {
        this.agreementId = agreementId;
        this.businessUnit = businessUnit;
        this.carrier = carrier;
        this.categoryCodesPurchasing = categoryCodesPurchasing;
        this.categoryCodesSales = categoryCodesSales;
        this.company = company;
        this.currencyCodeFrom = currencyCodeFrom;
        this.customerPO = customerPO;
        this.dateAccounting = dateAccounting;
        this.dateActualShip = dateActualShip;
        this.dateCancel = dateCancel;
        this.dateInvoice = dateInvoice;
        this.datePriceEffective = datePriceEffective;
        this.datePromisedDelivery = datePromisedDelivery;
        this.datePromisedOriginal = datePromisedOriginal;
        this.dateRequested = dateRequested;
        this.dateScheduledPick = dateScheduledPick;
        this.dateTransaction = dateTransaction;
        this.deliverTo = deliverTo;
        this.deliveryId = deliveryId;
        this.description1 = description1;
        this.description2 = description2;
        this.document = document;
        this.documentLineNumber = documentLineNumber;
        this.freightHandlingCode = freightHandlingCode;
        this.modeOfTransportCode = modeOfTransportCode;
        this.originalOrder = originalOrder;
        this.parent = parent;
        this.pickSlipId = pickSlipId;
        this.priceUnitDomestic = priceUnitDomestic;
        this.priceUnitForeign = priceUnitForeign;
        this.product = product;
        this.quantityBackOrdered = quantityBackOrdered;
        this.quantityCanceled = quantityCanceled;
        this.quantityOrdered = quantityOrdered;
        this.quantityShippable = quantityShippable;
        this.rateExchangeOverride = rateExchangeOverride;
        this.relatedOrder = relatedOrder;
        this.shipTo = shipTo;
        this.shipmentId = shipmentId;
        this.soldTo = soldTo;
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }


    /**
     * Gets the agreementId value for this GetSalesDetail.
     * 
     * @return agreementId
     */
    public java.lang.String getAgreementId() {
        return agreementId;
    }


    /**
     * Sets the agreementId value for this GetSalesDetail.
     * 
     * @param agreementId
     */
    public void setAgreementId(java.lang.String agreementId) {
        this.agreementId = agreementId;
    }


    /**
     * Gets the businessUnit value for this GetSalesDetail.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this GetSalesDetail.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the carrier value for this GetSalesDetail.
     * 
     * @return carrier
     */
    public JP420000.bssv.e1.oracle.Entity getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this GetSalesDetail.
     * 
     * @param carrier
     */
    public void setCarrier(JP420000.bssv.e1.oracle.Entity carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the categoryCodesPurchasing value for this GetSalesDetail.
     * 
     * @return categoryCodesPurchasing
     */
    public JP420000.bssv.e1.oracle.CategoryCodesPurchasing getCategoryCodesPurchasing() {
        return categoryCodesPurchasing;
    }


    /**
     * Sets the categoryCodesPurchasing value for this GetSalesDetail.
     * 
     * @param categoryCodesPurchasing
     */
    public void setCategoryCodesPurchasing(JP420000.bssv.e1.oracle.CategoryCodesPurchasing categoryCodesPurchasing) {
        this.categoryCodesPurchasing = categoryCodesPurchasing;
    }


    /**
     * Gets the categoryCodesSales value for this GetSalesDetail.
     * 
     * @return categoryCodesSales
     */
    public JP420000.bssv.e1.oracle.CategoryCodesSales getCategoryCodesSales() {
        return categoryCodesSales;
    }


    /**
     * Sets the categoryCodesSales value for this GetSalesDetail.
     * 
     * @param categoryCodesSales
     */
    public void setCategoryCodesSales(JP420000.bssv.e1.oracle.CategoryCodesSales categoryCodesSales) {
        this.categoryCodesSales = categoryCodesSales;
    }


    /**
     * Gets the company value for this GetSalesDetail.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this GetSalesDetail.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the currencyCodeFrom value for this GetSalesDetail.
     * 
     * @return currencyCodeFrom
     */
    public java.lang.String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }


    /**
     * Sets the currencyCodeFrom value for this GetSalesDetail.
     * 
     * @param currencyCodeFrom
     */
    public void setCurrencyCodeFrom(java.lang.String currencyCodeFrom) {
        this.currencyCodeFrom = currencyCodeFrom;
    }


    /**
     * Gets the customerPO value for this GetSalesDetail.
     * 
     * @return customerPO
     */
    public java.lang.String getCustomerPO() {
        return customerPO;
    }


    /**
     * Sets the customerPO value for this GetSalesDetail.
     * 
     * @param customerPO
     */
    public void setCustomerPO(java.lang.String customerPO) {
        this.customerPO = customerPO;
    }


    /**
     * Gets the dateAccounting value for this GetSalesDetail.
     * 
     * @return dateAccounting
     */
    public java.util.Calendar getDateAccounting() {
        return dateAccounting;
    }


    /**
     * Sets the dateAccounting value for this GetSalesDetail.
     * 
     * @param dateAccounting
     */
    public void setDateAccounting(java.util.Calendar dateAccounting) {
        this.dateAccounting = dateAccounting;
    }


    /**
     * Gets the dateActualShip value for this GetSalesDetail.
     * 
     * @return dateActualShip
     */
    public java.util.Calendar getDateActualShip() {
        return dateActualShip;
    }


    /**
     * Sets the dateActualShip value for this GetSalesDetail.
     * 
     * @param dateActualShip
     */
    public void setDateActualShip(java.util.Calendar dateActualShip) {
        this.dateActualShip = dateActualShip;
    }


    /**
     * Gets the dateCancel value for this GetSalesDetail.
     * 
     * @return dateCancel
     */
    public java.util.Calendar getDateCancel() {
        return dateCancel;
    }


    /**
     * Sets the dateCancel value for this GetSalesDetail.
     * 
     * @param dateCancel
     */
    public void setDateCancel(java.util.Calendar dateCancel) {
        this.dateCancel = dateCancel;
    }


    /**
     * Gets the dateInvoice value for this GetSalesDetail.
     * 
     * @return dateInvoice
     */
    public java.util.Calendar getDateInvoice() {
        return dateInvoice;
    }


    /**
     * Sets the dateInvoice value for this GetSalesDetail.
     * 
     * @param dateInvoice
     */
    public void setDateInvoice(java.util.Calendar dateInvoice) {
        this.dateInvoice = dateInvoice;
    }


    /**
     * Gets the datePriceEffective value for this GetSalesDetail.
     * 
     * @return datePriceEffective
     */
    public java.util.Calendar getDatePriceEffective() {
        return datePriceEffective;
    }


    /**
     * Sets the datePriceEffective value for this GetSalesDetail.
     * 
     * @param datePriceEffective
     */
    public void setDatePriceEffective(java.util.Calendar datePriceEffective) {
        this.datePriceEffective = datePriceEffective;
    }


    /**
     * Gets the datePromisedDelivery value for this GetSalesDetail.
     * 
     * @return datePromisedDelivery
     */
    public java.util.Calendar getDatePromisedDelivery() {
        return datePromisedDelivery;
    }


    /**
     * Sets the datePromisedDelivery value for this GetSalesDetail.
     * 
     * @param datePromisedDelivery
     */
    public void setDatePromisedDelivery(java.util.Calendar datePromisedDelivery) {
        this.datePromisedDelivery = datePromisedDelivery;
    }


    /**
     * Gets the datePromisedOriginal value for this GetSalesDetail.
     * 
     * @return datePromisedOriginal
     */
    public java.util.Calendar getDatePromisedOriginal() {
        return datePromisedOriginal;
    }


    /**
     * Sets the datePromisedOriginal value for this GetSalesDetail.
     * 
     * @param datePromisedOriginal
     */
    public void setDatePromisedOriginal(java.util.Calendar datePromisedOriginal) {
        this.datePromisedOriginal = datePromisedOriginal;
    }


    /**
     * Gets the dateRequested value for this GetSalesDetail.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this GetSalesDetail.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the dateScheduledPick value for this GetSalesDetail.
     * 
     * @return dateScheduledPick
     */
    public java.util.Calendar getDateScheduledPick() {
        return dateScheduledPick;
    }


    /**
     * Sets the dateScheduledPick value for this GetSalesDetail.
     * 
     * @param dateScheduledPick
     */
    public void setDateScheduledPick(java.util.Calendar dateScheduledPick) {
        this.dateScheduledPick = dateScheduledPick;
    }


    /**
     * Gets the dateTransaction value for this GetSalesDetail.
     * 
     * @return dateTransaction
     */
    public java.util.Calendar getDateTransaction() {
        return dateTransaction;
    }


    /**
     * Sets the dateTransaction value for this GetSalesDetail.
     * 
     * @param dateTransaction
     */
    public void setDateTransaction(java.util.Calendar dateTransaction) {
        this.dateTransaction = dateTransaction;
    }


    /**
     * Gets the deliverTo value for this GetSalesDetail.
     * 
     * @return deliverTo
     */
    public JP420000.bssv.e1.oracle.Entity getDeliverTo() {
        return deliverTo;
    }


    /**
     * Sets the deliverTo value for this GetSalesDetail.
     * 
     * @param deliverTo
     */
    public void setDeliverTo(JP420000.bssv.e1.oracle.Entity deliverTo) {
        this.deliverTo = deliverTo;
    }


    /**
     * Gets the deliveryId value for this GetSalesDetail.
     * 
     * @return deliveryId
     */
    public java.lang.Integer getDeliveryId() {
        return deliveryId;
    }


    /**
     * Sets the deliveryId value for this GetSalesDetail.
     * 
     * @param deliveryId
     */
    public void setDeliveryId(java.lang.Integer deliveryId) {
        this.deliveryId = deliveryId;
    }


    /**
     * Gets the description1 value for this GetSalesDetail.
     * 
     * @return description1
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this GetSalesDetail.
     * 
     * @param description1
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the description2 value for this GetSalesDetail.
     * 
     * @return description2
     */
    public java.lang.String getDescription2() {
        return description2;
    }


    /**
     * Sets the description2 value for this GetSalesDetail.
     * 
     * @param description2
     */
    public void setDescription2(java.lang.String description2) {
        this.description2 = description2;
    }


    /**
     * Gets the document value for this GetSalesDetail.
     * 
     * @return document
     */
    public JP420000.bssv.e1.oracle.Document getDocument() {
        return document;
    }


    /**
     * Sets the document value for this GetSalesDetail.
     * 
     * @param document
     */
    public void setDocument(JP420000.bssv.e1.oracle.Document document) {
        this.document = document;
    }


    /**
     * Gets the documentLineNumber value for this GetSalesDetail.
     * 
     * @return documentLineNumber
     */
    public java.math.BigDecimal getDocumentLineNumber() {
        return documentLineNumber;
    }


    /**
     * Sets the documentLineNumber value for this GetSalesDetail.
     * 
     * @param documentLineNumber
     */
    public void setDocumentLineNumber(java.math.BigDecimal documentLineNumber) {
        this.documentLineNumber = documentLineNumber;
    }


    /**
     * Gets the freightHandlingCode value for this GetSalesDetail.
     * 
     * @return freightHandlingCode
     */
    public java.lang.String getFreightHandlingCode() {
        return freightHandlingCode;
    }


    /**
     * Sets the freightHandlingCode value for this GetSalesDetail.
     * 
     * @param freightHandlingCode
     */
    public void setFreightHandlingCode(java.lang.String freightHandlingCode) {
        this.freightHandlingCode = freightHandlingCode;
    }


    /**
     * Gets the modeOfTransportCode value for this GetSalesDetail.
     * 
     * @return modeOfTransportCode
     */
    public java.lang.String getModeOfTransportCode() {
        return modeOfTransportCode;
    }


    /**
     * Sets the modeOfTransportCode value for this GetSalesDetail.
     * 
     * @param modeOfTransportCode
     */
    public void setModeOfTransportCode(java.lang.String modeOfTransportCode) {
        this.modeOfTransportCode = modeOfTransportCode;
    }


    /**
     * Gets the originalOrder value for this GetSalesDetail.
     * 
     * @return originalOrder
     */
    public JP420000.bssv.e1.oracle.OriginalOrder getOriginalOrder() {
        return originalOrder;
    }


    /**
     * Sets the originalOrder value for this GetSalesDetail.
     * 
     * @param originalOrder
     */
    public void setOriginalOrder(JP420000.bssv.e1.oracle.OriginalOrder originalOrder) {
        this.originalOrder = originalOrder;
    }


    /**
     * Gets the parent value for this GetSalesDetail.
     * 
     * @return parent
     */
    public JP420000.bssv.e1.oracle.Entity getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this GetSalesDetail.
     * 
     * @param parent
     */
    public void setParent(JP420000.bssv.e1.oracle.Entity parent) {
        this.parent = parent;
    }


    /**
     * Gets the pickSlipId value for this GetSalesDetail.
     * 
     * @return pickSlipId
     */
    public java.lang.Integer getPickSlipId() {
        return pickSlipId;
    }


    /**
     * Sets the pickSlipId value for this GetSalesDetail.
     * 
     * @param pickSlipId
     */
    public void setPickSlipId(java.lang.Integer pickSlipId) {
        this.pickSlipId = pickSlipId;
    }


    /**
     * Gets the priceUnitDomestic value for this GetSalesDetail.
     * 
     * @return priceUnitDomestic
     */
    public java.math.BigDecimal getPriceUnitDomestic() {
        return priceUnitDomestic;
    }


    /**
     * Sets the priceUnitDomestic value for this GetSalesDetail.
     * 
     * @param priceUnitDomestic
     */
    public void setPriceUnitDomestic(java.math.BigDecimal priceUnitDomestic) {
        this.priceUnitDomestic = priceUnitDomestic;
    }


    /**
     * Gets the priceUnitForeign value for this GetSalesDetail.
     * 
     * @return priceUnitForeign
     */
    public java.math.BigDecimal getPriceUnitForeign() {
        return priceUnitForeign;
    }


    /**
     * Sets the priceUnitForeign value for this GetSalesDetail.
     * 
     * @param priceUnitForeign
     */
    public void setPriceUnitForeign(java.math.BigDecimal priceUnitForeign) {
        this.priceUnitForeign = priceUnitForeign;
    }


    /**
     * Gets the product value for this GetSalesDetail.
     * 
     * @return product
     */
    public JP420000.bssv.e1.oracle.GetDetailProduct getProduct() {
        return product;
    }


    /**
     * Sets the product value for this GetSalesDetail.
     * 
     * @param product
     */
    public void setProduct(JP420000.bssv.e1.oracle.GetDetailProduct product) {
        this.product = product;
    }


    /**
     * Gets the quantityBackOrdered value for this GetSalesDetail.
     * 
     * @return quantityBackOrdered
     */
    public java.math.BigDecimal getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this GetSalesDetail.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(java.math.BigDecimal quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the quantityCanceled value for this GetSalesDetail.
     * 
     * @return quantityCanceled
     */
    public java.math.BigDecimal getQuantityCanceled() {
        return quantityCanceled;
    }


    /**
     * Sets the quantityCanceled value for this GetSalesDetail.
     * 
     * @param quantityCanceled
     */
    public void setQuantityCanceled(java.math.BigDecimal quantityCanceled) {
        this.quantityCanceled = quantityCanceled;
    }


    /**
     * Gets the quantityOrdered value for this GetSalesDetail.
     * 
     * @return quantityOrdered
     */
    public java.math.BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }


    /**
     * Sets the quantityOrdered value for this GetSalesDetail.
     * 
     * @param quantityOrdered
     */
    public void setQuantityOrdered(java.math.BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }


    /**
     * Gets the quantityShippable value for this GetSalesDetail.
     * 
     * @return quantityShippable
     */
    public java.math.BigDecimal getQuantityShippable() {
        return quantityShippable;
    }


    /**
     * Sets the quantityShippable value for this GetSalesDetail.
     * 
     * @param quantityShippable
     */
    public void setQuantityShippable(java.math.BigDecimal quantityShippable) {
        this.quantityShippable = quantityShippable;
    }


    /**
     * Gets the rateExchangeOverride value for this GetSalesDetail.
     * 
     * @return rateExchangeOverride
     */
    public java.math.BigDecimal getRateExchangeOverride() {
        return rateExchangeOverride;
    }


    /**
     * Sets the rateExchangeOverride value for this GetSalesDetail.
     * 
     * @param rateExchangeOverride
     */
    public void setRateExchangeOverride(java.math.BigDecimal rateExchangeOverride) {
        this.rateExchangeOverride = rateExchangeOverride;
    }


    /**
     * Gets the relatedOrder value for this GetSalesDetail.
     * 
     * @return relatedOrder
     */
    public JP420000.bssv.e1.oracle.RelatedOrder getRelatedOrder() {
        return relatedOrder;
    }


    /**
     * Sets the relatedOrder value for this GetSalesDetail.
     * 
     * @param relatedOrder
     */
    public void setRelatedOrder(JP420000.bssv.e1.oracle.RelatedOrder relatedOrder) {
        this.relatedOrder = relatedOrder;
    }


    /**
     * Gets the shipTo value for this GetSalesDetail.
     * 
     * @return shipTo
     */
    public JP420000.bssv.e1.oracle.Entity getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this GetSalesDetail.
     * 
     * @param shipTo
     */
    public void setShipTo(JP420000.bssv.e1.oracle.Entity shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the shipmentId value for this GetSalesDetail.
     * 
     * @return shipmentId
     */
    public java.lang.Integer getShipmentId() {
        return shipmentId;
    }


    /**
     * Sets the shipmentId value for this GetSalesDetail.
     * 
     * @param shipmentId
     */
    public void setShipmentId(java.lang.Integer shipmentId) {
        this.shipmentId = shipmentId;
    }


    /**
     * Gets the soldTo value for this GetSalesDetail.
     * 
     * @return soldTo
     */
    public JP420000.bssv.e1.oracle.Entity getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this GetSalesDetail.
     * 
     * @param soldTo
     */
    public void setSoldTo(JP420000.bssv.e1.oracle.Entity soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the unitOfMeasureCodePricing value for this GetSalesDetail.
     * 
     * @return unitOfMeasureCodePricing
     */
    public java.lang.String getUnitOfMeasureCodePricing() {
        return unitOfMeasureCodePricing;
    }


    /**
     * Sets the unitOfMeasureCodePricing value for this GetSalesDetail.
     * 
     * @param unitOfMeasureCodePricing
     */
    public void setUnitOfMeasureCodePricing(java.lang.String unitOfMeasureCodePricing) {
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
    }


    /**
     * Gets the unitOfMeasureCodeTransaction value for this GetSalesDetail.
     * 
     * @return unitOfMeasureCodeTransaction
     */
    public java.lang.String getUnitOfMeasureCodeTransaction() {
        return unitOfMeasureCodeTransaction;
    }


    /**
     * Sets the unitOfMeasureCodeTransaction value for this GetSalesDetail.
     * 
     * @param unitOfMeasureCodeTransaction
     */
    public void setUnitOfMeasureCodeTransaction(java.lang.String unitOfMeasureCodeTransaction) {
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSalesDetail)) return false;
        GetSalesDetail other = (GetSalesDetail) obj;
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
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.categoryCodesPurchasing==null && other.getCategoryCodesPurchasing()==null) || 
             (this.categoryCodesPurchasing!=null &&
              this.categoryCodesPurchasing.equals(other.getCategoryCodesPurchasing()))) &&
            ((this.categoryCodesSales==null && other.getCategoryCodesSales()==null) || 
             (this.categoryCodesSales!=null &&
              this.categoryCodesSales.equals(other.getCategoryCodesSales()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
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
            ((this.datePriceEffective==null && other.getDatePriceEffective()==null) || 
             (this.datePriceEffective!=null &&
              this.datePriceEffective.equals(other.getDatePriceEffective()))) &&
            ((this.datePromisedDelivery==null && other.getDatePromisedDelivery()==null) || 
             (this.datePromisedDelivery!=null &&
              this.datePromisedDelivery.equals(other.getDatePromisedDelivery()))) &&
            ((this.datePromisedOriginal==null && other.getDatePromisedOriginal()==null) || 
             (this.datePromisedOriginal!=null &&
              this.datePromisedOriginal.equals(other.getDatePromisedOriginal()))) &&
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
            ((this.deliveryId==null && other.getDeliveryId()==null) || 
             (this.deliveryId!=null &&
              this.deliveryId.equals(other.getDeliveryId()))) &&
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.description2==null && other.getDescription2()==null) || 
             (this.description2!=null &&
              this.description2.equals(other.getDescription2()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              this.document.equals(other.getDocument()))) &&
            ((this.documentLineNumber==null && other.getDocumentLineNumber()==null) || 
             (this.documentLineNumber!=null &&
              this.documentLineNumber.equals(other.getDocumentLineNumber()))) &&
            ((this.freightHandlingCode==null && other.getFreightHandlingCode()==null) || 
             (this.freightHandlingCode!=null &&
              this.freightHandlingCode.equals(other.getFreightHandlingCode()))) &&
            ((this.modeOfTransportCode==null && other.getModeOfTransportCode()==null) || 
             (this.modeOfTransportCode!=null &&
              this.modeOfTransportCode.equals(other.getModeOfTransportCode()))) &&
            ((this.originalOrder==null && other.getOriginalOrder()==null) || 
             (this.originalOrder!=null &&
              this.originalOrder.equals(other.getOriginalOrder()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.pickSlipId==null && other.getPickSlipId()==null) || 
             (this.pickSlipId!=null &&
              this.pickSlipId.equals(other.getPickSlipId()))) &&
            ((this.priceUnitDomestic==null && other.getPriceUnitDomestic()==null) || 
             (this.priceUnitDomestic!=null &&
              this.priceUnitDomestic.equals(other.getPriceUnitDomestic()))) &&
            ((this.priceUnitForeign==null && other.getPriceUnitForeign()==null) || 
             (this.priceUnitForeign!=null &&
              this.priceUnitForeign.equals(other.getPriceUnitForeign()))) &&
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
            ((this.unitOfMeasureCodePricing==null && other.getUnitOfMeasureCodePricing()==null) || 
             (this.unitOfMeasureCodePricing!=null &&
              this.unitOfMeasureCodePricing.equals(other.getUnitOfMeasureCodePricing()))) &&
            ((this.unitOfMeasureCodeTransaction==null && other.getUnitOfMeasureCodeTransaction()==null) || 
             (this.unitOfMeasureCodeTransaction!=null &&
              this.unitOfMeasureCodeTransaction.equals(other.getUnitOfMeasureCodeTransaction())));
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
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
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
        if (getDatePriceEffective() != null) {
            _hashCode += getDatePriceEffective().hashCode();
        }
        if (getDatePromisedDelivery() != null) {
            _hashCode += getDatePromisedDelivery().hashCode();
        }
        if (getDatePromisedOriginal() != null) {
            _hashCode += getDatePromisedOriginal().hashCode();
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
        if (getDeliveryId() != null) {
            _hashCode += getDeliveryId().hashCode();
        }
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getDescription2() != null) {
            _hashCode += getDescription2().hashCode();
        }
        if (getDocument() != null) {
            _hashCode += getDocument().hashCode();
        }
        if (getDocumentLineNumber() != null) {
            _hashCode += getDocumentLineNumber().hashCode();
        }
        if (getFreightHandlingCode() != null) {
            _hashCode += getFreightHandlingCode().hashCode();
        }
        if (getModeOfTransportCode() != null) {
            _hashCode += getModeOfTransportCode().hashCode();
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
        if (getPriceUnitDomestic() != null) {
            _hashCode += getPriceUnitDomestic().hashCode();
        }
        if (getPriceUnitForeign() != null) {
            _hashCode += getPriceUnitForeign().hashCode();
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
        if (getUnitOfMeasureCodePricing() != null) {
            _hashCode += getUnitOfMeasureCodePricing().hashCode();
        }
        if (getUnitOfMeasureCodeTransaction() != null) {
            _hashCode += getUnitOfMeasureCodeTransaction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSalesDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreementId"));
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
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
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
        elemField.setFieldName("datePriceEffective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePriceEffective"));
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
        elemField.setFieldName("deliveryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("description2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("freightHandlingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freightHandlingCode"));
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
        elemField.setFieldName("originalOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "originalOrder"));
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
        elemField.setFieldName("priceUnitDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceUnitDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceUnitForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceUnitForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getDetailProduct"));
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
        elemField.setFieldName("unitOfMeasureCodePricing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodePricing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
