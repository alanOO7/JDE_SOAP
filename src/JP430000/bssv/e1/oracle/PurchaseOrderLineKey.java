/**
 * PurchaseOrderLineKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderLineKey  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.math.BigDecimal documentLineNumber;

    private java.lang.String documentSuffix;

    public PurchaseOrderLineKey() {
    }

    public PurchaseOrderLineKey(
           java.math.BigDecimal documentLineNumber,
           java.lang.String documentSuffix) {
        this.documentLineNumber = documentLineNumber;
        this.documentSuffix = documentSuffix;
    }


    /**
     * Gets the documentLineNumber value for this PurchaseOrderLineKey.
     * 
     * @return documentLineNumber
     */
    public java.math.BigDecimal getDocumentLineNumber() {
        return documentLineNumber;
    }


    /**
     * Sets the documentLineNumber value for this PurchaseOrderLineKey.
     * 
     * @param documentLineNumber
     */
    public void setDocumentLineNumber(java.math.BigDecimal documentLineNumber) {
        this.documentLineNumber = documentLineNumber;
    }


    /**
     * Gets the documentSuffix value for this PurchaseOrderLineKey.
     * 
     * @return documentSuffix
     */
    public java.lang.String getDocumentSuffix() {
        return documentSuffix;
    }


    /**
     * Sets the documentSuffix value for this PurchaseOrderLineKey.
     * 
     * @param documentSuffix
     */
    public void setDocumentSuffix(java.lang.String documentSuffix) {
        this.documentSuffix = documentSuffix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderLineKey)) return false;
        PurchaseOrderLineKey other = (PurchaseOrderLineKey) obj;
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
            ((this.documentSuffix==null && other.getDocumentSuffix()==null) || 
             (this.documentSuffix!=null &&
              this.documentSuffix.equals(other.getDocumentSuffix())));
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
        if (getDocumentSuffix() != null) {
            _hashCode += getDocumentSuffix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderLineKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderLineKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
