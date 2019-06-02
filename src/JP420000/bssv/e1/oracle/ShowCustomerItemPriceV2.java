/**
 * ShowCustomerItemPriceV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ShowCustomerItemPriceV2  extends JP420000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private java.lang.String businessUnit;

    private java.math.BigDecimal costExtendedDomestic;

    private java.math.BigDecimal costExtendedForeign;

    private java.math.BigDecimal costUnitDomestic;

    private java.math.BigDecimal costUnitForeign;

    private java.lang.String currencyCode;

    private java.lang.String currencyModeCode;

    private JP420000.bssv.e1.oracle.Customer customer;

    private java.util.Calendar datePriceEffective;

    private java.util.Calendar dateTaxedPricesEffective;

    private java.math.BigDecimal priceExtendedDomestic;

    private java.math.BigDecimal priceExtendedForeign;

    private java.math.BigDecimal priceListDomestic;

    private java.math.BigDecimal priceListForeign;

    private java.math.BigDecimal priceUnitDomestic;

    private java.math.BigDecimal priceUnitForeign;

    private JP420000.bssv.e1.oracle.Product product;

    private java.math.BigDecimal quantityOrdered;

    private java.math.BigDecimal taxAmountExtendedDomestic;

    private java.math.BigDecimal taxAmountExtendedForeign;

    private java.math.BigDecimal taxAmountUnitDomestic;

    private java.math.BigDecimal taxAmountUnitForeign;

    private java.math.BigDecimal taxedPriceExtendedDomestic;

    private java.math.BigDecimal taxedPriceExtendedForeign;

    private java.math.BigDecimal taxedPriceUnitDomestic;

    private java.math.BigDecimal taxedPriceUnitForeign;

    private java.lang.String unitOfMeasureCodePricing;

    private java.lang.String unitOfMeasureCodeTransaction;

    private java.lang.Boolean useTaxedPrices;

    public ShowCustomerItemPriceV2() {
    }

    public ShowCustomerItemPriceV2(
           JP420000.bssv.e1.oracle.E1Message[] e1MessageList,
           java.lang.String businessUnit,
           java.math.BigDecimal costExtendedDomestic,
           java.math.BigDecimal costExtendedForeign,
           java.math.BigDecimal costUnitDomestic,
           java.math.BigDecimal costUnitForeign,
           java.lang.String currencyCode,
           java.lang.String currencyModeCode,
           JP420000.bssv.e1.oracle.Customer customer,
           java.util.Calendar datePriceEffective,
           java.util.Calendar dateTaxedPricesEffective,
           java.math.BigDecimal priceExtendedDomestic,
           java.math.BigDecimal priceExtendedForeign,
           java.math.BigDecimal priceListDomestic,
           java.math.BigDecimal priceListForeign,
           java.math.BigDecimal priceUnitDomestic,
           java.math.BigDecimal priceUnitForeign,
           JP420000.bssv.e1.oracle.Product product,
           java.math.BigDecimal quantityOrdered,
           java.math.BigDecimal taxAmountExtendedDomestic,
           java.math.BigDecimal taxAmountExtendedForeign,
           java.math.BigDecimal taxAmountUnitDomestic,
           java.math.BigDecimal taxAmountUnitForeign,
           java.math.BigDecimal taxedPriceExtendedDomestic,
           java.math.BigDecimal taxedPriceExtendedForeign,
           java.math.BigDecimal taxedPriceUnitDomestic,
           java.math.BigDecimal taxedPriceUnitForeign,
           java.lang.String unitOfMeasureCodePricing,
           java.lang.String unitOfMeasureCodeTransaction,
           java.lang.Boolean useTaxedPrices) {
        super(
            e1MessageList);
        this.businessUnit = businessUnit;
        this.costExtendedDomestic = costExtendedDomestic;
        this.costExtendedForeign = costExtendedForeign;
        this.costUnitDomestic = costUnitDomestic;
        this.costUnitForeign = costUnitForeign;
        this.currencyCode = currencyCode;
        this.currencyModeCode = currencyModeCode;
        this.customer = customer;
        this.datePriceEffective = datePriceEffective;
        this.dateTaxedPricesEffective = dateTaxedPricesEffective;
        this.priceExtendedDomestic = priceExtendedDomestic;
        this.priceExtendedForeign = priceExtendedForeign;
        this.priceListDomestic = priceListDomestic;
        this.priceListForeign = priceListForeign;
        this.priceUnitDomestic = priceUnitDomestic;
        this.priceUnitForeign = priceUnitForeign;
        this.product = product;
        this.quantityOrdered = quantityOrdered;
        this.taxAmountExtendedDomestic = taxAmountExtendedDomestic;
        this.taxAmountExtendedForeign = taxAmountExtendedForeign;
        this.taxAmountUnitDomestic = taxAmountUnitDomestic;
        this.taxAmountUnitForeign = taxAmountUnitForeign;
        this.taxedPriceExtendedDomestic = taxedPriceExtendedDomestic;
        this.taxedPriceExtendedForeign = taxedPriceExtendedForeign;
        this.taxedPriceUnitDomestic = taxedPriceUnitDomestic;
        this.taxedPriceUnitForeign = taxedPriceUnitForeign;
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
        this.useTaxedPrices = useTaxedPrices;
    }


    /**
     * Gets the businessUnit value for this ShowCustomerItemPriceV2.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this ShowCustomerItemPriceV2.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the costExtendedDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @return costExtendedDomestic
     */
    public java.math.BigDecimal getCostExtendedDomestic() {
        return costExtendedDomestic;
    }


    /**
     * Sets the costExtendedDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @param costExtendedDomestic
     */
    public void setCostExtendedDomestic(java.math.BigDecimal costExtendedDomestic) {
        this.costExtendedDomestic = costExtendedDomestic;
    }


    /**
     * Gets the costExtendedForeign value for this ShowCustomerItemPriceV2.
     * 
     * @return costExtendedForeign
     */
    public java.math.BigDecimal getCostExtendedForeign() {
        return costExtendedForeign;
    }


    /**
     * Sets the costExtendedForeign value for this ShowCustomerItemPriceV2.
     * 
     * @param costExtendedForeign
     */
    public void setCostExtendedForeign(java.math.BigDecimal costExtendedForeign) {
        this.costExtendedForeign = costExtendedForeign;
    }


    /**
     * Gets the costUnitDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @return costUnitDomestic
     */
    public java.math.BigDecimal getCostUnitDomestic() {
        return costUnitDomestic;
    }


    /**
     * Sets the costUnitDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @param costUnitDomestic
     */
    public void setCostUnitDomestic(java.math.BigDecimal costUnitDomestic) {
        this.costUnitDomestic = costUnitDomestic;
    }


    /**
     * Gets the costUnitForeign value for this ShowCustomerItemPriceV2.
     * 
     * @return costUnitForeign
     */
    public java.math.BigDecimal getCostUnitForeign() {
        return costUnitForeign;
    }


    /**
     * Sets the costUnitForeign value for this ShowCustomerItemPriceV2.
     * 
     * @param costUnitForeign
     */
    public void setCostUnitForeign(java.math.BigDecimal costUnitForeign) {
        this.costUnitForeign = costUnitForeign;
    }


    /**
     * Gets the currencyCode value for this ShowCustomerItemPriceV2.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this ShowCustomerItemPriceV2.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the currencyModeCode value for this ShowCustomerItemPriceV2.
     * 
     * @return currencyModeCode
     */
    public java.lang.String getCurrencyModeCode() {
        return currencyModeCode;
    }


    /**
     * Sets the currencyModeCode value for this ShowCustomerItemPriceV2.
     * 
     * @param currencyModeCode
     */
    public void setCurrencyModeCode(java.lang.String currencyModeCode) {
        this.currencyModeCode = currencyModeCode;
    }


    /**
     * Gets the customer value for this ShowCustomerItemPriceV2.
     * 
     * @return customer
     */
    public JP420000.bssv.e1.oracle.Customer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this ShowCustomerItemPriceV2.
     * 
     * @param customer
     */
    public void setCustomer(JP420000.bssv.e1.oracle.Customer customer) {
        this.customer = customer;
    }


    /**
     * Gets the datePriceEffective value for this ShowCustomerItemPriceV2.
     * 
     * @return datePriceEffective
     */
    public java.util.Calendar getDatePriceEffective() {
        return datePriceEffective;
    }


    /**
     * Sets the datePriceEffective value for this ShowCustomerItemPriceV2.
     * 
     * @param datePriceEffective
     */
    public void setDatePriceEffective(java.util.Calendar datePriceEffective) {
        this.datePriceEffective = datePriceEffective;
    }


    /**
     * Gets the dateTaxedPricesEffective value for this ShowCustomerItemPriceV2.
     * 
     * @return dateTaxedPricesEffective
     */
    public java.util.Calendar getDateTaxedPricesEffective() {
        return dateTaxedPricesEffective;
    }


    /**
     * Sets the dateTaxedPricesEffective value for this ShowCustomerItemPriceV2.
     * 
     * @param dateTaxedPricesEffective
     */
    public void setDateTaxedPricesEffective(java.util.Calendar dateTaxedPricesEffective) {
        this.dateTaxedPricesEffective = dateTaxedPricesEffective;
    }


    /**
     * Gets the priceExtendedDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @return priceExtendedDomestic
     */
    public java.math.BigDecimal getPriceExtendedDomestic() {
        return priceExtendedDomestic;
    }


    /**
     * Sets the priceExtendedDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @param priceExtendedDomestic
     */
    public void setPriceExtendedDomestic(java.math.BigDecimal priceExtendedDomestic) {
        this.priceExtendedDomestic = priceExtendedDomestic;
    }


    /**
     * Gets the priceExtendedForeign value for this ShowCustomerItemPriceV2.
     * 
     * @return priceExtendedForeign
     */
    public java.math.BigDecimal getPriceExtendedForeign() {
        return priceExtendedForeign;
    }


    /**
     * Sets the priceExtendedForeign value for this ShowCustomerItemPriceV2.
     * 
     * @param priceExtendedForeign
     */
    public void setPriceExtendedForeign(java.math.BigDecimal priceExtendedForeign) {
        this.priceExtendedForeign = priceExtendedForeign;
    }


    /**
     * Gets the priceListDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @return priceListDomestic
     */
    public java.math.BigDecimal getPriceListDomestic() {
        return priceListDomestic;
    }


    /**
     * Sets the priceListDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @param priceListDomestic
     */
    public void setPriceListDomestic(java.math.BigDecimal priceListDomestic) {
        this.priceListDomestic = priceListDomestic;
    }


    /**
     * Gets the priceListForeign value for this ShowCustomerItemPriceV2.
     * 
     * @return priceListForeign
     */
    public java.math.BigDecimal getPriceListForeign() {
        return priceListForeign;
    }


    /**
     * Sets the priceListForeign value for this ShowCustomerItemPriceV2.
     * 
     * @param priceListForeign
     */
    public void setPriceListForeign(java.math.BigDecimal priceListForeign) {
        this.priceListForeign = priceListForeign;
    }


    /**
     * Gets the priceUnitDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @return priceUnitDomestic
     */
    public java.math.BigDecimal getPriceUnitDomestic() {
        return priceUnitDomestic;
    }


    /**
     * Sets the priceUnitDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @param priceUnitDomestic
     */
    public void setPriceUnitDomestic(java.math.BigDecimal priceUnitDomestic) {
        this.priceUnitDomestic = priceUnitDomestic;
    }


    /**
     * Gets the priceUnitForeign value for this ShowCustomerItemPriceV2.
     * 
     * @return priceUnitForeign
     */
    public java.math.BigDecimal getPriceUnitForeign() {
        return priceUnitForeign;
    }


    /**
     * Sets the priceUnitForeign value for this ShowCustomerItemPriceV2.
     * 
     * @param priceUnitForeign
     */
    public void setPriceUnitForeign(java.math.BigDecimal priceUnitForeign) {
        this.priceUnitForeign = priceUnitForeign;
    }


    /**
     * Gets the product value for this ShowCustomerItemPriceV2.
     * 
     * @return product
     */
    public JP420000.bssv.e1.oracle.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ShowCustomerItemPriceV2.
     * 
     * @param product
     */
    public void setProduct(JP420000.bssv.e1.oracle.Product product) {
        this.product = product;
    }


    /**
     * Gets the quantityOrdered value for this ShowCustomerItemPriceV2.
     * 
     * @return quantityOrdered
     */
    public java.math.BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }


    /**
     * Sets the quantityOrdered value for this ShowCustomerItemPriceV2.
     * 
     * @param quantityOrdered
     */
    public void setQuantityOrdered(java.math.BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }


    /**
     * Gets the taxAmountExtendedDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @return taxAmountExtendedDomestic
     */
    public java.math.BigDecimal getTaxAmountExtendedDomestic() {
        return taxAmountExtendedDomestic;
    }


    /**
     * Sets the taxAmountExtendedDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @param taxAmountExtendedDomestic
     */
    public void setTaxAmountExtendedDomestic(java.math.BigDecimal taxAmountExtendedDomestic) {
        this.taxAmountExtendedDomestic = taxAmountExtendedDomestic;
    }


    /**
     * Gets the taxAmountExtendedForeign value for this ShowCustomerItemPriceV2.
     * 
     * @return taxAmountExtendedForeign
     */
    public java.math.BigDecimal getTaxAmountExtendedForeign() {
        return taxAmountExtendedForeign;
    }


    /**
     * Sets the taxAmountExtendedForeign value for this ShowCustomerItemPriceV2.
     * 
     * @param taxAmountExtendedForeign
     */
    public void setTaxAmountExtendedForeign(java.math.BigDecimal taxAmountExtendedForeign) {
        this.taxAmountExtendedForeign = taxAmountExtendedForeign;
    }


    /**
     * Gets the taxAmountUnitDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @return taxAmountUnitDomestic
     */
    public java.math.BigDecimal getTaxAmountUnitDomestic() {
        return taxAmountUnitDomestic;
    }


    /**
     * Sets the taxAmountUnitDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @param taxAmountUnitDomestic
     */
    public void setTaxAmountUnitDomestic(java.math.BigDecimal taxAmountUnitDomestic) {
        this.taxAmountUnitDomestic = taxAmountUnitDomestic;
    }


    /**
     * Gets the taxAmountUnitForeign value for this ShowCustomerItemPriceV2.
     * 
     * @return taxAmountUnitForeign
     */
    public java.math.BigDecimal getTaxAmountUnitForeign() {
        return taxAmountUnitForeign;
    }


    /**
     * Sets the taxAmountUnitForeign value for this ShowCustomerItemPriceV2.
     * 
     * @param taxAmountUnitForeign
     */
    public void setTaxAmountUnitForeign(java.math.BigDecimal taxAmountUnitForeign) {
        this.taxAmountUnitForeign = taxAmountUnitForeign;
    }


    /**
     * Gets the taxedPriceExtendedDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @return taxedPriceExtendedDomestic
     */
    public java.math.BigDecimal getTaxedPriceExtendedDomestic() {
        return taxedPriceExtendedDomestic;
    }


    /**
     * Sets the taxedPriceExtendedDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @param taxedPriceExtendedDomestic
     */
    public void setTaxedPriceExtendedDomestic(java.math.BigDecimal taxedPriceExtendedDomestic) {
        this.taxedPriceExtendedDomestic = taxedPriceExtendedDomestic;
    }


    /**
     * Gets the taxedPriceExtendedForeign value for this ShowCustomerItemPriceV2.
     * 
     * @return taxedPriceExtendedForeign
     */
    public java.math.BigDecimal getTaxedPriceExtendedForeign() {
        return taxedPriceExtendedForeign;
    }


    /**
     * Sets the taxedPriceExtendedForeign value for this ShowCustomerItemPriceV2.
     * 
     * @param taxedPriceExtendedForeign
     */
    public void setTaxedPriceExtendedForeign(java.math.BigDecimal taxedPriceExtendedForeign) {
        this.taxedPriceExtendedForeign = taxedPriceExtendedForeign;
    }


    /**
     * Gets the taxedPriceUnitDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @return taxedPriceUnitDomestic
     */
    public java.math.BigDecimal getTaxedPriceUnitDomestic() {
        return taxedPriceUnitDomestic;
    }


    /**
     * Sets the taxedPriceUnitDomestic value for this ShowCustomerItemPriceV2.
     * 
     * @param taxedPriceUnitDomestic
     */
    public void setTaxedPriceUnitDomestic(java.math.BigDecimal taxedPriceUnitDomestic) {
        this.taxedPriceUnitDomestic = taxedPriceUnitDomestic;
    }


    /**
     * Gets the taxedPriceUnitForeign value for this ShowCustomerItemPriceV2.
     * 
     * @return taxedPriceUnitForeign
     */
    public java.math.BigDecimal getTaxedPriceUnitForeign() {
        return taxedPriceUnitForeign;
    }


    /**
     * Sets the taxedPriceUnitForeign value for this ShowCustomerItemPriceV2.
     * 
     * @param taxedPriceUnitForeign
     */
    public void setTaxedPriceUnitForeign(java.math.BigDecimal taxedPriceUnitForeign) {
        this.taxedPriceUnitForeign = taxedPriceUnitForeign;
    }


    /**
     * Gets the unitOfMeasureCodePricing value for this ShowCustomerItemPriceV2.
     * 
     * @return unitOfMeasureCodePricing
     */
    public java.lang.String getUnitOfMeasureCodePricing() {
        return unitOfMeasureCodePricing;
    }


    /**
     * Sets the unitOfMeasureCodePricing value for this ShowCustomerItemPriceV2.
     * 
     * @param unitOfMeasureCodePricing
     */
    public void setUnitOfMeasureCodePricing(java.lang.String unitOfMeasureCodePricing) {
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
    }


    /**
     * Gets the unitOfMeasureCodeTransaction value for this ShowCustomerItemPriceV2.
     * 
     * @return unitOfMeasureCodeTransaction
     */
    public java.lang.String getUnitOfMeasureCodeTransaction() {
        return unitOfMeasureCodeTransaction;
    }


    /**
     * Sets the unitOfMeasureCodeTransaction value for this ShowCustomerItemPriceV2.
     * 
     * @param unitOfMeasureCodeTransaction
     */
    public void setUnitOfMeasureCodeTransaction(java.lang.String unitOfMeasureCodeTransaction) {
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }


    /**
     * Gets the useTaxedPrices value for this ShowCustomerItemPriceV2.
     * 
     * @return useTaxedPrices
     */
    public java.lang.Boolean getUseTaxedPrices() {
        return useTaxedPrices;
    }


    /**
     * Sets the useTaxedPrices value for this ShowCustomerItemPriceV2.
     * 
     * @param useTaxedPrices
     */
    public void setUseTaxedPrices(java.lang.Boolean useTaxedPrices) {
        this.useTaxedPrices = useTaxedPrices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowCustomerItemPriceV2)) return false;
        ShowCustomerItemPriceV2 other = (ShowCustomerItemPriceV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.costExtendedDomestic==null && other.getCostExtendedDomestic()==null) || 
             (this.costExtendedDomestic!=null &&
              this.costExtendedDomestic.equals(other.getCostExtendedDomestic()))) &&
            ((this.costExtendedForeign==null && other.getCostExtendedForeign()==null) || 
             (this.costExtendedForeign!=null &&
              this.costExtendedForeign.equals(other.getCostExtendedForeign()))) &&
            ((this.costUnitDomestic==null && other.getCostUnitDomestic()==null) || 
             (this.costUnitDomestic!=null &&
              this.costUnitDomestic.equals(other.getCostUnitDomestic()))) &&
            ((this.costUnitForeign==null && other.getCostUnitForeign()==null) || 
             (this.costUnitForeign!=null &&
              this.costUnitForeign.equals(other.getCostUnitForeign()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.currencyModeCode==null && other.getCurrencyModeCode()==null) || 
             (this.currencyModeCode!=null &&
              this.currencyModeCode.equals(other.getCurrencyModeCode()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.datePriceEffective==null && other.getDatePriceEffective()==null) || 
             (this.datePriceEffective!=null &&
              this.datePriceEffective.equals(other.getDatePriceEffective()))) &&
            ((this.dateTaxedPricesEffective==null && other.getDateTaxedPricesEffective()==null) || 
             (this.dateTaxedPricesEffective!=null &&
              this.dateTaxedPricesEffective.equals(other.getDateTaxedPricesEffective()))) &&
            ((this.priceExtendedDomestic==null && other.getPriceExtendedDomestic()==null) || 
             (this.priceExtendedDomestic!=null &&
              this.priceExtendedDomestic.equals(other.getPriceExtendedDomestic()))) &&
            ((this.priceExtendedForeign==null && other.getPriceExtendedForeign()==null) || 
             (this.priceExtendedForeign!=null &&
              this.priceExtendedForeign.equals(other.getPriceExtendedForeign()))) &&
            ((this.priceListDomestic==null && other.getPriceListDomestic()==null) || 
             (this.priceListDomestic!=null &&
              this.priceListDomestic.equals(other.getPriceListDomestic()))) &&
            ((this.priceListForeign==null && other.getPriceListForeign()==null) || 
             (this.priceListForeign!=null &&
              this.priceListForeign.equals(other.getPriceListForeign()))) &&
            ((this.priceUnitDomestic==null && other.getPriceUnitDomestic()==null) || 
             (this.priceUnitDomestic!=null &&
              this.priceUnitDomestic.equals(other.getPriceUnitDomestic()))) &&
            ((this.priceUnitForeign==null && other.getPriceUnitForeign()==null) || 
             (this.priceUnitForeign!=null &&
              this.priceUnitForeign.equals(other.getPriceUnitForeign()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.quantityOrdered==null && other.getQuantityOrdered()==null) || 
             (this.quantityOrdered!=null &&
              this.quantityOrdered.equals(other.getQuantityOrdered()))) &&
            ((this.taxAmountExtendedDomestic==null && other.getTaxAmountExtendedDomestic()==null) || 
             (this.taxAmountExtendedDomestic!=null &&
              this.taxAmountExtendedDomestic.equals(other.getTaxAmountExtendedDomestic()))) &&
            ((this.taxAmountExtendedForeign==null && other.getTaxAmountExtendedForeign()==null) || 
             (this.taxAmountExtendedForeign!=null &&
              this.taxAmountExtendedForeign.equals(other.getTaxAmountExtendedForeign()))) &&
            ((this.taxAmountUnitDomestic==null && other.getTaxAmountUnitDomestic()==null) || 
             (this.taxAmountUnitDomestic!=null &&
              this.taxAmountUnitDomestic.equals(other.getTaxAmountUnitDomestic()))) &&
            ((this.taxAmountUnitForeign==null && other.getTaxAmountUnitForeign()==null) || 
             (this.taxAmountUnitForeign!=null &&
              this.taxAmountUnitForeign.equals(other.getTaxAmountUnitForeign()))) &&
            ((this.taxedPriceExtendedDomestic==null && other.getTaxedPriceExtendedDomestic()==null) || 
             (this.taxedPriceExtendedDomestic!=null &&
              this.taxedPriceExtendedDomestic.equals(other.getTaxedPriceExtendedDomestic()))) &&
            ((this.taxedPriceExtendedForeign==null && other.getTaxedPriceExtendedForeign()==null) || 
             (this.taxedPriceExtendedForeign!=null &&
              this.taxedPriceExtendedForeign.equals(other.getTaxedPriceExtendedForeign()))) &&
            ((this.taxedPriceUnitDomestic==null && other.getTaxedPriceUnitDomestic()==null) || 
             (this.taxedPriceUnitDomestic!=null &&
              this.taxedPriceUnitDomestic.equals(other.getTaxedPriceUnitDomestic()))) &&
            ((this.taxedPriceUnitForeign==null && other.getTaxedPriceUnitForeign()==null) || 
             (this.taxedPriceUnitForeign!=null &&
              this.taxedPriceUnitForeign.equals(other.getTaxedPriceUnitForeign()))) &&
            ((this.unitOfMeasureCodePricing==null && other.getUnitOfMeasureCodePricing()==null) || 
             (this.unitOfMeasureCodePricing!=null &&
              this.unitOfMeasureCodePricing.equals(other.getUnitOfMeasureCodePricing()))) &&
            ((this.unitOfMeasureCodeTransaction==null && other.getUnitOfMeasureCodeTransaction()==null) || 
             (this.unitOfMeasureCodeTransaction!=null &&
              this.unitOfMeasureCodeTransaction.equals(other.getUnitOfMeasureCodeTransaction()))) &&
            ((this.useTaxedPrices==null && other.getUseTaxedPrices()==null) || 
             (this.useTaxedPrices!=null &&
              this.useTaxedPrices.equals(other.getUseTaxedPrices())));
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
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCostExtendedDomestic() != null) {
            _hashCode += getCostExtendedDomestic().hashCode();
        }
        if (getCostExtendedForeign() != null) {
            _hashCode += getCostExtendedForeign().hashCode();
        }
        if (getCostUnitDomestic() != null) {
            _hashCode += getCostUnitDomestic().hashCode();
        }
        if (getCostUnitForeign() != null) {
            _hashCode += getCostUnitForeign().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCurrencyModeCode() != null) {
            _hashCode += getCurrencyModeCode().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getDatePriceEffective() != null) {
            _hashCode += getDatePriceEffective().hashCode();
        }
        if (getDateTaxedPricesEffective() != null) {
            _hashCode += getDateTaxedPricesEffective().hashCode();
        }
        if (getPriceExtendedDomestic() != null) {
            _hashCode += getPriceExtendedDomestic().hashCode();
        }
        if (getPriceExtendedForeign() != null) {
            _hashCode += getPriceExtendedForeign().hashCode();
        }
        if (getPriceListDomestic() != null) {
            _hashCode += getPriceListDomestic().hashCode();
        }
        if (getPriceListForeign() != null) {
            _hashCode += getPriceListForeign().hashCode();
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
        if (getQuantityOrdered() != null) {
            _hashCode += getQuantityOrdered().hashCode();
        }
        if (getTaxAmountExtendedDomestic() != null) {
            _hashCode += getTaxAmountExtendedDomestic().hashCode();
        }
        if (getTaxAmountExtendedForeign() != null) {
            _hashCode += getTaxAmountExtendedForeign().hashCode();
        }
        if (getTaxAmountUnitDomestic() != null) {
            _hashCode += getTaxAmountUnitDomestic().hashCode();
        }
        if (getTaxAmountUnitForeign() != null) {
            _hashCode += getTaxAmountUnitForeign().hashCode();
        }
        if (getTaxedPriceExtendedDomestic() != null) {
            _hashCode += getTaxedPriceExtendedDomestic().hashCode();
        }
        if (getTaxedPriceExtendedForeign() != null) {
            _hashCode += getTaxedPriceExtendedForeign().hashCode();
        }
        if (getTaxedPriceUnitDomestic() != null) {
            _hashCode += getTaxedPriceUnitDomestic().hashCode();
        }
        if (getTaxedPriceUnitForeign() != null) {
            _hashCode += getTaxedPriceUnitForeign().hashCode();
        }
        if (getUnitOfMeasureCodePricing() != null) {
            _hashCode += getUnitOfMeasureCodePricing().hashCode();
        }
        if (getUnitOfMeasureCodeTransaction() != null) {
            _hashCode += getUnitOfMeasureCodeTransaction().hashCode();
        }
        if (getUseTaxedPrices() != null) {
            _hashCode += getUseTaxedPrices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShowCustomerItemPriceV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showCustomerItemPriceV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnit"));
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
        elemField.setFieldName("costUnitDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costUnitDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costUnitForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costUnitForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
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
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "customer"));
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
        elemField.setFieldName("dateTaxedPricesEffective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTaxedPricesEffective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("priceListDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceListDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceListForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceListForeign"));
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
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "product"));
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
        elemField.setFieldName("taxAmountExtendedDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxAmountExtendedDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmountExtendedForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxAmountExtendedForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmountUnitDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxAmountUnitDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmountUnitForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxAmountUnitForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxedPriceExtendedDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxedPriceExtendedDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxedPriceExtendedForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxedPriceExtendedForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxedPriceUnitDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxedPriceUnitDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxedPriceUnitForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxedPriceUnitForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useTaxedPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useTaxedPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
