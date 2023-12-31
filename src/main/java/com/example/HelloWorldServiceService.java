
package com.example;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWorldServiceService", targetNamespace = "http://example.com/", wsdlLocation = "http://localhost:8080/jaxws-service-1.0-SNAPSHOT/HelloWorldService?wsdl")
public class HelloWorldServiceService
    extends Service
{

    private final static URL HELLOWORLDSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWORLDSERVICESERVICE_EXCEPTION;
    private final static QName HELLOWORLDSERVICESERVICE_QNAME = new QName("http://example.com/", "HelloWorldServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/jaxws-service-1.0-SNAPSHOT/HelloWorldService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWORLDSERVICESERVICE_WSDL_LOCATION = url;
        HELLOWORLDSERVICESERVICE_EXCEPTION = e;
    }

    public HelloWorldServiceService() {
        super(__getWsdlLocation(), HELLOWORLDSERVICESERVICE_QNAME);
    }

    public HelloWorldServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWORLDSERVICESERVICE_QNAME, features);
    }

    public HelloWorldServiceService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWORLDSERVICESERVICE_QNAME);
    }

    public HelloWorldServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWORLDSERVICESERVICE_QNAME, features);
    }

    public HelloWorldServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWorldService
     */
    @WebEndpoint(name = "HelloWorldServicePort")
    public HelloWorldService getHelloWorldServicePort() {
        return super.getPort(new QName("http://example.com/", "HelloWorldServicePort"), HelloWorldService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorldService
     */
    @WebEndpoint(name = "HelloWorldServicePort")
    public HelloWorldService getHelloWorldServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://example.com/", "HelloWorldServicePort"), HelloWorldService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWORLDSERVICESERVICE_EXCEPTION!= null) {
            throw HELLOWORLDSERVICESERVICE_EXCEPTION;
        }
        return HELLOWORLDSERVICESERVICE_WSDL_LOCATION;
    }

}
