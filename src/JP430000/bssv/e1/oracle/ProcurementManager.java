/**
 * ProcurementManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public interface ProcurementManager extends java.rmi.Remote {
    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderAcknowledge processPurchaseOrderAcknowledge(JP430000.bssv.e1.oracle.ProcessPurchaseOrderAcknowledge processPurchaseOrderAcknowledge) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException;
    public JP430000.bssv.e1.oracle.ShowPurchaseOrderV2 getPurchaseOrderV2(JP430000.bssv.e1.oracle.GetPurchaseOrderV2 getPurchaseOrderV2) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException;
    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrder processPurchaseOrder(JP430000.bssv.e1.oracle.ProcessPurchaseOrder processPurchaseOrder) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException;
    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrder processPurchaseOrderV2(JP430000.bssv.e1.oracle.ProcessPurchaseOrderV2 processPurchaseOrderV2) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException;
    public JP430000.bssv.e1.oracle.ShowPurchaseOrder getPurchaseOrder(JP430000.bssv.e1.oracle.GetPurchaseOrder getPurchaseOrder) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException;
    public JP430000.bssv.e1.oracle.ShowPurchaseOrdersForApprover getPurchaseOrdersForApprover(JP430000.bssv.e1.oracle.GetPurchaseOrdersForApprover getPurchaseOrdersForApprover) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException;
    public JP430000.bssv.e1.oracle.ShowPurchaseOrderDetailForApprover getPurchaseOrderDetailForApprover(JP430000.bssv.e1.oracle.GetPurchaseOrderDetailForApprover getPurchaseOrderDetailForApprover) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException;
    public JP430000.bssv.e1.oracle.ShowPurchaseOrderEmployeeProfile getPurchaseOrderEmployeeProfile(JP430000.bssv.e1.oracle.GetPurchaseOrderEmployeeProfile getPurchaseOrderEmployeeProfile) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException;
    public JP430000.bssv.e1.oracle.ShowPurchaseOrdersCounts getPurchaseOrdersCounts(JP430000.bssv.e1.oracle.GetPurchaseOrdersCounts getPurchaseOrdersCounts) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException;
    public JP430000.bssv.e1.oracle.ConfirmPurchaseOrderApproveReject processPurchaseOrderApproveReject(JP430000.bssv.e1.oracle.ProcessPurchaseOrderApproveReject processPurchaseOrderApproveReject) throws java.rmi.RemoteException, JP430000.bssv.e1.oracle.BusinessServiceException;
}
