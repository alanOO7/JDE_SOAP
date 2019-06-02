/**
 * PurchaseOrderFinancialDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class PurchaseOrderFinancialDetail  extends JP430000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String assetId;

    private JP430000.bssv.e1.oracle.GlAccount glAccount;

    private JP430000.bssv.e1.oracle.GlAccountKey glAccountKey;

    private java.lang.String glClassCode;

    private java.lang.String subledger;

    private java.lang.String subledgerTypeCode;

    public PurchaseOrderFinancialDetail() {
    }

    public PurchaseOrderFinancialDetail(
           java.lang.String assetId,
           JP430000.bssv.e1.oracle.GlAccount glAccount,
           JP430000.bssv.e1.oracle.GlAccountKey glAccountKey,
           java.lang.String glClassCode,
           java.lang.String subledger,
           java.lang.String subledgerTypeCode) {
        this.assetId = assetId;
        this.glAccount = glAccount;
        this.glAccountKey = glAccountKey;
        this.glClassCode = glClassCode;
        this.subledger = subledger;
        this.subledgerTypeCode = subledgerTypeCode;
    }


    /**
     * Gets the assetId value for this PurchaseOrderFinancialDetail.
     * 
     * @return assetId
     */
    public java.lang.String getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this PurchaseOrderFinancialDetail.
     * 
     * @param assetId
     */
    public void setAssetId(java.lang.String assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the glAccount value for this PurchaseOrderFinancialDetail.
     * 
     * @return glAccount
     */
    public JP430000.bssv.e1.oracle.GlAccount getGlAccount() {
        return glAccount;
    }


    /**
     * Sets the glAccount value for this PurchaseOrderFinancialDetail.
     * 
     * @param glAccount
     */
    public void setGlAccount(JP430000.bssv.e1.oracle.GlAccount glAccount) {
        this.glAccount = glAccount;
    }


    /**
     * Gets the glAccountKey value for this PurchaseOrderFinancialDetail.
     * 
     * @return glAccountKey
     */
    public JP430000.bssv.e1.oracle.GlAccountKey getGlAccountKey() {
        return glAccountKey;
    }


    /**
     * Sets the glAccountKey value for this PurchaseOrderFinancialDetail.
     * 
     * @param glAccountKey
     */
    public void setGlAccountKey(JP430000.bssv.e1.oracle.GlAccountKey glAccountKey) {
        this.glAccountKey = glAccountKey;
    }


    /**
     * Gets the glClassCode value for this PurchaseOrderFinancialDetail.
     * 
     * @return glClassCode
     */
    public java.lang.String getGlClassCode() {
        return glClassCode;
    }


    /**
     * Sets the glClassCode value for this PurchaseOrderFinancialDetail.
     * 
     * @param glClassCode
     */
    public void setGlClassCode(java.lang.String glClassCode) {
        this.glClassCode = glClassCode;
    }


    /**
     * Gets the subledger value for this PurchaseOrderFinancialDetail.
     * 
     * @return subledger
     */
    public java.lang.String getSubledger() {
        return subledger;
    }


    /**
     * Sets the subledger value for this PurchaseOrderFinancialDetail.
     * 
     * @param subledger
     */
    public void setSubledger(java.lang.String subledger) {
        this.subledger = subledger;
    }


    /**
     * Gets the subledgerTypeCode value for this PurchaseOrderFinancialDetail.
     * 
     * @return subledgerTypeCode
     */
    public java.lang.String getSubledgerTypeCode() {
        return subledgerTypeCode;
    }


    /**
     * Sets the subledgerTypeCode value for this PurchaseOrderFinancialDetail.
     * 
     * @param subledgerTypeCode
     */
    public void setSubledgerTypeCode(java.lang.String subledgerTypeCode) {
        this.subledgerTypeCode = subledgerTypeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderFinancialDetail)) return false;
        PurchaseOrderFinancialDetail other = (PurchaseOrderFinancialDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.glAccount==null && other.getGlAccount()==null) || 
             (this.glAccount!=null &&
              this.glAccount.equals(other.getGlAccount()))) &&
            ((this.glAccountKey==null && other.getGlAccountKey()==null) || 
             (this.glAccountKey!=null &&
              this.glAccountKey.equals(other.getGlAccountKey()))) &&
            ((this.glClassCode==null && other.getGlClassCode()==null) || 
             (this.glClassCode!=null &&
              this.glClassCode.equals(other.getGlClassCode()))) &&
            ((this.subledger==null && other.getSubledger()==null) || 
             (this.subledger!=null &&
              this.subledger.equals(other.getSubledger()))) &&
            ((this.subledgerTypeCode==null && other.getSubledgerTypeCode()==null) || 
             (this.subledgerTypeCode!=null &&
              this.subledgerTypeCode.equals(other.getSubledgerTypeCode())));
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
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getGlAccount() != null) {
            _hashCode += getGlAccount().hashCode();
        }
        if (getGlAccountKey() != null) {
            _hashCode += getGlAccountKey().hashCode();
        }
        if (getGlClassCode() != null) {
            _hashCode += getGlClassCode().hashCode();
        }
        if (getSubledger() != null) {
            _hashCode += getSubledger().hashCode();
        }
        if (getSubledgerTypeCode() != null) {
            _hashCode += getSubledgerTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderFinancialDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderFinancialDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "glAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "glAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glAccountKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "glAccountKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "glAccountKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glClassCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "glClassCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subledger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subledger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subledgerTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subledgerTypeCode"));
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
