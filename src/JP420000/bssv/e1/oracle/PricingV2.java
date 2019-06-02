/**
 * PricingV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class PricingV2  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String adjustmentScheduleCode;

    private java.util.Calendar datePriceEffective;

    private java.lang.Boolean isZeroPriceOverride;

    private java.lang.Boolean isZeroTaxedPriceOverride;

    private java.lang.String priceCode1;

    private java.lang.String priceCode2;

    private java.lang.String priceCode3;

    private java.math.BigDecimal priceExtendedDomestic;

    private java.math.BigDecimal priceExtendedForeign;

    private java.math.BigDecimal priceUnitDomestic;

    private java.math.BigDecimal priceUnitForeign;

    private java.math.BigDecimal taxedPriceExtendedDomestic;

    private java.math.BigDecimal taxedPriceExtendedForeign;

    private java.math.BigDecimal taxedPriceUnitDomestic;

    private java.math.BigDecimal taxedPriceUnitForeign;

    private java.lang.String unitOfMeasureCodePricing;

    public PricingV2() {
    }

    public PricingV2(
           java.lang.String adjustmentScheduleCode,
           java.util.Calendar datePriceEffective,
           java.lang.Boolean isZeroPriceOverride,
           java.lang.Boolean isZeroTaxedPriceOverride,
           java.lang.String priceCode1,
           java.lang.String priceCode2,
           java.lang.String priceCode3,
           java.math.BigDecimal priceExtendedDomestic,
           java.math.BigDecimal priceExtendedForeign,
           java.math.BigDecimal priceUnitDomestic,
           java.math.BigDecimal priceUnitForeign,
           java.math.BigDecimal taxedPriceExtendedDomestic,
           java.math.BigDecimal taxedPriceExtendedForeign,
           java.math.BigDecimal taxedPriceUnitDomestic,
           java.math.BigDecimal taxedPriceUnitForeign,
           java.lang.String unitOfMeasureCodePricing) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
        this.datePriceEffective = datePriceEffective;
        this.isZeroPriceOverride = isZeroPriceOverride;
        this.isZeroTaxedPriceOverride = isZeroTaxedPriceOverride;
        this.priceCode1 = priceCode1;
        this.priceCode2 = priceCode2;
        this.priceCode3 = priceCode3;
        this.priceExtendedDomestic = priceExtendedDomestic;
        this.priceExtendedForeign = priceExtendedForeign;
        this.priceUnitDomestic = priceUnitDomestic;
        this.priceUnitForeign = priceUnitForeign;
        this.taxedPriceExtendedDomestic = taxedPriceExtendedDomestic;
        this.taxedPriceExtendedForeign = taxedPriceExtendedForeign;
        this.taxedPriceUnitDomestic = taxedPriceUnitDomestic;
        this.taxedPriceUnitForeign = taxedPriceUnitForeign;
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
    }


    /**
     * Gets the adjustmentScheduleCode value for this PricingV2.
     * 
     * @return adjustmentScheduleCode
     */
    public java.lang.String getAdjustmentScheduleCode() {
        return adjustmentScheduleCode;
    }


    /**
     * Sets the adjustmentScheduleCode value for this PricingV2.
     * 
     * @param adjustmentScheduleCode
     */
    public void setAdjustmentScheduleCode(java.lang.String adjustmentScheduleCode) {
        this.adjustmentScheduleCode = adjustmentScheduleCode;
    }


    /**
     * Gets the datePriceEffective value for this PricingV2.
     * 
     * @return datePriceEffective
     */
    public java.util.Calendar getDatePriceEffective() {
        return datePriceEffective;
    }


    /**
     * Sets the datePriceEffective value for this PricingV2.
     * 
     * @param datePriceEffective
     */
    public void setDatePriceEffective(java.util.Calendar datePriceEffective) {
        this.datePriceEffective = datePriceEffective;
    }


    /**
     * Gets the isZeroPriceOverride value for this PricingV2.
     * 
     * @return isZeroPriceOverride
     */
    public java.lang.Boolean getIsZeroPriceOverride() {
        return isZeroPriceOverride;
    }


    /**
     * Sets the isZeroPriceOverride value for this PricingV2.
     * 
     * @param isZeroPriceOverride
     */
    public void setIsZeroPriceOverride(java.lang.Boolean isZeroPriceOverride) {
        this.isZeroPriceOverride = isZeroPriceOverride;
    }


    /**
     * Gets the isZeroTaxedPriceOverride value for this PricingV2.
     * 
     * @return isZeroTaxedPriceOverride
     */
    public java.lang.Boolean getIsZeroTaxedPriceOverride() {
        return isZeroTaxedPriceOverride;
    }


    /**
     * Sets the isZeroTaxedPriceOverride value for this PricingV2.
     * 
     * @param isZeroTaxedPriceOverride
     */
    public void setIsZeroTaxedPriceOverride(java.lang.Boolean isZeroTaxedPriceOverride) {
        this.isZeroTaxedPriceOverride = isZeroTaxedPriceOverride;
    }


    /**
     * Gets the priceCode1 value for this PricingV2.
     * 
     * @return priceCode1
     */
    public java.lang.String getPriceCode1() {
        return priceCode1;
    }


    /**
     * Sets the priceCode1 value for this PricingV2.
     * 
     * @param priceCode1
     */
    public void setPriceCode1(java.lang.String priceCode1) {
        this.priceCode1 = priceCode1;
    }


    /**
     * Gets the priceCode2 value for this PricingV2.
     * 
     * @return priceCode2
     */
    public java.lang.String getPriceCode2() {
        return priceCode2;
    }


    /**
     * Sets the priceCode2 value for this PricingV2.
     * 
     * @param priceCode2
     */
    public void setPriceCode2(java.lang.String priceCode2) {
        this.priceCode2 = priceCode2;
    }


    /**
     * Gets the priceCode3 value for this PricingV2.
     * 
     * @return priceCode3
     */
    public java.lang.String getPriceCode3() {
        return priceCode3;
    }


    /**
     * Sets the priceCode3 value for this PricingV2.
     * 
     * @param priceCode3
     */
    public void setPriceCode3(java.lang.String priceCode3) {
        this.priceCode3 = priceCode3;
    }


    /**
     * Gets the priceExtendedDomestic value for this PricingV2.
     * 
     * @return priceExtendedDomestic
     */
    public java.math.BigDecimal getPriceExtendedDomestic() {
        return priceExtendedDomestic;
    }


    /**
     * Sets the priceExtendedDomestic value for this PricingV2.
     * 
     * @param priceExtendedDomestic
     */
    public void setPriceExtendedDomestic(java.math.BigDecimal priceExtendedDomestic) {
        this.priceExtendedDomestic = priceExtendedDomestic;
    }


    /**
     * Gets the priceExtendedForeign value for this PricingV2.
     * 
     * @return priceExtendedForeign
     */
    public java.math.BigDecimal getPriceExtendedForeign() {
        return priceExtendedForeign;
    }


    /**
     * Sets the priceExtendedForeign value for this PricingV2.
     * 
     * @param priceExtendedForeign
     */
    public void setPriceExtendedForeign(java.math.BigDecimal priceExtendedForeign) {
        this.priceExtendedForeign = priceExtendedForeign;
    }


    /**
     * Gets the priceUnitDomestic value for this PricingV2.
     * 
     * @return priceUnitDomestic
     */
    public java.math.BigDecimal getPriceUnitDomestic() {
        return priceUnitDomestic;
    }


    /**
     * Sets the priceUnitDomestic value for this PricingV2.
     * 
     * @param priceUnitDomestic
     */
    public void setPriceUnitDomestic(java.math.BigDecimal priceUnitDomestic) {
        this.priceUnitDomestic = priceUnitDomestic;
    }


    /**
     * Gets the priceUnitForeign value for this PricingV2.
     * 
     * @return priceUnitForeign
     */
    public java.math.BigDecimal getPriceUnitForeign() {
        return priceUnitForeign;
    }


    /**
     * Sets the priceUnitForeign value for this PricingV2.
     * 
     * @param priceUnitForeign
     */
    public void setPriceUnitForeign(java.math.BigDecimal priceUnitForeign) {
        this.priceUnitForeign = priceUnitForeign;
    }


    /**
     * Gets the taxedPriceExtendedDomestic value for this PricingV2.
     * 
     * @return taxedPriceExtendedDomestic
     */
    public java.math.BigDecimal getTaxedPriceExtendedDomestic() {
        return taxedPriceExtendedDomestic;
    }


    /**
     * Sets the taxedPriceExtendedDomestic value for this PricingV2.
     * 
     * @param taxedPriceExtendedDomestic
     */
    public void setTaxedPriceExtendedDomestic(java.math.BigDecimal taxedPriceExtendedDomestic) {
        this.taxedPriceExtendedDomestic = taxedPriceExtendedDomestic;
    }


    /**
     * Gets the taxedPriceExtendedForeign value for this PricingV2.
     * 
     * @return taxedPriceExtendedForeign
     */
    public java.math.BigDecimal getTaxedPriceExtendedForeign() {
        return taxedPriceExtendedForeign;
    }


    /**
     * Sets the taxedPriceExtendedForeign value for this PricingV2.
     * 
     * @param taxedPriceExtendedForeign
     */
    public void setTaxedPriceExtendedForeign(java.math.BigDecimal taxedPriceExtendedForeign) {
        this.taxedPriceExtendedForeign = taxedPriceExtendedForeign;
    }


    /**
     * Gets the taxedPriceUnitDomestic value for this PricingV2.
     * 
     * @return taxedPriceUnitDomestic
     */
    public java.math.BigDecimal getTaxedPriceUnitDomestic() {
        return taxedPriceUnitDomestic;
    }


    /**
     * Sets the taxedPriceUnitDomestic value for this PricingV2.
     * 
     * @param taxedPriceUnitDomestic
     */
    public void setTaxedPriceUnitDomestic(java.math.BigDecimal taxedPriceUnitDomestic) {
        this.taxedPriceUnitDomestic = taxedPriceUnitDomestic;
    }


    /**
     * Gets the taxedPriceUnitForeign value for this PricingV2.
     * 
     * @return taxedPriceUnitForeign
     */
    public java.math.BigDecimal getTaxedPriceUnitForeign() {
        return taxedPriceUnitForeign;
    }


    /**
     * Sets the taxedPriceUnitForeign value for this PricingV2.
     * 
     * @param taxedPriceUnitForeign
     */
    public void setTaxedPriceUnitForeign(java.math.BigDecimal taxedPriceUnitForeign) {
        this.taxedPriceUnitForeign = taxedPriceUnitForeign;
    }


    /**
     * Gets the unitOfMeasureCodePricing value for this PricingV2.
     * 
     * @return unitOfMeasureCodePricing
     */
    public java.lang.String getUnitOfMeasureCodePricing() {
        return unitOfMeasureCodePricing;
    }


    /**
     * Sets the unitOfMeasureCodePricing value for this PricingV2.
     * 
     * @param unitOfMeasureCodePricing
     */
    public void setUnitOfMeasureCodePricing(java.lang.String unitOfMeasureCodePricing) {
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricingV2)) return false;
        PricingV2 other = (PricingV2) obj;
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
            ((this.datePriceEffective==null && other.getDatePriceEffective()==null) || 
             (this.datePriceEffective!=null &&
              this.datePriceEffective.equals(other.getDatePriceEffective()))) &&
            ((this.isZeroPriceOverride==null && other.getIsZeroPriceOverride()==null) || 
             (this.isZeroPriceOverride!=null &&
              this.isZeroPriceOverride.equals(other.getIsZeroPriceOverride()))) &&
            ((this.isZeroTaxedPriceOverride==null && other.getIsZeroTaxedPriceOverride()==null) || 
             (this.isZeroTaxedPriceOverride!=null &&
              this.isZeroTaxedPriceOverride.equals(other.getIsZeroTaxedPriceOverride()))) &&
            ((this.priceCode1==null && other.getPriceCode1()==null) || 
             (this.priceCode1!=null &&
              this.priceCode1.equals(other.getPriceCode1()))) &&
            ((this.priceCode2==null && other.getPriceCode2()==null) || 
             (this.priceCode2!=null &&
              this.priceCode2.equals(other.getPriceCode2()))) &&
            ((this.priceCode3==null && other.getPriceCode3()==null) || 
             (this.priceCode3!=null &&
              this.priceCode3.equals(other.getPriceCode3()))) &&
            ((this.priceExtendedDomestic==null && other.getPriceExtendedDomestic()==null) || 
             (this.priceExtendedDomestic!=null &&
              this.priceExtendedDomestic.equals(other.getPriceExtendedDomestic()))) &&
            ((this.priceExtendedForeign==null && other.getPriceExtendedForeign()==null) || 
             (this.priceExtendedForeign!=null &&
              this.priceExtendedForeign.equals(other.getPriceExtendedForeign()))) &&
            ((this.priceUnitDomestic==null && other.getPriceUnitDomestic()==null) || 
             (this.priceUnitDomestic!=null &&
              this.priceUnitDomestic.equals(other.getPriceUnitDomestic()))) &&
            ((this.priceUnitForeign==null && other.getPriceUnitForeign()==null) || 
             (this.priceUnitForeign!=null &&
              this.priceUnitForeign.equals(other.getPriceUnitForeign()))) &&
            ((this.taxedPriceExtendedDomestic==null && other.getTaxedPriceExtendedDomestic()==null) || 
             (this.taxedPriceExtendedDomestic!=null &&
              this.taxedPriceExtendedDomestic.equals(other.getTaxedPriceExtendedDomestic()))) &&
            ((this.taxedPriceExtendedForeign==null && other.getTaxedPriceExtendedForeign()==null) || 
             (this.taxedPriceExtendedForeign!=null &&
              this.taxedPriceExtendedForeign.equals(other.getTaxedPriceExtendedForeign()))) &&
            ((this.taxedPriceUnitDomestic==null && other.getTaxedPriceUnitDomestic()==null) || 
             (this.taxedPriceUnitDomestic!=null &&
              this.taxedPriceUnitDomestic.equals(other.getTaxedPriceUnitDomestic()))) &&
            ((this.taxedPriceUnitForeign==null && other.getTaxedPriceUnitForeign()==null) || 
             (this.taxedPriceUnitForeign!=null &&
              this.taxedPriceUnitForeign.equals(other.getTaxedPriceUnitForeign()))) &&
            ((this.unitOfMeasureCodePricing==null && other.getUnitOfMeasureCodePricing()==null) || 
             (this.unitOfMeasureCodePricing!=null &&
              this.unitOfMeasureCodePricing.equals(other.getUnitOfMeasureCodePricing())));
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
        if (getDatePriceEffective() != null) {
            _hashCode += getDatePriceEffective().hashCode();
        }
        if (getIsZeroPriceOverride() != null) {
            _hashCode += getIsZeroPriceOverride().hashCode();
        }
        if (getIsZeroTaxedPriceOverride() != null) {
            _hashCode += getIsZeroTaxedPriceOverride().hashCode();
        }
        if (getPriceCode1() != null) {
            _hashCode += getPriceCode1().hashCode();
        }
        if (getPriceCode2() != null) {
            _hashCode += getPriceCode2().hashCode();
        }
        if (getPriceCode3() != null) {
            _hashCode += getPriceCode3().hashCode();
        }
        if (getPriceExtendedDomestic() != null) {
            _hashCode += getPriceExtendedDomestic().hashCode();
        }
        if (getPriceExtendedForeign() != null) {
            _hashCode += getPriceExtendedForeign().hashCode();
        }
        if (getPriceUnitDomestic() != null) {
            _hashCode += getPriceUnitDomestic().hashCode();
        }
        if (getPriceUnitForeign() != null) {
            _hashCode += getPriceUnitForeign().hashCode();
        }
        if (getTaxedPriceExtendedDomestic() != null) {
            _hashCode += getTaxedPriceExtendedDomestic().hashCode();
        }
        if (getTaxedPriceExtendedForeign() != null) {
            _hashCode += getTaxedPriceExtendedForeign().hashCode();
        }
        if (getTaxedPriceUnitDomestic() != null) {
            _hashCode += getTaxedPriceUnitDomestic().hashCode();
        }
        if (getTaxedPriceUnitForeign() != null) {
            _hashCode += getTaxedPriceUnitForeign().hashCode();
        }
        if (getUnitOfMeasureCodePricing() != null) {
            _hashCode += getUnitOfMeasureCodePricing().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PricingV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "pricingV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentScheduleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustmentScheduleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePriceEffective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePriceEffective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isZeroPriceOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isZeroPriceOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isZeroTaxedPriceOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isZeroTaxedPriceOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceCode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceCode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceCode3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceCode3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceExtendedDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceExtendedDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceExtendedForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceExtendedForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceUnitDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceUnitDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceUnitForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceUnitForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxedPriceExtendedDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxedPriceExtendedDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxedPriceExtendedForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxedPriceExtendedForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxedPriceUnitDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxedPriceUnitDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxedPriceUnitForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxedPriceUnitForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodePricing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodePricing"));
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
