/**
 * ProcurementManagerPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ProcurementManagerPortBindingStub extends org.apache.axis.client.Stub implements JP430000.bssv.e1.oracle.ProcurementManager {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processPurchaseOrderAcknowledge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderAcknowledge"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderAcknowledge"), JP430000.bssv.e1.oracle.ProcessPurchaseOrderAcknowledge.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderAcknowledge"));
        oper.setReturnClass(JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledge.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderAcknowledgeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"),
                      "JP430000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPurchaseOrderV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderV2"), JP430000.bssv.e1.oracle.GetPurchaseOrderV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrderV2"));
        oper.setReturnClass(JP430000.bssv.e1.oracle.ShowPurchaseOrderV2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderV2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"),
                      "JP430000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processPurchaseOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrder"), JP430000.bssv.e1.oracle.ProcessPurchaseOrder.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrder"));
        oper.setReturnClass(JP430000.bssv.e1.oracle.ConfirmPurchaseOrder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"),
                      "JP430000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processPurchaseOrderV2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderV2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderV2"), JP430000.bssv.e1.oracle.ProcessPurchaseOrderV2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrder"));
        oper.setReturnClass(JP430000.bssv.e1.oracle.ConfirmPurchaseOrder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderV2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"),
                      "JP430000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPurchaseOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrder"), JP430000.bssv.e1.oracle.GetPurchaseOrder.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrder"));
        oper.setReturnClass(JP430000.bssv.e1.oracle.ShowPurchaseOrder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"),
                      "JP430000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPurchaseOrdersForApprover");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrdersForApprover"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrdersForApprover"), JP430000.bssv.e1.oracle.GetPurchaseOrdersForApprover.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrdersForApprover"));
        oper.setReturnClass(JP430000.bssv.e1.oracle.ShowPurchaseOrdersForApprover.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrdersForApproverResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"),
                      "JP430000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPurchaseOrderDetailForApprover");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderDetailForApprover"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderDetailForApprover"), JP430000.bssv.e1.oracle.GetPurchaseOrderDetailForApprover.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrderDetailForApprover"));
        oper.setReturnClass(JP430000.bssv.e1.oracle.ShowPurchaseOrderDetailForApprover.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderDetailForApproverResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"),
                      "JP430000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPurchaseOrderEmployeeProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderEmployeeProfile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderEmployeeProfile"), JP430000.bssv.e1.oracle.GetPurchaseOrderEmployeeProfile.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrderEmployeeProfile"));
        oper.setReturnClass(JP430000.bssv.e1.oracle.ShowPurchaseOrderEmployeeProfile.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderEmployeeProfileResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"),
                      "JP430000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPurchaseOrdersCounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrdersCounts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrdersCounts"), JP430000.bssv.e1.oracle.GetPurchaseOrdersCounts.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrdersCounts"));
        oper.setReturnClass(JP430000.bssv.e1.oracle.ShowPurchaseOrdersCounts.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrdersCountsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"),
                      "JP430000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processPurchaseOrderApproveReject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderApproveReject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderApproveReject"), JP430000.bssv.e1.oracle.ProcessPurchaseOrderApproveReject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderApproveReject"));
        oper.setReturnClass(JP430000.bssv.e1.oracle.ConfirmPurchaseOrderApproveReject.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderApproveRejectResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"),
                      "JP430000.bssv.e1.oracle.BusinessServiceException",
                      new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    public ProcurementManagerPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProcurementManagerPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProcurementManagerPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "BusinessServiceException");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.BusinessServiceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrder");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ConfirmPurchaseOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderAcknowledge");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderAcknowledgeDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledgeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderAcknowledgeHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledgeHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderApproveReject");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ConfirmPurchaseOrderApproveReject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ConfirmPurchaseOrderDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderFinancialDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ConfirmPurchaseOrderFinancialDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderFinancialHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ConfirmPurchaseOrderFinancialHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ConfirmPurchaseOrderHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "confirmPurchaseOrderQuantity");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ConfirmPurchaseOrderQuantity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "dates");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.Dates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "e1Message");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.E1Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "e1MessageList");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.E1Message[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "e1Message");
            qName2 = new javax.xml.namespace.QName("", "e1Messages");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "entity");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.Entity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrder");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.GetPurchaseOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderDetailForApprover");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.GetPurchaseOrderDetailForApprover.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderEmployeeProfile");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.GetPurchaseOrderEmployeeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrdersCounts");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.GetPurchaseOrdersCounts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrdersForApprover");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.GetPurchaseOrdersForApprover.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "getPurchaseOrderV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.GetPurchaseOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "glAccount");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.GlAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "glAccountKey");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.GlAccountKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "itemGroupSupplier");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ItemGroupSupplier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "itemResponseSupplier");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ItemResponseSupplier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "messageValueObject");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.MessageValueObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "originalOrderLineKey");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.OriginalOrderLineKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processing");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.Processing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrder");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ProcessPurchaseOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderAcknowledge");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ProcessPurchaseOrderAcknowledge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderApproveReject");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ProcessPurchaseOrderApproveReject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "processPurchaseOrderV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ProcessPurchaseOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "product");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.Product.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "project");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.Project.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrder");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeFinancial");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeFinancial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeFinancialDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeFinancialDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeTax");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAcknowledgeTaxDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderAcknowledgeTaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderAddress");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDatesDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderDatesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDatesHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderDatesHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDeliveryDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderDeliveryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDeliveryHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderDeliveryHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDeliveryHeaderV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderDeliveryHeaderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderDetailForApproverResults");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderDetailForApproverResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderFinancialDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderFinancialDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetDates");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderGetDates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderGetDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetDetailDates");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderGetDetailDates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetDetailV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderGetDetailV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderGetHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetHeaderV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderGetHeaderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderGetQuantity");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderGetQuantity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderHeaderV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderHeaderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderKey");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderLineKey");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderLineKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderProcessing");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderProcessing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderRemarksDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderRemarksDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrdersCountsFields");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrdersCountsFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrdersForApproverResults");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrdersForApproverResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShipToAddressHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderShipToAddressHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShipToAddressHeaderV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderShipToAddressHeaderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowDates");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderShowDates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderShowDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowDetailDates");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderShowDetailDates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowDetailV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderShowDetailV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderShowHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowHeaderV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderShowHeaderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowKey");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderShowKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderShowQuantity");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderShowQuantity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderSupplierAddressHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderSupplierAddressHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderSupplierAddressHeaderV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderSupplierAddressHeaderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderTaxDetail");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderTaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderTaxHeader");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderTaxHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "purchaseOrderV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.PurchaseOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "relatedOrderLineKey");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.RelatedOrderLineKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "reportingCodesPurchasing");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ReportingCodesPurchasing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrder");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ShowPurchaseOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrderDetailForApprover");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ShowPurchaseOrderDetailForApprover.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrderEmployeeProfile");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ShowPurchaseOrderEmployeeProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrdersCounts");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ShowPurchaseOrdersCounts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrdersForApprover");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ShowPurchaseOrdersForApprover.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "showPurchaseOrderV2");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ShowPurchaseOrderV2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "subledger");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.Subledger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "userReservedData");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.UserReservedData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "valueObject");
            cachedSerQNames.add(qName);
            cls = JP430000.bssv.e1.oracle.ValueObject.class;
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

    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledge processPurchaseOrderAcknowledge(JP430000.bssv.e1.oracle.ProcessPurchaseOrderAcknowledge processPurchaseOrderAcknowledge) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "processPurchaseOrderAcknowledge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processPurchaseOrderAcknowledge});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledge) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledge) org.apache.axis.utils.JavaUtils.convert(_resp, JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledge.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP430000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP430000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP430000.bssv.e1.oracle.ShowPurchaseOrderV2 getPurchaseOrderV2(JP430000.bssv.e1.oracle.GetPurchaseOrderV2 getPurchaseOrderV2) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getPurchaseOrderV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPurchaseOrderV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrderV2) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrderV2) org.apache.axis.utils.JavaUtils.convert(_resp, JP430000.bssv.e1.oracle.ShowPurchaseOrderV2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP430000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP430000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrder processPurchaseOrder(JP430000.bssv.e1.oracle.ProcessPurchaseOrder processPurchaseOrder) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "processPurchaseOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processPurchaseOrder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP430000.bssv.e1.oracle.ConfirmPurchaseOrder) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP430000.bssv.e1.oracle.ConfirmPurchaseOrder) org.apache.axis.utils.JavaUtils.convert(_resp, JP430000.bssv.e1.oracle.ConfirmPurchaseOrder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP430000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP430000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrder processPurchaseOrderV2(JP430000.bssv.e1.oracle.ProcessPurchaseOrderV2 processPurchaseOrderV2) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "processPurchaseOrderV2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processPurchaseOrderV2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP430000.bssv.e1.oracle.ConfirmPurchaseOrder) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP430000.bssv.e1.oracle.ConfirmPurchaseOrder) org.apache.axis.utils.JavaUtils.convert(_resp, JP430000.bssv.e1.oracle.ConfirmPurchaseOrder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP430000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP430000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP430000.bssv.e1.oracle.ShowPurchaseOrder getPurchaseOrder(JP430000.bssv.e1.oracle.GetPurchaseOrder getPurchaseOrder) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getPurchaseOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPurchaseOrder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrder) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrder) org.apache.axis.utils.JavaUtils.convert(_resp, JP430000.bssv.e1.oracle.ShowPurchaseOrder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP430000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP430000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP430000.bssv.e1.oracle.ShowPurchaseOrdersForApprover getPurchaseOrdersForApprover(JP430000.bssv.e1.oracle.GetPurchaseOrdersForApprover getPurchaseOrdersForApprover) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getPurchaseOrdersForApprover"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPurchaseOrdersForApprover});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrdersForApprover) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrdersForApprover) org.apache.axis.utils.JavaUtils.convert(_resp, JP430000.bssv.e1.oracle.ShowPurchaseOrdersForApprover.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP430000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP430000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP430000.bssv.e1.oracle.ShowPurchaseOrderDetailForApprover getPurchaseOrderDetailForApprover(JP430000.bssv.e1.oracle.GetPurchaseOrderDetailForApprover getPurchaseOrderDetailForApprover) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getPurchaseOrderDetailForApprover"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPurchaseOrderDetailForApprover});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrderDetailForApprover) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrderDetailForApprover) org.apache.axis.utils.JavaUtils.convert(_resp, JP430000.bssv.e1.oracle.ShowPurchaseOrderDetailForApprover.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP430000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP430000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP430000.bssv.e1.oracle.ShowPurchaseOrderEmployeeProfile getPurchaseOrderEmployeeProfile(JP430000.bssv.e1.oracle.GetPurchaseOrderEmployeeProfile getPurchaseOrderEmployeeProfile) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getPurchaseOrderEmployeeProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPurchaseOrderEmployeeProfile});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrderEmployeeProfile) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrderEmployeeProfile) org.apache.axis.utils.JavaUtils.convert(_resp, JP430000.bssv.e1.oracle.ShowPurchaseOrderEmployeeProfile.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP430000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP430000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP430000.bssv.e1.oracle.ShowPurchaseOrdersCounts getPurchaseOrdersCounts(JP430000.bssv.e1.oracle.GetPurchaseOrdersCounts getPurchaseOrdersCounts) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getPurchaseOrdersCounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPurchaseOrdersCounts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrdersCounts) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP430000.bssv.e1.oracle.ShowPurchaseOrdersCounts) org.apache.axis.utils.JavaUtils.convert(_resp, JP430000.bssv.e1.oracle.ShowPurchaseOrdersCounts.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP430000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP430000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderApproveReject processPurchaseOrderApproveReject(JP430000.bssv.e1.oracle.ProcessPurchaseOrderApproveReject processPurchaseOrderApproveReject) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "processPurchaseOrderApproveReject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processPurchaseOrderApproveReject});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (JP430000.bssv.e1.oracle.ConfirmPurchaseOrderApproveReject) _resp;
            } catch (java.lang.Exception _exception) {
                return (JP430000.bssv.e1.oracle.ConfirmPurchaseOrderApproveReject) org.apache.axis.utils.JavaUtils.convert(_resp, JP430000.bssv.e1.oracle.ConfirmPurchaseOrderApproveReject.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JP430000.bssv.e1.oracle.BusinessServiceException) {
              throw (JP430000.bssv.e1.oracle.BusinessServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
