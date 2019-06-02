/**
 * ConfirmSOHeaderV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ConfirmSOHeaderV3  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String actionType;

    private java.math.BigDecimal amountTotalOrderDomestic;

    private java.math.BigDecimal amountTotalOrderForeign;

    private java.lang.String attachmentText;

    private java.lang.String businessUnit;

    private java.lang.String customerPO;

    private JP420000.bssv.e1.oracle.ConfirmSOHeaderDates dates;

    private JP420000.bssv.e1.oracle.ConfirmSOHeaderDelivery delivery;

    private JP420000.bssv.e1.oracle.ConfirmSODetailV3[] detail;

    private JP420000.bssv.e1.oracle.ConfirmSOHeaderFinancial financial;

    private java.lang.String holdOrderCode;

    private java.lang.String opportunityId;

    private JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey;

    private JP420000.bssv.e1.oracle.ProcessSOCustomer shipTo;

    private java.lang.Boolean useTaxedPrices;

    public ConfirmSOHeaderV3() {
    }

    public ConfirmSOHeaderV3(
           java.lang.String actionType,
           java.math.BigDecimal amountTotalOrderDomestic,
           java.math.BigDecimal amountTotalOrderForeign,
           java.lang.String attachmentText,
           java.lang.String businessUnit,
           java.lang.String customerPO,
           JP420000.bssv.e1.oracle.ConfirmSOHeaderDates dates,
           JP420000.bssv.e1.oracle.ConfirmSOHeaderDelivery delivery,
           JP420000.bssv.e1.oracle.ConfirmSODetailV3[] detail,
           JP420000.bssv.e1.oracle.ConfirmSOHeaderFinancial financial,
           java.lang.String holdOrderCode,
           java.lang.String opportunityId,
           JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey,
           JP420000.bssv.e1.oracle.ProcessSOCustomer shipTo,
           java.lang.Boolean useTaxedPrices) {
        this.actionType = actionType;
        this.amountTotalOrderDomestic = amountTotalOrderDomestic;
        this.amountTotalOrderForeign = amountTotalOrderForeign;
        this.attachmentText = attachmentText;
        this.businessUnit = businessUnit;
        this.customerPO = customerPO;
        this.dates = dates;
        this.delivery = delivery;
        this.detail = detail;
        this.financial = financial;
        this.holdOrderCode = holdOrderCode;
        this.opportunityId = opportunityId;
        this.salesOrderKey = salesOrderKey;
        this.shipTo = shipTo;
        this.useTaxedPrices = useTaxedPrices;
    }


    /**
     * Gets the actionType value for this ConfirmSOHeaderV3.
     * 
     * @return actionType
     */
    public java.lang.String getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this ConfirmSOHeaderV3.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.String actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the amountTotalOrderDomestic value for this ConfirmSOHeaderV3.
     * 
     * @return amountTotalOrderDomestic
     */
    public java.math.BigDecimal getAmountTotalOrderDomestic() {
        return amountTotalOrderDomestic;
    }


    /**
     * Sets the amountTotalOrderDomestic value for this ConfirmSOHeaderV3.
     * 
     * @param amountTotalOrderDomestic
     */
    public void setAmountTotalOrderDomestic(java.math.BigDecimal amountTotalOrderDomestic) {
        this.amountTotalOrderDomestic = amountTotalOrderDomestic;
    }


    /**
     * Gets the amountTotalOrderForeign value for this ConfirmSOHeaderV3.
     * 
     * @return amountTotalOrderForeign
     */
    public java.math.BigDecimal getAmountTotalOrderForeign() {
        return amountTotalOrderForeign;
    }


    /**
     * Sets the amountTotalOrderForeign value for this ConfirmSOHeaderV3.
     * 
     * @param amountTotalOrderForeign
     */
    public void setAmountTotalOrderForeign(java.math.BigDecimal amountTotalOrderForeign) {
        this.amountTotalOrderForeign = amountTotalOrderForeign;
    }


    /**
     * Gets the attachmentText value for this ConfirmSOHeaderV3.
     * 
     * @return attachmentText
     */
    public java.lang.String getAttachmentText() {
        return attachmentText;
    }


    /**
     * Sets the attachmentText value for this ConfirmSOHeaderV3.
     * 
     * @param attachmentText
     */
    public void setAttachmentText(java.lang.String attachmentText) {
        this.attachmentText = attachmentText;
    }


    /**
     * Gets the businessUnit value for this ConfirmSOHeaderV3.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this ConfirmSOHeaderV3.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the customerPO value for this ConfirmSOHeaderV3.
     * 
     * @return customerPO
     */
    public java.lang.String getCustomerPO() {
        return customerPO;
    }


    /**
     * Sets the customerPO value for this ConfirmSOHeaderV3.
     * 
     * @param customerPO
     */
    public void setCustomerPO(java.lang.String customerPO) {
        this.customerPO = customerPO;
    }


    /**
     * Gets the dates value for this ConfirmSOHeaderV3.
     * 
     * @return dates
     */
    public JP420000.bssv.e1.oracle.ConfirmSOHeaderDates getDates() {
        return dates;
    }


    /**
     * Sets the dates value for this ConfirmSOHeaderV3.
     * 
     * @param dates
     */
    public void setDates(JP420000.bssv.e1.oracle.ConfirmSOHeaderDates dates) {
        this.dates = dates;
    }


    /**
     * Gets the delivery value for this ConfirmSOHeaderV3.
     * 
     * @return delivery
     */
    public JP420000.bssv.e1.oracle.ConfirmSOHeaderDelivery getDelivery() {
        return delivery;
    }


    /**
     * Sets the delivery value for this ConfirmSOHeaderV3.
     * 
     * @param delivery
     */
    public void setDelivery(JP420000.bssv.e1.oracle.ConfirmSOHeaderDelivery delivery) {
        this.delivery = delivery;
    }


    /**
     * Gets the detail value for this ConfirmSOHeaderV3.
     * 
     * @return detail
     */
    public JP420000.bssv.e1.oracle.ConfirmSODetailV3[] getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this ConfirmSOHeaderV3.
     * 
     * @param detail
     */
    public void setDetail(JP420000.bssv.e1.oracle.ConfirmSODetailV3[] detail) {
        this.detail = detail;
    }

    public JP420000.bssv.e1.oracle.ConfirmSODetailV3 getDetail(int i) {
        return this.detail[i];
    }

    public void setDetail(int i, JP420000.bssv.e1.oracle.ConfirmSODetailV3 _value) {
        this.detail[i] = _value;
    }


    /**
     * Gets the financial value for this ConfirmSOHeaderV3.
     * 
     * @return financial
     */
    public JP420000.bssv.e1.oracle.ConfirmSOHeaderFinancial getFinancial() {
        return financial;
    }


    /**
     * Sets the financial value for this ConfirmSOHeaderV3.
     * 
     * @param financial
     */
    public void setFinancial(JP420000.bssv.e1.oracle.ConfirmSOHeaderFinancial financial) {
        this.financial = financial;
    }


    /**
     * Gets the holdOrderCode value for this ConfirmSOHeaderV3.
     * 
     * @return holdOrderCode
     */
    public java.lang.String getHoldOrderCode() {
        return holdOrderCode;
    }


    /**
     * Sets the holdOrderCode value for this ConfirmSOHeaderV3.
     * 
     * @param holdOrderCode
     */
    public void setHoldOrderCode(java.lang.String holdOrderCode) {
        this.holdOrderCode = holdOrderCode;
    }


    /**
     * Gets the opportunityId value for this ConfirmSOHeaderV3.
     * 
     * @return opportunityId
     */
    public java.lang.String getOpportunityId() {
        return opportunityId;
    }


    /**
     * Sets the opportunityId value for this ConfirmSOHeaderV3.
     * 
     * @param opportunityId
     */
    public void setOpportunityId(java.lang.String opportunityId) {
        this.opportunityId = opportunityId;
    }


    /**
     * Gets the salesOrderKey value for this ConfirmSOHeaderV3.
     * 
     * @return salesOrderKey
     */
    public JP420000.bssv.e1.oracle.SalesOrderKey getSalesOrderKey() {
        return salesOrderKey;
    }


    /**
     * Sets the salesOrderKey value for this ConfirmSOHeaderV3.
     * 
     * @param salesOrderKey
     */
    public void setSalesOrderKey(JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey) {
        this.salesOrderKey = salesOrderKey;
    }


    /**
     * Gets the shipTo value for this ConfirmSOHeaderV3.
     * 
     * @return shipTo
     */
    public JP420000.bssv.e1.oracle.ProcessSOCustomer getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this ConfirmSOHeaderV3.
     * 
     * @param shipTo
     */
    public void setShipTo(JP420000.bssv.e1.oracle.ProcessSOCustomer shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the useTaxedPrices value for this ConfirmSOHeaderV3.
     * 
     * @return useTaxedPrices
     */
    public java.lang.Boolean getUseTaxedPrices() {
        return useTaxedPrices;
    }


    /**
     * Sets the useTaxedPrices value for this ConfirmSOHeaderV3.
     * 
     * @param useTaxedPrices
     */
    public void setUseTaxedPrices(java.lang.Boolean useTaxedPrices) {
        this.useTaxedPrices = useTaxedPrices;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmSOHeaderV3)) return false;
        ConfirmSOHeaderV3 other = (ConfirmSOHeaderV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            ((this.amountTotalOrderDomestic==null && other.getAmountTotalOrderDomestic()==null) || 
             (this.amountTotalOrderDomestic!=null &&
              this.amountTotalOrderDomestic.equals(other.getAmountTotalOrderDomestic()))) &&
            ((this.amountTotalOrderForeign==null && other.getAmountTotalOrderForeign()==null) || 
             (this.amountTotalOrderForeign!=null &&
              this.amountTotalOrderForeign.equals(other.getAmountTotalOrderForeign()))) &&
            ((this.attachmentText==null && other.getAttachmentText()==null) || 
             (this.attachmentText!=null &&
              this.attachmentText.equals(other.getAttachmentText()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.customerPO==null && other.getCustomerPO()==null) || 
             (this.customerPO!=null &&
              this.customerPO.equals(other.getCustomerPO()))) &&
            ((this.dates==null && other.getDates()==null) || 
             (this.dates!=null &&
              this.dates.equals(other.getDates()))) &&
            ((this.delivery==null && other.getDelivery()==null) || 
             (this.delivery!=null &&
              this.delivery.equals(other.getDelivery()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              java.util.Arrays.equals(this.detail, other.getDetail()))) &&
            ((this.financial==null && other.getFinancial()==null) || 
             (this.financial!=null &&
              this.financial.equals(other.getFinancial()))) &&
            ((this.holdOrderCode==null && other.getHoldOrderCode()==null) || 
             (this.holdOrderCode!=null &&
              this.holdOrderCode.equals(other.getHoldOrderCode()))) &&
            ((this.opportunityId==null && other.getOpportunityId()==null) || 
             (this.opportunityId!=null &&
              this.opportunityId.equals(other.getOpportunityId()))) &&
            ((this.salesOrderKey==null && other.getSalesOrderKey()==null) || 
             (this.salesOrderKey!=null &&
              this.salesOrderKey.equals(other.getSalesOrderKey()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.useTaxedPrices==null && other.getUseTaxedPrices()==null) || 
             (this.useTaxedPrices!=null &&
              this.useTaxedPrices.equals(other.getUseTaxedPrices())));
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
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        if (getAmountTotalOrderDomestic() != null) {
            _hashCode += getAmountTotalOrderDomestic().hashCode();
        }
        if (getAmountTotalOrderForeign() != null) {
            _hashCode += getAmountTotalOrderForeign().hashCode();
        }
        if (getAttachmentText() != null) {
            _hashCode += getAttachmentText().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCustomerPO() != null) {
            _hashCode += getCustomerPO().hashCode();
        }
        if (getDates() != null) {
            _hashCode += getDates().hashCode();
        }
        if (getDelivery() != null) {
            _hashCode += getDelivery().hashCode();
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
        if (getHoldOrderCode() != null) {
            _hashCode += getHoldOrderCode().hashCode();
        }
        if (getOpportunityId() != null) {
            _hashCode += getOpportunityId().hashCode();
        }
        if (getSalesOrderKey() != null) {
            _hashCode += getSalesOrderKey().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getUseTaxedPrices() != null) {
            _hashCode += getUseTaxedPrices().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmSOHeaderV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSOHeaderV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountTotalOrderDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountTotalOrderDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountTotalOrderForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountTotalOrderForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentText"));
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
        elemField.setFieldName("customerPO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSOHeaderDates"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSOHeaderDelivery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailV3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "financial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSOHeaderFinancial"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdOrderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdOrderCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("salesOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salesOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "salesOrderKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useTaxedPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useTaxedPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
