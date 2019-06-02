/**
 * Entity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class Entity  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.Integer entityId;

    private java.lang.String entityLongId;

    private java.lang.String entityTaxId;

    public Entity() {
    }

    public Entity(
           java.lang.Integer entityId,
           java.lang.String entityLongId,
           java.lang.String entityTaxId) {
        this.entityId = entityId;
        this.entityLongId = entityLongId;
        this.entityTaxId = entityTaxId;
    }


    /**
     * Gets the entityId value for this Entity.
     * 
     * @return entityId
     */
    public java.lang.Integer getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this Entity.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.Integer entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the entityLongId value for this Entity.
     * 
     * @return entityLongId
     */
    public java.lang.String getEntityLongId() {
        return entityLongId;
    }


    /**
     * Sets the entityLongId value for this Entity.
     * 
     * @param entityLongId
     */
    public void setEntityLongId(java.lang.String entityLongId) {
        this.entityLongId = entityLongId;
    }


    /**
     * Gets the entityTaxId value for this Entity.
     * 
     * @return entityTaxId
     */
    public java.lang.String getEntityTaxId() {
        return entityTaxId;
    }


    /**
     * Sets the entityTaxId value for this Entity.
     * 
     * @param entityTaxId
     */
    public void setEntityTaxId(java.lang.String entityTaxId) {
        this.entityTaxId = entityTaxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entity)) return false;
        Entity other = (Entity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.entityLongId==null && other.getEntityLongId()==null) || 
             (this.entityLongId!=null &&
              this.entityLongId.equals(other.getEntityLongId()))) &&
            ((this.entityTaxId==null && other.getEntityTaxId()==null) || 
             (this.entityTaxId!=null &&
              this.entityTaxId.equals(other.getEntityTaxId())));
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
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getEntityLongId() != null) {
            _hashCode += getEntityLongId().hashCode();
        }
        if (getEntityTaxId() != null) {
            _hashCode += getEntityTaxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityLongId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityLongId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityTaxId"));
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
