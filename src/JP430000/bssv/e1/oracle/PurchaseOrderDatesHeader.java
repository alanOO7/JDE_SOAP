/**
 * PurchaseOrderDatesHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderDatesHeader  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.util.Calendar dateCancel;

    private java.util.Calendar dateOrdered;

    private java.util.Calendar datePromisedDelivery;

    private java.util.Calendar dateRequested;

    public PurchaseOrderDatesHeader() {
    }

    public PurchaseOrderDatesHeader(
           java.util.Calendar dateCancel,
           java.util.Calendar dateOrdered,
           java.util.Calendar datePromisedDelivery,
           java.util.Calendar dateRequested) {
        this.dateCancel = dateCancel;
        this.dateOrdered = dateOrdered;
        this.datePromisedDelivery = datePromisedDelivery;
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the dateCancel value for this PurchaseOrderDatesHeader.
     * 
     * @return dateCancel
     */
    public java.util.Calendar getDateCancel() {
        return dateCancel;
    }


    /**
     * Sets the dateCancel value for this PurchaseOrderDatesHeader.
     * 
     * @param dateCancel
     */
    public void setDateCancel(java.util.Calendar dateCancel) {
        this.dateCancel = dateCancel;
    }


    /**
     * Gets the dateOrdered value for this PurchaseOrderDatesHeader.
     * 
     * @return dateOrdered
     */
    public java.util.Calendar getDateOrdered() {
        return dateOrdered;
    }


    /**
     * Sets the dateOrdered value for this PurchaseOrderDatesHeader.
     * 
     * @param dateOrdered
     */
    public void setDateOrdered(java.util.Calendar dateOrdered) {
        this.dateOrdered = dateOrdered;
    }


    /**
     * Gets the datePromisedDelivery value for this PurchaseOrderDatesHeader.
     * 
     * @return datePromisedDelivery
     */
    public java.util.Calendar getDatePromisedDelivery() {
        return datePromisedDelivery;
    }


    /**
     * Sets the datePromisedDelivery value for this PurchaseOrderDatesHeader.
     * 
     * @param datePromisedDelivery
     */
    public void setDatePromisedDelivery(java.util.Calendar datePromisedDelivery) {
        this.datePromisedDelivery = datePromisedDelivery;
    }


    /**
     * Gets the dateRequested value for this PurchaseOrderDatesHeader.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this PurchaseOrderDatesHeader.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderDatesHeader)) return false;
        PurchaseOrderDatesHeader other = (PurchaseOrderDatesHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dateCancel==null && other.getDateCancel()==null) || 
             (this.dateCancel!=null &&
              this.dateCancel.equals(other.getDateCancel()))) &&
            ((this.dateOrdered==null && other.getDateOrdered()==null) || 
             (this.dateOrdered!=null &&
              this.dateOrdered.equals(other.getDateOrdered()))) &&
            ((this.datePromisedDelivery==null && other.getDatePromisedDelivery()==null) || 
             (this.datePromisedDelivery!=null &&
              this.datePromisedDelivery.equals(other.getDatePromisedDelivery()))) &&
            ((this.dateRequested==null && other.getDateRequested()==null) || 
             (this.dateRequested!=null &&
              this.dateRequested.equals(other.getDateRequested())));
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
        if (getDateCancel() != null) {
            _hashCode += getDateCancel().hashCode();
        }
        if (getDateOrdered() != null) {
            _hashCode += getDateOrdered().hashCode();
        }
        if (getDatePromisedDelivery() != null) {
            _hashCode += getDatePromisedDelivery().hashCode();
        }
        if (getDateRequested() != null) {
            _hashCode += getDateRequested().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderDatesHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDatesHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePromisedDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePromisedDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
