/**
 * ReportingCodesPurchasing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ReportingCodesPurchasing  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String purchasingReportCode001;

    private java.lang.String purchasingReportCode002;

    private java.lang.String purchasingReportCode003;

    private java.lang.String purchasingReportCode004;

    public ReportingCodesPurchasing() {
    }

    public ReportingCodesPurchasing(
           java.lang.String purchasingReportCode001,
           java.lang.String purchasingReportCode002,
           java.lang.String purchasingReportCode003,
           java.lang.String purchasingReportCode004) {
        this.purchasingReportCode001 = purchasingReportCode001;
        this.purchasingReportCode002 = purchasingReportCode002;
        this.purchasingReportCode003 = purchasingReportCode003;
        this.purchasingReportCode004 = purchasingReportCode004;
    }


    /**
     * Gets the purchasingReportCode001 value for this ReportingCodesPurchasing.
     * 
     * @return purchasingReportCode001
     */
    public java.lang.String getPurchasingReportCode001() {
        return purchasingReportCode001;
    }


    /**
     * Sets the purchasingReportCode001 value for this ReportingCodesPurchasing.
     * 
     * @param purchasingReportCode001
     */
    public void setPurchasingReportCode001(java.lang.String purchasingReportCode001) {
        this.purchasingReportCode001 = purchasingReportCode001;
    }


    /**
     * Gets the purchasingReportCode002 value for this ReportingCodesPurchasing.
     * 
     * @return purchasingReportCode002
     */
    public java.lang.String getPurchasingReportCode002() {
        return purchasingReportCode002;
    }


    /**
     * Sets the purchasingReportCode002 value for this ReportingCodesPurchasing.
     * 
     * @param purchasingReportCode002
     */
    public void setPurchasingReportCode002(java.lang.String purchasingReportCode002) {
        this.purchasingReportCode002 = purchasingReportCode002;
    }


    /**
     * Gets the purchasingReportCode003 value for this ReportingCodesPurchasing.
     * 
     * @return purchasingReportCode003
     */
    public java.lang.String getPurchasingReportCode003() {
        return purchasingReportCode003;
    }


    /**
     * Sets the purchasingReportCode003 value for this ReportingCodesPurchasing.
     * 
     * @param purchasingReportCode003
     */
    public void setPurchasingReportCode003(java.lang.String purchasingReportCode003) {
        this.purchasingReportCode003 = purchasingReportCode003;
    }


    /**
     * Gets the purchasingReportCode004 value for this ReportingCodesPurchasing.
     * 
     * @return purchasingReportCode004
     */
    public java.lang.String getPurchasingReportCode004() {
        return purchasingReportCode004;
    }


    /**
     * Sets the purchasingReportCode004 value for this ReportingCodesPurchasing.
     * 
     * @param purchasingReportCode004
     */
    public void setPurchasingReportCode004(java.lang.String purchasingReportCode004) {
        this.purchasingReportCode004 = purchasingReportCode004;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportingCodesPurchasing)) return false;
        ReportingCodesPurchasing other = (ReportingCodesPurchasing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.purchasingReportCode001==null && other.getPurchasingReportCode001()==null) || 
             (this.purchasingReportCode001!=null &&
              this.purchasingReportCode001.equals(other.getPurchasingReportCode001()))) &&
            ((this.purchasingReportCode002==null && other.getPurchasingReportCode002()==null) || 
             (this.purchasingReportCode002!=null &&
              this.purchasingReportCode002.equals(other.getPurchasingReportCode002()))) &&
            ((this.purchasingReportCode003==null && other.getPurchasingReportCode003()==null) || 
             (this.purchasingReportCode003!=null &&
              this.purchasingReportCode003.equals(other.getPurchasingReportCode003()))) &&
            ((this.purchasingReportCode004==null && other.getPurchasingReportCode004()==null) || 
             (this.purchasingReportCode004!=null &&
              this.purchasingReportCode004.equals(other.getPurchasingReportCode004())));
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
        if (getPurchasingReportCode001() != null) {
            _hashCode += getPurchasingReportCode001().hashCode();
        }
        if (getPurchasingReportCode002() != null) {
            _hashCode += getPurchasingReportCode002().hashCode();
        }
        if (getPurchasingReportCode003() != null) {
            _hashCode += getPurchasingReportCode003().hashCode();
        }
        if (getPurchasingReportCode004() != null) {
            _hashCode += getPurchasingReportCode004().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportingCodesPurchasing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "reportingCodesPurchasing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasingReportCode001");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchasingReportCode001"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasingReportCode002");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchasingReportCode002"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasingReportCode003");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchasingReportCode003"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasingReportCode004");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchasingReportCode004"));
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
