/**
 * PriceAdjustmentLedger.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class PriceAdjustmentLedger  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String adjustmentCalculation;

    private java.lang.String adjustmentGroup;

    private java.lang.String adjustmentMutuallyExclusive;

    private java.lang.String adjustmentReasonCode;

    private java.lang.String adjustmentScheduleCode;

    private java.lang.String adjustmentTypeCode;

    private java.math.BigDecimal amountAdjustmentDomestic;

    private java.math.BigDecimal amountAdjustmentForeign;

    private java.lang.String basisCode;

    private java.lang.String ledgerTypeCode;

    private java.lang.String manualDiscount;

    private java.lang.String overridePriceCode;

    private java.lang.String promotionDisplayControl;

    private java.math.BigDecimal quantityFrom;

    private java.lang.Integer sequenceNumber;

    private java.lang.String unitOfMeasureCodeFactorValue;

    private java.math.BigDecimal valueBasedOn;

    private java.math.BigDecimal valueFactor;

    public PriceAdjustmentLedger() {
    }

    public PriceAdjustmentLedger(
           java.lang.String adjustmentCalculation,
           java.lang.String adjustmentGroup,
           java.lang.String adjustmentMutuallyExclusive,
           java.lang.String adjustmentReasonCode,
           java.lang.String adjustmentScheduleCode,
           java.lang.String adjustmentTypeCode,
           java.math.BigDecimal amountAdjustmentDomestic,
           java.math.BigDecimal amountAdjustmentForeign,
           java.lang.String basisCode,
           java.lang.String ledgerTypeCode,
           java.lang.String manualDiscount,
           java.lang.String overridePriceCode,
           java.lang.String promotionDisplayControl,
           java.math.BigDecimal quantityFrom,
           java.lang.Integer sequenceNumber,
           java.lang.String unitOfMeasureCodeFactorValue,
           java.math.BigDecimal valueBasedOn,
           java.math.BigDecimal valueFactor) {
        this.adjustmentCalculation = adjustmentCalculation;
        this.adjustmentGroup = adjustmentGroup;
        this.adjustmentMutuallyExclusive = adjustmentMutuallyExclusive;
        this.adjustmentReasonCode = adjustmentReasonCode;
        this.adjustmentScheduleCode = adjustmentScheduleCode;
        this.adjustmentTypeCode = adjustmentTypeCode;
        this.amountAdjustmentDomestic = amountAdjustmentDomestic;
        this.amountAdjustmentForeign = amountAdjustmentForeign;
        this.basisCode = basisCode;
        this.ledgerTypeCode = ledgerTypeCode;
        this.manualDiscount = manualDiscount;
        this.overridePriceCode = overridePriceCode;
        this.promotionDisplayControl = promotionDisplayControl;
        this.quantityFrom = quantityFrom;
        this.sequenceNumber = sequenceNumber;
        this.unitOfMeasureCodeFactorValue = unitOfMeasureCodeFactorValue;
        this.valueBasedOn = valueBasedOn;
        this.valueFactor = valueFactor;
    }


    /**
     * Gets the adjustmentCalculation value for this PriceAdjustmentLedger.
     * 
     * @return adjustmentCalculation
     */
    public java.lang.String getAdjustmentCalculation() {
        return adjustmentCalculation;
    }


    /**
     * Sets the adjustmentCalculation value for this PriceAdjustmentLedger.
     * 
     * @param adjustmentCalculation
     */
    public void setAdjustmentCalculation(java.lang.String adjustmentCalculation) {
        this.adjustmentCalculation = adjustmentCalculation;
    }


    /**
     * Gets the adjustmentGroup value for this PriceAdjustmentLedger.
     * 
     * @return adjustmentGroup
     */
    public java.lang.String getAdjustmentGroup() {
        return adjustmentGroup;
    }


    /**
     * Sets the adjustmentGroup value for this PriceAdjustmentLedger.
     * 
     * @param adjustmentGroup
     */
    public void setAdjustmentGroup(java.lang.String adjustmentGroup) {
        this.adjustmentGroup = adjustmentGroup;
    }


    /**
     * Gets the adjustmentMutuallyExclusive value for this PriceAdjustmentLedger.
     * 
     * @return adjustmentMutuallyExclusive
     */
    public java.lang.String getAdjustmentMutuallyExclusive() {
        return adjustmentMutuallyExclusive;
    }


    /**
     * Sets the adjustmentMutuallyExclusive value for this PriceAdjustmentLedger.
     * 
     * @param adjustmentMutuallyExclusive
     */
    public void setAdjustmentMutuallyExclusive(java.lang.String adjustmentMutuallyExclusive) {
        this.adjustmentMutuallyExclusive = adjustmentMutuallyExclusive;
    }


    /**
     * Gets the adjustmentReasonCode value for this PriceAdjustmentLedger.
     * 
     * @return adjustmentReasonCode
     */
    public java.lang.String getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }


    /**
     * Sets the adjustmentReasonCode value for this PriceAdjustmentLedger.
     * 
     * @param adjustmentReasonCode
     */
    public void setAdjustmentReasonCode(java.lang.String adjustmentReasonCode) {
        this.adjustmentReasonCode = adjustmentReasonCode;
    }


    /**
     * Gets the adjustmentScheduleCode value for this PriceAdjustmentLedger.
     * 
     * @return adjustmentScheduleCode
     */
    public java.lang.String getAdjustmentScheduleCode() {
        return adjustmentScheduleCode;
    }


    /**
     * Sets the adjustmentScheduleCode value for this PriceAdjustmentLedger.
     * 
     * @param adjustmentScheduleCode
     */
    public void setAdjustmentScheduleCode(java.lang.String adjustmentScheduleCode) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
    }


    /**
     * Gets the adjustmentTypeCode value for this PriceAdjustmentLedger.
     * 
     * @return adjustmentTypeCode
     */
    public java.lang.String getAdjustmentTypeCode() {
        return adjustmentTypeCode;
    }


    /**
     * Sets the adjustmentTypeCode value for this PriceAdjustmentLedger.
     * 
     * @param adjustmentTypeCode
     */
    public void setAdjustmentTypeCode(java.lang.String adjustmentTypeCode) {
        this.adjustmentTypeCode = adjustmentTypeCode;
    }


    /**
     * Gets the amountAdjustmentDomestic value for this PriceAdjustmentLedger.
     * 
     * @return amountAdjustmentDomestic
     */
    public java.math.BigDecimal getAmountAdjustmentDomestic() {
        return amountAdjustmentDomestic;
    }


    /**
     * Sets the amountAdjustmentDomestic value for this PriceAdjustmentLedger.
     * 
     * @param amountAdjustmentDomestic
     */
    public void setAmountAdjustmentDomestic(java.math.BigDecimal amountAdjustmentDomestic) {
        this.amountAdjustmentDomestic = amountAdjustmentDomestic;
    }


    /**
     * Gets the amountAdjustmentForeign value for this PriceAdjustmentLedger.
     * 
     * @return amountAdjustmentForeign
     */
    public java.math.BigDecimal getAmountAdjustmentForeign() {
        return amountAdjustmentForeign;
    }


    /**
     * Sets the amountAdjustmentForeign value for this PriceAdjustmentLedger.
     * 
     * @param amountAdjustmentForeign
     */
    public void setAmountAdjustmentForeign(java.math.BigDecimal amountAdjustmentForeign) {
        this.amountAdjustmentForeign = amountAdjustmentForeign;
    }


    /**
     * Gets the basisCode value for this PriceAdjustmentLedger.
     * 
     * @return basisCode
     */
    public java.lang.String getBasisCode() {
        return basisCode;
    }


    /**
     * Sets the basisCode value for this PriceAdjustmentLedger.
     * 
     * @param basisCode
     */
    public void setBasisCode(java.lang.String basisCode) {
        this.basisCode = basisCode;
    }


    /**
     * Gets the ledgerTypeCode value for this PriceAdjustmentLedger.
     * 
     * @return ledgerTypeCode
     */
    public java.lang.String getLedgerTypeCode() {
        return ledgerTypeCode;
    }


    /**
     * Sets the ledgerTypeCode value for this PriceAdjustmentLedger.
     * 
     * @param ledgerTypeCode
     */
    public void setLedgerTypeCode(java.lang.String ledgerTypeCode) {
        this.ledgerTypeCode = ledgerTypeCode;
    }


    /**
     * Gets the manualDiscount value for this PriceAdjustmentLedger.
     * 
     * @return manualDiscount
     */
    public java.lang.String getManualDiscount() {
        return manualDiscount;
    }


    /**
     * Sets the manualDiscount value for this PriceAdjustmentLedger.
     * 
     * @param manualDiscount
     */
    public void setManualDiscount(java.lang.String manualDiscount) {
        this.manualDiscount = manualDiscount;
    }


    /**
     * Gets the overridePriceCode value for this PriceAdjustmentLedger.
     * 
     * @return overridePriceCode
     */
    public java.lang.String getOverridePriceCode() {
        return overridePriceCode;
    }


    /**
     * Sets the overridePriceCode value for this PriceAdjustmentLedger.
     * 
     * @param overridePriceCode
     */
    public void setOverridePriceCode(java.lang.String overridePriceCode) {
        this.overridePriceCode = overridePriceCode;
    }


    /**
     * Gets the promotionDisplayControl value for this PriceAdjustmentLedger.
     * 
     * @return promotionDisplayControl
     */
    public java.lang.String getPromotionDisplayControl() {
        return promotionDisplayControl;
    }


    /**
     * Sets the promotionDisplayControl value for this PriceAdjustmentLedger.
     * 
     * @param promotionDisplayControl
     */
    public void setPromotionDisplayControl(java.lang.String promotionDisplayControl) {
        this.promotionDisplayControl = promotionDisplayControl;
    }


    /**
     * Gets the quantityFrom value for this PriceAdjustmentLedger.
     * 
     * @return quantityFrom
     */
    public java.math.BigDecimal getQuantityFrom() {
        return quantityFrom;
    }


    /**
     * Sets the quantityFrom value for this PriceAdjustmentLedger.
     * 
     * @param quantityFrom
     */
    public void setQuantityFrom(java.math.BigDecimal quantityFrom) {
        this.quantityFrom = quantityFrom;
    }


    /**
     * Gets the sequenceNumber value for this PriceAdjustmentLedger.
     * 
     * @return sequenceNumber
     */
    public java.lang.Integer getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this PriceAdjustmentLedger.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the unitOfMeasureCodeFactorValue value for this PriceAdjustmentLedger.
     * 
     * @return unitOfMeasureCodeFactorValue
     */
    public java.lang.String getUnitOfMeasureCodeFactorValue() {
        return unitOfMeasureCodeFactorValue;
    }


    /**
     * Sets the unitOfMeasureCodeFactorValue value for this PriceAdjustmentLedger.
     * 
     * @param unitOfMeasureCodeFactorValue
     */
    public void setUnitOfMeasureCodeFactorValue(java.lang.String unitOfMeasureCodeFactorValue) {
        this.unitOfMeasureCodeFactorValue = unitOfMeasureCodeFactorValue;
    }


    /**
     * Gets the valueBasedOn value for this PriceAdjustmentLedger.
     * 
     * @return valueBasedOn
     */
    public java.math.BigDecimal getValueBasedOn() {
        return valueBasedOn;
    }


    /**
     * Sets the valueBasedOn value for this PriceAdjustmentLedger.
     * 
     * @param valueBasedOn
     */
    public void setValueBasedOn(java.math.BigDecimal valueBasedOn) {
        this.valueBasedOn = valueBasedOn;
    }


    /**
     * Gets the valueFactor value for this PriceAdjustmentLedger.
     * 
     * @return valueFactor
     */
    public java.math.BigDecimal getValueFactor() {
        return valueFactor;
    }


    /**
     * Sets the valueFactor value for this PriceAdjustmentLedger.
     * 
     * @param valueFactor
     */
    public void setValueFactor(java.math.BigDecimal valueFactor) {
        this.valueFactor = valueFactor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceAdjustmentLedger)) return false;
        PriceAdjustmentLedger other = (PriceAdjustmentLedger) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adjustmentCalculation==null && other.getAdjustmentCalculation()==null) || 
             (this.adjustmentCalculation!=null &&
              this.adjustmentCalculation.equals(other.getAdjustmentCalculation()))) &&
            ((this.adjustmentGroup==null && other.getAdjustmentGroup()==null) || 
             (this.adjustmentGroup!=null &&
              this.adjustmentGroup.equals(other.getAdjustmentGroup()))) &&
            ((this.adjustmentMutuallyExclusive==null && other.getAdjustmentMutuallyExclusive()==null) || 
             (this.adjustmentMutuallyExclusive!=null &&
              this.adjustmentMutuallyExclusive.equals(other.getAdjustmentMutuallyExclusive()))) &&
            ((this.adjustmentReasonCode==null && other.getAdjustmentReasonCode()==null) || 
             (this.adjustmentReasonCode!=null &&
              this.adjustmentReasonCode.equals(other.getAdjustmentReasonCode()))) &&
            ((this.adjustmentScheduleCode==null && other.getAdjustmentScheduleCode()==null) || 
             (this.adjustmentScheduleCode!=null &&
              this.adjustmentScheduleCode.equals(other.getAdjustmentScheduleCode()))) &&
            ((this.adjustmentTypeCode==null && other.getAdjustmentTypeCode()==null) || 
             (this.adjustmentTypeCode!=null &&
              this.adjustmentTypeCode.equals(other.getAdjustmentTypeCode()))) &&
            ((this.amountAdjustmentDomestic==null && other.getAmountAdjustmentDomestic()==null) || 
             (this.amountAdjustmentDomestic!=null &&
              this.amountAdjustmentDomestic.equals(other.getAmountAdjustmentDomestic()))) &&
            ((this.amountAdjustmentForeign==null && other.getAmountAdjustmentForeign()==null) || 
             (this.amountAdjustmentForeign!=null &&
              this.amountAdjustmentForeign.equals(other.getAmountAdjustmentForeign()))) &&
            ((this.basisCode==null && other.getBasisCode()==null) || 
             (this.basisCode!=null &&
              this.basisCode.equals(other.getBasisCode()))) &&
            ((this.ledgerTypeCode==null && other.getLedgerTypeCode()==null) || 
             (this.ledgerTypeCode!=null &&
              this.ledgerTypeCode.equals(other.getLedgerTypeCode()))) &&
            ((this.manualDiscount==null && other.getManualDiscount()==null) || 
             (this.manualDiscount!=null &&
              this.manualDiscount.equals(other.getManualDiscount()))) &&
            ((this.overridePriceCode==null && other.getOverridePriceCode()==null) || 
             (this.overridePriceCode!=null &&
              this.overridePriceCode.equals(other.getOverridePriceCode()))) &&
            ((this.promotionDisplayControl==null && other.getPromotionDisplayControl()==null) || 
             (this.promotionDisplayControl!=null &&
              this.promotionDisplayControl.equals(other.getPromotionDisplayControl()))) &&
            ((this.quantityFrom==null && other.getQuantityFrom()==null) || 
             (this.quantityFrom!=null &&
              this.quantityFrom.equals(other.getQuantityFrom()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.unitOfMeasureCodeFactorValue==null && other.getUnitOfMeasureCodeFactorValue()==null) || 
             (this.unitOfMeasureCodeFactorValue!=null &&
              this.unitOfMeasureCodeFactorValue.equals(other.getUnitOfMeasureCodeFactorValue()))) &&
            ((this.valueBasedOn==null && other.getValueBasedOn()==null) || 
             (this.valueBasedOn!=null &&
              this.valueBasedOn.equals(other.getValueBasedOn()))) &&
            ((this.valueFactor==null && other.getValueFactor()==null) || 
             (this.valueFactor!=null &&
              this.valueFactor.equals(other.getValueFactor())));
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
        if (getAdjustmentCalculation() != null) {
            _hashCode += getAdjustmentCalculation().hashCode();
        }
        if (getAdjustmentGroup() != null) {
            _hashCode += getAdjustmentGroup().hashCode();
        }
        if (getAdjustmentMutuallyExclusive() != null) {
            _hashCode += getAdjustmentMutuallyExclusive().hashCode();
        }
        if (getAdjustmentReasonCode() != null) {
            _hashCode += getAdjustmentReasonCode().hashCode();
        }
        if (getAdjustmentScheduleCode() != null) {
            _hashCode += getAdjustmentScheduleCode().hashCode();
        }
        if (getAdjustmentTypeCode() != null) {
            _hashCode += getAdjustmentTypeCode().hashCode();
        }
        if (getAmountAdjustmentDomestic() != null) {
            _hashCode += getAmountAdjustmentDomestic().hashCode();
        }
        if (getAmountAdjustmentForeign() != null) {
            _hashCode += getAmountAdjustmentForeign().hashCode();
        }
        if (getBasisCode() != null) {
            _hashCode += getBasisCode().hashCode();
        }
        if (getLedgerTypeCode() != null) {
            _hashCode += getLedgerTypeCode().hashCode();
        }
        if (getManualDiscount() != null) {
            _hashCode += getManualDiscount().hashCode();
        }
        if (getOverridePriceCode() != null) {
            _hashCode += getOverridePriceCode().hashCode();
        }
        if (getPromotionDisplayControl() != null) {
            _hashCode += getPromotionDisplayControl().hashCode();
        }
        if (getQuantityFrom() != null) {
            _hashCode += getQuantityFrom().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getUnitOfMeasureCodeFactorValue() != null) {
            _hashCode += getUnitOfMeasureCodeFactorValue().hashCode();
        }
        if (getValueBasedOn() != null) {
            _hashCode += getValueBasedOn().hashCode();
        }
        if (getValueFactor() != null) {
            _hashCode += getValueFactor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceAdjustmentLedger.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "priceAdjustmentLedger"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentCalculation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentCalculation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentMutuallyExclusive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentMutuallyExclusive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentScheduleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentScheduleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountAdjustmentDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountAdjustmentDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountAdjustmentForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountAdjustmentForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basisCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basisCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ledgerTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ledgerTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manualDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overridePriceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overridePriceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionDisplayControl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promotionDisplayControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodeFactorValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodeFactorValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueBasedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueBasedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
