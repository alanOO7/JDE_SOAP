/**
 * ShowPurchaseOrdersForApprover.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ShowPurchaseOrdersForApprover  extends JP430000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private JP430000.bssv.e1.oracle.PurchaseOrdersForApproverResults[] purchaseOrdersForApproverResults;

    public ShowPurchaseOrdersForApprover() {
    }

    public ShowPurchaseOrdersForApprover(
           JP430000.bssv.e1.oracle.E1Message[] e1MessageList,
           JP430000.bssv.e1.oracle.PurchaseOrdersForApproverResults[] purchaseOrdersForApproverResults) {
        super(
            e1MessageList);
        this.purchaseOrdersForApproverResults = purchaseOrdersForApproverResults;
    }


    /**
     * Gets the purchaseOrdersForApproverResults value for this ShowPurchaseOrdersForApprover.
     * 
     * @return purchaseOrdersForApproverResults
     */
    public JP430000.bssv.e1.oracle.PurchaseOrdersForApproverResults[] getPurchaseOrdersForApproverResults() {
        return purchaseOrdersForApproverResults;
    }


    /**
     * Sets the purchaseOrdersForApproverResults value for this ShowPurchaseOrdersForApprover.
     * 
     * @param purchaseOrdersForApproverResults
     */
    public void setPurchaseOrdersForApproverResults(JP430000.bssv.e1.oracle.PurchaseOrdersForApproverResults[] purchaseOrdersForApproverResults) {
        this.purchaseOrdersForApproverResults = purchaseOrdersForApproverResults;
    }

    public JP430000.bssv.e1.oracle.PurchaseOrdersForApproverResults getPurchaseOrdersForApproverResults(int i) {
        return this.purchaseOrdersForApproverResults[i];
    }

    public void setPurchaseOrdersForApproverResults(int i, JP430000.bssv.e1.oracle.PurchaseOrdersForApproverResults _value) {
        this.purchaseOrdersForApproverResults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowPurchaseOrdersForApprover)) return false;
        ShowPurchaseOrdersForApprover other = (ShowPurchaseOrdersForApprover) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.purchaseOrdersForApproverResults==null && other.getPurchaseOrdersForApproverResults()==null) || 
             (this.purchaseOrdersForApproverResults!=null &&
              java.util.Arrays.equals(this.purchaseOrdersForApproverResults, other.getPurchaseOrdersForApproverResults())));
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
        if (getPurchaseOrdersForApproverResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrdersForApproverResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrdersForApproverResults(), i);
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
        new org.apache.axis.description.TypeDesc(ShowPurchaseOrdersForApprover.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrdersForApprover"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrdersForApproverResults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseOrdersForApproverResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrdersForApproverResults"));
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
