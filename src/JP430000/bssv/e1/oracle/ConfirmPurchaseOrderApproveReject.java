/**
 * ConfirmPurchaseOrderApproveReject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ConfirmPurchaseOrderApproveReject  extends JP430000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private java.lang.String confirmApproveRejectSucess;

    private long numberOfDetailRemarksProcessed;

    private long numberOfPurchaseOrdersProcessed;

    public ConfirmPurchaseOrderApproveReject() {
    }

    public ConfirmPurchaseOrderApproveReject(
           JP430000.bssv.e1.oracle.E1Message[] e1MessageList,
           java.lang.String confirmApproveRejectSucess,
           long numberOfDetailRemarksProcessed,
           long numberOfPurchaseOrdersProcessed) {
        super(
            e1MessageList);
        this.confirmApproveRejectSucess = confirmApproveRejectSucess;
        this.numberOfDetailRemarksProcessed = numberOfDetailRemarksProcessed;
        this.numberOfPurchaseOrdersProcessed = numberOfPurchaseOrdersProcessed;
    }


    /**
     * Gets the confirmApproveRejectSucess value for this ConfirmPurchaseOrderApproveReject.
     * 
     * @return confirmApproveRejectSucess
     */
    public java.lang.String getConfirmApproveRejectSucess() {
        return confirmApproveRejectSucess;
    }


    /**
     * Sets the confirmApproveRejectSucess value for this ConfirmPurchaseOrderApproveReject.
     * 
     * @param confirmApproveRejectSucess
     */
    public void setConfirmApproveRejectSucess(java.lang.String confirmApproveRejectSucess) {
        this.confirmApproveRejectSucess = confirmApproveRejectSucess;
    }


    /**
     * Gets the numberOfDetailRemarksProcessed value for this ConfirmPurchaseOrderApproveReject.
     * 
     * @return numberOfDetailRemarksProcessed
     */
    public long getNumberOfDetailRemarksProcessed() {
        return numberOfDetailRemarksProcessed;
    }


    /**
     * Sets the numberOfDetailRemarksProcessed value for this ConfirmPurchaseOrderApproveReject.
     * 
     * @param numberOfDetailRemarksProcessed
     */
    public void setNumberOfDetailRemarksProcessed(long numberOfDetailRemarksProcessed) {
        this.numberOfDetailRemarksProcessed = numberOfDetailRemarksProcessed;
    }


    /**
     * Gets the numberOfPurchaseOrdersProcessed value for this ConfirmPurchaseOrderApproveReject.
     * 
     * @return numberOfPurchaseOrdersProcessed
     */
    public long getNumberOfPurchaseOrdersProcessed() {
        return numberOfPurchaseOrdersProcessed;
    }


    /**
     * Sets the numberOfPurchaseOrdersProcessed value for this ConfirmPurchaseOrderApproveReject.
     * 
     * @param numberOfPurchaseOrdersProcessed
     */
    public void setNumberOfPurchaseOrdersProcessed(long numberOfPurchaseOrdersProcessed) {
        this.numberOfPurchaseOrdersProcessed = numberOfPurchaseOrdersProcessed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmPurchaseOrderApproveReject)) return false;
        ConfirmPurchaseOrderApproveReject other = (ConfirmPurchaseOrderApproveReject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.confirmApproveRejectSucess==null && other.getConfirmApproveRejectSucess()==null) || 
             (this.confirmApproveRejectSucess!=null &&
              this.confirmApproveRejectSucess.equals(other.getConfirmApproveRejectSucess()))) &&
            this.numberOfDetailRemarksProcessed == other.getNumberOfDetailRemarksProcessed() &&
            this.numberOfPurchaseOrdersProcessed == other.getNumberOfPurchaseOrdersProcessed();
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
        if (getConfirmApproveRejectSucess() != null) {
            _hashCode += getConfirmApproveRejectSucess().hashCode();
        }
        _hashCode += new Long(getNumberOfDetailRemarksProcessed()).hashCode();
        _hashCode += new Long(getNumberOfPurchaseOrdersProcessed()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmPurchaseOrderApproveReject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderApproveReject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmApproveRejectSucess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirmApproveRejectSucess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDetailRemarksProcessed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfDetailRemarksProcessed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPurchaseOrdersProcessed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfPurchaseOrdersProcessed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
