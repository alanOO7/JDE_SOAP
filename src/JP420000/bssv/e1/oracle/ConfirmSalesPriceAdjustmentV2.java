/**
 * ConfirmSalesPriceAdjustmentV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ConfirmSalesPriceAdjustmentV2  extends JP420000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private java.lang.String adjustmentTypeCode;

    private java.lang.String costTypeCode;

    private JP420000.bssv.e1.oracle.Entity customer;

    private java.lang.String customerGLN;

    private JP420000.bssv.e1.oracle.Financial financial;

    private JP420000.bssv.e1.oracle.ItemGroupCustomer item;

    private java.lang.Integer priceAdjustmentId;

    private JP420000.bssv.e1.oracle.Processing processing;

    private java.lang.String unitOfMeasureTransaction;

    public ConfirmSalesPriceAdjustmentV2() {
    }

    public ConfirmSalesPriceAdjustmentV2(
           JP420000.bssv.e1.oracle.E1Message[] e1MessageList,
           java.lang.String adjustmentTypeCode,
           java.lang.String costTypeCode,
           JP420000.bssv.e1.oracle.Entity customer,
           java.lang.String customerGLN,
           JP420000.bssv.e1.oracle.Financial financial,
           JP420000.bssv.e1.oracle.ItemGroupCustomer item,
           java.lang.Integer priceAdjustmentId,
           JP420000.bssv.e1.oracle.Processing processing,
           java.lang.String unitOfMeasureTransaction) {
        super(
            e1MessageList);
        this.adjustmentTypeCode = adjustmentTypeCode;
        this.costTypeCode = costTypeCode;
        this.customer = customer;
        this.customerGLN = customerGLN;
        this.financial = financial;
        this.item = item;
        this.priceAdjustmentId = priceAdjustmentId;
        this.processing = processing;
        this.unitOfMeasureTransaction = unitOfMeasureTransaction;
    }


    /**
     * Gets the adjustmentTypeCode value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @return adjustmentTypeCode
     */
    public java.lang.String getAdjustmentTypeCode() {
        return adjustmentTypeCode;
    }


    /**
     * Sets the adjustmentTypeCode value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @param adjustmentTypeCode
     */
    public void setAdjustmentTypeCode(java.lang.String adjustmentTypeCode) {
        this.adjustmentTypeCode = adjustmentTypeCode;
    }


    /**
     * Gets the costTypeCode value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @return costTypeCode
     */
    public java.lang.String getCostTypeCode() {
        return costTypeCode;
    }


    /**
     * Sets the costTypeCode value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @param costTypeCode
     */
    public void setCostTypeCode(java.lang.String costTypeCode) {
        this.costTypeCode = costTypeCode;
    }


    /**
     * Gets the customer value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @return customer
     */
    public JP420000.bssv.e1.oracle.Entity getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @param customer
     */
    public void setCustomer(JP420000.bssv.e1.oracle.Entity customer) {
        this.customer = customer;
    }


    /**
     * Gets the customerGLN value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @return customerGLN
     */
    public java.lang.String getCustomerGLN() {
        return customerGLN;
    }


    /**
     * Sets the customerGLN value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @param customerGLN
     */
    public void setCustomerGLN(java.lang.String customerGLN) {
        this.customerGLN = customerGLN;
    }


    /**
     * Gets the financial value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @return financial
     */
    public JP420000.bssv.e1.oracle.Financial getFinancial() {
        return financial;
    }


    /**
     * Sets the financial value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @param financial
     */
    public void setFinancial(JP420000.bssv.e1.oracle.Financial financial) {
        this.financial = financial;
    }


    /**
     * Gets the item value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @return item
     */
    public JP420000.bssv.e1.oracle.ItemGroupCustomer getItem() {
        return item;
    }


    /**
     * Sets the item value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @param item
     */
    public void setItem(JP420000.bssv.e1.oracle.ItemGroupCustomer item) {
        this.item = item;
    }


    /**
     * Gets the priceAdjustmentId value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @return priceAdjustmentId
     */
    public java.lang.Integer getPriceAdjustmentId() {
        return priceAdjustmentId;
    }


    /**
     * Sets the priceAdjustmentId value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @param priceAdjustmentId
     */
    public void setPriceAdjustmentId(java.lang.Integer priceAdjustmentId) {
        this.priceAdjustmentId = priceAdjustmentId;
    }


    /**
     * Gets the processing value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @return processing
     */
    public JP420000.bssv.e1.oracle.Processing getProcessing() {
        return processing;
    }


    /**
     * Sets the processing value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @param processing
     */
    public void setProcessing(JP420000.bssv.e1.oracle.Processing processing) {
        this.processing = processing;
    }


    /**
     * Gets the unitOfMeasureTransaction value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @return unitOfMeasureTransaction
     */
    public java.lang.String getUnitOfMeasureTransaction() {
        return unitOfMeasureTransaction;
    }


    /**
     * Sets the unitOfMeasureTransaction value for this ConfirmSalesPriceAdjustmentV2.
     * 
     * @param unitOfMeasureTransaction
     */
    public void setUnitOfMeasureTransaction(java.lang.String unitOfMeasureTransaction) {
        this.unitOfMeasureTransaction = unitOfMeasureTransaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmSalesPriceAdjustmentV2)) return false;
        ConfirmSalesPriceAdjustmentV2 other = (ConfirmSalesPriceAdjustmentV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adjustmentTypeCode==null && other.getAdjustmentTypeCode()==null) || 
             (this.adjustmentTypeCode!=null &&
              this.adjustmentTypeCode.equals(other.getAdjustmentTypeCode()))) &&
            ((this.costTypeCode==null && other.getCostTypeCode()==null) || 
             (this.costTypeCode!=null &&
              this.costTypeCode.equals(other.getCostTypeCode()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.customerGLN==null && other.getCustomerGLN()==null) || 
             (this.customerGLN!=null &&
              this.customerGLN.equals(other.getCustomerGLN()))) &&
            ((this.financial==null && other.getFinancial()==null) || 
             (this.financial!=null &&
              this.financial.equals(other.getFinancial()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.priceAdjustmentId==null && other.getPriceAdjustmentId()==null) || 
             (this.priceAdjustmentId!=null &&
              this.priceAdjustmentId.equals(other.getPriceAdjustmentId()))) &&
            ((this.processing==null && other.getProcessing()==null) || 
             (this.processing!=null &&
              this.processing.equals(other.getProcessing()))) &&
            ((this.unitOfMeasureTransaction==null && other.getUnitOfMeasureTransaction()==null) || 
             (this.unitOfMeasureTransaction!=null &&
              this.unitOfMeasureTransaction.equals(other.getUnitOfMeasureTransaction())));
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
        if (getAdjustmentTypeCode() != null) {
            _hashCode += getAdjustmentTypeCode().hashCode();
        }
        if (getCostTypeCode() != null) {
            _hashCode += getCostTypeCode().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getCustomerGLN() != null) {
            _hashCode += getCustomerGLN().hashCode();
        }
        if (getFinancial() != null) {
            _hashCode += getFinancial().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getPriceAdjustmentId() != null) {
            _hashCode += getPriceAdjustmentId().hashCode();
        }
        if (getProcessing() != null) {
            _hashCode += getProcessing().hashCode();
        }
        if (getUnitOfMeasureTransaction() != null) {
            _hashCode += getUnitOfMeasureTransaction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmSalesPriceAdjustmentV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesPriceAdjustmentV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerGLN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "financial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "financial"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "itemGroupCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceAdjustmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceAdjustmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureTransaction"));
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
