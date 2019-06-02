/**
 * ProcessSODetailBillingV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ProcessSODetailBillingV2  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP420000.bssv.e1.oracle.Entity carrier;

    private java.lang.String freightHandlingCode;

    private java.lang.String modeOfTransportCode;

    private java.lang.String paymentInstrumentCode;

    private java.lang.String paymentTermsCode;

    private JP420000.bssv.e1.oracle.PricingV2 pricing;

    private java.lang.String printMessageCode;

    private java.lang.String subledger;

    private java.lang.String subledgerTypeCode;

    private java.lang.String taxExplanationCode;

    private java.lang.String taxRateAreaCode;

    private java.lang.String taxableCode;

    public ProcessSODetailBillingV2() {
    }

    public ProcessSODetailBillingV2(
           JP420000.bssv.e1.oracle.Entity carrier,
           java.lang.String freightHandlingCode,
           java.lang.String modeOfTransportCode,
           java.lang.String paymentInstrumentCode,
           java.lang.String paymentTermsCode,
           JP420000.bssv.e1.oracle.PricingV2 pricing,
           java.lang.String printMessageCode,
           java.lang.String subledger,
           java.lang.String subledgerTypeCode,
           java.lang.String taxExplanationCode,
           java.lang.String taxRateAreaCode,
           java.lang.String taxableCode) {
        this.carrier = carrier;
        this.freightHandlingCode = freightHandlingCode;
        this.modeOfTransportCode = modeOfTransportCode;
        this.paymentInstrumentCode = paymentInstrumentCode;
        this.paymentTermsCode = paymentTermsCode;
        this.pricing = pricing;
        this.printMessageCode = printMessageCode;
        this.subledger = subledger;
        this.subledgerTypeCode = subledgerTypeCode;
        this.taxExplanationCode = taxExplanationCode;
        this.taxRateAreaCode = taxRateAreaCode;
        this.taxableCode = taxableCode;
    }


    /**
     * Gets the carrier value for this ProcessSODetailBillingV2.
     * 
     * @return carrier
     */
    public JP420000.bssv.e1.oracle.Entity getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this ProcessSODetailBillingV2.
     * 
     * @param carrier
     */
    public void setCarrier(JP420000.bssv.e1.oracle.Entity carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the freightHandlingCode value for this ProcessSODetailBillingV2.
     * 
     * @return freightHandlingCode
     */
    public java.lang.String getFreightHandlingCode() {
        return freightHandlingCode;
    }


    /**
     * Sets the freightHandlingCode value for this ProcessSODetailBillingV2.
     * 
     * @param freightHandlingCode
     */
    public void setFreightHandlingCode(java.lang.String freightHandlingCode) {
        this.freightHandlingCode = freightHandlingCode;
    }


    /**
     * Gets the modeOfTransportCode value for this ProcessSODetailBillingV2.
     * 
     * @return modeOfTransportCode
     */
    public java.lang.String getModeOfTransportCode() {
        return modeOfTransportCode;
    }


    /**
     * Sets the modeOfTransportCode value for this ProcessSODetailBillingV2.
     * 
     * @param modeOfTransportCode
     */
    public void setModeOfTransportCode(java.lang.String modeOfTransportCode) {
        this.modeOfTransportCode = modeOfTransportCode;
    }


    /**
     * Gets the paymentInstrumentCode value for this ProcessSODetailBillingV2.
     * 
     * @return paymentInstrumentCode
     */
    public java.lang.String getPaymentInstrumentCode() {
        return paymentInstrumentCode;
    }


    /**
     * Sets the paymentInstrumentCode value for this ProcessSODetailBillingV2.
     * 
     * @param paymentInstrumentCode
     */
    public void setPaymentInstrumentCode(java.lang.String paymentInstrumentCode) {
        this.paymentInstrumentCode = paymentInstrumentCode;
    }


    /**
     * Gets the paymentTermsCode value for this ProcessSODetailBillingV2.
     * 
     * @return paymentTermsCode
     */
    public java.lang.String getPaymentTermsCode() {
        return paymentTermsCode;
    }


    /**
     * Sets the paymentTermsCode value for this ProcessSODetailBillingV2.
     * 
     * @param paymentTermsCode
     */
    public void setPaymentTermsCode(java.lang.String paymentTermsCode) {
        this.paymentTermsCode = paymentTermsCode;
    }


    /**
     * Gets the pricing value for this ProcessSODetailBillingV2.
     * 
     * @return pricing
     */
    public JP420000.bssv.e1.oracle.PricingV2 getPricing() {
        return pricing;
    }


    /**
     * Sets the pricing value for this ProcessSODetailBillingV2.
     * 
     * @param pricing
     */
    public void setPricing(JP420000.bssv.e1.oracle.PricingV2 pricing) {
        this.pricing = pricing;
    }


    /**
     * Gets the printMessageCode value for this ProcessSODetailBillingV2.
     * 
     * @return printMessageCode
     */
    public java.lang.String getPrintMessageCode() {
        return printMessageCode;
    }


    /**
     * Sets the printMessageCode value for this ProcessSODetailBillingV2.
     * 
     * @param printMessageCode
     */
    public void setPrintMessageCode(java.lang.String printMessageCode) {
        this.printMessageCode = printMessageCode;
    }


    /**
     * Gets the subledger value for this ProcessSODetailBillingV2.
     * 
     * @return subledger
     */
    public java.lang.String getSubledger() {
        return subledger;
    }


    /**
     * Sets the subledger value for this ProcessSODetailBillingV2.
     * 
     * @param subledger
     */
    public void setSubledger(java.lang.String subledger) {
        this.subledger = subledger;
    }


    /**
     * Gets the subledgerTypeCode value for this ProcessSODetailBillingV2.
     * 
     * @return subledgerTypeCode
     */
    public java.lang.String getSubledgerTypeCode() {
        return subledgerTypeCode;
    }


    /**
     * Sets the subledgerTypeCode value for this ProcessSODetailBillingV2.
     * 
     * @param subledgerTypeCode
     */
    public void setSubledgerTypeCode(java.lang.String subledgerTypeCode) {
        this.subledgerTypeCode = subledgerTypeCode;
    }


    /**
     * Gets the taxExplanationCode value for this ProcessSODetailBillingV2.
     * 
     * @return taxExplanationCode
     */
    public java.lang.String getTaxExplanationCode() {
        return taxExplanationCode;
    }


    /**
     * Sets the taxExplanationCode value for this ProcessSODetailBillingV2.
     * 
     * @param taxExplanationCode
     */
    public void setTaxExplanationCode(java.lang.String taxExplanationCode) {
        this.taxExplanationCode = taxExplanationCode;
    }


    /**
     * Gets the taxRateAreaCode value for this ProcessSODetailBillingV2.
     * 
     * @return taxRateAreaCode
     */
    public java.lang.String getTaxRateAreaCode() {
        return taxRateAreaCode;
    }


    /**
     * Sets the taxRateAreaCode value for this ProcessSODetailBillingV2.
     * 
     * @param taxRateAreaCode
     */
    public void setTaxRateAreaCode(java.lang.String taxRateAreaCode) {
        this.taxRateAreaCode = taxRateAreaCode;
    }


    /**
     * Gets the taxableCode value for this ProcessSODetailBillingV2.
     * 
     * @return taxableCode
     */
    public java.lang.String getTaxableCode() {
        return taxableCode;
    }


    /**
     * Sets the taxableCode value for this ProcessSODetailBillingV2.
     * 
     * @param taxableCode
     */
    public void setTaxableCode(java.lang.String taxableCode) {
        this.taxableCode = taxableCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessSODetailBillingV2)) return false;
        ProcessSODetailBillingV2 other = (ProcessSODetailBillingV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.freightHandlingCode==null && other.getFreightHandlingCode()==null) || 
             (this.freightHandlingCode!=null &&
              this.freightHandlingCode.equals(other.getFreightHandlingCode()))) &&
            ((this.modeOfTransportCode==null && other.getModeOfTransportCode()==null) || 
             (this.modeOfTransportCode!=null &&
              this.modeOfTransportCode.equals(other.getModeOfTransportCode()))) &&
            ((this.paymentInstrumentCode==null && other.getPaymentInstrumentCode()==null) || 
             (this.paymentInstrumentCode!=null &&
              this.paymentInstrumentCode.equals(other.getPaymentInstrumentCode()))) &&
            ((this.paymentTermsCode==null && other.getPaymentTermsCode()==null) || 
             (this.paymentTermsCode!=null &&
              this.paymentTermsCode.equals(other.getPaymentTermsCode()))) &&
            ((this.pricing==null && other.getPricing()==null) || 
             (this.pricing!=null &&
              this.pricing.equals(other.getPricing()))) &&
            ((this.printMessageCode==null && other.getPrintMessageCode()==null) || 
             (this.printMessageCode!=null &&
              this.printMessageCode.equals(other.getPrintMessageCode()))) &&
            ((this.subledger==null && other.getSubledger()==null) || 
             (this.subledger!=null &&
              this.subledger.equals(other.getSubledger()))) &&
            ((this.subledgerTypeCode==null && other.getSubledgerTypeCode()==null) || 
             (this.subledgerTypeCode!=null &&
              this.subledgerTypeCode.equals(other.getSubledgerTypeCode()))) &&
            ((this.taxExplanationCode==null && other.getTaxExplanationCode()==null) || 
             (this.taxExplanationCode!=null &&
              this.taxExplanationCode.equals(other.getTaxExplanationCode()))) &&
            ((this.taxRateAreaCode==null && other.getTaxRateAreaCode()==null) || 
             (this.taxRateAreaCode!=null &&
              this.taxRateAreaCode.equals(other.getTaxRateAreaCode()))) &&
            ((this.taxableCode==null && other.getTaxableCode()==null) || 
             (this.taxableCode!=null &&
              this.taxableCode.equals(other.getTaxableCode())));
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
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getFreightHandlingCode() != null) {
            _hashCode += getFreightHandlingCode().hashCode();
        }
        if (getModeOfTransportCode() != null) {
            _hashCode += getModeOfTransportCode().hashCode();
        }
        if (getPaymentInstrumentCode() != null) {
            _hashCode += getPaymentInstrumentCode().hashCode();
        }
        if (getPaymentTermsCode() != null) {
            _hashCode += getPaymentTermsCode().hashCode();
        }
        if (getPricing() != null) {
            _hashCode += getPricing().hashCode();
        }
        if (getPrintMessageCode() != null) {
            _hashCode += getPrintMessageCode().hashCode();
        }
        if (getSubledger() != null) {
            _hashCode += getSubledger().hashCode();
        }
        if (getSubledgerTypeCode() != null) {
            _hashCode += getSubledgerTypeCode().hashCode();
        }
        if (getTaxExplanationCode() != null) {
            _hashCode += getTaxExplanationCode().hashCode();
        }
        if (getTaxRateAreaCode() != null) {
            _hashCode += getTaxRateAreaCode().hashCode();
        }
        if (getTaxableCode() != null) {
            _hashCode += getTaxableCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessSODetailBillingV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailBillingV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
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
        elemField.setFieldName("modeOfTransportCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeOfTransportCode"));
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
        elemField.setFieldName("pricing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "pricingV2"));
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
        elemField.setFieldName("subledger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subledger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subledgerTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subledgerTypeCode"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxableCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxableCode"));
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
