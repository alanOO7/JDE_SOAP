/**
 * Warehouse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class Warehouse  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP420000.bssv.e1.oracle.WarehouseAddress address;

    private java.lang.Integer warehouse;

    private java.lang.String warehouseDescriptive;

    public Warehouse() {
    }

    public Warehouse(
           JP420000.bssv.e1.oracle.WarehouseAddress address,
           java.lang.Integer warehouse,
           java.lang.String warehouseDescriptive) {
        this.address = address;
        this.warehouse = warehouse;
        this.warehouseDescriptive = warehouseDescriptive;
    }


    /**
     * Gets the address value for this Warehouse.
     * 
     * @return address
     */
    public JP420000.bssv.e1.oracle.WarehouseAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Warehouse.
     * 
     * @param address
     */
    public void setAddress(JP420000.bssv.e1.oracle.WarehouseAddress address) {
        this.address = address;
    }


    /**
     * Gets the warehouse value for this Warehouse.
     * 
     * @return warehouse
     */
    public java.lang.Integer getWarehouse() {
        return warehouse;
    }


    /**
     * Sets the warehouse value for this Warehouse.
     * 
     * @param warehouse
     */
    public void setWarehouse(java.lang.Integer warehouse) {
        this.warehouse = warehouse;
    }


    /**
     * Gets the warehouseDescriptive value for this Warehouse.
     * 
     * @return warehouseDescriptive
     */
    public java.lang.String getWarehouseDescriptive() {
        return warehouseDescriptive;
    }


    /**
     * Sets the warehouseDescriptive value for this Warehouse.
     * 
     * @param warehouseDescriptive
     */
    public void setWarehouseDescriptive(java.lang.String warehouseDescriptive) {
        this.warehouseDescriptive = warehouseDescriptive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Warehouse)) return false;
        Warehouse other = (Warehouse) obj;
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
            ((this.warehouse==null && other.getWarehouse()==null) || 
             (this.warehouse!=null &&
              this.warehouse.equals(other.getWarehouse()))) &&
            ((this.warehouseDescriptive==null && other.getWarehouseDescriptive()==null) || 
             (this.warehouseDescriptive!=null &&
              this.warehouseDescriptive.equals(other.getWarehouseDescriptive())));
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
        if (getWarehouse() != null) {
            _hashCode += getWarehouse().hashCode();
        }
        if (getWarehouseDescriptive() != null) {
            _hashCode += getWarehouseDescriptive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Warehouse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "warehouse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "warehouseAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warehouse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warehouse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warehouseDescriptive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warehouseDescriptive"));
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
