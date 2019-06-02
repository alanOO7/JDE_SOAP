/**
 * ConfirmPurchaseOrderQuantity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ConfirmPurchaseOrderQuantity  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.math.BigDecimal quantityOrdered;

    private java.lang.String transactionUnitOfMeasure;

    public ConfirmPurchaseOrderQuantity() {
    }

    public ConfirmPurchaseOrderQuantity(
           java.math.BigDecimal quantityOrdered,
           java.lang.String transactionUnitOfMeasure) {
        this.quantityOrdered = quantityOrdered;
        this.transactionUnitOfMeasure = transactionUnitOfMeasure;
    }


    /**
     * Gets the quantityOrdered value for this ConfirmPurchaseOrderQuantity.
     * 
     * @return quantityOrdered
     */
    public java.math.BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }


    /**
     * Sets the quantityOrdered value for this ConfirmPurchaseOrderQuantity.
     * 
     * @param quantityOrdered
     */
    public void setQuantityOrdered(java.math.BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }


    /**
     * Gets the transactionUnitOfMeasure value for this ConfirmPurchaseOrderQuantity.
     * 
     * @return transactionUnitOfMeasure
     */
    public java.lang.String getTransactionUnitOfMeasure() {
        return transactionUnitOfMeasure;
    }


    /**
     * Sets the transactionUnitOfMeasure value for this ConfirmPurchaseOrderQuantity.
     * 
     * @param transactionUnitOfMeasure
     */
    public void setTransactionUnitOfMeasure(java.lang.String transactionUnitOfMeasure) {
        this.transactionUnitOfMeasure = transactionUnitOfMeasure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmPurchaseOrderQuantity)) return false;
        ConfirmPurchaseOrderQuantity other = (ConfirmPurchaseOrderQuantity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.quantityOrdered==null && other.getQuantityOrdered()==null) || 
             (this.quantityOrdered!=null &&
              this.quantityOrdered.equals(other.getQuantityOrdered()))) &&
            ((this.transactionUnitOfMeasure==null && other.getTransactionUnitOfMeasure()==null) || 
             (this.transactionUnitOfMeasure!=null &&
              this.transactionUnitOfMeasure.equals(other.getTransactionUnitOfMeasure())));
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
        if (getQuantityOrdered() != null) {
            _hashCode += getQuantityOrdered().hashCode();
        }
        if (getTransactionUnitOfMeasure() != null) {
            _hashCode += getTransactionUnitOfMeasure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmPurchaseOrderQuantity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderQuantity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionUnitOfMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionUnitOfMeasure"));
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
