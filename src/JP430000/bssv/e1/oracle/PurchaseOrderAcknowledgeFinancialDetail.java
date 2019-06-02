/**
 * PurchaseOrderAcknowledgeFinancialDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderAcknowledgeFinancialDetail  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.math.BigDecimal costExtended;

    private java.math.BigDecimal costUnit;

    private java.lang.String unitOfMeasureCodePurchasing;

    public PurchaseOrderAcknowledgeFinancialDetail() {
    }

    public PurchaseOrderAcknowledgeFinancialDetail(
           java.math.BigDecimal costExtended,
           java.math.BigDecimal costUnit,
           java.lang.String unitOfMeasureCodePurchasing) {
        this.costExtended = costExtended;
        this.costUnit = costUnit;
        this.unitOfMeasureCodePurchasing = unitOfMeasureCodePurchasing;
    }


    /**
     * Gets the costExtended value for this PurchaseOrderAcknowledgeFinancialDetail.
     * 
     * @return costExtended
     */
    public java.math.BigDecimal getCostExtended() {
        return costExtended;
    }


    /**
     * Sets the costExtended value for this PurchaseOrderAcknowledgeFinancialDetail.
     * 
     * @param costExtended
     */
    public void setCostExtended(java.math.BigDecimal costExtended) {
        this.costExtended = costExtended;
    }


    /**
     * Gets the costUnit value for this PurchaseOrderAcknowledgeFinancialDetail.
     * 
     * @return costUnit
     */
    public java.math.BigDecimal getCostUnit() {
        return costUnit;
    }


    /**
     * Sets the costUnit value for this PurchaseOrderAcknowledgeFinancialDetail.
     * 
     * @param costUnit
     */
    public void setCostUnit(java.math.BigDecimal costUnit) {
        this.costUnit = costUnit;
    }


    /**
     * Gets the unitOfMeasureCodePurchasing value for this PurchaseOrderAcknowledgeFinancialDetail.
     * 
     * @return unitOfMeasureCodePurchasing
     */
    public java.lang.String getUnitOfMeasureCodePurchasing() {
        return unitOfMeasureCodePurchasing;
    }


    /**
     * Sets the unitOfMeasureCodePurchasing value for this PurchaseOrderAcknowledgeFinancialDetail.
     * 
     * @param unitOfMeasureCodePurchasing
     */
    public void setUnitOfMeasureCodePurchasing(java.lang.String unitOfMeasureCodePurchasing) {
        this.unitOfMeasureCodePurchasing = unitOfMeasureCodePurchasing;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderAcknowledgeFinancialDetail)) return false;
        PurchaseOrderAcknowledgeFinancialDetail other = (PurchaseOrderAcknowledgeFinancialDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.costExtended==null && other.getCostExtended()==null) || 
             (this.costExtended!=null &&
              this.costExtended.equals(other.getCostExtended()))) &&
            ((this.costUnit==null && other.getCostUnit()==null) || 
             (this.costUnit!=null &&
              this.costUnit.equals(other.getCostUnit()))) &&
            ((this.unitOfMeasureCodePurchasing==null && other.getUnitOfMeasureCodePurchasing()==null) || 
             (this.unitOfMeasureCodePurchasing!=null &&
              this.unitOfMeasureCodePurchasing.equals(other.getUnitOfMeasureCodePurchasing())));
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
        if (getCostExtended() != null) {
            _hashCode += getCostExtended().hashCode();
        }
        if (getCostUnit() != null) {
            _hashCode += getCostUnit().hashCode();
        }
        if (getUnitOfMeasureCodePurchasing() != null) {
            _hashCode += getUnitOfMeasureCodePurchasing().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderAcknowledgeFinancialDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeFinancialDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costExtended");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costExtended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodePurchasing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodePurchasing"));
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
