package org.alan.test;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Service;

import JP420000.bssv.e1.oracle.ConfirmSalesOrder;
import JP420000.bssv.e1.oracle.Entity;
import JP420000.bssv.e1.oracle.ItemGroupCustomer;
import JP420000.bssv.e1.oracle.ProcessSOCustomer;
import JP420000.bssv.e1.oracle.ProcessSODetail;
import JP420000.bssv.e1.oracle.ProcessSODetailProcessing;
import JP420000.bssv.e1.oracle.ProcessSODetailProduct;
import JP420000.bssv.e1.oracle.ProcessSOHeader;
import JP420000.bssv.e1.oracle.ProcessSOHeaderProcessing;
import JP420000.bssv.e1.oracle.ProcessSalesOrder;
import JP420000.bssv.e1.oracle.SalesOrderKey;
import JP420000.bssv.e1.oracle.SalesOrderManagerPortBindingStub;

public class GetSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="http://172.18.206.134:9083/PY920/SalesOrderManager";
			Service ser=new Service();
			URL u=new URL(url);
			SalesOrderManagerPortBindingStub spbs=new SalesOrderManagerPortBindingStub(u,ser);
			ProcessSalesOrder processSalesOrder=new ProcessSalesOrder();
			ProcessSOHeader processSOHeader =new ProcessSOHeader();
			processSOHeader.setBusinessUnit("      201103");
			//processSOHeader.set("      300201");

			ProcessSOCustomer processSOCustomer=new ProcessSOCustomer();
			Entity customer=new Entity();
			customer.setEntityId(201);
			processSOCustomer.setCustomer(customer);
			processSOHeader.setShipTo(processSOCustomer);
			
			
			ProcessSOHeaderProcessing processSOHeaderProcessing	=new ProcessSOHeaderProcessing();
			processSOHeaderProcessing.setActionType("A");
			
		//	processSOHeaderProcessing.setProcessingVersion("IVY0010");

			processSOHeaderProcessing.setProcessingVersion("ZJDE0001");
			processSOHeader.setProcessing(processSOHeaderProcessing);
			
			SalesOrderKey salesOrderKey=new SalesOrderKey();
			salesOrderKey.setDocumentTypeCode("ST");
			salesOrderKey.setDocumentCompany("00201");
			processSOHeader.setSalesOrderKey(salesOrderKey);
			
			ProcessSODetail[] detail=new ProcessSODetail[1];
			ProcessSODetail detail1=new ProcessSODetail();
			
			ProcessSODetailProcessing processSODetailProcessing =new ProcessSODetailProcessing();
			processSODetailProcessing.setActionType("A");
			detail1.setProcessing(processSODetailProcessing);
			
			ProcessSODetailProduct processSODetailProduct=new ProcessSODetailProduct();
			ItemGroupCustomer igc=new ItemGroupCustomer();
			igc.setItemProduct("10101020003");
			processSODetailProduct.setItem(igc);
			
			detail1.setProduct(processSODetailProduct);
			detail1.setQuantityOrdered(new BigDecimal(2));
			detail1.setBusinessUnitDestination("      207103");
			detail[0]=detail1;
			processSOHeader.setDetail(detail);
			
			processSalesOrder.setHeader(processSOHeader);
			
			
			
			
			
			ConfirmSalesOrder cso=spbs.processSalesOrder(processSalesOrder);
			System.out.println("doco:"+cso.getHeader().getSalesOrderKey().getDocumentNumber());
			System.out.println("dcto:"+cso.getHeader().getSalesOrderKey().getDocumentTypeCode());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}

}
