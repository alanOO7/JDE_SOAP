/**
 * PurchaseOrderTaxHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderTaxHeader  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String taxExemptCertificate;

    private java.lang.String taxExplanationCode;

    private java.lang.String taxRateAreaCode;

    public PurchaseOrderTaxHeader() {
    }

    public PurchaseOrderTaxHeader(
           java.lang.String taxExemptCertificate,
           java.lang.String taxExplanationCode,
           java.lang.String taxRateAreaCode) {
        this.taxExemptCertificate = taxExemptCertificate;
        this.taxExplanationCode = taxExplanationCode;
        this.taxRateAreaCode = taxRateAreaCode;
    }


    /**
     * Gets the taxExemptCertificate value for this PurchaseOrderTaxHeader.
     * 
     * @return taxExemptCertificate
     */
    public java.lang.String getTaxExemptCertificate() {
        return taxExemptCertificate;
    }


    /**
     * Sets the taxExemptCertificate value for this PurchaseOrderTaxHeader.
     * 
     * @param taxExemptCertificate
     */
    public void setTaxExemptCertificate(java.lang.String taxExemptCertificate) {
        this.taxExemptCertificate = taxExemptCertificate;
    }


    /**
     * Gets the taxExplanationCode value for this PurchaseOrderTaxHeader.
     * 
     * @return taxExplanationCode
     */
    public java.lang.String getTaxExplanationCode() {
        return taxExplanationCode;
    }


    /**
     * Sets the taxExplanationCode value for this PurchaseOrderTaxHeader.
     * 
     * @param taxExplanationCode
     */
    public void setTaxExplanationCode(java.lang.String taxExplanationCode) {
        this.taxExplanationCode = taxExplanationCode;
    }


    /**
     * Gets the taxRateAreaCode value for this PurchaseOrderTaxHeader.
     * 
     * @return taxRateAreaCode
     */
    public java.lang.String getTaxRateAreaCode() {
        return taxRateAreaCode;
    }


    /**
     * Sets the taxRateAreaCode value for this PurchaseOrderTaxHeader.
     * 
     * @param taxRateAreaCode
     */
    public void setTaxRateAreaCode(java.lang.String taxRateAreaCode) {
        this.taxRateAreaCode = taxRateAreaCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderTaxHeader)) return false;
        PurchaseOrderTaxHeader other = (PurchaseOrderTaxHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.taxExemptCertificate==null && other.getTaxExemptCertificate()==null) || 
             (this.taxExemptCertificate!=null &&
              this.taxExemptCertificate.equals(other.getTaxExemptCertificate()))) &&
            ((this.taxExplanationCode==null && other.getTaxExplanationCode()==null) || 
             (this.taxExplanationCode!=null &&
              this.taxExplanationCode.equals(other.getTaxExplanationCode()))) &&
            ((this.taxRateAreaCode==null && other.getTaxRateAreaCode()==null) || 
             (this.taxRateAreaCode!=null &&
              this.taxRateAreaCode.equals(other.getTaxRateAreaCode())));
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
        if (getTaxExemptCertificate() != null) {
            _hashCode += getTaxExemptCertificate().hashCode();
        }
        if (getTaxExplanationCode() != null) {
            _hashCode += getTaxExplanationCode().hashCode();
        }
        if (getTaxRateAreaCode() != null) {
            _hashCode += getTaxRateAreaCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderTaxHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderTaxHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExemptCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxExemptCertificate"));
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
