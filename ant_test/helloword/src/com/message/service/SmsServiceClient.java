
package com.message.service;

import java.net.MalformedURLException;
import java.util.Collection;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.codehaus.xfire.XFireRuntimeException;
import org.codehaus.xfire.aegis.AegisBindingProvider;
import org.codehaus.xfire.annotations.AnnotationServiceFactory;
import org.codehaus.xfire.annotations.jsr181.Jsr181WebAnnotations;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Endpoint;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.soap.AbstractSoapBinding;
import org.codehaus.xfire.transport.TransportManager;
import org.codehaus.xfire.xmlbeans.XmlBeansTypeRegistry;

public class SmsServiceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public SmsServiceClient() {
        create0();
        Endpoint SmsServiceHttpPortEP = service0 .addEndpoint(new QName("http://service.message.com", "SmsServiceHttpPort"), new QName("http://service.message.com", "SmsServiceHttpBinding"), "http://localhost:8080/message/services/SmsService");
        endpoints.put(new QName("http://service.message.com", "SmsServiceHttpPort"), SmsServiceHttpPortEP);
        Endpoint SmsServicePortTypeLocalEndpointEP = service0 .addEndpoint(new QName("http://service.message.com", "SmsServicePortTypeLocalEndpoint"), new QName("http://service.message.com", "SmsServicePortTypeLocalBinding"), "xfire.local://SmsService");
        endpoints.put(new QName("http://service.message.com", "SmsServicePortTypeLocalEndpoint"), SmsServicePortTypeLocalEndpointEP);
    }

    public Object getEndpoint(Endpoint endpoint) {
        try {
            return proxyFactory.create((endpoint).getBinding(), (endpoint).getUrl());
        } catch (MalformedURLException e) {
            throw new XFireRuntimeException("Invalid URL", e);
        }
    }

    public Object getEndpoint(QName name) {
        Endpoint endpoint = ((Endpoint) endpoints.get((name)));
        if ((endpoint) == null) {
            throw new IllegalStateException("No such endpoint!");
        }
        return getEndpoint((endpoint));
    }

    public Collection getEndpoints() {
        return endpoints.values();
    }

    private void create0() {
        TransportManager tm = (org.codehaus.xfire.XFireFactory.newInstance().getXFire().getTransportManager());
        HashMap props = new HashMap();
        props.put("annotations.allow.interface", true);
        AnnotationServiceFactory asf = new AnnotationServiceFactory(new Jsr181WebAnnotations(), tm, new AegisBindingProvider(new XmlBeansTypeRegistry()));
        asf.setBindingCreationEnabled(false);
        service0 = asf.create((com.message.service.SmsServicePortType.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://service.message.com", "SmsServiceHttpBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://service.message.com", "SmsServicePortTypeLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public SmsServicePortType getSmsServiceHttpPort() {
        return ((SmsServicePortType)(this).getEndpoint(new QName("http://service.message.com", "SmsServiceHttpPort")));
    }

    public SmsServicePortType getSmsServiceHttpPort(String url) {
        SmsServicePortType var = getSmsServiceHttpPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public SmsServicePortType getSmsServicePortTypeLocalEndpoint() {
        return ((SmsServicePortType)(this).getEndpoint(new QName("http://service.message.com", "SmsServicePortTypeLocalEndpoint")));
    }

    public SmsServicePortType getSmsServicePortTypeLocalEndpoint(String url) {
        SmsServicePortType var = getSmsServicePortTypeLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
