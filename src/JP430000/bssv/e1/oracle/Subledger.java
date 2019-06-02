/**
 * Subledger.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class Subledger  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String subledger;

    private java.lang.String subledgerTypeCode;

    public Subledger() {
    }

    public Subledger(
           java.lang.String subledger,
           java.lang.String subledgerTypeCode) {
        this.subledger = subledger;
        this.subledgerTypeCode = subledgerTypeCode;
    }


    /**
     * Gets the subledger value for this Subledger.
     * 
     * @return subledger
     */
    public java.lang.String getSubledger() {
        return subledger;
    }


    /**
     * Sets the subledger value for this Subledger.
     * 
     * @param subledger
     */
    public void setSubledger(java.lang.String subledger) {
        this.subledger = subledger;
    }


    /**
     * Gets the subledgerTypeCode value for this Subledger.
     * 
     * @return subledgerTypeCode
     */
    public java.lang.String getSubledgerTypeCode() {
        return subledgerTypeCode;
    }


    /**
     * Sets the subledgerTypeCode value for this Subledger.
     * 
     * @param subledgerTypeCode
     */
    public void setSubledgerTypeCode(java.lang.String subledgerTypeCode) {
        this.subledgerTypeCode = subledgerTypeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subledger)) return false;
        Subledger other = (Subledger) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subledger==null && other.getSubledger()==null) || 
             (this.subledger!=null &&
              this.subledger.equals(other.getSubledger()))) &&
            ((this.subledgerTypeCode==null && other.getSubledgerTypeCode()==null) || 
             (this.subledgerTypeCode!=null &&
              this.subledgerTypeCode.equals(other.getSubledgerTypeCode())));
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
        if (getSubledger() != null) {
            _hashCode += getSubledger().hashCode();
        }
        if (getSubledgerTypeCode() != null) {
            _hashCode += getSubledgerTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subledger.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "subledger"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subledger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subledger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subledgerTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subledgerTypeCode"));
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
