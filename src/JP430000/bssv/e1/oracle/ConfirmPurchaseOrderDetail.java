/**
 * ConfirmPurchaseOrderDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ConfirmPurchaseOrderDetail  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String businessUnit;

    private JP430000.bssv.e1.oracle.ConfirmPurchaseOrderFinancialDetail financialDetail;

    private JP430000.bssv.e1.oracle.ItemResponseSupplier product;

    private java.math.BigDecimal purchaseOrderLineNumber;

    private JP430000.bssv.e1.oracle.ConfirmPurchaseOrderQuantity quantity;

    public ConfirmPurchaseOrderDetail() {
    }

    public ConfirmPurchaseOrderDetail(
           java.lang.String businessUnit,
           JP430000.bssv.e1.oracle.ConfirmPurchaseOrderFinancialDetail financialDetail,
           JP430000.bssv.e1.oracle.ItemResponseSupplier product,
           java.math.BigDecimal purchaseOrderLineNumber,
           JP430000.bssv.e1.oracle.ConfirmPurchaseOrderQuantity quantity) {
        this.businessUnit = businessUnit;
        this.financialDetail = financialDetail;
        this.product = product;
        this.purchaseOrderLineNumber = purchaseOrderLineNumber;
        this.quantity = quantity;
    }


    /**
     * Gets the businessUnit value for this ConfirmPurchaseOrderDetail.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this ConfirmPurchaseOrderDetail.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the financialDetail value for this ConfirmPurchaseOrderDetail.
     * 
     * @return financialDetail
     */
    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderFinancialDetail getFinancialDetail() {
        return financialDetail;
    }


    /**
     * Sets the financialDetail value for this ConfirmPurchaseOrderDetail.
     * 
     * @param financialDetail
     */
    public void setFinancialDetail(JP430000.bssv.e1.oracle.ConfirmPurchaseOrderFinancialDetail financialDetail) {
        this.financialDetail = financialDetail;
    }


    /**
     * Gets the product value for this ConfirmPurchaseOrderDetail.
     * 
     * @return product
     */
    public JP430000.bssv.e1.oracle.ItemResponseSupplier getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ConfirmPurchaseOrderDetail.
     * 
     * @param product
     */
    public void setProduct(JP430000.bssv.e1.oracle.ItemResponseSupplier product) {
        this.product = product;
    }


    /**
     * Gets the purchaseOrderLineNumber value for this ConfirmPurchaseOrderDetail.
     * 
     * @return purchaseOrderLineNumber
     */
    public java.math.BigDecimal getPurchaseOrderLineNumber() {
        return purchaseOrderLineNumber;
    }


    /**
     * Sets the purchaseOrderLineNumber value for this ConfirmPurchaseOrderDetail.
     * 
     * @param purchaseOrderLineNumber
     */
    public void setPurchaseOrderLineNumber(java.math.BigDecimal purchaseOrderLineNumber) {
        this.purchaseOrderLineNumber = purchaseOrderLineNumber;
    }


    /**
     * Gets the quantity value for this ConfirmPurchaseOrderDetail.
     * 
     * @return quantity
     */
    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderQuantity getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ConfirmPurchaseOrderDetail.
     * 
     * @param quantity
     */
    public void setQuantity(JP430000.bssv.e1.oracle.ConfirmPurchaseOrderQuantity quantity) {
        this.quantity = quantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmPurchaseOrderDetail)) return false;
        ConfirmPurchaseOrderDetail other = (ConfirmPurchaseOrderDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.financialDetail==null && other.getFinancialDetail()==null) || 
             (this.financialDetail!=null &&
              this.financialDetail.equals(other.getFinancialDetail()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.purchaseOrderLineNumber==null && other.getPurchaseOrderLineNumber()==null) || 
             (this.purchaseOrderLineNumber!=null &&
              this.purchaseOrderLineNumber.equals(other.getPurchaseOrderLineNumber()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity())));
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
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getFinancialDetail() != null) {
            _hashCode += getFinancialDetail().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getPurchaseOrderLineNumber() != null) {
            _hashCode += getPurchaseOrderLineNumber().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmPurchaseOrderDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financialDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "financialDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderFinancialDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "itemResponseSupplier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrderLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderQuantity"));
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
