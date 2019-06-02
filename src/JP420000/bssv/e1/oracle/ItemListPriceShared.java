/**
 * ItemListPriceShared.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ItemListPriceShared  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String businessUnit;

    private java.lang.String currencyCode;

    private JP420000.bssv.e1.oracle.Entity customer;

    private java.util.Calendar dateEffective;

    private java.util.Calendar dateExpiration;

    private JP420000.bssv.e1.oracle.ItemGroupCustomer item;

    private java.lang.String unitOfMeasureCode;

    public ItemListPriceShared() {
    }

    public ItemListPriceShared(
           java.lang.String businessUnit,
           java.lang.String currencyCode,
           JP420000.bssv.e1.oracle.Entity customer,
           java.util.Calendar dateEffective,
           java.util.Calendar dateExpiration,
           JP420000.bssv.e1.oracle.ItemGroupCustomer item,
           java.lang.String unitOfMeasureCode) {
        this.businessUnit = businessUnit;
        this.currencyCode = currencyCode;
        this.customer = customer;
        this.dateEffective = dateEffective;
        this.dateExpiration = dateExpiration;
        this.item = item;
        this.unitOfMeasureCode = unitOfMeasureCode;
    }


    /**
     * Gets the businessUnit value for this ItemListPriceShared.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this ItemListPriceShared.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the currencyCode value for this ItemListPriceShared.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this ItemListPriceShared.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the customer value for this ItemListPriceShared.
     * 
     * @return customer
     */
    public JP420000.bssv.e1.oracle.Entity getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this ItemListPriceShared.
     * 
     * @param customer
     */
    public void setCustomer(JP420000.bssv.e1.oracle.Entity customer) {
        this.customer = customer;
    }


    /**
     * Gets the dateEffective value for this ItemListPriceShared.
     * 
     * @return dateEffective
     */
    public java.util.Calendar getDateEffective() {
        return dateEffective;
    }


    /**
     * Sets the dateEffective value for this ItemListPriceShared.
     * 
     * @param dateEffective
     */
    public void setDateEffective(java.util.Calendar dateEffective) {
        this.dateEffective = dateEffective;
    }


    /**
     * Gets the dateExpiration value for this ItemListPriceShared.
     * 
     * @return dateExpiration
     */
    public java.util.Calendar getDateExpiration() {
        return dateExpiration;
    }


    /**
     * Sets the dateExpiration value for this ItemListPriceShared.
     * 
     * @param dateExpiration
     */
    public void setDateExpiration(java.util.Calendar dateExpiration) {
        this.dateExpiration = dateExpiration;
    }


    /**
     * Gets the item value for this ItemListPriceShared.
     * 
     * @return item
     */
    public JP420000.bssv.e1.oracle.ItemGroupCustomer getItem() {
        return item;
    }


    /**
     * Sets the item value for this ItemListPriceShared.
     * 
     * @param item
     */
    public void setItem(JP420000.bssv.e1.oracle.ItemGroupCustomer item) {
        this.item = item;
    }


    /**
     * Gets the unitOfMeasureCode value for this ItemListPriceShared.
     * 
     * @return unitOfMeasureCode
     */
    public java.lang.String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }


    /**
     * Sets the unitOfMeasureCode value for this ItemListPriceShared.
     * 
     * @param unitOfMeasureCode
     */
    public void setUnitOfMeasureCode(java.lang.String unitOfMeasureCode) {
        this.unitOfMeasureCode = unitOfMeasureCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemListPriceShared)) return false;
        ItemListPriceShared other = (ItemListPriceShared) obj;
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
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.dateEffective==null && other.getDateEffective()==null) || 
             (this.dateEffective!=null &&
              this.dateEffective.equals(other.getDateEffective()))) &&
            ((this.dateExpiration==null && other.getDateExpiration()==null) || 
             (this.dateExpiration!=null &&
              this.dateExpiration.equals(other.getDateExpiration()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.unitOfMeasureCode==null && other.getUnitOfMeasureCode()==null) || 
             (this.unitOfMeasureCode!=null &&
              this.unitOfMeasureCode.equals(other.getUnitOfMeasureCode())));
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getDateEffective() != null) {
            _hashCode += getDateEffective().hashCode();
        }
        if (getDateExpiration() != null) {
            _hashCode += getDateExpiration().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getUnitOfMeasureCode() != null) {
            _hashCode += getUnitOfMeasureCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemListPriceShared.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "itemListPriceShared"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
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
        elemField.setFieldName("dateEffective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateEffective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "itemGroupCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCode"));
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
