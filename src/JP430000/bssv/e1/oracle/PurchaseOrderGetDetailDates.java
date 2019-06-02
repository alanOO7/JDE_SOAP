/**
 * PurchaseOrderGetDetailDates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderGetDetailDates  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.util.Calendar dateCancel;

    private java.util.Calendar dateRequestedJulian;

    private java.util.Calendar dateScheduledPick;

    public PurchaseOrderGetDetailDates() {
    }

    public PurchaseOrderGetDetailDates(
           java.util.Calendar dateCancel,
           java.util.Calendar dateRequestedJulian,
           java.util.Calendar dateScheduledPick) {
        this.dateCancel = dateCancel;
        this.dateRequestedJulian = dateRequestedJulian;
        this.dateScheduledPick = dateScheduledPick;
    }


    /**
     * Gets the dateCancel value for this PurchaseOrderGetDetailDates.
     * 
     * @return dateCancel
     */
    public java.util.Calendar getDateCancel() {
        return dateCancel;
    }


    /**
     * Sets the dateCancel value for this PurchaseOrderGetDetailDates.
     * 
     * @param dateCancel
     */
    public void setDateCancel(java.util.Calendar dateCancel) {
        this.dateCancel = dateCancel;
    }


    /**
     * Gets the dateRequestedJulian value for this PurchaseOrderGetDetailDates.
     * 
     * @return dateRequestedJulian
     */
    public java.util.Calendar getDateRequestedJulian() {
        return dateRequestedJulian;
    }


    /**
     * Sets the dateRequestedJulian value for this PurchaseOrderGetDetailDates.
     * 
     * @param dateRequestedJulian
     */
    public void setDateRequestedJulian(java.util.Calendar dateRequestedJulian) {
        this.dateRequestedJulian = dateRequestedJulian;
    }


    /**
     * Gets the dateScheduledPick value for this PurchaseOrderGetDetailDates.
     * 
     * @return dateScheduledPick
     */
    public java.util.Calendar getDateScheduledPick() {
        return dateScheduledPick;
    }


    /**
     * Sets the dateScheduledPick value for this PurchaseOrderGetDetailDates.
     * 
     * @param dateScheduledPick
     */
    public void setDateScheduledPick(java.util.Calendar dateScheduledPick) {
        this.dateScheduledPick = dateScheduledPick;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderGetDetailDates)) return false;
        PurchaseOrderGetDetailDates other = (PurchaseOrderGetDetailDates) obj;
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
            ((this.dateRequestedJulian==null && other.getDateRequestedJulian()==null) || 
             (this.dateRequestedJulian!=null &&
              this.dateRequestedJulian.equals(other.getDateRequestedJulian()))) &&
            ((this.dateScheduledPick==null && other.getDateScheduledPick()==null) || 
             (this.dateScheduledPick!=null &&
              this.dateScheduledPick.equals(other.getDateScheduledPick())));
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
        if (getDateRequestedJulian() != null) {
            _hashCode += getDateRequestedJulian().hashCode();
        }
        if (getDateScheduledPick() != null) {
            _hashCode += getDateScheduledPick().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderGetDetailDates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetDetailDates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRequestedJulian");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateRequestedJulian"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateScheduledPick");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateScheduledPick"));
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
