/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class Product  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String businessUnit;

    private JP420000.bssv.e1.oracle.ItemGroupCustomer item;

    private java.math.BigDecimal itemVolume;

    private java.math.BigDecimal itemWeight;

    private java.lang.String lineType;

    private java.lang.String location;

    private java.lang.String lotNumber;

    private JP420000.bssv.e1.oracle.Entity shipTo;

    private java.lang.String unitOfMeasureCodeVolume;

    private java.lang.String unitOfMeasureCodeWeight;

    public Product() {
    }

    public Product(
           java.lang.String businessUnit,
           JP420000.bssv.e1.oracle.ItemGroupCustomer item,
           java.math.BigDecimal itemVolume,
           java.math.BigDecimal itemWeight,
           java.lang.String lineType,
           java.lang.String location,
           java.lang.String lotNumber,
           JP420000.bssv.e1.oracle.Entity shipTo,
           java.lang.String unitOfMeasureCodeVolume,
           java.lang.String unitOfMeasureCodeWeight) {
        this.businessUnit = businessUnit;
        this.item = item;
        this.itemVolume = itemVolume;
        this.itemWeight = itemWeight;
        this.lineType = lineType;
        this.location = location;
        this.lotNumber = lotNumber;
        this.shipTo = shipTo;
        this.unitOfMeasureCodeVolume = unitOfMeasureCodeVolume;
        this.unitOfMeasureCodeWeight = unitOfMeasureCodeWeight;
    }


    /**
     * Gets the businessUnit value for this Product.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this Product.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the item value for this Product.
     * 
     * @return item
     */
    public JP420000.bssv.e1.oracle.ItemGroupCustomer getItem() {
        return item;
    }


    /**
     * Sets the item value for this Product.
     * 
     * @param item
     */
    public void setItem(JP420000.bssv.e1.oracle.ItemGroupCustomer item) {
        this.item = item;
    }


    /**
     * Gets the itemVolume value for this Product.
     * 
     * @return itemVolume
     */
    public java.math.BigDecimal getItemVolume() {
        return itemVolume;
    }


    /**
     * Sets the itemVolume value for this Product.
     * 
     * @param itemVolume
     */
    public void setItemVolume(java.math.BigDecimal itemVolume) {
        this.itemVolume = itemVolume;
    }


    /**
     * Gets the itemWeight value for this Product.
     * 
     * @return itemWeight
     */
    public java.math.BigDecimal getItemWeight() {
        return itemWeight;
    }


    /**
     * Sets the itemWeight value for this Product.
     * 
     * @param itemWeight
     */
    public void setItemWeight(java.math.BigDecimal itemWeight) {
        this.itemWeight = itemWeight;
    }


    /**
     * Gets the lineType value for this Product.
     * 
     * @return lineType
     */
    public java.lang.String getLineType() {
        return lineType;
    }


    /**
     * Sets the lineType value for this Product.
     * 
     * @param lineType
     */
    public void setLineType(java.lang.String lineType) {
        this.lineType = lineType;
    }


    /**
     * Gets the location value for this Product.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Product.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the lotNumber value for this Product.
     * 
     * @return lotNumber
     */
    public java.lang.String getLotNumber() {
        return lotNumber;
    }


    /**
     * Sets the lotNumber value for this Product.
     * 
     * @param lotNumber
     */
    public void setLotNumber(java.lang.String lotNumber) {
        this.lotNumber = lotNumber;
    }


    /**
     * Gets the shipTo value for this Product.
     * 
     * @return shipTo
     */
    public JP420000.bssv.e1.oracle.Entity getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this Product.
     * 
     * @param shipTo
     */
    public void setShipTo(JP420000.bssv.e1.oracle.Entity shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the unitOfMeasureCodeVolume value for this Product.
     * 
     * @return unitOfMeasureCodeVolume
     */
    public java.lang.String getUnitOfMeasureCodeVolume() {
        return unitOfMeasureCodeVolume;
    }


    /**
     * Sets the unitOfMeasureCodeVolume value for this Product.
     * 
     * @param unitOfMeasureCodeVolume
     */
    public void setUnitOfMeasureCodeVolume(java.lang.String unitOfMeasureCodeVolume) {
        this.unitOfMeasureCodeVolume = unitOfMeasureCodeVolume;
    }


    /**
     * Gets the unitOfMeasureCodeWeight value for this Product.
     * 
     * @return unitOfMeasureCodeWeight
     */
    public java.lang.String getUnitOfMeasureCodeWeight() {
        return unitOfMeasureCodeWeight;
    }


    /**
     * Sets the unitOfMeasureCodeWeight value for this Product.
     * 
     * @param unitOfMeasureCodeWeight
     */
    public void setUnitOfMeasureCodeWeight(java.lang.String unitOfMeasureCodeWeight) {
        this.unitOfMeasureCodeWeight = unitOfMeasureCodeWeight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
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
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.itemVolume==null && other.getItemVolume()==null) || 
             (this.itemVolume!=null &&
              this.itemVolume.equals(other.getItemVolume()))) &&
            ((this.itemWeight==null && other.getItemWeight()==null) || 
             (this.itemWeight!=null &&
              this.itemWeight.equals(other.getItemWeight()))) &&
            ((this.lineType==null && other.getLineType()==null) || 
             (this.lineType!=null &&
              this.lineType.equals(other.getLineType()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.lotNumber==null && other.getLotNumber()==null) || 
             (this.lotNumber!=null &&
              this.lotNumber.equals(other.getLotNumber()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.unitOfMeasureCodeVolume==null && other.getUnitOfMeasureCodeVolume()==null) || 
             (this.unitOfMeasureCodeVolume!=null &&
              this.unitOfMeasureCodeVolume.equals(other.getUnitOfMeasureCodeVolume()))) &&
            ((this.unitOfMeasureCodeWeight==null && other.getUnitOfMeasureCodeWeight()==null) || 
             (this.unitOfMeasureCodeWeight!=null &&
              this.unitOfMeasureCodeWeight.equals(other.getUnitOfMeasureCodeWeight())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getItemVolume() != null) {
            _hashCode += getItemVolume().hashCode();
        }
        if (getItemWeight() != null) {
            _hashCode += getItemWeight().hashCode();
        }
        if (getLineType() != null) {
            _hashCode += getLineType().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLotNumber() != null) {
            _hashCode += getLotNumber().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getUnitOfMeasureCodeVolume() != null) {
            _hashCode += getUnitOfMeasureCodeVolume().hashCode();
        }
        if (getUnitOfMeasureCodeWeight() != null) {
            _hashCode += getUnitOfMeasureCodeWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("itemVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
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
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodeVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodeVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodeWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodeWeight"));
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
