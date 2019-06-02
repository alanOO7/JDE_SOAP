/**
 * ProcessSOCustomerV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class ProcessSOCustomerV2  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String addressLine1;

    private java.lang.String addressLine2;

    private java.lang.String addressLine3;

    private java.lang.String addressLine4;

    private java.lang.String city;

    private java.lang.String countryCode;

    private java.lang.String countyCode;

    private JP420000.bssv.e1.oracle.Entity customer;

    private java.lang.String customerGLN;

    private java.lang.String mailingName;

    private java.lang.String postalCode;

    private java.lang.String stateCode;

    public ProcessSOCustomerV2() {
    }

    public ProcessSOCustomerV2(
           java.lang.String addressLine1,
           java.lang.String addressLine2,
           java.lang.String addressLine3,
           java.lang.String addressLine4,
           java.lang.String city,
           java.lang.String countryCode,
           java.lang.String countyCode,
           JP420000.bssv.e1.oracle.Entity customer,
           java.lang.String customerGLN,
           java.lang.String mailingName,
           java.lang.String postalCode,
           java.lang.String stateCode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.addressLine4 = addressLine4;
        this.city = city;
        this.countryCode = countryCode;
        this.countyCode = countyCode;
        this.customer = customer;
        this.customerGLN = customerGLN;
        this.mailingName = mailingName;
        this.postalCode = postalCode;
        this.stateCode = stateCode;
    }


    /**
     * Gets the addressLine1 value for this ProcessSOCustomerV2.
     * 
     * @return addressLine1
     */
    public java.lang.String getAddressLine1() {
        return addressLine1;
    }


    /**
     * Sets the addressLine1 value for this ProcessSOCustomerV2.
     * 
     * @param addressLine1
     */
    public void setAddressLine1(java.lang.String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    /**
     * Gets the addressLine2 value for this ProcessSOCustomerV2.
     * 
     * @return addressLine2
     */
    public java.lang.String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Sets the addressLine2 value for this ProcessSOCustomerV2.
     * 
     * @param addressLine2
     */
    public void setAddressLine2(java.lang.String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    /**
     * Gets the addressLine3 value for this ProcessSOCustomerV2.
     * 
     * @return addressLine3
     */
    public java.lang.String getAddressLine3() {
        return addressLine3;
    }


    /**
     * Sets the addressLine3 value for this ProcessSOCustomerV2.
     * 
     * @param addressLine3
     */
    public void setAddressLine3(java.lang.String addressLine3) {
        this.addressLine3 = addressLine3;
    }


    /**
     * Gets the addressLine4 value for this ProcessSOCustomerV2.
     * 
     * @return addressLine4
     */
    public java.lang.String getAddressLine4() {
        return addressLine4;
    }


    /**
     * Sets the addressLine4 value for this ProcessSOCustomerV2.
     * 
     * @param addressLine4
     */
    public void setAddressLine4(java.lang.String addressLine4) {
        this.addressLine4 = addressLine4;
    }


    /**
     * Gets the city value for this ProcessSOCustomerV2.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ProcessSOCustomerV2.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the countryCode value for this ProcessSOCustomerV2.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this ProcessSOCustomerV2.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the countyCode value for this ProcessSOCustomerV2.
     * 
     * @return countyCode
     */
    public java.lang.String getCountyCode() {
        return countyCode;
    }


    /**
     * Sets the countyCode value for this ProcessSOCustomerV2.
     * 
     * @param countyCode
     */
    public void setCountyCode(java.lang.String countyCode) {
        this.countyCode = countyCode;
    }


    /**
     * Gets the customer value for this ProcessSOCustomerV2.
     * 
     * @return customer
     */
    public JP420000.bssv.e1.oracle.Entity getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this ProcessSOCustomerV2.
     * 
     * @param customer
     */
    public void setCustomer(JP420000.bssv.e1.oracle.Entity customer) {
        this.customer = customer;
    }


    /**
     * Gets the customerGLN value for this ProcessSOCustomerV2.
     * 
     * @return customerGLN
     */
    public java.lang.String getCustomerGLN() {
        return customerGLN;
    }


    /**
     * Sets the customerGLN value for this ProcessSOCustomerV2.
     * 
     * @param customerGLN
     */
    public void setCustomerGLN(java.lang.String customerGLN) {
        this.customerGLN = customerGLN;
    }


    /**
     * Gets the mailingName value for this ProcessSOCustomerV2.
     * 
     * @return mailingName
     */
    public java.lang.String getMailingName() {
        return mailingName;
    }


    /**
     * Sets the mailingName value for this ProcessSOCustomerV2.
     * 
     * @param mailingName
     */
    public void setMailingName(java.lang.String mailingName) {
        this.mailingName = mailingName;
    }


    /**
     * Gets the postalCode value for this ProcessSOCustomerV2.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this ProcessSOCustomerV2.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the stateCode value for this ProcessSOCustomerV2.
     * 
     * @return stateCode
     */
    public java.lang.String getStateCode() {
        return stateCode;
    }


    /**
     * Sets the stateCode value for this ProcessSOCustomerV2.
     * 
     * @param stateCode
     */
    public void setStateCode(java.lang.String stateCode) {
        this.stateCode = stateCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessSOCustomerV2)) return false;
        ProcessSOCustomerV2 other = (ProcessSOCustomerV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addressLine1==null && other.getAddressLine1()==null) || 
             (this.addressLine1!=null &&
              this.addressLine1.equals(other.getAddressLine1()))) &&
            ((this.addressLine2==null && other.getAddressLine2()==null) || 
             (this.addressLine2!=null &&
              this.addressLine2.equals(other.getAddressLine2()))) &&
            ((this.addressLine3==null && other.getAddressLine3()==null) || 
             (this.addressLine3!=null &&
              this.addressLine3.equals(other.getAddressLine3()))) &&
            ((this.addressLine4==null && other.getAddressLine4()==null) || 
             (this.addressLine4!=null &&
              this.addressLine4.equals(other.getAddressLine4()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.countyCode==null && other.getCountyCode()==null) || 
             (this.countyCode!=null &&
              this.countyCode.equals(other.getCountyCode()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.customerGLN==null && other.getCustomerGLN()==null) || 
             (this.customerGLN!=null &&
              this.customerGLN.equals(other.getCustomerGLN()))) &&
            ((this.mailingName==null && other.getMailingName()==null) || 
             (this.mailingName!=null &&
              this.mailingName.equals(other.getMailingName()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.stateCode==null && other.getStateCode()==null) || 
             (this.stateCode!=null &&
              this.stateCode.equals(other.getStateCode())));
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
        if (getAddressLine1() != null) {
            _hashCode += getAddressLine1().hashCode();
        }
        if (getAddressLine2() != null) {
            _hashCode += getAddressLine2().hashCode();
        }
        if (getAddressLine3() != null) {
            _hashCode += getAddressLine3().hashCode();
        }
        if (getAddressLine4() != null) {
            _hashCode += getAddressLine4().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getCountyCode() != null) {
            _hashCode += getCountyCode().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getCustomerGLN() != null) {
            _hashCode += getCustomerGLN().hashCode();
        }
        if (getMailingName() != null) {
            _hashCode += getMailingName().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getStateCode() != null) {
            _hashCode += getStateCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessSOCustomerV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOCustomerV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressLine4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGLN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerGLN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateCode"));
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
