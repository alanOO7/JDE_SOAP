/**
 * UserReservedData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class UserReservedData  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.math.BigDecimal userReservedAmount;

    private java.lang.String userReservedCode;

    private java.util.Calendar userReservedDate;

    private java.lang.Integer userReservedNumber;

    private java.lang.String userReservedReference;

    public UserReservedData() {
    }

    public UserReservedData(
           java.math.BigDecimal userReservedAmount,
           java.lang.String userReservedCode,
           java.util.Calendar userReservedDate,
           java.lang.Integer userReservedNumber,
           java.lang.String userReservedReference) {
        this.userReservedAmount = userReservedAmount;
        this.userReservedCode = userReservedCode;
        this.userReservedDate = userReservedDate;
        this.userReservedNumber = userReservedNumber;
        this.userReservedReference = userReservedReference;
    }


    /**
     * Gets the userReservedAmount value for this UserReservedData.
     * 
     * @return userReservedAmount
     */
    public java.math.BigDecimal getUserReservedAmount() {
        return userReservedAmount;
    }


    /**
     * Sets the userReservedAmount value for this UserReservedData.
     * 
     * @param userReservedAmount
     */
    public void setUserReservedAmount(java.math.BigDecimal userReservedAmount) {
        this.userReservedAmount = userReservedAmount;
    }


    /**
     * Gets the userReservedCode value for this UserReservedData.
     * 
     * @return userReservedCode
     */
    public java.lang.String getUserReservedCode() {
        return userReservedCode;
    }


    /**
     * Sets the userReservedCode value for this UserReservedData.
     * 
     * @param userReservedCode
     */
    public void setUserReservedCode(java.lang.String userReservedCode) {
        this.userReservedCode = userReservedCode;
    }


    /**
     * Gets the userReservedDate value for this UserReservedData.
     * 
     * @return userReservedDate
     */
    public java.util.Calendar getUserReservedDate() {
        return userReservedDate;
    }


    /**
     * Sets the userReservedDate value for this UserReservedData.
     * 
     * @param userReservedDate
     */
    public void setUserReservedDate(java.util.Calendar userReservedDate) {
        this.userReservedDate = userReservedDate;
    }


    /**
     * Gets the userReservedNumber value for this UserReservedData.
     * 
     * @return userReservedNumber
     */
    public java.lang.Integer getUserReservedNumber() {
        return userReservedNumber;
    }


    /**
     * Sets the userReservedNumber value for this UserReservedData.
     * 
     * @param userReservedNumber
     */
    public void setUserReservedNumber(java.lang.Integer userReservedNumber) {
        this.userReservedNumber = userReservedNumber;
    }


    /**
     * Gets the userReservedReference value for this UserReservedData.
     * 
     * @return userReservedReference
     */
    public java.lang.String getUserReservedReference() {
        return userReservedReference;
    }


    /**
     * Sets the userReservedReference value for this UserReservedData.
     * 
     * @param userReservedReference
     */
    public void setUserReservedReference(java.lang.String userReservedReference) {
        this.userReservedReference = userReservedReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserReservedData)) return false;
        UserReservedData other = (UserReservedData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userReservedAmount==null && other.getUserReservedAmount()==null) || 
             (this.userReservedAmount!=null &&
              this.userReservedAmount.equals(other.getUserReservedAmount()))) &&
            ((this.userReservedCode==null && other.getUserReservedCode()==null) || 
             (this.userReservedCode!=null &&
              this.userReservedCode.equals(other.getUserReservedCode()))) &&
            ((this.userReservedDate==null && other.getUserReservedDate()==null) || 
             (this.userReservedDate!=null &&
              this.userReservedDate.equals(other.getUserReservedDate()))) &&
            ((this.userReservedNumber==null && other.getUserReservedNumber()==null) || 
             (this.userReservedNumber!=null &&
              this.userReservedNumber.equals(other.getUserReservedNumber()))) &&
            ((this.userReservedReference==null && other.getUserReservedReference()==null) || 
             (this.userReservedReference!=null &&
              this.userReservedReference.equals(other.getUserReservedReference())));
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
        if (getUserReservedAmount() != null) {
            _hashCode += getUserReservedAmount().hashCode();
        }
        if (getUserReservedCode() != null) {
            _hashCode += getUserReservedCode().hashCode();
        }
        if (getUserReservedDate() != null) {
            _hashCode += getUserReservedDate().hashCode();
        }
        if (getUserReservedNumber() != null) {
            _hashCode += getUserReservedNumber().hashCode();
        }
        if (getUserReservedReference() != null) {
            _hashCode += getUserReservedReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserReservedData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "userReservedData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userReservedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userReservedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userReservedCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userReservedCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userReservedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userReservedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userReservedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userReservedNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userReservedReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userReservedReference"));
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
