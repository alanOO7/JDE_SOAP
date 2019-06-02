/**
 * GetCustomerItemPriceV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class GetCustomerItemPriceV2  extends JP420000.bssv.e1.oracle.ValueObject  implements java.io.Serializable {
    private java.lang.String agreementID;

    private java.lang.String businessUnit;

    private JP420000.bssv.e1.oracle.Entity carrier;

    private java.lang.String currencyCode;

    private JP420000.bssv.e1.oracle.Customer customer;

    private java.lang.String customerPriceGroupCode;

    private java.util.Calendar datePriceEffective;

    private java.util.Calendar dateTaxedPricesEffective;

    private java.math.BigDecimal discountTrade;

    private java.lang.String endUseCode;

    private java.lang.String freightHandlingCode;

    private java.lang.String lineOfBusinessCode;

    private java.lang.String modeOfTransportCode;

    private java.lang.String paymentInstrumentCode;

    private java.lang.String paymentTermsCode;

    private java.lang.String priceAdjustmentId;

    private java.lang.String priceCode1;

    private java.lang.String priceCode2;

    private java.lang.String priceCode3;

    private JP420000.bssv.e1.oracle.ProcessingVersion processing;

    private JP420000.bssv.e1.oracle.Product product;

    private java.math.BigDecimal rateExchange;

    private java.lang.String routeCode;

    private java.lang.String statusCodeDuty;

    private java.lang.String stopCode;

    private java.math.BigDecimal transactionQuantity;

    private java.lang.String unitOfMeasureCodePricing;

    private java.lang.String unitOfMeasureCodeTransaction;

    private java.lang.Boolean useTaxedPrices;

    private java.lang.String zoneNumber;

    public GetCustomerItemPriceV2() {
    }

    public GetCustomerItemPriceV2(
           java.lang.String agreementID,
           java.lang.String businessUnit,
           JP420000.bssv.e1.oracle.Entity carrier,
           java.lang.String currencyCode,
           JP420000.bssv.e1.oracle.Customer customer,
           java.lang.String customerPriceGroupCode,
           java.util.Calendar datePriceEffective,
           java.util.Calendar dateTaxedPricesEffective,
           java.math.BigDecimal discountTrade,
           java.lang.String endUseCode,
           java.lang.String freightHandlingCode,
           java.lang.String lineOfBusinessCode,
           java.lang.String modeOfTransportCode,
           java.lang.String paymentInstrumentCode,
           java.lang.String paymentTermsCode,
           java.lang.String priceAdjustmentId,
           java.lang.String priceCode1,
           java.lang.String priceCode2,
           java.lang.String priceCode3,
           JP420000.bssv.e1.oracle.ProcessingVersion processing,
           JP420000.bssv.e1.oracle.Product product,
           java.math.BigDecimal rateExchange,
           java.lang.String routeCode,
           java.lang.String statusCodeDuty,
           java.lang.String stopCode,
           java.math.BigDecimal transactionQuantity,
           java.lang.String unitOfMeasureCodePricing,
           java.lang.String unitOfMeasureCodeTransaction,
           java.lang.Boolean useTaxedPrices,
           java.lang.String zoneNumber) {
        this.agreementID = agreementID;
        this.businessUnit = businessUnit;
        this.carrier = carrier;
        this.currencyCode = currencyCode;
        this.customer = customer;
        this.customerPriceGroupCode = customerPriceGroupCode;
        this.datePriceEffective = datePriceEffective;
        this.dateTaxedPricesEffective = dateTaxedPricesEffective;
        this.discountTrade = discountTrade;
        this.endUseCode = endUseCode;
        this.freightHandlingCode = freightHandlingCode;
        this.lineOfBusinessCode = lineOfBusinessCode;
        this.modeOfTransportCode = modeOfTransportCode;
        this.paymentInstrumentCode = paymentInstrumentCode;
        this.paymentTermsCode = paymentTermsCode;
        this.priceAdjustmentId = priceAdjustmentId;
        this.priceCode1 = priceCode1;
        this.priceCode2 = priceCode2;
        this.priceCode3 = priceCode3;
        this.processing = processing;
        this.product = product;
        this.rateExchange = rateExchange;
        this.routeCode = routeCode;
        this.statusCodeDuty = statusCodeDuty;
        this.stopCode = stopCode;
        this.transactionQuantity = transactionQuantity;
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
        this.useTaxedPrices = useTaxedPrices;
        this.zoneNumber = zoneNumber;
    }


    /**
     * Gets the agreementID value for this GetCustomerItemPriceV2.
     * 
     * @return agreementID
     */
    public java.lang.String getAgreementID() {
        return agreementID;
    }


    /**
     * Sets the agreementID value for this GetCustomerItemPriceV2.
     * 
     * @param agreementID
     */
    public void setAgreementID(java.lang.String agreementID) {
        this.agreementID = agreementID;
    }


    /**
     * Gets the businessUnit value for this GetCustomerItemPriceV2.
     * 
     * @return businessUnit
     */
    public java.lang.String getBusinessUnit() {
        return businessUnit;
    }


    /**
     * Sets the businessUnit value for this GetCustomerItemPriceV2.
     * 
     * @param businessUnit
     */
    public void setBusinessUnit(java.lang.String businessUnit) {
        this.businessUnit = businessUnit;
    }


    /**
     * Gets the carrier value for this GetCustomerItemPriceV2.
     * 
     * @return carrier
     */
    public JP420000.bssv.e1.oracle.Entity getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this GetCustomerItemPriceV2.
     * 
     * @param carrier
     */
    public void setCarrier(JP420000.bssv.e1.oracle.Entity carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the currencyCode value for this GetCustomerItemPriceV2.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this GetCustomerItemPriceV2.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the customer value for this GetCustomerItemPriceV2.
     * 
     * @return customer
     */
    public JP420000.bssv.e1.oracle.Customer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this GetCustomerItemPriceV2.
     * 
     * @param customer
     */
    public void setCustomer(JP420000.bssv.e1.oracle.Customer customer) {
        this.customer = customer;
    }


    /**
     * Gets the customerPriceGroupCode value for this GetCustomerItemPriceV2.
     * 
     * @return customerPriceGroupCode
     */
    public java.lang.String getCustomerPriceGroupCode() {
        return customerPriceGroupCode;
    }


    /**
     * Sets the customerPriceGroupCode value for this GetCustomerItemPriceV2.
     * 
     * @param customerPriceGroupCode
     */
    public void setCustomerPriceGroupCode(java.lang.String customerPriceGroupCode) {
        this.customerPriceGroupCode = customerPriceGroupCode;
    }


    /**
     * Gets the datePriceEffective value for this GetCustomerItemPriceV2.
     * 
     * @return datePriceEffective
     */
    public java.util.Calendar getDatePriceEffective() {
        return datePriceEffective;
    }


    /**
     * Sets the datePriceEffective value for this GetCustomerItemPriceV2.
     * 
     * @param datePriceEffective
     */
    public void setDatePriceEffective(java.util.Calendar datePriceEffective) {
        this.datePriceEffective = datePriceEffective;
    }


    /**
     * Gets the dateTaxedPricesEffective value for this GetCustomerItemPriceV2.
     * 
     * @return dateTaxedPricesEffective
     */
    public java.util.Calendar getDateTaxedPricesEffective() {
        return dateTaxedPricesEffective;
    }


    /**
     * Sets the dateTaxedPricesEffective value for this GetCustomerItemPriceV2.
     * 
     * @param dateTaxedPricesEffective
     */
    public void setDateTaxedPricesEffective(java.util.Calendar dateTaxedPricesEffective) {
        this.dateTaxedPricesEffective = dateTaxedPricesEffective;
    }


    /**
     * Gets the discountTrade value for this GetCustomerItemPriceV2.
     * 
     * @return discountTrade
     */
    public java.math.BigDecimal getDiscountTrade() {
        return discountTrade;
    }


    /**
     * Sets the discountTrade value for this GetCustomerItemPriceV2.
     * 
     * @param discountTrade
     */
    public void setDiscountTrade(java.math.BigDecimal discountTrade) {
        this.discountTrade = discountTrade;
    }


    /**
     * Gets the endUseCode value for this GetCustomerItemPriceV2.
     * 
     * @return endUseCode
     */
    public java.lang.String getEndUseCode() {
        return endUseCode;
    }


    /**
     * Sets the endUseCode value for this GetCustomerItemPriceV2.
     * 
     * @param endUseCode
     */
    public void setEndUseCode(java.lang.String endUseCode) {
        this.endUseCode = endUseCode;
    }


    /**
     * Gets the freightHandlingCode value for this GetCustomerItemPriceV2.
     * 
     * @return freightHandlingCode
     */
    public java.lang.String getFreightHandlingCode() {
        return freightHandlingCode;
    }


    /**
     * Sets the freightHandlingCode value for this GetCustomerItemPriceV2.
     * 
     * @param freightHandlingCode
     */
    public void setFreightHandlingCode(java.lang.String freightHandlingCode) {
        this.freightHandlingCode = freightHandlingCode;
    }


    /**
     * Gets the lineOfBusinessCode value for this GetCustomerItemPriceV2.
     * 
     * @return lineOfBusinessCode
     */
    public java.lang.String getLineOfBusinessCode() {
        return lineOfBusinessCode;
    }


    /**
     * Sets the lineOfBusinessCode value for this GetCustomerItemPriceV2.
     * 
     * @param lineOfBusinessCode
     */
    public void setLineOfBusinessCode(java.lang.String lineOfBusinessCode) {
        this.lineOfBusinessCode = lineOfBusinessCode;
    }


    /**
     * Gets the modeOfTransportCode value for this GetCustomerItemPriceV2.
     * 
     * @return modeOfTransportCode
     */
    public java.lang.String getModeOfTransportCode() {
        return modeOfTransportCode;
    }


    /**
     * Sets the modeOfTransportCode value for this GetCustomerItemPriceV2.
     * 
     * @param modeOfTransportCode
     */
    public void setModeOfTransportCode(java.lang.String modeOfTransportCode) {
        this.modeOfTransportCode = modeOfTransportCode;
    }


    /**
     * Gets the paymentInstrumentCode value for this GetCustomerItemPriceV2.
     * 
     * @return paymentInstrumentCode
     */
    public java.lang.String getPaymentInstrumentCode() {
        return paymentInstrumentCode;
    }


    /**
     * Sets the paymentInstrumentCode value for this GetCustomerItemPriceV2.
     * 
     * @param paymentInstrumentCode
     */
    public void setPaymentInstrumentCode(java.lang.String paymentInstrumentCode) {
        this.paymentInstrumentCode = paymentInstrumentCode;
    }


    /**
     * Gets the paymentTermsCode value for this GetCustomerItemPriceV2.
     * 
     * @return paymentTermsCode
     */
    public java.lang.String getPaymentTermsCode() {
        return paymentTermsCode;
    }


    /**
     * Sets the paymentTermsCode value for this GetCustomerItemPriceV2.
     * 
     * @param paymentTermsCode
     */
    public void setPaymentTermsCode(java.lang.String paymentTermsCode) {
        this.paymentTermsCode = paymentTermsCode;
    }


    /**
     * Gets the priceAdjustmentId value for this GetCustomerItemPriceV2.
     * 
     * @return priceAdjustmentId
     */
    public java.lang.String getPriceAdjustmentId() {
        return priceAdjustmentId;
    }


    /**
     * Sets the priceAdjustmentId value for this GetCustomerItemPriceV2.
     * 
     * @param priceAdjustmentId
     */
    public void setPriceAdjustmentId(java.lang.String priceAdjustmentId) {
        this.priceAdjustmentId = priceAdjustmentId;
    }


    /**
     * Gets the priceCode1 value for this GetCustomerItemPriceV2.
     * 
     * @return priceCode1
     */
    public java.lang.String getPriceCode1() {
        return priceCode1;
    }


    /**
     * Sets the priceCode1 value for this GetCustomerItemPriceV2.
     * 
     * @param priceCode1
     */
    public void setPriceCode1(java.lang.String priceCode1) {
        this.priceCode1 = priceCode1;
    }


    /**
     * Gets the priceCode2 value for this GetCustomerItemPriceV2.
     * 
     * @return priceCode2
     */
    public java.lang.String getPriceCode2() {
        return priceCode2;
    }


    /**
     * Sets the priceCode2 value for this GetCustomerItemPriceV2.
     * 
     * @param priceCode2
     */
    public void setPriceCode2(java.lang.String priceCode2) {
        this.priceCode2 = priceCode2;
    }


    /**
     * Gets the priceCode3 value for this GetCustomerItemPriceV2.
     * 
     * @return priceCode3
     */
    public java.lang.String getPriceCode3() {
        return priceCode3;
    }


    /**
     * Sets the priceCode3 value for this GetCustomerItemPriceV2.
     * 
     * @param priceCode3
     */
    public void setPriceCode3(java.lang.String priceCode3) {
        this.priceCode3 = priceCode3;
    }


    /**
     * Gets the processing value for this GetCustomerItemPriceV2.
     * 
     * @return processing
     */
    public JP420000.bssv.e1.oracle.ProcessingVersion getProcessing() {
        return processing;
    }


    /**
     * Sets the processing value for this GetCustomerItemPriceV2.
     * 
     * @param processing
     */
    public void setProcessing(JP420000.bssv.e1.oracle.ProcessingVersion processing) {
        this.processing = processing;
    }


    /**
     * Gets the product value for this GetCustomerItemPriceV2.
     * 
     * @return product
     */
    public JP420000.bssv.e1.oracle.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this GetCustomerItemPriceV2.
     * 
     * @param product
     */
    public void setProduct(JP420000.bssv.e1.oracle.Product product) {
        this.product = product;
    }


    /**
     * Gets the rateExchange value for this GetCustomerItemPriceV2.
     * 
     * @return rateExchange
     */
    public java.math.BigDecimal getRateExchange() {
        return rateExchange;
    }


    /**
     * Sets the rateExchange value for this GetCustomerItemPriceV2.
     * 
     * @param rateExchange
     */
    public void setRateExchange(java.math.BigDecimal rateExchange) {
        this.rateExchange = rateExchange;
    }


    /**
     * Gets the routeCode value for this GetCustomerItemPriceV2.
     * 
     * @return routeCode
     */
    public java.lang.String getRouteCode() {
        return routeCode;
    }


    /**
     * Sets the routeCode value for this GetCustomerItemPriceV2.
     * 
     * @param routeCode
     */
    public void setRouteCode(java.lang.String routeCode) {
        this.routeCode = routeCode;
    }


    /**
     * Gets the statusCodeDuty value for this GetCustomerItemPriceV2.
     * 
     * @return statusCodeDuty
     */
    public java.lang.String getStatusCodeDuty() {
        return statusCodeDuty;
    }


    /**
     * Sets the statusCodeDuty value for this GetCustomerItemPriceV2.
     * 
     * @param statusCodeDuty
     */
    public void setStatusCodeDuty(java.lang.String statusCodeDuty) {
        this.statusCodeDuty = statusCodeDuty;
    }


    /**
     * Gets the stopCode value for this GetCustomerItemPriceV2.
     * 
     * @return stopCode
     */
    public java.lang.String getStopCode() {
        return stopCode;
    }


    /**
     * Sets the stopCode value for this GetCustomerItemPriceV2.
     * 
     * @param stopCode
     */
    public void setStopCode(java.lang.String stopCode) {
        this.stopCode = stopCode;
    }


    /**
     * Gets the transactionQuantity value for this GetCustomerItemPriceV2.
     * 
     * @return transactionQuantity
     */
    public java.math.BigDecimal getTransactionQuantity() {
        return transactionQuantity;
    }


    /**
     * Sets the transactionQuantity value for this GetCustomerItemPriceV2.
     * 
     * @param transactionQuantity
     */
    public void setTransactionQuantity(java.math.BigDecimal transactionQuantity) {
        this.transactionQuantity = transactionQuantity;
    }


    /**
     * Gets the unitOfMeasureCodePricing value for this GetCustomerItemPriceV2.
     * 
     * @return unitOfMeasureCodePricing
     */
    public java.lang.String getUnitOfMeasureCodePricing() {
        return unitOfMeasureCodePricing;
    }


    /**
     * Sets the unitOfMeasureCodePricing value for this GetCustomerItemPriceV2.
     * 
     * @param unitOfMeasureCodePricing
     */
    public void setUnitOfMeasureCodePricing(java.lang.String unitOfMeasureCodePricing) {
        this.unitOfMeasureCodePricing = unitOfMeasureCodePricing;
    }


    /**
     * Gets the unitOfMeasureCodeTransaction value for this GetCustomerItemPriceV2.
     * 
     * @return unitOfMeasureCodeTransaction
     */
    public java.lang.String getUnitOfMeasureCodeTransaction() {
        return unitOfMeasureCodeTransaction;
    }


    /**
     * Sets the unitOfMeasureCodeTransaction value for this GetCustomerItemPriceV2.
     * 
     * @param unitOfMeasureCodeTransaction
     */
    public void setUnitOfMeasureCodeTransaction(java.lang.String unitOfMeasureCodeTransaction) {
        this.unitOfMeasureCodeTransaction = unitOfMeasureCodeTransaction;
    }


    /**
     * Gets the useTaxedPrices value for this GetCustomerItemPriceV2.
     * 
     * @return useTaxedPrices
     */
    public java.lang.Boolean getUseTaxedPrices() {
        return useTaxedPrices;
    }


    /**
     * Sets the useTaxedPrices value for this GetCustomerItemPriceV2.
     * 
     * @param useTaxedPrices
     */
    public void setUseTaxedPrices(java.lang.Boolean useTaxedPrices) {
        this.useTaxedPrices = useTaxedPrices;
    }


    /**
     * Gets the zoneNumber value for this GetCustomerItemPriceV2.
     * 
     * @return zoneNumber
     */
    public java.lang.String getZoneNumber() {
        return zoneNumber;
    }


    /**
     * Sets the zoneNumber value for this GetCustomerItemPriceV2.
     * 
     * @param zoneNumber
     */
    public void setZoneNumber(java.lang.String zoneNumber) {
        this.zoneNumber = zoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCustomerItemPriceV2)) return false;
        GetCustomerItemPriceV2 other = (GetCustomerItemPriceV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.agreementID==null && other.getAgreementID()==null) || 
             (this.agreementID!=null &&
              this.agreementID.equals(other.getAgreementID()))) &&
            ((this.businessUnit==null && other.getBusinessUnit()==null) || 
             (this.businessUnit!=null &&
              this.businessUnit.equals(other.getBusinessUnit()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.customerPriceGroupCode==null && other.getCustomerPriceGroupCode()==null) || 
             (this.customerPriceGroupCode!=null &&
              this.customerPriceGroupCode.equals(other.getCustomerPriceGroupCode()))) &&
            ((this.datePriceEffective==null && other.getDatePriceEffective()==null) || 
             (this.datePriceEffective!=null &&
              this.datePriceEffective.equals(other.getDatePriceEffective()))) &&
            ((this.dateTaxedPricesEffective==null && other.getDateTaxedPricesEffective()==null) || 
             (this.dateTaxedPricesEffective!=null &&
              this.dateTaxedPricesEffective.equals(other.getDateTaxedPricesEffective()))) &&
            ((this.discountTrade==null && other.getDiscountTrade()==null) || 
             (this.discountTrade!=null &&
              this.discountTrade.equals(other.getDiscountTrade()))) &&
            ((this.endUseCode==null && other.getEndUseCode()==null) || 
             (this.endUseCode!=null &&
              this.endUseCode.equals(other.getEndUseCode()))) &&
            ((this.freightHandlingCode==null && other.getFreightHandlingCode()==null) || 
             (this.freightHandlingCode!=null &&
              this.freightHandlingCode.equals(other.getFreightHandlingCode()))) &&
            ((this.lineOfBusinessCode==null && other.getLineOfBusinessCode()==null) || 
             (this.lineOfBusinessCode!=null &&
              this.lineOfBusinessCode.equals(other.getLineOfBusinessCode()))) &&
            ((this.modeOfTransportCode==null && other.getModeOfTransportCode()==null) || 
             (this.modeOfTransportCode!=null &&
              this.modeOfTransportCode.equals(other.getModeOfTransportCode()))) &&
            ((this.paymentInstrumentCode==null && other.getPaymentInstrumentCode()==null) || 
             (this.paymentInstrumentCode!=null &&
              this.paymentInstrumentCode.equals(other.getPaymentInstrumentCode()))) &&
            ((this.paymentTermsCode==null && other.getPaymentTermsCode()==null) || 
             (this.paymentTermsCode!=null &&
              this.paymentTermsCode.equals(other.getPaymentTermsCode()))) &&
            ((this.priceAdjustmentId==null && other.getPriceAdjustmentId()==null) || 
             (this.priceAdjustmentId!=null &&
              this.priceAdjustmentId.equals(other.getPriceAdjustmentId()))) &&
            ((this.priceCode1==null && other.getPriceCode1()==null) || 
             (this.priceCode1!=null &&
              this.priceCode1.equals(other.getPriceCode1()))) &&
            ((this.priceCode2==null && other.getPriceCode2()==null) || 
             (this.priceCode2!=null &&
              this.priceCode2.equals(other.getPriceCode2()))) &&
            ((this.priceCode3==null && other.getPriceCode3()==null) || 
             (this.priceCode3!=null &&
              this.priceCode3.equals(other.getPriceCode3()))) &&
            ((this.processing==null && other.getProcessing()==null) || 
             (this.processing!=null &&
              this.processing.equals(other.getProcessing()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.rateExchange==null && other.getRateExchange()==null) || 
             (this.rateExchange!=null &&
              this.rateExchange.equals(other.getRateExchange()))) &&
            ((this.routeCode==null && other.getRouteCode()==null) || 
             (this.routeCode!=null &&
              this.routeCode.equals(other.getRouteCode()))) &&
            ((this.statusCodeDuty==null && other.getStatusCodeDuty()==null) || 
             (this.statusCodeDuty!=null &&
              this.statusCodeDuty.equals(other.getStatusCodeDuty()))) &&
            ((this.stopCode==null && other.getStopCode()==null) || 
             (this.stopCode!=null &&
              this.stopCode.equals(other.getStopCode()))) &&
            ((this.transactionQuantity==null && other.getTransactionQuantity()==null) || 
             (this.transactionQuantity!=null &&
              this.transactionQuantity.equals(other.getTransactionQuantity()))) &&
            ((this.unitOfMeasureCodePricing==null && other.getUnitOfMeasureCodePricing()==null) || 
             (this.unitOfMeasureCodePricing!=null &&
              this.unitOfMeasureCodePricing.equals(other.getUnitOfMeasureCodePricing()))) &&
            ((this.unitOfMeasureCodeTransaction==null && other.getUnitOfMeasureCodeTransaction()==null) || 
             (this.unitOfMeasureCodeTransaction!=null &&
              this.unitOfMeasureCodeTransaction.equals(other.getUnitOfMeasureCodeTransaction()))) &&
            ((this.useTaxedPrices==null && other.getUseTaxedPrices()==null) || 
             (this.useTaxedPrices!=null &&
              this.useTaxedPrices.equals(other.getUseTaxedPrices()))) &&
            ((this.zoneNumber==null && other.getZoneNumber()==null) || 
             (this.zoneNumber!=null &&
              this.zoneNumber.equals(other.getZoneNumber())));
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
        if (getAgreementID() != null) {
            _hashCode += getAgreementID().hashCode();
        }
        if (getBusinessUnit() != null) {
            _hashCode += getBusinessUnit().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getCustomerPriceGroupCode() != null) {
            _hashCode += getCustomerPriceGroupCode().hashCode();
        }
        if (getDatePriceEffective() != null) {
            _hashCode += getDatePriceEffective().hashCode();
        }
        if (getDateTaxedPricesEffective() != null) {
            _hashCode += getDateTaxedPricesEffective().hashCode();
        }
        if (getDiscountTrade() != null) {
            _hashCode += getDiscountTrade().hashCode();
        }
        if (getEndUseCode() != null) {
            _hashCode += getEndUseCode().hashCode();
        }
        if (getFreightHandlingCode() != null) {
            _hashCode += getFreightHandlingCode().hashCode();
        }
        if (getLineOfBusinessCode() != null) {
            _hashCode += getLineOfBusinessCode().hashCode();
        }
        if (getModeOfTransportCode() != null) {
            _hashCode += getModeOfTransportCode().hashCode();
        }
        if (getPaymentInstrumentCode() != null) {
            _hashCode += getPaymentInstrumentCode().hashCode();
        }
        if (getPaymentTermsCode() != null) {
            _hashCode += getPaymentTermsCode().hashCode();
        }
        if (getPriceAdjustmentId() != null) {
            _hashCode += getPriceAdjustmentId().hashCode();
        }
        if (getPriceCode1() != null) {
            _hashCode += getPriceCode1().hashCode();
        }
        if (getPriceCode2() != null) {
            _hashCode += getPriceCode2().hashCode();
        }
        if (getPriceCode3() != null) {
            _hashCode += getPriceCode3().hashCode();
        }
        if (getProcessing() != null) {
            _hashCode += getProcessing().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getRateExchange() != null) {
            _hashCode += getRateExchange().hashCode();
        }
        if (getRouteCode() != null) {
            _hashCode += getRouteCode().hashCode();
        }
        if (getStatusCodeDuty() != null) {
            _hashCode += getStatusCodeDuty().hashCode();
        }
        if (getStopCode() != null) {
            _hashCode += getStopCode().hashCode();
        }
        if (getTransactionQuantity() != null) {
            _hashCode += getTransactionQuantity().hashCode();
        }
        if (getUnitOfMeasureCodePricing() != null) {
            _hashCode += getUnitOfMeasureCodePricing().hashCode();
        }
        if (getUnitOfMeasureCodeTransaction() != null) {
            _hashCode += getUnitOfMeasureCodeTransaction().hashCode();
        }
        if (getUseTaxedPrices() != null) {
            _hashCode += getUseTaxedPrices().hashCode();
        }
        if (getZoneNumber() != null) {
            _hashCode += getZoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomerItemPriceV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPriceV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreementID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "customer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPriceGroupCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerPriceGroupCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datePriceEffective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datePriceEffective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTaxedPricesEffective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTaxedPricesEffective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountTrade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountTrade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endUseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endUseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightHandlingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freightHandlingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusinessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineOfBusinessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeOfTransportCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modeOfTransportCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInstrumentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentInstrumentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTermsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentTermsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceAdjustmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceAdjustmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceCode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceCode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceCode3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceCode3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processingVersion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "product"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateExchange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rateExchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCodeDuty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCodeDuty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stopCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodePricing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodePricing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasureCodeTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitOfMeasureCodeTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useTaxedPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useTaxedPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zoneNumber"));
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
