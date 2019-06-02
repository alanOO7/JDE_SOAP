/**
 * ConfirmPurchaseOrderHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ConfirmPurchaseOrderHeader  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP430000.bssv.e1.oracle.ConfirmPurchaseOrderDetail[] detail;

    private java.lang.String documentCompany;

    private java.lang.Integer documentNumber;

    private java.lang.String documentSuffix;

    private java.lang.String documentTypeCode;

    private JP430000.bssv.e1.oracle.ConfirmPurchaseOrderFinancialHeader financial;

    private java.lang.String holdCode;

    private java.lang.String reference;

    private java.lang.String reference02;

    public ConfirmPurchaseOrderHeader() {
    }

    public ConfirmPurchaseOrderHeader(
           JP430000.bssv.e1.oracle.ConfirmPurchaseOrderDetail[] detail,
           java.lang.String documentCompany,
           java.lang.Integer documentNumber,
           java.lang.String documentSuffix,
           java.lang.String documentTypeCode,
           JP430000.bssv.e1.oracle.ConfirmPurchaseOrderFinancialHeader financial,
           java.lang.String holdCode,
           java.lang.String reference,
           java.lang.String reference02) {
        this.detail = detail;
        this.documentCompany = documentCompany;
        this.documentNumber = documentNumber;
        this.documentSuffix = documentSuffix;
        this.documentTypeCode = documentTypeCode;
        this.financial = financial;
        this.holdCode = holdCode;
        this.reference = reference;
        this.reference02 = reference02;
    }


    /**
     * Gets the detail value for this ConfirmPurchaseOrderHeader.
     * 
     * @return detail
     */
    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderDetail[] getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this ConfirmPurchaseOrderHeader.
     * 
     * @param detail
     */
    public void setDetail(JP430000.bssv.e1.oracle.ConfirmPurchaseOrderDetail[] detail) {
        this.detail = detail;
    }

    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderDetail getDetail(int i) {
        return this.detail[i];
    }

    public void setDetail(int i, JP430000.bssv.e1.oracle.ConfirmPurchaseOrderDetail _value) {
        this.detail[i] = _value;
    }


    /**
     * Gets the documentCompany value for this ConfirmPurchaseOrderHeader.
     * 
     * @return documentCompany
     */
    public java.lang.String getDocumentCompany() {
        return documentCompany;
    }


    /**
     * Sets the documentCompany value for this ConfirmPurchaseOrderHeader.
     * 
     * @param documentCompany
     */
    public void setDocumentCompany(java.lang.String documentCompany) {
        this.documentCompany = documentCompany;
    }


    /**
     * Gets the documentNumber value for this ConfirmPurchaseOrderHeader.
     * 
     * @return documentNumber
     */
    public java.lang.Integer getDocumentNumber() {
        return documentNumber;
    }


    /**
     * Sets the documentNumber value for this ConfirmPurchaseOrderHeader.
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(java.lang.Integer documentNumber) {
        this.documentNumber = documentNumber;
    }


    /**
     * Gets the documentSuffix value for this ConfirmPurchaseOrderHeader.
     * 
     * @return documentSuffix
     */
    public java.lang.String getDocumentSuffix() {
        return documentSuffix;
    }


    /**
     * Sets the documentSuffix value for this ConfirmPurchaseOrderHeader.
     * 
     * @param documentSuffix
     */
    public void setDocumentSuffix(java.lang.String documentSuffix) {
        this.documentSuffix = documentSuffix;
    }


    /**
     * Gets the documentTypeCode value for this ConfirmPurchaseOrderHeader.
     * 
     * @return documentTypeCode
     */
    public java.lang.String getDocumentTypeCode() {
        return documentTypeCode;
    }


    /**
     * Sets the documentTypeCode value for this ConfirmPurchaseOrderHeader.
     * 
     * @param documentTypeCode
     */
    public void setDocumentTypeCode(java.lang.String documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }


    /**
     * Gets the financial value for this ConfirmPurchaseOrderHeader.
     * 
     * @return financial
     */
    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderFinancialHeader getFinancial() {
        return financial;
    }


    /**
     * Sets the financial value for this ConfirmPurchaseOrderHeader.
     * 
     * @param financial
     */
    public void setFinancial(JP430000.bssv.e1.oracle.ConfirmPurchaseOrderFinancialHeader financial) {
        this.financial = financial;
    }


    /**
     * Gets the holdCode value for this ConfirmPurchaseOrderHeader.
     * 
     * @return holdCode
     */
    public java.lang.String getHoldCode() {
        return holdCode;
    }


    /**
     * Sets the holdCode value for this ConfirmPurchaseOrderHeader.
     * 
     * @param holdCode
     */
    public void setHoldCode(java.lang.String holdCode) {
        this.holdCode = holdCode;
    }


    /**
     * Gets the reference value for this ConfirmPurchaseOrderHeader.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this ConfirmPurchaseOrderHeader.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the reference02 value for this ConfirmPurchaseOrderHeader.
     * 
     * @return reference02
     */
    public java.lang.String getReference02() {
        return reference02;
    }


    /**
     * Sets the reference02 value for this ConfirmPurchaseOrderHeader.
     * 
     * @param reference02
     */
    public void setReference02(java.lang.String reference02) {
        this.reference02 = reference02;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmPurchaseOrderHeader)) return false;
        ConfirmPurchaseOrderHeader other = (ConfirmPurchaseOrderHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              java.util.Arrays.equals(this.detail, other.getDetail()))) &&
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
              this.documentTypeCode.equals(other.getDocumentTypeCode()))) &&
            ((this.financial==null && other.getFinancial()==null) || 
             (this.financial!=null &&
              this.financial.equals(other.getFinancial()))) &&
            ((this.holdCode==null && other.getHoldCode()==null) || 
             (this.holdCode!=null &&
              this.holdCode.equals(other.getHoldCode()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.reference02==null && other.getReference02()==null) || 
             (this.reference02!=null &&
              this.reference02.equals(other.getReference02())));
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
        if (getDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getFinancial() != null) {
            _hashCode += getFinancial().hashCode();
        }
        if (getHoldCode() != null) {
            _hashCode += getHoldCode().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getReference02() != null) {
            _hashCode += getReference02().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmPurchaseOrderHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "financial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderFinancialHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference02");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference02"));
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
