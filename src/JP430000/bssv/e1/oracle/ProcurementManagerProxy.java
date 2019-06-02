package JP430000.bssv.e1.oracle;

public class ProcurementManagerProxy implements JP430000.bssv.e1.oracle.ProcurementManager {
  private String _endpoint = null;
  private JP430000.bssv.e1.oracle.ProcurementManager procurementManager = null;
  
  public ProcurementManagerProxy() {
    _initProcurementManagerProxy();
  }
  
  public ProcurementManagerProxy(String endpoint) {
    _endpoint = endpoint;
    _initProcurementManagerProxy();
  }
  
  private void _initProcurementManagerProxy() {
    try {
      procurementManager = (new JP430000.bssv.e1.oracle.ProcurementManagerServiceLocator()).getProcurementManagerPort();
      if (procurementManager != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)procurementManager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)procurementManager)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (procurementManager != null)
      ((javax.xml.rpc.Stub)procurementManager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public JP430000.bssv.e1.oracle.ProcurementManager getProcurementManager() {
    if (procurementManager == null)
      _initProcurementManagerProxy();
    return procurementManager;
  }
  
  public JP430000.bssv.e1.oracle.ShowPurchaseOrder getPurchaseOrder(JP430000.bssv.e1.oracle.GetPurchaseOrder getPurchaseOrder) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException{
    if (procurementManager == null)
      _initProcurementManagerProxy();
    return procurementManager.getPurchaseOrder(getPurchaseOrder);
  }
  
  public JP430000.bssv.e1.oracle.ShowPurchaseOrderDetailForApprover getPurchaseOrderDetailForApprover(JP430000.bssv.e1.oracle.GetPurchaseOrderDetailForApprover getPurchaseOrderDetailForApprover) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException{
    if (procurementManager == null)
      _initProcurementManagerProxy();
    return procurementManager.getPurchaseOrderDetailForApprover(getPurchaseOrderDetailForApprover);
  }
  
  public JP430000.bssv.e1.oracle.ShowPurchaseOrderEmployeeProfile getPurchaseOrderEmployeeProfile(JP430000.bssv.e1.oracle.GetPurchaseOrderEmployeeProfile getPurchaseOrderEmployeeProfile) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException{
    if (procurementManager == null)
      _initProcurementManagerProxy();
    return procurementManager.getPurchaseOrderEmployeeProfile(getPurchaseOrderEmployeeProfile);
  }
  
  public JP430000.bssv.e1.oracle.ShowPurchaseOrdersCounts getPurchaseOrdersCounts(JP430000.bssv.e1.oracle.GetPurchaseOrdersCounts getPurchaseOrdersCounts) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException{
    if (procurementManager == null)
      _initProcurementManagerProxy();
    return procurementManager.getPurchaseOrdersCounts(getPurchaseOrdersCounts);
  }
  
  public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderApproveReject processPurchaseOrderApproveReject(JP430000.bssv.e1.oracle.ProcessPurchaseOrderApproveReject processPurchaseOrderApproveReject) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException{
    if (procurementManager == null)
      _initProcurementManagerProxy();
    return procurementManager.processPurchaseOrderApproveReject(processPurchaseOrderApproveReject);
  }
  
  public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledge processPurchaseOrderAcknowledge(JP430000.bssv.e1.oracle.ProcessPurchaseOrderAcknowledge processPurchaseOrderAcknowledge) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException{
    if (procurementManager == null)
      _initProcurementManagerProxy();
    return procurementManager.processPurchaseOrderAcknowledge(processPurchaseOrderAcknowledge);
  }
  
  public JP430000.bssv.e1.oracle.ShowPurchaseOrderV2 getPurchaseOrderV2(JP430000.bssv.e1.oracle.GetPurchaseOrderV2 getPurchaseOrderV2) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException{
    if (procurementManager == null)
      _initProcurementManagerProxy();
    return procurementManager.getPurchaseOrderV2(getPurchaseOrderV2);
  }
  
  public JP430000.bssv.e1.oracle.ConfirmPurchaseOrder processPurchaseOrder(JP430000.bssv.e1.oracle.ProcessPurchaseOrder processPurchaseOrder) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException{
    if (procurementManager == null)
      _initProcurementManagerProxy();
    return procurementManager.processPurchaseOrder(processPurchaseOrder);
  }
  
  public JP430000.bssv.e1.oracle.ConfirmPurchaseOrder processPurchaseOrderV2(JP430000.bssv.e1.oracle.ProcessPurchaseOrderV2 processPurchaseOrderV2) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException{
    if (procurementManager == null)
      _initProcurementManagerProxy();
    return procurementManager.processPurchaseOrderV2(processPurchaseOrderV2);
  }
  
  public JP430000.bssv.e1.oracle.ShowPurchaseOrdersForApprover getPurchaseOrdersForApprover(JP430000.bssv.e1.oracle.GetPurchaseOrdersForApprover getPurchaseOrdersForApprover) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException{
    if (procurementManager == null)
      _initProcurementManagerProxy();
    return procurementManager.getPurchaseOrdersForApprover(getPurchaseOrdersForApprover);
  }
  
  
}