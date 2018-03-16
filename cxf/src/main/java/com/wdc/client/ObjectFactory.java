
package com.wdc.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wdc.client package. 
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

    private final static QName _Hello_QNAME = new QName("http://service.wdc.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://service.wdc.com/", "helloResponse");
    private final static QName _SendStudent_QNAME = new QName("http://service.wdc.com/", "sendStudent");
    private final static QName _SendStudentResponse_QNAME = new QName("http://service.wdc.com/", "sendStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wdc.client
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
     * Create an instance of {@link SendStudent }
     * 
     */
    public SendStudent createSendStudent() {
        return new SendStudent();
    }

    /**
     * Create an instance of {@link SendStudentResponse }
     * 
     */
    public SendStudentResponse createSendStudentResponse() {
        return new SendStudentResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wdc.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wdc.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wdc.com/", name = "sendStudent")
    public JAXBElement<SendStudent> createSendStudent(SendStudent value) {
        return new JAXBElement<SendStudent>(_SendStudent_QNAME, SendStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wdc.com/", name = "sendStudentResponse")
    public JAXBElement<SendStudentResponse> createSendStudentResponse(SendStudentResponse value) {
        return new JAXBElement<SendStudentResponse>(_SendStudentResponse_QNAME, SendStudentResponse.class, null, value);
    }

}
