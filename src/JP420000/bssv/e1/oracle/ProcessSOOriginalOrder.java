/**
 * ProcessSOOriginalOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ProcessSOOriginalOrder  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.math.BigDecimal documentLineNumber;

    private JP420000.bssv.e1.oracle.OriginalOrderKey originalOrderKey;

    public ProcessSOOriginalOrder() {
    }

    public ProcessSOOriginalOrder(
           java.math.BigDecimal documentLineNumber,
           JP420000.bssv.e1.oracle.OriginalOrderKey originalOrderKey) {
        this.documentLineNumber = documentLineNumber;
        this.originalOrderKey = originalOrderKey;
    }


    /**
     * Gets the documentLineNumber value for this ProcessSOOriginalOrder.
     * 
     * @return documentLineNumber
     */
    public java.math.BigDecimal getDocumentLineNumber() {
        return documentLineNumber;
    }


    /**
     * Sets the documentLineNumber value for this ProcessSOOriginalOrder.
     * 
     * @param documentLineNumber
     */
    public void setDocumentLineNumber(java.math.BigDecimal documentLineNumber) {
        this.documentLineNumber = documentLineNumber;
    }


    /**
     * Gets the originalOrderKey value for this ProcessSOOriginalOrder.
     * 
     * @return originalOrderKey
     */
    public JP420000.bssv.e1.oracle.OriginalOrderKey getOriginalOrderKey() {
        return originalOrderKey;
    }


    /**
     * Sets the originalOrderKey value for this ProcessSOOriginalOrder.
     * 
     * @param originalOrderKey
     */
    public void setOriginalOrderKey(JP420000.bssv.e1.oracle.OriginalOrderKey originalOrderKey) {
        this.originalOrderKey = originalOrderKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessSOOriginalOrder)) return false;
        ProcessSOOriginalOrder other = (ProcessSOOriginalOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.documentLineNumber==null && other.getDocumentLineNumber()==null) || 
             (this.documentLineNumber!=null &&
              this.documentLineNumber.equals(other.getDocumentLineNumber()))) &&
            ((this.originalOrderKey==null && other.getOriginalOrderKey()==null) || 
             (this.originalOrderKey!=null &&
              this.originalOrderKey.equals(other.getOriginalOrderKey())));
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
        if (getDocumentLineNumber() != null) {
            _hashCode += getDocumentLineNumber().hashCode();
        }
        if (getOriginalOrderKey() != null) {
            _hashCode += getOriginalOrderKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessSOOriginalOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOOriginalOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "originalOrderKey"));
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
