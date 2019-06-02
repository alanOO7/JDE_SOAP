/**
 * Project.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class Project  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.Integer projectNumber;

    private java.lang.Integer taskOrderNumber;

    private java.lang.String taskOrderType;

    public Project() {
    }

    public Project(
           java.lang.Integer projectNumber,
           java.lang.Integer taskOrderNumber,
           java.lang.String taskOrderType) {
        this.projectNumber = projectNumber;
        this.taskOrderNumber = taskOrderNumber;
        this.taskOrderType = taskOrderType;
    }


    /**
     * Gets the projectNumber value for this Project.
     * 
     * @return projectNumber
     */
    public java.lang.Integer getProjectNumber() {
        return projectNumber;
    }


    /**
     * Sets the projectNumber value for this Project.
     * 
     * @param projectNumber
     */
    public void setProjectNumber(java.lang.Integer projectNumber) {
        this.projectNumber = projectNumber;
    }


    /**
     * Gets the taskOrderNumber value for this Project.
     * 
     * @return taskOrderNumber
     */
    public java.lang.Integer getTaskOrderNumber() {
        return taskOrderNumber;
    }


    /**
     * Sets the taskOrderNumber value for this Project.
     * 
     * @param taskOrderNumber
     */
    public void setTaskOrderNumber(java.lang.Integer taskOrderNumber) {
        this.taskOrderNumber = taskOrderNumber;
    }


    /**
     * Gets the taskOrderType value for this Project.
     * 
     * @return taskOrderType
     */
    public java.lang.String getTaskOrderType() {
        return taskOrderType;
    }


    /**
     * Sets the taskOrderType value for this Project.
     * 
     * @param taskOrderType
     */
    public void setTaskOrderType(java.lang.String taskOrderType) {
        this.taskOrderType = taskOrderType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Project)) return false;
        Project other = (Project) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.projectNumber==null && other.getProjectNumber()==null) || 
             (this.projectNumber!=null &&
              this.projectNumber.equals(other.getProjectNumber()))) &&
            ((this.taskOrderNumber==null && other.getTaskOrderNumber()==null) || 
             (this.taskOrderNumber!=null &&
              this.taskOrderNumber.equals(other.getTaskOrderNumber()))) &&
            ((this.taskOrderType==null && other.getTaskOrderType()==null) || 
             (this.taskOrderType!=null &&
              this.taskOrderType.equals(other.getTaskOrderType())));
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
        if (getProjectNumber() != null) {
            _hashCode += getProjectNumber().hashCode();
        }
        if (getTaskOrderNumber() != null) {
            _hashCode += getTaskOrderNumber().hashCode();
        }
        if (getTaskOrderType() != null) {
            _hashCode += getTaskOrderType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Project.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "project"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projectNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskOrderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskOrderType"));
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
