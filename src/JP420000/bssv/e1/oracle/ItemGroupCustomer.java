/**
 * ItemGroupCustomer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ItemGroupCustomer  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String itemCatalog;

    private java.lang.String itemCustomer;

    private java.lang.String itemDescription;

    private java.lang.String itemFreeForm;

    private java.lang.Integer itemId;

    private java.lang.String itemProduct;

    private java.lang.String itemUOMPrimary;

    private java.lang.String itemUOMSecondary;

    public ItemGroupCustomer() {
    }

    public ItemGroupCustomer(
           java.lang.String itemCatalog,
           java.lang.String itemCustomer,
           java.lang.String itemDescription,
           java.lang.String itemFreeForm,
           java.lang.Integer itemId,
           java.lang.String itemProduct,
           java.lang.String itemUOMPrimary,
           java.lang.String itemUOMSecondary) {
        this.itemCatalog = itemCatalog;
        this.itemCustomer = itemCustomer;
        this.itemDescription = itemDescription;
        this.itemFreeForm = itemFreeForm;
        this.itemId = itemId;
        this.itemProduct = itemProduct;
        this.itemUOMPrimary = itemUOMPrimary;
        this.itemUOMSecondary = itemUOMSecondary;
    }


    /**
     * Gets the itemCatalog value for this ItemGroupCustomer.
     * 
     * @return itemCatalog
     */
    public java.lang.String getItemCatalog() {
        return itemCatalog;
    }


    /**
     * Sets the itemCatalog value for this ItemGroupCustomer.
     * 
     * @param itemCatalog
     */
    public void setItemCatalog(java.lang.String itemCatalog) {
        this.itemCatalog = itemCatalog;
    }


    /**
     * Gets the itemCustomer value for this ItemGroupCustomer.
     * 
     * @return itemCustomer
     */
    public java.lang.String getItemCustomer() {
        return itemCustomer;
    }


    /**
     * Sets the itemCustomer value for this ItemGroupCustomer.
     * 
     * @param itemCustomer
     */
    public void setItemCustomer(java.lang.String itemCustomer) {
        this.itemCustomer = itemCustomer;
    }


    /**
     * Gets the itemDescription value for this ItemGroupCustomer.
     * 
     * @return itemDescription
     */
    public java.lang.String getItemDescription() {
        return itemDescription;
    }


    /**
     * Sets the itemDescription value for this ItemGroupCustomer.
     * 
     * @param itemDescription
     */
    public void setItemDescription(java.lang.String itemDescription) {
        this.itemDescription = itemDescription;
    }


    /**
     * Gets the itemFreeForm value for this ItemGroupCustomer.
     * 
     * @return itemFreeForm
     */
    public java.lang.String getItemFreeForm() {
        return itemFreeForm;
    }


    /**
     * Sets the itemFreeForm value for this ItemGroupCustomer.
     * 
     * @param itemFreeForm
     */
    public void setItemFreeForm(java.lang.String itemFreeForm) {
        this.itemFreeForm = itemFreeForm;
    }


    /**
     * Gets the itemId value for this ItemGroupCustomer.
     * 
     * @return itemId
     */
    public java.lang.Integer getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ItemGroupCustomer.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Integer itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemProduct value for this ItemGroupCustomer.
     * 
     * @return itemProduct
     */
    public java.lang.String getItemProduct() {
        return itemProduct;
    }


    /**
     * Sets the itemProduct value for this ItemGroupCustomer.
     * 
     * @param itemProduct
     */
    public void setItemProduct(java.lang.String itemProduct) {
        this.itemProduct = itemProduct;
    }


    /**
     * Gets the itemUOMPrimary value for this ItemGroupCustomer.
     * 
     * @return itemUOMPrimary
     */
    public java.lang.String getItemUOMPrimary() {
        return itemUOMPrimary;
    }


    /**
     * Sets the itemUOMPrimary value for this ItemGroupCustomer.
     * 
     * @param itemUOMPrimary
     */
    public void setItemUOMPrimary(java.lang.String itemUOMPrimary) {
        this.itemUOMPrimary = itemUOMPrimary;
    }


    /**
     * Gets the itemUOMSecondary value for this ItemGroupCustomer.
     * 
     * @return itemUOMSecondary
     */
    public java.lang.String getItemUOMSecondary() {
        return itemUOMSecondary;
    }


    /**
     * Sets the itemUOMSecondary value for this ItemGroupCustomer.
     * 
     * @param itemUOMSecondary
     */
    public void setItemUOMSecondary(java.lang.String itemUOMSecondary) {
        this.itemUOMSecondary = itemUOMSecondary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemGroupCustomer)) return false;
        ItemGroupCustomer other = (ItemGroupCustomer) obj;
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
            ((this.itemCustomer==null && other.getItemCustomer()==null) || 
             (this.itemCustomer!=null &&
              this.itemCustomer.equals(other.getItemCustomer()))) &&
            ((this.itemDescription==null && other.getItemDescription()==null) || 
             (this.itemDescription!=null &&
              this.itemDescription.equals(other.getItemDescription()))) &&
            ((this.itemFreeForm==null && other.getItemFreeForm()==null) || 
             (this.itemFreeForm!=null &&
              this.itemFreeForm.equals(other.getItemFreeForm()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.itemProduct==null && other.getItemProduct()==null) || 
             (this.itemProduct!=null &&
              this.itemProduct.equals(other.getItemProduct()))) &&
            ((this.itemUOMPrimary==null && other.getItemUOMPrimary()==null) || 
             (this.itemUOMPrimary!=null &&
              this.itemUOMPrimary.equals(other.getItemUOMPrimary()))) &&
            ((this.itemUOMSecondary==null && other.getItemUOMSecondary()==null) || 
             (this.itemUOMSecondary!=null &&
              this.itemUOMSecondary.equals(other.getItemUOMSecondary())));
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
        if (getItemCustomer() != null) {
            _hashCode += getItemCustomer().hashCode();
        }
        if (getItemDescription() != null) {
            _hashCode += getItemDescription().hashCode();
        }
        if (getItemFreeForm() != null) {
            _hashCode += getItemFreeForm().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getItemProduct() != null) {
            _hashCode += getItemProduct().hashCode();
        }
        if (getItemUOMPrimary() != null) {
            _hashCode += getItemUOMPrimary().hashCode();
        }
        if (getItemUOMSecondary() != null) {
            _hashCode += getItemUOMSecondary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemGroupCustomer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "itemGroupCustomer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCatalog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemCatalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemFreeForm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemFreeForm"));
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
        elemField.setFieldName("itemUOMPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemUOMPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemUOMSecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemUOMSecondary"));
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
