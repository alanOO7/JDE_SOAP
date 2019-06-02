/**
 * ShowDetailItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ShowDetailItem  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String itemCatalog;

    private java.lang.Integer itemId;

    private java.lang.String itemProduct;

    private java.lang.String itemUPCEAN;

    public ShowDetailItem() {
    }

    public ShowDetailItem(
           java.lang.String itemCatalog,
           java.lang.Integer itemId,
           java.lang.String itemProduct,
           java.lang.String itemUPCEAN) {
        this.itemCatalog = itemCatalog;
        this.itemId = itemId;
        this.itemProduct = itemProduct;
        this.itemUPCEAN = itemUPCEAN;
    }


    /**
     * Gets the itemCatalog value for this ShowDetailItem.
     * 
     * @return itemCatalog
     */
    public java.lang.String getItemCatalog() {
        return itemCatalog;
    }


    /**
     * Sets the itemCatalog value for this ShowDetailItem.
     * 
     * @param itemCatalog
     */
    public void setItemCatalog(java.lang.String itemCatalog) {
        this.itemCatalog = itemCatalog;
    }


    /**
     * Gets the itemId value for this ShowDetailItem.
     * 
     * @return itemId
     */
    public java.lang.Integer getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ShowDetailItem.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Integer itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemProduct value for this ShowDetailItem.
     * 
     * @return itemProduct
     */
    public java.lang.String getItemProduct() {
        return itemProduct;
    }


    /**
     * Sets the itemProduct value for this ShowDetailItem.
     * 
     * @param itemProduct
     */
    public void setItemProduct(java.lang.String itemProduct) {
        this.itemProduct = itemProduct;
    }


    /**
     * Gets the itemUPCEAN value for this ShowDetailItem.
     * 
     * @return itemUPCEAN
     */
    public java.lang.String getItemUPCEAN() {
        return itemUPCEAN;
    }


    /**
     * Sets the itemUPCEAN value for this ShowDetailItem.
     * 
     * @param itemUPCEAN
     */
    public void setItemUPCEAN(java.lang.String itemUPCEAN) {
        this.itemUPCEAN = itemUPCEAN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowDetailItem)) return false;
        ShowDetailItem other = (ShowDetailItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.itemCatalog==null && other.getItemCatalog()==null) || 
             (this.itemCatalog!=null &&
              this.itemCatalog.equals(other.getItemCatalog()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.itemProduct==null && other.getItemProduct()==null) || 
             (this.itemProduct!=null &&
              this.itemProduct.equals(other.getItemProduct()))) &&
            ((this.itemUPCEAN==null && other.getItemUPCEAN()==null) || 
             (this.itemUPCEAN!=null &&
              this.itemUPCEAN.equals(other.getItemUPCEAN())));
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
        if (getItemCatalog() != null) {
            _hashCode += getItemCatalog().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getItemProduct() != null) {
            _hashCode += getItemProduct().hashCode();
        }
        if (getItemUPCEAN() != null) {
            _hashCode += getItemUPCEAN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShowDetailItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showDetailItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCatalog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemCatalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemUPCEAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemUPCEAN"));
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
