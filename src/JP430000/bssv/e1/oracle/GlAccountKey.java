/**
 * GlAccountKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class GlAccountKey  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String accountAlternate;

    private java.lang.String accountId;

    private java.lang.String accountLongId;

    public GlAccountKey() {
    }

    public GlAccountKey(
           java.lang.String accountAlternate,
           java.lang.String accountId,
           java.lang.String accountLongId) {
        this.accountAlternate = accountAlternate;
        this.accountId = accountId;
        this.accountLongId = accountLongId;
    }


    /**
     * Gets the accountAlternate value for this GlAccountKey.
     * 
     * @return accountAlternate
     */
    public java.lang.String getAccountAlternate() {
        return accountAlternate;
    }


    /**
     * Sets the accountAlternate value for this GlAccountKey.
     * 
     * @param accountAlternate
     */
    public void setAccountAlternate(java.lang.String accountAlternate) {
        this.accountAlternate = accountAlternate;
    }


    /**
     * Gets the accountId value for this GlAccountKey.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this GlAccountKey.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountLongId value for this GlAccountKey.
     * 
     * @return accountLongId
     */
    public java.lang.String getAccountLongId() {
        return accountLongId;
    }


    /**
     * Sets the accountLongId value for this GlAccountKey.
     * 
     * @param accountLongId
     */
    public void setAccountLongId(java.lang.String accountLongId) {
        this.accountLongId = accountLongId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlAccountKey)) return false;
        GlAccountKey other = (GlAccountKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountAlternate==null && other.getAccountAlternate()==null) || 
             (this.accountAlternate!=null &&
              this.accountAlternate.equals(other.getAccountAlternate()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountLongId==null && other.getAccountLongId()==null) || 
             (this.accountLongId!=null &&
              this.accountLongId.equals(other.getAccountLongId())));
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
        if (getAccountAlternate() != null) {
            _hashCode += getAccountAlternate().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountLongId() != null) {
            _hashCode += getAccountLongId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlAccountKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "glAccountKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountAlternate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountAlternate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountLongId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountLongId"));
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
