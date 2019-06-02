/**
 * ConfirmSODetailProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ConfirmSODetailProduct  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP420000.bssv.e1.oracle.ItemGroupCustomer item;

    private java.lang.String lineTypeCode;

    private java.lang.String lotNumber;

    private java.lang.String statusCodeLast;

    private java.lang.String statusCodeNext;

    public ConfirmSODetailProduct() {
    }

    public ConfirmSODetailProduct(
           JP420000.bssv.e1.oracle.ItemGroupCustomer item,
           java.lang.String lineTypeCode,
           java.lang.String lotNumber,
           java.lang.String statusCodeLast,
           java.lang.String statusCodeNext) {
        this.item = item;
        this.lineTypeCode = lineTypeCode;
        this.lotNumber = lotNumber;
        this.statusCodeLast = statusCodeLast;
        this.statusCodeNext = statusCodeNext;
    }


    /**
     * Gets the item value for this ConfirmSODetailProduct.
     * 
     * @return item
     */
    public JP420000.bssv.e1.oracle.ItemGroupCustomer getItem() {
        return item;
    }


    /**
     * Sets the item value for this ConfirmSODetailProduct.
     * 
     * @param item
     */
    public void setItem(JP420000.bssv.e1.oracle.ItemGroupCustomer item) {
        this.item = item;
    }


    /**
     * Gets the lineTypeCode value for this ConfirmSODetailProduct.
     * 
     * @return lineTypeCode
     */
    public java.lang.String getLineTypeCode() {
        return lineTypeCode;
    }


    /**
     * Sets the lineTypeCode value for this ConfirmSODetailProduct.
     * 
     * @param lineTypeCode
     */
    public void setLineTypeCode(java.lang.String lineTypeCode) {
        this.lineTypeCode = lineTypeCode;
    }


    /**
     * Gets the lotNumber value for this ConfirmSODetailProduct.
     * 
     * @return lotNumber
     */
    public java.lang.String getLotNumber() {
        return lotNumber;
    }


    /**
     * Sets the lotNumber value for this ConfirmSODetailProduct.
     * 
     * @param lotNumber
     */
    public void setLotNumber(java.lang.String lotNumber) {
        this.lotNumber = lotNumber;
    }


    /**
     * Gets the statusCodeLast value for this ConfirmSODetailProduct.
     * 
     * @return statusCodeLast
     */
    public java.lang.String getStatusCodeLast() {
        return statusCodeLast;
    }


    /**
     * Sets the statusCodeLast value for this ConfirmSODetailProduct.
     * 
     * @param statusCodeLast
     */
    public void setStatusCodeLast(java.lang.String statusCodeLast) {
        this.statusCodeLast = statusCodeLast;
    }


    /**
     * Gets the statusCodeNext value for this ConfirmSODetailProduct.
     * 
     * @return statusCodeNext
     */
    public java.lang.String getStatusCodeNext() {
        return statusCodeNext;
    }


    /**
     * Sets the statusCodeNext value for this ConfirmSODetailProduct.
     * 
     * @param statusCodeNext
     */
    public void setStatusCodeNext(java.lang.String statusCodeNext) {
        this.statusCodeNext = statusCodeNext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmSODetailProduct)) return false;
        ConfirmSODetailProduct other = (ConfirmSODetailProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.lineTypeCode==null && other.getLineTypeCode()==null) || 
             (this.lineTypeCode!=null &&
              this.lineTypeCode.equals(other.getLineTypeCode()))) &&
            ((this.lotNumber==null && other.getLotNumber()==null) || 
             (this.lotNumber!=null &&
              this.lotNumber.equals(other.getLotNumber()))) &&
            ((this.statusCodeLast==null && other.getStatusCodeLast()==null) || 
             (this.statusCodeLast!=null &&
              this.statusCodeLast.equals(other.getStatusCodeLast()))) &&
            ((this.statusCodeNext==null && other.getStatusCodeNext()==null) || 
             (this.statusCodeNext!=null &&
              this.statusCodeNext.equals(other.getStatusCodeNext())));
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
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLineTypeCode() != null) {
            _hashCode += getLineTypeCode().hashCode();
        }
        if (getLotNumber() != null) {
            _hashCode += getLotNumber().hashCode();
        }
        if (getStatusCodeLast() != null) {
            _hashCode += getStatusCodeLast().hashCode();
        }
        if (getStatusCodeNext() != null) {
            _hashCode += getStatusCodeNext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmSODetailProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailProduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item"));
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
        elemField.setFieldName("lotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lotNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCodeLast");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCodeLast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCodeNext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCodeNext"));
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
