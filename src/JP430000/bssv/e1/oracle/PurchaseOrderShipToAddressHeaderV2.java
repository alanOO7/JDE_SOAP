/**
 * PurchaseOrderShipToAddressHeaderV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderShipToAddressHeaderV2  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP430000.bssv.e1.oracle.PurchaseOrderAddress address;

    private JP430000.bssv.e1.oracle.Entity shipTo;

    private java.lang.String shipToGLN;

    public PurchaseOrderShipToAddressHeaderV2() {
    }

    public PurchaseOrderShipToAddressHeaderV2(
           JP430000.bssv.e1.oracle.PurchaseOrderAddress address,
           JP430000.bssv.e1.oracle.Entity shipTo,
           java.lang.String shipToGLN) {
        this.address = address;
        this.shipTo = shipTo;
        this.shipToGLN = shipToGLN;
    }


    /**
     * Gets the address value for this PurchaseOrderShipToAddressHeaderV2.
     * 
     * @return address
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PurchaseOrderShipToAddressHeaderV2.
     * 
     * @param address
     */
    public void setAddress(JP430000.bssv.e1.oracle.PurchaseOrderAddress address) {
        this.address = address;
    }


    /**
     * Gets the shipTo value for this PurchaseOrderShipToAddressHeaderV2.
     * 
     * @return shipTo
     */
    public JP430000.bssv.e1.oracle.Entity getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this PurchaseOrderShipToAddressHeaderV2.
     * 
     * @param shipTo
     */
    public void setShipTo(JP430000.bssv.e1.oracle.Entity shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the shipToGLN value for this PurchaseOrderShipToAddressHeaderV2.
     * 
     * @return shipToGLN
     */
    public java.lang.String getShipToGLN() {
        return shipToGLN;
    }


    /**
     * Sets the shipToGLN value for this PurchaseOrderShipToAddressHeaderV2.
     * 
     * @param shipToGLN
     */
    public void setShipToGLN(java.lang.String shipToGLN) {
        this.shipToGLN = shipToGLN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderShipToAddressHeaderV2)) return false;
        PurchaseOrderShipToAddressHeaderV2 other = (PurchaseOrderShipToAddressHeaderV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.shipToGLN==null && other.getShipToGLN()==null) || 
             (this.shipToGLN!=null &&
              this.shipToGLN.equals(other.getShipToGLN())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getShipToGLN() != null) {
            _hashCode += getShipToGLN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderShipToAddressHeaderV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShipToAddressHeaderV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipToGLN"));
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
