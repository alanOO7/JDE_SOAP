/**
 * GetItemPriceAndAvailabilityV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class GetItemPriceAndAvailabilityV3  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String adjustmentScheduleCode;

    private java.lang.String businessUnit;

    private java.lang.String currencyCode;

    private JP420000.bssv.e1.oracle.Entity customer;

    private java.lang.String customerGLN;

    private JP420000.bssv.e1.oracle.ProcessingVersion processing;

    private JP420000.bssv.e1.oracle.ProductIn product;

    private java.lang.Boolean useTaxedPrices;

    public GetItemPriceAndAvailabilityV3() {
    }

    public GetItemPriceAndAvailabilityV3(
           java.lang.String adjustmentScheduleCode,
           java.lang.String businessUnit,
           java.lang.String currencyCode,
           JP420000.bssv.e1.oracle.Entity customer,
           java.lang.String customerGLN,
           JP420000.bssv.e1.oracle.ProcessingVersion processing,
           JP420000.bssv.e1.oracle.ProductIn product,
           java.lang.Boolean useTaxedPrices) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
        this.businessUnit = businessUnit;
        this.currencyCode = currencyCode;
        this.customer = customer;
        this.customerGLN = customerGLN;
        this.processing = processing;
        this.product = product;
        this.useTaxedPrices = useTaxedPrices;
    }


    /**
     * Gets the adjustmentScheduleCode value for this GetItemPriceAndAvailabilityV3.
     * 
     * @return adjustmentScheduleCode
     */
    public java.lang.String getAdjustmentScheduleCode() {
        return adjustmentScheduleCode;
    }


    /**
     * Sets the adjustmentScheduleCode value for this GetItemPriceAndAvailabilityV3.
     * 
     * @param adjustmentScheduleCode
     */
    public void setAdjustmentScheduleCode(java.lang.String adjustmentScheduleCode) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
    }


    /**
     * Gets the businessUnit value for this GetItemPriceAndAvailabilityV3.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this GetItemPriceAndAvailabilityV3.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the currencyCode value for this GetItemPriceAndAvailabilityV3.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this GetItemPriceAndAvailabilityV3.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the customer value for this GetItemPriceAndAvailabilityV3.
     * 
     * @return customer
     */
    public JP420000.bssv.e1.oracle.Entity getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this GetItemPriceAndAvailabilityV3.
     * 
     * @param customer
     */
    public void setCustomer(JP420000.bssv.e1.oracle.Entity customer) {
        this.customer = customer;
    }


    /**
     * Gets the customerGLN value for this GetItemPriceAndAvailabilityV3.
     * 
     * @return customerGLN
     */
    public java.lang.String getCustomerGLN() {
        return customerGLN;
    }


    /**
     * Sets the customerGLN value for this GetItemPriceAndAvailabilityV3.
     * 
     * @param customerGLN
     */
    public void setCustomerGLN(java.lang.String customerGLN) {
        this.customerGLN = customerGLN;
    }


    /**
     * Gets the processing value for this GetItemPriceAndAvailabilityV3.
     * 
     * @return processing
     */
    public JP420000.bssv.e1.oracle.ProcessingVersion getProcessing() {
        return processing;
    }


    /**
     * Sets the processing value for this GetItemPriceAndAvailabilityV3.
     * 
     * @param processing
     */
    public void setProcessing(JP420000.bssv.e1.oracle.ProcessingVersion processing) {
        this.processing = processing;
    }


    /**
     * Gets the product value for this GetItemPriceAndAvailabilityV3.
     * 
     * @return product
     */
    public JP420000.bssv.e1.oracle.ProductIn getProduct() {
        return product;
    }


    /**
     * Sets the product value for this GetItemPriceAndAvailabilityV3.
     * 
     * @param product
     */
    public void setProduct(JP420000.bssv.e1.oracle.ProductIn product) {
        this.product = product;
    }


    /**
     * Gets the useTaxedPrices value for this GetItemPriceAndAvailabilityV3.
     * 
     * @return useTaxedPrices
     */
    public java.lang.Boolean getUseTaxedPrices() {
        return useTaxedPrices;
    }


    /**
     * Sets the useTaxedPrices value for this GetItemPriceAndAvailabilityV3.
     * 
     * @param useTaxedPrices
     */
    public void setUseTaxedPrices(java.lang.Boolean useTaxedPrices) {
        this.useTaxedPrices = useTaxedPrices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetItemPriceAndAvailabilityV3)) return false;
        GetItemPriceAndAvailabilityV3 other = (GetItemPriceAndAvailabilityV3) obj;
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
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.customerGLN==null && other.getCustomerGLN()==null) || 
             (this.customerGLN!=null &&
              this.customerGLN.equals(other.getCustomerGLN()))) &&
            ((this.processing==null && other.getProcessing()==null) || 
             (this.processing!=null &&
              this.processing.equals(other.getProcessing()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
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
        if (getAdjustmentScheduleCode() != null) {
            _hashCode += getAdjustmentScheduleCode().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getCustomerGLN() != null) {
            _hashCode += getCustomerGLN().hashCode();
        }
        if (getProcessing() != null) {
            _hashCode += getProcessing().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getUseTaxedPrices() != null) {
            _hashCode += getUseTaxedPrices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetItemPriceAndAvailabilityV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentScheduleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentScheduleCode"));
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
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerGLN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processingVersion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "productIn"));
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
