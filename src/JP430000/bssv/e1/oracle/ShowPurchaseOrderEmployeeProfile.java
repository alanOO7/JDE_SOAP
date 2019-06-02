/**
 * ShowPurchaseOrderEmployeeProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ShowPurchaseOrderEmployeeProfile  extends JP430000.bssv.e1.oracle.MessageValueObject  implements java.io.Serializable {
    private java.lang.Integer approverId;

    private java.lang.String approverName;

    private java.lang.String dateDisplayPreference;

    private java.lang.String dateSeparator;

    private java.lang.String userLanguagePreference;

    public ShowPurchaseOrderEmployeeProfile() {
    }

    public ShowPurchaseOrderEmployeeProfile(
           JP430000.bssv.e1.oracle.E1Message[] e1MessageList,
           java.lang.Integer approverId,
           java.lang.String approverName,
           java.lang.String dateDisplayPreference,
           java.lang.String dateSeparator,
           java.lang.String userLanguagePreference) {
        super(
            e1MessageList);
        this.approverId = approverId;
        this.approverName = approverName;
        this.dateDisplayPreference = dateDisplayPreference;
        this.dateSeparator = dateSeparator;
        this.userLanguagePreference = userLanguagePreference;
    }


    /**
     * Gets the approverId value for this ShowPurchaseOrderEmployeeProfile.
     * 
     * @return approverId
     */
    public java.lang.Integer getApproverId() {
        return approverId;
    }


    /**
     * Sets the approverId value for this ShowPurchaseOrderEmployeeProfile.
     * 
     * @param approverId
     */
    public void setApproverId(java.lang.Integer approverId) {
        this.approverId = approverId;
    }


    /**
     * Gets the approverName value for this ShowPurchaseOrderEmployeeProfile.
     * 
     * @return approverName
     */
    public java.lang.String getApproverName() {
        return approverName;
    }


    /**
     * Sets the approverName value for this ShowPurchaseOrderEmployeeProfile.
     * 
     * @param approverName
     */
    public void setApproverName(java.lang.String approverName) {
        this.approverName = approverName;
    }


    /**
     * Gets the dateDisplayPreference value for this ShowPurchaseOrderEmployeeProfile.
     * 
     * @return dateDisplayPreference
     */
    public java.lang.String getDateDisplayPreference() {
        return dateDisplayPreference;
    }


    /**
     * Sets the dateDisplayPreference value for this ShowPurchaseOrderEmployeeProfile.
     * 
     * @param dateDisplayPreference
     */
    public void setDateDisplayPreference(java.lang.String dateDisplayPreference) {
        this.dateDisplayPreference = dateDisplayPreference;
    }


    /**
     * Gets the dateSeparator value for this ShowPurchaseOrderEmployeeProfile.
     * 
     * @return dateSeparator
     */
    public java.lang.String getDateSeparator() {
        return dateSeparator;
    }


    /**
     * Sets the dateSeparator value for this ShowPurchaseOrderEmployeeProfile.
     * 
     * @param dateSeparator
     */
    public void setDateSeparator(java.lang.String dateSeparator) {
        this.dateSeparator = dateSeparator;
    }


    /**
     * Gets the userLanguagePreference value for this ShowPurchaseOrderEmployeeProfile.
     * 
     * @return userLanguagePreference
     */
    public java.lang.String getUserLanguagePreference() {
        return userLanguagePreference;
    }


    /**
     * Sets the userLanguagePreference value for this ShowPurchaseOrderEmployeeProfile.
     * 
     * @param userLanguagePreference
     */
    public void setUserLanguagePreference(java.lang.String userLanguagePreference) {
        this.userLanguagePreference = userLanguagePreference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowPurchaseOrderEmployeeProfile)) return false;
        ShowPurchaseOrderEmployeeProfile other = (ShowPurchaseOrderEmployeeProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approverId==null && other.getApproverId()==null) || 
             (this.approverId!=null &&
              this.approverId.equals(other.getApproverId()))) &&
            ((this.approverName==null && other.getApproverName()==null) || 
             (this.approverName!=null &&
              this.approverName.equals(other.getApproverName()))) &&
            ((this.dateDisplayPreference==null && other.getDateDisplayPreference()==null) || 
             (this.dateDisplayPreference!=null &&
              this.dateDisplayPreference.equals(other.getDateDisplayPreference()))) &&
            ((this.dateSeparator==null && other.getDateSeparator()==null) || 
             (this.dateSeparator!=null &&
              this.dateSeparator.equals(other.getDateSeparator()))) &&
            ((this.userLanguagePreference==null && other.getUserLanguagePreference()==null) || 
             (this.userLanguagePreference!=null &&
              this.userLanguagePreference.equals(other.getUserLanguagePreference())));
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
        if (getApproverId() != null) {
            _hashCode += getApproverId().hashCode();
        }
        if (getApproverName() != null) {
            _hashCode += getApproverName().hashCode();
        }
        if (getDateDisplayPreference() != null) {
            _hashCode += getDateDisplayPreference().hashCode();
        }
        if (getDateSeparator() != null) {
            _hashCode += getDateSeparator().hashCode();
        }
        if (getUserLanguagePreference() != null) {
            _hashCode += getUserLanguagePreference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShowPurchaseOrderEmployeeProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrderEmployeeProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approverId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateDisplayPreference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateDisplayPreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateSeparator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateSeparator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLanguagePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLanguagePreference"));
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
