/**
 * PurchaseOrderDetailForApproverResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderDetailForApproverResults  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String acctNumber;

    private java.math.BigDecimal amountExtendedPrice;

    private java.math.BigDecimal amountForeignExtendPrice;

    private java.lang.String assetIDNumber;

    private java.lang.String businessUnitCode;

    private java.lang.String companyKeyOrderNo;

    private java.lang.String companyKeyRelated;

    private java.lang.String currencyCodeForeign;

    private java.util.Calendar dateRequested;

    private java.util.Calendar dateTransaction;

    private java.lang.String descriptionLine1;

    private java.math.BigDecimal discountFactor;

    private java.math.BigDecimal documentLineNumber;

    private java.lang.Integer documentOrderInvoiceNumber;

    private java.lang.String documentOrderTypeCode;

    private java.lang.String documentSuffix;

    private java.math.BigDecimal foreignPurchasingPrice;

    private java.lang.String identifier2NdItem;

    private java.lang.Integer identifierShortItem;

    private java.lang.String lineTypeCode;

    private java.lang.String orderTypeCodeRelated;

    private java.math.BigDecimal poSoLineNoRelated;

    private java.lang.String poSoNumberRelated;

    private java.math.BigDecimal purchasingUnitPrice;

    private JP430000.bssv.e1.oracle.Entity shipTo;

    private java.lang.String statusCodeNextCode;

    private java.lang.String statusLastCode;

    private java.lang.String subledger;

    private java.lang.String subledgerTypeCode;

    private JP430000.bssv.e1.oracle.Entity supplier;

    private java.lang.String unitOfMeasureCode;

    private java.lang.String unitOfMeasurePurchasing;

    private java.math.BigDecimal unitsTransactionQty;

    public PurchaseOrderDetailForApproverResults() {
    }

    public PurchaseOrderDetailForApproverResults(
           java.lang.String acctNumber,
           java.math.BigDecimal amountExtendedPrice,
           java.math.BigDecimal amountForeignExtendPrice,
           java.lang.String assetIDNumber,
           java.lang.String businessUnitCode,
           java.lang.String companyKeyOrderNo,
           java.lang.String companyKeyRelated,
           java.lang.String currencyCodeForeign,
           java.util.Calendar dateRequested,
           java.util.Calendar dateTransaction,
           java.lang.String descriptionLine1,
           java.math.BigDecimal discountFactor,
           java.math.BigDecimal documentLineNumber,
           java.lang.Integer documentOrderInvoiceNumber,
           java.lang.String documentOrderTypeCode,
           java.lang.String documentSuffix,
           java.math.BigDecimal foreignPurchasingPrice,
           java.lang.String identifier2NdItem,
           java.lang.Integer identifierShortItem,
           java.lang.String lineTypeCode,
           java.lang.String orderTypeCodeRelated,
           java.math.BigDecimal poSoLineNoRelated,
           java.lang.String poSoNumberRelated,
           java.math.BigDecimal purchasingUnitPrice,
           JP430000.bssv.e1.oracle.Entity shipTo,
           java.lang.String statusCodeNextCode,
           java.lang.String statusLastCode,
           java.lang.String subledger,
           java.lang.String subledgerTypeCode,
           JP430000.bssv.e1.oracle.Entity supplier,
           java.lang.String unitOfMeasureCode,
           java.lang.String unitOfMeasurePurchasing,
           java.math.BigDecimal unitsTransactionQty) {
        this.acctNumber = acctNumber;
        this.amountExtendedPrice = amountExtendedPrice;
        this.amountForeignExtendPrice = amountForeignExtendPrice;
        this.assetIDNumber = assetIDNumber;
        this.businessUnitCode = businessUnitCode;
        this.companyKeyOrderNo = companyKeyOrderNo;
        this.companyKeyRelated = companyKeyRelated;
        this.currencyCodeForeign = currencyCodeForeign;
        this.dateRequested = dateRequested;
        this.dateTransaction = dateTransaction;
        this.descriptionLine1 = descriptionLine1;
        this.discountFactor = discountFactor;
        this.documentLineNumber = documentLineNumber;
        this.documentOrderInvoiceNumber = documentOrderInvoiceNumber;
        this.documentOrderTypeCode = documentOrderTypeCode;
        this.documentSuffix = documentSuffix;
        this.foreignPurchasingPrice = foreignPurchasingPrice;
        this.identifier2NdItem = identifier2NdItem;
        this.identifierShortItem = identifierShortItem;
        this.lineTypeCode = lineTypeCode;
        this.orderTypeCodeRelated = orderTypeCodeRelated;
        this.poSoLineNoRelated = poSoLineNoRelated;
        this.poSoNumberRelated = poSoNumberRelated;
        this.purchasingUnitPrice = purchasingUnitPrice;
        this.shipTo = shipTo;
        this.statusCodeNextCode = statusCodeNextCode;
        this.statusLastCode = statusLastCode;
        this.subledger = subledger;
        this.subledgerTypeCode = subledgerTypeCode;
        this.supplier = supplier;
        this.unitOfMeasureCode = unitOfMeasureCode;
        this.unitOfMeasurePurchasing = unitOfMeasurePurchasing;
        this.unitsTransactionQty = unitsTransactionQty;
    }


    /**
     * Gets the acctNumber value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return acctNumber
     */
    public java.lang.String getAcctNumber() {
        return acctNumber;
    }


    /**
     * Sets the acctNumber value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param acctNumber
     */
    public void setAcctNumber(java.lang.String acctNumber) {
        this.acctNumber = acctNumber;
    }


    /**
     * Gets the amountExtendedPrice value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return amountExtendedPrice
     */
    public java.math.BigDecimal getAmountExtendedPrice() {
        return amountExtendedPrice;
    }


    /**
     * Sets the amountExtendedPrice value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param amountExtendedPrice
     */
    public void setAmountExtendedPrice(java.math.BigDecimal amountExtendedPrice) {
        this.amountExtendedPrice = amountExtendedPrice;
    }


    /**
     * Gets the amountForeignExtendPrice value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return amountForeignExtendPrice
     */
    public java.math.BigDecimal getAmountForeignExtendPrice() {
        return amountForeignExtendPrice;
    }


    /**
     * Sets the amountForeignExtendPrice value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param amountForeignExtendPrice
     */
    public void setAmountForeignExtendPrice(java.math.BigDecimal amountForeignExtendPrice) {
        this.amountForeignExtendPrice = amountForeignExtendPrice;
    }


    /**
     * Gets the assetIDNumber value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return assetIDNumber
     */
    public java.lang.String getAssetIDNumber() {
        return assetIDNumber;
    }


    /**
     * Sets the assetIDNumber value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param assetIDNumber
     */
    public void setAssetIDNumber(java.lang.String assetIDNumber) {
        this.assetIDNumber = assetIDNumber;
    }


    /**
     * Gets the businessUnitCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return businessUnitCode
     */
    public java.lang.String getBusinessUnitCode() {
        return businessUnitCode;
    }


    /**
     * Sets the businessUnitCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param businessUnitCode
     */
    public void setBusinessUnitCode(java.lang.String businessUnitCode) {
        this.businessUnitCode = businessUnitCode;
    }


    /**
     * Gets the companyKeyOrderNo value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return companyKeyOrderNo
     */
    public java.lang.String getCompanyKeyOrderNo() {
        return companyKeyOrderNo;
    }


    /**
     * Sets the companyKeyOrderNo value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param companyKeyOrderNo
     */
    public void setCompanyKeyOrderNo(java.lang.String companyKeyOrderNo) {
        this.companyKeyOrderNo = companyKeyOrderNo;
    }


    /**
     * Gets the companyKeyRelated value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return companyKeyRelated
     */
    public java.lang.String getCompanyKeyRelated() {
        return companyKeyRelated;
    }


    /**
     * Sets the companyKeyRelated value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param companyKeyRelated
     */
    public void setCompanyKeyRelated(java.lang.String companyKeyRelated) {
        this.companyKeyRelated = companyKeyRelated;
    }


    /**
     * Gets the currencyCodeForeign value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return currencyCodeForeign
     */
    public java.lang.String getCurrencyCodeForeign() {
        return currencyCodeForeign;
    }


    /**
     * Sets the currencyCodeForeign value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param currencyCodeForeign
     */
    public void setCurrencyCodeForeign(java.lang.String currencyCodeForeign) {
        this.currencyCodeForeign = currencyCodeForeign;
    }


    /**
     * Gets the dateRequested value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the dateTransaction value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return dateTransaction
     */
    public java.util.Calendar getDateTransaction() {
        return dateTransaction;
    }


    /**
     * Sets the dateTransaction value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param dateTransaction
     */
    public void setDateTransaction(java.util.Calendar dateTransaction) {
        this.dateTransaction = dateTransaction;
    }


    /**
     * Gets the descriptionLine1 value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return descriptionLine1
     */
    public java.lang.String getDescriptionLine1() {
        return descriptionLine1;
    }


    /**
     * Sets the descriptionLine1 value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param descriptionLine1
     */
    public void setDescriptionLine1(java.lang.String descriptionLine1) {
        this.descriptionLine1 = descriptionLine1;
    }


    /**
     * Gets the discountFactor value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return discountFactor
     */
    public java.math.BigDecimal getDiscountFactor() {
        return discountFactor;
    }


    /**
     * Sets the discountFactor value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param discountFactor
     */
    public void setDiscountFactor(java.math.BigDecimal discountFactor) {
        this.discountFactor = discountFactor;
    }


    /**
     * Gets the documentLineNumber value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return documentLineNumber
     */
    public java.math.BigDecimal getDocumentLineNumber() {
        return documentLineNumber;
    }


    /**
     * Sets the documentLineNumber value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param documentLineNumber
     */
    public void setDocumentLineNumber(java.math.BigDecimal documentLineNumber) {
        this.documentLineNumber = documentLineNumber;
    }


    /**
     * Gets the documentOrderInvoiceNumber value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return documentOrderInvoiceNumber
     */
    public java.lang.Integer getDocumentOrderInvoiceNumber() {
        return documentOrderInvoiceNumber;
    }


    /**
     * Sets the documentOrderInvoiceNumber value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param documentOrderInvoiceNumber
     */
    public void setDocumentOrderInvoiceNumber(java.lang.Integer documentOrderInvoiceNumber) {
        this.documentOrderInvoiceNumber = documentOrderInvoiceNumber;
    }


    /**
     * Gets the documentOrderTypeCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return documentOrderTypeCode
     */
    public java.lang.String getDocumentOrderTypeCode() {
        return documentOrderTypeCode;
    }


    /**
     * Sets the documentOrderTypeCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param documentOrderTypeCode
     */
    public void setDocumentOrderTypeCode(java.lang.String documentOrderTypeCode) {
        this.documentOrderTypeCode = documentOrderTypeCode;
    }


    /**
     * Gets the documentSuffix value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return documentSuffix
     */
    public java.lang.String getDocumentSuffix() {
        return documentSuffix;
    }


    /**
     * Sets the documentSuffix value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param documentSuffix
     */
    public void setDocumentSuffix(java.lang.String documentSuffix) {
        this.documentSuffix = documentSuffix;
    }


    /**
     * Gets the foreignPurchasingPrice value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return foreignPurchasingPrice
     */
    public java.math.BigDecimal getForeignPurchasingPrice() {
        return foreignPurchasingPrice;
    }


    /**
     * Sets the foreignPurchasingPrice value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param foreignPurchasingPrice
     */
    public void setForeignPurchasingPrice(java.math.BigDecimal foreignPurchasingPrice) {
        this.foreignPurchasingPrice = foreignPurchasingPrice;
    }


    /**
     * Gets the identifier2NdItem value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return identifier2NdItem
     */
    public java.lang.String getIdentifier2NdItem() {
        return identifier2NdItem;
    }


    /**
     * Sets the identifier2NdItem value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param identifier2NdItem
     */
    public void setIdentifier2NdItem(java.lang.String identifier2NdItem) {
        this.identifier2NdItem = identifier2NdItem;
    }


    /**
     * Gets the identifierShortItem value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return identifierShortItem
     */
    public java.lang.Integer getIdentifierShortItem() {
        return identifierShortItem;
    }


    /**
     * Sets the identifierShortItem value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param identifierShortItem
     */
    public void setIdentifierShortItem(java.lang.Integer identifierShortItem) {
        this.identifierShortItem = identifierShortItem;
    }


    /**
     * Gets the lineTypeCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return lineTypeCode
     */
    public java.lang.String getLineTypeCode() {
        return lineTypeCode;
    }


    /**
     * Sets the lineTypeCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param lineTypeCode
     */
    public void setLineTypeCode(java.lang.String lineTypeCode) {
        this.lineTypeCode = lineTypeCode;
    }


    /**
     * Gets the orderTypeCodeRelated value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return orderTypeCodeRelated
     */
    public java.lang.String getOrderTypeCodeRelated() {
        return orderTypeCodeRelated;
    }


    /**
     * Sets the orderTypeCodeRelated value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param orderTypeCodeRelated
     */
    public void setOrderTypeCodeRelated(java.lang.String orderTypeCodeRelated) {
        this.orderTypeCodeRelated = orderTypeCodeRelated;
    }


    /**
     * Gets the poSoLineNoRelated value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return poSoLineNoRelated
     */
    public java.math.BigDecimal getPoSoLineNoRelated() {
        return poSoLineNoRelated;
    }


    /**
     * Sets the poSoLineNoRelated value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param poSoLineNoRelated
     */
    public void setPoSoLineNoRelated(java.math.BigDecimal poSoLineNoRelated) {
        this.poSoLineNoRelated = poSoLineNoRelated;
    }


    /**
     * Gets the poSoNumberRelated value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return poSoNumberRelated
     */
    public java.lang.String getPoSoNumberRelated() {
        return poSoNumberRelated;
    }


    /**
     * Sets the poSoNumberRelated value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param poSoNumberRelated
     */
    public void setPoSoNumberRelated(java.lang.String poSoNumberRelated) {
        this.poSoNumberRelated = poSoNumberRelated;
    }


    /**
     * Gets the purchasingUnitPrice value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return purchasingUnitPrice
     */
    public java.math.BigDecimal getPurchasingUnitPrice() {
        return purchasingUnitPrice;
    }


    /**
     * Sets the purchasingUnitPrice value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param purchasingUnitPrice
     */
    public void setPurchasingUnitPrice(java.math.BigDecimal purchasingUnitPrice) {
        this.purchasingUnitPrice = purchasingUnitPrice;
    }


    /**
     * Gets the shipTo value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return shipTo
     */
    public JP430000.bssv.e1.oracle.Entity getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param shipTo
     */
    public void setShipTo(JP430000.bssv.e1.oracle.Entity shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the statusCodeNextCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return statusCodeNextCode
     */
    public java.lang.String getStatusCodeNextCode() {
        return statusCodeNextCode;
    }


    /**
     * Sets the statusCodeNextCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param statusCodeNextCode
     */
    public void setStatusCodeNextCode(java.lang.String statusCodeNextCode) {
        this.statusCodeNextCode = statusCodeNextCode;
    }


    /**
     * Gets the statusLastCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return statusLastCode
     */
    public java.lang.String getStatusLastCode() {
        return statusLastCode;
    }


    /**
     * Sets the statusLastCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param statusLastCode
     */
    public void setStatusLastCode(java.lang.String statusLastCode) {
        this.statusLastCode = statusLastCode;
    }


    /**
     * Gets the subledger value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return subledger
     */
    public java.lang.String getSubledger() {
        return subledger;
    }


    /**
     * Sets the subledger value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param subledger
     */
    public void setSubledger(java.lang.String subledger) {
        this.subledger = subledger;
    }


    /**
     * Gets the subledgerTypeCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return subledgerTypeCode
     */
    public java.lang.String getSubledgerTypeCode() {
        return subledgerTypeCode;
    }


    /**
     * Sets the subledgerTypeCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param subledgerTypeCode
     */
    public void setSubledgerTypeCode(java.lang.String subledgerTypeCode) {
        this.subledgerTypeCode = subledgerTypeCode;
    }


    /**
     * Gets the supplier value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return supplier
     */
    public JP430000.bssv.e1.oracle.Entity getSupplier() {
        return supplier;
    }


    /**
     * Sets the supplier value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param supplier
     */
    public void setSupplier(JP430000.bssv.e1.oracle.Entity supplier) {
        this.supplier = supplier;
    }


    /**
     * Gets the unitOfMeasureCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return unitOfMeasureCode
     */
    public java.lang.String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }


    /**
     * Sets the unitOfMeasureCode value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param unitOfMeasureCode
     */
    public void setUnitOfMeasureCode(java.lang.String unitOfMeasureCode) {
        this.unitOfMeasureCode = unitOfMeasureCode;
    }


    /**
     * Gets the unitOfMeasurePurchasing value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return unitOfMeasurePurchasing
     */
    public java.lang.String getUnitOfMeasurePurchasing() {
        return unitOfMeasurePurchasing;
    }


    /**
     * Sets the unitOfMeasurePurchasing value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param unitOfMeasurePurchasing
     */
    public void setUnitOfMeasurePurchasing(java.lang.String unitOfMeasurePurchasing) {
        this.unitOfMeasurePurchasing = unitOfMeasurePurchasing;
    }


    /**
     * Gets the unitsTransactionQty value for this PurchaseOrderDetailForApproverResults.
     * 
     * @return unitsTransactionQty
     */
    public java.math.BigDecimal getUnitsTransactionQty() {
        return unitsTransactionQty;
    }


    /**
     * Sets the unitsTransactionQty value for this PurchaseOrderDetailForApproverResults.
     * 
     * @param unitsTransactionQty
     */
    public void setUnitsTransactionQty(java.math.BigDecimal unitsTransactionQty) {
        this.unitsTransactionQty = unitsTransactionQty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderDetailForApproverResults)) return false;
        PurchaseOrderDetailForApproverResults other = (PurchaseOrderDetailForApproverResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctNumber==null && other.getAcctNumber()==null) || 
             (this.acctNumber!=null &&
              this.acctNumber.equals(other.getAcctNumber()))) &&
            ((this.amountExtendedPrice==null && other.getAmountExtendedPrice()==null) || 
             (this.amountExtendedPrice!=null &&
              this.amountExtendedPrice.equals(other.getAmountExtendedPrice()))) &&
            ((this.amountForeignExtendPrice==null && other.getAmountForeignExtendPrice()==null) || 
             (this.amountForeignExtendPrice!=null &&
              this.amountForeignExtendPrice.equals(other.getAmountForeignExtendPrice()))) &&
            ((this.assetIDNumber==null && other.getAssetIDNumber()==null) || 
             (this.assetIDNumber!=null &&
              this.assetIDNumber.equals(other.getAssetIDNumber()))) &&
            ((this.businessUnitCode==null && other.getBusinessUnitCode()==null) || 
             (this.businessUnitCode!=null &&
              this.businessUnitCode.equals(other.getBusinessUnitCode()))) &&
            ((this.companyKeyOrderNo==null && other.getCompanyKeyOrderNo()==null) || 
             (this.companyKeyOrderNo!=null &&
              this.companyKeyOrderNo.equals(other.getCompanyKeyOrderNo()))) &&
            ((this.companyKeyRelated==null && other.getCompanyKeyRelated()==null) || 
             (this.companyKeyRelated!=null &&
              this.companyKeyRelated.equals(other.getCompanyKeyRelated()))) &&
            ((this.currencyCodeForeign==null && other.getCurrencyCodeForeign()==null) || 
             (this.currencyCodeForeign!=null &&
              this.currencyCodeForeign.equals(other.getCurrencyCodeForeign()))) &&
            ((this.dateRequested==null && other.getDateRequested()==null) || 
             (this.dateRequested!=null &&
              this.dateRequested.equals(other.getDateRequested()))) &&
            ((this.dateTransaction==null && other.getDateTransaction()==null) || 
             (this.dateTransaction!=null &&
              this.dateTransaction.equals(other.getDateTransaction()))) &&
            ((this.descriptionLine1==null && other.getDescriptionLine1()==null) || 
             (this.descriptionLine1!=null &&
              this.descriptionLine1.equals(other.getDescriptionLine1()))) &&
            ((this.discountFactor==null && other.getDiscountFactor()==null) || 
             (this.discountFactor!=null &&
              this.discountFactor.equals(other.getDiscountFactor()))) &&
            ((this.documentLineNumber==null && other.getDocumentLineNumber()==null) || 
             (this.documentLineNumber!=null &&
              this.documentLineNumber.equals(other.getDocumentLineNumber()))) &&
            ((this.documentOrderInvoiceNumber==null && other.getDocumentOrderInvoiceNumber()==null) || 
             (this.documentOrderInvoiceNumber!=null &&
              this.documentOrderInvoiceNumber.equals(other.getDocumentOrderInvoiceNumber()))) &&
            ((this.documentOrderTypeCode==null && other.getDocumentOrderTypeCode()==null) || 
             (this.documentOrderTypeCode!=null &&
              this.documentOrderTypeCode.equals(other.getDocumentOrderTypeCode()))) &&
            ((this.documentSuffix==null && other.getDocumentSuffix()==null) || 
             (this.documentSuffix!=null &&
              this.documentSuffix.equals(other.getDocumentSuffix()))) &&
            ((this.foreignPurchasingPrice==null && other.getForeignPurchasingPrice()==null) || 
             (this.foreignPurchasingPrice!=null &&
              this.foreignPurchasingPrice.equals(other.getForeignPurchasingPrice()))) &&
            ((this.identifier2NdItem==null && other.getIdentifier2NdItem()==null) || 
             (this.identifier2NdItem!=null &&
              this.identifier2NdItem.equals(other.getIdentifier2NdItem()))) &&
            ((this.identifierShortItem==null && other.getIdentifierShortItem()==null) || 
             (this.identifierShortItem!=null &&
              this.identifierShortItem.equals(other.getIdentifierShortItem()))) &&
            ((this.lineTypeCode==null && other.getLineTypeCode()==null) || 
             (this.lineTypeCode!=null &&
              this.lineTypeCode.equals(other.getLineTypeCode()))) &&
            ((this.orderTypeCodeRelated==null && other.getOrderTypeCodeRelated()==null) || 
             (this.orderTypeCodeRelated!=null &&
              this.orderTypeCodeRelated.equals(other.getOrderTypeCodeRelated()))) &&
            ((this.poSoLineNoRelated==null && other.getPoSoLineNoRelated()==null) || 
             (this.poSoLineNoRelated!=null &&
              this.poSoLineNoRelated.equals(other.getPoSoLineNoRelated()))) &&
            ((this.poSoNumberRelated==null && other.getPoSoNumberRelated()==null) || 
             (this.poSoNumberRelated!=null &&
              this.poSoNumberRelated.equals(other.getPoSoNumberRelated()))) &&
            ((this.purchasingUnitPrice==null && other.getPurchasingUnitPrice()==null) || 
             (this.purchasingUnitPrice!=null &&
              this.purchasingUnitPrice.equals(other.getPurchasingUnitPrice()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.statusCodeNextCode==null && other.getStatusCodeNextCode()==null) || 
             (this.statusCodeNextCode!=null &&
              this.statusCodeNextCode.equals(other.getStatusCodeNextCode()))) &&
            ((this.statusLastCode==null && other.getStatusLastCode()==null) || 
             (this.statusLastCode!=null &&
              this.statusLastCode.equals(other.getStatusLastCode()))) &&
            ((this.subledger==null && other.getSubledger()==null) || 
             (this.subledger!=null &&
              this.subledger.equals(other.getSubledger()))) &&
            ((this.subledgerTypeCode==null && other.getSubledgerTypeCode()==null) || 
             (this.subledgerTypeCode!=null &&
              this.subledgerTypeCode.equals(other.getSubledgerTypeCode()))) &&
            ((this.supplier==null && other.getSupplier()==null) || 
             (this.supplier!=null &&
              this.supplier.equals(other.getSupplier()))) &&
            ((this.unitOfMeasureCode==null && other.getUnitOfMeasureCode()==null) || 
             (this.unitOfMeasureCode!=null &&
              this.unitOfMeasureCode.equals(other.getUnitOfMeasureCode()))) &&
            ((this.unitOfMeasurePurchasing==null && other.getUnitOfMeasurePurchasing()==null) || 
             (this.unitOfMeasurePurchasing!=null &&
              this.unitOfMeasurePurchasing.equals(other.getUnitOfMeasurePurchasing()))) &&
            ((this.unitsTransactionQty==null && other.getUnitsTransactionQty()==null) || 
             (this.unitsTransactionQty!=null &&
              this.unitsTransactionQty.equals(other.getUnitsTransactionQty())));
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
        if (getAcctNumber() != null) {
            _hashCode += getAcctNumber().hashCode();
        }
        if (getAmountExtendedPrice() != null) {
            _hashCode += getAmountExtendedPrice().hashCode();
        }
        if (getAmountForeignExtendPrice() != null) {
            _hashCode += getAmountForeignExtendPrice().hashCode();
        }
        if (getAssetIDNumber() != null) {
            _hashCode += getAssetIDNumber().hashCode();
        }
        if (getBusinessUnitCode() != null) {
            _hashCode += getBusinessUnitCode().hashCode();
        }
        if (getCompanyKeyOrderNo() != null) {
            _hashCode += getCompanyKeyOrderNo().hashCode();
        }
        if (getCompanyKeyRelated() != null) {
            _hashCode += getCompanyKeyRelated().hashCode();
        }
        if (getCurrencyCodeForeign() != null) {
            _hashCode += getCurrencyCodeForeign().hashCode();
        }
        if (getDateRequested() != null) {
            _hashCode += getDateRequested().hashCode();
        }
        if (getDateTransaction() != null) {
            _hashCode += getDateTransaction().hashCode();
        }
        if (getDescriptionLine1() != null) {
            _hashCode += getDescriptionLine1().hashCode();
        }
        if (getDiscountFactor() != null) {
            _hashCode += getDiscountFactor().hashCode();
        }
        if (getDocumentLineNumber() != null) {
            _hashCode += getDocumentLineNumber().hashCode();
        }
        if (getDocumentOrderInvoiceNumber() != null) {
            _hashCode += getDocumentOrderInvoiceNumber().hashCode();
        }
        if (getDocumentOrderTypeCode() != null) {
            _hashCode += getDocumentOrderTypeCode().hashCode();
        }
        if (getDocumentSuffix() != null) {
            _hashCode += getDocumentSuffix().hashCode();
        }
        if (getForeignPurchasingPrice() != null) {
            _hashCode += getForeignPurchasingPrice().hashCode();
        }
        if (getIdentifier2NdItem() != null) {
            _hashCode += getIdentifier2NdItem().hashCode();
        }
        if (getIdentifierShortItem() != null) {
            _hashCode += getIdentifierShortItem().hashCode();
        }
        if (getLineTypeCode() != null) {
            _hashCode += getLineTypeCode().hashCode();
        }
        if (getOrderTypeCodeRelated() != null) {
            _hashCode += getOrderTypeCodeRelated().hashCode();
        }
        if (getPoSoLineNoRelated() != null) {
            _hashCode += getPoSoLineNoRelated().hashCode();
        }
        if (getPoSoNumberRelated() != null) {
            _hashCode += getPoSoNumberRelated().hashCode();
        }
        if (getPurchasingUnitPrice() != null) {
            _hashCode += getPurchasingUnitPrice().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getStatusCodeNextCode() != null) {
            _hashCode += getStatusCodeNextCode().hashCode();
        }
        if (getStatusLastCode() != null) {
            _hashCode += getStatusLastCode().hashCode();
        }
        if (getSubledger() != null) {
            _hashCode += getSubledger().hashCode();
        }
        if (getSubledgerTypeCode() != null) {
            _hashCode += getSubledgerTypeCode().hashCode();
        }
        if (getSupplier() != null) {
            _hashCode += getSupplier().hashCode();
        }
        if (getUnitOfMeasureCode() != null) {
            _hashCode += getUnitOfMeasureCode().hashCode();
        }
        if (getUnitOfMeasurePurchasing() != null) {
            _hashCode += getUnitOfMeasurePurchasing().hashCode();
        }
        if (getUnitsTransactionQty() != null) {
            _hashCode += getUnitsTransactionQty().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderDetailForApproverResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDetailForApproverResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountExtendedPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountExtendedPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountForeignExtendPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountForeignExtendPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetIDNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetIDNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnitCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnitCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyKeyOrderNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyKeyOrderNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyKeyRelated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyKeyRelated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCodeForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCodeForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("dateTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptionLine1"));
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
        elemField.setFieldName("documentLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentOrderInvoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentOrderInvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentOrderTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentOrderTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignPurchasingPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignPurchasingPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier2NdItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identifier2ndItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifierShortItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identifierShortItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("orderTypeCodeRelated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderTypeCodeRelated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poSoLineNoRelated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poSoLineNoRelated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poSoNumberRelated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poSoNumberRelated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasingUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchasingUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("statusCodeNextCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCodeNextCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusLastCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusLastCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subledger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subledger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subledgerTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subledgerTypeCode"));
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
        elemField.setFieldName("unitOfMeasureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasurePurchasing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasurePurchasing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsTransactionQty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitsTransactionQty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
