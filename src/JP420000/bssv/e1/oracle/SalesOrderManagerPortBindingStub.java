/**
 * SalesOrderManagerPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class SalesOrderManagerPortBindingStub extends org.apache.axis.client.Stub implements JP420000.bssv.e1.oracle.SalesOrderManager {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItemListPrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemListPrice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemListPrice"), JP420000.bssv.e1.oracle.GetItemListPrice.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showItemListPrice"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ShowItemListPrice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemListPriceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processSalesOrderV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV2"), JP420000.bssv.e1.oracle.ProcessSalesOrderV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrderV2"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ConfirmSalesOrderV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processSalesOrderV4");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV4"), JP420000.bssv.e1.oracle.ProcessSalesOrderV4.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrderV4"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ConfirmSalesOrderV4.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV4Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSalesOrderV3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV2"), JP420000.bssv.e1.oracle.GetSalesOrderV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrderV3"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ShowSalesOrderV3.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV3Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processSalesOrderV3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV3"), JP420000.bssv.e1.oracle.ProcessSalesOrderV3.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrderV3"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ConfirmSalesOrderV3.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV3Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomerItemPriceV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPriceV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPriceV2"), JP420000.bssv.e1.oracle.GetCustomerItemPriceV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showCustomerItemPriceV2"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ShowCustomerItemPriceV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPriceV2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItemPriceAndAvailability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailability"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailability"), JP420000.bssv.e1.oracle.GetItemPriceAndAvailability.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showItemPriceAndAvailability"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ShowItemPriceAndAvailability.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItemPriceAndAvailabilityV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityV2"), JP420000.bssv.e1.oracle.GetItemPriceAndAvailabilityV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showItemPriceAndAvailabilityV2"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityV2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getItemPriceAndAvailabilityV3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityV3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityV3"), JP420000.bssv.e1.oracle.GetItemPriceAndAvailabilityV3.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showItemPriceAndAvailabilityV3"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV3.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityV3Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomerItemPrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPrice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPrice"), JP420000.bssv.e1.oracle.GetCustomerItemPrice.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showCustomerItemPrice"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ShowCustomerItemPrice.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPriceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processSalesOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrder"), JP420000.bssv.e1.oracle.ProcessSalesOrder.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrder"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ConfirmSalesOrder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processSalesPriceAdjustmentV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesPriceAdjustmentV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesPriceAdjustmentV2"), JP420000.bssv.e1.oracle.ProcessSalesPriceAdjustmentV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesPriceAdjustmentV2"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustmentV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesPriceAdjustmentV2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSalesOrderPriceHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderPriceHistory"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderPriceHistory"), JP420000.bssv.e1.oracle.GetSalesOrderPriceHistory.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrderPriceHistory"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ShowSalesOrderPriceHistory.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderPriceHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSalesOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrder"), JP420000.bssv.e1.oracle.GetSalesOrder.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrder"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ShowSalesOrder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSalesOrderV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrder"), JP420000.bssv.e1.oracle.GetSalesOrder.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrderV2"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ShowSalesOrderV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processSalesPriceAdjustment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesPriceAdjustment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesPriceAdjustment"), JP420000.bssv.e1.oracle.ProcessSalesPriceAdjustment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesPriceAdjustment"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesPriceAdjustmentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSalesOrderV4");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV3"), JP420000.bssv.e1.oracle.GetSalesOrderV3.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrderV4"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ShowSalesOrderV4.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV4Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processSalesOrderV5");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV5"), JP420000.bssv.e1.oracle.ProcessSalesOrderV5.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrderV5"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ConfirmSalesOrderV5.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV5Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processSalesOrderV6");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV6"), JP420000.bssv.e1.oracle.ProcessSalesOrderV6.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrderV6"));
        oper.setReturnClass(JP420000.bssv.e1.oracle.ConfirmSalesOrderV6.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV6Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"),
                      "JP420000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[18] = oper;

    }

    public SalesOrderManagerPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SalesOrderManagerPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SalesOrderManagerPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "availability");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Availability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "availabilityV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.AvailabilityV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "BusinessServiceException");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.BusinessServiceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "categoryCodesPurchasing");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.CategoryCodesPurchasing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "categoryCodesSales");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.CategoryCodesSales.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "configuration");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Configuration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "configurationV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfigurationV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrder");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSalesOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrderV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSalesOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrderV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSalesOrderV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrderV4");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSalesOrderV4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrderV5");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSalesOrderV5.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesOrderV6");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSalesOrderV6.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesPriceAdjustment");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSalesPriceAdjustmentV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustmentV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetail");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSODetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailDates");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSODetailDates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailDelivery");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSODetailDelivery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailFinancial");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSODetailFinancial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailFinancialV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSODetailFinancialV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailProduct");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSODetailProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSODetailV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSODetailV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSODetailV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSOHeader");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSOHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSOHeaderDates");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSOHeaderDates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSOHeaderDelivery");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSOHeaderDelivery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSOHeaderFinancial");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSOHeaderFinancial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSOHeaderV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSOHeaderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "confirmSOHeaderV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ConfirmSOHeaderV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "customer");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Customer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "dates");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Dates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "document");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Document.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "documentKey");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.DocumentKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "e1Message");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.E1Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "e1MessageList");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.E1Message[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "e1Message");
            qName2 = new javax.xml.namespace.QName("", "e1Messages");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "entity");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Entity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "financial");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Financial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPrice");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetCustomerItemPrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getCustomerItemPriceV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetCustomerItemPriceV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getDetailProduct");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetDetailProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemListPrice");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetItemListPrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailability");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetItemPriceAndAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetItemPriceAndAvailabilityV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getItemPriceAndAvailabilityV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetItemPriceAndAvailabilityV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesDetail");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetSalesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesDetailV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetSalesDetailV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesDetailV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetSalesDetailV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesHeader");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetSalesHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesHeaderV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetSalesHeaderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesHeaderV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetSalesHeaderV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrder");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetSalesOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderPriceHistory");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetSalesOrderPriceHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetSalesOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "getSalesOrderV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.GetSalesOrderV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "itemGroupCustomer");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ItemGroupCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "itemListPriceRecord");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ItemListPriceRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "itemListPriceShared");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ItemListPriceShared.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "messageValueObject");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.MessageValueObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "originalOrder");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.OriginalOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "originalOrderKey");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.OriginalOrderKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "priceAdjustmentLedger");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.PriceAdjustmentLedger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "priceHistory");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.PriceHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "pricing");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Pricing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "pricingV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.PricingV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processing");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Processing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processingVersion");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessingVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrder");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSalesOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSalesOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSalesOrderV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV4");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSalesOrderV4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV5");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSalesOrderV5.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesOrderV6");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSalesOrderV6.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesPriceAdjustment");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSalesPriceAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSalesPriceAdjustmentV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSalesPriceAdjustmentV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOCustomer");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOCustomerV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOCustomerV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetail");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSODetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailBilling");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSODetailBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailBillingV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSODetailBillingV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailProcessing");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSODetailProcessing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailProduct");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSODetailProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailProductV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSODetailProductV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSODetailV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSODetailV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSODetailV4");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSODetailV4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeader");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderBilling");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOHeaderBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderBillingV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOHeaderBillingV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderProcessing");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOHeaderProcessing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOHeaderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOHeaderV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderV4");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOHeaderV4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderV5");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOHeaderV5.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOHeaderV6");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOHeaderV6.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "processSOOriginalOrder");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProcessSOOriginalOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "product");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "productIn");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProductIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "productOut");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProductOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "productOutV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProductOutV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "productOutV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ProductOutV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "quantity");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Quantity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "relatedOrder");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.RelatedOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "relatedOrderKey");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.RelatedOrderKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "salesOrderKey");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.SalesOrderKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "segment");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Segment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showCustomerItemPrice");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowCustomerItemPrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showCustomerItemPriceV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowCustomerItemPriceV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showDetailItem");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowDetailItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showItemListPrice");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowItemListPrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showItemPriceAndAvailability");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowItemPriceAndAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showItemPriceAndAvailabilityV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showItemPriceAndAvailabilityV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showPriceHistoryDetail");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowPriceHistoryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetail");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailLineBilling");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesDetailLineBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailLineBillingV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesDetailLineBillingV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailLinePricing");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesDetailLinePricing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailLinePricingV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesDetailLinePricingV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailOriginalOrder");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesDetailOriginalOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailProduct");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesDetailProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesDetailV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesDetailV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesDetailV4");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesDetailV4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesHeader");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesHeaderV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesHeaderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesHeaderV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesHeaderV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesHeaderV4");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesHeaderV4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrder");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrderPriceHistory");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesOrderPriceHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrderV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrderV3");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesOrderV3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesOrderV4");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesOrderV4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "showSalesShipTo");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ShowSalesShipTo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "userReservedData");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.UserReservedData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "valueObject");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.ValueObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "warehouse");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.Warehouse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "warehouseAddress");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.WarehouseAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "warehouseV2");
            cachedSerQNames.add(qName);
            cls = JP420000.bssv.e1.oracle.WarehouseV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public JP420000.bssv.e1.oracle.ShowItemListPrice getItemListPrice(JP420000.bssv.e1.oracle.GetItemListPrice getItemListPrice) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getItemListPrice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getItemListPrice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ShowItemListPrice) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ShowItemListPrice) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ShowItemListPrice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ConfirmSalesOrderV2 processSalesOrderV2(JP420000.bssv.e1.oracle.ProcessSalesOrderV2 processSalesOrderV2) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processSalesOrderV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processSalesOrderV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrderV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrderV2) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ConfirmSalesOrderV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ConfirmSalesOrderV4 processSalesOrderV4(JP420000.bssv.e1.oracle.ProcessSalesOrderV4 processSalesOrderV4) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processSalesOrderV4"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processSalesOrderV4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrderV4) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrderV4) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ConfirmSalesOrderV4.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ShowSalesOrderV3 getSalesOrderV3(JP420000.bssv.e1.oracle.GetSalesOrderV2 getSalesOrderV3) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSalesOrderV3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSalesOrderV3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ShowSalesOrderV3) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ShowSalesOrderV3) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ShowSalesOrderV3.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ConfirmSalesOrderV3 processSalesOrderV3(JP420000.bssv.e1.oracle.ProcessSalesOrderV3 processSalesOrderV3) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processSalesOrderV3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processSalesOrderV3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrderV3) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrderV3) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ConfirmSalesOrderV3.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ShowCustomerItemPriceV2 getCustomerItemPriceV2(JP420000.bssv.e1.oracle.GetCustomerItemPriceV2 getCustomerItemPriceV2) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCustomerItemPriceV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCustomerItemPriceV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ShowCustomerItemPriceV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ShowCustomerItemPriceV2) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ShowCustomerItemPriceV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ShowItemPriceAndAvailability getItemPriceAndAvailability(JP420000.bssv.e1.oracle.GetItemPriceAndAvailability getItemPriceAndAvailability) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getItemPriceAndAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getItemPriceAndAvailability});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ShowItemPriceAndAvailability) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ShowItemPriceAndAvailability) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ShowItemPriceAndAvailability.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV2 getItemPriceAndAvailabilityV2(JP420000.bssv.e1.oracle.GetItemPriceAndAvailabilityV2 getItemPriceAndAvailabilityV2) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getItemPriceAndAvailabilityV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getItemPriceAndAvailabilityV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV2) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV3 getItemPriceAndAvailabilityV3(JP420000.bssv.e1.oracle.GetItemPriceAndAvailabilityV3 getItemPriceAndAvailabilityV3) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getItemPriceAndAvailabilityV3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getItemPriceAndAvailabilityV3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV3) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV3) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV3.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ShowCustomerItemPrice getCustomerItemPrice(JP420000.bssv.e1.oracle.GetCustomerItemPrice getCustomerItemPrice) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCustomerItemPrice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getCustomerItemPrice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ShowCustomerItemPrice) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ShowCustomerItemPrice) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ShowCustomerItemPrice.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ConfirmSalesOrder processSalesOrder(JP420000.bssv.e1.oracle.ProcessSalesOrder processSalesOrder) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processSalesOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processSalesOrder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrder) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrder) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ConfirmSalesOrder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustmentV2 processSalesPriceAdjustmentV2(JP420000.bssv.e1.oracle.ProcessSalesPriceAdjustmentV2 processSalesPriceAdjustmentV2) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processSalesPriceAdjustmentV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processSalesPriceAdjustmentV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustmentV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustmentV2) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustmentV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ShowSalesOrderPriceHistory getSalesOrderPriceHistory(JP420000.bssv.e1.oracle.GetSalesOrderPriceHistory getSalesOrderPriceHistory) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSalesOrderPriceHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSalesOrderPriceHistory});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ShowSalesOrderPriceHistory) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ShowSalesOrderPriceHistory) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ShowSalesOrderPriceHistory.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ShowSalesOrder getSalesOrder(JP420000.bssv.e1.oracle.GetSalesOrder getSalesOrder) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSalesOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSalesOrder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ShowSalesOrder) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ShowSalesOrder) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ShowSalesOrder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ShowSalesOrderV2 getSalesOrderV2(JP420000.bssv.e1.oracle.GetSalesOrder getSalesOrderV2) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSalesOrderV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSalesOrderV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ShowSalesOrderV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ShowSalesOrderV2) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ShowSalesOrderV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustment processSalesPriceAdjustment(JP420000.bssv.e1.oracle.ProcessSalesPriceAdjustment processSalesPriceAdjustment) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processSalesPriceAdjustment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processSalesPriceAdjustment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustment) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustment) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ShowSalesOrderV4 getSalesOrderV4(JP420000.bssv.e1.oracle.GetSalesOrderV3 getSalesOrderV4) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSalesOrderV4"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSalesOrderV4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ShowSalesOrderV4) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ShowSalesOrderV4) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ShowSalesOrderV4.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ConfirmSalesOrderV5 processSalesOrderV5(JP420000.bssv.e1.oracle.ProcessSalesOrderV5 processSalesOrderV5) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processSalesOrderV5"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processSalesOrderV5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrderV5) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrderV5) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ConfirmSalesOrderV5.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP420000.bssv.e1.oracle.ConfirmSalesOrderV6 processSalesOrderV6(JP420000.bssv.e1.oracle.ProcessSalesOrderV6 processSalesOrderV6) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processSalesOrderV6"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processSalesOrderV6});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrderV6) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP420000.bssv.e1.oracle.ConfirmSalesOrderV6) org.apache.axis.utils.JavaUtils.convert(_resp, JP420000.bssv.e1.oracle.ConfirmSalesOrderV6.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP420000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP420000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
