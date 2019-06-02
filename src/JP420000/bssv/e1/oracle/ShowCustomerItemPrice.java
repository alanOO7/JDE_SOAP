/**
 * ShowCustomerItemPrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ShowCustomerItemPrice  extends JP420000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private java.lang.String businessUnit;

    private java.math.BigDecimal costExtendedDomestic;

    private java.math.BigDecimal costExtendedForeign;

    private java.math.BigDecimal costUnitDomestic;

    private java.math.BigDecimal costUnitForeign;

    private java.lang.String currencyCode;

    private java.lang.String currencyModeCode;

    private JP420000.bssv.e1.oracle.Customer customer;

    private java.util.Calendar datePriceEffective;

    private java.math.BigDecimal priceExtendedDomestic;

    private java.math.BigDecimal priceExtendedForeign;

    private java.math.BigDecimal priceListDomestic;

    private java.math.BigDecimal priceListForeign;

    private java.math.BigDecimal priceUnitDomestic;

    private java.math.BigDecimal priceUnitForeign;

    private JP420000.bssv.e1.oracle.Product product;

    private java.math.BigDecimal quantityOrdered;

    private java.lang.String unitOfMeasureCodePricing;

    private java.lang.String unitOfMeasureCodeTransaction;

    public ShowCustomerItemPrice() {
    }

    public ShowCustomerItemPrice(
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
           java.math.BigDecimal priceExtendedDomestic,
           java.math.BigDecimal priceExtendedForeign,
           java.math.BigDecimal priceListDomestic,
           java.math.BigDecimal priceListForeign,
           java.math.BigDecimal priceUnitDomestic,
           java.math.BigDecimal priceUnitForeign,
           JP420000.bssv.e1.oracle.Product product,
           java.math.BigDecimal quantityOrdered,
           java.lang.String unitOfMeasureCodePricing,
           java.lang.String unitOfMeasureCodeTransaction) {
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
        this.priceExtendedDomestic = priceExtendedDomestic;
        this.priceExtendedForeign = priceExtendedForeign;
        this.priceListDomestic = priceListDomestic;
        this.priceListForeign = priceListForeign;
        this.priceUnitDomestic = priceUnitDomestic;
        this.priceUnitForeign = priceUnitForeign;
        this.product = product;
        this.quantityOrdered = quantityOrdered;
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }


    /**
     * Gets the businessUnit value for this ShowCustomerItemPrice.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this ShowCustomerItemPrice.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the costExtendedDomestic value for this ShowCustomerItemPrice.
     * 
     * @return costExtendedDomestic
     */
    public java.math.BigDecimal getCostExtendedDomestic() {
        return costExtendedDomestic;
    }


    /**
     * Sets the costExtendedDomestic value for this ShowCustomerItemPrice.
     * 
     * @param costExtendedDomestic
     */
    public void setCostExtendedDomestic(java.math.BigDecimal costExtendedDomestic) {
        this.costExtendedDomestic = costExtendedDomestic;
    }


    /**
     * Gets the costExtendedForeign value for this ShowCustomerItemPrice.
     * 
     * @return costExtendedForeign
     */
    public java.math.BigDecimal getCostExtendedForeign() {
        return costExtendedForeign;
    }


    /**
     * Sets the costExtendedForeign value for this ShowCustomerItemPrice.
     * 
     * @param costExtendedForeign
     */
    public void setCostExtendedForeign(java.math.BigDecimal costExtendedForeign) {
        this.costExtendedForeign = costExtendedForeign;
    }


    /**
     * Gets the costUnitDomestic value for this ShowCustomerItemPrice.
     * 
     * @return costUnitDomestic
     */
    public java.math.BigDecimal getCostUnitDomestic() {
        return costUnitDomestic;
    }


    /**
     * Sets the costUnitDomestic value for this ShowCustomerItemPrice.
     * 
     * @param costUnitDomestic
     */
    public void setCostUnitDomestic(java.math.BigDecimal costUnitDomestic) {
        this.costUnitDomestic = costUnitDomestic;
    }


    /**
     * Gets the costUnitForeign value for this ShowCustomerItemPrice.
     * 
     * @return costUnitForeign
     */
    public java.math.BigDecimal getCostUnitForeign() {
        return costUnitForeign;
    }


    /**
     * Sets the costUnitForeign value for this ShowCustomerItemPrice.
     * 
     * @param costUnitForeign
     */
    public void setCostUnitForeign(java.math.BigDecimal costUnitForeign) {
        this.costUnitForeign = costUnitForeign;
    }


    /**
     * Gets the currencyCode value for this ShowCustomerItemPrice.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this ShowCustomerItemPrice.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the currencyModeCode value for this ShowCustomerItemPrice.
     * 
     * @return currencyModeCode
     */
    public java.lang.String getCurrencyModeCode() {
        return currencyModeCode;
    }


    /**
     * Sets the currencyModeCode value for this ShowCustomerItemPrice.
     * 
     * @param currencyModeCode
     */
    public void setCurrencyModeCode(java.lang.String currencyModeCode) {
        this.currencyModeCode = currencyModeCode;
    }


    /**
     * Gets the customer value for this ShowCustomerItemPrice.
     * 
     * @return customer
     */
    public JP420000.bssv.e1.oracle.Customer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this ShowCustomerItemPrice.
     * 
     * @param customer
     */
    public void setCustomer(JP420000.bssv.e1.oracle.Customer customer) {
        this.customer = customer;
    }


    /**
     * Gets the datePriceEffective value for this ShowCustomerItemPrice.
     * 
     * @return datePriceEffective
     */
    public java.util.Calendar getDatePriceEffective() {
        return datePriceEffective;
    }


    /**
     * Sets the datePriceEffective value for this ShowCustomerItemPrice.
     * 
     * @param datePriceEffective
     */
    public void setDatePriceEffective(java.util.Calendar datePriceEffective) {
        this.datePriceEffective = datePriceEffective;
    }


    /**
     * Gets the priceExtendedDomestic value for this ShowCustomerItemPrice.
     * 
     * @return priceExtendedDomestic
     */
    public java.math.BigDecimal getPriceExtendedDomestic() {
        return priceExtendedDomestic;
    }


    /**
     * Sets the priceExtendedDomestic value for this ShowCustomerItemPrice.
     * 
     * @param priceExtendedDomestic
     */
    public void setPriceExtendedDomestic(java.math.BigDecimal priceExtendedDomestic) {
        this.priceExtendedDomestic = priceExtendedDomestic;
    }


    /**
     * Gets the priceExtendedForeign value for this ShowCustomerItemPrice.
     * 
     * @return priceExtendedForeign
     */
    public java.math.BigDecimal getPriceExtendedForeign() {
        return priceExtendedForeign;
    }


    /**
     * Sets the priceExtendedForeign value for this ShowCustomerItemPrice.
     * 
     * @param priceExtendedForeign
     */
    public void setPriceExtendedForeign(java.math.BigDecimal priceExtendedForeign) {
        this.priceExtendedForeign = priceExtendedForeign;
    }


    /**
     * Gets the priceListDomestic value for this ShowCustomerItemPrice.
     * 
     * @return priceListDomestic
     */
    public java.math.BigDecimal getPriceListDomestic() {
        return priceListDomestic;
    }


    /**
     * Sets the priceListDomestic value for this ShowCustomerItemPrice.
     * 
     * @param priceListDomestic
     */
    public void setPriceListDomestic(java.math.BigDecimal priceListDomestic) {
        this.priceListDomestic = priceListDomestic;
    }


    /**
     * Gets the priceListForeign value for this ShowCustomerItemPrice.
     * 
     * @return priceListForeign
     */
    public java.math.BigDecimal getPriceListForeign() {
        return priceListForeign;
    }


    /**
     * Sets the priceListForeign value for this ShowCustomerItemPrice.
     * 
     * @param priceListForeign
     */
    public void setPriceListForeign(java.math.BigDecimal priceListForeign) {
        this.priceListForeign = priceListForeign;
    }


    /**
     * Gets the priceUnitDomestic value for this ShowCustomerItemPrice.
     * 
     * @return priceUnitDomestic
     */
    public java.math.BigDecimal getPriceUnitDomestic() {
        return priceUnitDomestic;
    }


    /**
     * Sets the priceUnitDomestic value for this ShowCustomerItemPrice.
     * 
     * @param priceUnitDomestic
     */
    public void setPriceUnitDomestic(java.math.BigDecimal priceUnitDomestic) {
        this.priceUnitDomestic = priceUnitDomestic;
    }


    /**
     * Gets the priceUnitForeign value for this ShowCustomerItemPrice.
     * 
     * @return priceUnitForeign
     */
    public java.math.BigDecimal getPriceUnitForeign() {
        return priceUnitForeign;
    }


    /**
     * Sets the priceUnitForeign value for this ShowCustomerItemPrice.
     * 
     * @param priceUnitForeign
     */
    public void setPriceUnitForeign(java.math.BigDecimal priceUnitForeign) {
        this.priceUnitForeign = priceUnitForeign;
    }


    /**
     * Gets the product value for this ShowCustomerItemPrice.
     * 
     * @return product
     */
    public JP420000.bssv.e1.oracle.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ShowCustomerItemPrice.
     * 
     * @param product
     */
    public void setProduct(JP420000.bssv.e1.oracle.Product product) {
        this.product = product;
    }


    /**
     * Gets the quantityOrdered value for this ShowCustomerItemPrice.
     * 
     * @return quantityOrdered
     */
    public java.math.BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }


    /**
     * Sets the quantityOrdered value for this ShowCustomerItemPrice.
     * 
     * @param quantityOrdered
     */
    public void setQuantityOrdered(java.math.BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }


    /**
     * Gets the unitOfMeasureCodePricing value for this ShowCustomerItemPrice.
     * 
     * @return unitOfMeasureCodePricing
     */
    public java.lang.String getUnitOfMeasureCodePricing() {
        return unitOfMeasureCodePricing;
    }


    /**
     * Sets the unitOfMeasureCodePricing value for this ShowCustomerItemPrice.
     * 
     * @param unitOfMeasureCodePricing
     */
    public void setUnitOfMeasureCodePricing(java.lang.String unitOfMeasureCodePricing) {
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
    }


    /**
     * Gets the unitOfMeasureCodeTransaction value for this ShowCustomerItemPrice.
     * 
     * @return unitOfMeasureCodeTransaction
     */
    public java.lang.String getUnitOfMeasureCodeTransaction() {
        return unitOfMeasureCodeTransaction;
    }


    /**
     * Sets the unitOfMeasureCodeTransaction value for this ShowCustomerItemPrice.
     * 
     * @param unitOfMeasureCodeTransaction
     */
    public void setUnitOfMeasureCodeTransaction(java.lang.String unitOfMeasureCodeTransaction) {
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowCustomerItemPrice)) return false;
        ShowCustomerItemPrice other = (ShowCustomerItemPrice) obj;
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
        new org.apache.axis.description.TypeDesc(ShowCustomerItemPrice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showCustomerItemPrice"));
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
