/**
 * GetPurchaseOrdersForApprover.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class GetPurchaseOrdersForApprover  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private JP430000.bssv.e1.oracle.Entity approver;

    private java.lang.String businessUnitCode;

    private java.lang.String orderTypeCode;

    private java.lang.String statusApproval;

    private java.lang.String statusCodeNext;

    public GetPurchaseOrdersForApprover() {
    }

    public GetPurchaseOrdersForApprover(
           JP430000.bssv.e1.oracle.Entity approver,
           java.lang.String businessUnitCode,
           java.lang.String orderTypeCode,
           java.lang.String statusApproval,
           java.lang.String statusCodeNext) {
        this.approver = approver;
        this.businessUnitCode = businessUnitCode;
        this.orderTypeCode = orderTypeCode;
        this.statusApproval = statusApproval;
        this.statusCodeNext = statusCodeNext;
    }


    /**
     * Gets the approver value for this GetPurchaseOrdersForApprover.
     * 
     * @return approver
     */
    public JP430000.bssv.e1.oracle.Entity getApprover() {
        return approver;
    }


    /**
     * Sets the approver value for this GetPurchaseOrdersForApprover.
     * 
     * @param approver
     */
    public void setApprover(JP430000.bssv.e1.oracle.Entity approver) {
        this.approver = approver;
    }


    /**
     * Gets the businessUnitCode value for this GetPurchaseOrdersForApprover.
     * 
     * @return businessUnitCode
     */
    public java.lang.String getBusinessUnitCode() {
        return businessUnitCode;
    }


    /**
     * Sets the businessUnitCode value for this GetPurchaseOrdersForApprover.
     * 
     * @param businessUnitCode
     */
    public void setBusinessUnitCode(java.lang.String businessUnitCode) {
        this.businessUnitCode = businessUnitCode;
    }


    /**
     * Gets the orderTypeCode value for this GetPurchaseOrdersForApprover.
     * 
     * @return orderTypeCode
     */
    public java.lang.String getOrderTypeCode() {
        return orderTypeCode;
    }


    /**
     * Sets the orderTypeCode value for this GetPurchaseOrdersForApprover.
     * 
     * @param orderTypeCode
     */
    public void setOrderTypeCode(java.lang.String orderTypeCode) {
        this.orderTypeCode = orderTypeCode;
    }


    /**
     * Gets the statusApproval value for this GetPurchaseOrdersForApprover.
     * 
     * @return statusApproval
     */
    public java.lang.String getStatusApproval() {
        return statusApproval;
    }


    /**
     * Sets the statusApproval value for this GetPurchaseOrdersForApprover.
     * 
     * @param statusApproval
     */
    public void setStatusApproval(java.lang.String statusApproval) {
        this.statusApproval = statusApproval;
    }


    /**
     * Gets the statusCodeNext value for this GetPurchaseOrdersForApprover.
     * 
     * @return statusCodeNext
     */
    public java.lang.String getStatusCodeNext() {
        return statusCodeNext;
    }


    /**
     * Sets the statusCodeNext value for this GetPurchaseOrdersForApprover.
     * 
     * @param statusCodeNext
     */
    public void setStatusCodeNext(java.lang.String statusCodeNext) {
        this.statusCodeNext = statusCodeNext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPurchaseOrdersForApprover)) return false;
        GetPurchaseOrdersForApprover other = (GetPurchaseOrdersForApprover) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approver==null && other.getApprover()==null) || 
             (this.approver!=null &&
              this.approver.equals(other.getApprover()))) &&
            ((this.businessUnitCode==null && other.getBusinessUnitCode()==null) || 
             (this.businessUnitCode!=null &&
              this.businessUnitCode.equals(other.getBusinessUnitCode()))) &&
            ((this.orderTypeCode==null && other.getOrderTypeCode()==null) || 
             (this.orderTypeCode!=null &&
              this.orderTypeCode.equals(other.getOrderTypeCode()))) &&
            ((this.statusApproval==null && other.getStatusApproval()==null) || 
             (this.statusApproval!=null &&
              this.statusApproval.equals(other.getStatusApproval()))) &&
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
        if (getApprover() != null) {
            _hashCode += getApprover().hashCode();
        }
        if (getBusinessUnitCode() != null) {
            _hashCode += getBusinessUnitCode().hashCode();
        }
        if (getOrderTypeCode() != null) {
            _hashCode += getOrderTypeCode().hashCode();
        }
        if (getStatusApproval() != null) {
            _hashCode += getStatusApproval().hashCode();
        }
        if (getStatusCodeNext() != null) {
            _hashCode += getStatusCodeNext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPurchaseOrdersForApprover.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrdersForApprover"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnitCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnitCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusApproval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusApproval"));
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
