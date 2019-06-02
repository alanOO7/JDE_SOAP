/**
 * PurchaseOrderDeliveryHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderDeliveryHeader  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP430000.bssv.e1.oracle.Entity carrier;

    private java.lang.String deliveryInstruction1;

    private java.lang.String deliveryInstruction2;

    private java.lang.String freightHandlingCode;

    private java.lang.String landedCostRuleCode;

    public PurchaseOrderDeliveryHeader() {
    }

    public PurchaseOrderDeliveryHeader(
           JP430000.bssv.e1.oracle.Entity carrier,
           java.lang.String deliveryInstruction1,
           java.lang.String deliveryInstruction2,
           java.lang.String freightHandlingCode,
           java.lang.String landedCostRuleCode) {
        this.carrier = carrier;
        this.deliveryInstruction1 = deliveryInstruction1;
        this.deliveryInstruction2 = deliveryInstruction2;
        this.freightHandlingCode = freightHandlingCode;
        this.landedCostRuleCode = landedCostRuleCode;
    }


    /**
     * Gets the carrier value for this PurchaseOrderDeliveryHeader.
     * 
     * @return carrier
     */
    public JP430000.bssv.e1.oracle.Entity getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this PurchaseOrderDeliveryHeader.
     * 
     * @param carrier
     */
    public void setCarrier(JP430000.bssv.e1.oracle.Entity carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the deliveryInstruction1 value for this PurchaseOrderDeliveryHeader.
     * 
     * @return deliveryInstruction1
     */
    public java.lang.String getDeliveryInstruction1() {
        return deliveryInstruction1;
    }


    /**
     * Sets the deliveryInstruction1 value for this PurchaseOrderDeliveryHeader.
     * 
     * @param deliveryInstruction1
     */
    public void setDeliveryInstruction1(java.lang.String deliveryInstruction1) {
        this.deliveryInstruction1 = deliveryInstruction1;
    }


    /**
     * Gets the deliveryInstruction2 value for this PurchaseOrderDeliveryHeader.
     * 
     * @return deliveryInstruction2
     */
    public java.lang.String getDeliveryInstruction2() {
        return deliveryInstruction2;
    }


    /**
     * Sets the deliveryInstruction2 value for this PurchaseOrderDeliveryHeader.
     * 
     * @param deliveryInstruction2
     */
    public void setDeliveryInstruction2(java.lang.String deliveryInstruction2) {
        this.deliveryInstruction2 = deliveryInstruction2;
    }


    /**
     * Gets the freightHandlingCode value for this PurchaseOrderDeliveryHeader.
     * 
     * @return freightHandlingCode
     */
    public java.lang.String getFreightHandlingCode() {
        return freightHandlingCode;
    }


    /**
     * Sets the freightHandlingCode value for this PurchaseOrderDeliveryHeader.
     * 
     * @param freightHandlingCode
     */
    public void setFreightHandlingCode(java.lang.String freightHandlingCode) {
        this.freightHandlingCode = freightHandlingCode;
    }


    /**
     * Gets the landedCostRuleCode value for this PurchaseOrderDeliveryHeader.
     * 
     * @return landedCostRuleCode
     */
    public java.lang.String getLandedCostRuleCode() {
        return landedCostRuleCode;
    }


    /**
     * Sets the landedCostRuleCode value for this PurchaseOrderDeliveryHeader.
     * 
     * @param landedCostRuleCode
     */
    public void setLandedCostRuleCode(java.lang.String landedCostRuleCode) {
        this.landedCostRuleCode = landedCostRuleCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderDeliveryHeader)) return false;
        PurchaseOrderDeliveryHeader other = (PurchaseOrderDeliveryHeader) obj;
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
            ((this.deliveryInstruction1==null && other.getDeliveryInstruction1()==null) || 
             (this.deliveryInstruction1!=null &&
              this.deliveryInstruction1.equals(other.getDeliveryInstruction1()))) &&
            ((this.deliveryInstruction2==null && other.getDeliveryInstruction2()==null) || 
             (this.deliveryInstruction2!=null &&
              this.deliveryInstruction2.equals(other.getDeliveryInstruction2()))) &&
            ((this.freightHandlingCode==null && other.getFreightHandlingCode()==null) || 
             (this.freightHandlingCode!=null &&
              this.freightHandlingCode.equals(other.getFreightHandlingCode()))) &&
            ((this.landedCostRuleCode==null && other.getLandedCostRuleCode()==null) || 
             (this.landedCostRuleCode!=null &&
              this.landedCostRuleCode.equals(other.getLandedCostRuleCode())));
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
        if (getDeliveryInstruction1() != null) {
            _hashCode += getDeliveryInstruction1().hashCode();
        }
        if (getDeliveryInstruction2() != null) {
            _hashCode += getDeliveryInstruction2().hashCode();
        }
        if (getFreightHandlingCode() != null) {
            _hashCode += getFreightHandlingCode().hashCode();
        }
        if (getLandedCostRuleCode() != null) {
            _hashCode += getLandedCostRuleCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderDeliveryHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDeliveryHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
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
        elemField.setFieldName("freightHandlingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freightHandlingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostRuleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "landedCostRuleCode"));
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
