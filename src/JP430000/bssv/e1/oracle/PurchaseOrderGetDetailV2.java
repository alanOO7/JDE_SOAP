/**
 * PurchaseOrderGetDetailV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderGetDetailV2  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.math.BigDecimal amountExtendedPrice;

    private java.math.BigDecimal amountTaxForeign;

    private java.lang.String businessUnit;

    private JP430000.bssv.e1.oracle.Entity buyer;

    private java.math.BigDecimal costUnitPurchasingDomestic;

    private java.math.BigDecimal costUnitPurchasingForeign;

    private JP430000.bssv.e1.oracle.PurchaseOrderGetDetailDates dates;

    private JP430000.bssv.e1.oracle.ItemGroupSupplier item;

    private java.lang.String modeOfTransportCode;

    private JP430000.bssv.e1.oracle.OriginalOrderLineKey originalOrderLineKey;

    private java.math.BigDecimal priceExtendedDomestic;

    private java.math.BigDecimal priceExtendedForeign;

    private java.math.BigDecimal priceUnitDomestic;

    private java.math.BigDecimal priceUnitForeign;

    private JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey;

    private JP430000.bssv.e1.oracle.PurchaseOrderGetQuantity quantity;

    private java.math.BigDecimal rateExchangeOverride;

    private java.lang.String reference1;

    private java.lang.String reference2;

    private JP430000.bssv.e1.oracle.RelatedOrderLineKey relatedOrderLineKey;

    private JP430000.bssv.e1.oracle.Entity shipTo;

    private java.lang.String shipToGLN;

    private java.lang.String statusCodeLast;

    private java.lang.String statusCodeNext;

    private JP430000.bssv.e1.oracle.Entity supplier;

    private java.lang.String supplierGLN;

    private java.lang.String taxExplanationCode;

    private java.lang.String taxRateAreaCode;

    private java.lang.String unitOfMeasureCodePurchasing;

    private JP430000.bssv.e1.oracle.UserReservedData userReservedData;

    public PurchaseOrderGetDetailV2() {
    }

    public PurchaseOrderGetDetailV2(
           java.math.BigDecimal amountExtendedPrice,
           java.math.BigDecimal amountTaxForeign,
           java.lang.String businessUnit,
           JP430000.bssv.e1.oracle.Entity buyer,
           java.math.BigDecimal costUnitPurchasingDomestic,
           java.math.BigDecimal costUnitPurchasingForeign,
           JP430000.bssv.e1.oracle.PurchaseOrderGetDetailDates dates,
           JP430000.bssv.e1.oracle.ItemGroupSupplier item,
           java.lang.String modeOfTransportCode,
           JP430000.bssv.e1.oracle.OriginalOrderLineKey originalOrderLineKey,
           java.math.BigDecimal priceExtendedDomestic,
           java.math.BigDecimal priceExtendedForeign,
           java.math.BigDecimal priceUnitDomestic,
           java.math.BigDecimal priceUnitForeign,
           JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey,
           JP430000.bssv.e1.oracle.PurchaseOrderGetQuantity quantity,
           java.math.BigDecimal rateExchangeOverride,
           java.lang.String reference1,
           java.lang.String reference2,
           JP430000.bssv.e1.oracle.RelatedOrderLineKey relatedOrderLineKey,
           JP430000.bssv.e1.oracle.Entity shipTo,
           java.lang.String shipToGLN,
           java.lang.String statusCodeLast,
           java.lang.String statusCodeNext,
           JP430000.bssv.e1.oracle.Entity supplier,
           java.lang.String supplierGLN,
           java.lang.String taxExplanationCode,
           java.lang.String taxRateAreaCode,
           java.lang.String unitOfMeasureCodePurchasing,
           JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.amountExtendedPrice = amountExtendedPrice;
        this.amountTaxForeign = amountTaxForeign;
        this.businessUnit = businessUnit;
        this.buyer = buyer;
        this.costUnitPurchasingDomestic = costUnitPurchasingDomestic;
        this.costUnitPurchasingForeign = costUnitPurchasingForeign;
        this.dates = dates;
        this.item = item;
        this.modeOfTransportCode = modeOfTransportCode;
        this.originalOrderLineKey = originalOrderLineKey;
        this.priceExtendedDomestic = priceExtendedDomestic;
        this.priceExtendedForeign = priceExtendedForeign;
        this.priceUnitDomestic = priceUnitDomestic;
        this.priceUnitForeign = priceUnitForeign;
        this.purchaseOrderLineKey = purchaseOrderLineKey;
        this.quantity = quantity;
        this.rateExchangeOverride = rateExchangeOverride;
        this.reference1 = reference1;
        this.reference2 = reference2;
        this.relatedOrderLineKey = relatedOrderLineKey;
        this.shipTo = shipTo;
        this.shipToGLN = shipToGLN;
        this.statusCodeLast = statusCodeLast;
        this.statusCodeNext = statusCodeNext;
        this.supplier = supplier;
        this.supplierGLN = supplierGLN;
        this.taxExplanationCode = taxExplanationCode;
        this.taxRateAreaCode = taxRateAreaCode;
        this.unitOfMeasureCodePurchasing = unitOfMeasureCodePurchasing;
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the amountExtendedPrice value for this PurchaseOrderGetDetailV2.
     * 
     * @return amountExtendedPrice
     */
    public java.math.BigDecimal getAmountExtendedPrice() {
        return amountExtendedPrice;
    }


    /**
     * Sets the amountExtendedPrice value for this PurchaseOrderGetDetailV2.
     * 
     * @param amountExtendedPrice
     */
    public void setAmountExtendedPrice(java.math.BigDecimal amountExtendedPrice) {
        this.amountExtendedPrice = amountExtendedPrice;
    }


    /**
     * Gets the amountTaxForeign value for this PurchaseOrderGetDetailV2.
     * 
     * @return amountTaxForeign
     */
    public java.math.BigDecimal getAmountTaxForeign() {
        return amountTaxForeign;
    }


    /**
     * Sets the amountTaxForeign value for this PurchaseOrderGetDetailV2.
     * 
     * @param amountTaxForeign
     */
    public void setAmountTaxForeign(java.math.BigDecimal amountTaxForeign) {
        this.amountTaxForeign = amountTaxForeign;
    }


    /**
     * Gets the businessUnit value for this PurchaseOrderGetDetailV2.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this PurchaseOrderGetDetailV2.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the buyer value for this PurchaseOrderGetDetailV2.
     * 
     * @return buyer
     */
    public JP430000.bssv.e1.oracle.Entity getBuyer() {
        return buyer;
    }


    /**
     * Sets the buyer value for this PurchaseOrderGetDetailV2.
     * 
     * @param buyer
     */
    public void setBuyer(JP430000.bssv.e1.oracle.Entity buyer) {
        this.buyer = buyer;
    }


    /**
     * Gets the costUnitPurchasingDomestic value for this PurchaseOrderGetDetailV2.
     * 
     * @return costUnitPurchasingDomestic
     */
    public java.math.BigDecimal getCostUnitPurchasingDomestic() {
        return costUnitPurchasingDomestic;
    }


    /**
     * Sets the costUnitPurchasingDomestic value for this PurchaseOrderGetDetailV2.
     * 
     * @param costUnitPurchasingDomestic
     */
    public void setCostUnitPurchasingDomestic(java.math.BigDecimal costUnitPurchasingDomestic) {
        this.costUnitPurchasingDomestic = costUnitPurchasingDomestic;
    }


    /**
     * Gets the costUnitPurchasingForeign value for this PurchaseOrderGetDetailV2.
     * 
     * @return costUnitPurchasingForeign
     */
    public java.math.BigDecimal getCostUnitPurchasingForeign() {
        return costUnitPurchasingForeign;
    }


    /**
     * Sets the costUnitPurchasingForeign value for this PurchaseOrderGetDetailV2.
     * 
     * @param costUnitPurchasingForeign
     */
    public void setCostUnitPurchasingForeign(java.math.BigDecimal costUnitPurchasingForeign) {
        this.costUnitPurchasingForeign = costUnitPurchasingForeign;
    }


    /**
     * Gets the dates value for this PurchaseOrderGetDetailV2.
     * 
     * @return dates
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderGetDetailDates getDates() {
        return dates;
    }


    /**
     * Sets the dates value for this PurchaseOrderGetDetailV2.
     * 
     * @param dates
     */
    public void setDates(JP430000.bssv.e1.oracle.PurchaseOrderGetDetailDates dates) {
        this.dates = dates;
    }


    /**
     * Gets the item value for this PurchaseOrderGetDetailV2.
     * 
     * @return item
     */
    public JP430000.bssv.e1.oracle.ItemGroupSupplier getItem() {
        return item;
    }


    /**
     * Sets the item value for this PurchaseOrderGetDetailV2.
     * 
     * @param item
     */
    public void setItem(JP430000.bssv.e1.oracle.ItemGroupSupplier item) {
        this.item = item;
    }


    /**
     * Gets the modeOfTransportCode value for this PurchaseOrderGetDetailV2.
     * 
     * @return modeOfTransportCode
     */
    public java.lang.String getModeOfTransportCode() {
        return modeOfTransportCode;
    }


    /**
     * Sets the modeOfTransportCode value for this PurchaseOrderGetDetailV2.
     * 
     * @param modeOfTransportCode
     */
    public void setModeOfTransportCode(java.lang.String modeOfTransportCode) {
        this.modeOfTransportCode = modeOfTransportCode;
    }


    /**
     * Gets the originalOrderLineKey value for this PurchaseOrderGetDetailV2.
     * 
     * @return originalOrderLineKey
     */
    public JP430000.bssv.e1.oracle.OriginalOrderLineKey getOriginalOrderLineKey() {
        return originalOrderLineKey;
    }


    /**
     * Sets the originalOrderLineKey value for this PurchaseOrderGetDetailV2.
     * 
     * @param originalOrderLineKey
     */
    public void setOriginalOrderLineKey(JP430000.bssv.e1.oracle.OriginalOrderLineKey originalOrderLineKey) {
        this.originalOrderLineKey = originalOrderLineKey;
    }


    /**
     * Gets the priceExtendedDomestic value for this PurchaseOrderGetDetailV2.
     * 
     * @return priceExtendedDomestic
     */
    public java.math.BigDecimal getPriceExtendedDomestic() {
        return priceExtendedDomestic;
    }


    /**
     * Sets the priceExtendedDomestic value for this PurchaseOrderGetDetailV2.
     * 
     * @param priceExtendedDomestic
     */
    public void setPriceExtendedDomestic(java.math.BigDecimal priceExtendedDomestic) {
        this.priceExtendedDomestic = priceExtendedDomestic;
    }


    /**
     * Gets the priceExtendedForeign value for this PurchaseOrderGetDetailV2.
     * 
     * @return priceExtendedForeign
     */
    public java.math.BigDecimal getPriceExtendedForeign() {
        return priceExtendedForeign;
    }


    /**
     * Sets the priceExtendedForeign value for this PurchaseOrderGetDetailV2.
     * 
     * @param priceExtendedForeign
     */
    public void setPriceExtendedForeign(java.math.BigDecimal priceExtendedForeign) {
        this.priceExtendedForeign = priceExtendedForeign;
    }


    /**
     * Gets the priceUnitDomestic value for this PurchaseOrderGetDetailV2.
     * 
     * @return priceUnitDomestic
     */
    public java.math.BigDecimal getPriceUnitDomestic() {
        return priceUnitDomestic;
    }


    /**
     * Sets the priceUnitDomestic value for this PurchaseOrderGetDetailV2.
     * 
     * @param priceUnitDomestic
     */
    public void setPriceUnitDomestic(java.math.BigDecimal priceUnitDomestic) {
        this.priceUnitDomestic = priceUnitDomestic;
    }


    /**
     * Gets the priceUnitForeign value for this PurchaseOrderGetDetailV2.
     * 
     * @return priceUnitForeign
     */
    public java.math.BigDecimal getPriceUnitForeign() {
        return priceUnitForeign;
    }


    /**
     * Sets the priceUnitForeign value for this PurchaseOrderGetDetailV2.
     * 
     * @param priceUnitForeign
     */
    public void setPriceUnitForeign(java.math.BigDecimal priceUnitForeign) {
        this.priceUnitForeign = priceUnitForeign;
    }


    /**
     * Gets the purchaseOrderLineKey value for this PurchaseOrderGetDetailV2.
     * 
     * @return purchaseOrderLineKey
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderLineKey getPurchaseOrderLineKey() {
        return purchaseOrderLineKey;
    }


    /**
     * Sets the purchaseOrderLineKey value for this PurchaseOrderGetDetailV2.
     * 
     * @param purchaseOrderLineKey
     */
    public void setPurchaseOrderLineKey(JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey) {
        this.purchaseOrderLineKey = purchaseOrderLineKey;
    }


    /**
     * Gets the quantity value for this PurchaseOrderGetDetailV2.
     * 
     * @return quantity
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderGetQuantity getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PurchaseOrderGetDetailV2.
     * 
     * @param quantity
     */
    public void setQuantity(JP430000.bssv.e1.oracle.PurchaseOrderGetQuantity quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the rateExchangeOverride value for this PurchaseOrderGetDetailV2.
     * 
     * @return rateExchangeOverride
     */
    public java.math.BigDecimal getRateExchangeOverride() {
        return rateExchangeOverride;
    }


    /**
     * Sets the rateExchangeOverride value for this PurchaseOrderGetDetailV2.
     * 
     * @param rateExchangeOverride
     */
    public void setRateExchangeOverride(java.math.BigDecimal rateExchangeOverride) {
        this.rateExchangeOverride = rateExchangeOverride;
    }


    /**
     * Gets the reference1 value for this PurchaseOrderGetDetailV2.
     * 
     * @return reference1
     */
    public java.lang.String getReference1() {
        return reference1;
    }


    /**
     * Sets the reference1 value for this PurchaseOrderGetDetailV2.
     * 
     * @param reference1
     */
    public void setReference1(java.lang.String reference1) {
        this.reference1 = reference1;
    }


    /**
     * Gets the reference2 value for this PurchaseOrderGetDetailV2.
     * 
     * @return reference2
     */
    public java.lang.String getReference2() {
        return reference2;
    }


    /**
     * Sets the reference2 value for this PurchaseOrderGetDetailV2.
     * 
     * @param reference2
     */
    public void setReference2(java.lang.String reference2) {
        this.reference2 = reference2;
    }


    /**
     * Gets the relatedOrderLineKey value for this PurchaseOrderGetDetailV2.
     * 
     * @return relatedOrderLineKey
     */
    public JP430000.bssv.e1.oracle.RelatedOrderLineKey getRelatedOrderLineKey() {
        return relatedOrderLineKey;
    }


    /**
     * Sets the relatedOrderLineKey value for this PurchaseOrderGetDetailV2.
     * 
     * @param relatedOrderLineKey
     */
    public void setRelatedOrderLineKey(JP430000.bssv.e1.oracle.RelatedOrderLineKey relatedOrderLineKey) {
        this.relatedOrderLineKey = relatedOrderLineKey;
    }


    /**
     * Gets the shipTo value for this PurchaseOrderGetDetailV2.
     * 
     * @return shipTo
     */
    public JP430000.bssv.e1.oracle.Entity getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this PurchaseOrderGetDetailV2.
     * 
     * @param shipTo
     */
    public void setShipTo(JP430000.bssv.e1.oracle.Entity shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the shipToGLN value for this PurchaseOrderGetDetailV2.
     * 
     * @return shipToGLN
     */
    public java.lang.String getShipToGLN() {
        return shipToGLN;
    }


    /**
     * Sets the shipToGLN value for this PurchaseOrderGetDetailV2.
     * 
     * @param shipToGLN
     */
    public void setShipToGLN(java.lang.String shipToGLN) {
        this.shipToGLN = shipToGLN;
    }


    /**
     * Gets the statusCodeLast value for this PurchaseOrderGetDetailV2.
     * 
     * @return statusCodeLast
     */
    public java.lang.String getStatusCodeLast() {
        return statusCodeLast;
    }


    /**
     * Sets the statusCodeLast value for this PurchaseOrderGetDetailV2.
     * 
     * @param statusCodeLast
     */
    public void setStatusCodeLast(java.lang.String statusCodeLast) {
        this.statusCodeLast = statusCodeLast;
    }


    /**
     * Gets the statusCodeNext value for this PurchaseOrderGetDetailV2.
     * 
     * @return statusCodeNext
     */
    public java.lang.String getStatusCodeNext() {
        return statusCodeNext;
    }


    /**
     * Sets the statusCodeNext value for this PurchaseOrderGetDetailV2.
     * 
     * @param statusCodeNext
     */
    public void setStatusCodeNext(java.lang.String statusCodeNext) {
        this.statusCodeNext = statusCodeNext;
    }


    /**
     * Gets the supplier value for this PurchaseOrderGetDetailV2.
     * 
     * @return supplier
     */
    public JP430000.bssv.e1.oracle.Entity getSupplier() {
        return supplier;
    }


    /**
     * Sets the supplier value for this PurchaseOrderGetDetailV2.
     * 
     * @param supplier
     */
    public void setSupplier(JP430000.bssv.e1.oracle.Entity supplier) {
        this.supplier = supplier;
    }


    /**
     * Gets the supplierGLN value for this PurchaseOrderGetDetailV2.
     * 
     * @return supplierGLN
     */
    public java.lang.String getSupplierGLN() {
        return supplierGLN;
    }


    /**
     * Sets the supplierGLN value for this PurchaseOrderGetDetailV2.
     * 
     * @param supplierGLN
     */
    public void setSupplierGLN(java.lang.String supplierGLN) {
        this.supplierGLN = supplierGLN;
    }


    /**
     * Gets the taxExplanationCode value for this PurchaseOrderGetDetailV2.
     * 
     * @return taxExplanationCode
     */
    public java.lang.String getTaxExplanationCode() {
        return taxExplanationCode;
    }


    /**
     * Sets the taxExplanationCode value for this PurchaseOrderGetDetailV2.
     * 
     * @param taxExplanationCode
     */
    public void setTaxExplanationCode(java.lang.String taxExplanationCode) {
        this.taxExplanationCode = taxExplanationCode;
    }


    /**
     * Gets the taxRateAreaCode value for this PurchaseOrderGetDetailV2.
     * 
     * @return taxRateAreaCode
     */
    public java.lang.String getTaxRateAreaCode() {
        return taxRateAreaCode;
    }


    /**
     * Sets the taxRateAreaCode value for this PurchaseOrderGetDetailV2.
     * 
     * @param taxRateAreaCode
     */
    public void setTaxRateAreaCode(java.lang.String taxRateAreaCode) {
        this.taxRateAreaCode = taxRateAreaCode;
    }


    /**
     * Gets the unitOfMeasureCodePurchasing value for this PurchaseOrderGetDetailV2.
     * 
     * @return unitOfMeasureCodePurchasing
     */
    public java.lang.String getUnitOfMeasureCodePurchasing() {
        return unitOfMeasureCodePurchasing;
    }


    /**
     * Sets the unitOfMeasureCodePurchasing value for this PurchaseOrderGetDetailV2.
     * 
     * @param unitOfMeasureCodePurchasing
     */
    public void setUnitOfMeasureCodePurchasing(java.lang.String unitOfMeasureCodePurchasing) {
        this.unitOfMeasureCodePurchasing = unitOfMeasureCodePurchasing;
    }


    /**
     * Gets the userReservedData value for this PurchaseOrderGetDetailV2.
     * 
     * @return userReservedData
     */
    public JP430000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this PurchaseOrderGetDetailV2.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderGetDetailV2)) return false;
        PurchaseOrderGetDetailV2 other = (PurchaseOrderGetDetailV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amountExtendedPrice==null && other.getAmountExtendedPrice()==null) || 
             (this.amountExtendedPrice!=null &&
              this.amountExtendedPrice.equals(other.getAmountExtendedPrice()))) &&
            ((this.amountTaxForeign==null && other.getAmountTaxForeign()==null) || 
             (this.amountTaxForeign!=null &&
              this.amountTaxForeign.equals(other.getAmountTaxForeign()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.buyer==null && other.getBuyer()==null) || 
             (this.buyer!=null &&
              this.buyer.equals(other.getBuyer()))) &&
            ((this.costUnitPurchasingDomestic==null && other.getCostUnitPurchasingDomestic()==null) || 
             (this.costUnitPurchasingDomestic!=null &&
              this.costUnitPurchasingDomestic.equals(other.getCostUnitPurchasingDomestic()))) &&
            ((this.costUnitPurchasingForeign==null && other.getCostUnitPurchasingForeign()==null) || 
             (this.costUnitPurchasingForeign!=null &&
              this.costUnitPurchasingForeign.equals(other.getCostUnitPurchasingForeign()))) &&
            ((this.dates==null && other.getDates()==null) || 
             (this.dates!=null &&
              this.dates.equals(other.getDates()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.modeOfTransportCode==null && other.getModeOfTransportCode()==null) || 
             (this.modeOfTransportCode!=null &&
              this.modeOfTransportCode.equals(other.getModeOfTransportCode()))) &&
            ((this.originalOrderLineKey==null && other.getOriginalOrderLineKey()==null) || 
             (this.originalOrderLineKey!=null &&
              this.originalOrderLineKey.equals(other.getOriginalOrderLineKey()))) &&
            ((this.priceExtendedDomestic==null && other.getPriceExtendedDomestic()==null) || 
             (this.priceExtendedDomestic!=null &&
              this.priceExtendedDomestic.equals(other.getPriceExtendedDomestic()))) &&
            ((this.priceExtendedForeign==null && other.getPriceExtendedForeign()==null) || 
             (this.priceExtendedForeign!=null &&
              this.priceExtendedForeign.equals(other.getPriceExtendedForeign()))) &&
            ((this.priceUnitDomestic==null && other.getPriceUnitDomestic()==null) || 
             (this.priceUnitDomestic!=null &&
              this.priceUnitDomestic.equals(other.getPriceUnitDomestic()))) &&
            ((this.priceUnitForeign==null && other.getPriceUnitForeign()==null) || 
             (this.priceUnitForeign!=null &&
              this.priceUnitForeign.equals(other.getPriceUnitForeign()))) &&
            ((this.purchaseOrderLineKey==null && other.getPurchaseOrderLineKey()==null) || 
             (this.purchaseOrderLineKey!=null &&
              this.purchaseOrderLineKey.equals(other.getPurchaseOrderLineKey()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.rateExchangeOverride==null && other.getRateExchangeOverride()==null) || 
             (this.rateExchangeOverride!=null &&
              this.rateExchangeOverride.equals(other.getRateExchangeOverride()))) &&
            ((this.reference1==null && other.getReference1()==null) || 
             (this.reference1!=null &&
              this.reference1.equals(other.getReference1()))) &&
            ((this.reference2==null && other.getReference2()==null) || 
             (this.reference2!=null &&
              this.reference2.equals(other.getReference2()))) &&
            ((this.relatedOrderLineKey==null && other.getRelatedOrderLineKey()==null) || 
             (this.relatedOrderLineKey!=null &&
              this.relatedOrderLineKey.equals(other.getRelatedOrderLineKey()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.shipToGLN==null && other.getShipToGLN()==null) || 
             (this.shipToGLN!=null &&
              this.shipToGLN.equals(other.getShipToGLN()))) &&
            ((this.statusCodeLast==null && other.getStatusCodeLast()==null) || 
             (this.statusCodeLast!=null &&
              this.statusCodeLast.equals(other.getStatusCodeLast()))) &&
            ((this.statusCodeNext==null && other.getStatusCodeNext()==null) || 
             (this.statusCodeNext!=null &&
              this.statusCodeNext.equals(other.getStatusCodeNext()))) &&
            ((this.supplier==null && other.getSupplier()==null) || 
             (this.supplier!=null &&
              this.supplier.equals(other.getSupplier()))) &&
            ((this.supplierGLN==null && other.getSupplierGLN()==null) || 
             (this.supplierGLN!=null &&
              this.supplierGLN.equals(other.getSupplierGLN()))) &&
            ((this.taxExplanationCode==null && other.getTaxExplanationCode()==null) || 
             (this.taxExplanationCode!=null &&
              this.taxExplanationCode.equals(other.getTaxExplanationCode()))) &&
            ((this.taxRateAreaCode==null && other.getTaxRateAreaCode()==null) || 
             (this.taxRateAreaCode!=null &&
              this.taxRateAreaCode.equals(other.getTaxRateAreaCode()))) &&
            ((this.unitOfMeasureCodePurchasing==null && other.getUnitOfMeasureCodePurchasing()==null) || 
             (this.unitOfMeasureCodePurchasing!=null &&
              this.unitOfMeasureCodePurchasing.equals(other.getUnitOfMeasureCodePurchasing()))) &&
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
        if (getAmountExtendedPrice() != null) {
            _hashCode += getAmountExtendedPrice().hashCode();
        }
        if (getAmountTaxForeign() != null) {
            _hashCode += getAmountTaxForeign().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getBuyer() != null) {
            _hashCode += getBuyer().hashCode();
        }
        if (getCostUnitPurchasingDomestic() != null) {
            _hashCode += getCostUnitPurchasingDomestic().hashCode();
        }
        if (getCostUnitPurchasingForeign() != null) {
            _hashCode += getCostUnitPurchasingForeign().hashCode();
        }
        if (getDates() != null) {
            _hashCode += getDates().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getModeOfTransportCode() != null) {
            _hashCode += getModeOfTransportCode().hashCode();
        }
        if (getOriginalOrderLineKey() != null) {
            _hashCode += getOriginalOrderLineKey().hashCode();
        }
        if (getPriceExtendedDomestic() != null) {
            _hashCode += getPriceExtendedDomestic().hashCode();
        }
        if (getPriceExtendedForeign() != null) {
            _hashCode += getPriceExtendedForeign().hashCode();
        }
        if (getPriceUnitDomestic() != null) {
            _hashCode += getPriceUnitDomestic().hashCode();
        }
        if (getPriceUnitForeign() != null) {
            _hashCode += getPriceUnitForeign().hashCode();
        }
        if (getPurchaseOrderLineKey() != null) {
            _hashCode += getPurchaseOrderLineKey().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRateExchangeOverride() != null) {
            _hashCode += getRateExchangeOverride().hashCode();
        }
        if (getReference1() != null) {
            _hashCode += getReference1().hashCode();
        }
        if (getReference2() != null) {
            _hashCode += getReference2().hashCode();
        }
        if (getRelatedOrderLineKey() != null) {
            _hashCode += getRelatedOrderLineKey().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getShipToGLN() != null) {
            _hashCode += getShipToGLN().hashCode();
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
        if (getSupplierGLN() != null) {
            _hashCode += getSupplierGLN().hashCode();
        }
        if (getTaxExplanationCode() != null) {
            _hashCode += getTaxExplanationCode().hashCode();
        }
        if (getTaxRateAreaCode() != null) {
            _hashCode += getTaxRateAreaCode().hashCode();
        }
        if (getUnitOfMeasureCodePurchasing() != null) {
            _hashCode += getUnitOfMeasureCodePurchasing().hashCode();
        }
        if (getUserReservedData() != null) {
            _hashCode += getUserReservedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderGetDetailV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetDetailV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountExtendedPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountExtendedPrice"));
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
        elemField.setFieldName("dates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetDetailDates"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "itemGroupSupplier"));
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
        elemField.setFieldName("originalOrderLineKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalOrderLineKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "originalOrderLineKey"));
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
        elemField.setFieldName("purchaseOrderLineKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrderLineKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderLineKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetQuantity"));
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
        elemField.setFieldName("reference1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference2"));
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
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipToGLN"));
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
        elemField.setFieldName("supplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplierGLN"));
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
        elemField.setFieldName("unitOfMeasureCodePurchasing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodePurchasing"));
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
