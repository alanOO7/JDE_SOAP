/**
 * ProcessSODetailProcessing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ProcessSODetailProcessing  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String actionType;

    private java.lang.Boolean useConfigurationRule;

    public ProcessSODetailProcessing() {
    }

    public ProcessSODetailProcessing(
           java.lang.String actionType,
           java.lang.Boolean useConfigurationRule) {
        this.actionType = actionType;
        this.useConfigurationRule = useConfigurationRule;
    }


    /**
     * Gets the actionType value for this ProcessSODetailProcessing.
     * 
     * @return actionType
     */
    public java.lang.String getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this ProcessSODetailProcessing.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.String actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the useConfigurationRule value for this ProcessSODetailProcessing.
     * 
     * @return useConfigurationRule
     */
    public java.lang.Boolean getUseConfigurationRule() {
        return useConfigurationRule;
    }


    /**
     * Sets the useConfigurationRule value for this ProcessSODetailProcessing.
     * 
     * @param useConfigurationRule
     */
    public void setUseConfigurationRule(java.lang.Boolean useConfigurationRule) {
        this.useConfigurationRule = useConfigurationRule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessSODetailProcessing)) return false;
        ProcessSODetailProcessing other = (ProcessSODetailProcessing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.useConfigurationRule==null && other.getUseConfigurationRule()==null) || 
             (this.useConfigurationRule!=null &&
              this.useConfigurationRule.equals(other.getUseConfigurationRule())));
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
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getUseConfigurationRule() != null) {
            _hashCode += getUseConfigurationRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessSODetailProcessing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailProcessing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useConfigurationRule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useConfigurationRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
