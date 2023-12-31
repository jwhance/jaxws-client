
package com.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorldService", targetNamespace = "http://example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorldService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://example.com/", className = "com.example.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://example.com/", className = "com.example.SayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDateTime", targetNamespace = "http://example.com/", className = "com.example.GetDateTime")
    @ResponseWrapper(localName = "getDateTimeResponse", targetNamespace = "http://example.com/", className = "com.example.GetDateTimeResponse")
    public String getDateTime();

}
