/**
 * PurchaseOrderAcknowledgeHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderAcknowledgeHeader  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String attachmentText;

    private JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeDetail[] detail;

    private JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeFinancial financial;

    private java.lang.String freightHandlingCode;

    private java.lang.String orderTakenBy;

    private JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey;

    private java.lang.String statusOrderCode;

    private JP430000.bssv.e1.oracle.Entity supplier;

    private JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeTax tax;

    private JP430000.bssv.e1.oracle.UserReservedData userReservedData;

    public PurchaseOrderAcknowledgeHeader() {
    }

    public PurchaseOrderAcknowledgeHeader(
           java.lang.String attachmentText,
           JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeDetail[] detail,
           JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeFinancial financial,
           java.lang.String freightHandlingCode,
           java.lang.String orderTakenBy,
           JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey,
           java.lang.String statusOrderCode,
           JP430000.bssv.e1.oracle.Entity supplier,
           JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeTax tax,
           JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.attachmentText = attachmentText;
        this.detail = detail;
        this.financial = financial;
        this.freightHandlingCode = freightHandlingCode;
        this.orderTakenBy = orderTakenBy;
        this.purchaseOrderKey = purchaseOrderKey;
        this.statusOrderCode = statusOrderCode;
        this.supplier = supplier;
        this.tax = tax;
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the attachmentText value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @return attachmentText
     */
    public java.lang.String getAttachmentText() {
        return attachmentText;
    }


    /**
     * Sets the attachmentText value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @param attachmentText
     */
    public void setAttachmentText(java.lang.String attachmentText) {
        this.attachmentText = attachmentText;
    }


    /**
     * Gets the detail value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @return detail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeDetail[] getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @param detail
     */
    public void setDetail(JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeDetail[] detail) {
        this.detail = detail;
    }

    public JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeDetail getDetail(int i) {
        return this.detail[i];
    }

    public void setDetail(int i, JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeDetail _value) {
        this.detail[i] = _value;
    }


    /**
     * Gets the financial value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @return financial
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeFinancial getFinancial() {
        return financial;
    }


    /**
     * Sets the financial value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @param financial
     */
    public void setFinancial(JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeFinancial financial) {
        this.financial = financial;
    }


    /**
     * Gets the freightHandlingCode value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @return freightHandlingCode
     */
    public java.lang.String getFreightHandlingCode() {
        return freightHandlingCode;
    }


    /**
     * Sets the freightHandlingCode value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @param freightHandlingCode
     */
    public void setFreightHandlingCode(java.lang.String freightHandlingCode) {
        this.freightHandlingCode = freightHandlingCode;
    }


    /**
     * Gets the orderTakenBy value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @return orderTakenBy
     */
    public java.lang.String getOrderTakenBy() {
        return orderTakenBy;
    }


    /**
     * Sets the orderTakenBy value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @param orderTakenBy
     */
    public void setOrderTakenBy(java.lang.String orderTakenBy) {
        this.orderTakenBy = orderTakenBy;
    }


    /**
     * Gets the purchaseOrderKey value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @return purchaseOrderKey
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderKey getPurchaseOrderKey() {
        return purchaseOrderKey;
    }


    /**
     * Sets the purchaseOrderKey value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @param purchaseOrderKey
     */
    public void setPurchaseOrderKey(JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey) {
        this.purchaseOrderKey = purchaseOrderKey;
    }


    /**
     * Gets the statusOrderCode value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @return statusOrderCode
     */
    public java.lang.String getStatusOrderCode() {
        return statusOrderCode;
    }


    /**
     * Sets the statusOrderCode value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @param statusOrderCode
     */
    public void setStatusOrderCode(java.lang.String statusOrderCode) {
        this.statusOrderCode = statusOrderCode;
    }


    /**
     * Gets the supplier value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @return supplier
     */
    public JP430000.bssv.e1.oracle.Entity getSupplier() {
        return supplier;
    }


    /**
     * Sets the supplier value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @param supplier
     */
    public void setSupplier(JP430000.bssv.e1.oracle.Entity supplier) {
        this.supplier = supplier;
    }


    /**
     * Gets the tax value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @return tax
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeTax getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @param tax
     */
    public void setTax(JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeTax tax) {
        this.tax = tax;
    }


    /**
     * Gets the userReservedData value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @return userReservedData
     */
    public JP430000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this PurchaseOrderAcknowledgeHeader.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderAcknowledgeHeader)) return false;
        PurchaseOrderAcknowledgeHeader other = (PurchaseOrderAcknowledgeHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachmentText==null && other.getAttachmentText()==null) || 
             (this.attachmentText!=null &&
              this.attachmentText.equals(other.getAttachmentText()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              java.util.Arrays.equals(this.detail, other.getDetail()))) &&
            ((this.financial==null && other.getFinancial()==null) || 
             (this.financial!=null &&
              this.financial.equals(other.getFinancial()))) &&
            ((this.freightHandlingCode==null && other.getFreightHandlingCode()==null) || 
             (this.freightHandlingCode!=null &&
              this.freightHandlingCode.equals(other.getFreightHandlingCode()))) &&
            ((this.orderTakenBy==null && other.getOrderTakenBy()==null) || 
             (this.orderTakenBy!=null &&
              this.orderTakenBy.equals(other.getOrderTakenBy()))) &&
            ((this.purchaseOrderKey==null && other.getPurchaseOrderKey()==null) || 
             (this.purchaseOrderKey!=null &&
              this.purchaseOrderKey.equals(other.getPurchaseOrderKey()))) &&
            ((this.statusOrderCode==null && other.getStatusOrderCode()==null) || 
             (this.statusOrderCode!=null &&
              this.statusOrderCode.equals(other.getStatusOrderCode()))) &&
            ((this.supplier==null && other.getSupplier()==null) || 
             (this.supplier!=null &&
              this.supplier.equals(other.getSupplier()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.userReservedData==null && other.getUserReservedData()==null) || 
             (this.userReservedData!=null &&
              this.userReservedData.equals(other.getUserReservedData())));
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
        if (getAttachmentText() != null) {
            _hashCode += getAttachmentText().hashCode();
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
        if (getFinancial() != null) {
            _hashCode += getFinancial().hashCode();
        }
        if (getFreightHandlingCode() != null) {
            _hashCode += getFreightHandlingCode().hashCode();
        }
        if (getOrderTakenBy() != null) {
            _hashCode += getOrderTakenBy().hashCode();
        }
        if (getPurchaseOrderKey() != null) {
            _hashCode += getPurchaseOrderKey().hashCode();
        }
        if (getStatusOrderCode() != null) {
            _hashCode += getStatusOrderCode().hashCode();
        }
        if (getSupplier() != null) {
            _hashCode += getSupplier().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getUserReservedData() != null) {
            _hashCode += getUserReservedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderAcknowledgeHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "financial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeFinancial"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightHandlingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freightHandlingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderTakenBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderTakenBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusOrderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusOrderCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeTax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userReservedData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userReservedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "userReservedData"));
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
