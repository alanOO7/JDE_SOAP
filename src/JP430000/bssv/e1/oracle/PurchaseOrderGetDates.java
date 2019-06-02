/**
 * PurchaseOrderGetDates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderGetDates  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.util.Calendar dateCancel;

    private java.util.Calendar datePromisedShip;

    private java.util.Calendar dateTransaction;

    public PurchaseOrderGetDates() {
    }

    public PurchaseOrderGetDates(
           java.util.Calendar dateCancel,
           java.util.Calendar datePromisedShip,
           java.util.Calendar dateTransaction) {
        this.dateCancel = dateCancel;
        this.datePromisedShip = datePromisedShip;
        this.dateTransaction = dateTransaction;
    }


    /**
     * Gets the dateCancel value for this PurchaseOrderGetDates.
     * 
     * @return dateCancel
     */
    public java.util.Calendar getDateCancel() {
        return dateCancel;
    }


    /**
     * Sets the dateCancel value for this PurchaseOrderGetDates.
     * 
     * @param dateCancel
     */
    public void setDateCancel(java.util.Calendar dateCancel) {
        this.dateCancel = dateCancel;
    }


    /**
     * Gets the datePromisedShip value for this PurchaseOrderGetDates.
     * 
     * @return datePromisedShip
     */
    public java.util.Calendar getDatePromisedShip() {
        return datePromisedShip;
    }


    /**
     * Sets the datePromisedShip value for this PurchaseOrderGetDates.
     * 
     * @param datePromisedShip
     */
    public void setDatePromisedShip(java.util.Calendar datePromisedShip) {
        this.datePromisedShip = datePromisedShip;
    }


    /**
     * Gets the dateTransaction value for this PurchaseOrderGetDates.
     * 
     * @return dateTransaction
     */
    public java.util.Calendar getDateTransaction() {
        return dateTransaction;
    }


    /**
     * Sets the dateTransaction value for this PurchaseOrderGetDates.
     * 
     * @param dateTransaction
     */
    public void setDateTransaction(java.util.Calendar dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderGetDates)) return false;
        PurchaseOrderGetDates other = (PurchaseOrderGetDates) obj;
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
            ((this.datePromisedShip==null && other.getDatePromisedShip()==null) || 
             (this.datePromisedShip!=null &&
              this.datePromisedShip.equals(other.getDatePromisedShip()))) &&
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
        if (getDatePromisedShip() != null) {
            _hashCode += getDatePromisedShip().hashCode();
        }
        if (getDateTransaction() != null) {
            _hashCode += getDateTransaction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderGetDates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetDates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCancel"));
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
