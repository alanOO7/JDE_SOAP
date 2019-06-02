/**
 * ProcurementManagerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP430000.bssv.e1.oracle;

public class ProcurementManagerServiceLocator extends org.apache.axis.client.Service implements JP430000.bssv.e1.oracle.ProcurementManagerService {

    public ProcurementManagerServiceLocator() {
    }


    public ProcurementManagerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProcurementManagerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProcurementManagerPort
    private java.lang.String ProcurementManagerPort_address = "http://172.18.206.134:9083/PY920/ProcurementManager";

    public java.lang.String getProcurementManagerPortAddress() {
        return ProcurementManagerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProcurementManagerPortWSDDServiceName = "ProcurementManagerPort";

    public java.lang.String getProcurementManagerPortWSDDServiceName() {
        return ProcurementManagerPortWSDDServiceName;
    }

    public void setProcurementManagerPortWSDDServiceName(java.lang.String name) {
        ProcurementManagerPortWSDDServiceName = name;
    }

    public JP430000.bssv.e1.oracle.ProcurementManager getProcurementManagerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProcurementManagerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProcurementManagerPort(endpoint);
    }

    public JP430000.bssv.e1.oracle.ProcurementManager getProcurementManagerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            JP430000.bssv.e1.oracle.ProcurementManagerPortBindingStub _stub = new JP430000.bssv.e1.oracle.ProcurementManagerPortBindingStub(portAddress, this);
            _stub.setPortName(getProcurementManagerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProcurementManagerPortEndpointAddress(java.lang.String address) {
        ProcurementManagerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (JP430000.bssv.e1.oracle.ProcurementManager.class.isAssignableFrom(serviceEndpointInterface)) {
                JP430000.bssv.e1.oracle.ProcurementManagerPortBindingStub _stub = new JP430000.bssv.e1.oracle.ProcurementManagerPortBindingStub(new java.net.URL(ProcurementManagerPort_address), this);
                _stub.setPortName(getProcurementManagerPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProcurementManagerPort".equals(inputPortName)) {
            return getProcurementManagerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "ProcurementManagerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP430000/", "ProcurementManagerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProcurementManagerPort".equals(portName)) {
            setProcurementManagerPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
