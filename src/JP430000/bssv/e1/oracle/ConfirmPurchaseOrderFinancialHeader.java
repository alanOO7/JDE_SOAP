/**
 * ConfirmPurchaseOrderFinancialHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ConfirmPurchaseOrderFinancialHeader  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.math.BigDecimal domesticOrderTotal;

    private java.math.BigDecimal foreignOrderTotal;

    public ConfirmPurchaseOrderFinancialHeader() {
    }

    public ConfirmPurchaseOrderFinancialHeader(
           java.math.BigDecimal domesticOrderTotal,
           java.math.BigDecimal foreignOrderTotal) {
        this.domesticOrderTotal = domesticOrderTotal;
        this.foreignOrderTotal = foreignOrderTotal;
    }


    /**
     * Gets the domesticOrderTotal value for this ConfirmPurchaseOrderFinancialHeader.
     * 
     * @return domesticOrderTotal
     */
    public java.math.BigDecimal getDomesticOrderTotal() {
        return domesticOrderTotal;
    }


    /**
     * Sets the domesticOrderTotal value for this ConfirmPurchaseOrderFinancialHeader.
     * 
     * @param domesticOrderTotal
     */
    public void setDomesticOrderTotal(java.math.BigDecimal domesticOrderTotal) {
        this.domesticOrderTotal = domesticOrderTotal;
    }


    /**
     * Gets the foreignOrderTotal value for this ConfirmPurchaseOrderFinancialHeader.
     * 
     * @return foreignOrderTotal
     */
    public java.math.BigDecimal getForeignOrderTotal() {
        return foreignOrderTotal;
    }


    /**
     * Sets the foreignOrderTotal value for this ConfirmPurchaseOrderFinancialHeader.
     * 
     * @param foreignOrderTotal
     */
    public void setForeignOrderTotal(java.math.BigDecimal foreignOrderTotal) {
        this.foreignOrderTotal = foreignOrderTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmPurchaseOrderFinancialHeader)) return false;
        ConfirmPurchaseOrderFinancialHeader other = (ConfirmPurchaseOrderFinancialHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.domesticOrderTotal==null && other.getDomesticOrderTotal()==null) || 
             (this.domesticOrderTotal!=null &&
              this.domesticOrderTotal.equals(other.getDomesticOrderTotal()))) &&
            ((this.foreignOrderTotal==null && other.getForeignOrderTotal()==null) || 
             (this.foreignOrderTotal!=null &&
              this.foreignOrderTotal.equals(other.getForeignOrderTotal())));
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
        if (getDomesticOrderTotal() != null) {
            _hashCode += getDomesticOrderTotal().hashCode();
        }
        if (getForeignOrderTotal() != null) {
            _hashCode += getForeignOrderTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmPurchaseOrderFinancialHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderFinancialHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domesticOrderTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domesticOrderTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignOrderTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignOrderTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
