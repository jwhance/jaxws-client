package com.example.jaxwsclient;

import java.math.BigDecimal;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceRef;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;
import com.example.HelloWorldService;
import com.example.HelloWorldServiceService;


// wsimport -s . https://www.dataaccess.com/webservicesserver/NumberConversion.wso?WSDL

public class JAXWSClient {
    public static void main(String[] args) throws Exception {
        String wsdlUrl = "http://localhost:8080/jaxws-service-1.0-SNAPSHOT/HelloWorldService?wsdl";
        QName serviceName = new QName("http://example.com/", "HelloWorldServiceService");
        Service service = Service.create(new URL(wsdlUrl), serviceName);

        // Create a port for the service
        HelloWorldService port = service.getPort(HelloWorldService.class);

        // Call the web service methods here
        // Example: String result = port.someMethod("parameterValue");
        // Process the result as needed
        String result = port.getDateTime();
        System.out.println(result);

        String anotherWsdlUrl = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso?WSDL";
        QName anotherServiceName = new QName("http://www.dataaccess.com/webservicesserver/", "NumberConversion");
        Service anotherService = Service.create(new URL(anotherWsdlUrl), anotherServiceName);
        NumberConversionSoapType anotherPort = anotherService.getPort(NumberConversionSoapType.class);
        String anotherResult = anotherPort.numberToDollars(new BigDecimal("6161234.05"));
        System.out.println(anotherResult);


    }
}

