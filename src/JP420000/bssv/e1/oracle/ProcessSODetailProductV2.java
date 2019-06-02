/**
 * ProcessSODetailProductV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ProcessSODetailProductV2  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP420000.bssv.e1.oracle.ConfigurationV2[] configuration;

    private java.lang.String description1;

    private java.lang.String description2;

    private JP420000.bssv.e1.oracle.ItemGroupCustomer item;

    private java.math.BigDecimal itemVolume;

    private java.math.BigDecimal itemWeight;

    private java.lang.String location;

    private java.lang.String lotNumber;

    private java.lang.String unitOfMeasureCodeVolume;

    private java.lang.String unitOfMeasureCodeWeight;

    public ProcessSODetailProductV2() {
    }

    public ProcessSODetailProductV2(
           JP420000.bssv.e1.oracle.ConfigurationV2[] configuration,
           java.lang.String description1,
           java.lang.String description2,
           JP420000.bssv.e1.oracle.ItemGroupCustomer item,
           java.math.BigDecimal itemVolume,
           java.math.BigDecimal itemWeight,
           java.lang.String location,
           java.lang.String lotNumber,
           java.lang.String unitOfMeasureCodeVolume,
           java.lang.String unitOfMeasureCodeWeight) {
        this.configuration = configuration;
        this.description1 = description1;
        this.description2 = description2;
        this.item = item;
        this.itemVolume = itemVolume;
        this.itemWeight = itemWeight;
        this.location = location;
        this.lotNumber = lotNumber;
        this.unitOfMeasureCodeVolume = unitOfMeasureCodeVolume;
        this.unitOfMeasureCodeWeight = unitOfMeasureCodeWeight;
    }


    /**
     * Gets the configuration value for this ProcessSODetailProductV2.
     * 
     * @return configuration
     */
    public JP420000.bssv.e1.oracle.ConfigurationV2[] getConfiguration() {
        return configuration;
    }


    /**
     * Sets the configuration value for this ProcessSODetailProductV2.
     * 
     * @param configuration
     */
    public void setConfiguration(JP420000.bssv.e1.oracle.ConfigurationV2[] configuration) {
        this.configuration = configuration;
    }

    public JP420000.bssv.e1.oracle.ConfigurationV2 getConfiguration(int i) {
        return this.configuration[i];
    }

    public void setConfiguration(int i, JP420000.bssv.e1.oracle.ConfigurationV2 _value) {
        this.configuration[i] = _value;
    }


    /**
     * Gets the description1 value for this ProcessSODetailProductV2.
     * 
     * @return description1
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this ProcessSODetailProductV2.
     * 
     * @param description1
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the description2 value for this ProcessSODetailProductV2.
     * 
     * @return description2
     */
    public java.lang.String getDescription2() {
        return description2;
    }


    /**
     * Sets the description2 value for this ProcessSODetailProductV2.
     * 
     * @param description2
     */
    public void setDescription2(java.lang.String description2) {
        this.description2 = description2;
    }


    /**
     * Gets the item value for this ProcessSODetailProductV2.
     * 
     * @return item
     */
    public JP420000.bssv.e1.oracle.ItemGroupCustomer getItem() {
        return item;
    }


    /**
     * Sets the item value for this ProcessSODetailProductV2.
     * 
     * @param item
     */
    public void setItem(JP420000.bssv.e1.oracle.ItemGroupCustomer item) {
        this.item = item;
    }


    /**
     * Gets the itemVolume value for this ProcessSODetailProductV2.
     * 
     * @return itemVolume
     */
    public java.math.BigDecimal getItemVolume() {
        return itemVolume;
    }


    /**
     * Sets the itemVolume value for this ProcessSODetailProductV2.
     * 
     * @param itemVolume
     */
    public void setItemVolume(java.math.BigDecimal itemVolume) {
        this.itemVolume = itemVolume;
    }


    /**
     * Gets the itemWeight value for this ProcessSODetailProductV2.
     * 
     * @return itemWeight
     */
    public java.math.BigDecimal getItemWeight() {
        return itemWeight;
    }


    /**
     * Sets the itemWeight value for this ProcessSODetailProductV2.
     * 
     * @param itemWeight
     */
    public void setItemWeight(java.math.BigDecimal itemWeight) {
        this.itemWeight = itemWeight;
    }


    /**
     * Gets the location value for this ProcessSODetailProductV2.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ProcessSODetailProductV2.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the lotNumber value for this ProcessSODetailProductV2.
     * 
     * @return lotNumber
     */
    public java.lang.String getLotNumber() {
        return lotNumber;
    }


    /**
     * Sets the lotNumber value for this ProcessSODetailProductV2.
     * 
     * @param lotNumber
     */
    public void setLotNumber(java.lang.String lotNumber) {
        this.lotNumber = lotNumber;
    }


    /**
     * Gets the unitOfMeasureCodeVolume value for this ProcessSODetailProductV2.
     * 
     * @return unitOfMeasureCodeVolume
     */
    public java.lang.String getUnitOfMeasureCodeVolume() {
        return unitOfMeasureCodeVolume;
    }


    /**
     * Sets the unitOfMeasureCodeVolume value for this ProcessSODetailProductV2.
     * 
     * @param unitOfMeasureCodeVolume
     */
    public void setUnitOfMeasureCodeVolume(java.lang.String unitOfMeasureCodeVolume) {
        this.unitOfMeasureCodeVolume = unitOfMeasureCodeVolume;
    }


    /**
     * Gets the unitOfMeasureCodeWeight value for this ProcessSODetailProductV2.
     * 
     * @return unitOfMeasureCodeWeight
     */
    public java.lang.String getUnitOfMeasureCodeWeight() {
        return unitOfMeasureCodeWeight;
    }


    /**
     * Sets the unitOfMeasureCodeWeight value for this ProcessSODetailProductV2.
     * 
     * @param unitOfMeasureCodeWeight
     */
    public void setUnitOfMeasureCodeWeight(java.lang.String unitOfMeasureCodeWeight) {
        this.unitOfMeasureCodeWeight = unitOfMeasureCodeWeight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessSODetailProductV2)) return false;
        ProcessSODetailProductV2 other = (ProcessSODetailProductV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.configuration==null && other.getConfiguration()==null) || 
             (this.configuration!=null &&
              java.util.Arrays.equals(this.configuration, other.getConfiguration()))) &&
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.description2==null && other.getDescription2()==null) || 
             (this.description2!=null &&
              this.description2.equals(other.getDescription2()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.itemVolume==null && other.getItemVolume()==null) || 
             (this.itemVolume!=null &&
              this.itemVolume.equals(other.getItemVolume()))) &&
            ((this.itemWeight==null && other.getItemWeight()==null) || 
             (this.itemWeight!=null &&
              this.itemWeight.equals(other.getItemWeight()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.lotNumber==null && other.getLotNumber()==null) || 
             (this.lotNumber!=null &&
              this.lotNumber.equals(other.getLotNumber()))) &&
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
        if (getConfiguration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfiguration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfiguration(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getDescription2() != null) {
            _hashCode += getDescription2().hashCode();
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
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLotNumber() != null) {
            _hashCode += getLotNumber().hashCode();
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
        new org.apache.axis.description.TypeDesc(ProcessSODetailProductV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailProductV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "configurationV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description2"));
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
