/**
 * ProcessSOHeaderBilling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ProcessSOHeaderBilling  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String adjustmentScheduleCode;

    private JP420000.bssv.e1.oracle.Entity carrier;

    private java.lang.String checkNumber;

    private java.lang.String creditCardAccountName;

    private java.lang.String creditCardAccountNumber;

    private java.lang.String creditCardTypeCode;

    private java.lang.String customerPriceGroupCode;

    private java.util.Calendar dateExpiration;

    private java.lang.String deliveryInstruction1;

    private java.lang.String deliveryInstruction2;

    private java.lang.String freightHandlingCode;

    private java.lang.String paymentInstrumentCode;

    private java.lang.String paymentTermsCode;

    private java.math.BigDecimal percentDiscountTrade;

    private java.lang.String printMessageCode;

    private java.lang.String taxExplanationCode;

    private java.lang.String taxRateAreaCode;

    public ProcessSOHeaderBilling() {
    }

    public ProcessSOHeaderBilling(
           java.lang.String adjustmentScheduleCode,
           JP420000.bssv.e1.oracle.Entity carrier,
           java.lang.String checkNumber,
           java.lang.String creditCardAccountName,
           java.lang.String creditCardAccountNumber,
           java.lang.String creditCardTypeCode,
           java.lang.String customerPriceGroupCode,
           java.util.Calendar dateExpiration,
           java.lang.String deliveryInstruction1,
           java.lang.String deliveryInstruction2,
           java.lang.String freightHandlingCode,
           java.lang.String paymentInstrumentCode,
           java.lang.String paymentTermsCode,
           java.math.BigDecimal percentDiscountTrade,
           java.lang.String printMessageCode,
           java.lang.String taxExplanationCode,
           java.lang.String taxRateAreaCode) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
        this.carrier = carrier;
        this.checkNumber = checkNumber;
        this.creditCardAccountName = creditCardAccountName;
        this.creditCardAccountNumber = creditCardAccountNumber;
        this.creditCardTypeCode = creditCardTypeCode;
        this.customerPriceGroupCode = customerPriceGroupCode;
        this.dateExpiration = dateExpiration;
        this.deliveryInstruction1 = deliveryInstruction1;
        this.deliveryInstruction2 = deliveryInstruction2;
        this.freightHandlingCode = freightHandlingCode;
        this.paymentInstrumentCode = paymentInstrumentCode;
        this.paymentTermsCode = paymentTermsCode;
        this.percentDiscountTrade = percentDiscountTrade;
        this.printMessageCode = printMessageCode;
        this.taxExplanationCode = taxExplanationCode;
        this.taxRateAreaCode = taxRateAreaCode;
    }


    /**
     * Gets the adjustmentScheduleCode value for this ProcessSOHeaderBilling.
     * 
     * @return adjustmentScheduleCode
     */
    public java.lang.String getAdjustmentScheduleCode() {
        return adjustmentScheduleCode;
    }


    /**
     * Sets the adjustmentScheduleCode value for this ProcessSOHeaderBilling.
     * 
     * @param adjustmentScheduleCode
     */
    public void setAdjustmentScheduleCode(java.lang.String adjustmentScheduleCode) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
    }


    /**
     * Gets the carrier value for this ProcessSOHeaderBilling.
     * 
     * @return carrier
     */
    public JP420000.bssv.e1.oracle.Entity getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this ProcessSOHeaderBilling.
     * 
     * @param carrier
     */
    public void setCarrier(JP420000.bssv.e1.oracle.Entity carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the checkNumber value for this ProcessSOHeaderBilling.
     * 
     * @return checkNumber
     */
    public java.lang.String getCheckNumber() {
        return checkNumber;
    }


    /**
     * Sets the checkNumber value for this ProcessSOHeaderBilling.
     * 
     * @param checkNumber
     */
    public void setCheckNumber(java.lang.String checkNumber) {
        this.checkNumber = checkNumber;
    }


    /**
     * Gets the creditCardAccountName value for this ProcessSOHeaderBilling.
     * 
     * @return creditCardAccountName
     */
    public java.lang.String getCreditCardAccountName() {
        return creditCardAccountName;
    }


    /**
     * Sets the creditCardAccountName value for this ProcessSOHeaderBilling.
     * 
     * @param creditCardAccountName
     */
    public void setCreditCardAccountName(java.lang.String creditCardAccountName) {
        this.creditCardAccountName = creditCardAccountName;
    }


    /**
     * Gets the creditCardAccountNumber value for this ProcessSOHeaderBilling.
     * 
     * @return creditCardAccountNumber
     */
    public java.lang.String getCreditCardAccountNumber() {
        return creditCardAccountNumber;
    }


    /**
     * Sets the creditCardAccountNumber value for this ProcessSOHeaderBilling.
     * 
     * @param creditCardAccountNumber
     */
    public void setCreditCardAccountNumber(java.lang.String creditCardAccountNumber) {
        this.creditCardAccountNumber = creditCardAccountNumber;
    }


    /**
     * Gets the creditCardTypeCode value for this ProcessSOHeaderBilling.
     * 
     * @return creditCardTypeCode
     */
    public java.lang.String getCreditCardTypeCode() {
        return creditCardTypeCode;
    }


    /**
     * Sets the creditCardTypeCode value for this ProcessSOHeaderBilling.
     * 
     * @param creditCardTypeCode
     */
    public void setCreditCardTypeCode(java.lang.String creditCardTypeCode) {
        this.creditCardTypeCode = creditCardTypeCode;
    }


    /**
     * Gets the customerPriceGroupCode value for this ProcessSOHeaderBilling.
     * 
     * @return customerPriceGroupCode
     */
    public java.lang.String getCustomerPriceGroupCode() {
        return customerPriceGroupCode;
    }


    /**
     * Sets the customerPriceGroupCode value for this ProcessSOHeaderBilling.
     * 
     * @param customerPriceGroupCode
     */
    public void setCustomerPriceGroupCode(java.lang.String customerPriceGroupCode) {
        this.customerPriceGroupCode = customerPriceGroupCode;
    }


    /**
     * Gets the dateExpiration value for this ProcessSOHeaderBilling.
     * 
     * @return dateExpiration
     */
    public java.util.Calendar getDateExpiration() {
        return dateExpiration;
    }


    /**
     * Sets the dateExpiration value for this ProcessSOHeaderBilling.
     * 
     * @param dateExpiration
     */
    public void setDateExpiration(java.util.Calendar dateExpiration) {
        this.dateExpiration = dateExpiration;
    }


    /**
     * Gets the deliveryInstruction1 value for this ProcessSOHeaderBilling.
     * 
     * @return deliveryInstruction1
     */
    public java.lang.String getDeliveryInstruction1() {
        return deliveryInstruction1;
    }


    /**
     * Sets the deliveryInstruction1 value for this ProcessSOHeaderBilling.
     * 
     * @param deliveryInstruction1
     */
    public void setDeliveryInstruction1(java.lang.String deliveryInstruction1) {
        this.deliveryInstruction1 = deliveryInstruction1;
    }


    /**
     * Gets the deliveryInstruction2 value for this ProcessSOHeaderBilling.
     * 
     * @return deliveryInstruction2
     */
    public java.lang.String getDeliveryInstruction2() {
        return deliveryInstruction2;
    }


    /**
     * Sets the deliveryInstruction2 value for this ProcessSOHeaderBilling.
     * 
     * @param deliveryInstruction2
     */
    public void setDeliveryInstruction2(java.lang.String deliveryInstruction2) {
        this.deliveryInstruction2 = deliveryInstruction2;
    }


    /**
     * Gets the freightHandlingCode value for this ProcessSOHeaderBilling.
     * 
     * @return freightHandlingCode
     */
    public java.lang.String getFreightHandlingCode() {
        return freightHandlingCode;
    }


    /**
     * Sets the freightHandlingCode value for this ProcessSOHeaderBilling.
     * 
     * @param freightHandlingCode
     */
    public void setFreightHandlingCode(java.lang.String freightHandlingCode) {
        this.freightHandlingCode = freightHandlingCode;
    }


    /**
     * Gets the paymentInstrumentCode value for this ProcessSOHeaderBilling.
     * 
     * @return paymentInstrumentCode
     */
    public java.lang.String getPaymentInstrumentCode() {
        return paymentInstrumentCode;
    }


    /**
     * Sets the paymentInstrumentCode value for this ProcessSOHeaderBilling.
     * 
     * @param paymentInstrumentCode
     */
    public void setPaymentInstrumentCode(java.lang.String paymentInstrumentCode) {
        this.paymentInstrumentCode = paymentInstrumentCode;
    }


    /**
     * Gets the paymentTermsCode value for this ProcessSOHeaderBilling.
     * 
     * @return paymentTermsCode
     */
    public java.lang.String getPaymentTermsCode() {
        return paymentTermsCode;
    }


    /**
     * Sets the paymentTermsCode value for this ProcessSOHeaderBilling.
     * 
     * @param paymentTermsCode
     */
    public void setPaymentTermsCode(java.lang.String paymentTermsCode) {
        this.paymentTermsCode = paymentTermsCode;
    }


    /**
     * Gets the percentDiscountTrade value for this ProcessSOHeaderBilling.
     * 
     * @return percentDiscountTrade
     */
    public java.math.BigDecimal getPercentDiscountTrade() {
        return percentDiscountTrade;
    }


    /**
     * Sets the percentDiscountTrade value for this ProcessSOHeaderBilling.
     * 
     * @param percentDiscountTrade
     */
    public void setPercentDiscountTrade(java.math.BigDecimal percentDiscountTrade) {
        this.percentDiscountTrade = percentDiscountTrade;
    }


    /**
     * Gets the printMessageCode value for this ProcessSOHeaderBilling.
     * 
     * @return printMessageCode
     */
    public java.lang.String getPrintMessageCode() {
        return printMessageCode;
    }


    /**
     * Sets the printMessageCode value for this ProcessSOHeaderBilling.
     * 
     * @param printMessageCode
     */
    public void setPrintMessageCode(java.lang.String printMessageCode) {
        this.printMessageCode = printMessageCode;
    }


    /**
     * Gets the taxExplanationCode value for this ProcessSOHeaderBilling.
     * 
     * @return taxExplanationCode
     */
    public java.lang.String getTaxExplanationCode() {
        return taxExplanationCode;
    }


    /**
     * Sets the taxExplanationCode value for this ProcessSOHeaderBilling.
     * 
     * @param taxExplanationCode
     */
    public void setTaxExplanationCode(java.lang.String taxExplanationCode) {
        this.taxExplanationCode = taxExplanationCode;
    }


    /**
     * Gets the taxRateAreaCode value for this ProcessSOHeaderBilling.
     * 
     * @return taxRateAreaCode
     */
    public java.lang.String getTaxRateAreaCode() {
        return taxRateAreaCode;
    }


    /**
     * Sets the taxRateAreaCode value for this ProcessSOHeaderBilling.
     * 
     * @param taxRateAreaCode
     */
    public void setTaxRateAreaCode(java.lang.String taxRateAreaCode) {
        this.taxRateAreaCode = taxRateAreaCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessSOHeaderBilling)) return false;
        ProcessSOHeaderBilling other = (ProcessSOHeaderBilling) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adjustmentScheduleCode==null && other.getAdjustmentScheduleCode()==null) || 
             (this.adjustmentScheduleCode!=null &&
              this.adjustmentScheduleCode.equals(other.getAdjustmentScheduleCode()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.checkNumber==null && other.getCheckNumber()==null) || 
             (this.checkNumber!=null &&
              this.checkNumber.equals(other.getCheckNumber()))) &&
            ((this.creditCardAccountName==null && other.getCreditCardAccountName()==null) || 
             (this.creditCardAccountName!=null &&
              this.creditCardAccountName.equals(other.getCreditCardAccountName()))) &&
            ((this.creditCardAccountNumber==null && other.getCreditCardAccountNumber()==null) || 
             (this.creditCardAccountNumber!=null &&
              this.creditCardAccountNumber.equals(other.getCreditCardAccountNumber()))) &&
            ((this.creditCardTypeCode==null && other.getCreditCardTypeCode()==null) || 
             (this.creditCardTypeCode!=null &&
              this.creditCardTypeCode.equals(other.getCreditCardTypeCode()))) &&
            ((this.customerPriceGroupCode==null && other.getCustomerPriceGroupCode()==null) || 
             (this.customerPriceGroupCode!=null &&
              this.customerPriceGroupCode.equals(other.getCustomerPriceGroupCode()))) &&
            ((this.dateExpiration==null && other.getDateExpiration()==null) || 
             (this.dateExpiration!=null &&
              this.dateExpiration.equals(other.getDateExpiration()))) &&
            ((this.deliveryInstruction1==null && other.getDeliveryInstruction1()==null) || 
             (this.deliveryInstruction1!=null &&
              this.deliveryInstruction1.equals(other.getDeliveryInstruction1()))) &&
            ((this.deliveryInstruction2==null && other.getDeliveryInstruction2()==null) || 
             (this.deliveryInstruction2!=null &&
              this.deliveryInstruction2.equals(other.getDeliveryInstruction2()))) &&
            ((this.freightHandlingCode==null && other.getFreightHandlingCode()==null) || 
             (this.freightHandlingCode!=null &&
              this.freightHandlingCode.equals(other.getFreightHandlingCode()))) &&
            ((this.paymentInstrumentCode==null && other.getPaymentInstrumentCode()==null) || 
             (this.paymentInstrumentCode!=null &&
              this.paymentInstrumentCode.equals(other.getPaymentInstrumentCode()))) &&
            ((this.paymentTermsCode==null && other.getPaymentTermsCode()==null) || 
             (this.paymentTermsCode!=null &&
              this.paymentTermsCode.equals(other.getPaymentTermsCode()))) &&
            ((this.percentDiscountTrade==null && other.getPercentDiscountTrade()==null) || 
             (this.percentDiscountTrade!=null &&
              this.percentDiscountTrade.equals(other.getPercentDiscountTrade()))) &&
            ((this.printMessageCode==null && other.getPrintMessageCode()==null) || 
             (this.printMessageCode!=null &&
              this.printMessageCode.equals(other.getPrintMessageCode()))) &&
            ((this.taxExplanationCode==null && other.getTaxExplanationCode()==null) || 
             (this.taxExplanationCode!=null &&
              this.taxExplanationCode.equals(other.getTaxExplanationCode()))) &&
            ((this.taxRateAreaCode==null && other.getTaxRateAreaCode()==null) || 
             (this.taxRateAreaCode!=null &&
              this.taxRateAreaCode.equals(other.getTaxRateAreaCode())));
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
        if (getAdjustmentScheduleCode() != null) {
            _hashCode += getAdjustmentScheduleCode().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getCheckNumber() != null) {
            _hashCode += getCheckNumber().hashCode();
        }
        if (getCreditCardAccountName() != null) {
            _hashCode += getCreditCardAccountName().hashCode();
        }
        if (getCreditCardAccountNumber() != null) {
            _hashCode += getCreditCardAccountNumber().hashCode();
        }
        if (getCreditCardTypeCode() != null) {
            _hashCode += getCreditCardTypeCode().hashCode();
        }
        if (getCustomerPriceGroupCode() != null) {
            _hashCode += getCustomerPriceGroupCode().hashCode();
        }
        if (getDateExpiration() != null) {
            _hashCode += getDateExpiration().hashCode();
        }
        if (getDeliveryInstruction1() != null) {
            _hashCode += getDeliveryInstruction1().hashCode();
        }
        if (getDeliveryInstruction2() != null) {
            _hashCode += getDeliveryInstruction2().hashCode();
        }
        if (getFreightHandlingCode() != null) {
            _hashCode += getFreightHandlingCode().hashCode();
        }
        if (getPaymentInstrumentCode() != null) {
            _hashCode += getPaymentInstrumentCode().hashCode();
        }
        if (getPaymentTermsCode() != null) {
            _hashCode += getPaymentTermsCode().hashCode();
        }
        if (getPercentDiscountTrade() != null) {
            _hashCode += getPercentDiscountTrade().hashCode();
        }
        if (getPrintMessageCode() != null) {
            _hashCode += getPrintMessageCode().hashCode();
        }
        if (getTaxExplanationCode() != null) {
            _hashCode += getTaxExplanationCode().hashCode();
        }
        if (getTaxRateAreaCode() != null) {
            _hashCode += getTaxRateAreaCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessSOHeaderBilling.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderBilling"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentScheduleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentScheduleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditCardAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditCardAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditCardTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPriceGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerPriceGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstruction1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryInstruction1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstruction2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryInstruction2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("paymentInstrumentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentInstrumentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTermsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentTermsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentDiscountTrade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentDiscountTrade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printMessageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printMessageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxExplanationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxExplanationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRateAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxRateAreaCode"));
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
