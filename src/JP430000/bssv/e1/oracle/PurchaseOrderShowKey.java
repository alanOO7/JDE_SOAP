/**
 * PurchaseOrderShowKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderShowKey  implements java.io.Serializable {
    private java.lang.String documentCompany;

    private java.lang.Integer documentNumber;

    private java.lang.String documentSuffix;

    private java.lang.String documentTypeCode;

    public PurchaseOrderShowKey() {
    }

    public PurchaseOrderShowKey(
           java.lang.String documentCompany,
           java.lang.Integer documentNumber,
           java.lang.String documentSuffix,
           java.lang.String documentTypeCode) {
           this.documentCompany = documentCompany;
           this.documentNumber = documentNumber;
           this.documentSuffix = documentSuffix;
           this.documentTypeCode = documentTypeCode;
    }


    /**
     * Gets the documentCompany value for this PurchaseOrderShowKey.
     * 
     * @return documentCompany
     */
    public java.lang.String getDocumentCompany() {
        return documentCompany;
    }


    /**
     * Sets the documentCompany value for this PurchaseOrderShowKey.
     * 
     * @param documentCompany
     */
    public void setDocumentCompany(java.lang.String documentCompany) {
        this.documentCompany = documentCompany;
    }


    /**
     * Gets the documentNumber value for this PurchaseOrderShowKey.
     * 
     * @return documentNumber
     */
    public java.lang.Integer getDocumentNumber() {
        return documentNumber;
    }


    /**
     * Sets the documentNumber value for this PurchaseOrderShowKey.
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(java.lang.Integer documentNumber) {
        this.documentNumber = documentNumber;
    }


    /**
     * Gets the documentSuffix value for this PurchaseOrderShowKey.
     * 
     * @return documentSuffix
     */
    public java.lang.String getDocumentSuffix() {
        return documentSuffix;
    }


    /**
     * Sets the documentSuffix value for this PurchaseOrderShowKey.
     * 
     * @param documentSuffix
     */
    public void setDocumentSuffix(java.lang.String documentSuffix) {
        this.documentSuffix = documentSuffix;
    }


    /**
     * Gets the documentTypeCode value for this PurchaseOrderShowKey.
     * 
     * @return documentTypeCode
     */
    public java.lang.String getDocumentTypeCode() {
        return documentTypeCode;
    }


    /**
     * Sets the documentTypeCode value for this PurchaseOrderShowKey.
     * 
     * @param documentTypeCode
     */
    public void setDocumentTypeCode(java.lang.String documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderShowKey)) return false;
        PurchaseOrderShowKey other = (PurchaseOrderShowKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentCompany==null && other.getDocumentCompany()==null) || 
             (this.documentCompany!=null &&
              this.documentCompany.equals(other.getDocumentCompany()))) &&
            ((this.documentNumber==null && other.getDocumentNumber()==null) || 
             (this.documentNumber!=null &&
              this.documentNumber.equals(other.getDocumentNumber()))) &&
            ((this.documentSuffix==null && other.getDocumentSuffix()==null) || 
             (this.documentSuffix!=null &&
              this.documentSuffix.equals(other.getDocumentSuffix()))) &&
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
        int _hashCode = 1;
        if (getDocumentCompany() != null) {
            _hashCode += getDocumentCompany().hashCode();
        }
        if (getDocumentNumber() != null) {
            _hashCode += getDocumentNumber().hashCode();
        }
        if (getDocumentSuffix() != null) {
            _hashCode += getDocumentSuffix().hashCode();
        }
        if (getDocumentTypeCode() != null) {
            _hashCode += getDocumentTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderShowKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowKey"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentSuffix"));
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
