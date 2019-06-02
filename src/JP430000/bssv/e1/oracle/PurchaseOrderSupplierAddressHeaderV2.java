/**
 * PurchaseOrderSupplierAddressHeaderV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderSupplierAddressHeaderV2  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP430000.bssv.e1.oracle.PurchaseOrderAddress address;

    private JP430000.bssv.e1.oracle.Entity supplier;

    private java.lang.String supplierGLN;

    public PurchaseOrderSupplierAddressHeaderV2() {
    }

    public PurchaseOrderSupplierAddressHeaderV2(
           JP430000.bssv.e1.oracle.PurchaseOrderAddress address,
           JP430000.bssv.e1.oracle.Entity supplier,
           java.lang.String supplierGLN) {
        this.address = address;
        this.supplier = supplier;
        this.supplierGLN = supplierGLN;
    }


    /**
     * Gets the address value for this PurchaseOrderSupplierAddressHeaderV2.
     * 
     * @return address
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PurchaseOrderSupplierAddressHeaderV2.
     * 
     * @param address
     */
    public void setAddress(JP430000.bssv.e1.oracle.PurchaseOrderAddress address) {
        this.address = address;
    }


    /**
     * Gets the supplier value for this PurchaseOrderSupplierAddressHeaderV2.
     * 
     * @return supplier
     */
    public JP430000.bssv.e1.oracle.Entity getSupplier() {
        return supplier;
    }


    /**
     * Sets the supplier value for this PurchaseOrderSupplierAddressHeaderV2.
     * 
     * @param supplier
     */
    public void setSupplier(JP430000.bssv.e1.oracle.Entity supplier) {
        this.supplier = supplier;
    }


    /**
     * Gets the supplierGLN value for this PurchaseOrderSupplierAddressHeaderV2.
     * 
     * @return supplierGLN
     */
    public java.lang.String getSupplierGLN() {
        return supplierGLN;
    }


    /**
     * Sets the supplierGLN value for this PurchaseOrderSupplierAddressHeaderV2.
     * 
     * @param supplierGLN
     */
    public void setSupplierGLN(java.lang.String supplierGLN) {
        this.supplierGLN = supplierGLN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderSupplierAddressHeaderV2)) return false;
        PurchaseOrderSupplierAddressHeaderV2 other = (PurchaseOrderSupplierAddressHeaderV2) obj;
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
              this.supplier.equals(other.getSupplier()))) &&
            ((this.supplierGLN==null && other.getSupplierGLN()==null) || 
             (this.supplierGLN!=null &&
              this.supplierGLN.equals(other.getSupplierGLN())));
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
        if (getSupplierGLN() != null) {
            _hashCode += getSupplierGLN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderSupplierAddressHeaderV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderSupplierAddressHeaderV2"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supplierGLN"));
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
