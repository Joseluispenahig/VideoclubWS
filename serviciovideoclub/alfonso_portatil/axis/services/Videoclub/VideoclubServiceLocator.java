/**
 * VideoclubServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package alfonso_portatil.axis.services.Videoclub;

public class VideoclubServiceLocator extends org.apache.axis.client.Service implements alfonso_portatil.axis.services.Videoclub.VideoclubService {

    public VideoclubServiceLocator() {
    }


    public VideoclubServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VideoclubServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Videoclub
    private java.lang.String Videoclub_address = "http://alfonso-portatil:8888/axis/services/Videoclub";

    public java.lang.String getVideoclubAddress() {
        return Videoclub_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VideoclubWSDDServiceName = "Videoclub";

    public java.lang.String getVideoclubWSDDServiceName() {
        return VideoclubWSDDServiceName;
    }

    public void setVideoclubWSDDServiceName(java.lang.String name) {
        VideoclubWSDDServiceName = name;
    }

    public alfonso_portatil.axis.services.Videoclub.Videoclub getVideoclub() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Videoclub_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVideoclub(endpoint);
    }

    public alfonso_portatil.axis.services.Videoclub.Videoclub getVideoclub(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            alfonso_portatil.axis.services.Videoclub.VideoclubSoapBindingStub _stub = new alfonso_portatil.axis.services.Videoclub.VideoclubSoapBindingStub(portAddress, this);
            _stub.setPortName(getVideoclubWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVideoclubEndpointAddress(java.lang.String address) {
        Videoclub_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (alfonso_portatil.axis.services.Videoclub.Videoclub.class.isAssignableFrom(serviceEndpointInterface)) {
                alfonso_portatil.axis.services.Videoclub.VideoclubSoapBindingStub _stub = new alfonso_portatil.axis.services.Videoclub.VideoclubSoapBindingStub(new java.net.URL(Videoclub_address), this);
                _stub.setPortName(getVideoclubWSDDServiceName());
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
        if ("Videoclub".equals(inputPortName)) {
            return getVideoclub();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://alfonso-portatil:8888/axis/services/Videoclub", "VideoclubService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://alfonso-portatil:8888/axis/services/Videoclub", "Videoclub"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Videoclub".equals(portName)) {
            setVideoclubEndpointAddress(address);
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
