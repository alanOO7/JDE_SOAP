/**
 * ConfirmSODetailV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ConfirmSODetailV3  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP420000.bssv.e1.oracle.ConfirmSODetailDates dates;

    private JP420000.bssv.e1.oracle.ConfirmSODetailDelivery delivery;

    private java.math.BigDecimal documentLineNumber;

    private JP420000.bssv.e1.oracle.ConfirmSODetailFinancialV2 financial;

    private java.lang.String opportunityId;

    private JP420000.bssv.e1.oracle.ConfirmSODetailProduct product;

    private JP420000.bssv.e1.oracle.Quantity quantity;

    private JP420000.bssv.e1.oracle.Entity shipTo;

    public ConfirmSODetailV3() {
    }

    public ConfirmSODetailV3(
           JP420000.bssv.e1.oracle.ConfirmSODetailDates dates,
           JP420000.bssv.e1.oracle.ConfirmSODetailDelivery delivery,
           java.math.BigDecimal documentLineNumber,
           JP420000.bssv.e1.oracle.ConfirmSODetailFinancialV2 financial,
           java.lang.String opportunityId,
           JP420000.bssv.e1.oracle.ConfirmSODetailProduct product,
           JP420000.bssv.e1.oracle.Quantity quantity,
           JP420000.bssv.e1.oracle.Entity shipTo) {
        this.dates = dates;
        this.delivery = delivery;
        this.documentLineNumber = documentLineNumber;
        this.financial = financial;
        this.opportunityId = opportunityId;
        this.product = product;
        this.quantity = quantity;
        this.shipTo = shipTo;
    }


    /**
     * Gets the dates value for this ConfirmSODetailV3.
     * 
     * @return dates
     */
    public JP420000.bssv.e1.oracle.ConfirmSODetailDates getDates() {
        return dates;
    }


    /**
     * Sets the dates value for this ConfirmSODetailV3.
     * 
     * @param dates
     */
    public void setDates(JP420000.bssv.e1.oracle.ConfirmSODetailDates dates) {
        this.dates = dates;
    }


    /**
     * Gets the delivery value for this ConfirmSODetailV3.
     * 
     * @return delivery
     */
    public JP420000.bssv.e1.oracle.ConfirmSODetailDelivery getDelivery() {
        return delivery;
    }


    /**
     * Sets the delivery value for this ConfirmSODetailV3.
     * 
     * @param delivery
     */
    public void setDelivery(JP420000.bssv.e1.oracle.ConfirmSODetailDelivery delivery) {
        this.delivery = delivery;
    }


    /**
     * Gets the documentLineNumber value for this ConfirmSODetailV3.
     * 
     * @return documentLineNumber
     */
    public java.math.BigDecimal getDocumentLineNumber() {
        return documentLineNumber;
    }


    /**
     * Sets the documentLineNumber value for this ConfirmSODetailV3.
     * 
     * @param documentLineNumber
     */
    public void setDocumentLineNumber(java.math.BigDecimal documentLineNumber) {
        this.documentLineNumber = documentLineNumber;
    }


    /**
     * Gets the financial value for this ConfirmSODetailV3.
     * 
     * @return financial
     */
    public JP420000.bssv.e1.oracle.ConfirmSODetailFinancialV2 getFinancial() {
        return financial;
    }


    /**
     * Sets the financial value for this ConfirmSODetailV3.
     * 
     * @param financial
     */
    public void setFinancial(JP420000.bssv.e1.oracle.ConfirmSODetailFinancialV2 financial) {
        this.financial = financial;
    }


    /**
     * Gets the opportunityId value for this ConfirmSODetailV3.
     * 
     * @return opportunityId
     */
    public java.lang.String getOpportunityId() {
        return opportunityId;
    }


    /**
     * Sets the opportunityId value for this ConfirmSODetailV3.
     * 
     * @param opportunityId
     */
    public void setOpportunityId(java.lang.String opportunityId) {
        this.opportunityId = opportunityId;
    }


    /**
     * Gets the product value for this ConfirmSODetailV3.
     * 
     * @return product
     */
    public JP420000.bssv.e1.oracle.ConfirmSODetailProduct getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ConfirmSODetailV3.
     * 
     * @param product
     */
    public void setProduct(JP420000.bssv.e1.oracle.ConfirmSODetailProduct product) {
        this.product = product;
    }


    /**
     * Gets the quantity value for this ConfirmSODetailV3.
     * 
     * @return quantity
     */
    public JP420000.bssv.e1.oracle.Quantity getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ConfirmSODetailV3.
     * 
     * @param quantity
     */
    public void setQuantity(JP420000.bssv.e1.oracle.Quantity quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the shipTo value for this ConfirmSODetailV3.
     * 
     * @return shipTo
     */
    public JP420000.bssv.e1.oracle.Entity getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this ConfirmSODetailV3.
     * 
     * @param shipTo
     */
    public void setShipTo(JP420000.bssv.e1.oracle.Entity shipTo) {
        this.shipTo = shipTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmSODetailV3)) return false;
        ConfirmSODetailV3 other = (ConfirmSODetailV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dates==null && other.getDates()==null) || 
             (this.dates!=null &&
              this.dates.equals(other.getDates()))) &&
            ((this.delivery==null && other.getDelivery()==null) || 
             (this.delivery!=null &&
              this.delivery.equals(other.getDelivery()))) &&
            ((this.documentLineNumber==null && other.getDocumentLineNumber()==null) || 
             (this.documentLineNumber!=null &&
              this.documentLineNumber.equals(other.getDocumentLineNumber()))) &&
            ((this.financial==null && other.getFinancial()==null) || 
             (this.financial!=null &&
              this.financial.equals(other.getFinancial()))) &&
            ((this.opportunityId==null && other.getOpportunityId()==null) || 
             (this.opportunityId!=null &&
              this.opportunityId.equals(other.getOpportunityId()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo())));
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
        if (getDates() != null) {
            _hashCode += getDates().hashCode();
        }
        if (getDelivery() != null) {
            _hashCode += getDelivery().hashCode();
        }
        if (getDocumentLineNumber() != null) {
            _hashCode += getDocumentLineNumber().hashCode();
        }
        if (getFinancial() != null) {
            _hashCode += getFinancial().hashCode();
        }
        if (getOpportunityId() != null) {
            _hashCode += getOpportunityId().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmSODetailV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailDates"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailDelivery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "financial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailFinancialV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opportunityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailProduct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "quantity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
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
