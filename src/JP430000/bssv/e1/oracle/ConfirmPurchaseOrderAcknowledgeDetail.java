/**
 * ConfirmPurchaseOrderAcknowledgeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ConfirmPurchaseOrderAcknowledgeDetail  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey;

    public ConfirmPurchaseOrderAcknowledgeDetail() {
    }

    public ConfirmPurchaseOrderAcknowledgeDetail(
           JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey) {
        this.purchaseOrderLineKey = purchaseOrderLineKey;
    }


    /**
     * Gets the purchaseOrderLineKey value for this ConfirmPurchaseOrderAcknowledgeDetail.
     * 
     * @return purchaseOrderLineKey
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderLineKey getPurchaseOrderLineKey() {
        return purchaseOrderLineKey;
    }


    /**
     * Sets the purchaseOrderLineKey value for this ConfirmPurchaseOrderAcknowledgeDetail.
     * 
     * @param purchaseOrderLineKey
     */
    public void setPurchaseOrderLineKey(JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey) {
        this.purchaseOrderLineKey = purchaseOrderLineKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmPurchaseOrderAcknowledgeDetail)) return false;
        ConfirmPurchaseOrderAcknowledgeDetail other = (ConfirmPurchaseOrderAcknowledgeDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.purchaseOrderLineKey==null && other.getPurchaseOrderLineKey()==null) || 
             (this.purchaseOrderLineKey!=null &&
              this.purchaseOrderLineKey.equals(other.getPurchaseOrderLineKey())));
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
        if (getPurchaseOrderLineKey() != null) {
            _hashCode += getPurchaseOrderLineKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmPurchaseOrderAcknowledgeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderAcknowledgeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderLineKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrderLineKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderLineKey"));
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
