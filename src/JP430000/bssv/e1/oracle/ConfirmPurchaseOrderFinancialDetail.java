/**
 * ConfirmPurchaseOrderFinancialDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ConfirmPurchaseOrderFinancialDetail  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.math.BigDecimal domesticExtendedCost;

    private java.math.BigDecimal domesticPurchasingUnitCost;

    private java.math.BigDecimal foreignExtendedCost;

    private java.math.BigDecimal foreignPurchasingUnitCost;

    private java.lang.String purchasingUnitOfMeasure;

    public ConfirmPurchaseOrderFinancialDetail() {
    }

    public ConfirmPurchaseOrderFinancialDetail(
           java.math.BigDecimal domesticExtendedCost,
           java.math.BigDecimal domesticPurchasingUnitCost,
           java.math.BigDecimal foreignExtendedCost,
           java.math.BigDecimal foreignPurchasingUnitCost,
           java.lang.String purchasingUnitOfMeasure) {
        this.domesticExtendedCost = domesticExtendedCost;
        this.domesticPurchasingUnitCost = domesticPurchasingUnitCost;
        this.foreignExtendedCost = foreignExtendedCost;
        this.foreignPurchasingUnitCost = foreignPurchasingUnitCost;
        this.purchasingUnitOfMeasure = purchasingUnitOfMeasure;
    }


    /**
     * Gets the domesticExtendedCost value for this ConfirmPurchaseOrderFinancialDetail.
     * 
     * @return domesticExtendedCost
     */
    public java.math.BigDecimal getDomesticExtendedCost() {
        return domesticExtendedCost;
    }


    /**
     * Sets the domesticExtendedCost value for this ConfirmPurchaseOrderFinancialDetail.
     * 
     * @param domesticExtendedCost
     */
    public void setDomesticExtendedCost(java.math.BigDecimal domesticExtendedCost) {
        this.domesticExtendedCost = domesticExtendedCost;
    }


    /**
     * Gets the domesticPurchasingUnitCost value for this ConfirmPurchaseOrderFinancialDetail.
     * 
     * @return domesticPurchasingUnitCost
     */
    public java.math.BigDecimal getDomesticPurchasingUnitCost() {
        return domesticPurchasingUnitCost;
    }


    /**
     * Sets the domesticPurchasingUnitCost value for this ConfirmPurchaseOrderFinancialDetail.
     * 
     * @param domesticPurchasingUnitCost
     */
    public void setDomesticPurchasingUnitCost(java.math.BigDecimal domesticPurchasingUnitCost) {
        this.domesticPurchasingUnitCost = domesticPurchasingUnitCost;
    }


    /**
     * Gets the foreignExtendedCost value for this ConfirmPurchaseOrderFinancialDetail.
     * 
     * @return foreignExtendedCost
     */
    public java.math.BigDecimal getForeignExtendedCost() {
        return foreignExtendedCost;
    }


    /**
     * Sets the foreignExtendedCost value for this ConfirmPurchaseOrderFinancialDetail.
     * 
     * @param foreignExtendedCost
     */
    public void setForeignExtendedCost(java.math.BigDecimal foreignExtendedCost) {
        this.foreignExtendedCost = foreignExtendedCost;
    }


    /**
     * Gets the foreignPurchasingUnitCost value for this ConfirmPurchaseOrderFinancialDetail.
     * 
     * @return foreignPurchasingUnitCost
     */
    public java.math.BigDecimal getForeignPurchasingUnitCost() {
        return foreignPurchasingUnitCost;
    }


    /**
     * Sets the foreignPurchasingUnitCost value for this ConfirmPurchaseOrderFinancialDetail.
     * 
     * @param foreignPurchasingUnitCost
     */
    public void setForeignPurchasingUnitCost(java.math.BigDecimal foreignPurchasingUnitCost) {
        this.foreignPurchasingUnitCost = foreignPurchasingUnitCost;
    }


    /**
     * Gets the purchasingUnitOfMeasure value for this ConfirmPurchaseOrderFinancialDetail.
     * 
     * @return purchasingUnitOfMeasure
     */
    public java.lang.String getPurchasingUnitOfMeasure() {
        return purchasingUnitOfMeasure;
    }


    /**
     * Sets the purchasingUnitOfMeasure value for this ConfirmPurchaseOrderFinancialDetail.
     * 
     * @param purchasingUnitOfMeasure
     */
    public void setPurchasingUnitOfMeasure(java.lang.String purchasingUnitOfMeasure) {
        this.purchasingUnitOfMeasure = purchasingUnitOfMeasure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmPurchaseOrderFinancialDetail)) return false;
        ConfirmPurchaseOrderFinancialDetail other = (ConfirmPurchaseOrderFinancialDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.domesticExtendedCost==null && other.getDomesticExtendedCost()==null) || 
             (this.domesticExtendedCost!=null &&
              this.domesticExtendedCost.equals(other.getDomesticExtendedCost()))) &&
            ((this.domesticPurchasingUnitCost==null && other.getDomesticPurchasingUnitCost()==null) || 
             (this.domesticPurchasingUnitCost!=null &&
              this.domesticPurchasingUnitCost.equals(other.getDomesticPurchasingUnitCost()))) &&
            ((this.foreignExtendedCost==null && other.getForeignExtendedCost()==null) || 
             (this.foreignExtendedCost!=null &&
              this.foreignExtendedCost.equals(other.getForeignExtendedCost()))) &&
            ((this.foreignPurchasingUnitCost==null && other.getForeignPurchasingUnitCost()==null) || 
             (this.foreignPurchasingUnitCost!=null &&
              this.foreignPurchasingUnitCost.equals(other.getForeignPurchasingUnitCost()))) &&
            ((this.purchasingUnitOfMeasure==null && other.getPurchasingUnitOfMeasure()==null) || 
             (this.purchasingUnitOfMeasure!=null &&
              this.purchasingUnitOfMeasure.equals(other.getPurchasingUnitOfMeasure())));
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
        if (getDomesticExtendedCost() != null) {
            _hashCode += getDomesticExtendedCost().hashCode();
        }
        if (getDomesticPurchasingUnitCost() != null) {
            _hashCode += getDomesticPurchasingUnitCost().hashCode();
        }
        if (getForeignExtendedCost() != null) {
            _hashCode += getForeignExtendedCost().hashCode();
        }
        if (getForeignPurchasingUnitCost() != null) {
            _hashCode += getForeignPurchasingUnitCost().hashCode();
        }
        if (getPurchasingUnitOfMeasure() != null) {
            _hashCode += getPurchasingUnitOfMeasure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmPurchaseOrderFinancialDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderFinancialDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domesticExtendedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domesticExtendedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domesticPurchasingUnitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domesticPurchasingUnitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignExtendedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignExtendedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignPurchasingUnitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foreignPurchasingUnitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasingUnitOfMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchasingUnitOfMeasure"));
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
