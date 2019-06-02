/**
 * RelatedOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class RelatedOrder  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.math.BigDecimal documentLineNumber;

    private JP420000.bssv.e1.oracle.RelatedOrderKey relatedOrderKey;

    public RelatedOrder() {
    }

    public RelatedOrder(
           java.math.BigDecimal documentLineNumber,
           JP420000.bssv.e1.oracle.RelatedOrderKey relatedOrderKey) {
        this.documentLineNumber = documentLineNumber;
        this.relatedOrderKey = relatedOrderKey;
    }


    /**
     * Gets the documentLineNumber value for this RelatedOrder.
     * 
     * @return documentLineNumber
     */
    public java.math.BigDecimal getDocumentLineNumber() {
        return documentLineNumber;
    }


    /**
     * Sets the documentLineNumber value for this RelatedOrder.
     * 
     * @param documentLineNumber
     */
    public void setDocumentLineNumber(java.math.BigDecimal documentLineNumber) {
        this.documentLineNumber = documentLineNumber;
    }


    /**
     * Gets the relatedOrderKey value for this RelatedOrder.
     * 
     * @return relatedOrderKey
     */
    public JP420000.bssv.e1.oracle.RelatedOrderKey getRelatedOrderKey() {
        return relatedOrderKey;
    }


    /**
     * Sets the relatedOrderKey value for this RelatedOrder.
     * 
     * @param relatedOrderKey
     */
    public void setRelatedOrderKey(JP420000.bssv.e1.oracle.RelatedOrderKey relatedOrderKey) {
        this.relatedOrderKey = relatedOrderKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedOrder)) return false;
        RelatedOrder other = (RelatedOrder) obj;
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
            ((this.relatedOrderKey==null && other.getRelatedOrderKey()==null) || 
             (this.relatedOrderKey!=null &&
              this.relatedOrderKey.equals(other.getRelatedOrderKey())));
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
        if (getRelatedOrderKey() != null) {
            _hashCode += getRelatedOrderKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelatedOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "relatedOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "relatedOrderKey"));
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
