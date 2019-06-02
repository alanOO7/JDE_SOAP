/**
 * GetPurchaseOrderDetailForApprover.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class GetPurchaseOrderDetailForApprover  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String companyKeyOrderNo;

    private java.lang.Integer documentOrderInvoiceNumber;

    private java.lang.String documentOrderTypeCode;

    private java.lang.String documentSuffix;

    private java.lang.String statusCodeNext;

    public GetPurchaseOrderDetailForApprover() {
    }

    public GetPurchaseOrderDetailForApprover(
           java.lang.String companyKeyOrderNo,
           java.lang.Integer documentOrderInvoiceNumber,
           java.lang.String documentOrderTypeCode,
           java.lang.String documentSuffix,
           java.lang.String statusCodeNext) {
        this.companyKeyOrderNo = companyKeyOrderNo;
        this.documentOrderInvoiceNumber = documentOrderInvoiceNumber;
        this.documentOrderTypeCode = documentOrderTypeCode;
        this.documentSuffix = documentSuffix;
        this.statusCodeNext = statusCodeNext;
    }


    /**
     * Gets the companyKeyOrderNo value for this GetPurchaseOrderDetailForApprover.
     * 
     * @return companyKeyOrderNo
     */
    public java.lang.String getCompanyKeyOrderNo() {
        return companyKeyOrderNo;
    }


    /**
     * Sets the companyKeyOrderNo value for this GetPurchaseOrderDetailForApprover.
     * 
     * @param companyKeyOrderNo
     */
    public void setCompanyKeyOrderNo(java.lang.String companyKeyOrderNo) {
        this.companyKeyOrderNo = companyKeyOrderNo;
    }


    /**
     * Gets the documentOrderInvoiceNumber value for this GetPurchaseOrderDetailForApprover.
     * 
     * @return documentOrderInvoiceNumber
     */
    public java.lang.Integer getDocumentOrderInvoiceNumber() {
        return documentOrderInvoiceNumber;
    }


    /**
     * Sets the documentOrderInvoiceNumber value for this GetPurchaseOrderDetailForApprover.
     * 
     * @param documentOrderInvoiceNumber
     */
    public void setDocumentOrderInvoiceNumber(java.lang.Integer documentOrderInvoiceNumber) {
        this.documentOrderInvoiceNumber = documentOrderInvoiceNumber;
    }


    /**
     * Gets the documentOrderTypeCode value for this GetPurchaseOrderDetailForApprover.
     * 
     * @return documentOrderTypeCode
     */
    public java.lang.String getDocumentOrderTypeCode() {
        return documentOrderTypeCode;
    }


    /**
     * Sets the documentOrderTypeCode value for this GetPurchaseOrderDetailForApprover.
     * 
     * @param documentOrderTypeCode
     */
    public void setDocumentOrderTypeCode(java.lang.String documentOrderTypeCode) {
        this.documentOrderTypeCode = documentOrderTypeCode;
    }


    /**
     * Gets the documentSuffix value for this GetPurchaseOrderDetailForApprover.
     * 
     * @return documentSuffix
     */
    public java.lang.String getDocumentSuffix() {
        return documentSuffix;
    }


    /**
     * Sets the documentSuffix value for this GetPurchaseOrderDetailForApprover.
     * 
     * @param documentSuffix
     */
    public void setDocumentSuffix(java.lang.String documentSuffix) {
        this.documentSuffix = documentSuffix;
    }


    /**
     * Gets the statusCodeNext value for this GetPurchaseOrderDetailForApprover.
     * 
     * @return statusCodeNext
     */
    public java.lang.String getStatusCodeNext() {
        return statusCodeNext;
    }


    /**
     * Sets the statusCodeNext value for this GetPurchaseOrderDetailForApprover.
     * 
     * @param statusCodeNext
     */
    public void setStatusCodeNext(java.lang.String statusCodeNext) {
        this.statusCodeNext = statusCodeNext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPurchaseOrderDetailForApprover)) return false;
        GetPurchaseOrderDetailForApprover other = (GetPurchaseOrderDetailForApprover) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.companyKeyOrderNo==null && other.getCompanyKeyOrderNo()==null) || 
             (this.companyKeyOrderNo!=null &&
              this.companyKeyOrderNo.equals(other.getCompanyKeyOrderNo()))) &&
            ((this.documentOrderInvoiceNumber==null && other.getDocumentOrderInvoiceNumber()==null) || 
             (this.documentOrderInvoiceNumber!=null &&
              this.documentOrderInvoiceNumber.equals(other.getDocumentOrderInvoiceNumber()))) &&
            ((this.documentOrderTypeCode==null && other.getDocumentOrderTypeCode()==null) || 
             (this.documentOrderTypeCode!=null &&
              this.documentOrderTypeCode.equals(other.getDocumentOrderTypeCode()))) &&
            ((this.documentSuffix==null && other.getDocumentSuffix()==null) || 
             (this.documentSuffix!=null &&
              this.documentSuffix.equals(other.getDocumentSuffix()))) &&
            ((this.statusCodeNext==null && other.getStatusCodeNext()==null) || 
             (this.statusCodeNext!=null &&
              this.statusCodeNext.equals(other.getStatusCodeNext())));
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
        if (getCompanyKeyOrderNo() != null) {
            _hashCode += getCompanyKeyOrderNo().hashCode();
        }
        if (getDocumentOrderInvoiceNumber() != null) {
            _hashCode += getDocumentOrderInvoiceNumber().hashCode();
        }
        if (getDocumentOrderTypeCode() != null) {
            _hashCode += getDocumentOrderTypeCode().hashCode();
        }
        if (getDocumentSuffix() != null) {
            _hashCode += getDocumentSuffix().hashCode();
        }
        if (getStatusCodeNext() != null) {
            _hashCode += getStatusCodeNext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPurchaseOrderDetailForApprover.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderDetailForApprover"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyKeyOrderNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyKeyOrderNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentOrderInvoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentOrderInvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentOrderTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentOrderTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("statusCodeNext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCodeNext"));
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
