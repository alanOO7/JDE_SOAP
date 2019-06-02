/**
 * OriginalOrderKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class OriginalOrderKey  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String documentCompany;

    private java.lang.String documentNumber;

    private java.lang.String documentTypeCode;

    public OriginalOrderKey() {
    }

    public OriginalOrderKey(
           java.lang.String documentCompany,
           java.lang.String documentNumber,
           java.lang.String documentTypeCode) {
        this.documentCompany = documentCompany;
        this.documentNumber = documentNumber;
        this.documentTypeCode = documentTypeCode;
    }


    /**
     * Gets the documentCompany value for this OriginalOrderKey.
     * 
     * @return documentCompany
     */
    public java.lang.String getDocumentCompany() {
        return documentCompany;
    }


    /**
     * Sets the documentCompany value for this OriginalOrderKey.
     * 
     * @param documentCompany
     */
    public void setDocumentCompany(java.lang.String documentCompany) {
        this.documentCompany = documentCompany;
    }


    /**
     * Gets the documentNumber value for this OriginalOrderKey.
     * 
     * @return documentNumber
     */
    public java.lang.String getDocumentNumber() {
        return documentNumber;
    }


    /**
     * Sets the documentNumber value for this OriginalOrderKey.
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(java.lang.String documentNumber) {
        this.documentNumber = documentNumber;
    }


    /**
     * Gets the documentTypeCode value for this OriginalOrderKey.
     * 
     * @return documentTypeCode
     */
    public java.lang.String getDocumentTypeCode() {
        return documentTypeCode;
    }


    /**
     * Sets the documentTypeCode value for this OriginalOrderKey.
     * 
     * @param documentTypeCode
     */
    public void setDocumentTypeCode(java.lang.String documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OriginalOrderKey)) return false;
        OriginalOrderKey other = (OriginalOrderKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.documentCompany==null && other.getDocumentCompany()==null) || 
             (this.documentCompany!=null &&
              this.documentCompany.equals(other.getDocumentCompany()))) &&
            ((this.documentNumber==null && other.getDocumentNumber()==null) || 
             (this.documentNumber!=null &&
              this.documentNumber.equals(other.getDocumentNumber()))) &&
            ((this.documentTypeCode==null && other.getDocumentTypeCode()==null) || 
             (this.documentTypeCode!=null &&
              this.documentTypeCode.equals(other.getDocumentTypeCode())));
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
        if (getDocumentCompany() != null) {
            _hashCode += getDocumentCompany().hashCode();
        }
        if (getDocumentNumber() != null) {
            _hashCode += getDocumentNumber().hashCode();
        }
        if (getDocumentTypeCode() != null) {
            _hashCode += getDocumentTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OriginalOrderKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "originalOrderKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentTypeCode"));
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
