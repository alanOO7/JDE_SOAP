/**
 * PurchaseOrderAcknowledgeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderAcknowledgeDetail  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String branchPlant;

    private JP430000.bssv.e1.oracle.Entity carrier;

    private JP430000.bssv.e1.oracle.Dates dates;

    private JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeFinancialDetail financialDetail;

    private JP430000.bssv.e1.oracle.ItemGroupSupplier item;

    private java.lang.String landedCostRuleCode;

    private JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey;

    private java.math.BigDecimal quantityShippable;

    private java.lang.String reference1;

    private java.lang.String reference2;

    private java.lang.String statusOrderCode;

    private JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeTaxDetail taxDetail;

    private java.lang.String unitOfMeasureCodeTransaction;

    private JP430000.bssv.e1.oracle.UserReservedData userReservedData;

    public PurchaseOrderAcknowledgeDetail() {
    }

    public PurchaseOrderAcknowledgeDetail(
           java.lang.String branchPlant,
           JP430000.bssv.e1.oracle.Entity carrier,
           JP430000.bssv.e1.oracle.Dates dates,
           JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeFinancialDetail financialDetail,
           JP430000.bssv.e1.oracle.ItemGroupSupplier item,
           java.lang.String landedCostRuleCode,
           JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey,
           java.math.BigDecimal quantityShippable,
           java.lang.String reference1,
           java.lang.String reference2,
           java.lang.String statusOrderCode,
           JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeTaxDetail taxDetail,
           java.lang.String unitOfMeasureCodeTransaction,
           JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.branchPlant = branchPlant;
        this.carrier = carrier;
        this.dates = dates;
        this.financialDetail = financialDetail;
        this.item = item;
        this.landedCostRuleCode = landedCostRuleCode;
        this.purchaseOrderLineKey = purchaseOrderLineKey;
        this.quantityShippable = quantityShippable;
        this.reference1 = reference1;
        this.reference2 = reference2;
        this.statusOrderCode = statusOrderCode;
        this.taxDetail = taxDetail;
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the branchPlant value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return branchPlant
     */
    public java.lang.String getBranchPlant() {
        return branchPlant;
    }


    /**
     * Sets the branchPlant value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param branchPlant
     */
    public void setBranchPlant(java.lang.String branchPlant) {
        this.branchPlant = branchPlant;
    }


    /**
     * Gets the carrier value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return carrier
     */
    public JP430000.bssv.e1.oracle.Entity getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param carrier
     */
    public void setCarrier(JP430000.bssv.e1.oracle.Entity carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the dates value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return dates
     */
    public JP430000.bssv.e1.oracle.Dates getDates() {
        return dates;
    }


    /**
     * Sets the dates value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param dates
     */
    public void setDates(JP430000.bssv.e1.oracle.Dates dates) {
        this.dates = dates;
    }


    /**
     * Gets the financialDetail value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return financialDetail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeFinancialDetail getFinancialDetail() {
        return financialDetail;
    }


    /**
     * Sets the financialDetail value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param financialDetail
     */
    public void setFinancialDetail(JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeFinancialDetail financialDetail) {
        this.financialDetail = financialDetail;
    }


    /**
     * Gets the item value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return item
     */
    public JP430000.bssv.e1.oracle.ItemGroupSupplier getItem() {
        return item;
    }


    /**
     * Sets the item value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param item
     */
    public void setItem(JP430000.bssv.e1.oracle.ItemGroupSupplier item) {
        this.item = item;
    }


    /**
     * Gets the landedCostRuleCode value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return landedCostRuleCode
     */
    public java.lang.String getLandedCostRuleCode() {
        return landedCostRuleCode;
    }


    /**
     * Sets the landedCostRuleCode value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param landedCostRuleCode
     */
    public void setLandedCostRuleCode(java.lang.String landedCostRuleCode) {
        this.landedCostRuleCode = landedCostRuleCode;
    }


    /**
     * Gets the purchaseOrderLineKey value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return purchaseOrderLineKey
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderLineKey getPurchaseOrderLineKey() {
        return purchaseOrderLineKey;
    }


    /**
     * Sets the purchaseOrderLineKey value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param purchaseOrderLineKey
     */
    public void setPurchaseOrderLineKey(JP430000.bssv.e1.oracle.PurchaseOrderLineKey purchaseOrderLineKey) {
        this.purchaseOrderLineKey = purchaseOrderLineKey;
    }


    /**
     * Gets the quantityShippable value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return quantityShippable
     */
    public java.math.BigDecimal getQuantityShippable() {
        return quantityShippable;
    }


    /**
     * Sets the quantityShippable value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param quantityShippable
     */
    public void setQuantityShippable(java.math.BigDecimal quantityShippable) {
        this.quantityShippable = quantityShippable;
    }


    /**
     * Gets the reference1 value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return reference1
     */
    public java.lang.String getReference1() {
        return reference1;
    }


    /**
     * Sets the reference1 value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param reference1
     */
    public void setReference1(java.lang.String reference1) {
        this.reference1 = reference1;
    }


    /**
     * Gets the reference2 value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return reference2
     */
    public java.lang.String getReference2() {
        return reference2;
    }


    /**
     * Sets the reference2 value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param reference2
     */
    public void setReference2(java.lang.String reference2) {
        this.reference2 = reference2;
    }


    /**
     * Gets the statusOrderCode value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return statusOrderCode
     */
    public java.lang.String getStatusOrderCode() {
        return statusOrderCode;
    }


    /**
     * Sets the statusOrderCode value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param statusOrderCode
     */
    public void setStatusOrderCode(java.lang.String statusOrderCode) {
        this.statusOrderCode = statusOrderCode;
    }


    /**
     * Gets the taxDetail value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return taxDetail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeTaxDetail getTaxDetail() {
        return taxDetail;
    }


    /**
     * Sets the taxDetail value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param taxDetail
     */
    public void setTaxDetail(JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeTaxDetail taxDetail) {
        this.taxDetail = taxDetail;
    }


    /**
     * Gets the unitOfMeasureCodeTransaction value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return unitOfMeasureCodeTransaction
     */
    public java.lang.String getUnitOfMeasureCodeTransaction() {
        return unitOfMeasureCodeTransaction;
    }


    /**
     * Sets the unitOfMeasureCodeTransaction value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param unitOfMeasureCodeTransaction
     */
    public void setUnitOfMeasureCodeTransaction(java.lang.String unitOfMeasureCodeTransaction) {
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }


    /**
     * Gets the userReservedData value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @return userReservedData
     */
    public JP430000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this PurchaseOrderAcknowledgeDetail.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderAcknowledgeDetail)) return false;
        PurchaseOrderAcknowledgeDetail other = (PurchaseOrderAcknowledgeDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.branchPlant==null && other.getBranchPlant()==null) || 
             (this.branchPlant!=null &&
              this.branchPlant.equals(other.getBranchPlant()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.dates==null && other.getDates()==null) || 
             (this.dates!=null &&
              this.dates.equals(other.getDates()))) &&
            ((this.financialDetail==null && other.getFinancialDetail()==null) || 
             (this.financialDetail!=null &&
              this.financialDetail.equals(other.getFinancialDetail()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.landedCostRuleCode==null && other.getLandedCostRuleCode()==null) || 
             (this.landedCostRuleCode!=null &&
              this.landedCostRuleCode.equals(other.getLandedCostRuleCode()))) &&
            ((this.purchaseOrderLineKey==null && other.getPurchaseOrderLineKey()==null) || 
             (this.purchaseOrderLineKey!=null &&
              this.purchaseOrderLineKey.equals(other.getPurchaseOrderLineKey()))) &&
            ((this.quantityShippable==null && other.getQuantityShippable()==null) || 
             (this.quantityShippable!=null &&
              this.quantityShippable.equals(other.getQuantityShippable()))) &&
            ((this.reference1==null && other.getReference1()==null) || 
             (this.reference1!=null &&
              this.reference1.equals(other.getReference1()))) &&
            ((this.reference2==null && other.getReference2()==null) || 
             (this.reference2!=null &&
              this.reference2.equals(other.getReference2()))) &&
            ((this.statusOrderCode==null && other.getStatusOrderCode()==null) || 
             (this.statusOrderCode!=null &&
              this.statusOrderCode.equals(other.getStatusOrderCode()))) &&
            ((this.taxDetail==null && other.getTaxDetail()==null) || 
             (this.taxDetail!=null &&
              this.taxDetail.equals(other.getTaxDetail()))) &&
            ((this.unitOfMeasureCodeTransaction==null && other.getUnitOfMeasureCodeTransaction()==null) || 
             (this.unitOfMeasureCodeTransaction!=null &&
              this.unitOfMeasureCodeTransaction.equals(other.getUnitOfMeasureCodeTransaction()))) &&
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
        if (getBranchPlant() != null) {
            _hashCode += getBranchPlant().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getDates() != null) {
            _hashCode += getDates().hashCode();
        }
        if (getFinancialDetail() != null) {
            _hashCode += getFinancialDetail().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLandedCostRuleCode() != null) {
            _hashCode += getLandedCostRuleCode().hashCode();
        }
        if (getPurchaseOrderLineKey() != null) {
            _hashCode += getPurchaseOrderLineKey().hashCode();
        }
        if (getQuantityShippable() != null) {
            _hashCode += getQuantityShippable().hashCode();
        }
        if (getReference1() != null) {
            _hashCode += getReference1().hashCode();
        }
        if (getReference2() != null) {
            _hashCode += getReference2().hashCode();
        }
        if (getStatusOrderCode() != null) {
            _hashCode += getStatusOrderCode().hashCode();
        }
        if (getTaxDetail() != null) {
            _hashCode += getTaxDetail().hashCode();
        }
        if (getUnitOfMeasureCodeTransaction() != null) {
            _hashCode += getUnitOfMeasureCodeTransaction().hashCode();
        }
        if (getUserReservedData() != null) {
            _hashCode += getUserReservedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderAcknowledgeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchPlant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchPlant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "dates"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financialDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "financialDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeFinancialDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "itemGroupSupplier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostRuleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "landedCostRuleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderLineKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrderLineKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderLineKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityShippable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityShippable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("taxDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeTaxDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodeTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodeTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
