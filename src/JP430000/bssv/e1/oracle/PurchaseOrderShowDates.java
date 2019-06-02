/**
 * PurchaseOrderShowDates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderShowDates  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.util.Calendar dateCancel;

    private java.util.Calendar datePriceEffective;

    private java.util.Calendar datePromisedDelivery;

    private java.util.Calendar datePromisedOriginal;

    private java.util.Calendar datePromisedShip;

    private java.util.Calendar dateRequested;

    private java.util.Calendar dateScheduledPick;

    private java.util.Calendar dateShipment;

    private java.util.Calendar dateTransaction;

    public PurchaseOrderShowDates() {
    }

    public PurchaseOrderShowDates(
           java.util.Calendar dateCancel,
           java.util.Calendar datePriceEffective,
           java.util.Calendar datePromisedDelivery,
           java.util.Calendar datePromisedOriginal,
           java.util.Calendar datePromisedShip,
           java.util.Calendar dateRequested,
           java.util.Calendar dateScheduledPick,
           java.util.Calendar dateShipment,
           java.util.Calendar dateTransaction) {
        this.dateCancel = dateCancel;
        this.datePriceEffective = datePriceEffective;
        this.datePromisedDelivery = datePromisedDelivery;
        this.datePromisedOriginal = datePromisedOriginal;
        this.datePromisedShip = datePromisedShip;
        this.dateRequested = dateRequested;
        this.dateScheduledPick = dateScheduledPick;
        this.dateShipment = dateShipment;
        this.dateTransaction = dateTransaction;
    }


    /**
     * Gets the dateCancel value for this PurchaseOrderShowDates.
     * 
     * @return dateCancel
     */
    public java.util.Calendar getDateCancel() {
        return dateCancel;
    }


    /**
     * Sets the dateCancel value for this PurchaseOrderShowDates.
     * 
     * @param dateCancel
     */
    public void setDateCancel(java.util.Calendar dateCancel) {
        this.dateCancel = dateCancel;
    }


    /**
     * Gets the datePriceEffective value for this PurchaseOrderShowDates.
     * 
     * @return datePriceEffective
     */
    public java.util.Calendar getDatePriceEffective() {
        return datePriceEffective;
    }


    /**
     * Sets the datePriceEffective value for this PurchaseOrderShowDates.
     * 
     * @param datePriceEffective
     */
    public void setDatePriceEffective(java.util.Calendar datePriceEffective) {
        this.datePriceEffective = datePriceEffective;
    }


    /**
     * Gets the datePromisedDelivery value for this PurchaseOrderShowDates.
     * 
     * @return datePromisedDelivery
     */
    public java.util.Calendar getDatePromisedDelivery() {
        return datePromisedDelivery;
    }


    /**
     * Sets the datePromisedDelivery value for this PurchaseOrderShowDates.
     * 
     * @param datePromisedDelivery
     */
    public void setDatePromisedDelivery(java.util.Calendar datePromisedDelivery) {
        this.datePromisedDelivery = datePromisedDelivery;
    }


    /**
     * Gets the datePromisedOriginal value for this PurchaseOrderShowDates.
     * 
     * @return datePromisedOriginal
     */
    public java.util.Calendar getDatePromisedOriginal() {
        return datePromisedOriginal;
    }


    /**
     * Sets the datePromisedOriginal value for this PurchaseOrderShowDates.
     * 
     * @param datePromisedOriginal
     */
    public void setDatePromisedOriginal(java.util.Calendar datePromisedOriginal) {
        this.datePromisedOriginal = datePromisedOriginal;
    }


    /**
     * Gets the datePromisedShip value for this PurchaseOrderShowDates.
     * 
     * @return datePromisedShip
     */
    public java.util.Calendar getDatePromisedShip() {
        return datePromisedShip;
    }


    /**
     * Sets the datePromisedShip value for this PurchaseOrderShowDates.
     * 
     * @param datePromisedShip
     */
    public void setDatePromisedShip(java.util.Calendar datePromisedShip) {
        this.datePromisedShip = datePromisedShip;
    }


    /**
     * Gets the dateRequested value for this PurchaseOrderShowDates.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this PurchaseOrderShowDates.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the dateScheduledPick value for this PurchaseOrderShowDates.
     * 
     * @return dateScheduledPick
     */
    public java.util.Calendar getDateScheduledPick() {
        return dateScheduledPick;
    }


    /**
     * Sets the dateScheduledPick value for this PurchaseOrderShowDates.
     * 
     * @param dateScheduledPick
     */
    public void setDateScheduledPick(java.util.Calendar dateScheduledPick) {
        this.dateScheduledPick = dateScheduledPick;
    }


    /**
     * Gets the dateShipment value for this PurchaseOrderShowDates.
     * 
     * @return dateShipment
     */
    public java.util.Calendar getDateShipment() {
        return dateShipment;
    }


    /**
     * Sets the dateShipment value for this PurchaseOrderShowDates.
     * 
     * @param dateShipment
     */
    public void setDateShipment(java.util.Calendar dateShipment) {
        this.dateShipment = dateShipment;
    }


    /**
     * Gets the dateTransaction value for this PurchaseOrderShowDates.
     * 
     * @return dateTransaction
     */
    public java.util.Calendar getDateTransaction() {
        return dateTransaction;
    }


    /**
     * Sets the dateTransaction value for this PurchaseOrderShowDates.
     * 
     * @param dateTransaction
     */
    public void setDateTransaction(java.util.Calendar dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderShowDates)) return false;
        PurchaseOrderShowDates other = (PurchaseOrderShowDates) obj;
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
            ((this.datePriceEffective==null && other.getDatePriceEffective()==null) || 
             (this.datePriceEffective!=null &&
              this.datePriceEffective.equals(other.getDatePriceEffective()))) &&
            ((this.datePromisedDelivery==null && other.getDatePromisedDelivery()==null) || 
             (this.datePromisedDelivery!=null &&
              this.datePromisedDelivery.equals(other.getDatePromisedDelivery()))) &&
            ((this.datePromisedOriginal==null && other.getDatePromisedOriginal()==null) || 
             (this.datePromisedOriginal!=null &&
              this.datePromisedOriginal.equals(other.getDatePromisedOriginal()))) &&
            ((this.datePromisedShip==null && other.getDatePromisedShip()==null) || 
             (this.datePromisedShip!=null &&
              this.datePromisedShip.equals(other.getDatePromisedShip()))) &&
            ((this.dateRequested==null && other.getDateRequested()==null) || 
             (this.dateRequested!=null &&
              this.dateRequested.equals(other.getDateRequested()))) &&
            ((this.dateScheduledPick==null && other.getDateScheduledPick()==null) || 
             (this.dateScheduledPick!=null &&
              this.dateScheduledPick.equals(other.getDateScheduledPick()))) &&
            ((this.dateShipment==null && other.getDateShipment()==null) || 
             (this.dateShipment!=null &&
              this.dateShipment.equals(other.getDateShipment()))) &&
            ((this.dateTransaction==null && other.getDateTransaction()==null) || 
             (this.dateTransaction!=null &&
              this.dateTransaction.equals(other.getDateTransaction())));
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
        if (getDatePriceEffective() != null) {
            _hashCode += getDatePriceEffective().hashCode();
        }
        if (getDatePromisedDelivery() != null) {
            _hashCode += getDatePromisedDelivery().hashCode();
        }
        if (getDatePromisedOriginal() != null) {
            _hashCode += getDatePromisedOriginal().hashCode();
        }
        if (getDatePromisedShip() != null) {
            _hashCode += getDatePromisedShip().hashCode();
        }
        if (getDateRequested() != null) {
            _hashCode += getDateRequested().hashCode();
        }
        if (getDateScheduledPick() != null) {
            _hashCode += getDateScheduledPick().hashCode();
        }
        if (getDateShipment() != null) {
            _hashCode += getDateShipment().hashCode();
        }
        if (getDateTransaction() != null) {
            _hashCode += getDateTransaction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderShowDates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowDates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePriceEffective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePriceEffective"));
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
        elemField.setFieldName("datePromisedOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePromisedOriginal"));
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
        elemField.setFieldName("dateScheduledPick");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateScheduledPick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTransaction"));
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
