
package com.pega.sms.service;

import java.net.MalformedURLException;
import java.util.Collection;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.codehaus.xfire.XFireRuntimeException;
import org.codehaus.xfire.aegis.AegisBindingProvider;
import org.codehaus.xfire.annotations.AnnotationServiceFactory;
import org.codehaus.xfire.annotations.jsr181.Jsr181WebAnnotations;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.jaxb2.JaxbTypeRegistry;
import org.codehaus.xfire.service.Endpoint;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.soap.AbstractSoapBinding;
import org.codehaus.xfire.transport.TransportManager;

public class Service1Client {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service2;

    public Service1Client() {
        create2();
        Endpoint Service1SoapLocalEndpointEP = service2 .addEndpoint(new QName("http://tempuri.org/", "Service1SoapLocalEndpoint"), new QName("http://tempuri.org/", "Service1SoapLocalBinding"), "xfire.local://Service1");
        endpoints.put(new QName("http://tempuri.org/", "Service1SoapLocalEndpoint"), Service1SoapLocalEndpointEP);
        Endpoint Service1SoapEP = service2 .addEndpoint(new QName("http://tempuri.org/", "Service1Soap"), new QName("http://tempuri.org/", "Service1Soap"), "http://psh-ap-16/Mas_WebService/Service1.asmx");
        endpoints.put(new QName("http://tempuri.org/", "Service1Soap"), Service1SoapEP);
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

    private void create2() {
        TransportManager tm = (org.codehaus.xfire.XFireFactory.newInstance().getXFire().getTransportManager());
        HashMap props = new HashMap();
        props.put("annotations.allow.interface", true);
        AnnotationServiceFactory asf = new AnnotationServiceFactory(new Jsr181WebAnnotations(), tm, new AegisBindingProvider(new JaxbTypeRegistry()));
        asf.setBindingCreationEnabled(false);
        service2 = asf.create((com.pega.sms.service.Service1Soap.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service2, new QName("http://tempuri.org/", "Service1Soap"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service2, new QName("http://tempuri.org/", "Service1SoapLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public Service1Soap getService1SoapLocalEndpoint() {
        return ((Service1Soap)(this).getEndpoint(new QName("http://tempuri.org/", "Service1SoapLocalEndpoint")));
    }

    public Service1Soap getService1SoapLocalEndpoint(String url) {
        Service1Soap var = getService1SoapLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public Service1Soap getService1Soap() {
        return ((Service1Soap)(this).getEndpoint(new QName("http://tempuri.org/", "Service1Soap")));
    }

    public Service1Soap getService1Soap(String url) {
        Service1Soap var = getService1Soap();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
