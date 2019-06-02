/**
 * SalesOrderManagerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JP420000.bssv.e1.oracle;

public class SalesOrderManagerServiceLocator extends org.apache.axis.client.Service implements JP420000.bssv.e1.oracle.SalesOrderManagerService {

    public SalesOrderManagerServiceLocator() {
    }


    public SalesOrderManagerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SalesOrderManagerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SalesOrderManagerPort
    private java.lang.String SalesOrderManagerPort_address = "http://172.18.206.134:9083/PY920/SalesOrderManager";

    public java.lang.String getSalesOrderManagerPortAddress() {
        return SalesOrderManagerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SalesOrderManagerPortWSDDServiceName = "SalesOrderManagerPort";

    public java.lang.String getSalesOrderManagerPortWSDDServiceName() {
        return SalesOrderManagerPortWSDDServiceName;
    }

    public void setSalesOrderManagerPortWSDDServiceName(java.lang.String name) {
        SalesOrderManagerPortWSDDServiceName = name;
    }

    public JP420000.bssv.e1.oracle.SalesOrderManager getSalesOrderManagerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SalesOrderManagerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSalesOrderManagerPort(endpoint);
    }

    public JP420000.bssv.e1.oracle.SalesOrderManager getSalesOrderManagerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            JP420000.bssv.e1.oracle.SalesOrderManagerPortBindingStub _stub = new JP420000.bssv.e1.oracle.SalesOrderManagerPortBindingStub(portAddress, this);
            _stub.setPortName(getSalesOrderManagerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSalesOrderManagerPortEndpointAddress(java.lang.String address) {
        SalesOrderManagerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (JP420000.bssv.e1.oracle.SalesOrderManager.class.isAssignableFrom(serviceEndpointInterface)) {
                JP420000.bssv.e1.oracle.SalesOrderManagerPortBindingStub _stub = new JP420000.bssv.e1.oracle.SalesOrderManagerPortBindingStub(new java.net.URL(SalesOrderManagerPort_address), this);
                _stub.setPortName(getSalesOrderManagerPortWSDDServiceName());
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
        if ("SalesOrderManagerPort".equals(inputPortName)) {
            return getSalesOrderManagerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "SalesOrderManagerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://oracle.e1.bssv.JP420000/", "SalesOrderManagerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SalesOrderManagerPort".equals(portName)) {
            setSalesOrderManagerPortEndpointAddress(address);
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
