/**
 * PurchaseOrderShowDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderShowDetail  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String adjustmentScheduleCode;

    private java.math.BigDecimal amountOnHoldDomestic;

    private java.math.BigDecimal amountOnHoldForeign;

    private java.math.BigDecimal amountOpenDomestic;

    private java.math.BigDecimal amountOpenForeign;

    private java.math.BigDecimal amountReceivedDomestic;

    private java.math.BigDecimal amountReceivedForeign;

    private java.math.BigDecimal amountRelievedDomestic;

    private java.math.BigDecimal amountTaxForeign;

    private java.lang.String approvedRoutingBy;

    private java.lang.String businessUnit;

    private java.lang.String catalogName;

    private java.lang.String categoryCodeWorkOrder;

    private java.lang.Integer century;

    private java.lang.String commodityClassCode;

    private java.lang.String commodityClassCode2;

    private java.lang.String commodityUnmaskedCode;

    private java.lang.Integer componentId;

    private java.math.BigDecimal componentLineNumber;

    private java.lang.String conditionsOfTransportCode;

    private java.lang.String container;

    private java.math.BigDecimal costMethodPurchasing;

    private java.math.BigDecimal costUnitPurchasingDomestic;

    private java.math.BigDecimal costUnitPurchasingForeign;

    private java.lang.String currencyCodeFrom;

    private JP430000.bssv.e1.oracle.PurchaseOrderShowDetailDates datesDetail;

    private java.lang.String description1;

    private java.lang.String description2;

    private java.math.BigDecimal discountFactor;

    private java.lang.Integer entityIdBuyer;

    private java.lang.Integer entityIdCarrier;

    private java.lang.Integer entityIdMarkFor;

    private java.lang.Integer entityIdShipTo;

    private java.lang.Integer entityIdSupplier;

    private java.lang.String freightHandlingCode;

    private java.lang.String freightRateCode;

    private java.lang.String freightRateType;

    private JP430000.bssv.e1.oracle.GlAccount glAccount;

    private java.lang.String glClassCode;

    private java.math.BigDecimal grossWeight;

    private java.lang.Boolean isFreightApplied;

    private java.lang.Boolean isFreightCalculated;

    private java.lang.Boolean isQuantityPosted;

    private JP430000.bssv.e1.oracle.ItemResponseSupplier item;

    private java.lang.String itemPriceGroupCode;

    private java.lang.String landedCostRule;

    private java.lang.String ledgerTypeCode;

    private java.lang.String lineTypeCode;

    private java.lang.Integer loadNumber;

    private java.lang.String location;

    private java.lang.String lotNumber;

    private java.lang.String modeOfTransportCode;

    private java.lang.String orderLineStatus;

    private java.lang.Integer orderLineUniqueKey;

    private JP430000.bssv.e1.oracle.OriginalOrderLineKey originalOrderLineKey;

    private java.lang.String overridePriceCode;

    private java.lang.String paymentTermsCode;

    private java.lang.String priceCategoryLevel;

    private java.math.BigDecimal priceExtendedDomestic;

    private java.math.BigDecimal priceExtendedForeign;

    private java.lang.String printMessageCode;

    private java.lang.String promotionId;

    private JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey;

    private java.lang.String purgeCode;

    private JP430000.bssv.e1.oracle.PurchaseOrderShowQuantity quantity;

    private java.lang.String reasonCode;

    private java.lang.String reference;

    private JP430000.bssv.e1.oracle.RelatedOrderLineKey relatedOrderLineKey;

    private JP430000.bssv.e1.oracle.ReportingCodesPurchasing reportingCodesPurchasing;

    private java.lang.String ruleRetainage;

    private java.lang.String serialNumber;

    private java.lang.String shiftScheduledCode;

    private java.lang.String shippingConditionCode;

    private java.lang.String statusCodeLast;

    private java.lang.String statusCodeNext;

    private java.lang.String statusLocationTaxCode;

    private JP430000.bssv.e1.oracle.Subledger subledger;

    private java.lang.String taxRateAreaCode;

    private java.lang.String taxableCode;

    private java.lang.Integer timeChange;

    private java.lang.Integer timeScheduled;

    private java.lang.String transactionNature;

    private java.lang.String unitOfMeasureCodePrimary;

    private java.lang.String unitOfMeasureCodePurchasing;

    private java.lang.String unitOfMeasureCodeSecondary;

    private java.lang.String unitOfMeasureCodeTransaction;

    private java.lang.String unitOfMeasureCodeVolume;

    private java.lang.String unitOfMeasureCodeWeight;

    private java.math.BigDecimal unitVolume;

    private java.math.BigDecimal unitWeight;

    private JP430000.bssv.e1.oracle.UserReservedData userReservedData;

    private java.lang.Integer yearCode;

    private java.lang.String zoneNumber;

    public PurchaseOrderShowDetail() {
    }

    public PurchaseOrderShowDetail(
           java.lang.String adjustmentScheduleCode,
           java.math.BigDecimal amountOnHoldDomestic,
           java.math.BigDecimal amountOnHoldForeign,
           java.math.BigDecimal amountOpenDomestic,
           java.math.BigDecimal amountOpenForeign,
           java.math.BigDecimal amountReceivedDomestic,
           java.math.BigDecimal amountReceivedForeign,
           java.math.BigDecimal amountRelievedDomestic,
           java.math.BigDecimal amountTaxForeign,
           java.lang.String approvedRoutingBy,
           java.lang.String businessUnit,
           java.lang.String catalogName,
           java.lang.String categoryCodeWorkOrder,
           java.lang.Integer century,
           java.lang.String commodityClassCode,
           java.lang.String commodityClassCode2,
           java.lang.String commodityUnmaskedCode,
           java.lang.Integer componentId,
           java.math.BigDecimal componentLineNumber,
           java.lang.String conditionsOfTransportCode,
           java.lang.String container,
           java.math.BigDecimal costMethodPurchasing,
           java.math.BigDecimal costUnitPurchasingDomestic,
           java.math.BigDecimal costUnitPurchasingForeign,
           java.lang.String currencyCodeFrom,
           JP430000.bssv.e1.oracle.PurchaseOrderShowDetailDates datesDetail,
           java.lang.String description1,
           java.lang.String description2,
           java.math.BigDecimal discountFactor,
           java.lang.Integer entityIdBuyer,
           java.lang.Integer entityIdCarrier,
           java.lang.Integer entityIdMarkFor,
           java.lang.Integer entityIdShipTo,
           java.lang.Integer entityIdSupplier,
           java.lang.String freightHandlingCode,
           java.lang.String freightRateCode,
           java.lang.String freightRateType,
           JP430000.bssv.e1.oracle.GlAccount glAccount,
           java.lang.String glClassCode,
           java.math.BigDecimal grossWeight,
           java.lang.Boolean isFreightApplied,
           java.lang.Boolean isFreightCalculated,
           java.lang.Boolean isQuantityPosted,
           JP430000.bssv.e1.oracle.ItemResponseSupplier item,
           java.lang.String itemPriceGroupCode,
           java.lang.String landedCostRule,
           java.lang.String ledgerTypeCode,
           java.lang.String lineTypeCode,
           java.lang.Integer loadNumber,
           java.lang.String location,
           java.lang.String lotNumber,
           java.lang.String modeOfTransportCode,
           java.lang.String orderLineStatus,
           java.lang.Integer orderLineUniqueKey,
           JP430000.bssv.e1.oracle.OriginalOrderLineKey originalOrderLineKey,
           java.lang.String overridePriceCode,
           java.lang.String paymentTermsCode,
           java.lang.String priceCategoryLevel,
           java.math.BigDecimal priceExtendedDomestic,
           java.math.BigDecimal priceExtendedForeign,
           java.lang.String printMessageCode,
           java.lang.String promotionId,
           JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey,
           java.lang.String purgeCode,
           JP430000.bssv.e1.oracle.PurchaseOrderShowQuantity quantity,
           java.lang.String reasonCode,
           java.lang.String reference,
           JP430000.bssv.e1.oracle.RelatedOrderLineKey relatedOrderLineKey,
           JP430000.bssv.e1.oracle.ReportingCodesPurchasing reportingCodesPurchasing,
           java.lang.String ruleRetainage,
           java.lang.String serialNumber,
           java.lang.String shiftScheduledCode,
           java.lang.String shippingConditionCode,
           java.lang.String statusCodeLast,
           java.lang.String statusCodeNext,
           java.lang.String statusLocationTaxCode,
           JP430000.bssv.e1.oracle.Subledger subledger,
           java.lang.String taxRateAreaCode,
           java.lang.String taxableCode,
           java.lang.Integer timeChange,
           java.lang.Integer timeScheduled,
           java.lang.String transactionNature,
           java.lang.String unitOfMeasureCodePrimary,
           java.lang.String unitOfMeasureCodePurchasing,
           java.lang.String unitOfMeasureCodeSecondary,
           java.lang.String unitOfMeasureCodeTransaction,
           java.lang.String unitOfMeasureCodeVolume,
           java.lang.String unitOfMeasureCodeWeight,
           java.math.BigDecimal unitVolume,
           java.math.BigDecimal unitWeight,
           JP430000.bssv.e1.oracle.UserReservedData userReservedData,
           java.lang.Integer yearCode,
           java.lang.String zoneNumber) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
        this.amountOnHoldDomestic = amountOnHoldDomestic;
        this.amountOnHoldForeign = amountOnHoldForeign;
        this.amountOpenDomestic = amountOpenDomestic;
        this.amountOpenForeign = amountOpenForeign;
        this.amountReceivedDomestic = amountReceivedDomestic;
        this.amountReceivedForeign = amountReceivedForeign;
        this.amountRelievedDomestic = amountRelievedDomestic;
        this.amountTaxForeign = amountTaxForeign;
        this.approvedRoutingBy = approvedRoutingBy;
        this.businessUnit = businessUnit;
        this.catalogName = catalogName;
        this.categoryCodeWorkOrder = categoryCodeWorkOrder;
        this.century = century;
        this.commodityClassCode = commodityClassCode;
        this.commodityClassCode2 = commodityClassCode2;
        this.commodityUnmaskedCode = commodityUnmaskedCode;
        this.componentId = componentId;
        this.componentLineNumber = componentLineNumber;
        this.conditionsOfTransportCode = conditionsOfTransportCode;
        this.container = container;
        this.costMethodPurchasing = costMethodPurchasing;
        this.costUnitPurchasingDomestic = costUnitPurchasingDomestic;
        this.costUnitPurchasingForeign = costUnitPurchasingForeign;
        this.currencyCodeFrom = currencyCodeFrom;
        this.datesDetail = datesDetail;
        this.description1 = description1;
        this.description2 = description2;
        this.discountFactor = discountFactor;
        this.entityIdBuyer = entityIdBuyer;
        this.entityIdCarrier = entityIdCarrier;
        this.entityIdMarkFor = entityIdMarkFor;
        this.entityIdShipTo = entityIdShipTo;
        this.entityIdSupplier = entityIdSupplier;
        this.freightHandlingCode = freightHandlingCode;
        this.freightRateCode = freightRateCode;
        this.freightRateType = freightRateType;
        this.glAccount = glAccount;
        this.glClassCode = glClassCode;
        this.grossWeight = grossWeight;
        this.isFreightApplied = isFreightApplied;
        this.isFreightCalculated = isFreightCalculated;
        this.isQuantityPosted = isQuantityPosted;
        this.item = item;
        this.itemPriceGroupCode = itemPriceGroupCode;
        this.landedCostRule = landedCostRule;
        this.ledgerTypeCode = ledgerTypeCode;
        this.lineTypeCode = lineTypeCode;
        this.loadNumber = loadNumber;
        this.location = location;
        this.lotNumber = lotNumber;
        this.modeOfTransportCode = modeOfTransportCode;
        this.orderLineStatus = orderLineStatus;
        this.orderLineUniqueKey = orderLineUniqueKey;
        this.originalOrderLineKey = originalOrderLineKey;
        this.overridePriceCode = overridePriceCode;
        this.paymentTermsCode = paymentTermsCode;
        this.priceCategoryLevel = priceCategoryLevel;
        this.priceExtendedDomestic = priceExtendedDomestic;
        this.priceExtendedForeign = priceExtendedForeign;
        this.printMessageCode = printMessageCode;
        this.promotionId = promotionId;
        this.purchaseOrderLineKey = purchaseOrderLineKey;
        this.purgeCode = purgeCode;
        this.quantity = quantity;
        this.reasonCode = reasonCode;
        this.reference = reference;
        this.relatedOrderLineKey = relatedOrderLineKey;
        this.reportingCodesPurchasing = reportingCodesPurchasing;
        this.ruleRetainage = ruleRetainage;
        this.serialNumber = serialNumber;
        this.shiftScheduledCode = shiftScheduledCode;
        this.shippingConditionCode = shippingConditionCode;
        this.statusCodeLast = statusCodeLast;
        this.statusCodeNext = statusCodeNext;
        this.statusLocationTaxCode = statusLocationTaxCode;
        this.subledger = subledger;
        this.taxRateAreaCode = taxRateAreaCode;
        this.taxableCode = taxableCode;
        this.timeChange = timeChange;
        this.timeScheduled = timeScheduled;
        this.transactionNature = transactionNature;
        this.unitOfMeasureCodePrimary = unitOfMeasureCodePrimary;
        this.unitOfMeasureCodePurchasing = unitOfMeasureCodePurchasing;
        this.unitOfMeasureCodeSecondary = unitOfMeasureCodeSecondary;
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
        this.unitOfMeasureCodeVolume = unitOfMeasureCodeVolume;
        this.unitOfMeasureCodeWeight = unitOfMeasureCodeWeight;
        this.unitVolume = unitVolume;
        this.unitWeight = unitWeight;
        this.userReservedData = userReservedData;
        this.yearCode = yearCode;
        this.zoneNumber = zoneNumber;
    }


    /**
     * Gets the adjustmentScheduleCode value for this PurchaseOrderShowDetail.
     * 
     * @return adjustmentScheduleCode
     */
    public java.lang.String getAdjustmentScheduleCode() {
        return adjustmentScheduleCode;
    }


    /**
     * Sets the adjustmentScheduleCode value for this PurchaseOrderShowDetail.
     * 
     * @param adjustmentScheduleCode
     */
    public void setAdjustmentScheduleCode(java.lang.String adjustmentScheduleCode) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
    }


    /**
     * Gets the amountOnHoldDomestic value for this PurchaseOrderShowDetail.
     * 
     * @return amountOnHoldDomestic
     */
    public java.math.BigDecimal getAmountOnHoldDomestic() {
        return amountOnHoldDomestic;
    }


    /**
     * Sets the amountOnHoldDomestic value for this PurchaseOrderShowDetail.
     * 
     * @param amountOnHoldDomestic
     */
    public void setAmountOnHoldDomestic(java.math.BigDecimal amountOnHoldDomestic) {
        this.amountOnHoldDomestic = amountOnHoldDomestic;
    }


    /**
     * Gets the amountOnHoldForeign value for this PurchaseOrderShowDetail.
     * 
     * @return amountOnHoldForeign
     */
    public java.math.BigDecimal getAmountOnHoldForeign() {
        return amountOnHoldForeign;
    }


    /**
     * Sets the amountOnHoldForeign value for this PurchaseOrderShowDetail.
     * 
     * @param amountOnHoldForeign
     */
    public void setAmountOnHoldForeign(java.math.BigDecimal amountOnHoldForeign) {
        this.amountOnHoldForeign = amountOnHoldForeign;
    }


    /**
     * Gets the amountOpenDomestic value for this PurchaseOrderShowDetail.
     * 
     * @return amountOpenDomestic
     */
    public java.math.BigDecimal getAmountOpenDomestic() {
        return amountOpenDomestic;
    }


    /**
     * Sets the amountOpenDomestic value for this PurchaseOrderShowDetail.
     * 
     * @param amountOpenDomestic
     */
    public void setAmountOpenDomestic(java.math.BigDecimal amountOpenDomestic) {
        this.amountOpenDomestic = amountOpenDomestic;
    }


    /**
     * Gets the amountOpenForeign value for this PurchaseOrderShowDetail.
     * 
     * @return amountOpenForeign
     */
    public java.math.BigDecimal getAmountOpenForeign() {
        return amountOpenForeign;
    }


    /**
     * Sets the amountOpenForeign value for this PurchaseOrderShowDetail.
     * 
     * @param amountOpenForeign
     */
    public void setAmountOpenForeign(java.math.BigDecimal amountOpenForeign) {
        this.amountOpenForeign = amountOpenForeign;
    }


    /**
     * Gets the amountReceivedDomestic value for this PurchaseOrderShowDetail.
     * 
     * @return amountReceivedDomestic
     */
    public java.math.BigDecimal getAmountReceivedDomestic() {
        return amountReceivedDomestic;
    }


    /**
     * Sets the amountReceivedDomestic value for this PurchaseOrderShowDetail.
     * 
     * @param amountReceivedDomestic
     */
    public void setAmountReceivedDomestic(java.math.BigDecimal amountReceivedDomestic) {
        this.amountReceivedDomestic = amountReceivedDomestic;
    }


    /**
     * Gets the amountReceivedForeign value for this PurchaseOrderShowDetail.
     * 
     * @return amountReceivedForeign
     */
    public java.math.BigDecimal getAmountReceivedForeign() {
        return amountReceivedForeign;
    }


    /**
     * Sets the amountReceivedForeign value for this PurchaseOrderShowDetail.
     * 
     * @param amountReceivedForeign
     */
    public void setAmountReceivedForeign(java.math.BigDecimal amountReceivedForeign) {
        this.amountReceivedForeign = amountReceivedForeign;
    }


    /**
     * Gets the amountRelievedDomestic value for this PurchaseOrderShowDetail.
     * 
     * @return amountRelievedDomestic
     */
    public java.math.BigDecimal getAmountRelievedDomestic() {
        return amountRelievedDomestic;
    }


    /**
     * Sets the amountRelievedDomestic value for this PurchaseOrderShowDetail.
     * 
     * @param amountRelievedDomestic
     */
    public void setAmountRelievedDomestic(java.math.BigDecimal amountRelievedDomestic) {
        this.amountRelievedDomestic = amountRelievedDomestic;
    }


    /**
     * Gets the amountTaxForeign value for this PurchaseOrderShowDetail.
     * 
     * @return amountTaxForeign
     */
    public java.math.BigDecimal getAmountTaxForeign() {
        return amountTaxForeign;
    }


    /**
     * Sets the amountTaxForeign value for this PurchaseOrderShowDetail.
     * 
     * @param amountTaxForeign
     */
    public void setAmountTaxForeign(java.math.BigDecimal amountTaxForeign) {
        this.amountTaxForeign = amountTaxForeign;
    }


    /**
     * Gets the approvedRoutingBy value for this PurchaseOrderShowDetail.
     * 
     * @return approvedRoutingBy
     */
    public java.lang.String getApprovedRoutingBy() {
        return approvedRoutingBy;
    }


    /**
     * Sets the approvedRoutingBy value for this PurchaseOrderShowDetail.
     * 
     * @param approvedRoutingBy
     */
    public void setApprovedRoutingBy(java.lang.String approvedRoutingBy) {
        this.approvedRoutingBy = approvedRoutingBy;
    }


    /**
     * Gets the businessUnit value for this PurchaseOrderShowDetail.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this PurchaseOrderShowDetail.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the catalogName value for this PurchaseOrderShowDetail.
     * 
     * @return catalogName
     */
    public java.lang.String getCatalogName() {
        return catalogName;
    }


    /**
     * Sets the catalogName value for this PurchaseOrderShowDetail.
     * 
     * @param catalogName
     */
    public void setCatalogName(java.lang.String catalogName) {
        this.catalogName = catalogName;
    }


    /**
     * Gets the categoryCodeWorkOrder value for this PurchaseOrderShowDetail.
     * 
     * @return categoryCodeWorkOrder
     */
    public java.lang.String getCategoryCodeWorkOrder() {
        return categoryCodeWorkOrder;
    }


    /**
     * Sets the categoryCodeWorkOrder value for this PurchaseOrderShowDetail.
     * 
     * @param categoryCodeWorkOrder
     */
    public void setCategoryCodeWorkOrder(java.lang.String categoryCodeWorkOrder) {
        this.categoryCodeWorkOrder = categoryCodeWorkOrder;
    }


    /**
     * Gets the century value for this PurchaseOrderShowDetail.
     * 
     * @return century
     */
    public java.lang.Integer getCentury() {
        return century;
    }


    /**
     * Sets the century value for this PurchaseOrderShowDetail.
     * 
     * @param century
     */
    public void setCentury(java.lang.Integer century) {
        this.century = century;
    }


    /**
     * Gets the commodityClassCode value for this PurchaseOrderShowDetail.
     * 
     * @return commodityClassCode
     */
    public java.lang.String getCommodityClassCode() {
        return commodityClassCode;
    }


    /**
     * Sets the commodityClassCode value for this PurchaseOrderShowDetail.
     * 
     * @param commodityClassCode
     */
    public void setCommodityClassCode(java.lang.String commodityClassCode) {
        this.commodityClassCode = commodityClassCode;
    }


    /**
     * Gets the commodityClassCode2 value for this PurchaseOrderShowDetail.
     * 
     * @return commodityClassCode2
     */
    public java.lang.String getCommodityClassCode2() {
        return commodityClassCode2;
    }


    /**
     * Sets the commodityClassCode2 value for this PurchaseOrderShowDetail.
     * 
     * @param commodityClassCode2
     */
    public void setCommodityClassCode2(java.lang.String commodityClassCode2) {
        this.commodityClassCode2 = commodityClassCode2;
    }


    /**
     * Gets the commodityUnmaskedCode value for this PurchaseOrderShowDetail.
     * 
     * @return commodityUnmaskedCode
     */
    public java.lang.String getCommodityUnmaskedCode() {
        return commodityUnmaskedCode;
    }


    /**
     * Sets the commodityUnmaskedCode value for this PurchaseOrderShowDetail.
     * 
     * @param commodityUnmaskedCode
     */
    public void setCommodityUnmaskedCode(java.lang.String commodityUnmaskedCode) {
        this.commodityUnmaskedCode = commodityUnmaskedCode;
    }


    /**
     * Gets the componentId value for this PurchaseOrderShowDetail.
     * 
     * @return componentId
     */
    public java.lang.Integer getComponentId() {
        return componentId;
    }


    /**
     * Sets the componentId value for this PurchaseOrderShowDetail.
     * 
     * @param componentId
     */
    public void setComponentId(java.lang.Integer componentId) {
        this.componentId = componentId;
    }


    /**
     * Gets the componentLineNumber value for this PurchaseOrderShowDetail.
     * 
     * @return componentLineNumber
     */
    public java.math.BigDecimal getComponentLineNumber() {
        return componentLineNumber;
    }


    /**
     * Sets the componentLineNumber value for this PurchaseOrderShowDetail.
     * 
     * @param componentLineNumber
     */
    public void setComponentLineNumber(java.math.BigDecimal componentLineNumber) {
        this.componentLineNumber = componentLineNumber;
    }


    /**
     * Gets the conditionsOfTransportCode value for this PurchaseOrderShowDetail.
     * 
     * @return conditionsOfTransportCode
     */
    public java.lang.String getConditionsOfTransportCode() {
        return conditionsOfTransportCode;
    }


    /**
     * Sets the conditionsOfTransportCode value for this PurchaseOrderShowDetail.
     * 
     * @param conditionsOfTransportCode
     */
    public void setConditionsOfTransportCode(java.lang.String conditionsOfTransportCode) {
        this.conditionsOfTransportCode = conditionsOfTransportCode;
    }


    /**
     * Gets the container value for this PurchaseOrderShowDetail.
     * 
     * @return container
     */
    public java.lang.String getContainer() {
        return container;
    }


    /**
     * Sets the container value for this PurchaseOrderShowDetail.
     * 
     * @param container
     */
    public void setContainer(java.lang.String container) {
        this.container = container;
    }


    /**
     * Gets the costMethodPurchasing value for this PurchaseOrderShowDetail.
     * 
     * @return costMethodPurchasing
     */
    public java.math.BigDecimal getCostMethodPurchasing() {
        return costMethodPurchasing;
    }


    /**
     * Sets the costMethodPurchasing value for this PurchaseOrderShowDetail.
     * 
     * @param costMethodPurchasing
     */
    public void setCostMethodPurchasing(java.math.BigDecimal costMethodPurchasing) {
        this.costMethodPurchasing = costMethodPurchasing;
    }


    /**
     * Gets the costUnitPurchasingDomestic value for this PurchaseOrderShowDetail.
     * 
     * @return costUnitPurchasingDomestic
     */
    public java.math.BigDecimal getCostUnitPurchasingDomestic() {
        return costUnitPurchasingDomestic;
    }


    /**
     * Sets the costUnitPurchasingDomestic value for this PurchaseOrderShowDetail.
     * 
     * @param costUnitPurchasingDomestic
     */
    public void setCostUnitPurchasingDomestic(java.math.BigDecimal costUnitPurchasingDomestic) {
        this.costUnitPurchasingDomestic = costUnitPurchasingDomestic;
    }


    /**
     * Gets the costUnitPurchasingForeign value for this PurchaseOrderShowDetail.
     * 
     * @return costUnitPurchasingForeign
     */
    public java.math.BigDecimal getCostUnitPurchasingForeign() {
        return costUnitPurchasingForeign;
    }


    /**
     * Sets the costUnitPurchasingForeign value for this PurchaseOrderShowDetail.
     * 
     * @param costUnitPurchasingForeign
     */
    public void setCostUnitPurchasingForeign(java.math.BigDecimal costUnitPurchasingForeign) {
        this.costUnitPurchasingForeign = costUnitPurchasingForeign;
    }


    /**
     * Gets the currencyCodeFrom value for this PurchaseOrderShowDetail.
     * 
     * @return currencyCodeFrom
     */
    public java.lang.String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }


    /**
     * Sets the currencyCodeFrom value for this PurchaseOrderShowDetail.
     * 
     * @param currencyCodeFrom
     */
    public void setCurrencyCodeFrom(java.lang.String currencyCodeFrom) {
        this.currencyCodeFrom = currencyCodeFrom;
    }


    /**
     * Gets the datesDetail value for this PurchaseOrderShowDetail.
     * 
     * @return datesDetail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderShowDetailDates getDatesDetail() {
        return datesDetail;
    }


    /**
     * Sets the datesDetail value for this PurchaseOrderShowDetail.
     * 
     * @param datesDetail
     */
    public void setDatesDetail(JP430000.bssv.e1.oracle.PurchaseOrderShowDetailDates datesDetail) {
        this.datesDetail = datesDetail;
    }


    /**
     * Gets the description1 value for this PurchaseOrderShowDetail.
     * 
     * @return description1
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this PurchaseOrderShowDetail.
     * 
     * @param description1
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the description2 value for this PurchaseOrderShowDetail.
     * 
     * @return description2
     */
    public java.lang.String getDescription2() {
        return description2;
    }


    /**
     * Sets the description2 value for this PurchaseOrderShowDetail.
     * 
     * @param description2
     */
    public void setDescription2(java.lang.String description2) {
        this.description2 = description2;
    }


    /**
     * Gets the discountFactor value for this PurchaseOrderShowDetail.
     * 
     * @return discountFactor
     */
    public java.math.BigDecimal getDiscountFactor() {
        return discountFactor;
    }


    /**
     * Sets the discountFactor value for this PurchaseOrderShowDetail.
     * 
     * @param discountFactor
     */
    public void setDiscountFactor(java.math.BigDecimal discountFactor) {
        this.discountFactor = discountFactor;
    }


    /**
     * Gets the entityIdBuyer value for this PurchaseOrderShowDetail.
     * 
     * @return entityIdBuyer
     */
    public java.lang.Integer getEntityIdBuyer() {
        return entityIdBuyer;
    }


    /**
     * Sets the entityIdBuyer value for this PurchaseOrderShowDetail.
     * 
     * @param entityIdBuyer
     */
    public void setEntityIdBuyer(java.lang.Integer entityIdBuyer) {
        this.entityIdBuyer = entityIdBuyer;
    }


    /**
     * Gets the entityIdCarrier value for this PurchaseOrderShowDetail.
     * 
     * @return entityIdCarrier
     */
    public java.lang.Integer getEntityIdCarrier() {
        return entityIdCarrier;
    }


    /**
     * Sets the entityIdCarrier value for this PurchaseOrderShowDetail.
     * 
     * @param entityIdCarrier
     */
    public void setEntityIdCarrier(java.lang.Integer entityIdCarrier) {
        this.entityIdCarrier = entityIdCarrier;
    }


    /**
     * Gets the entityIdMarkFor value for this PurchaseOrderShowDetail.
     * 
     * @return entityIdMarkFor
     */
    public java.lang.Integer getEntityIdMarkFor() {
        return entityIdMarkFor;
    }


    /**
     * Sets the entityIdMarkFor value for this PurchaseOrderShowDetail.
     * 
     * @param entityIdMarkFor
     */
    public void setEntityIdMarkFor(java.lang.Integer entityIdMarkFor) {
        this.entityIdMarkFor = entityIdMarkFor;
    }


    /**
     * Gets the entityIdShipTo value for this PurchaseOrderShowDetail.
     * 
     * @return entityIdShipTo
     */
    public java.lang.Integer getEntityIdShipTo() {
        return entityIdShipTo;
    }


    /**
     * Sets the entityIdShipTo value for this PurchaseOrderShowDetail.
     * 
     * @param entityIdShipTo
     */
    public void setEntityIdShipTo(java.lang.Integer entityIdShipTo) {
        this.entityIdShipTo = entityIdShipTo;
    }


    /**
     * Gets the entityIdSupplier value for this PurchaseOrderShowDetail.
     * 
     * @return entityIdSupplier
     */
    public java.lang.Integer getEntityIdSupplier() {
        return entityIdSupplier;
    }


    /**
     * Sets the entityIdSupplier value for this PurchaseOrderShowDetail.
     * 
     * @param entityIdSupplier
     */
    public void setEntityIdSupplier(java.lang.Integer entityIdSupplier) {
        this.entityIdSupplier = entityIdSupplier;
    }


    /**
     * Gets the freightHandlingCode value for this PurchaseOrderShowDetail.
     * 
     * @return freightHandlingCode
     */
    public java.lang.String getFreightHandlingCode() {
        return freightHandlingCode;
    }


    /**
     * Sets the freightHandlingCode value for this PurchaseOrderShowDetail.
     * 
     * @param freightHandlingCode
     */
    public void setFreightHandlingCode(java.lang.String freightHandlingCode) {
        this.freightHandlingCode = freightHandlingCode;
    }


    /**
     * Gets the freightRateCode value for this PurchaseOrderShowDetail.
     * 
     * @return freightRateCode
     */
    public java.lang.String getFreightRateCode() {
        return freightRateCode;
    }


    /**
     * Sets the freightRateCode value for this PurchaseOrderShowDetail.
     * 
     * @param freightRateCode
     */
    public void setFreightRateCode(java.lang.String freightRateCode) {
        this.freightRateCode = freightRateCode;
    }


    /**
     * Gets the freightRateType value for this PurchaseOrderShowDetail.
     * 
     * @return freightRateType
     */
    public java.lang.String getFreightRateType() {
        return freightRateType;
    }


    /**
     * Sets the freightRateType value for this PurchaseOrderShowDetail.
     * 
     * @param freightRateType
     */
    public void setFreightRateType(java.lang.String freightRateType) {
        this.freightRateType = freightRateType;
    }


    /**
     * Gets the glAccount value for this PurchaseOrderShowDetail.
     * 
     * @return glAccount
     */
    public JP430000.bssv.e1.oracle.GlAccount getGlAccount() {
        return glAccount;
    }


    /**
     * Sets the glAccount value for this PurchaseOrderShowDetail.
     * 
     * @param glAccount
     */
    public void setGlAccount(JP430000.bssv.e1.oracle.GlAccount glAccount) {
        this.glAccount = glAccount;
    }


    /**
     * Gets the glClassCode value for this PurchaseOrderShowDetail.
     * 
     * @return glClassCode
     */
    public java.lang.String getGlClassCode() {
        return glClassCode;
    }


    /**
     * Sets the glClassCode value for this PurchaseOrderShowDetail.
     * 
     * @param glClassCode
     */
    public void setGlClassCode(java.lang.String glClassCode) {
        this.glClassCode = glClassCode;
    }


    /**
     * Gets the grossWeight value for this PurchaseOrderShowDetail.
     * 
     * @return grossWeight
     */
    public java.math.BigDecimal getGrossWeight() {
        return grossWeight;
    }


    /**
     * Sets the grossWeight value for this PurchaseOrderShowDetail.
     * 
     * @param grossWeight
     */
    public void setGrossWeight(java.math.BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }


    /**
     * Gets the isFreightApplied value for this PurchaseOrderShowDetail.
     * 
     * @return isFreightApplied
     */
    public java.lang.Boolean getIsFreightApplied() {
        return isFreightApplied;
    }


    /**
     * Sets the isFreightApplied value for this PurchaseOrderShowDetail.
     * 
     * @param isFreightApplied
     */
    public void setIsFreightApplied(java.lang.Boolean isFreightApplied) {
        this.isFreightApplied = isFreightApplied;
    }


    /**
     * Gets the isFreightCalculated value for this PurchaseOrderShowDetail.
     * 
     * @return isFreightCalculated
     */
    public java.lang.Boolean getIsFreightCalculated() {
        return isFreightCalculated;
    }


    /**
     * Sets the isFreightCalculated value for this PurchaseOrderShowDetail.
     * 
     * @param isFreightCalculated
     */
    public void setIsFreightCalculated(java.lang.Boolean isFreightCalculated) {
        this.isFreightCalculated = isFreightCalculated;
    }


    /**
     * Gets the isQuantityPosted value for this PurchaseOrderShowDetail.
     * 
     * @return isQuantityPosted
     */
    public java.lang.Boolean getIsQuantityPosted() {
        return isQuantityPosted;
    }


    /**
     * Sets the isQuantityPosted value for this PurchaseOrderShowDetail.
     * 
     * @param isQuantityPosted
     */
    public void setIsQuantityPosted(java.lang.Boolean isQuantityPosted) {
        this.isQuantityPosted = isQuantityPosted;
    }


    /**
     * Gets the item value for this PurchaseOrderShowDetail.
     * 
     * @return item
     */
    public JP430000.bssv.e1.oracle.ItemResponseSupplier getItem() {
        return item;
    }


    /**
     * Sets the item value for this PurchaseOrderShowDetail.
     * 
     * @param item
     */
    public void setItem(JP430000.bssv.e1.oracle.ItemResponseSupplier item) {
        this.item = item;
    }


    /**
     * Gets the itemPriceGroupCode value for this PurchaseOrderShowDetail.
     * 
     * @return itemPriceGroupCode
     */
    public java.lang.String getItemPriceGroupCode() {
        return itemPriceGroupCode;
    }


    /**
     * Sets the itemPriceGroupCode value for this PurchaseOrderShowDetail.
     * 
     * @param itemPriceGroupCode
     */
    public void setItemPriceGroupCode(java.lang.String itemPriceGroupCode) {
        this.itemPriceGroupCode = itemPriceGroupCode;
    }


    /**
     * Gets the landedCostRule value for this PurchaseOrderShowDetail.
     * 
     * @return landedCostRule
     */
    public java.lang.String getLandedCostRule() {
        return landedCostRule;
    }


    /**
     * Sets the landedCostRule value for this PurchaseOrderShowDetail.
     * 
     * @param landedCostRule
     */
    public void setLandedCostRule(java.lang.String landedCostRule) {
        this.landedCostRule = landedCostRule;
    }


    /**
     * Gets the ledgerTypeCode value for this PurchaseOrderShowDetail.
     * 
     * @return ledgerTypeCode
     */
    public java.lang.String getLedgerTypeCode() {
        return ledgerTypeCode;
    }


    /**
     * Sets the ledgerTypeCode value for this PurchaseOrderShowDetail.
     * 
     * @param ledgerTypeCode
     */
    public void setLedgerTypeCode(java.lang.String ledgerTypeCode) {
        this.ledgerTypeCode = ledgerTypeCode;
    }


    /**
     * Gets the lineTypeCode value for this PurchaseOrderShowDetail.
     * 
     * @return lineTypeCode
     */
    public java.lang.String getLineTypeCode() {
        return lineTypeCode;
    }


    /**
     * Sets the lineTypeCode value for this PurchaseOrderShowDetail.
     * 
     * @param lineTypeCode
     */
    public void setLineTypeCode(java.lang.String lineTypeCode) {
        this.lineTypeCode = lineTypeCode;
    }


    /**
     * Gets the loadNumber value for this PurchaseOrderShowDetail.
     * 
     * @return loadNumber
     */
    public java.lang.Integer getLoadNumber() {
        return loadNumber;
    }


    /**
     * Sets the loadNumber value for this PurchaseOrderShowDetail.
     * 
     * @param loadNumber
     */
    public void setLoadNumber(java.lang.Integer loadNumber) {
        this.loadNumber = loadNumber;
    }


    /**
     * Gets the location value for this PurchaseOrderShowDetail.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PurchaseOrderShowDetail.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the lotNumber value for this PurchaseOrderShowDetail.
     * 
     * @return lotNumber
     */
    public java.lang.String getLotNumber() {
        return lotNumber;
    }


    /**
     * Sets the lotNumber value for this PurchaseOrderShowDetail.
     * 
     * @param lotNumber
     */
    public void setLotNumber(java.lang.String lotNumber) {
        this.lotNumber = lotNumber;
    }


    /**
     * Gets the modeOfTransportCode value for this PurchaseOrderShowDetail.
     * 
     * @return modeOfTransportCode
     */
    public java.lang.String getModeOfTransportCode() {
        return modeOfTransportCode;
    }


    /**
     * Sets the modeOfTransportCode value for this PurchaseOrderShowDetail.
     * 
     * @param modeOfTransportCode
     */
    public void setModeOfTransportCode(java.lang.String modeOfTransportCode) {
        this.modeOfTransportCode = modeOfTransportCode;
    }


    /**
     * Gets the orderLineStatus value for this PurchaseOrderShowDetail.
     * 
     * @return orderLineStatus
     */
    public java.lang.String getOrderLineStatus() {
        return orderLineStatus;
    }


    /**
     * Sets the orderLineStatus value for this PurchaseOrderShowDetail.
     * 
     * @param orderLineStatus
     */
    public void setOrderLineStatus(java.lang.String orderLineStatus) {
        this.orderLineStatus = orderLineStatus;
    }


    /**
     * Gets the orderLineUniqueKey value for this PurchaseOrderShowDetail.
     * 
     * @return orderLineUniqueKey
     */
    public java.lang.Integer getOrderLineUniqueKey() {
        return orderLineUniqueKey;
    }


    /**
     * Sets the orderLineUniqueKey value for this PurchaseOrderShowDetail.
     * 
     * @param orderLineUniqueKey
     */
    public void setOrderLineUniqueKey(java.lang.Integer orderLineUniqueKey) {
        this.orderLineUniqueKey = orderLineUniqueKey;
    }


    /**
     * Gets the originalOrderLineKey value for this PurchaseOrderShowDetail.
     * 
     * @return originalOrderLineKey
     */
    public JP430000.bssv.e1.oracle.OriginalOrderLineKey getOriginalOrderLineKey() {
        return originalOrderLineKey;
    }


    /**
     * Sets the originalOrderLineKey value for this PurchaseOrderShowDetail.
     * 
     * @param originalOrderLineKey
     */
    public void setOriginalOrderLineKey(JP430000.bssv.e1.oracle.OriginalOrderLineKey originalOrderLineKey) {
        this.originalOrderLineKey = originalOrderLineKey;
    }


    /**
     * Gets the overridePriceCode value for this PurchaseOrderShowDetail.
     * 
     * @return overridePriceCode
     */
    public java.lang.String getOverridePriceCode() {
        return overridePriceCode;
    }


    /**
     * Sets the overridePriceCode value for this PurchaseOrderShowDetail.
     * 
     * @param overridePriceCode
     */
    public void setOverridePriceCode(java.lang.String overridePriceCode) {
        this.overridePriceCode = overridePriceCode;
    }


    /**
     * Gets the paymentTermsCode value for this PurchaseOrderShowDetail.
     * 
     * @return paymentTermsCode
     */
    public java.lang.String getPaymentTermsCode() {
        return paymentTermsCode;
    }


    /**
     * Sets the paymentTermsCode value for this PurchaseOrderShowDetail.
     * 
     * @param paymentTermsCode
     */
    public void setPaymentTermsCode(java.lang.String paymentTermsCode) {
        this.paymentTermsCode = paymentTermsCode;
    }


    /**
     * Gets the priceCategoryLevel value for this PurchaseOrderShowDetail.
     * 
     * @return priceCategoryLevel
     */
    public java.lang.String getPriceCategoryLevel() {
        return priceCategoryLevel;
    }


    /**
     * Sets the priceCategoryLevel value for this PurchaseOrderShowDetail.
     * 
     * @param priceCategoryLevel
     */
    public void setPriceCategoryLevel(java.lang.String priceCategoryLevel) {
        this.priceCategoryLevel = priceCategoryLevel;
    }


    /**
     * Gets the priceExtendedDomestic value for this PurchaseOrderShowDetail.
     * 
     * @return priceExtendedDomestic
     */
    public java.math.BigDecimal getPriceExtendedDomestic() {
        return priceExtendedDomestic;
    }


    /**
     * Sets the priceExtendedDomestic value for this PurchaseOrderShowDetail.
     * 
     * @param priceExtendedDomestic
     */
    public void setPriceExtendedDomestic(java.math.BigDecimal priceExtendedDomestic) {
        this.priceExtendedDomestic = priceExtendedDomestic;
    }


    /**
     * Gets the priceExtendedForeign value for this PurchaseOrderShowDetail.
     * 
     * @return priceExtendedForeign
     */
    public java.math.BigDecimal getPriceExtendedForeign() {
        return priceExtendedForeign;
    }


    /**
     * Sets the priceExtendedForeign value for this PurchaseOrderShowDetail.
     * 
     * @param priceExtendedForeign
     */
    public void setPriceExtendedForeign(java.math.BigDecimal priceExtendedForeign) {
        this.priceExtendedForeign = priceExtendedForeign;
    }


    /**
     * Gets the printMessageCode value for this PurchaseOrderShowDetail.
     * 
     * @return printMessageCode
     */
    public java.lang.String getPrintMessageCode() {
        return printMessageCode;
    }


    /**
     * Sets the printMessageCode value for this PurchaseOrderShowDetail.
     * 
     * @param printMessageCode
     */
    public void setPrintMessageCode(java.lang.String printMessageCode) {
        this.printMessageCode = printMessageCode;
    }


    /**
     * Gets the promotionId value for this PurchaseOrderShowDetail.
     * 
     * @return promotionId
     */
    public java.lang.String getPromotionId() {
        return promotionId;
    }


    /**
     * Sets the promotionId value for this PurchaseOrderShowDetail.
     * 
     * @param promotionId
     */
    public void setPromotionId(java.lang.String promotionId) {
        this.promotionId = promotionId;
    }


    /**
     * Gets the purchaseOrderLineKey value for this PurchaseOrderShowDetail.
     * 
     * @return purchaseOrderLineKey
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderLineKey getPurchaseOrderLineKey() {
        return purchaseOrderLineKey;
    }


    /**
     * Sets the purchaseOrderLineKey value for this PurchaseOrderShowDetail.
     * 
     * @param purchaseOrderLineKey
     */
    public void setPurchaseOrderLineKey(JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey) {
        this.purchaseOrderLineKey = purchaseOrderLineKey;
    }


    /**
     * Gets the purgeCode value for this PurchaseOrderShowDetail.
     * 
     * @return purgeCode
     */
    public java.lang.String getPurgeCode() {
        return purgeCode;
    }


    /**
     * Sets the purgeCode value for this PurchaseOrderShowDetail.
     * 
     * @param purgeCode
     */
    public void setPurgeCode(java.lang.String purgeCode) {
        this.purgeCode = purgeCode;
    }


    /**
     * Gets the quantity value for this PurchaseOrderShowDetail.
     * 
     * @return quantity
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderShowQuantity getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PurchaseOrderShowDetail.
     * 
     * @param quantity
     */
    public void setQuantity(JP430000.bssv.e1.oracle.PurchaseOrderShowQuantity quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the reasonCode value for this PurchaseOrderShowDetail.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this PurchaseOrderShowDetail.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the reference value for this PurchaseOrderShowDetail.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this PurchaseOrderShowDetail.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the relatedOrderLineKey value for this PurchaseOrderShowDetail.
     * 
     * @return relatedOrderLineKey
     */
    public JP430000.bssv.e1.oracle.RelatedOrderLineKey getRelatedOrderLineKey() {
        return relatedOrderLineKey;
    }


    /**
     * Sets the relatedOrderLineKey value for this PurchaseOrderShowDetail.
     * 
     * @param relatedOrderLineKey
     */
    public void setRelatedOrderLineKey(JP430000.bssv.e1.oracle.RelatedOrderLineKey relatedOrderLineKey) {
        this.relatedOrderLineKey = relatedOrderLineKey;
    }


    /**
     * Gets the reportingCodesPurchasing value for this PurchaseOrderShowDetail.
     * 
     * @return reportingCodesPurchasing
     */
    public JP430000.bssv.e1.oracle.ReportingCodesPurchasing getReportingCodesPurchasing() {
        return reportingCodesPurchasing;
    }


    /**
     * Sets the reportingCodesPurchasing value for this PurchaseOrderShowDetail.
     * 
     * @param reportingCodesPurchasing
     */
    public void setReportingCodesPurchasing(JP430000.bssv.e1.oracle.ReportingCodesPurchasing reportingCodesPurchasing) {
        this.reportingCodesPurchasing = reportingCodesPurchasing;
    }


    /**
     * Gets the ruleRetainage value for this PurchaseOrderShowDetail.
     * 
     * @return ruleRetainage
     */
    public java.lang.String getRuleRetainage() {
        return ruleRetainage;
    }


    /**
     * Sets the ruleRetainage value for this PurchaseOrderShowDetail.
     * 
     * @param ruleRetainage
     */
    public void setRuleRetainage(java.lang.String ruleRetainage) {
        this.ruleRetainage = ruleRetainage;
    }


    /**
     * Gets the serialNumber value for this PurchaseOrderShowDetail.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this PurchaseOrderShowDetail.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the shiftScheduledCode value for this PurchaseOrderShowDetail.
     * 
     * @return shiftScheduledCode
     */
    public java.lang.String getShiftScheduledCode() {
        return shiftScheduledCode;
    }


    /**
     * Sets the shiftScheduledCode value for this PurchaseOrderShowDetail.
     * 
     * @param shiftScheduledCode
     */
    public void setShiftScheduledCode(java.lang.String shiftScheduledCode) {
        this.shiftScheduledCode = shiftScheduledCode;
    }


    /**
     * Gets the shippingConditionCode value for this PurchaseOrderShowDetail.
     * 
     * @return shippingConditionCode
     */
    public java.lang.String getShippingConditionCode() {
        return shippingConditionCode;
    }


    /**
     * Sets the shippingConditionCode value for this PurchaseOrderShowDetail.
     * 
     * @param shippingConditionCode
     */
    public void setShippingConditionCode(java.lang.String shippingConditionCode) {
        this.shippingConditionCode = shippingConditionCode;
    }


    /**
     * Gets the statusCodeLast value for this PurchaseOrderShowDetail.
     * 
     * @return statusCodeLast
     */
    public java.lang.String getStatusCodeLast() {
        return statusCodeLast;
    }


    /**
     * Sets the statusCodeLast value for this PurchaseOrderShowDetail.
     * 
     * @param statusCodeLast
     */
    public void setStatusCodeLast(java.lang.String statusCodeLast) {
        this.statusCodeLast = statusCodeLast;
    }


    /**
     * Gets the statusCodeNext value for this PurchaseOrderShowDetail.
     * 
     * @return statusCodeNext
     */
    public java.lang.String getStatusCodeNext() {
        return statusCodeNext;
    }


    /**
     * Sets the statusCodeNext value for this PurchaseOrderShowDetail.
     * 
     * @param statusCodeNext
     */
    public void setStatusCodeNext(java.lang.String statusCodeNext) {
        this.statusCodeNext = statusCodeNext;
    }


    /**
     * Gets the statusLocationTaxCode value for this PurchaseOrderShowDetail.
     * 
     * @return statusLocationTaxCode
     */
    public java.lang.String getStatusLocationTaxCode() {
        return statusLocationTaxCode;
    }


    /**
     * Sets the statusLocationTaxCode value for this PurchaseOrderShowDetail.
     * 
     * @param statusLocationTaxCode
     */
    public void setStatusLocationTaxCode(java.lang.String statusLocationTaxCode) {
        this.statusLocationTaxCode = statusLocationTaxCode;
    }


    /**
     * Gets the subledger value for this PurchaseOrderShowDetail.
     * 
     * @return subledger
     */
    public JP430000.bssv.e1.oracle.Subledger getSubledger() {
        return subledger;
    }


    /**
     * Sets the subledger value for this PurchaseOrderShowDetail.
     * 
     * @param subledger
     */
    public void setSubledger(JP430000.bssv.e1.oracle.Subledger subledger) {
        this.subledger = subledger;
    }


    /**
     * Gets the taxRateAreaCode value for this PurchaseOrderShowDetail.
     * 
     * @return taxRateAreaCode
     */
    public java.lang.String getTaxRateAreaCode() {
        return taxRateAreaCode;
    }


    /**
     * Sets the taxRateAreaCode value for this PurchaseOrderShowDetail.
     * 
     * @param taxRateAreaCode
     */
    public void setTaxRateAreaCode(java.lang.String taxRateAreaCode) {
        this.taxRateAreaCode = taxRateAreaCode;
    }


    /**
     * Gets the taxableCode value for this PurchaseOrderShowDetail.
     * 
     * @return taxableCode
     */
    public java.lang.String getTaxableCode() {
        return taxableCode;
    }


    /**
     * Sets the taxableCode value for this PurchaseOrderShowDetail.
     * 
     * @param taxableCode
     */
    public void setTaxableCode(java.lang.String taxableCode) {
        this.taxableCode = taxableCode;
    }


    /**
     * Gets the timeChange value for this PurchaseOrderShowDetail.
     * 
     * @return timeChange
     */
    public java.lang.Integer getTimeChange() {
        return timeChange;
    }


    /**
     * Sets the timeChange value for this PurchaseOrderShowDetail.
     * 
     * @param timeChange
     */
    public void setTimeChange(java.lang.Integer timeChange) {
        this.timeChange = timeChange;
    }


    /**
     * Gets the timeScheduled value for this PurchaseOrderShowDetail.
     * 
     * @return timeScheduled
     */
    public java.lang.Integer getTimeScheduled() {
        return timeScheduled;
    }


    /**
     * Sets the timeScheduled value for this PurchaseOrderShowDetail.
     * 
     * @param timeScheduled
     */
    public void setTimeScheduled(java.lang.Integer timeScheduled) {
        this.timeScheduled = timeScheduled;
    }


    /**
     * Gets the transactionNature value for this PurchaseOrderShowDetail.
     * 
     * @return transactionNature
     */
    public java.lang.String getTransactionNature() {
        return transactionNature;
    }


    /**
     * Sets the transactionNature value for this PurchaseOrderShowDetail.
     * 
     * @param transactionNature
     */
    public void setTransactionNature(java.lang.String transactionNature) {
        this.transactionNature = transactionNature;
    }


    /**
     * Gets the unitOfMeasureCodePrimary value for this PurchaseOrderShowDetail.
     * 
     * @return unitOfMeasureCodePrimary
     */
    public java.lang.String getUnitOfMeasureCodePrimary() {
        return unitOfMeasureCodePrimary;
    }


    /**
     * Sets the unitOfMeasureCodePrimary value for this PurchaseOrderShowDetail.
     * 
     * @param unitOfMeasureCodePrimary
     */
    public void setUnitOfMeasureCodePrimary(java.lang.String unitOfMeasureCodePrimary) {
        this.unitOfMeasureCodePrimary = unitOfMeasureCodePrimary;
    }


    /**
     * Gets the unitOfMeasureCodePurchasing value for this PurchaseOrderShowDetail.
     * 
     * @return unitOfMeasureCodePurchasing
     */
    public java.lang.String getUnitOfMeasureCodePurchasing() {
        return unitOfMeasureCodePurchasing;
    }


    /**
     * Sets the unitOfMeasureCodePurchasing value for this PurchaseOrderShowDetail.
     * 
     * @param unitOfMeasureCodePurchasing
     */
    public void setUnitOfMeasureCodePurchasing(java.lang.String unitOfMeasureCodePurchasing) {
        this.unitOfMeasureCodePurchasing = unitOfMeasureCodePurchasing;
    }


    /**
     * Gets the unitOfMeasureCodeSecondary value for this PurchaseOrderShowDetail.
     * 
     * @return unitOfMeasureCodeSecondary
     */
    public java.lang.String getUnitOfMeasureCodeSecondary() {
        return unitOfMeasureCodeSecondary;
    }


    /**
     * Sets the unitOfMeasureCodeSecondary value for this PurchaseOrderShowDetail.
     * 
     * @param unitOfMeasureCodeSecondary
     */
    public void setUnitOfMeasureCodeSecondary(java.lang.String unitOfMeasureCodeSecondary) {
        this.unitOfMeasureCodeSecondary = unitOfMeasureCodeSecondary;
    }


    /**
     * Gets the unitOfMeasureCodeTransaction value for this PurchaseOrderShowDetail.
     * 
     * @return unitOfMeasureCodeTransaction
     */
    public java.lang.String getUnitOfMeasureCodeTransaction() {
        return unitOfMeasureCodeTransaction;
    }


    /**
     * Sets the unitOfMeasureCodeTransaction value for this PurchaseOrderShowDetail.
     * 
     * @param unitOfMeasureCodeTransaction
     */
    public void setUnitOfMeasureCodeTransaction(java.lang.String unitOfMeasureCodeTransaction) {
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }


    /**
     * Gets the unitOfMeasureCodeVolume value for this PurchaseOrderShowDetail.
     * 
     * @return unitOfMeasureCodeVolume
     */
    public java.lang.String getUnitOfMeasureCodeVolume() {
        return unitOfMeasureCodeVolume;
    }


    /**
     * Sets the unitOfMeasureCodeVolume value for this PurchaseOrderShowDetail.
     * 
     * @param unitOfMeasureCodeVolume
     */
    public void setUnitOfMeasureCodeVolume(java.lang.String unitOfMeasureCodeVolume) {
        this.unitOfMeasureCodeVolume = unitOfMeasureCodeVolume;
    }


    /**
     * Gets the unitOfMeasureCodeWeight value for this PurchaseOrderShowDetail.
     * 
     * @return unitOfMeasureCodeWeight
     */
    public java.lang.String getUnitOfMeasureCodeWeight() {
        return unitOfMeasureCodeWeight;
    }


    /**
     * Sets the unitOfMeasureCodeWeight value for this PurchaseOrderShowDetail.
     * 
     * @param unitOfMeasureCodeWeight
     */
    public void setUnitOfMeasureCodeWeight(java.lang.String unitOfMeasureCodeWeight) {
        this.unitOfMeasureCodeWeight = unitOfMeasureCodeWeight;
    }


    /**
     * Gets the unitVolume value for this PurchaseOrderShowDetail.
     * 
     * @return unitVolume
     */
    public java.math.BigDecimal getUnitVolume() {
        return unitVolume;
    }


    /**
     * Sets the unitVolume value for this PurchaseOrderShowDetail.
     * 
     * @param unitVolume
     */
    public void setUnitVolume(java.math.BigDecimal unitVolume) {
        this.unitVolume = unitVolume;
    }


    /**
     * Gets the unitWeight value for this PurchaseOrderShowDetail.
     * 
     * @return unitWeight
     */
    public java.math.BigDecimal getUnitWeight() {
        return unitWeight;
    }


    /**
     * Sets the unitWeight value for this PurchaseOrderShowDetail.
     * 
     * @param unitWeight
     */
    public void setUnitWeight(java.math.BigDecimal unitWeight) {
        this.unitWeight = unitWeight;
    }


    /**
     * Gets the userReservedData value for this PurchaseOrderShowDetail.
     * 
     * @return userReservedData
     */
    public JP430000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this PurchaseOrderShowDetail.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the yearCode value for this PurchaseOrderShowDetail.
     * 
     * @return yearCode
     */
    public java.lang.Integer getYearCode() {
        return yearCode;
    }


    /**
     * Sets the yearCode value for this PurchaseOrderShowDetail.
     * 
     * @param yearCode
     */
    public void setYearCode(java.lang.Integer yearCode) {
        this.yearCode = yearCode;
    }


    /**
     * Gets the zoneNumber value for this PurchaseOrderShowDetail.
     * 
     * @return zoneNumber
     */
    public java.lang.String getZoneNumber() {
        return zoneNumber;
    }


    /**
     * Sets the zoneNumber value for this PurchaseOrderShowDetail.
     * 
     * @param zoneNumber
     */
    public void setZoneNumber(java.lang.String zoneNumber) {
        this.zoneNumber = zoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderShowDetail)) return false;
        PurchaseOrderShowDetail other = (PurchaseOrderShowDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adjustmentScheduleCode==null && other.getAdjustmentScheduleCode()==null) || 
             (this.adjustmentScheduleCode!=null &&
              this.adjustmentScheduleCode.equals(other.getAdjustmentScheduleCode()))) &&
            ((this.amountOnHoldDomestic==null && other.getAmountOnHoldDomestic()==null) || 
             (this.amountOnHoldDomestic!=null &&
              this.amountOnHoldDomestic.equals(other.getAmountOnHoldDomestic()))) &&
            ((this.amountOnHoldForeign==null && other.getAmountOnHoldForeign()==null) || 
             (this.amountOnHoldForeign!=null &&
              this.amountOnHoldForeign.equals(other.getAmountOnHoldForeign()))) &&
            ((this.amountOpenDomestic==null && other.getAmountOpenDomestic()==null) || 
             (this.amountOpenDomestic!=null &&
              this.amountOpenDomestic.equals(other.getAmountOpenDomestic()))) &&
            ((this.amountOpenForeign==null && other.getAmountOpenForeign()==null) || 
             (this.amountOpenForeign!=null &&
              this.amountOpenForeign.equals(other.getAmountOpenForeign()))) &&
            ((this.amountReceivedDomestic==null && other.getAmountReceivedDomestic()==null) || 
             (this.amountReceivedDomestic!=null &&
              this.amountReceivedDomestic.equals(other.getAmountReceivedDomestic()))) &&
            ((this.amountReceivedForeign==null && other.getAmountReceivedForeign()==null) || 
             (this.amountReceivedForeign!=null &&
              this.amountReceivedForeign.equals(other.getAmountReceivedForeign()))) &&
            ((this.amountRelievedDomestic==null && other.getAmountRelievedDomestic()==null) || 
             (this.amountRelievedDomestic!=null &&
              this.amountRelievedDomestic.equals(other.getAmountRelievedDomestic()))) &&
            ((this.amountTaxForeign==null && other.getAmountTaxForeign()==null) || 
             (this.amountTaxForeign!=null &&
              this.amountTaxForeign.equals(other.getAmountTaxForeign()))) &&
            ((this.approvedRoutingBy==null && other.getApprovedRoutingBy()==null) || 
             (this.approvedRoutingBy!=null &&
              this.approvedRoutingBy.equals(other.getApprovedRoutingBy()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.catalogName==null && other.getCatalogName()==null) || 
             (this.catalogName!=null &&
              this.catalogName.equals(other.getCatalogName()))) &&
            ((this.categoryCodeWorkOrder==null && other.getCategoryCodeWorkOrder()==null) || 
             (this.categoryCodeWorkOrder!=null &&
              this.categoryCodeWorkOrder.equals(other.getCategoryCodeWorkOrder()))) &&
            ((this.century==null && other.getCentury()==null) || 
             (this.century!=null &&
              this.century.equals(other.getCentury()))) &&
            ((this.commodityClassCode==null && other.getCommodityClassCode()==null) || 
             (this.commodityClassCode!=null &&
              this.commodityClassCode.equals(other.getCommodityClassCode()))) &&
            ((this.commodityClassCode2==null && other.getCommodityClassCode2()==null) || 
             (this.commodityClassCode2!=null &&
              this.commodityClassCode2.equals(other.getCommodityClassCode2()))) &&
            ((this.commodityUnmaskedCode==null && other.getCommodityUnmaskedCode()==null) || 
             (this.commodityUnmaskedCode!=null &&
              this.commodityUnmaskedCode.equals(other.getCommodityUnmaskedCode()))) &&
            ((this.componentId==null && other.getComponentId()==null) || 
             (this.componentId!=null &&
              this.componentId.equals(other.getComponentId()))) &&
            ((this.componentLineNumber==null && other.getComponentLineNumber()==null) || 
             (this.componentLineNumber!=null &&
              this.componentLineNumber.equals(other.getComponentLineNumber()))) &&
            ((this.conditionsOfTransportCode==null && other.getConditionsOfTransportCode()==null) || 
             (this.conditionsOfTransportCode!=null &&
              this.conditionsOfTransportCode.equals(other.getConditionsOfTransportCode()))) &&
            ((this.container==null && other.getContainer()==null) || 
             (this.container!=null &&
              this.container.equals(other.getContainer()))) &&
            ((this.costMethodPurchasing==null && other.getCostMethodPurchasing()==null) || 
             (this.costMethodPurchasing!=null &&
              this.costMethodPurchasing.equals(other.getCostMethodPurchasing()))) &&
            ((this.costUnitPurchasingDomestic==null && other.getCostUnitPurchasingDomestic()==null) || 
             (this.costUnitPurchasingDomestic!=null &&
              this.costUnitPurchasingDomestic.equals(other.getCostUnitPurchasingDomestic()))) &&
            ((this.costUnitPurchasingForeign==null && other.getCostUnitPurchasingForeign()==null) || 
             (this.costUnitPurchasingForeign!=null &&
              this.costUnitPurchasingForeign.equals(other.getCostUnitPurchasingForeign()))) &&
            ((this.currencyCodeFrom==null && other.getCurrencyCodeFrom()==null) || 
             (this.currencyCodeFrom!=null &&
              this.currencyCodeFrom.equals(other.getCurrencyCodeFrom()))) &&
            ((this.datesDetail==null && other.getDatesDetail()==null) || 
             (this.datesDetail!=null &&
              this.datesDetail.equals(other.getDatesDetail()))) &&
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.description2==null && other.getDescription2()==null) || 
             (this.description2!=null &&
              this.description2.equals(other.getDescription2()))) &&
            ((this.discountFactor==null && other.getDiscountFactor()==null) || 
             (this.discountFactor!=null &&
              this.discountFactor.equals(other.getDiscountFactor()))) &&
            ((this.entityIdBuyer==null && other.getEntityIdBuyer()==null) || 
             (this.entityIdBuyer!=null &&
              this.entityIdBuyer.equals(other.getEntityIdBuyer()))) &&
            ((this.entityIdCarrier==null && other.getEntityIdCarrier()==null) || 
             (this.entityIdCarrier!=null &&
              this.entityIdCarrier.equals(other.getEntityIdCarrier()))) &&
            ((this.entityIdMarkFor==null && other.getEntityIdMarkFor()==null) || 
             (this.entityIdMarkFor!=null &&
              this.entityIdMarkFor.equals(other.getEntityIdMarkFor()))) &&
            ((this.entityIdShipTo==null && other.getEntityIdShipTo()==null) || 
             (this.entityIdShipTo!=null &&
              this.entityIdShipTo.equals(other.getEntityIdShipTo()))) &&
            ((this.entityIdSupplier==null && other.getEntityIdSupplier()==null) || 
             (this.entityIdSupplier!=null &&
              this.entityIdSupplier.equals(other.getEntityIdSupplier()))) &&
            ((this.freightHandlingCode==null && other.getFreightHandlingCode()==null) || 
             (this.freightHandlingCode!=null &&
              this.freightHandlingCode.equals(other.getFreightHandlingCode()))) &&
            ((this.freightRateCode==null && other.getFreightRateCode()==null) || 
             (this.freightRateCode!=null &&
              this.freightRateCode.equals(other.getFreightRateCode()))) &&
            ((this.freightRateType==null && other.getFreightRateType()==null) || 
             (this.freightRateType!=null &&
              this.freightRateType.equals(other.getFreightRateType()))) &&
            ((this.glAccount==null && other.getGlAccount()==null) || 
             (this.glAccount!=null &&
              this.glAccount.equals(other.getGlAccount()))) &&
            ((this.glClassCode==null && other.getGlClassCode()==null) || 
             (this.glClassCode!=null &&
              this.glClassCode.equals(other.getGlClassCode()))) &&
            ((this.grossWeight==null && other.getGrossWeight()==null) || 
             (this.grossWeight!=null &&
              this.grossWeight.equals(other.getGrossWeight()))) &&
            ((this.isFreightApplied==null && other.getIsFreightApplied()==null) || 
             (this.isFreightApplied!=null &&
              this.isFreightApplied.equals(other.getIsFreightApplied()))) &&
            ((this.isFreightCalculated==null && other.getIsFreightCalculated()==null) || 
             (this.isFreightCalculated!=null &&
              this.isFreightCalculated.equals(other.getIsFreightCalculated()))) &&
            ((this.isQuantityPosted==null && other.getIsQuantityPosted()==null) || 
             (this.isQuantityPosted!=null &&
              this.isQuantityPosted.equals(other.getIsQuantityPosted()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.itemPriceGroupCode==null && other.getItemPriceGroupCode()==null) || 
             (this.itemPriceGroupCode!=null &&
              this.itemPriceGroupCode.equals(other.getItemPriceGroupCode()))) &&
            ((this.landedCostRule==null && other.getLandedCostRule()==null) || 
             (this.landedCostRule!=null &&
              this.landedCostRule.equals(other.getLandedCostRule()))) &&
            ((this.ledgerTypeCode==null && other.getLedgerTypeCode()==null) || 
             (this.ledgerTypeCode!=null &&
              this.ledgerTypeCode.equals(other.getLedgerTypeCode()))) &&
            ((this.lineTypeCode==null && other.getLineTypeCode()==null) || 
             (this.lineTypeCode!=null &&
              this.lineTypeCode.equals(other.getLineTypeCode()))) &&
            ((this.loadNumber==null && other.getLoadNumber()==null) || 
             (this.loadNumber!=null &&
              this.loadNumber.equals(other.getLoadNumber()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.lotNumber==null && other.getLotNumber()==null) || 
             (this.lotNumber!=null &&
              this.lotNumber.equals(other.getLotNumber()))) &&
            ((this.modeOfTransportCode==null && other.getModeOfTransportCode()==null) || 
             (this.modeOfTransportCode!=null &&
              this.modeOfTransportCode.equals(other.getModeOfTransportCode()))) &&
            ((this.orderLineStatus==null && other.getOrderLineStatus()==null) || 
             (this.orderLineStatus!=null &&
              this.orderLineStatus.equals(other.getOrderLineStatus()))) &&
            ((this.orderLineUniqueKey==null && other.getOrderLineUniqueKey()==null) || 
             (this.orderLineUniqueKey!=null &&
              this.orderLineUniqueKey.equals(other.getOrderLineUniqueKey()))) &&
            ((this.originalOrderLineKey==null && other.getOriginalOrderLineKey()==null) || 
             (this.originalOrderLineKey!=null &&
              this.originalOrderLineKey.equals(other.getOriginalOrderLineKey()))) &&
            ((this.overridePriceCode==null && other.getOverridePriceCode()==null) || 
             (this.overridePriceCode!=null &&
              this.overridePriceCode.equals(other.getOverridePriceCode()))) &&
            ((this.paymentTermsCode==null && other.getPaymentTermsCode()==null) || 
             (this.paymentTermsCode!=null &&
              this.paymentTermsCode.equals(other.getPaymentTermsCode()))) &&
            ((this.priceCategoryLevel==null && other.getPriceCategoryLevel()==null) || 
             (this.priceCategoryLevel!=null &&
              this.priceCategoryLevel.equals(other.getPriceCategoryLevel()))) &&
            ((this.priceExtendedDomestic==null && other.getPriceExtendedDomestic()==null) || 
             (this.priceExtendedDomestic!=null &&
              this.priceExtendedDomestic.equals(other.getPriceExtendedDomestic()))) &&
            ((this.priceExtendedForeign==null && other.getPriceExtendedForeign()==null) || 
             (this.priceExtendedForeign!=null &&
              this.priceExtendedForeign.equals(other.getPriceExtendedForeign()))) &&
            ((this.printMessageCode==null && other.getPrintMessageCode()==null) || 
             (this.printMessageCode!=null &&
              this.printMessageCode.equals(other.getPrintMessageCode()))) &&
            ((this.promotionId==null && other.getPromotionId()==null) || 
             (this.promotionId!=null &&
              this.promotionId.equals(other.getPromotionId()))) &&
            ((this.purchaseOrderLineKey==null && other.getPurchaseOrderLineKey()==null) || 
             (this.purchaseOrderLineKey!=null &&
              this.purchaseOrderLineKey.equals(other.getPurchaseOrderLineKey()))) &&
            ((this.purgeCode==null && other.getPurgeCode()==null) || 
             (this.purgeCode!=null &&
              this.purgeCode.equals(other.getPurgeCode()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.relatedOrderLineKey==null && other.getRelatedOrderLineKey()==null) || 
             (this.relatedOrderLineKey!=null &&
              this.relatedOrderLineKey.equals(other.getRelatedOrderLineKey()))) &&
            ((this.reportingCodesPurchasing==null && other.getReportingCodesPurchasing()==null) || 
             (this.reportingCodesPurchasing!=null &&
              this.reportingCodesPurchasing.equals(other.getReportingCodesPurchasing()))) &&
            ((this.ruleRetainage==null && other.getRuleRetainage()==null) || 
             (this.ruleRetainage!=null &&
              this.ruleRetainage.equals(other.getRuleRetainage()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.shiftScheduledCode==null && other.getShiftScheduledCode()==null) || 
             (this.shiftScheduledCode!=null &&
              this.shiftScheduledCode.equals(other.getShiftScheduledCode()))) &&
            ((this.shippingConditionCode==null && other.getShippingConditionCode()==null) || 
             (this.shippingConditionCode!=null &&
              this.shippingConditionCode.equals(other.getShippingConditionCode()))) &&
            ((this.statusCodeLast==null && other.getStatusCodeLast()==null) || 
             (this.statusCodeLast!=null &&
              this.statusCodeLast.equals(other.getStatusCodeLast()))) &&
            ((this.statusCodeNext==null && other.getStatusCodeNext()==null) || 
             (this.statusCodeNext!=null &&
              this.statusCodeNext.equals(other.getStatusCodeNext()))) &&
            ((this.statusLocationTaxCode==null && other.getStatusLocationTaxCode()==null) || 
             (this.statusLocationTaxCode!=null &&
              this.statusLocationTaxCode.equals(other.getStatusLocationTaxCode()))) &&
            ((this.subledger==null && other.getSubledger()==null) || 
             (this.subledger!=null &&
              this.subledger.equals(other.getSubledger()))) &&
            ((this.taxRateAreaCode==null && other.getTaxRateAreaCode()==null) || 
             (this.taxRateAreaCode!=null &&
              this.taxRateAreaCode.equals(other.getTaxRateAreaCode()))) &&
            ((this.taxableCode==null && other.getTaxableCode()==null) || 
             (this.taxableCode!=null &&
              this.taxableCode.equals(other.getTaxableCode()))) &&
            ((this.timeChange==null && other.getTimeChange()==null) || 
             (this.timeChange!=null &&
              this.timeChange.equals(other.getTimeChange()))) &&
            ((this.timeScheduled==null && other.getTimeScheduled()==null) || 
             (this.timeScheduled!=null &&
              this.timeScheduled.equals(other.getTimeScheduled()))) &&
            ((this.transactionNature==null && other.getTransactionNature()==null) || 
             (this.transactionNature!=null &&
              this.transactionNature.equals(other.getTransactionNature()))) &&
            ((this.unitOfMeasureCodePrimary==null && other.getUnitOfMeasureCodePrimary()==null) || 
             (this.unitOfMeasureCodePrimary!=null &&
              this.unitOfMeasureCodePrimary.equals(other.getUnitOfMeasureCodePrimary()))) &&
            ((this.unitOfMeasureCodePurchasing==null && other.getUnitOfMeasureCodePurchasing()==null) || 
             (this.unitOfMeasureCodePurchasing!=null &&
              this.unitOfMeasureCodePurchasing.equals(other.getUnitOfMeasureCodePurchasing()))) &&
            ((this.unitOfMeasureCodeSecondary==null && other.getUnitOfMeasureCodeSecondary()==null) || 
             (this.unitOfMeasureCodeSecondary!=null &&
              this.unitOfMeasureCodeSecondary.equals(other.getUnitOfMeasureCodeSecondary()))) &&
            ((this.unitOfMeasureCodeTransaction==null && other.getUnitOfMeasureCodeTransaction()==null) || 
             (this.unitOfMeasureCodeTransaction!=null &&
              this.unitOfMeasureCodeTransaction.equals(other.getUnitOfMeasureCodeTransaction()))) &&
            ((this.unitOfMeasureCodeVolume==null && other.getUnitOfMeasureCodeVolume()==null) || 
             (this.unitOfMeasureCodeVolume!=null &&
              this.unitOfMeasureCodeVolume.equals(other.getUnitOfMeasureCodeVolume()))) &&
            ((this.unitOfMeasureCodeWeight==null && other.getUnitOfMeasureCodeWeight()==null) || 
             (this.unitOfMeasureCodeWeight!=null &&
              this.unitOfMeasureCodeWeight.equals(other.getUnitOfMeasureCodeWeight()))) &&
            ((this.unitVolume==null && other.getUnitVolume()==null) || 
             (this.unitVolume!=null &&
              this.unitVolume.equals(other.getUnitVolume()))) &&
            ((this.unitWeight==null && other.getUnitWeight()==null) || 
             (this.unitWeight!=null &&
              this.unitWeight.equals(other.getUnitWeight()))) &&
            ((this.userReservedData==null && other.getUserReservedData()==null) || 
             (this.userReservedData!=null &&
              this.userReservedData.equals(other.getUserReservedData()))) &&
            ((this.yearCode==null && other.getYearCode()==null) || 
             (this.yearCode!=null &&
              this.yearCode.equals(other.getYearCode()))) &&
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
        if (getAdjustmentScheduleCode() != null) {
            _hashCode += getAdjustmentScheduleCode().hashCode();
        }
        if (getAmountOnHoldDomestic() != null) {
            _hashCode += getAmountOnHoldDomestic().hashCode();
        }
        if (getAmountOnHoldForeign() != null) {
            _hashCode += getAmountOnHoldForeign().hashCode();
        }
        if (getAmountOpenDomestic() != null) {
            _hashCode += getAmountOpenDomestic().hashCode();
        }
        if (getAmountOpenForeign() != null) {
            _hashCode += getAmountOpenForeign().hashCode();
        }
        if (getAmountReceivedDomestic() != null) {
            _hashCode += getAmountReceivedDomestic().hashCode();
        }
        if (getAmountReceivedForeign() != null) {
            _hashCode += getAmountReceivedForeign().hashCode();
        }
        if (getAmountRelievedDomestic() != null) {
            _hashCode += getAmountRelievedDomestic().hashCode();
        }
        if (getAmountTaxForeign() != null) {
            _hashCode += getAmountTaxForeign().hashCode();
        }
        if (getApprovedRoutingBy() != null) {
            _hashCode += getApprovedRoutingBy().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCatalogName() != null) {
            _hashCode += getCatalogName().hashCode();
        }
        if (getCategoryCodeWorkOrder() != null) {
            _hashCode += getCategoryCodeWorkOrder().hashCode();
        }
        if (getCentury() != null) {
            _hashCode += getCentury().hashCode();
        }
        if (getCommodityClassCode() != null) {
            _hashCode += getCommodityClassCode().hashCode();
        }
        if (getCommodityClassCode2() != null) {
            _hashCode += getCommodityClassCode2().hashCode();
        }
        if (getCommodityUnmaskedCode() != null) {
            _hashCode += getCommodityUnmaskedCode().hashCode();
        }
        if (getComponentId() != null) {
            _hashCode += getComponentId().hashCode();
        }
        if (getComponentLineNumber() != null) {
            _hashCode += getComponentLineNumber().hashCode();
        }
        if (getConditionsOfTransportCode() != null) {
            _hashCode += getConditionsOfTransportCode().hashCode();
        }
        if (getContainer() != null) {
            _hashCode += getContainer().hashCode();
        }
        if (getCostMethodPurchasing() != null) {
            _hashCode += getCostMethodPurchasing().hashCode();
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
        if (getDatesDetail() != null) {
            _hashCode += getDatesDetail().hashCode();
        }
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getDescription2() != null) {
            _hashCode += getDescription2().hashCode();
        }
        if (getDiscountFactor() != null) {
            _hashCode += getDiscountFactor().hashCode();
        }
        if (getEntityIdBuyer() != null) {
            _hashCode += getEntityIdBuyer().hashCode();
        }
        if (getEntityIdCarrier() != null) {
            _hashCode += getEntityIdCarrier().hashCode();
        }
        if (getEntityIdMarkFor() != null) {
            _hashCode += getEntityIdMarkFor().hashCode();
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
        if (getFreightRateCode() != null) {
            _hashCode += getFreightRateCode().hashCode();
        }
        if (getFreightRateType() != null) {
            _hashCode += getFreightRateType().hashCode();
        }
        if (getGlAccount() != null) {
            _hashCode += getGlAccount().hashCode();
        }
        if (getGlClassCode() != null) {
            _hashCode += getGlClassCode().hashCode();
        }
        if (getGrossWeight() != null) {
            _hashCode += getGrossWeight().hashCode();
        }
        if (getIsFreightApplied() != null) {
            _hashCode += getIsFreightApplied().hashCode();
        }
        if (getIsFreightCalculated() != null) {
            _hashCode += getIsFreightCalculated().hashCode();
        }
        if (getIsQuantityPosted() != null) {
            _hashCode += getIsQuantityPosted().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getItemPriceGroupCode() != null) {
            _hashCode += getItemPriceGroupCode().hashCode();
        }
        if (getLandedCostRule() != null) {
            _hashCode += getLandedCostRule().hashCode();
        }
        if (getLedgerTypeCode() != null) {
            _hashCode += getLedgerTypeCode().hashCode();
        }
        if (getLineTypeCode() != null) {
            _hashCode += getLineTypeCode().hashCode();
        }
        if (getLoadNumber() != null) {
            _hashCode += getLoadNumber().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLotNumber() != null) {
            _hashCode += getLotNumber().hashCode();
        }
        if (getModeOfTransportCode() != null) {
            _hashCode += getModeOfTransportCode().hashCode();
        }
        if (getOrderLineStatus() != null) {
            _hashCode += getOrderLineStatus().hashCode();
        }
        if (getOrderLineUniqueKey() != null) {
            _hashCode += getOrderLineUniqueKey().hashCode();
        }
        if (getOriginalOrderLineKey() != null) {
            _hashCode += getOriginalOrderLineKey().hashCode();
        }
        if (getOverridePriceCode() != null) {
            _hashCode += getOverridePriceCode().hashCode();
        }
        if (getPaymentTermsCode() != null) {
            _hashCode += getPaymentTermsCode().hashCode();
        }
        if (getPriceCategoryLevel() != null) {
            _hashCode += getPriceCategoryLevel().hashCode();
        }
        if (getPriceExtendedDomestic() != null) {
            _hashCode += getPriceExtendedDomestic().hashCode();
        }
        if (getPriceExtendedForeign() != null) {
            _hashCode += getPriceExtendedForeign().hashCode();
        }
        if (getPrintMessageCode() != null) {
            _hashCode += getPrintMessageCode().hashCode();
        }
        if (getPromotionId() != null) {
            _hashCode += getPromotionId().hashCode();
        }
        if (getPurchaseOrderLineKey() != null) {
            _hashCode += getPurchaseOrderLineKey().hashCode();
        }
        if (getPurgeCode() != null) {
            _hashCode += getPurgeCode().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getRelatedOrderLineKey() != null) {
            _hashCode += getRelatedOrderLineKey().hashCode();
        }
        if (getReportingCodesPurchasing() != null) {
            _hashCode += getReportingCodesPurchasing().hashCode();
        }
        if (getRuleRetainage() != null) {
            _hashCode += getRuleRetainage().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getShiftScheduledCode() != null) {
            _hashCode += getShiftScheduledCode().hashCode();
        }
        if (getShippingConditionCode() != null) {
            _hashCode += getShippingConditionCode().hashCode();
        }
        if (getStatusCodeLast() != null) {
            _hashCode += getStatusCodeLast().hashCode();
        }
        if (getStatusCodeNext() != null) {
            _hashCode += getStatusCodeNext().hashCode();
        }
        if (getStatusLocationTaxCode() != null) {
            _hashCode += getStatusLocationTaxCode().hashCode();
        }
        if (getSubledger() != null) {
            _hashCode += getSubledger().hashCode();
        }
        if (getTaxRateAreaCode() != null) {
            _hashCode += getTaxRateAreaCode().hashCode();
        }
        if (getTaxableCode() != null) {
            _hashCode += getTaxableCode().hashCode();
        }
        if (getTimeChange() != null) {
            _hashCode += getTimeChange().hashCode();
        }
        if (getTimeScheduled() != null) {
            _hashCode += getTimeScheduled().hashCode();
        }
        if (getTransactionNature() != null) {
            _hashCode += getTransactionNature().hashCode();
        }
        if (getUnitOfMeasureCodePrimary() != null) {
            _hashCode += getUnitOfMeasureCodePrimary().hashCode();
        }
        if (getUnitOfMeasureCodePurchasing() != null) {
            _hashCode += getUnitOfMeasureCodePurchasing().hashCode();
        }
        if (getUnitOfMeasureCodeSecondary() != null) {
            _hashCode += getUnitOfMeasureCodeSecondary().hashCode();
        }
        if (getUnitOfMeasureCodeTransaction() != null) {
            _hashCode += getUnitOfMeasureCodeTransaction().hashCode();
        }
        if (getUnitOfMeasureCodeVolume() != null) {
            _hashCode += getUnitOfMeasureCodeVolume().hashCode();
        }
        if (getUnitOfMeasureCodeWeight() != null) {
            _hashCode += getUnitOfMeasureCodeWeight().hashCode();
        }
        if (getUnitVolume() != null) {
            _hashCode += getUnitVolume().hashCode();
        }
        if (getUnitWeight() != null) {
            _hashCode += getUnitWeight().hashCode();
        }
        if (getUserReservedData() != null) {
            _hashCode += getUserReservedData().hashCode();
        }
        if (getYearCode() != null) {
            _hashCode += getYearCode().hashCode();
        }
        if (getZoneNumber() != null) {
            _hashCode += getZoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderShowDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentScheduleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentScheduleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountOnHoldDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountOnHoldDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountOnHoldForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountOnHoldForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountOpenDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountOpenDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountOpenForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountOpenForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountReceivedDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountReceivedDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountReceivedForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountReceivedForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountRelievedDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountRelievedDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountTaxForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountTaxForeign"));
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
        elemField.setFieldName("catalogName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "catalogName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryCodeWorkOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryCodeWorkOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("century");
        elemField.setXmlName(new javax.xml.namespace.QName("", "century"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityClassCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodityClassCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityClassCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodityClassCode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodityUnmaskedCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commodityUnmaskedCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "componentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "componentLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("costMethodPurchasing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costMethodPurchasing"));
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
        elemField.setFieldName("datesDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datesDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowDetailDates"));
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
        elemField.setFieldName("discountFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("entityIdMarkFor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityIdMarkFor"));
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
        elemField.setFieldName("freightRateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freightRateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freightRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "glAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "glAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glClassCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "glClassCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grossWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("isQuantityPosted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isQuantityPosted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "itemResponseSupplier"));
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
        elemField.setFieldName("landedCostRule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "landedCostRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ledgerTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ledgerTypeCode"));
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
        elemField.setFieldName("loadNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lotNumber"));
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
        elemField.setFieldName("orderLineStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderLineStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLineUniqueKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderLineUniqueKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalOrderLineKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalOrderLineKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "originalOrderLineKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overridePriceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overridePriceCode"));
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
        elemField.setFieldName("priceCategoryLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceCategoryLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceExtendedDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceExtendedDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceExtendedForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceExtendedForeign"));
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
        elemField.setFieldName("promotionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promotionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderLineKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrderLineKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderLineKey"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowQuantity"));
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
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedOrderLineKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedOrderLineKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "relatedOrderLineKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportingCodesPurchasing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportingCodesPurchasing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "reportingCodesPurchasing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleRetainage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruleRetainage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shiftScheduledCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shiftScheduledCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingConditionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shippingConditionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("statusLocationTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusLocationTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subledger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subledger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "subledger"));
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
        elemField.setFieldName("taxableCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxableCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeChange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeScheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeScheduled"));
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
        elemField.setFieldName("unitOfMeasureCodePrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodePrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodePurchasing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodePurchasing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodeSecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodeSecondary"));
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
        elemField.setFieldName("unitVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("yearCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yearCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
