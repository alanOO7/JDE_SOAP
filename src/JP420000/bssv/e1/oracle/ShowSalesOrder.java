/**
 * ShowSalesOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ShowSalesOrder  extends JP420000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private JP420000.bssv.e1.oracle.ShowSalesHeader[] header;

    public ShowSalesOrder() {
    }

    public ShowSalesOrder(
           JP420000.bssv.e1.oracle.E1Message[] e1MessageList,
           JP420000.bssv.e1.oracle.ShowSalesHeader[] header) {
        super(
            e1MessageList);
        this.header = header;
    }


    /**
     * Gets the header value for this ShowSalesOrder.
     * 
     * @return header
     */
    public JP420000.bssv.e1.oracle.ShowSalesHeader[] getHeader() {
        return header;
    }


    /**
     * Sets the header value for this ShowSalesOrder.
     * 
     * @param header
     */
    public void setHeader(JP420000.bssv.e1.oracle.ShowSalesHeader[] header) {
        this.header = header;
    }

    public JP420000.bssv.e1.oracle.ShowSalesHeader getHeader(int i) {
        return this.header[i];
    }

    public void setHeader(int i, JP420000.bssv.e1.oracle.ShowSalesHeader _value) {
        this.header[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowSalesOrder)) return false;
        ShowSalesOrder other = (ShowSalesOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              java.util.Arrays.equals(this.header, other.getHeader())));
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
        if (getHeader() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHeader());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHeader(), i);
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
        new org.apache.axis.description.TypeDesc(ShowSalesOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesHeader"));
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
