/**
 * ShowPriceHistoryDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ShowPriceHistoryDetail  extends JP420000.bssv.e1.oracle.PriceHistory  implements java.io.Serializable {
    private JP420000.bssv.e1.oracle.PriceAdjustmentLedger[] priceAdjustmentLedger;

    public ShowPriceHistoryDetail() {
    }

    public ShowPriceHistoryDetail(
           java.math.BigDecimal documentLineNumber,
           JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey,
           JP420000.bssv.e1.oracle.PriceAdjustmentLedger[] priceAdjustmentLedger) {
        super(
            documentLineNumber,
            salesOrderKey);
        this.priceAdjustmentLedger = priceAdjustmentLedger;
    }


    /**
     * Gets the priceAdjustmentLedger value for this ShowPriceHistoryDetail.
     * 
     * @return priceAdjustmentLedger
     */
    public JP420000.bssv.e1.oracle.PriceAdjustmentLedger[] getPriceAdjustmentLedger() {
        return priceAdjustmentLedger;
    }


    /**
     * Sets the priceAdjustmentLedger value for this ShowPriceHistoryDetail.
     * 
     * @param priceAdjustmentLedger
     */
    public void setPriceAdjustmentLedger(JP420000.bssv.e1.oracle.PriceAdjustmentLedger[] priceAdjustmentLedger) {
        this.priceAdjustmentLedger = priceAdjustmentLedger;
    }

    public JP420000.bssv.e1.oracle.PriceAdjustmentLedger getPriceAdjustmentLedger(int i) {
        return this.priceAdjustmentLedger[i];
    }

    public void setPriceAdjustmentLedger(int i, JP420000.bssv.e1.oracle.PriceAdjustmentLedger _value) {
        this.priceAdjustmentLedger[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowPriceHistoryDetail)) return false;
        ShowPriceHistoryDetail other = (ShowPriceHistoryDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.priceAdjustmentLedger==null && other.getPriceAdjustmentLedger()==null) || 
             (this.priceAdjustmentLedger!=null &&
              java.util.Arrays.equals(this.priceAdjustmentLedger, other.getPriceAdjustmentLedger())));
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
        if (getPriceAdjustmentLedger() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceAdjustmentLedger());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriceAdjustmentLedger(), i);
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
        new org.apache.axis.description.TypeDesc(ShowPriceHistoryDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showPriceHistoryDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceAdjustmentLedger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceAdjustmentLedger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "priceAdjustmentLedger"));
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
