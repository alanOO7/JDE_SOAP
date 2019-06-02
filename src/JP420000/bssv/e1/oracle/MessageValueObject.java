/**
 * MessageValueObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class MessageValueObject  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP420000.bssv.e1.oracle.E1Message[] e1MessageList;

    public MessageValueObject() {
    }

    public MessageValueObject(
           JP420000.bssv.e1.oracle.E1Message[] e1MessageList) {
        this.e1MessageList = e1MessageList;
    }


    /**
     * Gets the e1MessageList value for this MessageValueObject.
     * 
     * @return e1MessageList
     */
    public JP420000.bssv.e1.oracle.E1Message[] getE1MessageList() {
        return e1MessageList;
    }


    /**
     * Sets the e1MessageList value for this MessageValueObject.
     * 
     * @param e1MessageList
     */
    public void setE1MessageList(JP420000.bssv.e1.oracle.E1Message[] e1MessageList) {
        this.e1MessageList = e1MessageList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageValueObject)) return false;
        MessageValueObject other = (MessageValueObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.e1MessageList==null && other.getE1MessageList()==null) || 
             (this.e1MessageList!=null &&
              java.util.Arrays.equals(this.e1MessageList, other.getE1MessageList())));
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
        if (getE1MessageList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getE1MessageList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getE1MessageList(), i);
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
        new org.apache.axis.description.TypeDesc(MessageValueObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "messageValueObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e1MessageList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "e1MessageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "e1Message"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "e1Messages"));
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
