/**
 * ProductOutV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ProductOutV3  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP420000.bssv.e1.oracle.AvailabilityV2[] availability;

    private JP420000.bssv.e1.oracle.ItemGroupCustomer item;

    private java.math.BigDecimal priceExtended;

    private java.math.BigDecimal priceUnit;

    private java.math.BigDecimal quantityOrdered;

    private java.math.BigDecimal taxAmountExtended;

    private java.math.BigDecimal taxAmountUnit;

    private java.math.BigDecimal taxedPriceExtended;

    private java.math.BigDecimal taxedPriceUnit;

    private java.lang.String unitOfMeasureCodePricing;

    private java.lang.String unitOfMeasureCodeTransaction;

    public ProductOutV3() {
    }

    public ProductOutV3(
           JP420000.bssv.e1.oracle.AvailabilityV2[] availability,
           JP420000.bssv.e1.oracle.ItemGroupCustomer item,
           java.math.BigDecimal priceExtended,
           java.math.BigDecimal priceUnit,
           java.math.BigDecimal quantityOrdered,
           java.math.BigDecimal taxAmountExtended,
           java.math.BigDecimal taxAmountUnit,
           java.math.BigDecimal taxedPriceExtended,
           java.math.BigDecimal taxedPriceUnit,
           java.lang.String unitOfMeasureCodePricing,
           java.lang.String unitOfMeasureCodeTransaction) {
        this.availability = availability;
        this.item = item;
        this.priceExtended = priceExtended;
        this.priceUnit = priceUnit;
        this.quantityOrdered = quantityOrdered;
        this.taxAmountExtended = taxAmountExtended;
        this.taxAmountUnit = taxAmountUnit;
        this.taxedPriceExtended = taxedPriceExtended;
        this.taxedPriceUnit = taxedPriceUnit;
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }


    /**
     * Gets the availability value for this ProductOutV3.
     * 
     * @return availability
     */
    public JP420000.bssv.e1.oracle.AvailabilityV2[] getAvailability() {
        return availability;
    }


    /**
     * Sets the availability value for this ProductOutV3.
     * 
     * @param availability
     */
    public void setAvailability(JP420000.bssv.e1.oracle.AvailabilityV2[] availability) {
        this.availability = availability;
    }

    public JP420000.bssv.e1.oracle.AvailabilityV2 getAvailability(int i) {
        return this.availability[i];
    }

    public void setAvailability(int i, JP420000.bssv.e1.oracle.AvailabilityV2 _value) {
        this.availability[i] = _value;
    }


    /**
     * Gets the item value for this ProductOutV3.
     * 
     * @return item
     */
    public JP420000.bssv.e1.oracle.ItemGroupCustomer getItem() {
        return item;
    }


    /**
     * Sets the item value for this ProductOutV3.
     * 
     * @param item
     */
    public void setItem(JP420000.bssv.e1.oracle.ItemGroupCustomer item) {
        this.item = item;
    }


    /**
     * Gets the priceExtended value for this ProductOutV3.
     * 
     * @return priceExtended
     */
    public java.math.BigDecimal getPriceExtended() {
        return priceExtended;
    }


    /**
     * Sets the priceExtended value for this ProductOutV3.
     * 
     * @param priceExtended
     */
    public void setPriceExtended(java.math.BigDecimal priceExtended) {
        this.priceExtended = priceExtended;
    }


    /**
     * Gets the priceUnit value for this ProductOutV3.
     * 
     * @return priceUnit
     */
    public java.math.BigDecimal getPriceUnit() {
        return priceUnit;
    }


    /**
     * Sets the priceUnit value for this ProductOutV3.
     * 
     * @param priceUnit
     */
    public void setPriceUnit(java.math.BigDecimal priceUnit) {
        this.priceUnit = priceUnit;
    }


    /**
     * Gets the quantityOrdered value for this ProductOutV3.
     * 
     * @return quantityOrdered
     */
    public java.math.BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }


    /**
     * Sets the quantityOrdered value for this ProductOutV3.
     * 
     * @param quantityOrdered
     */
    public void setQuantityOrdered(java.math.BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }


    /**
     * Gets the taxAmountExtended value for this ProductOutV3.
     * 
     * @return taxAmountExtended
     */
    public java.math.BigDecimal getTaxAmountExtended() {
        return taxAmountExtended;
    }


    /**
     * Sets the taxAmountExtended value for this ProductOutV3.
     * 
     * @param taxAmountExtended
     */
    public void setTaxAmountExtended(java.math.BigDecimal taxAmountExtended) {
        this.taxAmountExtended = taxAmountExtended;
    }


    /**
     * Gets the taxAmountUnit value for this ProductOutV3.
     * 
     * @return taxAmountUnit
     */
    public java.math.BigDecimal getTaxAmountUnit() {
        return taxAmountUnit;
    }


    /**
     * Sets the taxAmountUnit value for this ProductOutV3.
     * 
     * @param taxAmountUnit
     */
    public void setTaxAmountUnit(java.math.BigDecimal taxAmountUnit) {
        this.taxAmountUnit = taxAmountUnit;
    }


    /**
     * Gets the taxedPriceExtended value for this ProductOutV3.
     * 
     * @return taxedPriceExtended
     */
    public java.math.BigDecimal getTaxedPriceExtended() {
        return taxedPriceExtended;
    }


    /**
     * Sets the taxedPriceExtended value for this ProductOutV3.
     * 
     * @param taxedPriceExtended
     */
    public void setTaxedPriceExtended(java.math.BigDecimal taxedPriceExtended) {
        this.taxedPriceExtended = taxedPriceExtended;
    }


    /**
     * Gets the taxedPriceUnit value for this ProductOutV3.
     * 
     * @return taxedPriceUnit
     */
    public java.math.BigDecimal getTaxedPriceUnit() {
        return taxedPriceUnit;
    }


    /**
     * Sets the taxedPriceUnit value for this ProductOutV3.
     * 
     * @param taxedPriceUnit
     */
    public void setTaxedPriceUnit(java.math.BigDecimal taxedPriceUnit) {
        this.taxedPriceUnit = taxedPriceUnit;
    }


    /**
     * Gets the unitOfMeasureCodePricing value for this ProductOutV3.
     * 
     * @return unitOfMeasureCodePricing
     */
    public java.lang.String getUnitOfMeasureCodePricing() {
        return unitOfMeasureCodePricing;
    }


    /**
     * Sets the unitOfMeasureCodePricing value for this ProductOutV3.
     * 
     * @param unitOfMeasureCodePricing
     */
    public void setUnitOfMeasureCodePricing(java.lang.String unitOfMeasureCodePricing) {
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
    }


    /**
     * Gets the unitOfMeasureCodeTransaction value for this ProductOutV3.
     * 
     * @return unitOfMeasureCodeTransaction
     */
    public java.lang.String getUnitOfMeasureCodeTransaction() {
        return unitOfMeasureCodeTransaction;
    }


    /**
     * Sets the unitOfMeasureCodeTransaction value for this ProductOutV3.
     * 
     * @param unitOfMeasureCodeTransaction
     */
    public void setUnitOfMeasureCodeTransaction(java.lang.String unitOfMeasureCodeTransaction) {
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductOutV3)) return false;
        ProductOutV3 other = (ProductOutV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.availability==null && other.getAvailability()==null) || 
             (this.availability!=null &&
              java.util.Arrays.equals(this.availability, other.getAvailability()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.priceExtended==null && other.getPriceExtended()==null) || 
             (this.priceExtended!=null &&
              this.priceExtended.equals(other.getPriceExtended()))) &&
            ((this.priceUnit==null && other.getPriceUnit()==null) || 
             (this.priceUnit!=null &&
              this.priceUnit.equals(other.getPriceUnit()))) &&
            ((this.quantityOrdered==null && other.getQuantityOrdered()==null) || 
             (this.quantityOrdered!=null &&
              this.quantityOrdered.equals(other.getQuantityOrdered()))) &&
            ((this.taxAmountExtended==null && other.getTaxAmountExtended()==null) || 
             (this.taxAmountExtended!=null &&
              this.taxAmountExtended.equals(other.getTaxAmountExtended()))) &&
            ((this.taxAmountUnit==null && other.getTaxAmountUnit()==null) || 
             (this.taxAmountUnit!=null &&
              this.taxAmountUnit.equals(other.getTaxAmountUnit()))) &&
            ((this.taxedPriceExtended==null && other.getTaxedPriceExtended()==null) || 
             (this.taxedPriceExtended!=null &&
              this.taxedPriceExtended.equals(other.getTaxedPriceExtended()))) &&
            ((this.taxedPriceUnit==null && other.getTaxedPriceUnit()==null) || 
             (this.taxedPriceUnit!=null &&
              this.taxedPriceUnit.equals(other.getTaxedPriceUnit()))) &&
            ((this.unitOfMeasureCodePricing==null && other.getUnitOfMeasureCodePricing()==null) || 
             (this.unitOfMeasureCodePricing!=null &&
              this.unitOfMeasureCodePricing.equals(other.getUnitOfMeasureCodePricing()))) &&
            ((this.unitOfMeasureCodeTransaction==null && other.getUnitOfMeasureCodeTransaction()==null) || 
             (this.unitOfMeasureCodeTransaction!=null &&
              this.unitOfMeasureCodeTransaction.equals(other.getUnitOfMeasureCodeTransaction())));
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
        if (getAvailability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailability(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getPriceExtended() != null) {
            _hashCode += getPriceExtended().hashCode();
        }
        if (getPriceUnit() != null) {
            _hashCode += getPriceUnit().hashCode();
        }
        if (getQuantityOrdered() != null) {
            _hashCode += getQuantityOrdered().hashCode();
        }
        if (getTaxAmountExtended() != null) {
            _hashCode += getTaxAmountExtended().hashCode();
        }
        if (getTaxAmountUnit() != null) {
            _hashCode += getTaxAmountUnit().hashCode();
        }
        if (getTaxedPriceExtended() != null) {
            _hashCode += getTaxedPriceExtended().hashCode();
        }
        if (getTaxedPriceUnit() != null) {
            _hashCode += getTaxedPriceUnit().hashCode();
        }
        if (getUnitOfMeasureCodePricing() != null) {
            _hashCode += getUnitOfMeasureCodePricing().hashCode();
        }
        if (getUnitOfMeasureCodeTransaction() != null) {
            _hashCode += getUnitOfMeasureCodeTransaction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductOutV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "productOutV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "availabilityV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "itemGroupCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceExtended");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceExtended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmountExtended");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxAmountExtended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmountUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxAmountUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxedPriceExtended");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxedPriceExtended"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxedPriceUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxedPriceUnit"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodeTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodeTransaction"));
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
