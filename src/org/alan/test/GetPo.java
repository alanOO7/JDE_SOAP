package org.alan.test;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Service;

import JP430000.bssv.e1.oracle.ConfirmPurchaseOrder;
import JP430000.bssv.e1.oracle.Entity;
import JP430000.bssv.e1.oracle.GetPurchaseOrder;
import JP430000.bssv.e1.oracle.ItemGroupSupplier;
import JP430000.bssv.e1.oracle.ProcessPurchaseOrder;
import JP430000.bssv.e1.oracle.ProcurementManager;
import JP430000.bssv.e1.oracle.ProcurementManagerPortBindingStub;
import JP430000.bssv.e1.oracle.Product;
import JP430000.bssv.e1.oracle.PurchaseOrder;
import JP430000.bssv.e1.oracle.PurchaseOrderAddress;
import JP430000.bssv.e1.oracle.PurchaseOrderDetail;
import JP430000.bssv.e1.oracle.PurchaseOrderGetHeader;
import JP430000.bssv.e1.oracle.PurchaseOrderHeader;
import JP430000.bssv.e1.oracle.PurchaseOrderKey;
import JP430000.bssv.e1.oracle.PurchaseOrderProcessing;
import JP430000.bssv.e1.oracle.PurchaseOrderShipToAddressHeader;
import JP430000.bssv.e1.oracle.PurchaseOrderShowHeader;
import JP430000.bssv.e1.oracle.PurchaseOrderSupplierAddressHeader;
import JP430000.bssv.e1.oracle.ShowPurchaseOrder;

public class GetPo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String url="http://172.18.206.134:9083/PY920/ProcurementManager";
			Service ser=new Service();
			URL u=new URL(url);
			ProcurementManagerPortBindingStub poget=new ProcurementManagerPortBindingStub(u,ser);
			
			GetPurchaseOrder gpo=new GetPurchaseOrder();
			PurchaseOrderGetHeader header=new PurchaseOrderGetHeader();
			
			PurchaseOrderKey pk =new PurchaseOrderKey();
			pk.setDocumentNumber(18000001);
			pk.setDocumentTypeCode("OP");
			
			header.setPurchaseOrderKey(pk);
			
			gpo.setHeader(header);
			//GET  
			ShowPurchaseOrder spo=poget.getPurchaseOrder(gpo);
			System.out.println("ddd"+spo.getShowPurchaseOrder(0).getHeader().getBusinessUnit());
			
			//////////////// create po
			ProcessPurchaseOrder processPurchaseOrder=new ProcessPurchaseOrder();
			PurchaseOrderHeader header2=new PurchaseOrderHeader();
			
			PurchaseOrderDetail[] detail2=new PurchaseOrderDetail[1];
			header2.setBusinessUnit("      202101");

			
			PurchaseOrderProcessing pop=new PurchaseOrderProcessing();
			pop.setActionType("1");
			header2.setProcessing(pop);
			
			PurchaseOrderSupplierAddressHeader supplierAddress=new PurchaseOrderSupplierAddressHeader();
			Entity supplier=new Entity();
			supplier.setEntityId(1201);
			supplierAddress.setSupplier(supplier);
			header2.setSupplierAddress(supplierAddress);
			
			
			
			
			PurchaseOrderShipToAddressHeader shipToAddress=new PurchaseOrderShipToAddressHeader();
			Entity shipTo=new Entity();
			shipTo.setEntityId(202);
			shipToAddress.setShipTo(shipTo);
			header2.setShipToAddress(shipToAddress);
			
			PurchaseOrderDetail purchaseOrderDetail =new PurchaseOrderDetail();
			Product product=new Product();
			ItemGroupSupplier igs=new ItemGroupSupplier();
			igs.setItemProduct("R12");
			//product.setLineTypeCode("S");
			product.setItem(igs);
			purchaseOrderDetail.setProduct(product);
			purchaseOrderDetail.setActionType("1");
			purchaseOrderDetail.setQuantityOrdered(new BigDecimal(1));
			detail2[0]=purchaseOrderDetail;
			header2.setDetail(detail2);
			
			
			processPurchaseOrder.setHeader(header2);
			ConfirmPurchaseOrder pos=poget.processPurchaseOrder(processPurchaseOrder);
			System.out.println("doco:"+pos.getHeader().getDocumentNumber());
			
			
            SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddmmss");
            String date1 = "20170423164512";
            
            Date t = new Date();

            SimpleDateFormat df = new SimpleDateFormat("YYYYMMddHHmmss");

            System.out.println(df.format(t));
            
		} catch (MalformedURLException | AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	//	PurchaseOrderShowHeader sheader=new PurchaseOrderShowHeader();
		//sheader.set
	//	PurchaseOrder po=new PurchaseOrder();
		//po.setHeader(header);;
	//	PurchaseOrder[] pos = new PurchaseOrder[1];
	//	pos[0]=po;
	//	spo.setShowPurchaseOrder(pos);
		//ProcurementManager A=new ProcurementManager();
		//gpo.setHeader(ph);
	//	System.out.println(header.getBusinessUnit());
	}

}
