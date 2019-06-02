/**
 * ProcessPurchaseOrderApproveReject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ProcessPurchaseOrderApproveReject  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.math.BigDecimal amountToApprove;

    private java.lang.String approvalRouteCode;

    private java.lang.String approveReject;

    private java.lang.Integer approverAddressNumber;

    private java.lang.String budgetPassword;

    private java.lang.String businessUnit;

    private java.lang.String companyKeyOrderNumber;

    private JP430000.bssv.e1.oracle.PurchaseOrderRemarksDetail[] detail;

    private java.lang.Integer documentNumber;

    private java.lang.String documentType;

    private java.lang.String holdCode;

    private java.math.BigDecimal lineNumber;

    private java.lang.String orderSuffix;

    private java.lang.String p43081Version;

    private java.lang.String remark;

    private java.lang.String statusApproval;

    public ProcessPurchaseOrderApproveReject() {
    }

    public ProcessPurchaseOrderApproveReject(
           java.math.BigDecimal amountToApprove,
           java.lang.String approvalRouteCode,
           java.lang.String approveReject,
           java.lang.Integer approverAddressNumber,
           java.lang.String budgetPassword,
           java.lang.String businessUnit,
           java.lang.String companyKeyOrderNumber,
           JP430000.bssv.e1.oracle.PurchaseOrderRemarksDetail[] detail,
           java.lang.Integer documentNumber,
           java.lang.String documentType,
           java.lang.String holdCode,
           java.math.BigDecimal lineNumber,
           java.lang.String orderSuffix,
           java.lang.String p43081Version,
           java.lang.String remark,
           java.lang.String statusApproval) {
        this.amountToApprove = amountToApprove;
        this.approvalRouteCode = approvalRouteCode;
        this.approveReject = approveReject;
        this.approverAddressNumber = approverAddressNumber;
        this.budgetPassword = budgetPassword;
        this.businessUnit = businessUnit;
        this.companyKeyOrderNumber = companyKeyOrderNumber;
        this.detail = detail;
        this.documentNumber = documentNumber;
        this.documentType = documentType;
        this.holdCode = holdCode;
        this.lineNumber = lineNumber;
        this.orderSuffix = orderSuffix;
        this.p43081Version = p43081Version;
        this.remark = remark;
        this.statusApproval = statusApproval;
    }


    /**
     * Gets the amountToApprove value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return amountToApprove
     */
    public java.math.BigDecimal getAmountToApprove() {
        return amountToApprove;
    }


    /**
     * Sets the amountToApprove value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param amountToApprove
     */
    public void setAmountToApprove(java.math.BigDecimal amountToApprove) {
        this.amountToApprove = amountToApprove;
    }


    /**
     * Gets the approvalRouteCode value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return approvalRouteCode
     */
    public java.lang.String getApprovalRouteCode() {
        return approvalRouteCode;
    }


    /**
     * Sets the approvalRouteCode value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param approvalRouteCode
     */
    public void setApprovalRouteCode(java.lang.String approvalRouteCode) {
        this.approvalRouteCode = approvalRouteCode;
    }


    /**
     * Gets the approveReject value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return approveReject
     */
    public java.lang.String getApproveReject() {
        return approveReject;
    }


    /**
     * Sets the approveReject value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param approveReject
     */
    public void setApproveReject(java.lang.String approveReject) {
        this.approveReject = approveReject;
    }


    /**
     * Gets the approverAddressNumber value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return approverAddressNumber
     */
    public java.lang.Integer getApproverAddressNumber() {
        return approverAddressNumber;
    }


    /**
     * Sets the approverAddressNumber value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param approverAddressNumber
     */
    public void setApproverAddressNumber(java.lang.Integer approverAddressNumber) {
        this.approverAddressNumber = approverAddressNumber;
    }


    /**
     * Gets the budgetPassword value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return budgetPassword
     */
    public java.lang.String getBudgetPassword() {
        return budgetPassword;
    }


    /**
     * Sets the budgetPassword value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param budgetPassword
     */
    public void setBudgetPassword(java.lang.String budgetPassword) {
        this.budgetPassword = budgetPassword;
    }


    /**
     * Gets the businessUnit value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the companyKeyOrderNumber value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return companyKeyOrderNumber
     */
    public java.lang.String getCompanyKeyOrderNumber() {
        return companyKeyOrderNumber;
    }


    /**
     * Sets the companyKeyOrderNumber value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param companyKeyOrderNumber
     */
    public void setCompanyKeyOrderNumber(java.lang.String companyKeyOrderNumber) {
        this.companyKeyOrderNumber = companyKeyOrderNumber;
    }


    /**
     * Gets the detail value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return detail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderRemarksDetail[] getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param detail
     */
    public void setDetail(JP430000.bssv.e1.oracle.PurchaseOrderRemarksDetail[] detail) {
        this.detail = detail;
    }

    public JP430000.bssv.e1.oracle.PurchaseOrderRemarksDetail getDetail(int i) {
        return this.detail[i];
    }

    public void setDetail(int i, JP430000.bssv.e1.oracle.PurchaseOrderRemarksDetail _value) {
        this.detail[i] = _value;
    }


    /**
     * Gets the documentNumber value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return documentNumber
     */
    public java.lang.Integer getDocumentNumber() {
        return documentNumber;
    }


    /**
     * Sets the documentNumber value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(java.lang.Integer documentNumber) {
        this.documentNumber = documentNumber;
    }


    /**
     * Gets the documentType value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the holdCode value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return holdCode
     */
    public java.lang.String getHoldCode() {
        return holdCode;
    }


    /**
     * Sets the holdCode value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param holdCode
     */
    public void setHoldCode(java.lang.String holdCode) {
        this.holdCode = holdCode;
    }


    /**
     * Gets the lineNumber value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return lineNumber
     */
    public java.math.BigDecimal getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param lineNumber
     */
    public void setLineNumber(java.math.BigDecimal lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the orderSuffix value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return orderSuffix
     */
    public java.lang.String getOrderSuffix() {
        return orderSuffix;
    }


    /**
     * Sets the orderSuffix value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param orderSuffix
     */
    public void setOrderSuffix(java.lang.String orderSuffix) {
        this.orderSuffix = orderSuffix;
    }


    /**
     * Gets the p43081Version value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return p43081Version
     */
    public java.lang.String getP43081Version() {
        return p43081Version;
    }


    /**
     * Sets the p43081Version value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param p43081Version
     */
    public void setP43081Version(java.lang.String p43081Version) {
        this.p43081Version = p43081Version;
    }


    /**
     * Gets the remark value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the statusApproval value for this ProcessPurchaseOrderApproveReject.
     * 
     * @return statusApproval
     */
    public java.lang.String getStatusApproval() {
        return statusApproval;
    }


    /**
     * Sets the statusApproval value for this ProcessPurchaseOrderApproveReject.
     * 
     * @param statusApproval
     */
    public void setStatusApproval(java.lang.String statusApproval) {
        this.statusApproval = statusApproval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessPurchaseOrderApproveReject)) return false;
        ProcessPurchaseOrderApproveReject other = (ProcessPurchaseOrderApproveReject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amountToApprove==null && other.getAmountToApprove()==null) || 
             (this.amountToApprove!=null &&
              this.amountToApprove.equals(other.getAmountToApprove()))) &&
            ((this.approvalRouteCode==null && other.getApprovalRouteCode()==null) || 
             (this.approvalRouteCode!=null &&
              this.approvalRouteCode.equals(other.getApprovalRouteCode()))) &&
            ((this.approveReject==null && other.getApproveReject()==null) || 
             (this.approveReject!=null &&
              this.approveReject.equals(other.getApproveReject()))) &&
            ((this.approverAddressNumber==null && other.getApproverAddressNumber()==null) || 
             (this.approverAddressNumber!=null &&
              this.approverAddressNumber.equals(other.getApproverAddressNumber()))) &&
            ((this.budgetPassword==null && other.getBudgetPassword()==null) || 
             (this.budgetPassword!=null &&
              this.budgetPassword.equals(other.getBudgetPassword()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.companyKeyOrderNumber==null && other.getCompanyKeyOrderNumber()==null) || 
             (this.companyKeyOrderNumber!=null &&
              this.companyKeyOrderNumber.equals(other.getCompanyKeyOrderNumber()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              java.util.Arrays.equals(this.detail, other.getDetail()))) &&
            ((this.documentNumber==null && other.getDocumentNumber()==null) || 
             (this.documentNumber!=null &&
              this.documentNumber.equals(other.getDocumentNumber()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.holdCode==null && other.getHoldCode()==null) || 
             (this.holdCode!=null &&
              this.holdCode.equals(other.getHoldCode()))) &&
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber()))) &&
            ((this.orderSuffix==null && other.getOrderSuffix()==null) || 
             (this.orderSuffix!=null &&
              this.orderSuffix.equals(other.getOrderSuffix()))) &&
            ((this.p43081Version==null && other.getP43081Version()==null) || 
             (this.p43081Version!=null &&
              this.p43081Version.equals(other.getP43081Version()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.statusApproval==null && other.getStatusApproval()==null) || 
             (this.statusApproval!=null &&
              this.statusApproval.equals(other.getStatusApproval())));
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
        if (getAmountToApprove() != null) {
            _hashCode += getAmountToApprove().hashCode();
        }
        if (getApprovalRouteCode() != null) {
            _hashCode += getApprovalRouteCode().hashCode();
        }
        if (getApproveReject() != null) {
            _hashCode += getApproveReject().hashCode();
        }
        if (getApproverAddressNumber() != null) {
            _hashCode += getApproverAddressNumber().hashCode();
        }
        if (getBudgetPassword() != null) {
            _hashCode += getBudgetPassword().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCompanyKeyOrderNumber() != null) {
            _hashCode += getCompanyKeyOrderNumber().hashCode();
        }
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
        if (getDocumentNumber() != null) {
            _hashCode += getDocumentNumber().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getHoldCode() != null) {
            _hashCode += getHoldCode().hashCode();
        }
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        if (getOrderSuffix() != null) {
            _hashCode += getOrderSuffix().hashCode();
        }
        if (getP43081Version() != null) {
            _hashCode += getP43081Version().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getStatusApproval() != null) {
            _hashCode += getStatusApproval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessPurchaseOrderApproveReject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderApproveReject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountToApprove");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountToApprove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalRouteCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approvalRouteCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approveReject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approveReject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approverAddressNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approverAddressNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "budgetPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyKeyOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyKeyOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderRemarksDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("p43081Version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "p43081Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusApproval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusApproval"));
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
