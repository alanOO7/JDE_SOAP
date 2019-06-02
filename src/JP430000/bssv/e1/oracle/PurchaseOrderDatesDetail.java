/**
 * PurchaseOrderDatesDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderDatesDetail  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.util.Calendar dateAccounting;

    private java.util.Calendar dateCancel;

    private java.util.Calendar dateEffectiveLot;

    private java.util.Calendar datePromisedDelivery;

    private java.util.Calendar dateRequested;

    public PurchaseOrderDatesDetail() {
    }

    public PurchaseOrderDatesDetail(
           java.util.Calendar dateAccounting,
           java.util.Calendar dateCancel,
           java.util.Calendar dateEffectiveLot,
           java.util.Calendar datePromisedDelivery,
           java.util.Calendar dateRequested) {
        this.dateAccounting = dateAccounting;
        this.dateCancel = dateCancel;
        this.dateEffectiveLot = dateEffectiveLot;
        this.datePromisedDelivery = datePromisedDelivery;
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the dateAccounting value for this PurchaseOrderDatesDetail.
     * 
     * @return dateAccounting
     */
    public java.util.Calendar getDateAccounting() {
        return dateAccounting;
    }


    /**
     * Sets the dateAccounting value for this PurchaseOrderDatesDetail.
     * 
     * @param dateAccounting
     */
    public void setDateAccounting(java.util.Calendar dateAccounting) {
        this.dateAccounting = dateAccounting;
    }


    /**
     * Gets the dateCancel value for this PurchaseOrderDatesDetail.
     * 
     * @return dateCancel
     */
    public java.util.Calendar getDateCancel() {
        return dateCancel;
    }


    /**
     * Sets the dateCancel value for this PurchaseOrderDatesDetail.
     * 
     * @param dateCancel
     */
    public void setDateCancel(java.util.Calendar dateCancel) {
        this.dateCancel = dateCancel;
    }


    /**
     * Gets the dateEffectiveLot value for this PurchaseOrderDatesDetail.
     * 
     * @return dateEffectiveLot
     */
    public java.util.Calendar getDateEffectiveLot() {
        return dateEffectiveLot;
    }


    /**
     * Sets the dateEffectiveLot value for this PurchaseOrderDatesDetail.
     * 
     * @param dateEffectiveLot
     */
    public void setDateEffectiveLot(java.util.Calendar dateEffectiveLot) {
        this.dateEffectiveLot = dateEffectiveLot;
    }


    /**
     * Gets the datePromisedDelivery value for this PurchaseOrderDatesDetail.
     * 
     * @return datePromisedDelivery
     */
    public java.util.Calendar getDatePromisedDelivery() {
        return datePromisedDelivery;
    }


    /**
     * Sets the datePromisedDelivery value for this PurchaseOrderDatesDetail.
     * 
     * @param datePromisedDelivery
     */
    public void setDatePromisedDelivery(java.util.Calendar datePromisedDelivery) {
        this.datePromisedDelivery = datePromisedDelivery;
    }


    /**
     * Gets the dateRequested value for this PurchaseOrderDatesDetail.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this PurchaseOrderDatesDetail.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderDatesDetail)) return false;
        PurchaseOrderDatesDetail other = (PurchaseOrderDatesDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dateAccounting==null && other.getDateAccounting()==null) || 
             (this.dateAccounting!=null &&
              this.dateAccounting.equals(other.getDateAccounting()))) &&
            ((this.dateCancel==null && other.getDateCancel()==null) || 
             (this.dateCancel!=null &&
              this.dateCancel.equals(other.getDateCancel()))) &&
            ((this.dateEffectiveLot==null && other.getDateEffectiveLot()==null) || 
             (this.dateEffectiveLot!=null &&
              this.dateEffectiveLot.equals(other.getDateEffectiveLot()))) &&
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
        if (getDateAccounting() != null) {
            _hashCode += getDateAccounting().hashCode();
        }
        if (getDateCancel() != null) {
            _hashCode += getDateCancel().hashCode();
        }
        if (getDateEffectiveLot() != null) {
            _hashCode += getDateEffectiveLot().hashCode();
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
        new org.apache.axis.description.TypeDesc(PurchaseOrderDatesDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDatesDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateAccounting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateAccounting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateEffectiveLot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateEffectiveLot"));
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
