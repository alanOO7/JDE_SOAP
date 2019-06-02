/**
 * ShowItemPriceAndAvailabilityV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ShowItemPriceAndAvailabilityV3  extends JP420000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private java.lang.String currencyCode;

    private JP420000.bssv.e1.oracle.ProductOutV3 product;

    private java.lang.Boolean useTaxedPrices;

    public ShowItemPriceAndAvailabilityV3() {
    }

    public ShowItemPriceAndAvailabilityV3(
           JP420000.bssv.e1.oracle.E1Message[] e1MessageList,
           java.lang.String currencyCode,
           JP420000.bssv.e1.oracle.ProductOutV3 product,
           java.lang.Boolean useTaxedPrices) {
        super(
            e1MessageList);
        this.currencyCode = currencyCode;
        this.product = product;
        this.useTaxedPrices = useTaxedPrices;
    }


    /**
     * Gets the currencyCode value for this ShowItemPriceAndAvailabilityV3.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this ShowItemPriceAndAvailabilityV3.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the product value for this ShowItemPriceAndAvailabilityV3.
     * 
     * @return product
     */
    public JP420000.bssv.e1.oracle.ProductOutV3 getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ShowItemPriceAndAvailabilityV3.
     * 
     * @param product
     */
    public void setProduct(JP420000.bssv.e1.oracle.ProductOutV3 product) {
        this.product = product;
    }


    /**
     * Gets the useTaxedPrices value for this ShowItemPriceAndAvailabilityV3.
     * 
     * @return useTaxedPrices
     */
    public java.lang.Boolean getUseTaxedPrices() {
        return useTaxedPrices;
    }


    /**
     * Sets the useTaxedPrices value for this ShowItemPriceAndAvailabilityV3.
     * 
     * @param useTaxedPrices
     */
    public void setUseTaxedPrices(java.lang.Boolean useTaxedPrices) {
        this.useTaxedPrices = useTaxedPrices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowItemPriceAndAvailabilityV3)) return false;
        ShowItemPriceAndAvailabilityV3 other = (ShowItemPriceAndAvailabilityV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
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
        new org.apache.axis.description.TypeDesc(ShowItemPriceAndAvailabilityV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showItemPriceAndAvailabilityV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "productOutV3"));
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
