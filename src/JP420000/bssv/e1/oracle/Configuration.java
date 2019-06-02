/**
 * Configuration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class Configuration  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String businessUnit;

    private java.lang.String description1;

    private JP420000.bssv.e1.oracle.ItemGroupCustomer item;

    private JP420000.bssv.e1.oracle.ItemGroupCustomer itemParent;

    private java.lang.String lineTypeCode;

    private java.math.BigDecimal quantityComponent;

    private JP420000.bssv.e1.oracle.Segment[] segment;

    private java.lang.String unitOfMeasureCodeComponent;

    public Configuration() {
    }

    public Configuration(
           java.lang.String businessUnit,
           java.lang.String description1,
           JP420000.bssv.e1.oracle.ItemGroupCustomer item,
           JP420000.bssv.e1.oracle.ItemGroupCustomer itemParent,
           java.lang.String lineTypeCode,
           java.math.BigDecimal quantityComponent,
           JP420000.bssv.e1.oracle.Segment[] segment,
           java.lang.String unitOfMeasureCodeComponent) {
        this.businessUnit = businessUnit;
        this.description1 = description1;
        this.item = item;
        this.itemParent = itemParent;
        this.lineTypeCode = lineTypeCode;
        this.quantityComponent = quantityComponent;
        this.segment = segment;
        this.unitOfMeasureCodeComponent = unitOfMeasureCodeComponent;
    }


    /**
     * Gets the businessUnit value for this Configuration.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this Configuration.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the description1 value for this Configuration.
     * 
     * @return description1
     */
    public java.lang.String getDescription1() {
        return description1;
    }


    /**
     * Sets the description1 value for this Configuration.
     * 
     * @param description1
     */
    public void setDescription1(java.lang.String description1) {
        this.description1 = description1;
    }


    /**
     * Gets the item value for this Configuration.
     * 
     * @return item
     */
    public JP420000.bssv.e1.oracle.ItemGroupCustomer getItem() {
        return item;
    }


    /**
     * Sets the item value for this Configuration.
     * 
     * @param item
     */
    public void setItem(JP420000.bssv.e1.oracle.ItemGroupCustomer item) {
        this.item = item;
    }


    /**
     * Gets the itemParent value for this Configuration.
     * 
     * @return itemParent
     */
    public JP420000.bssv.e1.oracle.ItemGroupCustomer getItemParent() {
        return itemParent;
    }


    /**
     * Sets the itemParent value for this Configuration.
     * 
     * @param itemParent
     */
    public void setItemParent(JP420000.bssv.e1.oracle.ItemGroupCustomer itemParent) {
        this.itemParent = itemParent;
    }


    /**
     * Gets the lineTypeCode value for this Configuration.
     * 
     * @return lineTypeCode
     */
    public java.lang.String getLineTypeCode() {
        return lineTypeCode;
    }


    /**
     * Sets the lineTypeCode value for this Configuration.
     * 
     * @param lineTypeCode
     */
    public void setLineTypeCode(java.lang.String lineTypeCode) {
        this.lineTypeCode = lineTypeCode;
    }


    /**
     * Gets the quantityComponent value for this Configuration.
     * 
     * @return quantityComponent
     */
    public java.math.BigDecimal getQuantityComponent() {
        return quantityComponent;
    }


    /**
     * Sets the quantityComponent value for this Configuration.
     * 
     * @param quantityComponent
     */
    public void setQuantityComponent(java.math.BigDecimal quantityComponent) {
        this.quantityComponent = quantityComponent;
    }


    /**
     * Gets the segment value for this Configuration.
     * 
     * @return segment
     */
    public JP420000.bssv.e1.oracle.Segment[] getSegment() {
        return segment;
    }


    /**
     * Sets the segment value for this Configuration.
     * 
     * @param segment
     */
    public void setSegment(JP420000.bssv.e1.oracle.Segment[] segment) {
        this.segment = segment;
    }

    public JP420000.bssv.e1.oracle.Segment getSegment(int i) {
        return this.segment[i];
    }

    public void setSegment(int i, JP420000.bssv.e1.oracle.Segment _value) {
        this.segment[i] = _value;
    }


    /**
     * Gets the unitOfMeasureCodeComponent value for this Configuration.
     * 
     * @return unitOfMeasureCodeComponent
     */
    public java.lang.String getUnitOfMeasureCodeComponent() {
        return unitOfMeasureCodeComponent;
    }


    /**
     * Sets the unitOfMeasureCodeComponent value for this Configuration.
     * 
     * @param unitOfMeasureCodeComponent
     */
    public void setUnitOfMeasureCodeComponent(java.lang.String unitOfMeasureCodeComponent) {
        this.unitOfMeasureCodeComponent = unitOfMeasureCodeComponent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Configuration)) return false;
        Configuration other = (Configuration) obj;
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
            ((this.description1==null && other.getDescription1()==null) || 
             (this.description1!=null &&
              this.description1.equals(other.getDescription1()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.itemParent==null && other.getItemParent()==null) || 
             (this.itemParent!=null &&
              this.itemParent.equals(other.getItemParent()))) &&
            ((this.lineTypeCode==null && other.getLineTypeCode()==null) || 
             (this.lineTypeCode!=null &&
              this.lineTypeCode.equals(other.getLineTypeCode()))) &&
            ((this.quantityComponent==null && other.getQuantityComponent()==null) || 
             (this.quantityComponent!=null &&
              this.quantityComponent.equals(other.getQuantityComponent()))) &&
            ((this.segment==null && other.getSegment()==null) || 
             (this.segment!=null &&
              java.util.Arrays.equals(this.segment, other.getSegment()))) &&
            ((this.unitOfMeasureCodeComponent==null && other.getUnitOfMeasureCodeComponent()==null) || 
             (this.unitOfMeasureCodeComponent!=null &&
              this.unitOfMeasureCodeComponent.equals(other.getUnitOfMeasureCodeComponent())));
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
        if (getDescription1() != null) {
            _hashCode += getDescription1().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getItemParent() != null) {
            _hashCode += getItemParent().hashCode();
        }
        if (getLineTypeCode() != null) {
            _hashCode += getLineTypeCode().hashCode();
        }
        if (getQuantityComponent() != null) {
            _hashCode += getQuantityComponent().hashCode();
        }
        if (getSegment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitOfMeasureCodeComponent() != null) {
            _hashCode += getUnitOfMeasureCodeComponent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Configuration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "configuration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description1"));
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
        elemField.setFieldName("itemParent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "itemGroupCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "segment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodeComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodeComponent"));
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
