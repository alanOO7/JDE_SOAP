/**
 * PurchaseOrderDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderDetail  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.Integer RMAId;

    private java.lang.String RMAType;

    private java.lang.String UNSPSCCode;

    private java.lang.String actionType;

    private java.lang.Integer adjustmentRevisionLevel;

    private java.lang.String adjustmentScheduleCode;

    private java.lang.String agreementId;

    private java.lang.Integer agreementSupplement;

    private java.lang.String businessUnit;

    private JP430000.bssv.e1.oracle.Entity buyer;

    private java.lang.String commodityClassCode;

    private java.math.BigDecimal costExtended;

    private java.lang.String costObjectCode1;

    private java.lang.String costObjectCode2;

    private java.lang.String costObjectCode3;

    private java.lang.String costObjectCode4;

    private java.lang.String costObjectTypeCode1;

    private java.lang.String costObjectTypeCode2;

    private java.lang.String costObjectTypeCode3;

    private java.lang.String costObjectTypeCode4;

    private java.math.BigDecimal costUnitPurchasing;

    private JP430000.bssv.e1.oracle.PurchaseOrderDatesDetail datesDetail;

    private JP430000.bssv.e1.oracle.PurchaseOrderDeliveryDetail deliveryDetail;

    private java.math.BigDecimal discountFactor;

    private JP430000.bssv.e1.oracle.PurchaseOrderFinancialDetail financialDetail;

    private java.lang.String freezeWorkOrder;

    private java.math.BigDecimal matrixControlLine;

    private JP430000.bssv.e1.oracle.OriginalOrderLineKey originalOrderLineKey;

    private java.lang.String priceLevel;

    private java.lang.String printMessageCode;

    private JP430000.bssv.e1.oracle.Product product;

    private JP430000.bssv.e1.oracle.Project project;

    private java.lang.String promotionId;

    private JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey;

    private java.math.BigDecimal quantityOrdered;

    private java.math.BigDecimal quantityOrderedSecondary;

    private java.lang.String reference;

    private java.lang.String reference1;

    private JP430000.bssv.e1.oracle.RelatedOrderLineKey relatedOrderLineKey;

    private java.lang.String relievePOBlanketOrder;

    private JP430000.bssv.e1.oracle.ReportingCodesPurchasing reportingCodesPurchasing;

    private JP430000.bssv.e1.oracle.Entity shipTo;

    private java.lang.Integer shipmentId;

    private java.lang.String statusCodeLast;

    private java.lang.String statusCodeNext;

    private java.lang.String supplierSO;

    private JP430000.bssv.e1.oracle.PurchaseOrderTaxDetail taxDetail;

    private java.lang.String transactionOriginator;

    private java.lang.String transferDirectShip;

    private java.lang.String unitOfMeasureCodePurchasing;

    private java.lang.String unitOfMeasureCodeSecondary;

    private java.lang.String unitOfMeasureCodeTransaction;

    private java.lang.String unitOfMeasureCodeVolume;

    private java.lang.String unitOfMeasureCodeWeight;

    private java.math.BigDecimal unitVolume;

    private java.math.BigDecimal unitWeight;

    private JP430000.bssv.e1.oracle.UserReservedData userReservedData;

    public PurchaseOrderDetail() {
    }

    public PurchaseOrderDetail(
           java.lang.Integer RMAId,
           java.lang.String RMAType,
           java.lang.String UNSPSCCode,
           java.lang.String actionType,
           java.lang.Integer adjustmentRevisionLevel,
           java.lang.String adjustmentScheduleCode,
           java.lang.String agreementId,
           java.lang.Integer agreementSupplement,
           java.lang.String businessUnit,
           JP430000.bssv.e1.oracle.Entity buyer,
           java.lang.String commodityClassCode,
           java.math.BigDecimal costExtended,
           java.lang.String costObjectCode1,
           java.lang.String costObjectCode2,
           java.lang.String costObjectCode3,
           java.lang.String costObjectCode4,
           java.lang.String costObjectTypeCode1,
           java.lang.String costObjectTypeCode2,
           java.lang.String costObjectTypeCode3,
           java.lang.String costObjectTypeCode4,
           java.math.BigDecimal costUnitPurchasing,
           JP430000.bssv.e1.oracle.PurchaseOrderDatesDetail datesDetail,
           JP430000.bssv.e1.oracle.PurchaseOrderDeliveryDetail deliveryDetail,
           java.math.BigDecimal discountFactor,
           JP430000.bssv.e1.oracle.PurchaseOrderFinancialDetail financialDetail,
           java.lang.String freezeWorkOrder,
           java.math.BigDecimal matrixControlLine,
           JP430000.bssv.e1.oracle.OriginalOrderLineKey originalOrderLineKey,
           java.lang.String priceLevel,
           java.lang.String printMessageCode,
           JP430000.bssv.e1.oracle.Product product,
           JP430000.bssv.e1.oracle.Project project,
           java.lang.String promotionId,
           JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey,
           java.math.BigDecimal quantityOrdered,
           java.math.BigDecimal quantityOrderedSecondary,
           java.lang.String reference,
           java.lang.String reference1,
           JP430000.bssv.e1.oracle.RelatedOrderLineKey relatedOrderLineKey,
           java.lang.String relievePOBlanketOrder,
           JP430000.bssv.e1.oracle.ReportingCodesPurchasing reportingCodesPurchasing,
           JP430000.bssv.e1.oracle.Entity shipTo,
           java.lang.Integer shipmentId,
           java.lang.String statusCodeLast,
           java.lang.String statusCodeNext,
           java.lang.String supplierSO,
           JP430000.bssv.e1.oracle.PurchaseOrderTaxDetail taxDetail,
           java.lang.String transactionOriginator,
           java.lang.String transferDirectShip,
           java.lang.String unitOfMeasureCodePurchasing,
           java.lang.String unitOfMeasureCodeSecondary,
           java.lang.String unitOfMeasureCodeTransaction,
           java.lang.String unitOfMeasureCodeVolume,
           java.lang.String unitOfMeasureCodeWeight,
           java.math.BigDecimal unitVolume,
           java.math.BigDecimal unitWeight,
           JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.RMAId = RMAId;
        this.RMAType = RMAType;
        this.UNSPSCCode = UNSPSCCode;
        this.actionType = actionType;
        this.adjustmentRevisionLevel = adjustmentRevisionLevel;
        this.adjustmentScheduleCode = adjustmentScheduleCode;
        this.agreementId = agreementId;
        this.agreementSupplement = agreementSupplement;
        this.businessUnit = businessUnit;
        this.buyer = buyer;
        this.commodityClassCode = commodityClassCode;
        this.costExtended = costExtended;
        this.costObjectCode1 = costObjectCode1;
        this.costObjectCode2 = costObjectCode2;
        this.costObjectCode3 = costObjectCode3;
        this.costObjectCode4 = costObjectCode4;
        this.costObjectTypeCode1 = costObjectTypeCode1;
        this.costObjectTypeCode2 = costObjectTypeCode2;
        this.costObjectTypeCode3 = costObjectTypeCode3;
        this.costObjectTypeCode4 = costObjectTypeCode4;
        this.costUnitPurchasing = costUnitPurchasing;
        this.datesDetail = datesDetail;
        this.deliveryDetail = deliveryDetail;
        this.discountFactor = discountFactor;
        this.financialDetail = financialDetail;
        this.freezeWorkOrder = freezeWorkOrder;
        this.matrixControlLine = matrixControlLine;
        this.originalOrderLineKey = originalOrderLineKey;
        this.priceLevel = priceLevel;
        this.printMessageCode = printMessageCode;
        this.product = product;
        this.project = project;
        this.promotionId = promotionId;
        this.purchaseOrderLineKey = purchaseOrderLineKey;
        this.quantityOrdered = quantityOrdered;
        this.quantityOrderedSecondary = quantityOrderedSecondary;
        this.reference = reference;
        this.reference1 = reference1;
        this.relatedOrderLineKey = relatedOrderLineKey;
        this.relievePOBlanketOrder = relievePOBlanketOrder;
        this.reportingCodesPurchasing = reportingCodesPurchasing;
        this.shipTo = shipTo;
        this.shipmentId = shipmentId;
        this.statusCodeLast = statusCodeLast;
        this.statusCodeNext = statusCodeNext;
        this.supplierSO = supplierSO;
        this.taxDetail = taxDetail;
        this.transactionOriginator = transactionOriginator;
        this.transferDirectShip = transferDirectShip;
        this.unitOfMeasureCodePurchasing = unitOfMeasureCodePurchasing;
        this.unitOfMeasureCodeSecondary = unitOfMeasureCodeSecondary;
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
        this.unitOfMeasureCodeVolume = unitOfMeasureCodeVolume;
        this.unitOfMeasureCodeWeight = unitOfMeasureCodeWeight;
        this.unitVolume = unitVolume;
        this.unitWeight = unitWeight;
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the RMAId value for this PurchaseOrderDetail.
     * 
     * @return RMAId
     */
    public java.lang.Integer getRMAId() {
        return RMAId;
    }


    /**
     * Sets the RMAId value for this PurchaseOrderDetail.
     * 
     * @param RMAId
     */
    public void setRMAId(java.lang.Integer RMAId) {
        this.RMAId = RMAId;
    }


    /**
     * Gets the RMAType value for this PurchaseOrderDetail.
     * 
     * @return RMAType
     */
    public java.lang.String getRMAType() {
        return RMAType;
    }


    /**
     * Sets the RMAType value for this PurchaseOrderDetail.
     * 
     * @param RMAType
     */
    public void setRMAType(java.lang.String RMAType) {
        this.RMAType = RMAType;
    }


    /**
     * Gets the UNSPSCCode value for this PurchaseOrderDetail.
     * 
     * @return UNSPSCCode
     */
    public java.lang.String getUNSPSCCode() {
        return UNSPSCCode;
    }


    /**
     * Sets the UNSPSCCode value for this PurchaseOrderDetail.
     * 
     * @param UNSPSCCode
     */
    public void setUNSPSCCode(java.lang.String UNSPSCCode) {
        this.UNSPSCCode = UNSPSCCode;
    }


    /**
     * Gets the actionType value for this PurchaseOrderDetail.
     * 
     * @return actionType
     */
    public java.lang.String getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this PurchaseOrderDetail.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.String actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the adjustmentRevisionLevel value for this PurchaseOrderDetail.
     * 
     * @return adjustmentRevisionLevel
     */
    public java.lang.Integer getAdjustmentRevisionLevel() {
        return adjustmentRevisionLevel;
    }


    /**
     * Sets the adjustmentRevisionLevel value for this PurchaseOrderDetail.
     * 
     * @param adjustmentRevisionLevel
     */
    public void setAdjustmentRevisionLevel(java.lang.Integer adjustmentRevisionLevel) {
        this.adjustmentRevisionLevel = adjustmentRevisionLevel;
    }


    /**
     * Gets the adjustmentScheduleCode value for this PurchaseOrderDetail.
     * 
     * @return adjustmentScheduleCode
     */
    public java.lang.String getAdjustmentScheduleCode() {
        return adjustmentScheduleCode;
    }


    /**
     * Sets the adjustmentScheduleCode value for this PurchaseOrderDetail.
     * 
     * @param adjustmentScheduleCode
     */
    public void setAdjustmentScheduleCode(java.lang.String adjustmentScheduleCode) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
    }


    /**
     * Gets the agreementId value for this PurchaseOrderDetail.
     * 
     * @return agreementId
     */
    public java.lang.String getAgreementId() {
        return agreementId;
    }


    /**
     * Sets the agreementId value for this PurchaseOrderDetail.
     * 
     * @param agreementId
     */
    public void setAgreementId(java.lang.String agreementId) {
        this.agreementId = agreementId;
    }


    /**
     * Gets the agreementSupplement value for this PurchaseOrderDetail.
     * 
     * @return agreementSupplement
     */
    public java.lang.Integer getAgreementSupplement() {
        return agreementSupplement;
    }


    /**
     * Sets the agreementSupplement value for this PurchaseOrderDetail.
     * 
     * @param agreementSupplement
     */
    public void setAgreementSupplement(java.lang.Integer agreementSupplement) {
        this.agreementSupplement = agreementSupplement;
    }


    /**
     * Gets the businessUnit value for this PurchaseOrderDetail.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this PurchaseOrderDetail.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the buyer value for this PurchaseOrderDetail.
     * 
     * @return buyer
     */
    public JP430000.bssv.e1.oracle.Entity getBuyer() {
        return buyer;
    }


    /**
     * Sets the buyer value for this PurchaseOrderDetail.
     * 
     * @param buyer
     */
    public void setBuyer(JP430000.bssv.e1.oracle.Entity buyer) {
        this.buyer = buyer;
    }


    /**
     * Gets the commodityClassCode value for this PurchaseOrderDetail.
     * 
     * @return commodityClassCode
     */
    public java.lang.String getCommodityClassCode() {
        return commodityClassCode;
    }


    /**
     * Sets the commodityClassCode value for this PurchaseOrderDetail.
     * 
     * @param commodityClassCode
     */
    public void setCommodityClassCode(java.lang.String commodityClassCode) {
        this.commodityClassCode = commodityClassCode;
    }


    /**
     * Gets the costExtended value for this PurchaseOrderDetail.
     * 
     * @return costExtended
     */
    public java.math.BigDecimal getCostExtended() {
        return costExtended;
    }


    /**
     * Sets the costExtended value for this PurchaseOrderDetail.
     * 
     * @param costExtended
     */
    public void setCostExtended(java.math.BigDecimal costExtended) {
        this.costExtended = costExtended;
    }


    /**
     * Gets the costObjectCode1 value for this PurchaseOrderDetail.
     * 
     * @return costObjectCode1
     */
    public java.lang.String getCostObjectCode1() {
        return costObjectCode1;
    }


    /**
     * Sets the costObjectCode1 value for this PurchaseOrderDetail.
     * 
     * @param costObjectCode1
     */
    public void setCostObjectCode1(java.lang.String costObjectCode1) {
        this.costObjectCode1 = costObjectCode1;
    }


    /**
     * Gets the costObjectCode2 value for this PurchaseOrderDetail.
     * 
     * @return costObjectCode2
     */
    public java.lang.String getCostObjectCode2() {
        return costObjectCode2;
    }


    /**
     * Sets the costObjectCode2 value for this PurchaseOrderDetail.
     * 
     * @param costObjectCode2
     */
    public void setCostObjectCode2(java.lang.String costObjectCode2) {
        this.costObjectCode2 = costObjectCode2;
    }


    /**
     * Gets the costObjectCode3 value for this PurchaseOrderDetail.
     * 
     * @return costObjectCode3
     */
    public java.lang.String getCostObjectCode3() {
        return costObjectCode3;
    }


    /**
     * Sets the costObjectCode3 value for this PurchaseOrderDetail.
     * 
     * @param costObjectCode3
     */
    public void setCostObjectCode3(java.lang.String costObjectCode3) {
        this.costObjectCode3 = costObjectCode3;
    }


    /**
     * Gets the costObjectCode4 value for this PurchaseOrderDetail.
     * 
     * @return costObjectCode4
     */
    public java.lang.String getCostObjectCode4() {
        return costObjectCode4;
    }


    /**
     * Sets the costObjectCode4 value for this PurchaseOrderDetail.
     * 
     * @param costObjectCode4
     */
    public void setCostObjectCode4(java.lang.String costObjectCode4) {
        this.costObjectCode4 = costObjectCode4;
    }


    /**
     * Gets the costObjectTypeCode1 value for this PurchaseOrderDetail.
     * 
     * @return costObjectTypeCode1
     */
    public java.lang.String getCostObjectTypeCode1() {
        return costObjectTypeCode1;
    }


    /**
     * Sets the costObjectTypeCode1 value for this PurchaseOrderDetail.
     * 
     * @param costObjectTypeCode1
     */
    public void setCostObjectTypeCode1(java.lang.String costObjectTypeCode1) {
        this.costObjectTypeCode1 = costObjectTypeCode1;
    }


    /**
     * Gets the costObjectTypeCode2 value for this PurchaseOrderDetail.
     * 
     * @return costObjectTypeCode2
     */
    public java.lang.String getCostObjectTypeCode2() {
        return costObjectTypeCode2;
    }


    /**
     * Sets the costObjectTypeCode2 value for this PurchaseOrderDetail.
     * 
     * @param costObjectTypeCode2
     */
    public void setCostObjectTypeCode2(java.lang.String costObjectTypeCode2) {
        this.costObjectTypeCode2 = costObjectTypeCode2;
    }


    /**
     * Gets the costObjectTypeCode3 value for this PurchaseOrderDetail.
     * 
     * @return costObjectTypeCode3
     */
    public java.lang.String getCostObjectTypeCode3() {
        return costObjectTypeCode3;
    }


    /**
     * Sets the costObjectTypeCode3 value for this PurchaseOrderDetail.
     * 
     * @param costObjectTypeCode3
     */
    public void setCostObjectTypeCode3(java.lang.String costObjectTypeCode3) {
        this.costObjectTypeCode3 = costObjectTypeCode3;
    }


    /**
     * Gets the costObjectTypeCode4 value for this PurchaseOrderDetail.
     * 
     * @return costObjectTypeCode4
     */
    public java.lang.String getCostObjectTypeCode4() {
        return costObjectTypeCode4;
    }


    /**
     * Sets the costObjectTypeCode4 value for this PurchaseOrderDetail.
     * 
     * @param costObjectTypeCode4
     */
    public void setCostObjectTypeCode4(java.lang.String costObjectTypeCode4) {
        this.costObjectTypeCode4 = costObjectTypeCode4;
    }


    /**
     * Gets the costUnitPurchasing value for this PurchaseOrderDetail.
     * 
     * @return costUnitPurchasing
     */
    public java.math.BigDecimal getCostUnitPurchasing() {
        return costUnitPurchasing;
    }


    /**
     * Sets the costUnitPurchasing value for this PurchaseOrderDetail.
     * 
     * @param costUnitPurchasing
     */
    public void setCostUnitPurchasing(java.math.BigDecimal costUnitPurchasing) {
        this.costUnitPurchasing = costUnitPurchasing;
    }


    /**
     * Gets the datesDetail value for this PurchaseOrderDetail.
     * 
     * @return datesDetail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderDatesDetail getDatesDetail() {
        return datesDetail;
    }


    /**
     * Sets the datesDetail value for this PurchaseOrderDetail.
     * 
     * @param datesDetail
     */
    public void setDatesDetail(JP430000.bssv.e1.oracle.PurchaseOrderDatesDetail datesDetail) {
        this.datesDetail = datesDetail;
    }


    /**
     * Gets the deliveryDetail value for this PurchaseOrderDetail.
     * 
     * @return deliveryDetail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderDeliveryDetail getDeliveryDetail() {
        return deliveryDetail;
    }


    /**
     * Sets the deliveryDetail value for this PurchaseOrderDetail.
     * 
     * @param deliveryDetail
     */
    public void setDeliveryDetail(JP430000.bssv.e1.oracle.PurchaseOrderDeliveryDetail deliveryDetail) {
        this.deliveryDetail = deliveryDetail;
    }


    /**
     * Gets the discountFactor value for this PurchaseOrderDetail.
     * 
     * @return discountFactor
     */
    public java.math.BigDecimal getDiscountFactor() {
        return discountFactor;
    }


    /**
     * Sets the discountFactor value for this PurchaseOrderDetail.
     * 
     * @param discountFactor
     */
    public void setDiscountFactor(java.math.BigDecimal discountFactor) {
        this.discountFactor = discountFactor;
    }


    /**
     * Gets the financialDetail value for this PurchaseOrderDetail.
     * 
     * @return financialDetail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderFinancialDetail getFinancialDetail() {
        return financialDetail;
    }


    /**
     * Sets the financialDetail value for this PurchaseOrderDetail.
     * 
     * @param financialDetail
     */
    public void setFinancialDetail(JP430000.bssv.e1.oracle.PurchaseOrderFinancialDetail financialDetail) {
        this.financialDetail = financialDetail;
    }


    /**
     * Gets the freezeWorkOrder value for this PurchaseOrderDetail.
     * 
     * @return freezeWorkOrder
     */
    public java.lang.String getFreezeWorkOrder() {
        return freezeWorkOrder;
    }


    /**
     * Sets the freezeWorkOrder value for this PurchaseOrderDetail.
     * 
     * @param freezeWorkOrder
     */
    public void setFreezeWorkOrder(java.lang.String freezeWorkOrder) {
        this.freezeWorkOrder = freezeWorkOrder;
    }


    /**
     * Gets the matrixControlLine value for this PurchaseOrderDetail.
     * 
     * @return matrixControlLine
     */
    public java.math.BigDecimal getMatrixControlLine() {
        return matrixControlLine;
    }


    /**
     * Sets the matrixControlLine value for this PurchaseOrderDetail.
     * 
     * @param matrixControlLine
     */
    public void setMatrixControlLine(java.math.BigDecimal matrixControlLine) {
        this.matrixControlLine = matrixControlLine;
    }


    /**
     * Gets the originalOrderLineKey value for this PurchaseOrderDetail.
     * 
     * @return originalOrderLineKey
     */
    public JP430000.bssv.e1.oracle.OriginalOrderLineKey getOriginalOrderLineKey() {
        return originalOrderLineKey;
    }


    /**
     * Sets the originalOrderLineKey value for this PurchaseOrderDetail.
     * 
     * @param originalOrderLineKey
     */
    public void setOriginalOrderLineKey(JP430000.bssv.e1.oracle.OriginalOrderLineKey originalOrderLineKey) {
        this.originalOrderLineKey = originalOrderLineKey;
    }


    /**
     * Gets the priceLevel value for this PurchaseOrderDetail.
     * 
     * @return priceLevel
     */
    public java.lang.String getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this PurchaseOrderDetail.
     * 
     * @param priceLevel
     */
    public void setPriceLevel(java.lang.String priceLevel) {
        this.priceLevel = priceLevel;
    }


    /**
     * Gets the printMessageCode value for this PurchaseOrderDetail.
     * 
     * @return printMessageCode
     */
    public java.lang.String getPrintMessageCode() {
        return printMessageCode;
    }


    /**
     * Sets the printMessageCode value for this PurchaseOrderDetail.
     * 
     * @param printMessageCode
     */
    public void setPrintMessageCode(java.lang.String printMessageCode) {
        this.printMessageCode = printMessageCode;
    }


    /**
     * Gets the product value for this PurchaseOrderDetail.
     * 
     * @return product
     */
    public JP430000.bssv.e1.oracle.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this PurchaseOrderDetail.
     * 
     * @param product
     */
    public void setProduct(JP430000.bssv.e1.oracle.Product product) {
        this.product = product;
    }


    /**
     * Gets the project value for this PurchaseOrderDetail.
     * 
     * @return project
     */
    public JP430000.bssv.e1.oracle.Project getProject() {
        return project;
    }


    /**
     * Sets the project value for this PurchaseOrderDetail.
     * 
     * @param project
     */
    public void setProject(JP430000.bssv.e1.oracle.Project project) {
        this.project = project;
    }


    /**
     * Gets the promotionId value for this PurchaseOrderDetail.
     * 
     * @return promotionId
     */
    public java.lang.String getPromotionId() {
        return promotionId;
    }


    /**
     * Sets the promotionId value for this PurchaseOrderDetail.
     * 
     * @param promotionId
     */
    public void setPromotionId(java.lang.String promotionId) {
        this.promotionId = promotionId;
    }


    /**
     * Gets the purchaseOrderLineKey value for this PurchaseOrderDetail.
     * 
     * @return purchaseOrderLineKey
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderLineKey getPurchaseOrderLineKey() {
        return purchaseOrderLineKey;
    }


    /**
     * Sets the purchaseOrderLineKey value for this PurchaseOrderDetail.
     * 
     * @param purchaseOrderLineKey
     */
    public void setPurchaseOrderLineKey(JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey) {
        this.purchaseOrderLineKey = purchaseOrderLineKey;
    }


    /**
     * Gets the quantityOrdered value for this PurchaseOrderDetail.
     * 
     * @return quantityOrdered
     */
    public java.math.BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }


    /**
     * Sets the quantityOrdered value for this PurchaseOrderDetail.
     * 
     * @param quantityOrdered
     */
    public void setQuantityOrdered(java.math.BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }


    /**
     * Gets the quantityOrderedSecondary value for this PurchaseOrderDetail.
     * 
     * @return quantityOrderedSecondary
     */
    public java.math.BigDecimal getQuantityOrderedSecondary() {
        return quantityOrderedSecondary;
    }


    /**
     * Sets the quantityOrderedSecondary value for this PurchaseOrderDetail.
     * 
     * @param quantityOrderedSecondary
     */
    public void setQuantityOrderedSecondary(java.math.BigDecimal quantityOrderedSecondary) {
        this.quantityOrderedSecondary = quantityOrderedSecondary;
    }


    /**
     * Gets the reference value for this PurchaseOrderDetail.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this PurchaseOrderDetail.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the reference1 value for this PurchaseOrderDetail.
     * 
     * @return reference1
     */
    public java.lang.String getReference1() {
        return reference1;
    }


    /**
     * Sets the reference1 value for this PurchaseOrderDetail.
     * 
     * @param reference1
     */
    public void setReference1(java.lang.String reference1) {
        this.reference1 = reference1;
    }


    /**
     * Gets the relatedOrderLineKey value for this PurchaseOrderDetail.
     * 
     * @return relatedOrderLineKey
     */
    public JP430000.bssv.e1.oracle.RelatedOrderLineKey getRelatedOrderLineKey() {
        return relatedOrderLineKey;
    }


    /**
     * Sets the relatedOrderLineKey value for this PurchaseOrderDetail.
     * 
     * @param relatedOrderLineKey
     */
    public void setRelatedOrderLineKey(JP430000.bssv.e1.oracle.RelatedOrderLineKey relatedOrderLineKey) {
        this.relatedOrderLineKey = relatedOrderLineKey;
    }


    /**
     * Gets the relievePOBlanketOrder value for this PurchaseOrderDetail.
     * 
     * @return relievePOBlanketOrder
     */
    public java.lang.String getRelievePOBlanketOrder() {
        return relievePOBlanketOrder;
    }


    /**
     * Sets the relievePOBlanketOrder value for this PurchaseOrderDetail.
     * 
     * @param relievePOBlanketOrder
     */
    public void setRelievePOBlanketOrder(java.lang.String relievePOBlanketOrder) {
        this.relievePOBlanketOrder = relievePOBlanketOrder;
    }


    /**
     * Gets the reportingCodesPurchasing value for this PurchaseOrderDetail.
     * 
     * @return reportingCodesPurchasing
     */
    public JP430000.bssv.e1.oracle.ReportingCodesPurchasing getReportingCodesPurchasing() {
        return reportingCodesPurchasing;
    }


    /**
     * Sets the reportingCodesPurchasing value for this PurchaseOrderDetail.
     * 
     * @param reportingCodesPurchasing
     */
    public void setReportingCodesPurchasing(JP430000.bssv.e1.oracle.ReportingCodesPurchasing reportingCodesPurchasing) {
        this.reportingCodesPurchasing = reportingCodesPurchasing;
    }


    /**
     * Gets the shipTo value for this PurchaseOrderDetail.
     * 
     * @return shipTo
     */
    public JP430000.bssv.e1.oracle.Entity getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this PurchaseOrderDetail.
     * 
     * @param shipTo
     */
    public void setShipTo(JP430000.bssv.e1.oracle.Entity shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the shipmentId value for this PurchaseOrderDetail.
     * 
     * @return shipmentId
     */
    public java.lang.Integer getShipmentId() {
        return shipmentId;
    }


    /**
     * Sets the shipmentId value for this PurchaseOrderDetail.
     * 
     * @param shipmentId
     */
    public void setShipmentId(java.lang.Integer shipmentId) {
        this.shipmentId = shipmentId;
    }


    /**
     * Gets the statusCodeLast value for this PurchaseOrderDetail.
     * 
     * @return statusCodeLast
     */
    public java.lang.String getStatusCodeLast() {
        return statusCodeLast;
    }


    /**
     * Sets the statusCodeLast value for this PurchaseOrderDetail.
     * 
     * @param statusCodeLast
     */
    public void setStatusCodeLast(java.lang.String statusCodeLast) {
        this.statusCodeLast = statusCodeLast;
    }


    /**
     * Gets the statusCodeNext value for this PurchaseOrderDetail.
     * 
     * @return statusCodeNext
     */
    public java.lang.String getStatusCodeNext() {
        return statusCodeNext;
    }


    /**
     * Sets the statusCodeNext value for this PurchaseOrderDetail.
     * 
     * @param statusCodeNext
     */
    public void setStatusCodeNext(java.lang.String statusCodeNext) {
        this.statusCodeNext = statusCodeNext;
    }


    /**
     * Gets the supplierSO value for this PurchaseOrderDetail.
     * 
     * @return supplierSO
     */
    public java.lang.String getSupplierSO() {
        return supplierSO;
    }


    /**
     * Sets the supplierSO value for this PurchaseOrderDetail.
     * 
     * @param supplierSO
     */
    public void setSupplierSO(java.lang.String supplierSO) {
        this.supplierSO = supplierSO;
    }


    /**
     * Gets the taxDetail value for this PurchaseOrderDetail.
     * 
     * @return taxDetail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderTaxDetail getTaxDetail() {
        return taxDetail;
    }


    /**
     * Sets the taxDetail value for this PurchaseOrderDetail.
     * 
     * @param taxDetail
     */
    public void setTaxDetail(JP430000.bssv.e1.oracle.PurchaseOrderTaxDetail taxDetail) {
        this.taxDetail = taxDetail;
    }


    /**
     * Gets the transactionOriginator value for this PurchaseOrderDetail.
     * 
     * @return transactionOriginator
     */
    public java.lang.String getTransactionOriginator() {
        return transactionOriginator;
    }


    /**
     * Sets the transactionOriginator value for this PurchaseOrderDetail.
     * 
     * @param transactionOriginator
     */
    public void setTransactionOriginator(java.lang.String transactionOriginator) {
        this.transactionOriginator = transactionOriginator;
    }


    /**
     * Gets the transferDirectShip value for this PurchaseOrderDetail.
     * 
     * @return transferDirectShip
     */
    public java.lang.String getTransferDirectShip() {
        return transferDirectShip;
    }


    /**
     * Sets the transferDirectShip value for this PurchaseOrderDetail.
     * 
     * @param transferDirectShip
     */
    public void setTransferDirectShip(java.lang.String transferDirectShip) {
        this.transferDirectShip = transferDirectShip;
    }


    /**
     * Gets the unitOfMeasureCodePurchasing value for this PurchaseOrderDetail.
     * 
     * @return unitOfMeasureCodePurchasing
     */
    public java.lang.String getUnitOfMeasureCodePurchasing() {
        return unitOfMeasureCodePurchasing;
    }


    /**
     * Sets the unitOfMeasureCodePurchasing value for this PurchaseOrderDetail.
     * 
     * @param unitOfMeasureCodePurchasing
     */
    public void setUnitOfMeasureCodePurchasing(java.lang.String unitOfMeasureCodePurchasing) {
        this.unitOfMeasureCodePurchasing = unitOfMeasureCodePurchasing;
    }


    /**
     * Gets the unitOfMeasureCodeSecondary value for this PurchaseOrderDetail.
     * 
     * @return unitOfMeasureCodeSecondary
     */
    public java.lang.String getUnitOfMeasureCodeSecondary() {
        return unitOfMeasureCodeSecondary;
    }


    /**
     * Sets the unitOfMeasureCodeSecondary value for this PurchaseOrderDetail.
     * 
     * @param unitOfMeasureCodeSecondary
     */
    public void setUnitOfMeasureCodeSecondary(java.lang.String unitOfMeasureCodeSecondary) {
        this.unitOfMeasureCodeSecondary = unitOfMeasureCodeSecondary;
    }


    /**
     * Gets the unitOfMeasureCodeTransaction value for this PurchaseOrderDetail.
     * 
     * @return unitOfMeasureCodeTransaction
     */
    public java.lang.String getUnitOfMeasureCodeTransaction() {
        return unitOfMeasureCodeTransaction;
    }


    /**
     * Sets the unitOfMeasureCodeTransaction value for this PurchaseOrderDetail.
     * 
     * @param unitOfMeasureCodeTransaction
     */
    public void setUnitOfMeasureCodeTransaction(java.lang.String unitOfMeasureCodeTransaction) {
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }


    /**
     * Gets the unitOfMeasureCodeVolume value for this PurchaseOrderDetail.
     * 
     * @return unitOfMeasureCodeVolume
     */
    public java.lang.String getUnitOfMeasureCodeVolume() {
        return unitOfMeasureCodeVolume;
    }


    /**
     * Sets the unitOfMeasureCodeVolume value for this PurchaseOrderDetail.
     * 
     * @param unitOfMeasureCodeVolume
     */
    public void setUnitOfMeasureCodeVolume(java.lang.String unitOfMeasureCodeVolume) {
        this.unitOfMeasureCodeVolume = unitOfMeasureCodeVolume;
    }


    /**
     * Gets the unitOfMeasureCodeWeight value for this PurchaseOrderDetail.
     * 
     * @return unitOfMeasureCodeWeight
     */
    public java.lang.String getUnitOfMeasureCodeWeight() {
        return unitOfMeasureCodeWeight;
    }


    /**
     * Sets the unitOfMeasureCodeWeight value for this PurchaseOrderDetail.
     * 
     * @param unitOfMeasureCodeWeight
     */
    public void setUnitOfMeasureCodeWeight(java.lang.String unitOfMeasureCodeWeight) {
        this.unitOfMeasureCodeWeight = unitOfMeasureCodeWeight;
    }


    /**
     * Gets the unitVolume value for this PurchaseOrderDetail.
     * 
     * @return unitVolume
     */
    public java.math.BigDecimal getUnitVolume() {
        return unitVolume;
    }


    /**
     * Sets the unitVolume value for this PurchaseOrderDetail.
     * 
     * @param unitVolume
     */
    public void setUnitVolume(java.math.BigDecimal unitVolume) {
        this.unitVolume = unitVolume;
    }


    /**
     * Gets the unitWeight value for this PurchaseOrderDetail.
     * 
     * @return unitWeight
     */
    public java.math.BigDecimal getUnitWeight() {
        return unitWeight;
    }


    /**
     * Sets the unitWeight value for this PurchaseOrderDetail.
     * 
     * @param unitWeight
     */
    public void setUnitWeight(java.math.BigDecimal unitWeight) {
        this.unitWeight = unitWeight;
    }


    /**
     * Gets the userReservedData value for this PurchaseOrderDetail.
     * 
     * @return userReservedData
     */
    public JP430000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this PurchaseOrderDetail.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderDetail)) return false;
        PurchaseOrderDetail other = (PurchaseOrderDetail) obj;
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
            ((this.UNSPSCCode==null && other.getUNSPSCCode()==null) || 
             (this.UNSPSCCode!=null &&
              this.UNSPSCCode.equals(other.getUNSPSCCode()))) &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.adjustmentRevisionLevel==null && other.getAdjustmentRevisionLevel()==null) || 
             (this.adjustmentRevisionLevel!=null &&
              this.adjustmentRevisionLevel.equals(other.getAdjustmentRevisionLevel()))) &&
            ((this.adjustmentScheduleCode==null && other.getAdjustmentScheduleCode()==null) || 
             (this.adjustmentScheduleCode!=null &&
              this.adjustmentScheduleCode.equals(other.getAdjustmentScheduleCode()))) &&
            ((this.agreementId==null && other.getAgreementId()==null) || 
             (this.agreementId!=null &&
              this.agreementId.equals(other.getAgreementId()))) &&
            ((this.agreementSupplement==null && other.getAgreementSupplement()==null) || 
             (this.agreementSupplement!=null &&
              this.agreementSupplement.equals(other.getAgreementSupplement()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.buyer==null && other.getBuyer()==null) || 
             (this.buyer!=null &&
              this.buyer.equals(other.getBuyer()))) &&
            ((this.commodityClassCode==null && other.getCommodityClassCode()==null) || 
             (this.commodityClassCode!=null &&
              this.commodityClassCode.equals(other.getCommodityClassCode()))) &&
            ((this.costExtended==null && other.getCostExtended()==null) || 
             (this.costExtended!=null &&
              this.costExtended.equals(other.getCostExtended()))) &&
            ((this.costObjectCode1==null && other.getCostObjectCode1()==null) || 
             (this.costObjectCode1!=null &&
              this.costObjectCode1.equals(other.getCostObjectCode1()))) &&
            ((this.costObjectCode2==null && other.getCostObjectCode2()==null) || 
             (this.costObjectCode2!=null &&
              this.costObjectCode2.equals(other.getCostObjectCode2()))) &&
            ((this.costObjectCode3==null && other.getCostObjectCode3()==null) || 
             (this.costObjectCode3!=null &&
              this.costObjectCode3.equals(other.getCostObjectCode3()))) &&
            ((this.costObjectCode4==null && other.getCostObjectCode4()==null) || 
             (this.costObjectCode4!=null &&
              this.costObjectCode4.equals(other.getCostObjectCode4()))) &&
            ((this.costObjectTypeCode1==null && other.getCostObjectTypeCode1()==null) || 
             (this.costObjectTypeCode1!=null &&
              this.costObjectTypeCode1.equals(other.getCostObjectTypeCode1()))) &&
            ((this.costObjectTypeCode2==null && other.getCostObjectTypeCode2()==null) || 
             (this.costObjectTypeCode2!=null &&
              this.costObjectTypeCode2.equals(other.getCostObjectTypeCode2()))) &&
            ((this.costObjectTypeCode3==null && other.getCostObjectTypeCode3()==null) || 
             (this.costObjectTypeCode3!=null &&
              this.costObjectTypeCode3.equals(other.getCostObjectTypeCode3()))) &&
            ((this.costObjectTypeCode4==null && other.getCostObjectTypeCode4()==null) || 
             (this.costObjectTypeCode4!=null &&
              this.costObjectTypeCode4.equals(other.getCostObjectTypeCode4()))) &&
            ((this.costUnitPurchasing==null && other.getCostUnitPurchasing()==null) || 
             (this.costUnitPurchasing!=null &&
              this.costUnitPurchasing.equals(other.getCostUnitPurchasing()))) &&
            ((this.datesDetail==null && other.getDatesDetail()==null) || 
             (this.datesDetail!=null &&
              this.datesDetail.equals(other.getDatesDetail()))) &&
            ((this.deliveryDetail==null && other.getDeliveryDetail()==null) || 
             (this.deliveryDetail!=null &&
              this.deliveryDetail.equals(other.getDeliveryDetail()))) &&
            ((this.discountFactor==null && other.getDiscountFactor()==null) || 
             (this.discountFactor!=null &&
              this.discountFactor.equals(other.getDiscountFactor()))) &&
            ((this.financialDetail==null && other.getFinancialDetail()==null) || 
             (this.financialDetail!=null &&
              this.financialDetail.equals(other.getFinancialDetail()))) &&
            ((this.freezeWorkOrder==null && other.getFreezeWorkOrder()==null) || 
             (this.freezeWorkOrder!=null &&
              this.freezeWorkOrder.equals(other.getFreezeWorkOrder()))) &&
            ((this.matrixControlLine==null && other.getMatrixControlLine()==null) || 
             (this.matrixControlLine!=null &&
              this.matrixControlLine.equals(other.getMatrixControlLine()))) &&
            ((this.originalOrderLineKey==null && other.getOriginalOrderLineKey()==null) || 
             (this.originalOrderLineKey!=null &&
              this.originalOrderLineKey.equals(other.getOriginalOrderLineKey()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              this.priceLevel.equals(other.getPriceLevel()))) &&
            ((this.printMessageCode==null && other.getPrintMessageCode()==null) || 
             (this.printMessageCode!=null &&
              this.printMessageCode.equals(other.getPrintMessageCode()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.promotionId==null && other.getPromotionId()==null) || 
             (this.promotionId!=null &&
              this.promotionId.equals(other.getPromotionId()))) &&
            ((this.purchaseOrderLineKey==null && other.getPurchaseOrderLineKey()==null) || 
             (this.purchaseOrderLineKey!=null &&
              this.purchaseOrderLineKey.equals(other.getPurchaseOrderLineKey()))) &&
            ((this.quantityOrdered==null && other.getQuantityOrdered()==null) || 
             (this.quantityOrdered!=null &&
              this.quantityOrdered.equals(other.getQuantityOrdered()))) &&
            ((this.quantityOrderedSecondary==null && other.getQuantityOrderedSecondary()==null) || 
             (this.quantityOrderedSecondary!=null &&
              this.quantityOrderedSecondary.equals(other.getQuantityOrderedSecondary()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.reference1==null && other.getReference1()==null) || 
             (this.reference1!=null &&
              this.reference1.equals(other.getReference1()))) &&
            ((this.relatedOrderLineKey==null && other.getRelatedOrderLineKey()==null) || 
             (this.relatedOrderLineKey!=null &&
              this.relatedOrderLineKey.equals(other.getRelatedOrderLineKey()))) &&
            ((this.relievePOBlanketOrder==null && other.getRelievePOBlanketOrder()==null) || 
             (this.relievePOBlanketOrder!=null &&
              this.relievePOBlanketOrder.equals(other.getRelievePOBlanketOrder()))) &&
            ((this.reportingCodesPurchasing==null && other.getReportingCodesPurchasing()==null) || 
             (this.reportingCodesPurchasing!=null &&
              this.reportingCodesPurchasing.equals(other.getReportingCodesPurchasing()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.shipmentId==null && other.getShipmentId()==null) || 
             (this.shipmentId!=null &&
              this.shipmentId.equals(other.getShipmentId()))) &&
            ((this.statusCodeLast==null && other.getStatusCodeLast()==null) || 
             (this.statusCodeLast!=null &&
              this.statusCodeLast.equals(other.getStatusCodeLast()))) &&
            ((this.statusCodeNext==null && other.getStatusCodeNext()==null) || 
             (this.statusCodeNext!=null &&
              this.statusCodeNext.equals(other.getStatusCodeNext()))) &&
            ((this.supplierSO==null && other.getSupplierSO()==null) || 
             (this.supplierSO!=null &&
              this.supplierSO.equals(other.getSupplierSO()))) &&
            ((this.taxDetail==null && other.getTaxDetail()==null) || 
             (this.taxDetail!=null &&
              this.taxDetail.equals(other.getTaxDetail()))) &&
            ((this.transactionOriginator==null && other.getTransactionOriginator()==null) || 
             (this.transactionOriginator!=null &&
              this.transactionOriginator.equals(other.getTransactionOriginator()))) &&
            ((this.transferDirectShip==null && other.getTransferDirectShip()==null) || 
             (this.transferDirectShip!=null &&
              this.transferDirectShip.equals(other.getTransferDirectShip()))) &&
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
        if (getUNSPSCCode() != null) {
            _hashCode += getUNSPSCCode().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getAdjustmentRevisionLevel() != null) {
            _hashCode += getAdjustmentRevisionLevel().hashCode();
        }
        if (getAdjustmentScheduleCode() != null) {
            _hashCode += getAdjustmentScheduleCode().hashCode();
        }
        if (getAgreementId() != null) {
            _hashCode += getAgreementId().hashCode();
        }
        if (getAgreementSupplement() != null) {
            _hashCode += getAgreementSupplement().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getBuyer() != null) {
            _hashCode += getBuyer().hashCode();
        }
        if (getCommodityClassCode() != null) {
            _hashCode += getCommodityClassCode().hashCode();
        }
        if (getCostExtended() != null) {
            _hashCode += getCostExtended().hashCode();
        }
        if (getCostObjectCode1() != null) {
            _hashCode += getCostObjectCode1().hashCode();
        }
        if (getCostObjectCode2() != null) {
            _hashCode += getCostObjectCode2().hashCode();
        }
        if (getCostObjectCode3() != null) {
            _hashCode += getCostObjectCode3().hashCode();
        }
        if (getCostObjectCode4() != null) {
            _hashCode += getCostObjectCode4().hashCode();
        }
        if (getCostObjectTypeCode1() != null) {
            _hashCode += getCostObjectTypeCode1().hashCode();
        }
        if (getCostObjectTypeCode2() != null) {
            _hashCode += getCostObjectTypeCode2().hashCode();
        }
        if (getCostObjectTypeCode3() != null) {
            _hashCode += getCostObjectTypeCode3().hashCode();
        }
        if (getCostObjectTypeCode4() != null) {
            _hashCode += getCostObjectTypeCode4().hashCode();
        }
        if (getCostUnitPurchasing() != null) {
            _hashCode += getCostUnitPurchasing().hashCode();
        }
        if (getDatesDetail() != null) {
            _hashCode += getDatesDetail().hashCode();
        }
        if (getDeliveryDetail() != null) {
            _hashCode += getDeliveryDetail().hashCode();
        }
        if (getDiscountFactor() != null) {
            _hashCode += getDiscountFactor().hashCode();
        }
        if (getFinancialDetail() != null) {
            _hashCode += getFinancialDetail().hashCode();
        }
        if (getFreezeWorkOrder() != null) {
            _hashCode += getFreezeWorkOrder().hashCode();
        }
        if (getMatrixControlLine() != null) {
            _hashCode += getMatrixControlLine().hashCode();
        }
        if (getOriginalOrderLineKey() != null) {
            _hashCode += getOriginalOrderLineKey().hashCode();
        }
        if (getPriceLevel() != null) {
            _hashCode += getPriceLevel().hashCode();
        }
        if (getPrintMessageCode() != null) {
            _hashCode += getPrintMessageCode().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getPromotionId() != null) {
            _hashCode += getPromotionId().hashCode();
        }
        if (getPurchaseOrderLineKey() != null) {
            _hashCode += getPurchaseOrderLineKey().hashCode();
        }
        if (getQuantityOrdered() != null) {
            _hashCode += getQuantityOrdered().hashCode();
        }
        if (getQuantityOrderedSecondary() != null) {
            _hashCode += getQuantityOrderedSecondary().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getReference1() != null) {
            _hashCode += getReference1().hashCode();
        }
        if (getRelatedOrderLineKey() != null) {
            _hashCode += getRelatedOrderLineKey().hashCode();
        }
        if (getRelievePOBlanketOrder() != null) {
            _hashCode += getRelievePOBlanketOrder().hashCode();
        }
        if (getReportingCodesPurchasing() != null) {
            _hashCode += getReportingCodesPurchasing().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getShipmentId() != null) {
            _hashCode += getShipmentId().hashCode();
        }
        if (getStatusCodeLast() != null) {
            _hashCode += getStatusCodeLast().hashCode();
        }
        if (getStatusCodeNext() != null) {
            _hashCode += getStatusCodeNext().hashCode();
        }
        if (getSupplierSO() != null) {
            _hashCode += getSupplierSO().hashCode();
        }
        if (getTaxDetail() != null) {
            _hashCode += getTaxDetail().hashCode();
        }
        if (getTransactionOriginator() != null) {
            _hashCode += getTransactionOriginator().hashCode();
        }
        if (getTransferDirectShip() != null) {
            _hashCode += getTransferDirectShip().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDetail"));
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
        elemField.setFieldName("UNSPSCCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UNSPSCCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentRevisionLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentRevisionLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("buyer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
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
        elemField.setFieldName("costExtended");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costExtended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costObjectCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costObjectCode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costObjectCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costObjectCode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costObjectCode3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costObjectCode3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costObjectCode4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costObjectCode4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costObjectTypeCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costObjectTypeCode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costObjectTypeCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costObjectTypeCode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costObjectTypeCode3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costObjectTypeCode3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costObjectTypeCode4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costObjectTypeCode4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costUnitPurchasing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costUnitPurchasing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datesDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datesDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDatesDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDeliveryDetail"));
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
        elemField.setFieldName("financialDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "financialDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderFinancialDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freezeWorkOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freezeWorkOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrixControlLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matrixControlLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceLevel"));
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
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "product"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "project"));
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
        elemField.setFieldName("quantityOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOrderedSecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityOrderedSecondary"));
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
        elemField.setFieldName("reference1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference1"));
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
        elemField.setFieldName("relievePOBlanketOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relievePOBlanketOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
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
        elemField.setFieldName("supplierSO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplierSO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderTaxDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionOriginator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionOriginator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDirectShip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferDirectShip"));
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
