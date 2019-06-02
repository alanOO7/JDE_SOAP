/**
 * ItemListPriceRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ItemListPriceRecord  extends JP420000.bssv.e1.oracle.ItemListPriceShared  implements java.io.Serializable {
    private java.lang.String location;

    private java.lang.String lotGrade;

    private java.lang.String lotNumber;

    private java.math.BigDecimal lotPotency;

    private java.math.BigDecimal priceList;

    public ItemListPriceRecord() {
    }

    public ItemListPriceRecord(
           java.lang.String businessUnit,
           java.lang.String currencyCode,
           JP420000.bssv.e1.oracle.Entity customer,
           java.util.Calendar dateEffective,
           java.util.Calendar dateExpiration,
           JP420000.bssv.e1.oracle.ItemGroupCustomer item,
           java.lang.String unitOfMeasureCode,
           java.lang.String location,
           java.lang.String lotGrade,
           java.lang.String lotNumber,
           java.math.BigDecimal lotPotency,
           java.math.BigDecimal priceList) {
        super(
            businessUnit,
            currencyCode,
            customer,
            dateEffective,
            dateExpiration,
            item,
            unitOfMeasureCode);
        this.location = location;
        this.lotGrade = lotGrade;
        this.lotNumber = lotNumber;
        this.lotPotency = lotPotency;
        this.priceList = priceList;
    }


    /**
     * Gets the location value for this ItemListPriceRecord.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemListPriceRecord.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the lotGrade value for this ItemListPriceRecord.
     * 
     * @return lotGrade
     */
    public java.lang.String getLotGrade() {
        return lotGrade;
    }


    /**
     * Sets the lotGrade value for this ItemListPriceRecord.
     * 
     * @param lotGrade
     */
    public void setLotGrade(java.lang.String lotGrade) {
        this.lotGrade = lotGrade;
    }


    /**
     * Gets the lotNumber value for this ItemListPriceRecord.
     * 
     * @return lotNumber
     */
    public java.lang.String getLotNumber() {
        return lotNumber;
    }


    /**
     * Sets the lotNumber value for this ItemListPriceRecord.
     * 
     * @param lotNumber
     */
    public void setLotNumber(java.lang.String lotNumber) {
        this.lotNumber = lotNumber;
    }


    /**
     * Gets the lotPotency value for this ItemListPriceRecord.
     * 
     * @return lotPotency
     */
    public java.math.BigDecimal getLotPotency() {
        return lotPotency;
    }


    /**
     * Sets the lotPotency value for this ItemListPriceRecord.
     * 
     * @param lotPotency
     */
    public void setLotPotency(java.math.BigDecimal lotPotency) {
        this.lotPotency = lotPotency;
    }


    /**
     * Gets the priceList value for this ItemListPriceRecord.
     * 
     * @return priceList
     */
    public java.math.BigDecimal getPriceList() {
        return priceList;
    }


    /**
     * Sets the priceList value for this ItemListPriceRecord.
     * 
     * @param priceList
     */
    public void setPriceList(java.math.BigDecimal priceList) {
        this.priceList = priceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemListPriceRecord)) return false;
        ItemListPriceRecord other = (ItemListPriceRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.lotGrade==null && other.getLotGrade()==null) || 
             (this.lotGrade!=null &&
              this.lotGrade.equals(other.getLotGrade()))) &&
            ((this.lotNumber==null && other.getLotNumber()==null) || 
             (this.lotNumber!=null &&
              this.lotNumber.equals(other.getLotNumber()))) &&
            ((this.lotPotency==null && other.getLotPotency()==null) || 
             (this.lotPotency!=null &&
              this.lotPotency.equals(other.getLotPotency()))) &&
            ((this.priceList==null && other.getPriceList()==null) || 
             (this.priceList!=null &&
              this.priceList.equals(other.getPriceList())));
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
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLotGrade() != null) {
            _hashCode += getLotGrade().hashCode();
        }
        if (getLotNumber() != null) {
            _hashCode += getLotNumber().hashCode();
        }
        if (getLotPotency() != null) {
            _hashCode += getLotPotency().hashCode();
        }
        if (getPriceList() != null) {
            _hashCode += getPriceList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemListPriceRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "itemListPriceRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lotGrade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lotGrade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lotNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lotPotency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lotPotency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceList"));
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
