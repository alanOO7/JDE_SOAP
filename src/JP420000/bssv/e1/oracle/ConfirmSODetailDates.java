/**
 * ConfirmSODetailDates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ConfirmSODetailDates  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.util.Calendar datePromisedDelivery;

    private java.util.Calendar datePromisedShip;

    private java.util.Calendar dateRequested;

    private java.lang.Integer timePromisedDelivery;

    private java.lang.Integer timePromisedShip;

    private java.lang.Integer timeRequested;

    public ConfirmSODetailDates() {
    }

    public ConfirmSODetailDates(
           java.util.Calendar datePromisedDelivery,
           java.util.Calendar datePromisedShip,
           java.util.Calendar dateRequested,
           java.lang.Integer timePromisedDelivery,
           java.lang.Integer timePromisedShip,
           java.lang.Integer timeRequested) {
        this.datePromisedDelivery = datePromisedDelivery;
        this.datePromisedShip = datePromisedShip;
        this.dateRequested = dateRequested;
        this.timePromisedDelivery = timePromisedDelivery;
        this.timePromisedShip = timePromisedShip;
        this.timeRequested = timeRequested;
    }


    /**
     * Gets the datePromisedDelivery value for this ConfirmSODetailDates.
     * 
     * @return datePromisedDelivery
     */
    public java.util.Calendar getDatePromisedDelivery() {
        return datePromisedDelivery;
    }


    /**
     * Sets the datePromisedDelivery value for this ConfirmSODetailDates.
     * 
     * @param datePromisedDelivery
     */
    public void setDatePromisedDelivery(java.util.Calendar datePromisedDelivery) {
        this.datePromisedDelivery = datePromisedDelivery;
    }


    /**
     * Gets the datePromisedShip value for this ConfirmSODetailDates.
     * 
     * @return datePromisedShip
     */
    public java.util.Calendar getDatePromisedShip() {
        return datePromisedShip;
    }


    /**
     * Sets the datePromisedShip value for this ConfirmSODetailDates.
     * 
     * @param datePromisedShip
     */
    public void setDatePromisedShip(java.util.Calendar datePromisedShip) {
        this.datePromisedShip = datePromisedShip;
    }


    /**
     * Gets the dateRequested value for this ConfirmSODetailDates.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this ConfirmSODetailDates.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the timePromisedDelivery value for this ConfirmSODetailDates.
     * 
     * @return timePromisedDelivery
     */
    public java.lang.Integer getTimePromisedDelivery() {
        return timePromisedDelivery;
    }


    /**
     * Sets the timePromisedDelivery value for this ConfirmSODetailDates.
     * 
     * @param timePromisedDelivery
     */
    public void setTimePromisedDelivery(java.lang.Integer timePromisedDelivery) {
        this.timePromisedDelivery = timePromisedDelivery;
    }


    /**
     * Gets the timePromisedShip value for this ConfirmSODetailDates.
     * 
     * @return timePromisedShip
     */
    public java.lang.Integer getTimePromisedShip() {
        return timePromisedShip;
    }


    /**
     * Sets the timePromisedShip value for this ConfirmSODetailDates.
     * 
     * @param timePromisedShip
     */
    public void setTimePromisedShip(java.lang.Integer timePromisedShip) {
        this.timePromisedShip = timePromisedShip;
    }


    /**
     * Gets the timeRequested value for this ConfirmSODetailDates.
     * 
     * @return timeRequested
     */
    public java.lang.Integer getTimeRequested() {
        return timeRequested;
    }


    /**
     * Sets the timeRequested value for this ConfirmSODetailDates.
     * 
     * @param timeRequested
     */
    public void setTimeRequested(java.lang.Integer timeRequested) {
        this.timeRequested = timeRequested;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmSODetailDates)) return false;
        ConfirmSODetailDates other = (ConfirmSODetailDates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datePromisedDelivery==null && other.getDatePromisedDelivery()==null) || 
             (this.datePromisedDelivery!=null &&
              this.datePromisedDelivery.equals(other.getDatePromisedDelivery()))) &&
            ((this.datePromisedShip==null && other.getDatePromisedShip()==null) || 
             (this.datePromisedShip!=null &&
              this.datePromisedShip.equals(other.getDatePromisedShip()))) &&
            ((this.dateRequested==null && other.getDateRequested()==null) || 
             (this.dateRequested!=null &&
              this.dateRequested.equals(other.getDateRequested()))) &&
            ((this.timePromisedDelivery==null && other.getTimePromisedDelivery()==null) || 
             (this.timePromisedDelivery!=null &&
              this.timePromisedDelivery.equals(other.getTimePromisedDelivery()))) &&
            ((this.timePromisedShip==null && other.getTimePromisedShip()==null) || 
             (this.timePromisedShip!=null &&
              this.timePromisedShip.equals(other.getTimePromisedShip()))) &&
            ((this.timeRequested==null && other.getTimeRequested()==null) || 
             (this.timeRequested!=null &&
              this.timeRequested.equals(other.getTimeRequested())));
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
        if (getDatePromisedDelivery() != null) {
            _hashCode += getDatePromisedDelivery().hashCode();
        }
        if (getDatePromisedShip() != null) {
            _hashCode += getDatePromisedShip().hashCode();
        }
        if (getDateRequested() != null) {
            _hashCode += getDateRequested().hashCode();
        }
        if (getTimePromisedDelivery() != null) {
            _hashCode += getTimePromisedDelivery().hashCode();
        }
        if (getTimePromisedShip() != null) {
            _hashCode += getTimePromisedShip().hashCode();
        }
        if (getTimeRequested() != null) {
            _hashCode += getTimeRequested().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmSODetailDates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailDates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePromisedDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePromisedDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePromisedShip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePromisedShip"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePromisedDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timePromisedDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePromisedShip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timePromisedShip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
