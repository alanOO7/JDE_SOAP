/**
 * CategoryCodesPurchasing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class CategoryCodesPurchasing  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String categoryCode001;

    private java.lang.String categoryCode002;

    private java.lang.String categoryCode003;

    private java.lang.String categoryCode004;

    private java.lang.String categoryCode005;

    public CategoryCodesPurchasing() {
    }

    public CategoryCodesPurchasing(
           java.lang.String categoryCode001,
           java.lang.String categoryCode002,
           java.lang.String categoryCode003,
           java.lang.String categoryCode004,
           java.lang.String categoryCode005) {
        this.categoryCode001 = categoryCode001;
        this.categoryCode002 = categoryCode002;
        this.categoryCode003 = categoryCode003;
        this.categoryCode004 = categoryCode004;
        this.categoryCode005 = categoryCode005;
    }


    /**
     * Gets the categoryCode001 value for this CategoryCodesPurchasing.
     * 
     * @return categoryCode001
     */
    public java.lang.String getCategoryCode001() {
        return categoryCode001;
    }


    /**
     * Sets the categoryCode001 value for this CategoryCodesPurchasing.
     * 
     * @param categoryCode001
     */
    public void setCategoryCode001(java.lang.String categoryCode001) {
        this.categoryCode001 = categoryCode001;
    }


    /**
     * Gets the categoryCode002 value for this CategoryCodesPurchasing.
     * 
     * @return categoryCode002
     */
    public java.lang.String getCategoryCode002() {
        return categoryCode002;
    }


    /**
     * Sets the categoryCode002 value for this CategoryCodesPurchasing.
     * 
     * @param categoryCode002
     */
    public void setCategoryCode002(java.lang.String categoryCode002) {
        this.categoryCode002 = categoryCode002;
    }


    /**
     * Gets the categoryCode003 value for this CategoryCodesPurchasing.
     * 
     * @return categoryCode003
     */
    public java.lang.String getCategoryCode003() {
        return categoryCode003;
    }


    /**
     * Sets the categoryCode003 value for this CategoryCodesPurchasing.
     * 
     * @param categoryCode003
     */
    public void setCategoryCode003(java.lang.String categoryCode003) {
        this.categoryCode003 = categoryCode003;
    }


    /**
     * Gets the categoryCode004 value for this CategoryCodesPurchasing.
     * 
     * @return categoryCode004
     */
    public java.lang.String getCategoryCode004() {
        return categoryCode004;
    }


    /**
     * Sets the categoryCode004 value for this CategoryCodesPurchasing.
     * 
     * @param categoryCode004
     */
    public void setCategoryCode004(java.lang.String categoryCode004) {
        this.categoryCode004 = categoryCode004;
    }


    /**
     * Gets the categoryCode005 value for this CategoryCodesPurchasing.
     * 
     * @return categoryCode005
     */
    public java.lang.String getCategoryCode005() {
        return categoryCode005;
    }


    /**
     * Sets the categoryCode005 value for this CategoryCodesPurchasing.
     * 
     * @param categoryCode005
     */
    public void setCategoryCode005(java.lang.String categoryCode005) {
        this.categoryCode005 = categoryCode005;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoryCodesPurchasing)) return false;
        CategoryCodesPurchasing other = (CategoryCodesPurchasing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.categoryCode001==null && other.getCategoryCode001()==null) || 
             (this.categoryCode001!=null &&
              this.categoryCode001.equals(other.getCategoryCode001()))) &&
            ((this.categoryCode002==null && other.getCategoryCode002()==null) || 
             (this.categoryCode002!=null &&
              this.categoryCode002.equals(other.getCategoryCode002()))) &&
            ((this.categoryCode003==null && other.getCategoryCode003()==null) || 
             (this.categoryCode003!=null &&
              this.categoryCode003.equals(other.getCategoryCode003()))) &&
            ((this.categoryCode004==null && other.getCategoryCode004()==null) || 
             (this.categoryCode004!=null &&
              this.categoryCode004.equals(other.getCategoryCode004()))) &&
            ((this.categoryCode005==null && other.getCategoryCode005()==null) || 
             (this.categoryCode005!=null &&
              this.categoryCode005.equals(other.getCategoryCode005())));
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
        if (getCategoryCode001() != null) {
            _hashCode += getCategoryCode001().hashCode();
        }
        if (getCategoryCode002() != null) {
            _hashCode += getCategoryCode002().hashCode();
        }
        if (getCategoryCode003() != null) {
            _hashCode += getCategoryCode003().hashCode();
        }
        if (getCategoryCode004() != null) {
            _hashCode += getCategoryCode004().hashCode();
        }
        if (getCategoryCode005() != null) {
            _hashCode += getCategoryCode005().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoryCodesPurchasing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "categoryCodesPurchasing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryCode001");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryCode001"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryCode002");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryCode002"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryCode003");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryCode003"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryCode004");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryCode004"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryCode005");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryCode005"));
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
