/**
 * ShowItemListPrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ShowItemListPrice  extends JP420000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private JP420000.bssv.e1.oracle.ItemListPriceRecord[] showItemListPrice;

    public ShowItemListPrice() {
    }

    public ShowItemListPrice(
           JP420000.bssv.e1.oracle.E1Message[] e1MessageList,
           JP420000.bssv.e1.oracle.ItemListPriceRecord[] showItemListPrice) {
        super(
            e1MessageList);
        this.showItemListPrice = showItemListPrice;
    }


    /**
     * Gets the showItemListPrice value for this ShowItemListPrice.
     * 
     * @return showItemListPrice
     */
    public JP420000.bssv.e1.oracle.ItemListPriceRecord[] getShowItemListPrice() {
        return showItemListPrice;
    }


    /**
     * Sets the showItemListPrice value for this ShowItemListPrice.
     * 
     * @param showItemListPrice
     */
    public void setShowItemListPrice(JP420000.bssv.e1.oracle.ItemListPriceRecord[] showItemListPrice) {
        this.showItemListPrice = showItemListPrice;
    }

    public JP420000.bssv.e1.oracle.ItemListPriceRecord getShowItemListPrice(int i) {
        return this.showItemListPrice[i];
    }

    public void setShowItemListPrice(int i, JP420000.bssv.e1.oracle.ItemListPriceRecord _value) {
        this.showItemListPrice[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowItemListPrice)) return false;
        ShowItemListPrice other = (ShowItemListPrice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.showItemListPrice==null && other.getShowItemListPrice()==null) || 
             (this.showItemListPrice!=null &&
              java.util.Arrays.equals(this.showItemListPrice, other.getShowItemListPrice())));
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
        if (getShowItemListPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShowItemListPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShowItemListPrice(), i);
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
        new org.apache.axis.description.TypeDesc(ShowItemListPrice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showItemListPrice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showItemListPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showItemListPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "itemListPriceRecord"));
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
