/**
 * GetSalesHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class GetSalesHeader  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.Integer RMAId;

    private java.lang.String RMAType;

    private java.math.BigDecimal amountTotalOrderDomestic;

    private java.math.BigDecimal amountTotalOrderForeign;

    private java.lang.String businessUnit;

    private java.lang.String company;

    private java.lang.String currencyCodeFrom;

    private java.lang.String customerPO;

    private java.util.Calendar dateActualShip;

    private java.util.Calendar dateCancel;

    private java.util.Calendar datePromisedPick;

    private java.util.Calendar dateRequested;

    private java.util.Calendar dateTransaction;

    private JP420000.bssv.e1.oracle.Entity deliverTo;

    private JP420000.bssv.e1.oracle.GetSalesDetail detail;

    private JP420000.bssv.e1.oracle.Entity forwardedTo;

    private java.lang.String holdOrderCode;

    private JP420000.bssv.e1.oracle.Entity invoicedTo;

    private java.lang.String orderTakenBy;

    private JP420000.bssv.e1.oracle.OriginalOrder originalOrder;

    private JP420000.bssv.e1.oracle.Entity paidBy;

    private java.math.BigDecimal rateExchangeOverride;

    private JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey;

    private JP420000.bssv.e1.oracle.Entity shipTo;

    private JP420000.bssv.e1.oracle.Entity soldTo;

    public GetSalesHeader() {
    }

    public GetSalesHeader(
           java.lang.Integer RMAId,
           java.lang.String RMAType,
           java.math.BigDecimal amountTotalOrderDomestic,
           java.math.BigDecimal amountTotalOrderForeign,
           java.lang.String businessUnit,
           java.lang.String company,
           java.lang.String currencyCodeFrom,
           java.lang.String customerPO,
           java.util.Calendar dateActualShip,
           java.util.Calendar dateCancel,
           java.util.Calendar datePromisedPick,
           java.util.Calendar dateRequested,
           java.util.Calendar dateTransaction,
           JP420000.bssv.e1.oracle.Entity deliverTo,
           JP420000.bssv.e1.oracle.GetSalesDetail detail,
           JP420000.bssv.e1.oracle.Entity forwardedTo,
           java.lang.String holdOrderCode,
           JP420000.bssv.e1.oracle.Entity invoicedTo,
           java.lang.String orderTakenBy,
           JP420000.bssv.e1.oracle.OriginalOrder originalOrder,
           JP420000.bssv.e1.oracle.Entity paidBy,
           java.math.BigDecimal rateExchangeOverride,
           JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey,
           JP420000.bssv.e1.oracle.Entity shipTo,
           JP420000.bssv.e1.oracle.Entity soldTo) {
        this.RMAId = RMAId;
        this.RMAType = RMAType;
        this.amountTotalOrderDomestic = amountTotalOrderDomestic;
        this.amountTotalOrderForeign = amountTotalOrderForeign;
        this.businessUnit = businessUnit;
        this.company = company;
        this.currencyCodeFrom = currencyCodeFrom;
        this.customerPO = customerPO;
        this.dateActualShip = dateActualShip;
        this.dateCancel = dateCancel;
        this.datePromisedPick = datePromisedPick;
        this.dateRequested = dateRequested;
        this.dateTransaction = dateTransaction;
        this.deliverTo = deliverTo;
        this.detail = detail;
        this.forwardedTo = forwardedTo;
        this.holdOrderCode = holdOrderCode;
        this.invoicedTo = invoicedTo;
        this.orderTakenBy = orderTakenBy;
        this.originalOrder = originalOrder;
        this.paidBy = paidBy;
        this.rateExchangeOverride = rateExchangeOverride;
        this.salesOrderKey = salesOrderKey;
        this.shipTo = shipTo;
        this.soldTo = soldTo;
    }


    /**
     * Gets the RMAId value for this GetSalesHeader.
     * 
     * @return RMAId
     */
    public java.lang.Integer getRMAId() {
        return RMAId;
    }


    /**
     * Sets the RMAId value for this GetSalesHeader.
     * 
     * @param RMAId
     */
    public void setRMAId(java.lang.Integer RMAId) {
        this.RMAId = RMAId;
    }


    /**
     * Gets the RMAType value for this GetSalesHeader.
     * 
     * @return RMAType
     */
    public java.lang.String getRMAType() {
        return RMAType;
    }


    /**
     * Sets the RMAType value for this GetSalesHeader.
     * 
     * @param RMAType
     */
    public void setRMAType(java.lang.String RMAType) {
        this.RMAType = RMAType;
    }


    /**
     * Gets the amountTotalOrderDomestic value for this GetSalesHeader.
     * 
     * @return amountTotalOrderDomestic
     */
    public java.math.BigDecimal getAmountTotalOrderDomestic() {
        return amountTotalOrderDomestic;
    }


    /**
     * Sets the amountTotalOrderDomestic value for this GetSalesHeader.
     * 
     * @param amountTotalOrderDomestic
     */
    public void setAmountTotalOrderDomestic(java.math.BigDecimal amountTotalOrderDomestic) {
        this.amountTotalOrderDomestic = amountTotalOrderDomestic;
    }


    /**
     * Gets the amountTotalOrderForeign value for this GetSalesHeader.
     * 
     * @return amountTotalOrderForeign
     */
    public java.math.BigDecimal getAmountTotalOrderForeign() {
        return amountTotalOrderForeign;
    }


    /**
     * Sets the amountTotalOrderForeign value for this GetSalesHeader.
     * 
     * @param amountTotalOrderForeign
     */
    public void setAmountTotalOrderForeign(java.math.BigDecimal amountTotalOrderForeign) {
        this.amountTotalOrderForeign = amountTotalOrderForeign;
    }


    /**
     * Gets the businessUnit value for this GetSalesHeader.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this GetSalesHeader.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the company value for this GetSalesHeader.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this GetSalesHeader.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the currencyCodeFrom value for this GetSalesHeader.
     * 
     * @return currencyCodeFrom
     */
    public java.lang.String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }


    /**
     * Sets the currencyCodeFrom value for this GetSalesHeader.
     * 
     * @param currencyCodeFrom
     */
    public void setCurrencyCodeFrom(java.lang.String currencyCodeFrom) {
        this.currencyCodeFrom = currencyCodeFrom;
    }


    /**
     * Gets the customerPO value for this GetSalesHeader.
     * 
     * @return customerPO
     */
    public java.lang.String getCustomerPO() {
        return customerPO;
    }


    /**
     * Sets the customerPO value for this GetSalesHeader.
     * 
     * @param customerPO
     */
    public void setCustomerPO(java.lang.String customerPO) {
        this.customerPO = customerPO;
    }


    /**
     * Gets the dateActualShip value for this GetSalesHeader.
     * 
     * @return dateActualShip
     */
    public java.util.Calendar getDateActualShip() {
        return dateActualShip;
    }


    /**
     * Sets the dateActualShip value for this GetSalesHeader.
     * 
     * @param dateActualShip
     */
    public void setDateActualShip(java.util.Calendar dateActualShip) {
        this.dateActualShip = dateActualShip;
    }


    /**
     * Gets the dateCancel value for this GetSalesHeader.
     * 
     * @return dateCancel
     */
    public java.util.Calendar getDateCancel() {
        return dateCancel;
    }


    /**
     * Sets the dateCancel value for this GetSalesHeader.
     * 
     * @param dateCancel
     */
    public void setDateCancel(java.util.Calendar dateCancel) {
        this.dateCancel = dateCancel;
    }


    /**
     * Gets the datePromisedPick value for this GetSalesHeader.
     * 
     * @return datePromisedPick
     */
    public java.util.Calendar getDatePromisedPick() {
        return datePromisedPick;
    }


    /**
     * Sets the datePromisedPick value for this GetSalesHeader.
     * 
     * @param datePromisedPick
     */
    public void setDatePromisedPick(java.util.Calendar datePromisedPick) {
        this.datePromisedPick = datePromisedPick;
    }


    /**
     * Gets the dateRequested value for this GetSalesHeader.
     * 
     * @return dateRequested
     */
    public java.util.Calendar getDateRequested() {
        return dateRequested;
    }


    /**
     * Sets the dateRequested value for this GetSalesHeader.
     * 
     * @param dateRequested
     */
    public void setDateRequested(java.util.Calendar dateRequested) {
        this.dateRequested = dateRequested;
    }


    /**
     * Gets the dateTransaction value for this GetSalesHeader.
     * 
     * @return dateTransaction
     */
    public java.util.Calendar getDateTransaction() {
        return dateTransaction;
    }


    /**
     * Sets the dateTransaction value for this GetSalesHeader.
     * 
     * @param dateTransaction
     */
    public void setDateTransaction(java.util.Calendar dateTransaction) {
        this.dateTransaction = dateTransaction;
    }


    /**
     * Gets the deliverTo value for this GetSalesHeader.
     * 
     * @return deliverTo
     */
    public JP420000.bssv.e1.oracle.Entity getDeliverTo() {
        return deliverTo;
    }


    /**
     * Sets the deliverTo value for this GetSalesHeader.
     * 
     * @param deliverTo
     */
    public void setDeliverTo(JP420000.bssv.e1.oracle.Entity deliverTo) {
        this.deliverTo = deliverTo;
    }


    /**
     * Gets the detail value for this GetSalesHeader.
     * 
     * @return detail
     */
    public JP420000.bssv.e1.oracle.GetSalesDetail getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this GetSalesHeader.
     * 
     * @param detail
     */
    public void setDetail(JP420000.bssv.e1.oracle.GetSalesDetail detail) {
        this.detail = detail;
    }


    /**
     * Gets the forwardedTo value for this GetSalesHeader.
     * 
     * @return forwardedTo
     */
    public JP420000.bssv.e1.oracle.Entity getForwardedTo() {
        return forwardedTo;
    }


    /**
     * Sets the forwardedTo value for this GetSalesHeader.
     * 
     * @param forwardedTo
     */
    public void setForwardedTo(JP420000.bssv.e1.oracle.Entity forwardedTo) {
        this.forwardedTo = forwardedTo;
    }


    /**
     * Gets the holdOrderCode value for this GetSalesHeader.
     * 
     * @return holdOrderCode
     */
    public java.lang.String getHoldOrderCode() {
        return holdOrderCode;
    }


    /**
     * Sets the holdOrderCode value for this GetSalesHeader.
     * 
     * @param holdOrderCode
     */
    public void setHoldOrderCode(java.lang.String holdOrderCode) {
        this.holdOrderCode = holdOrderCode;
    }


    /**
     * Gets the invoicedTo value for this GetSalesHeader.
     * 
     * @return invoicedTo
     */
    public JP420000.bssv.e1.oracle.Entity getInvoicedTo() {
        return invoicedTo;
    }


    /**
     * Sets the invoicedTo value for this GetSalesHeader.
     * 
     * @param invoicedTo
     */
    public void setInvoicedTo(JP420000.bssv.e1.oracle.Entity invoicedTo) {
        this.invoicedTo = invoicedTo;
    }


    /**
     * Gets the orderTakenBy value for this GetSalesHeader.
     * 
     * @return orderTakenBy
     */
    public java.lang.String getOrderTakenBy() {
        return orderTakenBy;
    }


    /**
     * Sets the orderTakenBy value for this GetSalesHeader.
     * 
     * @param orderTakenBy
     */
    public void setOrderTakenBy(java.lang.String orderTakenBy) {
        this.orderTakenBy = orderTakenBy;
    }


    /**
     * Gets the originalOrder value for this GetSalesHeader.
     * 
     * @return originalOrder
     */
    public JP420000.bssv.e1.oracle.OriginalOrder getOriginalOrder() {
        return originalOrder;
    }


    /**
     * Sets the originalOrder value for this GetSalesHeader.
     * 
     * @param originalOrder
     */
    public void setOriginalOrder(JP420000.bssv.e1.oracle.OriginalOrder originalOrder) {
        this.originalOrder = originalOrder;
    }


    /**
     * Gets the paidBy value for this GetSalesHeader.
     * 
     * @return paidBy
     */
    public JP420000.bssv.e1.oracle.Entity getPaidBy() {
        return paidBy;
    }


    /**
     * Sets the paidBy value for this GetSalesHeader.
     * 
     * @param paidBy
     */
    public void setPaidBy(JP420000.bssv.e1.oracle.Entity paidBy) {
        this.paidBy = paidBy;
    }


    /**
     * Gets the rateExchangeOverride value for this GetSalesHeader.
     * 
     * @return rateExchangeOverride
     */
    public java.math.BigDecimal getRateExchangeOverride() {
        return rateExchangeOverride;
    }


    /**
     * Sets the rateExchangeOverride value for this GetSalesHeader.
     * 
     * @param rateExchangeOverride
     */
    public void setRateExchangeOverride(java.math.BigDecimal rateExchangeOverride) {
        this.rateExchangeOverride = rateExchangeOverride;
    }


    /**
     * Gets the salesOrderKey value for this GetSalesHeader.
     * 
     * @return salesOrderKey
     */
    public JP420000.bssv.e1.oracle.SalesOrderKey getSalesOrderKey() {
        return salesOrderKey;
    }


    /**
     * Sets the salesOrderKey value for this GetSalesHeader.
     * 
     * @param salesOrderKey
     */
    public void setSalesOrderKey(JP420000.bssv.e1.oracle.SalesOrderKey salesOrderKey) {
        this.salesOrderKey = salesOrderKey;
    }


    /**
     * Gets the shipTo value for this GetSalesHeader.
     * 
     * @return shipTo
     */
    public JP420000.bssv.e1.oracle.Entity getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this GetSalesHeader.
     * 
     * @param shipTo
     */
    public void setShipTo(JP420000.bssv.e1.oracle.Entity shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the soldTo value for this GetSalesHeader.
     * 
     * @return soldTo
     */
    public JP420000.bssv.e1.oracle.Entity getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this GetSalesHeader.
     * 
     * @param soldTo
     */
    public void setSoldTo(JP420000.bssv.e1.oracle.Entity soldTo) {
        this.soldTo = soldTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSalesHeader)) return false;
        GetSalesHeader other = (GetSalesHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.RMAId==null && other.getRMAId()==null) || 
             (this.RMAId!=null &&
              this.RMAId.equals(other.getRMAId()))) &&
            ((this.RMAType==null && other.getRMAType()==null) || 
             (this.RMAType!=null &&
              this.RMAType.equals(other.getRMAType()))) &&
            ((this.amountTotalOrderDomestic==null && other.getAmountTotalOrderDomestic()==null) || 
             (this.amountTotalOrderDomestic!=null &&
              this.amountTotalOrderDomestic.equals(other.getAmountTotalOrderDomestic()))) &&
            ((this.amountTotalOrderForeign==null && other.getAmountTotalOrderForeign()==null) || 
             (this.amountTotalOrderForeign!=null &&
              this.amountTotalOrderForeign.equals(other.getAmountTotalOrderForeign()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.currencyCodeFrom==null && other.getCurrencyCodeFrom()==null) || 
             (this.currencyCodeFrom!=null &&
              this.currencyCodeFrom.equals(other.getCurrencyCodeFrom()))) &&
            ((this.customerPO==null && other.getCustomerPO()==null) || 
             (this.customerPO!=null &&
              this.customerPO.equals(other.getCustomerPO()))) &&
            ((this.dateActualShip==null && other.getDateActualShip()==null) || 
             (this.dateActualShip!=null &&
              this.dateActualShip.equals(other.getDateActualShip()))) &&
            ((this.dateCancel==null && other.getDateCancel()==null) || 
             (this.dateCancel!=null &&
              this.dateCancel.equals(other.getDateCancel()))) &&
            ((this.datePromisedPick==null && other.getDatePromisedPick()==null) || 
             (this.datePromisedPick!=null &&
              this.datePromisedPick.equals(other.getDatePromisedPick()))) &&
            ((this.dateRequested==null && other.getDateRequested()==null) || 
             (this.dateRequested!=null &&
              this.dateRequested.equals(other.getDateRequested()))) &&
            ((this.dateTransaction==null && other.getDateTransaction()==null) || 
             (this.dateTransaction!=null &&
              this.dateTransaction.equals(other.getDateTransaction()))) &&
            ((this.deliverTo==null && other.getDeliverTo()==null) || 
             (this.deliverTo!=null &&
              this.deliverTo.equals(other.getDeliverTo()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              this.detail.equals(other.getDetail()))) &&
            ((this.forwardedTo==null && other.getForwardedTo()==null) || 
             (this.forwardedTo!=null &&
              this.forwardedTo.equals(other.getForwardedTo()))) &&
            ((this.holdOrderCode==null && other.getHoldOrderCode()==null) || 
             (this.holdOrderCode!=null &&
              this.holdOrderCode.equals(other.getHoldOrderCode()))) &&
            ((this.invoicedTo==null && other.getInvoicedTo()==null) || 
             (this.invoicedTo!=null &&
              this.invoicedTo.equals(other.getInvoicedTo()))) &&
            ((this.orderTakenBy==null && other.getOrderTakenBy()==null) || 
             (this.orderTakenBy!=null &&
              this.orderTakenBy.equals(other.getOrderTakenBy()))) &&
            ((this.originalOrder==null && other.getOriginalOrder()==null) || 
             (this.originalOrder!=null &&
              this.originalOrder.equals(other.getOriginalOrder()))) &&
            ((this.paidBy==null && other.getPaidBy()==null) || 
             (this.paidBy!=null &&
              this.paidBy.equals(other.getPaidBy()))) &&
            ((this.rateExchangeOverride==null && other.getRateExchangeOverride()==null) || 
             (this.rateExchangeOverride!=null &&
              this.rateExchangeOverride.equals(other.getRateExchangeOverride()))) &&
            ((this.salesOrderKey==null && other.getSalesOrderKey()==null) || 
             (this.salesOrderKey!=null &&
              this.salesOrderKey.equals(other.getSalesOrderKey()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) || 
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo())));
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
        if (getRMAId() != null) {
            _hashCode += getRMAId().hashCode();
        }
        if (getRMAType() != null) {
            _hashCode += getRMAType().hashCode();
        }
        if (getAmountTotalOrderDomestic() != null) {
            _hashCode += getAmountTotalOrderDomestic().hashCode();
        }
        if (getAmountTotalOrderForeign() != null) {
            _hashCode += getAmountTotalOrderForeign().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getCurrencyCodeFrom() != null) {
            _hashCode += getCurrencyCodeFrom().hashCode();
        }
        if (getCustomerPO() != null) {
            _hashCode += getCustomerPO().hashCode();
        }
        if (getDateActualShip() != null) {
            _hashCode += getDateActualShip().hashCode();
        }
        if (getDateCancel() != null) {
            _hashCode += getDateCancel().hashCode();
        }
        if (getDatePromisedPick() != null) {
            _hashCode += getDatePromisedPick().hashCode();
        }
        if (getDateRequested() != null) {
            _hashCode += getDateRequested().hashCode();
        }
        if (getDateTransaction() != null) {
            _hashCode += getDateTransaction().hashCode();
        }
        if (getDeliverTo() != null) {
            _hashCode += getDeliverTo().hashCode();
        }
        if (getDetail() != null) {
            _hashCode += getDetail().hashCode();
        }
        if (getForwardedTo() != null) {
            _hashCode += getForwardedTo().hashCode();
        }
        if (getHoldOrderCode() != null) {
            _hashCode += getHoldOrderCode().hashCode();
        }
        if (getInvoicedTo() != null) {
            _hashCode += getInvoicedTo().hashCode();
        }
        if (getOrderTakenBy() != null) {
            _hashCode += getOrderTakenBy().hashCode();
        }
        if (getOriginalOrder() != null) {
            _hashCode += getOriginalOrder().hashCode();
        }
        if (getPaidBy() != null) {
            _hashCode += getPaidBy().hashCode();
        }
        if (getRateExchangeOverride() != null) {
            _hashCode += getRateExchangeOverride().hashCode();
        }
        if (getSalesOrderKey() != null) {
            _hashCode += getSalesOrderKey().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSalesHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMAId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RMAId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RMAType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RMAType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountTotalOrderDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountTotalOrderDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountTotalOrderForeign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountTotalOrderForeign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCodeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCodeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateActualShip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateActualShip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePromisedPick");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePromisedPick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliverTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwardedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdOrderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdOrderCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoicedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderTakenBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderTakenBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "originalOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paidBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateExchangeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateExchangeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrderKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salesOrderKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "salesOrderKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
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
