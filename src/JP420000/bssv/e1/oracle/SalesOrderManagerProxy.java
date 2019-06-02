package JP420000.bssv.e1.oracle;

public class SalesOrderManagerProxy implements JP420000.bssv.e1.oracle.SalesOrderManager {
  private String _endpoint = null;
  private JP420000.bssv.e1.oracle.SalesOrderManager salesOrderManager = null;
  
  public SalesOrderManagerProxy() {
    _initSalesOrderManagerProxy();
  }
  
  public SalesOrderManagerProxy(String endpoint) {
    _endpoint = endpoint;
    _initSalesOrderManagerProxy();
  }
  
  private void _initSalesOrderManagerProxy() {
    try {
      salesOrderManager = (new JP420000.bssv.e1.oracle.SalesOrderManagerServiceLocator()).getSalesOrderManagerPort();
      if (salesOrderManager != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)salesOrderManager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)salesOrderManager)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (salesOrderManager != null)
      ((javax.xml.rpc.Stub)salesOrderManager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public JP420000.bssv.e1.oracle.SalesOrderManager getSalesOrderManager() {
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager;
  }
  
  public JP420000.bssv.e1.oracle.ShowItemListPrice getItemListPrice(JP420000.bssv.e1.oracle.GetItemListPrice getItemListPrice) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.getItemListPrice(getItemListPrice);
  }
  
  public JP420000.bssv.e1.oracle.ConfirmSalesOrderV2 processSalesOrderV2(JP420000.bssv.e1.oracle.ProcessSalesOrderV2 processSalesOrderV2) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.processSalesOrderV2(processSalesOrderV2);
  }
  
  public JP420000.bssv.e1.oracle.ConfirmSalesOrderV4 processSalesOrderV4(JP420000.bssv.e1.oracle.ProcessSalesOrderV4 processSalesOrderV4) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.processSalesOrderV4(processSalesOrderV4);
  }
  
  public JP420000.bssv.e1.oracle.ShowSalesOrderV3 getSalesOrderV3(JP420000.bssv.e1.oracle.GetSalesOrderV2 getSalesOrderV3) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.getSalesOrderV3(getSalesOrderV3);
  }
  
  public JP420000.bssv.e1.oracle.ConfirmSalesOrderV3 processSalesOrderV3(JP420000.bssv.e1.oracle.ProcessSalesOrderV3 processSalesOrderV3) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.processSalesOrderV3(processSalesOrderV3);
  }
  
  public JP420000.bssv.e1.oracle.ShowCustomerItemPriceV2 getCustomerItemPriceV2(JP420000.bssv.e1.oracle.GetCustomerItemPriceV2 getCustomerItemPriceV2) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.getCustomerItemPriceV2(getCustomerItemPriceV2);
  }
  
  public JP420000.bssv.e1.oracle.ShowItemPriceAndAvailability getItemPriceAndAvailability(JP420000.bssv.e1.oracle.GetItemPriceAndAvailability getItemPriceAndAvailability) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.getItemPriceAndAvailability(getItemPriceAndAvailability);
  }
  
  public JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV2 getItemPriceAndAvailabilityV2(JP420000.bssv.e1.oracle.GetItemPriceAndAvailabilityV2 getItemPriceAndAvailabilityV2) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.getItemPriceAndAvailabilityV2(getItemPriceAndAvailabilityV2);
  }
  
  public JP420000.bssv.e1.oracle.ShowItemPriceAndAvailabilityV3 getItemPriceAndAvailabilityV3(JP420000.bssv.e1.oracle.GetItemPriceAndAvailabilityV3 getItemPriceAndAvailabilityV3) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.getItemPriceAndAvailabilityV3(getItemPriceAndAvailabilityV3);
  }
  
  public JP420000.bssv.e1.oracle.ShowCustomerItemPrice getCustomerItemPrice(JP420000.bssv.e1.oracle.GetCustomerItemPrice getCustomerItemPrice) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.getCustomerItemPrice(getCustomerItemPrice);
  }
  
  public JP420000.bssv.e1.oracle.ConfirmSalesOrder processSalesOrder(JP420000.bssv.e1.oracle.ProcessSalesOrder processSalesOrder) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.processSalesOrder(processSalesOrder);
  }
  
  public JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustmentV2 processSalesPriceAdjustmentV2(JP420000.bssv.e1.oracle.ProcessSalesPriceAdjustmentV2 processSalesPriceAdjustmentV2) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.processSalesPriceAdjustmentV2(processSalesPriceAdjustmentV2);
  }
  
  public JP420000.bssv.e1.oracle.ShowSalesOrderPriceHistory getSalesOrderPriceHistory(JP420000.bssv.e1.oracle.GetSalesOrderPriceHistory getSalesOrderPriceHistory) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.getSalesOrderPriceHistory(getSalesOrderPriceHistory);
  }
  
  public JP420000.bssv.e1.oracle.ShowSalesOrder getSalesOrder(JP420000.bssv.e1.oracle.GetSalesOrder getSalesOrder) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.getSalesOrder(getSalesOrder);
  }
  
  public JP420000.bssv.e1.oracle.ShowSalesOrderV2 getSalesOrderV2(JP420000.bssv.e1.oracle.GetSalesOrder getSalesOrderV2) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.getSalesOrderV2(getSalesOrderV2);
  }
  
  public JP420000.bssv.e1.oracle.ConfirmSalesPriceAdjustment processSalesPriceAdjustment(JP420000.bssv.e1.oracle.ProcessSalesPriceAdjustment processSalesPriceAdjustment) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.processSalesPriceAdjustment(processSalesPriceAdjustment);
  }
  
  public JP420000.bssv.e1.oracle.ShowSalesOrderV4 getSalesOrderV4(JP420000.bssv.e1.oracle.GetSalesOrderV3 getSalesOrderV4) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.getSalesOrderV4(getSalesOrderV4);
  }
  
  public JP420000.bssv.e1.oracle.ConfirmSalesOrderV5 processSalesOrderV5(JP420000.bssv.e1.oracle.ProcessSalesOrderV5 processSalesOrderV5) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.processSalesOrderV5(processSalesOrderV5);
  }
  
  public JP420000.bssv.e1.oracle.ConfirmSalesOrderV6 processSalesOrderV6(JP420000.bssv.e1.oracle.ProcessSalesOrderV6 processSalesOrderV6) throws java.rmi.RemoteException, JP420000.bssv.e1.oracle.BusinessServiceException{
    if (salesOrderManager == null)
      _initSalesOrderManagerProxy();
    return salesOrderManager.processSalesOrderV6(processSalesOrderV6);
  }
  
  
}