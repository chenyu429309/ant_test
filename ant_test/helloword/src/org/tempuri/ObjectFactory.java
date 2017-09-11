
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _String_QNAME = new QName("http://tempuri.org/", "string");
    private final static QName _Int_QNAME = new QName("http://tempuri.org/", "int");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMessageSetTime }
     * 
     */
    public SendMessageSetTime createSendMessageSetTime() {
        return new SendMessageSetTime();
    }

    /**
     * Create an instance of {@link SendResponse }
     * 
     */
    public SendResponse createSendResponse() {
        return new SendResponse();
    }

    /**
     * Create an instance of {@link AssistantSendMessageIntime }
     * 
     */
    public AssistantSendMessageIntime createAssistantSendMessageIntime() {
        return new AssistantSendMessageIntime();
    }

    /**
     * Create an instance of {@link SendMLB }
     * 
     */
    public SendMLB createSendMLB() {
        return new SendMLB();
    }

    /**
     * Create an instance of {@link SendMessageIntimeResponse }
     * 
     */
    public SendMessageIntimeResponse createSendMessageIntimeResponse() {
        return new SendMessageIntimeResponse();
    }

    /**
     * Create an instance of {@link PESend }
     * 
     */
    public PESend createPESend() {
        return new PESend();
    }

    /**
     * Create an instance of {@link SendMessageDeptResponse }
     * 
     */
    public SendMessageDeptResponse createSendMessageDeptResponse() {
        return new SendMessageDeptResponse();
    }

    /**
     * Create an instance of {@link SmsLog }
     * 
     */
    public SmsLog createSmsLog() {
        return new SmsLog();
    }

    /**
     * Create an instance of {@link SendMLBResponse }
     * 
     */
    public SendMLBResponse createSendMLBResponse() {
        return new SendMLBResponse();
    }

    /**
     * Create an instance of {@link SendSZ }
     * 
     */
    public SendSZ createSendSZ() {
        return new SendSZ();
    }

    /**
     * Create an instance of {@link AssistantSendMessageIntimeResponse }
     * 
     */
    public AssistantSendMessageIntimeResponse createAssistantSendMessageIntimeResponse() {
        return new AssistantSendMessageIntimeResponse();
    }

    /**
     * Create an instance of {@link SendMessageIntime }
     * 
     */
    public SendMessageIntime createSendMessageIntime() {
        return new SendMessageIntime();
    }

    /**
     * Create an instance of {@link Send }
     * 
     */
    public Send createSend() {
        return new Send();
    }

    /**
     * Create an instance of {@link PESendResponse }
     * 
     */
    public PESendResponse createPESendResponse() {
        return new PESendResponse();
    }

    /**
     * Create an instance of {@link MSendResponse }
     * 
     */
    public MSendResponse createMSendResponse() {
        return new MSendResponse();
    }

    /**
     * Create an instance of {@link SendMessageDept }
     * 
     */
    public SendMessageDept createSendMessageDept() {
        return new SendMessageDept();
    }

    /**
     * Create an instance of {@link SendSZResponse }
     * 
     */
    public SendSZResponse createSendSZResponse() {
        return new SendSZResponse();
    }

    /**
     * Create an instance of {@link SmsLogResponse }
     * 
     */
    public SmsLogResponse createSmsLogResponse() {
        return new SmsLogResponse();
    }

    /**
     * Create an instance of {@link MSend }
     * 
     */
    public MSend createMSend() {
        return new MSend();
    }

    /**
     * Create an instance of {@link SendMessageSetTimeResponse }
     * 
     */
    public SendMessageSetTimeResponse createSendMessageSetTimeResponse() {
        return new SendMessageSetTimeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

}
