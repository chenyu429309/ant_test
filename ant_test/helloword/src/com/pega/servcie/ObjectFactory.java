
package com.pega.servcie;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pega.servcie package. 
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

    private final static QName _CheckIn_QNAME = new QName("http://servcie.pega.com", "checkIn");
    private final static QName _Hello_QNAME = new QName("http://servcie.pega.com", "hello");
    private final static QName _CheckInResponse_QNAME = new QName("http://servcie.pega.com", "checkInResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://servcie.pega.com", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pega.servcie
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CheckIn }
     * 
     */
    public CheckIn createCheckIn() {
        return new CheckIn();
    }

    /**
     * Create an instance of {@link CheckInResponse }
     * 
     */
    public CheckInResponse createCheckInResponse() {
        return new CheckInResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servcie.pega.com", name = "checkIn")
    public JAXBElement<CheckIn> createCheckIn(CheckIn value) {
        return new JAXBElement<CheckIn>(_CheckIn_QNAME, CheckIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servcie.pega.com", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckInResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servcie.pega.com", name = "checkInResponse")
    public JAXBElement<CheckInResponse> createCheckInResponse(CheckInResponse value) {
        return new JAXBElement<CheckInResponse>(_CheckInResponse_QNAME, CheckInResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servcie.pega.com", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
