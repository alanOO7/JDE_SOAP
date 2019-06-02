/**
 * PurchaseOrderGetHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderGetHeader  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String businessUnit;

    private JP430000.bssv.e1.oracle.Entity buyer;

    private java.lang.String currencyCodeFrom;

    private JP430000.bssv.e1.oracle.PurchaseOrderGetDates dates;

    private java.lang.String deliveryInstruction1;

    private java.lang.String deliveryInstruction2;

    private JP430000.bssv.e1.oracle.PurchaseOrderGetDetail detail;

    private java.lang.String freightHandlingCode;

    private java.lang.String holdCode;

    private JP430000.bssv.e1.oracle.Entity markFor;

    private java.lang.String orderTakenBy;

    private java.lang.String orderedBy;

    private java.lang.String paymentTermsCode;

    private JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey;

    private java.math.BigDecimal rateExchangeOverride;

    private java.lang.String taxExplanationCode;

    private java.lang.String taxRateAreaCode;

    private JP430000.bssv.e1.oracle.UserReservedData userReservedData;

    private java.lang.String zoneNumber;

    public PurchaseOrderGetHeader() {
    }

    public PurchaseOrderGetHeader(
           java.lang.String businessUnit,
           JP430000.bssv.e1.oracle.Entity buyer,
           java.lang.String currencyCodeFrom,
           JP430000.bssv.e1.oracle.PurchaseOrderGetDates dates,
           java.lang.String deliveryInstruction1,
           java.lang.String deliveryInstruction2,
           JP430000.bssv.e1.oracle.PurchaseOrderGetDetail detail,
           java.lang.String freightHandlingCode,
           java.lang.String holdCode,
           JP430000.bssv.e1.oracle.Entity markFor,
           java.lang.String orderTakenBy,
           java.lang.String orderedBy,
           java.lang.String paymentTermsCode,
           JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey,
           java.math.BigDecimal rateExchangeOverride,
           java.lang.String taxExplanationCode,
           java.lang.String taxRateAreaCode,
           JP430000.bssv.e1.oracle.UserReservedData userReservedData,
           java.lang.String zoneNumber) {
        this.businessUnit = businessUnit;
        this.buyer = buyer;
        this.currencyCodeFrom = currencyCodeFrom;
        this.dates = dates;
        this.deliveryInstruction1 = deliveryInstruction1;
        this.deliveryInstruction2 = deliveryInstruction2;
        this.detail = detail;
        this.freightHandlingCode = freightHandlingCode;
        this.holdCode = holdCode;
        this.markFor = markFor;
        this.orderTakenBy = orderTakenBy;
        this.orderedBy = orderedBy;
        this.paymentTermsCode = paymentTermsCode;
        this.purchaseOrderKey = purchaseOrderKey;
        this.rateExchangeOverride = rateExchangeOverride;
        this.taxExplanationCode = taxExplanationCode;
        this.taxRateAreaCode = taxRateAreaCode;
        this.userReservedData = userReservedData;
        this.zoneNumber = zoneNumber;
    }


    /**
     * Gets the businessUnit value for this PurchaseOrderGetHeader.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this PurchaseOrderGetHeader.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the buyer value for this PurchaseOrderGetHeader.
     * 
     * @return buyer
     */
    public JP430000.bssv.e1.oracle.Entity getBuyer() {
        return buyer;
    }


    /**
     * Sets the buyer value for this PurchaseOrderGetHeader.
     * 
     * @param buyer
     */
    public void setBuyer(JP430000.bssv.e1.oracle.Entity buyer) {
        this.buyer = buyer;
    }


    /**
     * Gets the currencyCodeFrom value for this PurchaseOrderGetHeader.
     * 
     * @return currencyCodeFrom
     */
    public java.lang.String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }


    /**
     * Sets the currencyCodeFrom value for this PurchaseOrderGetHeader.
     * 
     * @param currencyCodeFrom
     */
    public void setCurrencyCodeFrom(java.lang.String currencyCodeFrom) {
        this.currencyCodeFrom = currencyCodeFrom;
    }


    /**
     * Gets the dates value for this PurchaseOrderGetHeader.
     * 
     * @return dates
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderGetDates getDates() {
        return dates;
    }


    /**
     * Sets the dates value for this PurchaseOrderGetHeader.
     * 
     * @param dates
     */
    public void setDates(JP430000.bssv.e1.oracle.PurchaseOrderGetDates dates) {
        this.dates = dates;
    }


    /**
     * Gets the deliveryInstruction1 value for this PurchaseOrderGetHeader.
     * 
     * @return deliveryInstruction1
     */
    public java.lang.String getDeliveryInstruction1() {
        return deliveryInstruction1;
    }


    /**
     * Sets the deliveryInstruction1 value for this PurchaseOrderGetHeader.
     * 
     * @param deliveryInstruction1
     */
    public void setDeliveryInstruction1(java.lang.String deliveryInstruction1) {
        this.deliveryInstruction1 = deliveryInstruction1;
    }


    /**
     * Gets the deliveryInstruction2 value for this PurchaseOrderGetHeader.
     * 
     * @return deliveryInstruction2
     */
    public java.lang.String getDeliveryInstruction2() {
        return deliveryInstruction2;
    }


    /**
     * Sets the deliveryInstruction2 value for this PurchaseOrderGetHeader.
     * 
     * @param deliveryInstruction2
     */
    public void setDeliveryInstruction2(java.lang.String deliveryInstruction2) {
        this.deliveryInstruction2 = deliveryInstruction2;
    }


    /**
     * Gets the detail value for this PurchaseOrderGetHeader.
     * 
     * @return detail
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderGetDetail getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this PurchaseOrderGetHeader.
     * 
     * @param detail
     */
    public void setDetail(JP430000.bssv.e1.oracle.PurchaseOrderGetDetail detail) {
        this.detail = detail;
    }


    /**
     * Gets the freightHandlingCode value for this PurchaseOrderGetHeader.
     * 
     * @return freightHandlingCode
     */
    public java.lang.String getFreightHandlingCode() {
        return freightHandlingCode;
    }


    /**
     * Sets the freightHandlingCode value for this PurchaseOrderGetHeader.
     * 
     * @param freightHandlingCode
     */
    public void setFreightHandlingCode(java.lang.String freightHandlingCode) {
        this.freightHandlingCode = freightHandlingCode;
    }


    /**
     * Gets the holdCode value for this PurchaseOrderGetHeader.
     * 
     * @return holdCode
     */
    public java.lang.String getHoldCode() {
        return holdCode;
    }


    /**
     * Sets the holdCode value for this PurchaseOrderGetHeader.
     * 
     * @param holdCode
     */
    public void setHoldCode(java.lang.String holdCode) {
        this.holdCode = holdCode;
    }


    /**
     * Gets the markFor value for this PurchaseOrderGetHeader.
     * 
     * @return markFor
     */
    public JP430000.bssv.e1.oracle.Entity getMarkFor() {
        return markFor;
    }


    /**
     * Sets the markFor value for this PurchaseOrderGetHeader.
     * 
     * @param markFor
     */
    public void setMarkFor(JP430000.bssv.e1.oracle.Entity markFor) {
        this.markFor = markFor;
    }


    /**
     * Gets the orderTakenBy value for this PurchaseOrderGetHeader.
     * 
     * @return orderTakenBy
     */
    public java.lang.String getOrderTakenBy() {
        return orderTakenBy;
    }


    /**
     * Sets the orderTakenBy value for this PurchaseOrderGetHeader.
     * 
     * @param orderTakenBy
     */
    public void setOrderTakenBy(java.lang.String orderTakenBy) {
        this.orderTakenBy = orderTakenBy;
    }


    /**
     * Gets the orderedBy value for this PurchaseOrderGetHeader.
     * 
     * @return orderedBy
     */
    public java.lang.String getOrderedBy() {
        return orderedBy;
    }


    /**
     * Sets the orderedBy value for this PurchaseOrderGetHeader.
     * 
     * @param orderedBy
     */
    public void setOrderedBy(java.lang.String orderedBy) {
        this.orderedBy = orderedBy;
    }


    /**
     * Gets the paymentTermsCode value for this PurchaseOrderGetHeader.
     * 
     * @return paymentTermsCode
     */
    public java.lang.String getPaymentTermsCode() {
        return paymentTermsCode;
    }


    /**
     * Sets the paymentTermsCode value for this PurchaseOrderGetHeader.
     * 
     * @param paymentTermsCode
     */
    public void setPaymentTermsCode(java.lang.String paymentTermsCode) {
        this.paymentTermsCode = paymentTermsCode;
    }


    /**
     * Gets the purchaseOrderKey value for this PurchaseOrderGetHeader.
     * 
     * @return purchaseOrderKey
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderKey getPurchaseOrderKey() {
        return purchaseOrderKey;
    }


    /**
     * Sets the purchaseOrderKey value for this PurchaseOrderGetHeader.
     * 
     * @param purchaseOrderKey
     */
    public void setPurchaseOrderKey(JP430000.bssv.e1.oracle.PurchaseOrderKey purchaseOrderKey) {
        this.purchaseOrderKey = purchaseOrderKey;
    }


    /**
     * Gets the rateExchangeOverride value for this PurchaseOrderGetHeader.
     * 
     * @return rateExchangeOverride
     */
    public java.math.BigDecimal getRateExchangeOverride() {
        return rateExchangeOverride;
    }


    /**
     * Sets the rateExchangeOverride value for this PurchaseOrderGetHeader.
     * 
     * @param rateExchangeOverride
     */
    public void setRateExchangeOverride(java.math.BigDecimal rateExchangeOverride) {
        this.rateExchangeOverride = rateExchangeOverride;
    }


    /**
     * Gets the taxExplanationCode value for this PurchaseOrderGetHeader.
     * 
     * @return taxExplanationCode
     */
    public java.lang.String getTaxExplanationCode() {
        return taxExplanationCode;
    }


    /**
     * Sets the taxExplanationCode value for this PurchaseOrderGetHeader.
     * 
     * @param taxExplanationCode
     */
    public void setTaxExplanationCode(java.lang.String taxExplanationCode) {
        this.taxExplanationCode = taxExplanationCode;
    }


    /**
     * Gets the taxRateAreaCode value for this PurchaseOrderGetHeader.
     * 
     * @return taxRateAreaCode
     */
    public java.lang.String getTaxRateAreaCode() {
        return taxRateAreaCode;
    }


    /**
     * Sets the taxRateAreaCode value for this PurchaseOrderGetHeader.
     * 
     * @param taxRateAreaCode
     */
    public void setTaxRateAreaCode(java.lang.String taxRateAreaCode) {
        this.taxRateAreaCode = taxRateAreaCode;
    }


    /**
     * Gets the userReservedData value for this PurchaseOrderGetHeader.
     * 
     * @return userReservedData
     */
    public JP430000.bssv.e1.oracle.UserReservedData getUserReservedData() {
        return userReservedData;
    }


    /**
     * Sets the userReservedData value for this PurchaseOrderGetHeader.
     * 
     * @param userReservedData
     */
    public void setUserReservedData(JP430000.bssv.e1.oracle.UserReservedData userReservedData) {
        this.userReservedData = userReservedData;
    }


    /**
     * Gets the zoneNumber value for this PurchaseOrderGetHeader.
     * 
     * @return zoneNumber
     */
    public java.lang.String getZoneNumber() {
        return zoneNumber;
    }


    /**
     * Sets the zoneNumber value for this PurchaseOrderGetHeader.
     * 
     * @param zoneNumber
     */
    public void setZoneNumber(java.lang.String zoneNumber) {
        this.zoneNumber = zoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderGetHeader)) return false;
        PurchaseOrderGetHeader other = (PurchaseOrderGetHeader) obj;
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
            ((this.buyer==null && other.getBuyer()==null) || 
             (this.buyer!=null &&
              this.buyer.equals(other.getBuyer()))) &&
            ((this.currencyCodeFrom==null && other.getCurrencyCodeFrom()==null) || 
             (this.currencyCodeFrom!=null &&
              this.currencyCodeFrom.equals(other.getCurrencyCodeFrom()))) &&
            ((this.dates==null && other.getDates()==null) || 
             (this.dates!=null &&
              this.dates.equals(other.getDates()))) &&
            ((this.deliveryInstruction1==null && other.getDeliveryInstruction1()==null) || 
             (this.deliveryInstruction1!=null &&
              this.deliveryInstruction1.equals(other.getDeliveryInstruction1()))) &&
            ((this.deliveryInstruction2==null && other.getDeliveryInstruction2()==null) || 
             (this.deliveryInstruction2!=null &&
              this.deliveryInstruction2.equals(other.getDeliveryInstruction2()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              this.detail.equals(other.getDetail()))) &&
            ((this.freightHandlingCode==null && other.getFreightHandlingCode()==null) || 
             (this.freightHandlingCode!=null &&
              this.freightHandlingCode.equals(other.getFreightHandlingCode()))) &&
            ((this.holdCode==null && other.getHoldCode()==null) || 
             (this.holdCode!=null &&
              this.holdCode.equals(other.getHoldCode()))) &&
            ((this.markFor==null && other.getMarkFor()==null) || 
             (this.markFor!=null &&
              this.markFor.equals(other.getMarkFor()))) &&
            ((this.orderTakenBy==null && other.getOrderTakenBy()==null) || 
             (this.orderTakenBy!=null &&
              this.orderTakenBy.equals(other.getOrderTakenBy()))) &&
            ((this.orderedBy==null && other.getOrderedBy()==null) || 
             (this.orderedBy!=null &&
              this.orderedBy.equals(other.getOrderedBy()))) &&
            ((this.paymentTermsCode==null && other.getPaymentTermsCode()==null) || 
             (this.paymentTermsCode!=null &&
              this.paymentTermsCode.equals(other.getPaymentTermsCode()))) &&
            ((this.purchaseOrderKey==null && other.getPurchaseOrderKey()==null) || 
             (this.purchaseOrderKey!=null &&
              this.purchaseOrderKey.equals(other.getPurchaseOrderKey()))) &&
            ((this.rateExchangeOverride==null && other.getRateExchangeOverride()==null) || 
             (this.rateExchangeOverride!=null &&
              this.rateExchangeOverride.equals(other.getRateExchangeOverride()))) &&
            ((this.taxExplanationCode==null && other.getTaxExplanationCode()==null) || 
             (this.taxExplanationCode!=null &&
              this.taxExplanationCode.equals(other.getTaxExplanationCode()))) &&
            ((this.taxRateAreaCode==null && other.getTaxRateAreaCode()==null) || 
             (this.taxRateAreaCode!=null &&
              this.taxRateAreaCode.equals(other.getTaxRateAreaCode()))) &&
            ((this.userReservedData==null && other.getUserReservedData()==null) || 
             (this.userReservedData!=null &&
              this.userReservedData.equals(other.getUserReservedData()))) &&
            ((this.zoneNumber==null && other.getZoneNumber()==null) || 
             (this.zoneNumber!=null &&
              this.zoneNumber.equals(other.getZoneNumber())));
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
        if (getBuyer() != null) {
            _hashCode += getBuyer().hashCode();
        }
        if (getCurrencyCodeFrom() != null) {
            _hashCode += getCurrencyCodeFrom().hashCode();
        }
        if (getDates() != null) {
            _hashCode += getDates().hashCode();
        }
        if (getDeliveryInstruction1() != null) {
            _hashCode += getDeliveryInstruction1().hashCode();
        }
        if (getDeliveryInstruction2() != null) {
            _hashCode += getDeliveryInstruction2().hashCode();
        }
        if (getDetail() != null) {
            _hashCode += getDetail().hashCode();
        }
        if (getFreightHandlingCode() != null) {
            _hashCode += getFreightHandlingCode().hashCode();
        }
        if (getHoldCode() != null) {
            _hashCode += getHoldCode().hashCode();
        }
        if (getMarkFor() != null) {
            _hashCode += getMarkFor().hashCode();
        }
        if (getOrderTakenBy() != null) {
            _hashCode += getOrderTakenBy().hashCode();
        }
        if (getOrderedBy() != null) {
            _hashCode += getOrderedBy().hashCode();
        }
        if (getPaymentTermsCode() != null) {
            _hashCode += getPaymentTermsCode().hashCode();
        }
        if (getPurchaseOrderKey() != null) {
            _hashCode += getPurchaseOrderKey().hashCode();
        }
        if (getRateExchangeOverride() != null) {
            _hashCode += getRateExchangeOverride().hashCode();
        }
        if (getTaxExplanationCode() != null) {
            _hashCode += getTaxExplanationCode().hashCode();
        }
        if (getTaxRateAreaCode() != null) {
            _hashCode += getTaxRateAreaCode().hashCode();
        }
        if (getUserReservedData() != null) {
            _hashCode += getUserReservedData().hashCode();
        }
        if (getZoneNumber() != null) {
            _hashCode += getZoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderGetHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCodeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCodeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetDates"));
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
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetDetail"));
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
        elemField.setFieldName("holdCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markFor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markFor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
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
        elemField.setFieldName("orderedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderedBy"));
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
        elemField.setFieldName("purchaseOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateExchangeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateExchangeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("userReservedData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userReservedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "userReservedData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoneNumber"));
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
