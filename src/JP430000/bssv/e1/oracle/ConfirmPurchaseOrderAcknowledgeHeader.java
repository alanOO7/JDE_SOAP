/**
 * ConfirmPurchaseOrderAcknowledgeHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ConfirmPurchaseOrderAcknowledgeHeader  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledgeDetail[] detail;

    private JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey;

    public ConfirmPurchaseOrderAcknowledgeHeader() {
    }

    public ConfirmPurchaseOrderAcknowledgeHeader(
           JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledgeDetail[] detail,
           JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey) {
        this.detail = detail;
        this.purchaseOrderKey = purchaseOrderKey;
    }


    /**
     * Gets the detail value for this ConfirmPurchaseOrderAcknowledgeHeader.
     * 
     * @return detail
     */
    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledgeDetail[] getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this ConfirmPurchaseOrderAcknowledgeHeader.
     * 
     * @param detail
     */
    public void setDetail(JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledgeDetail[] detail) {
        this.detail = detail;
    }

    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledgeDetail getDetail(int i) {
        return this.detail[i];
    }

    public void setDetail(int i, JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledgeDetail _value) {
        this.detail[i] = _value;
    }


    /**
     * Gets the purchaseOrderKey value for this ConfirmPurchaseOrderAcknowledgeHeader.
     * 
     * @return purchaseOrderKey
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderKey getPurchaseOrderKey() {
        return purchaseOrderKey;
    }


    /**
     * Sets the purchaseOrderKey value for this ConfirmPurchaseOrderAcknowledgeHeader.
     * 
     * @param purchaseOrderKey
     */
    public void setPurchaseOrderKey(JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey) {
        this.purchaseOrderKey = purchaseOrderKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmPurchaseOrderAcknowledgeHeader)) return false;
        ConfirmPurchaseOrderAcknowledgeHeader other = (ConfirmPurchaseOrderAcknowledgeHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              java.util.Arrays.equals(this.detail, other.getDetail()))) &&
            ((this.purchaseOrderKey==null && other.getPurchaseOrderKey()==null) || 
             (this.purchaseOrderKey!=null &&
              this.purchaseOrderKey.equals(other.getPurchaseOrderKey())));
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
        if (getDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderKey() != null) {
            _hashCode += getPurchaseOrderKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmPurchaseOrderAcknowledgeHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderAcknowledgeHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderAcknowledgeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderKey"));
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
