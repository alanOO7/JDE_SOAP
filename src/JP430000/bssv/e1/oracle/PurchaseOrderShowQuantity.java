/**
 * PurchaseOrderShowQuantity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderShowQuantity  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.math.BigDecimal quantityChanged;

    private java.math.BigDecimal quantityCumulative;

    private java.math.BigDecimal quantityOpen;

    private java.math.BigDecimal quantityOrdered;

    private java.math.BigDecimal quantityOrderedPrimary;

    private java.math.BigDecimal quantityOrderedSecondary;

    private java.math.BigDecimal quantityReceived;

    private java.math.BigDecimal quantityRelieved;

    public PurchaseOrderShowQuantity() {
    }

    public PurchaseOrderShowQuantity(
           java.math.BigDecimal quantityChanged,
           java.math.BigDecimal quantityCumulative,
           java.math.BigDecimal quantityOpen,
           java.math.BigDecimal quantityOrdered,
           java.math.BigDecimal quantityOrderedPrimary,
           java.math.BigDecimal quantityOrderedSecondary,
           java.math.BigDecimal quantityReceived,
           java.math.BigDecimal quantityRelieved) {
        this.quantityChanged = quantityChanged;
        this.quantityCumulative = quantityCumulative;
        this.quantityOpen = quantityOpen;
        this.quantityOrdered = quantityOrdered;
        this.quantityOrderedPrimary = quantityOrderedPrimary;
        this.quantityOrderedSecondary = quantityOrderedSecondary;
        this.quantityReceived = quantityReceived;
        this.quantityRelieved = quantityRelieved;
    }


    /**
     * Gets the quantityChanged value for this PurchaseOrderShowQuantity.
     * 
     * @return quantityChanged
     */
    public java.math.BigDecimal getQuantityChanged() {
        return quantityChanged;
    }


    /**
     * Sets the quantityChanged value for this PurchaseOrderShowQuantity.
     * 
     * @param quantityChanged
     */
    public void setQuantityChanged(java.math.BigDecimal quantityChanged) {
        this.quantityChanged = quantityChanged;
    }


    /**
     * Gets the quantityCumulative value for this PurchaseOrderShowQuantity.
     * 
     * @return quantityCumulative
     */
    public java.math.BigDecimal getQuantityCumulative() {
        return quantityCumulative;
    }


    /**
     * Sets the quantityCumulative value for this PurchaseOrderShowQuantity.
     * 
     * @param quantityCumulative
     */
    public void setQuantityCumulative(java.math.BigDecimal quantityCumulative) {
        this.quantityCumulative = quantityCumulative;
    }


    /**
     * Gets the quantityOpen value for this PurchaseOrderShowQuantity.
     * 
     * @return quantityOpen
     */
    public java.math.BigDecimal getQuantityOpen() {
        return quantityOpen;
    }


    /**
     * Sets the quantityOpen value for this PurchaseOrderShowQuantity.
     * 
     * @param quantityOpen
     */
    public void setQuantityOpen(java.math.BigDecimal quantityOpen) {
        this.quantityOpen = quantityOpen;
    }


    /**
     * Gets the quantityOrdered value for this PurchaseOrderShowQuantity.
     * 
     * @return quantityOrdered
     */
    public java.math.BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }


    /**
     * Sets the quantityOrdered value for this PurchaseOrderShowQuantity.
     * 
     * @param quantityOrdered
     */
    public void setQuantityOrdered(java.math.BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }


    /**
     * Gets the quantityOrderedPrimary value for this PurchaseOrderShowQuantity.
     * 
     * @return quantityOrderedPrimary
     */
    public java.math.BigDecimal getQuantityOrderedPrimary() {
        return quantityOrderedPrimary;
    }


    /**
     * Sets the quantityOrderedPrimary value for this PurchaseOrderShowQuantity.
     * 
     * @param quantityOrderedPrimary
     */
    public void setQuantityOrderedPrimary(java.math.BigDecimal quantityOrderedPrimary) {
        this.quantityOrderedPrimary = quantityOrderedPrimary;
    }


    /**
     * Gets the quantityOrderedSecondary value for this PurchaseOrderShowQuantity.
     * 
     * @return quantityOrderedSecondary
     */
    public java.math.BigDecimal getQuantityOrderedSecondary() {
        return quantityOrderedSecondary;
    }


    /**
     * Sets the quantityOrderedSecondary value for this PurchaseOrderShowQuantity.
     * 
     * @param quantityOrderedSecondary
     */
    public void setQuantityOrderedSecondary(java.math.BigDecimal quantityOrderedSecondary) {
        this.quantityOrderedSecondary = quantityOrderedSecondary;
    }


    /**
     * Gets the quantityReceived value for this PurchaseOrderShowQuantity.
     * 
     * @return quantityReceived
     */
    public java.math.BigDecimal getQuantityReceived() {
        return quantityReceived;
    }


    /**
     * Sets the quantityReceived value for this PurchaseOrderShowQuantity.
     * 
     * @param quantityReceived
     */
    public void setQuantityReceived(java.math.BigDecimal quantityReceived) {
        this.quantityReceived = quantityReceived;
    }


    /**
     * Gets the quantityRelieved value for this PurchaseOrderShowQuantity.
     * 
     * @return quantityRelieved
     */
    public java.math.BigDecimal getQuantityRelieved() {
        return quantityRelieved;
    }


    /**
     * Sets the quantityRelieved value for this PurchaseOrderShowQuantity.
     * 
     * @param quantityRelieved
     */
    public void setQuantityRelieved(java.math.BigDecimal quantityRelieved) {
        this.quantityRelieved = quantityRelieved;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderShowQuantity)) return false;
        PurchaseOrderShowQuantity other = (PurchaseOrderShowQuantity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.quantityChanged==null && other.getQuantityChanged()==null) || 
             (this.quantityChanged!=null &&
              this.quantityChanged.equals(other.getQuantityChanged()))) &&
            ((this.quantityCumulative==null && other.getQuantityCumulative()==null) || 
             (this.quantityCumulative!=null &&
              this.quantityCumulative.equals(other.getQuantityCumulative()))) &&
            ((this.quantityOpen==null && other.getQuantityOpen()==null) || 
             (this.quantityOpen!=null &&
              this.quantityOpen.equals(other.getQuantityOpen()))) &&
            ((this.quantityOrdered==null && other.getQuantityOrdered()==null) || 
             (this.quantityOrdered!=null &&
              this.quantityOrdered.equals(other.getQuantityOrdered()))) &&
            ((this.quantityOrderedPrimary==null && other.getQuantityOrderedPrimary()==null) || 
             (this.quantityOrderedPrimary!=null &&
              this.quantityOrderedPrimary.equals(other.getQuantityOrderedPrimary()))) &&
            ((this.quantityOrderedSecondary==null && other.getQuantityOrderedSecondary()==null) || 
             (this.quantityOrderedSecondary!=null &&
              this.quantityOrderedSecondary.equals(other.getQuantityOrderedSecondary()))) &&
            ((this.quantityReceived==null && other.getQuantityReceived()==null) || 
             (this.quantityReceived!=null &&
              this.quantityReceived.equals(other.getQuantityReceived()))) &&
            ((this.quantityRelieved==null && other.getQuantityRelieved()==null) || 
             (this.quantityRelieved!=null &&
              this.quantityRelieved.equals(other.getQuantityRelieved())));
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
        if (getQuantityChanged() != null) {
            _hashCode += getQuantityChanged().hashCode();
        }
        if (getQuantityCumulative() != null) {
            _hashCode += getQuantityCumulative().hashCode();
        }
        if (getQuantityOpen() != null) {
            _hashCode += getQuantityOpen().hashCode();
        }
        if (getQuantityOrdered() != null) {
            _hashCode += getQuantityOrdered().hashCode();
        }
        if (getQuantityOrderedPrimary() != null) {
            _hashCode += getQuantityOrderedPrimary().hashCode();
        }
        if (getQuantityOrderedSecondary() != null) {
            _hashCode += getQuantityOrderedSecondary().hashCode();
        }
        if (getQuantityReceived() != null) {
            _hashCode += getQuantityReceived().hashCode();
        }
        if (getQuantityRelieved() != null) {
            _hashCode += getQuantityRelieved().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderShowQuantity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowQuantity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCumulative");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityCumulative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOrderedPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityOrderedPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOrderedSecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityOrderedSecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRelieved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityRelieved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
