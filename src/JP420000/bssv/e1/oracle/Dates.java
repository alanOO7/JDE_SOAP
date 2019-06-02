/**
 * Dates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class Dates  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.util.Calendar dateEffective;

    private java.util.Calendar dateExpiration;

    public Dates() {
    }

    public Dates(
           java.util.Calendar dateEffective,
           java.util.Calendar dateExpiration) {
        this.dateEffective = dateEffective;
        this.dateExpiration = dateExpiration;
    }


    /**
     * Gets the dateEffective value for this Dates.
     * 
     * @return dateEffective
     */
    public java.util.Calendar getDateEffective() {
        return dateEffective;
    }


    /**
     * Sets the dateEffective value for this Dates.
     * 
     * @param dateEffective
     */
    public void setDateEffective(java.util.Calendar dateEffective) {
        this.dateEffective = dateEffective;
    }


    /**
     * Gets the dateExpiration value for this Dates.
     * 
     * @return dateExpiration
     */
    public java.util.Calendar getDateExpiration() {
        return dateExpiration;
    }


    /**
     * Sets the dateExpiration value for this Dates.
     * 
     * @param dateExpiration
     */
    public void setDateExpiration(java.util.Calendar dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dates)) return false;
        Dates other = (Dates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dateEffective==null && other.getDateEffective()==null) || 
             (this.dateEffective!=null &&
              this.dateEffective.equals(other.getDateEffective()))) &&
            ((this.dateExpiration==null && other.getDateExpiration()==null) || 
             (this.dateExpiration!=null &&
              this.dateExpiration.equals(other.getDateExpiration())));
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
        if (getDateEffective() != null) {
            _hashCode += getDateEffective().hashCode();
        }
        if (getDateExpiration() != null) {
            _hashCode += getDateExpiration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "dates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateEffective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateEffective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
