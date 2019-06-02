/**
 * ShowSalesOrderPriceHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ShowSalesOrderPriceHistory  extends JP420000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private JP420000.bssv.e1.oracle.ShowPriceHistoryDetail[] detail;

    public ShowSalesOrderPriceHistory() {
    }

    public ShowSalesOrderPriceHistory(
           JP420000.bssv.e1.oracle.E1Message[] e1MessageList,
           JP420000.bssv.e1.oracle.ShowPriceHistoryDetail[] detail) {
        super(
            e1MessageList);
        this.detail = detail;
    }


    /**
     * Gets the detail value for this ShowSalesOrderPriceHistory.
     * 
     * @return detail
     */
    public JP420000.bssv.e1.oracle.ShowPriceHistoryDetail[] getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this ShowSalesOrderPriceHistory.
     * 
     * @param detail
     */
    public void setDetail(JP420000.bssv.e1.oracle.ShowPriceHistoryDetail[] detail) {
        this.detail = detail;
    }

    public JP420000.bssv.e1.oracle.ShowPriceHistoryDetail getDetail(int i) {
        return this.detail[i];
    }

    public void setDetail(int i, JP420000.bssv.e1.oracle.ShowPriceHistoryDetail _value) {
        this.detail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowSalesOrderPriceHistory)) return false;
        ShowSalesOrderPriceHistory other = (ShowSalesOrderPriceHistory) obj;
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
              java.util.Arrays.equals(this.detail, other.getDetail())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShowSalesOrderPriceHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrderPriceHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showPriceHistoryDetail"));
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
