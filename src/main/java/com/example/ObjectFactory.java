
package com.example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHelloResponse_QNAME = new QName("http://example.com/", "sayHelloResponse");
    private final static QName _SayHello_QNAME = new QName("http://example.com/", "sayHello");
    private final static QName _GetDateTimeResponse_QNAME = new QName("http://example.com/", "getDateTimeResponse");
    private final static QName _GetDateTime_QNAME = new QName("http://example.com/", "getDateTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link GetDateTime }
     * 
     */
    public GetDateTime createGetDateTime() {
        return new GetDateTime();
    }

    /**
     * Create an instance of {@link GetDateTimeResponse }
     * 
     */
    public GetDateTimeResponse createGetDateTimeResponse() {
        return new GetDateTimeResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "getDateTimeResponse")
    public JAXBElement<GetDateTimeResponse> createGetDateTimeResponse(GetDateTimeResponse value) {
        return new JAXBElement<GetDateTimeResponse>(_GetDateTimeResponse_QNAME, GetDateTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "getDateTime")
    public JAXBElement<GetDateTime> createGetDateTime(GetDateTime value) {
        return new JAXBElement<GetDateTime>(_GetDateTime_QNAME, GetDateTime.class, null, value);
    }

}
