/**
 * ShowPurchaseOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ShowPurchaseOrder  extends JP430000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private JP430000.bssv.e1.oracle.PurchaseOrder[] showPurchaseOrder;

    public ShowPurchaseOrder() {
    }

    public ShowPurchaseOrder(
           JP430000.bssv.e1.oracle.E1Message[] e1MessageList,
           JP430000.bssv.e1.oracle.PurchaseOrder[] showPurchaseOrder) {
        super(
            e1MessageList);
        this.showPurchaseOrder = showPurchaseOrder;
    }


    /**
     * Gets the showPurchaseOrder value for this ShowPurchaseOrder.
     * 
     * @return showPurchaseOrder
     */
    public JP430000.bssv.e1.oracle.PurchaseOrder[] getShowPurchaseOrder() {
        return showPurchaseOrder;
    }


    /**
     * Sets the showPurchaseOrder value for this ShowPurchaseOrder.
     * 
     * @param showPurchaseOrder
     */
    public void setShowPurchaseOrder(JP430000.bssv.e1.oracle.PurchaseOrder[] showPurchaseOrder) {
        this.showPurchaseOrder = showPurchaseOrder;
    }

    public JP430000.bssv.e1.oracle.PurchaseOrder getShowPurchaseOrder(int i) {
        return this.showPurchaseOrder[i];
    }

    public void setShowPurchaseOrder(int i, JP430000.bssv.e1.oracle.PurchaseOrder _value) {
        this.showPurchaseOrder[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowPurchaseOrder)) return false;
        ShowPurchaseOrder other = (ShowPurchaseOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.showPurchaseOrder==null && other.getShowPurchaseOrder()==null) || 
             (this.showPurchaseOrder!=null &&
              java.util.Arrays.equals(this.showPurchaseOrder, other.getShowPurchaseOrder())));
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
        if (getShowPurchaseOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShowPurchaseOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShowPurchaseOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShowPurchaseOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showPurchaseOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showPurchaseOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
