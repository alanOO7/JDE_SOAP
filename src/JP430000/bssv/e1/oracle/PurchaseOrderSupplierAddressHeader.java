/**
 * PurchaseOrderSupplierAddressHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderSupplierAddressHeader  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP430000.bssv.e1.oracle.PurchaseOrderAddress address;

    private JP430000.bssv.e1.oracle.Entity supplier;

    public PurchaseOrderSupplierAddressHeader() {
    }

    public PurchaseOrderSupplierAddressHeader(
           JP430000.bssv.e1.oracle.PurchaseOrderAddress address,
           JP430000.bssv.e1.oracle.Entity supplier) {
        this.address = address;
        this.supplier = supplier;
    }


    /**
     * Gets the address value for this PurchaseOrderSupplierAddressHeader.
     * 
     * @return address
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PurchaseOrderSupplierAddressHeader.
     * 
     * @param address
     */
    public void setAddress(JP430000.bssv.e1.oracle.PurchaseOrderAddress address) {
        this.address = address;
    }


    /**
     * Gets the supplier value for this PurchaseOrderSupplierAddressHeader.
     * 
     * @return supplier
     */
    public JP430000.bssv.e1.oracle.Entity getSupplier() {
        return supplier;
    }


    /**
     * Sets the supplier value for this PurchaseOrderSupplierAddressHeader.
     * 
     * @param supplier
     */
    public void setSupplier(JP430000.bssv.e1.oracle.Entity supplier) {
        this.supplier = supplier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderSupplierAddressHeader)) return false;
        PurchaseOrderSupplierAddressHeader other = (PurchaseOrderSupplierAddressHeader) obj;
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
            ((this.supplier==null && other.getSupplier()==null) || 
             (this.supplier!=null &&
              this.supplier.equals(other.getSupplier())));
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
        if (getSupplier() != null) {
            _hashCode += getSupplier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderSupplierAddressHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderSupplierAddressHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
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
