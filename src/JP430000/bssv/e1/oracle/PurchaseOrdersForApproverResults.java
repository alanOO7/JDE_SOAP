/**
 * PurchaseOrdersForApproverResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrdersForApproverResults  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String addressLine1ShipTo;

    private java.lang.String addressLine1Supplier;

    private java.lang.String addressLine2ShipTo;

    private java.lang.String addressLine2Supplier;

    private java.lang.String addressLine3ShipTo;

    private java.lang.String addressLine3Supplier;

    private java.lang.String addressLine4ShipTo;

    private java.lang.String addressLine4Supplier;

    private java.math.BigDecimal amountForeign;

    private java.math.BigDecimal amountGross;

    private java.lang.String approvalRoutingCodeHeldOrders;

    private java.lang.String approvalRoutingCodePurchaseOrder;

    private JP430000.bssv.e1.oracle.Entity approver;

    private java.lang.String businessUnitCode;

    private JP430000.bssv.e1.oracle.Entity buyerNumber;

    private java.lang.String cityShipTo;

    private java.lang.String citySupplier;

    private java.lang.String countryCodeShipTo;

    private java.lang.String countryCodeSupplier;

    private java.lang.String countyCodeShipTo;

    private java.lang.String countyCodeSupplier;

    private java.lang.String currencyCodeBase;

    private java.lang.Integer currencyCodeBaseDecimals;

    private java.lang.String currencyCodeForeign;

    private java.lang.Integer currencyCodeForeignDecimals;

    private java.lang.String currencyMode;

    private java.util.Calendar dateRequested;

    private java.util.Calendar dateTransaction;

    private java.lang.String descriptionOrder;

    private java.lang.String documentCompanyKeyOrderNo;

    private java.lang.Integer documentOrderInvoiceNumber;

    private java.lang.String documentOrderTypeCode;

    private java.lang.String documentSuffix;

    private java.lang.String entityNameApprover;

    private java.lang.String entityNameOriginator;

    private java.lang.String entityNameShipTo;

    private java.lang.String entityNameSupplier;

    private java.lang.String holdCodeHeldOrders;

    private java.lang.String holdCodePurchaseOrder;

    private JP430000.bssv.e1.oracle.Entity originator;

    private java.lang.String postalCodeShipTo;

    private java.lang.String postalCodeSupplier;

    private JP430000.bssv.e1.oracle.Entity shipTo;

    private java.lang.String stateCodeShipTo;

    private java.lang.String stateCodeSupplier;

    private java.lang.String statusApproval;

    private JP430000.bssv.e1.oracle.Entity supplier;

    public PurchaseOrdersForApproverResults() {
    }

    public PurchaseOrdersForApproverResults(
           java.lang.String addressLine1ShipTo,
           java.lang.String addressLine1Supplier,
           java.lang.String addressLine2ShipTo,
           java.lang.String addressLine2Supplier,
           java.lang.String addressLine3ShipTo,
           java.lang.String addressLine3Supplier,
           java.lang.String addressLine4ShipTo,
           java.lang.String addressLine4Supplier,
           java.math.BigDecimal amountForeign,
           java.math.BigDecimal amountGross,
           java.lang.String approvalRoutingCodeHeldOrders,
           java.lang.String approvalRoutingCodePurchaseOrder,
           JP430000.bssv.e1.oracle.Entity approver,
           java.lang.String businessUnitCode,
           JP430000.bssv.e1.oracle.Entity buyerNumber,
           java.lang.String cityShipTo,
           java.lang.String citySupplier,
           java.lang.String countryCodeShipTo,
           java.lang.String countryCodeSupplier,
           java.lang.String countyCodeShipTo,
           java.lang.String countyCodeSupplier,
           java.lang.String currencyCodeBase,
           java.lang.Integer currencyCodeBaseDecimals,
           java.lang.String currencyCodeForeign,
           java.lang.Integer currencyCodeForeignDecimals,
           java.lang.String currencyMode,
           java.util.Calendar dateRequested,
           java.util.Calendar dateTransaction,
           java.lang.String descriptionOrder,
           java.lang.String documentCompanyKeyOrderNo,
           java.lang.Integer documentOrderInvoiceNumber,
           java.lang.String documentOrderTypeCode,
           java.lang.String documentSuffix,
           java.lang.String entityNameApprover,
           java.lang.String entityNameOriginator,
           java.lang.String entityNameShipTo,
           java.lang.String entityNameSupplier,
           java.lang.String holdCodeHeldOrders,
           java.lang.String holdCodePurchaseOrder,
           JP430000.bssv.e1.oracle.Entity originator,
           java.lang.String postalCodeShipTo,
           java.lang.String postalCodeSupplier,
           JP430000.bssv.e1.oracle.Entity shipTo,
           java.lang.String stateCodeShipTo,
           java.lang.String stateCodeSupplier,
           java.lang.String statusApproval,
           JP430000.bssv.e1.oracle.Entity supplier) {
        this.addressLine1ShipTo = addressLine1ShipTo;
        this.addressLine1Supplier = addressLine1Supplier;
        this.addressLine2ShipTo = addressLine2ShipTo;
        this.addressLine2Supplier = addressLine2Supplier;
        this.addressLine3ShipTo = addressLine3ShipTo;
        this.addressLine3Supplier = addressLine3Supplier;
        this.addressLine4ShipTo = addressLine4ShipTo;
        this.addressLine4Supplier = addressLine4Supplier;
        this.amountForeign = amountForeign;
        this.amountGross = amountGross;
        this.approvalRoutingCodeHeldOrders = approvalRoutingCodeHeldOrders;
        this.approvalRoutingCodePurchaseOrder = approvalRoutingCodePurchaseOrder;
        this.approver = approver;
        this.businessUnitCode = businessUnitCode;
        this.buyerNumber = buyerNumber;
        this.cityShipTo = cityShipTo;
        this.citySupplier = citySupplier;
        this.countryCodeShipTo = countryCodeShipTo;
        this.countryCodeSupplier = countryCodeSupplier;
        this.countyCodeShipTo = countyCodeShipTo;
        this.countyCodeSupplier = countyCodeSupplier;
        this.currencyCodeBase = currencyCodeBase;
        this.currencyCodeBaseDecimals = currencyCodeBaseDecimals;
        this.currencyCodeForeign = currencyCodeForeign;
        this.currencyCodeForeignDecimals = currencyCodeForeignDecimals;
        this.currencyMode = currencyMode;
        this.dateRequested = dateRequested;
        this.dateTransaction = dateTransaction;
        this.descriptionOrder = descriptionOrder;
        this.documentCompanyKeyOrderNo = documentCompanyKeyOrderNo;
        this.documentOrderInvoiceNumber = documentOrderInvoiceNumber;
        this.documentOrderTypeCode = documentOrderTypeCode;
        this.documentSuffix = documentSuffix;
        this.entityNameApprover = entityNameApprover;
        this.entityNameOriginator = entityNameOriginator;
        this.entityNameShipTo = entityNameShipTo;
        this.entityNameSupplier = entityNameSupplier;
        this.holdCodeHeldOrders = holdCodeHeldOrders;
        this.holdCodePurchaseOrder = holdCodePurchaseOrder;
        this.originator = originator;
        this.postalCodeShipTo = postalCodeShipTo;
        this.postalCodeSupplier = postalCodeSupplier;
        this.shipTo = shipTo;
        this.stateCodeShipTo = stateCodeShipTo;
        this.stateCodeSupplier = stateCodeSupplier;
        this.statusApproval = statusApproval;
        this.supplier = supplier;
    }


    /**
     * Gets the addressLine1ShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @return addressLine1ShipTo
     */
    public java.lang.String getAddressLine1ShipTo() {
        return addressLine1ShipTo;
    }


    /**
     * Sets the addressLine1ShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @param addressLine1ShipTo
     */
    public void setAddressLine1ShipTo(java.lang.String addressLine1ShipTo) {
        this.addressLine1ShipTo = addressLine1ShipTo;
    }


    /**
     * Gets the addressLine1Supplier value for this PurchaseOrdersForApproverResults.
     * 
     * @return addressLine1Supplier
     */
    public java.lang.String getAddressLine1Supplier() {
        return addressLine1Supplier;
    }


    /**
     * Sets the addressLine1Supplier value for this PurchaseOrdersForApproverResults.
     * 
     * @param addressLine1Supplier
     */
    public void setAddressLine1Supplier(java.lang.String addressLine1Supplier) {
        this.addressLine1Supplier = addressLine1Supplier;
    }


    /**
     * Gets the addressLine2ShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @return addressLine2ShipTo
     */
    public java.lang.String getAddressLine2ShipTo() {
        return addressLine2ShipTo;
    }


    /**
     * Sets the addressLine2ShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @param addressLine2ShipTo
     */
    public void setAddressLine2ShipTo(java.lang.String addressLine2ShipTo) {
        this.addressLine2ShipTo = addressLine2ShipTo;
    }


    /**
     * Gets the addressLine2Supplier value for this PurchaseOrdersForApproverResults.
     * 
     * @return addressLine2Supplier
     */
    public java.lang.String getAddressLine2Supplier() {
        return addressLine2Supplier;
    }


    /**
     * Sets the addressLine2Supplier value for this PurchaseOrdersForApproverResults.
     * 
     * @param addressLine2Supplier
     */
    public void setAddressLine2Supplier(java.lang.String addressLine2Supplier) {
        this.addressLine2Supplier = addressLine2Supplier;
    }


    /**
     * Gets the addressLine3ShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @return addressLine3ShipTo
     */
    public java.lang.String getAddressLine3ShipTo() {
        return addressLine3ShipTo;
    }


    /**
     * Sets the addressLine3ShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @param addressLine3ShipTo
     */
    public void setAddressLine3ShipTo(java.lang.String addressLine3ShipTo) {
        this.addressLine3ShipTo = addressLine3ShipTo;
    }


    /**
     * Gets the addressLine3Supplier value for this PurchaseOrdersForApproverResults.
     * 
     * @return addressLine3Supplier
     */
    public java.lang.String getAddressLine3Supplier() {
        return addressLine3Supplier;
    }


    /**
     * Sets the addressLine3Supplier value for this PurchaseOrdersForApproverResults.
     * 
     * @param addressLine3Supplier
     */
    public void setAddressLine3Supplier(java.lang.String addressLine3Supplier) {
        this.addressLine3Supplier = addressLine3Supplier;
    }


    /**
     * Gets the addressLine4ShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @return addressLine4ShipTo
     */
    public java.lang.String getAddressLine4ShipTo() {
        return addressLine4ShipTo;
    }


    /**
     * Sets the addressLine4ShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @param addressLine4ShipTo
     */
    public void setAddressLine4ShipTo(java.lang.String addressLine4ShipTo) {
        this.addressLine4ShipTo = addressLine4ShipTo;
    }


    /**
     * Gets the addressLine4Supplier value for this PurchaseOrdersForApproverResults.
     * 
     * @return addressLine4Supplier
     */
    public java.lang.String getAddressLine4Supplier() {
        return addressLine4Supplier;
    }


    /**
     * Sets the addressLine4Supplier value for this PurchaseOrdersForApproverResults.
     * 
     * @param addressLine4Supplier
     */
    public void setAddressLine4Supplier(java.lang.String addressLine4Supplier) {
        this.addressLine4Supplier = addressLine4Supplier;
    }


    /**
     * Gets the amountForeign value for this PurchaseOrdersForApproverResults.
     * 
     * @return amountForeign
     */
    public java.math.BigDecimal getAmountForeign() {
        return amountForeign;
    }


    /**
     * Sets the amountForeign value for this PurchaseOrdersForApproverResults.
     * 
     * @param amountForeign
     */
    public void setAmountForeign(java.math.BigDecimal amountForeign) {
        this.amountForeign = amountForeign;
    }


    /**
     * Gets the amountGross value for this PurchaseOrdersForApproverResults.
     * 
     * @return amountGross
     */
    public java.math.BigDecimal getAmountGross() {
        return amountGross;
    }


    /**
     * Sets the amountGross value for this PurchaseOrdersForApproverResults.
     * 
     * @param amountGross
     */
    public void setAmountGross(java.math.BigDecimal amountGross) {
        this.amountGross = amountGross;
    }


    /**
     * Gets the approvalRoutingCodeHeldOrders value for this PurchaseOrdersForApproverResults.
     * 
     * @return approvalRoutingCodeHeldOrders
     */
    public java.lang.String getApprovalRoutingCodeHeldOrders() {
        return approvalRoutingCodeHeldOrders;
    }


    /**
     * Sets the approvalRoutingCodeHeldOrders value for this PurchaseOrdersForApproverResults.
     * 
     * @param approvalRoutingCodeHeldOrders
     */
    public void setApprovalRoutingCodeHeldOrders(java.lang.String approvalRoutingCodeHeldOrders) {
        this.approvalRoutingCodeHeldOrders = approvalRoutingCodeHeldOrders;
    }


    /**
     * Gets the approvalRoutingCodePurchaseOrder value for this PurchaseOrdersForApproverResults.
     * 
     * @return approvalRoutingCodePurchaseOrder
     */
    public java.lang.String getApprovalRoutingCodePurchaseOrder() {
        return approvalRoutingCodePurchaseOrder;
    }


    /**
     * Sets the approvalRoutingCodePurchaseOrder value for this PurchaseOrdersForApproverResults.
     * 
     * @param approvalRoutingCodePurchaseOrder
     */
    public void setApprovalRoutingCodePurchaseOrder(java.lang.String approvalRoutingCodePurchaseOrder) {
        this.approvalRoutingCodePurchaseOrder = approvalRoutingCodePurchaseOrder;
    }


    /**
     * Gets the approver value for this PurchaseOrdersForApproverResults.
     * 
     * @return approver
     */
    public JP430000.bssv.e1.oracle.Entity getApprover() {
        return approver;
    }


    /**
     * Sets the approver value for this PurchaseOrdersForApproverResults.
     * 
     * @param approver
     */
    public void setApprover(JP430000.bssv.e1.oracle.Entity approver) {
        this.approver = approver;
    }


    /**
     * Gets the businessUnitCode value for this PurchaseOrdersForApproverResults.
     * 
     * @return businessUnitCode
     */
    public java.lang.String getBusinessUnitCode() {
        return businessUnitCode;
    }


    /**
     * Sets the businessUnitCode value for this PurchaseOrdersForApproverResults.
     * 
     * @param businessUnitCode
     */
    public void setBusinessUnitCode(java.lang.String businessUnitCode) {
        this.businessUnitCode = businessUnitCode;
    }


    /**
     * Gets the buyerNumber value for this PurchaseOrdersForApproverResults.
     * 
     * @return buyerNumber
     */
    public JP430000.bssv.e1.oracle.Entity getBuyerNumber() {
        return buyerNumber;
    }


    /**
     * Sets the buyerNumber value for this PurchaseOrdersForApproverResults.
     * 
     * @param buyerNumber
     */
    public void setBuyerNumber(JP430000.bssv.e1.oracle.Entity buyerNumber) {
        this.buyerNumber = buyerNumber;
    }


    /**
     * Gets the cityShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @return cityShipTo
     */
    public java.lang.String getCityShipTo() {
        return cityShipTo;
    }


    /**
     * Sets the cityShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @param cityShipTo
     */
    public void setCityShipTo(java.lang.String cityShipTo) {
        this.cityShipTo = cityShipTo;
    }


    /**
     * Gets the citySupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @return citySupplier
     */
    public java.lang.String getCitySupplier() {
        return citySupplier;
    }


    /**
     * Sets the citySupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @param citySupplier
     */
    public void setCitySupplier(java.lang.String citySupplier) {
        this.citySupplier = citySupplier;
    }


    /**
     * Gets the countryCodeShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @return countryCodeShipTo
     */
    public java.lang.String getCountryCodeShipTo() {
        return countryCodeShipTo;
    }


    /**
     * Sets the countryCodeShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @param countryCodeShipTo
     */
    public void setCountryCodeShipTo(java.lang.String countryCodeShipTo) {
        this.countryCodeShipTo = countryCodeShipTo;
    }


    /**
     * Gets the countryCodeSupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @return countryCodeSupplier
     */
    public java.lang.String getCountryCodeSupplier() {
        return countryCodeSupplier;
    }


    /**
     * Sets the countryCodeSupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @param countryCodeSupplier
     */
    public void setCountryCodeSupplier(java.lang.String countryCodeSupplier) {
        this.countryCodeSupplier = countryCodeSupplier;
    }


    /**
     * Gets the countyCodeShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @return countyCodeShipTo
     */
    public java.lang.String getCountyCodeShipTo() {
        return countyCodeShipTo;
    }


    /**
     * Sets the countyCodeShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @param countyCodeShipTo
     */
    public void setCountyCodeShipTo(java.lang.String countyCodeShipTo) {
        this.countyCodeShipTo = countyCodeShipTo;
    }


    /**
     * Gets the countyCodeSupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @return countyCodeSupplier
     */
    public java.lang.String getCountyCodeSupplier() {
        return countyCodeSupplier;
    }


    /**
     * Sets the countyCodeSupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @param countyCodeSupplier
     */
    public void setCountyCodeSupplier(java.lang.String countyCodeSupplier) {
        this.countyCodeSupplier = countyCodeSupplier;
    }


    /**
     * Gets the currencyCodeBase value for this PurchaseOrdersForApproverResults.
     * 
     * @return currencyCodeBase
     */
    public java.lang.String getCurrencyCodeBase() {
        return currencyCodeBase;
    }


    /**
     * Sets the currencyCodeBase value for this PurchaseOrdersForApproverResults.
     * 
     * @param currencyCodeBase
     */
    public void setCurrencyCodeBase(java.lang.String currencyCodeBase) {
        this.currencyCodeBase = currencyCodeBase;
    }


    /**
     * Gets the currencyCodeBaseDecimals value for this PurchaseOrdersForApproverResults.
     * 
     * @return currencyCodeBaseDecimals
     */
    public java.lang.Integer getCurrencyCodeBaseDecimals() {
        return currencyCodeBaseDecimals;
    }


    /**
     * Sets the currencyCodeBaseDecimals value for this PurchaseOrdersForApproverResults.
     * 
     * @param currencyCodeBaseDecimals
     */
    public void setCurrencyCodeBaseDecimals(java.lang.Integer currencyCodeBaseDecimals) {
        this.currencyCodeBaseDecimals = currencyCodeBaseDecimals;
    }


    /**
     * Gets the currencyCodeForeign value for this PurchaseOrdersForApproverResults.
     * 
     * @return currencyCodeForeign
     */
    public java.lang.String getCurrencyCodeForeign() {
        return currencyCodeForeign;
    }


    /**
     * Sets the currencyCodeForeign value for this PurchaseOrdersForApproverResults.
     * 
     * @param currencyCodeForeign
     */
    public void setCurrencyCodeForeign(java.lang.String currencyCodeForeign) {
        this.currencyCodeForeign = currencyCodeForeign;
    }


    /**
     * Gets the currencyCodeForeignDecimals value for this PurchaseOrdersForApproverResults.
     * 
     * @return currencyCodeForeignDecimals
     */
    public java.lang.Integer getCurrencyCodeForeignDecimals() {
        return currencyCodeForeignDecimals;
    }


    /**
     * Sets the currencyCodeForeignDecimals value for this PurchaseOrdersForApproverResults.
     * 
     * @param currencyCodeForeignDecimals
     */
    public void setCurrencyCodeForeignDecimals(java.lang.Integer currencyCodeForeignDecimals) {
        this.currencyCodeForeignDecimals = currencyCodeForeignDecimals;
    }


    /**
     * Gets the currencyMode value for this PurchaseOrdersForApproverResults.
     * 
     * @return currencyMode
     */
    public java.lang.String getCurrencyMode() {
        return currencyMode;
    }


    /**
     * Sets the currencyMode value for this PurchaseOrdersForApproverResults.
     * 
     * @param currencyMode
     */
    public void setCurrencyMode(java.lang.String currencyMode) {
        this.currencyMode = currencyMode;
    }


    /**
     * Gets the dateRequested value for this PurchaseOrdersForApproverResults.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this PurchaseOrdersForApproverResults.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the dateTransaction value for this PurchaseOrdersForApproverResults.
     * 
     * @return dateTransaction
     */
    public java.util.Calendar getDateTransaction() {
        return dateTransaction;
    }


    /**
     * Sets the dateTransaction value for this PurchaseOrdersForApproverResults.
     * 
     * @param dateTransaction
     */
    public void setDateTransaction(java.util.Calendar dateTransaction) {
        this.dateTransaction = dateTransaction;
    }


    /**
     * Gets the descriptionOrder value for this PurchaseOrdersForApproverResults.
     * 
     * @return descriptionOrder
     */
    public java.lang.String getDescriptionOrder() {
        return descriptionOrder;
    }


    /**
     * Sets the descriptionOrder value for this PurchaseOrdersForApproverResults.
     * 
     * @param descriptionOrder
     */
    public void setDescriptionOrder(java.lang.String descriptionOrder) {
        this.descriptionOrder = descriptionOrder;
    }


    /**
     * Gets the documentCompanyKeyOrderNo value for this PurchaseOrdersForApproverResults.
     * 
     * @return documentCompanyKeyOrderNo
     */
    public java.lang.String getDocumentCompanyKeyOrderNo() {
        return documentCompanyKeyOrderNo;
    }


    /**
     * Sets the documentCompanyKeyOrderNo value for this PurchaseOrdersForApproverResults.
     * 
     * @param documentCompanyKeyOrderNo
     */
    public void setDocumentCompanyKeyOrderNo(java.lang.String documentCompanyKeyOrderNo) {
        this.documentCompanyKeyOrderNo = documentCompanyKeyOrderNo;
    }


    /**
     * Gets the documentOrderInvoiceNumber value for this PurchaseOrdersForApproverResults.
     * 
     * @return documentOrderInvoiceNumber
     */
    public java.lang.Integer getDocumentOrderInvoiceNumber() {
        return documentOrderInvoiceNumber;
    }


    /**
     * Sets the documentOrderInvoiceNumber value for this PurchaseOrdersForApproverResults.
     * 
     * @param documentOrderInvoiceNumber
     */
    public void setDocumentOrderInvoiceNumber(java.lang.Integer documentOrderInvoiceNumber) {
        this.documentOrderInvoiceNumber = documentOrderInvoiceNumber;
    }


    /**
     * Gets the documentOrderTypeCode value for this PurchaseOrdersForApproverResults.
     * 
     * @return documentOrderTypeCode
     */
    public java.lang.String getDocumentOrderTypeCode() {
        return documentOrderTypeCode;
    }


    /**
     * Sets the documentOrderTypeCode value for this PurchaseOrdersForApproverResults.
     * 
     * @param documentOrderTypeCode
     */
    public void setDocumentOrderTypeCode(java.lang.String documentOrderTypeCode) {
        this.documentOrderTypeCode = documentOrderTypeCode;
    }


    /**
     * Gets the documentSuffix value for this PurchaseOrdersForApproverResults.
     * 
     * @return documentSuffix
     */
    public java.lang.String getDocumentSuffix() {
        return documentSuffix;
    }


    /**
     * Sets the documentSuffix value for this PurchaseOrdersForApproverResults.
     * 
     * @param documentSuffix
     */
    public void setDocumentSuffix(java.lang.String documentSuffix) {
        this.documentSuffix = documentSuffix;
    }


    /**
     * Gets the entityNameApprover value for this PurchaseOrdersForApproverResults.
     * 
     * @return entityNameApprover
     */
    public java.lang.String getEntityNameApprover() {
        return entityNameApprover;
    }


    /**
     * Sets the entityNameApprover value for this PurchaseOrdersForApproverResults.
     * 
     * @param entityNameApprover
     */
    public void setEntityNameApprover(java.lang.String entityNameApprover) {
        this.entityNameApprover = entityNameApprover;
    }


    /**
     * Gets the entityNameOriginator value for this PurchaseOrdersForApproverResults.
     * 
     * @return entityNameOriginator
     */
    public java.lang.String getEntityNameOriginator() {
        return entityNameOriginator;
    }


    /**
     * Sets the entityNameOriginator value for this PurchaseOrdersForApproverResults.
     * 
     * @param entityNameOriginator
     */
    public void setEntityNameOriginator(java.lang.String entityNameOriginator) {
        this.entityNameOriginator = entityNameOriginator;
    }


    /**
     * Gets the entityNameShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @return entityNameShipTo
     */
    public java.lang.String getEntityNameShipTo() {
        return entityNameShipTo;
    }


    /**
     * Sets the entityNameShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @param entityNameShipTo
     */
    public void setEntityNameShipTo(java.lang.String entityNameShipTo) {
        this.entityNameShipTo = entityNameShipTo;
    }


    /**
     * Gets the entityNameSupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @return entityNameSupplier
     */
    public java.lang.String getEntityNameSupplier() {
        return entityNameSupplier;
    }


    /**
     * Sets the entityNameSupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @param entityNameSupplier
     */
    public void setEntityNameSupplier(java.lang.String entityNameSupplier) {
        this.entityNameSupplier = entityNameSupplier;
    }


    /**
     * Gets the holdCodeHeldOrders value for this PurchaseOrdersForApproverResults.
     * 
     * @return holdCodeHeldOrders
     */
    public java.lang.String getHoldCodeHeldOrders() {
        return holdCodeHeldOrders;
    }


    /**
     * Sets the holdCodeHeldOrders value for this PurchaseOrdersForApproverResults.
     * 
     * @param holdCodeHeldOrders
     */
    public void setHoldCodeHeldOrders(java.lang.String holdCodeHeldOrders) {
        this.holdCodeHeldOrders = holdCodeHeldOrders;
    }


    /**
     * Gets the holdCodePurchaseOrder value for this PurchaseOrdersForApproverResults.
     * 
     * @return holdCodePurchaseOrder
     */
    public java.lang.String getHoldCodePurchaseOrder() {
        return holdCodePurchaseOrder;
    }


    /**
     * Sets the holdCodePurchaseOrder value for this PurchaseOrdersForApproverResults.
     * 
     * @param holdCodePurchaseOrder
     */
    public void setHoldCodePurchaseOrder(java.lang.String holdCodePurchaseOrder) {
        this.holdCodePurchaseOrder = holdCodePurchaseOrder;
    }


    /**
     * Gets the originator value for this PurchaseOrdersForApproverResults.
     * 
     * @return originator
     */
    public JP430000.bssv.e1.oracle.Entity getOriginator() {
        return originator;
    }


    /**
     * Sets the originator value for this PurchaseOrdersForApproverResults.
     * 
     * @param originator
     */
    public void setOriginator(JP430000.bssv.e1.oracle.Entity originator) {
        this.originator = originator;
    }


    /**
     * Gets the postalCodeShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @return postalCodeShipTo
     */
    public java.lang.String getPostalCodeShipTo() {
        return postalCodeShipTo;
    }


    /**
     * Sets the postalCodeShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @param postalCodeShipTo
     */
    public void setPostalCodeShipTo(java.lang.String postalCodeShipTo) {
        this.postalCodeShipTo = postalCodeShipTo;
    }


    /**
     * Gets the postalCodeSupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @return postalCodeSupplier
     */
    public java.lang.String getPostalCodeSupplier() {
        return postalCodeSupplier;
    }


    /**
     * Sets the postalCodeSupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @param postalCodeSupplier
     */
    public void setPostalCodeSupplier(java.lang.String postalCodeSupplier) {
        this.postalCodeSupplier = postalCodeSupplier;
    }


    /**
     * Gets the shipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @return shipTo
     */
    public JP430000.bssv.e1.oracle.Entity getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @param shipTo
     */
    public void setShipTo(JP430000.bssv.e1.oracle.Entity shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the stateCodeShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @return stateCodeShipTo
     */
    public java.lang.String getStateCodeShipTo() {
        return stateCodeShipTo;
    }


    /**
     * Sets the stateCodeShipTo value for this PurchaseOrdersForApproverResults.
     * 
     * @param stateCodeShipTo
     */
    public void setStateCodeShipTo(java.lang.String stateCodeShipTo) {
        this.stateCodeShipTo = stateCodeShipTo;
    }


    /**
     * Gets the stateCodeSupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @return stateCodeSupplier
     */
    public java.lang.String getStateCodeSupplier() {
        return stateCodeSupplier;
    }


    /**
     * Sets the stateCodeSupplier value for this PurchaseOrdersForApproverResults.
     * 
     * @param stateCodeSupplier
     */
    public void setStateCodeSupplier(java.lang.String stateCodeSupplier) {
        this.stateCodeSupplier = stateCodeSupplier;
    }


    /**
     * Gets the statusApproval value for this PurchaseOrdersForApproverResults.
     * 
     * @return statusApproval
     */
    public java.lang.String getStatusApproval() {
        return statusApproval;
    }


    /**
     * Sets the statusApproval value for this PurchaseOrdersForApproverResults.
     * 
     * @param statusApproval
     */
    public void setStatusApproval(java.lang.String statusApproval) {
        this.statusApproval = statusApproval;
    }


    /**
     * Gets the supplier value for this PurchaseOrdersForApproverResults.
     * 
     * @return supplier
     */
    public JP430000.bssv.e1.oracle.Entity getSupplier() {
        return supplier;
    }


    /**
     * Sets the supplier value for this PurchaseOrdersForApproverResults.
     * 
     * @param supplier
     */
    public void setSupplier(JP430000.bssv.e1.oracle.Entity supplier) {
        this.supplier = supplier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrdersForApproverResults)) return false;
        PurchaseOrdersForApproverResults other = (PurchaseOrdersForApproverResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addressLine1ShipTo==null && other.getAddressLine1ShipTo()==null) || 
             (this.addressLine1ShipTo!=null &&
              this.addressLine1ShipTo.equals(other.getAddressLine1ShipTo()))) &&
            ((this.addressLine1Supplier==null && other.getAddressLine1Supplier()==null) || 
             (this.addressLine1Supplier!=null &&
              this.addressLine1Supplier.equals(other.getAddressLine1Supplier()))) &&
            ((this.addressLine2ShipTo==null && other.getAddressLine2ShipTo()==null) || 
             (this.addressLine2ShipTo!=null &&
              this.addressLine2ShipTo.equals(other.getAddressLine2ShipTo()))) &&
            ((this.addressLine2Supplier==null && other.getAddressLine2Supplier()==null) || 
             (this.addressLine2Supplier!=null &&
              this.addressLine2Supplier.equals(other.getAddressLine2Supplier()))) &&
            ((this.addressLine3ShipTo==null && other.getAddressLine3ShipTo()==null) || 
             (this.addressLine3ShipTo!=null &&
              this.addressLine3ShipTo.equals(other.getAddressLine3ShipTo()))) &&
            ((this.addressLine3Supplier==null && other.getAddressLine3Supplier()==null) || 
             (this.addressLine3Supplier!=null &&
              this.addressLine3Supplier.equals(other.getAddressLine3Supplier()))) &&
            ((this.addressLine4ShipTo==null && other.getAddressLine4ShipTo()==null) || 
             (this.addressLine4ShipTo!=null &&
              this.addressLine4ShipTo.equals(other.getAddressLine4ShipTo()))) &&
            ((this.addressLine4Supplier==null && other.getAddressLine4Supplier()==null) || 
             (this.addressLine4Supplier!=null &&
              this.addressLine4Supplier.equals(other.getAddressLine4Supplier()))) &&
            ((this.amountForeign==null && other.getAmountForeign()==null) || 
             (this.amountForeign!=null &&
              this.amountForeign.equals(other.getAmountForeign()))) &&
            ((this.amountGross==null && other.getAmountGross()==null) || 
             (this.amountGross!=null &&
              this.amountGross.equals(other.getAmountGross()))) &&
            ((this.approvalRoutingCodeHeldOrders==null && other.getApprovalRoutingCodeHeldOrders()==null) || 
             (this.approvalRoutingCodeHeldOrders!=null &&
              this.approvalRoutingCodeHeldOrders.equals(other.getApprovalRoutingCodeHeldOrders()))) &&
            ((this.approvalRoutingCodePurchaseOrder==null && other.getApprovalRoutingCodePurchaseOrder()==null) || 
             (this.approvalRoutingCodePurchaseOrder!=null &&
              this.approvalRoutingCodePurchaseOrder.equals(other.getApprovalRoutingCodePurchaseOrder()))) &&
            ((this.approver==null && other.getApprover()==null) || 
             (this.approver!=null &&
              this.approver.equals(other.getApprover()))) &&
            ((this.businessUnitCode==null && other.getBusinessUnitCode()==null) || 
             (this.businessUnitCode!=null &&
              this.businessUnitCode.equals(other.getBusinessUnitCode()))) &&
            ((this.buyerNumber==null && other.getBuyerNumber()==null) || 
             (this.buyerNumber!=null &&
              this.buyerNumber.equals(other.getBuyerNumber()))) &&
            ((this.cityShipTo==null && other.getCityShipTo()==null) || 
             (this.cityShipTo!=null &&
              this.cityShipTo.equals(other.getCityShipTo()))) &&
            ((this.citySupplier==null && other.getCitySupplier()==null) || 
             (this.citySupplier!=null &&
              this.citySupplier.equals(other.getCitySupplier()))) &&
            ((this.countryCodeShipTo==null && other.getCountryCodeShipTo()==null) || 
             (this.countryCodeShipTo!=null &&
              this.countryCodeShipTo.equals(other.getCountryCodeShipTo()))) &&
            ((this.countryCodeSupplier==null && other.getCountryCodeSupplier()==null) || 
             (this.countryCodeSupplier!=null &&
              this.countryCodeSupplier.equals(other.getCountryCodeSupplier()))) &&
            ((this.countyCodeShipTo==null && other.getCountyCodeShipTo()==null) || 
             (this.countyCodeShipTo!=null &&
              this.countyCodeShipTo.equals(other.getCountyCodeShipTo()))) &&
            ((this.countyCodeSupplier==null && other.getCountyCodeSupplier()==null) || 
             (this.countyCodeSupplier!=null &&
              this.countyCodeSupplier.equals(other.getCountyCodeSupplier()))) &&
            ((this.currencyCodeBase==null && other.getCurrencyCodeBase()==null) || 
             (this.currencyCodeBase!=null &&
              this.currencyCodeBase.equals(other.getCurrencyCodeBase()))) &&
            ((this.currencyCodeBaseDecimals==null && other.getCurrencyCodeBaseDecimals()==null) || 
             (this.currencyCodeBaseDecimals!=null &&
              this.currencyCodeBaseDecimals.equals(other.getCurrencyCodeBaseDecimals()))) &&
            ((this.currencyCodeForeign==null && other.getCurrencyCodeForeign()==null) || 
             (this.currencyCodeForeign!=null &&
              this.currencyCodeForeign.equals(other.getCurrencyCodeForeign()))) &&
            ((this.currencyCodeForeignDecimals==null && other.getCurrencyCodeForeignDecimals()==null) || 
             (this.currencyCodeForeignDecimals!=null &&
              this.currencyCodeForeignDecimals.equals(other.getCurrencyCodeForeignDecimals()))) &&
            ((this.currencyMode==null && other.getCurrencyMode()==null) || 
             (this.currencyMode!=null &&
              this.currencyMode.equals(other.getCurrencyMode()))) &&
            ((this.dateRequested==null && other.getDateRequested()==null) || 
             (this.dateRequested!=null &&
              this.dateRequested.equals(other.getDateRequested()))) &&
            ((this.dateTransaction==null && other.getDateTransaction()==null) || 
             (this.dateTransaction!=null &&
              this.dateTransaction.equals(other.getDateTransaction()))) &&
            ((this.descriptionOrder==null && other.getDescriptionOrder()==null) || 
             (this.descriptionOrder!=null &&
              this.descriptionOrder.equals(other.getDescriptionOrder()))) &&
            ((this.documentCompanyKeyOrderNo==null && other.getDocumentCompanyKeyOrderNo()==null) || 
             (this.documentCompanyKeyOrderNo!=null &&
              this.documentCompanyKeyOrderNo.equals(other.getDocumentCompanyKeyOrderNo()))) &&
            ((this.documentOrderInvoiceNumber==null && other.getDocumentOrderInvoiceNumber()==null) || 
             (this.documentOrderInvoiceNumber!=null &&
              this.documentOrderInvoiceNumber.equals(other.getDocumentOrderInvoiceNumber()))) &&
            ((this.documentOrderTypeCode==null && other.getDocumentOrderTypeCode()==null) || 
             (this.documentOrderTypeCode!=null &&
              this.documentOrderTypeCode.equals(other.getDocumentOrderTypeCode()))) &&
            ((this.documentSuffix==null && other.getDocumentSuffix()==null) || 
             (this.documentSuffix!=null &&
              this.documentSuffix.equals(other.getDocumentSuffix()))) &&
            ((this.entityNameApprover==null && other.getEntityNameApprover()==null) || 
             (this.entityNameApprover!=null &&
              this.entityNameApprover.equals(other.getEntityNameApprover()))) &&
            ((this.entityNameOriginator==null && other.getEntityNameOriginator()==null) || 
             (this.entityNameOriginator!=null &&
              this.entityNameOriginator.equals(other.getEntityNameOriginator()))) &&
            ((this.entityNameShipTo==null && other.getEntityNameShipTo()==null) || 
             (this.entityNameShipTo!=null &&
              this.entityNameShipTo.equals(other.getEntityNameShipTo()))) &&
            ((this.entityNameSupplier==null && other.getEntityNameSupplier()==null) || 
             (this.entityNameSupplier!=null &&
              this.entityNameSupplier.equals(other.getEntityNameSupplier()))) &&
            ((this.holdCodeHeldOrders==null && other.getHoldCodeHeldOrders()==null) || 
             (this.holdCodeHeldOrders!=null &&
              this.holdCodeHeldOrders.equals(other.getHoldCodeHeldOrders()))) &&
            ((this.holdCodePurchaseOrder==null && other.getHoldCodePurchaseOrder()==null) || 
             (this.holdCodePurchaseOrder!=null &&
              this.holdCodePurchaseOrder.equals(other.getHoldCodePurchaseOrder()))) &&
            ((this.originator==null && other.getOriginator()==null) || 
             (this.originator!=null &&
              this.originator.equals(other.getOriginator()))) &&
            ((this.postalCodeShipTo==null && other.getPostalCodeShipTo()==null) || 
             (this.postalCodeShipTo!=null &&
              this.postalCodeShipTo.equals(other.getPostalCodeShipTo()))) &&
            ((this.postalCodeSupplier==null && other.getPostalCodeSupplier()==null) || 
             (this.postalCodeSupplier!=null &&
              this.postalCodeSupplier.equals(other.getPostalCodeSupplier()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.stateCodeShipTo==null && other.getStateCodeShipTo()==null) || 
             (this.stateCodeShipTo!=null &&
              this.stateCodeShipTo.equals(other.getStateCodeShipTo()))) &&
            ((this.stateCodeSupplier==null && other.getStateCodeSupplier()==null) || 
             (this.stateCodeSupplier!=null &&
              this.stateCodeSupplier.equals(other.getStateCodeSupplier()))) &&
            ((this.statusApproval==null && other.getStatusApproval()==null) || 
             (this.statusApproval!=null &&
              this.statusApproval.equals(other.getStatusApproval()))) &&
            ((this.supplier==null && other.getSupplier()==null) || 
             (this.supplier!=null &&
              this.supplier.equals(other.getSupplier())));
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
        if (getAddressLine1ShipTo() != null) {
            _hashCode += getAddressLine1ShipTo().hashCode();
        }
        if (getAddressLine1Supplier() != null) {
            _hashCode += getAddressLine1Supplier().hashCode();
        }
        if (getAddressLine2ShipTo() != null) {
            _hashCode += getAddressLine2ShipTo().hashCode();
        }
        if (getAddressLine2Supplier() != null) {
            _hashCode += getAddressLine2Supplier().hashCode();
        }
        if (getAddressLine3ShipTo() != null) {
            _hashCode += getAddressLine3ShipTo().hashCode();
        }
        if (getAddressLine3Supplier() != null) {
            _hashCode += getAddressLine3Supplier().hashCode();
        }
        if (getAddressLine4ShipTo() != null) {
            _hashCode += getAddressLine4ShipTo().hashCode();
        }
        if (getAddressLine4Supplier() != null) {
            _hashCode += getAddressLine4Supplier().hashCode();
        }
        if (getAmountForeign() != null) {
            _hashCode += getAmountForeign().hashCode();
        }
        if (getAmountGross() != null) {
            _hashCode += getAmountGross().hashCode();
        }
        if (getApprovalRoutingCodeHeldOrders() != null) {
            _hashCode += getApprovalRoutingCodeHeldOrders().hashCode();
        }
        if (getApprovalRoutingCodePurchaseOrder() != null) {
            _hashCode += getApprovalRoutingCodePurchaseOrder().hashCode();
        }
        if (getApprover() != null) {
            _hashCode += getApprover().hashCode();
        }
        if (getBusinessUnitCode() != null) {
            _hashCode += getBusinessUnitCode().hashCode();
        }
        if (getBuyerNumber() != null) {
            _hashCode += getBuyerNumber().hashCode();
        }
        if (getCityShipTo() != null) {
            _hashCode += getCityShipTo().hashCode();
        }
        if (getCitySupplier() != null) {
            _hashCode += getCitySupplier().hashCode();
        }
        if (getCountryCodeShipTo() != null) {
            _hashCode += getCountryCodeShipTo().hashCode();
        }
        if (getCountryCodeSupplier() != null) {
            _hashCode += getCountryCodeSupplier().hashCode();
        }
        if (getCountyCodeShipTo() != null) {
            _hashCode += getCountyCodeShipTo().hashCode();
        }
        if (getCountyCodeSupplier() != null) {
            _hashCode += getCountyCodeSupplier().hashCode();
        }
        if (getCurrencyCodeBase() != null) {
            _hashCode += getCurrencyCodeBase().hashCode();
        }
        if (getCurrencyCodeBaseDecimals() != null) {
            _hashCode += getCurrencyCodeBaseDecimals().hashCode();
        }
        if (getCurrencyCodeForeign() != null) {
            _hashCode += getCurrencyCodeForeign().hashCode();
        }
        if (getCurrencyCodeForeignDecimals() != null) {
            _hashCode += getCurrencyCodeForeignDecimals().hashCode();
        }
        if (getCurrencyMode() != null) {
            _hashCode += getCurrencyMode().hashCode();
        }
        if (getDateRequested() != null) {
            _hashCode += getDateRequested().hashCode();
        }
        if (getDateTransaction() != null) {
            _hashCode += getDateTransaction().hashCode();
        }
        if (getDescriptionOrder() != null) {
            _hashCode += getDescriptionOrder().hashCode();
        }
        if (getDocumentCompanyKeyOrderNo() != null) {
            _hashCode += getDocumentCompanyKeyOrderNo().hashCode();
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
        if (getEntityNameApprover() != null) {
            _hashCode += getEntityNameApprover().hashCode();
        }
        if (getEntityNameOriginator() != null) {
            _hashCode += getEntityNameOriginator().hashCode();
        }
        if (getEntityNameShipTo() != null) {
            _hashCode += getEntityNameShipTo().hashCode();
        }
        if (getEntityNameSupplier() != null) {
            _hashCode += getEntityNameSupplier().hashCode();
        }
        if (getHoldCodeHeldOrders() != null) {
            _hashCode += getHoldCodeHeldOrders().hashCode();
        }
        if (getHoldCodePurchaseOrder() != null) {
            _hashCode += getHoldCodePurchaseOrder().hashCode();
        }
        if (getOriginator() != null) {
            _hashCode += getOriginator().hashCode();
        }
        if (getPostalCodeShipTo() != null) {
            _hashCode += getPostalCodeShipTo().hashCode();
        }
        if (getPostalCodeSupplier() != null) {
            _hashCode += getPostalCodeSupplier().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getStateCodeShipTo() != null) {
            _hashCode += getStateCodeShipTo().hashCode();
        }
        if (getStateCodeSupplier() != null) {
            _hashCode += getStateCodeSupplier().hashCode();
        }
        if (getStatusApproval() != null) {
            _hashCode += getStatusApproval().hashCode();
        }
        if (getSupplier() != null) {
            _hashCode += getSupplier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrdersForApproverResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrdersForApproverResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine1ShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine1ShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine1Supplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine1Supplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2ShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine2ShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2Supplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine2Supplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine3ShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine3ShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine3Supplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine3Supplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine4ShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine4ShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine4Supplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine4Supplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("approvalRoutingCodeHeldOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvalRoutingCodeHeldOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalRoutingCodePurchaseOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvalRoutingCodePurchaseOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
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
        elemField.setFieldName("buyerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buyerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citySupplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "citySupplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCodeShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCodeShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCodeSupplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCodeSupplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyCodeShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countyCodeShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyCodeSupplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countyCodeSupplier"));
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
        elemField.setFieldName("currencyCodeBaseDecimals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCodeBaseDecimals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("currencyCodeForeignDecimals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCodeForeignDecimals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyMode"));
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
        elemField.setFieldName("descriptionOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptionOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentCompanyKeyOrderNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentCompanyKeyOrderNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("entityNameApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityNameApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityNameOriginator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityNameOriginator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityNameShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityNameShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityNameSupplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityNameSupplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdCodeHeldOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdCodeHeldOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdCodePurchaseOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdCodePurchaseOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCodeShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalCodeShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCodeSupplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalCodeSupplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("stateCodeShipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateCodeShipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateCodeSupplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateCodeSupplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusApproval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusApproval"));
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
