/**
 * ShowPurchaseOrderDetailForApprover.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ShowPurchaseOrderDetailForApprover  extends JP430000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private JP430000.bssv.e1.oracle.PurchaseOrderDetailForApproverResults[] purchaseOrderDetailForApproverResults;

    public ShowPurchaseOrderDetailForApprover() {
    }

    public ShowPurchaseOrderDetailForApprover(
           JP430000.bssv.e1.oracle.E1Message[] e1MessageList,
           JP430000.bssv.e1.oracle.PurchaseOrderDetailForApproverResults[] purchaseOrderDetailForApproverResults) {
        super(
            e1MessageList);
        this.purchaseOrderDetailForApproverResults = purchaseOrderDetailForApproverResults;
    }


    /**
     * Gets the purchaseOrderDetailForApproverResults value for this ShowPurchaseOrderDetailForApprover.
     * 
     * @return purchaseOrderDetailForApproverResults
     */
    public JP430000.bssv.e1.oracle.PurchaseOrderDetailForApproverResults[] getPurchaseOrderDetailForApproverResults() {
        return purchaseOrderDetailForApproverResults;
    }


    /**
     * Sets the purchaseOrderDetailForApproverResults value for this ShowPurchaseOrderDetailForApprover.
     * 
     * @param purchaseOrderDetailForApproverResults
     */
    public void setPurchaseOrderDetailForApproverResults(JP430000.bssv.e1.oracle.PurchaseOrderDetailForApproverResults[] purchaseOrderDetailForApproverResults) {
        this.purchaseOrderDetailForApproverResults = purchaseOrderDetailForApproverResults;
    }

    public JP430000.bssv.e1.oracle.PurchaseOrderDetailForApproverResults getPurchaseOrderDetailForApproverResults(int i) {
        return this.purchaseOrderDetailForApproverResults[i];
    }

    public void setPurchaseOrderDetailForApproverResults(int i, JP430000.bssv.e1.oracle.PurchaseOrderDetailForApproverResults _value) {
        this.purchaseOrderDetailForApproverResults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowPurchaseOrderDetailForApprover)) return false;
        ShowPurchaseOrderDetailForApprover other = (ShowPurchaseOrderDetailForApprover) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.purchaseOrderDetailForApproverResults==null && other.getPurchaseOrderDetailForApproverResults()==null) || 
             (this.purchaseOrderDetailForApproverResults!=null &&
              java.util.Arrays.equals(this.purchaseOrderDetailForApproverResults, other.getPurchaseOrderDetailForApproverResults())));
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
        if (getPurchaseOrderDetailForApproverResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderDetailForApproverResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderDetailForApproverResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShowPurchaseOrderDetailForApprover.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrderDetailForApprover"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderDetailForApproverResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrderDetailForApproverResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDetailForApproverResults"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
