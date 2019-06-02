/**
 * Segment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class Segment  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.Integer segmentNumber;

    private java.lang.String segmentValue;

    public Segment() {
    }

    public Segment(
           java.lang.Integer segmentNumber,
           java.lang.String segmentValue) {
        this.segmentNumber = segmentNumber;
        this.segmentValue = segmentValue;
    }


    /**
     * Gets the segmentNumber value for this Segment.
     * 
     * @return segmentNumber
     */
    public java.lang.Integer getSegmentNumber() {
        return segmentNumber;
    }


    /**
     * Sets the segmentNumber value for this Segment.
     * 
     * @param segmentNumber
     */
    public void setSegmentNumber(java.lang.Integer segmentNumber) {
        this.segmentNumber = segmentNumber;
    }


    /**
     * Gets the segmentValue value for this Segment.
     * 
     * @return segmentValue
     */
    public java.lang.String getSegmentValue() {
        return segmentValue;
    }


    /**
     * Sets the segmentValue value for this Segment.
     * 
     * @param segmentValue
     */
    public void setSegmentValue(java.lang.String segmentValue) {
        this.segmentValue = segmentValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Segment)) return false;
        Segment other = (Segment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.segmentNumber==null && other.getSegmentNumber()==null) || 
             (this.segmentNumber!=null &&
              this.segmentNumber.equals(other.getSegmentNumber()))) &&
            ((this.segmentValue==null && other.getSegmentValue()==null) || 
             (this.segmentValue!=null &&
              this.segmentValue.equals(other.getSegmentValue())));
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
        if (getSegmentNumber() != null) {
            _hashCode += getSegmentNumber().hashCode();
        }
        if (getSegmentValue() != null) {
            _hashCode += getSegmentValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Segment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "segment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmentValue"));
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
