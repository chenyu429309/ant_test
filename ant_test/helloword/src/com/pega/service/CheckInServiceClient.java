
package com.pega.service;

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

@SuppressWarnings("unused")
public class CheckInServiceClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap<QName, Endpoint> endpoints = new HashMap<QName, Endpoint>();
    private Service service0;

    public CheckInServiceClient() {
        create0();
        Endpoint checkInLocalEndpointEP = service0 .addEndpoint(new QName("http://servcie.pega.com", "checkInLocalEndpoint"), new QName("http://servcie.pega.com", "checkInLocalBinding"), "xfire.local://CheckInService");
        endpoints.put(new QName("http://servcie.pega.com", "checkInLocalEndpoint"), checkInLocalEndpointEP);
        Endpoint CheckInPortEP = service0 .addEndpoint(new QName("http://servcie.pega.com", "CheckInPort"), new QName("http://servcie.pega.com", "CheckInServiceSoapBinding"), "http://172.28.136.19:8099/faeservice/service/checkIn");
        endpoints.put(new QName("http://servcie.pega.com", "CheckInPort"), CheckInPortEP);
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

    public Collection<Endpoint> getEndpoints() {
        return endpoints.values();
    }

    private void create0() {
        TransportManager tm = (org.codehaus.xfire.XFireFactory.newInstance().getXFire().getTransportManager());
        HashMap<String, Boolean> props = new HashMap<String, Boolean>();
        props.put("annotations.allow.interface", true);
        AnnotationServiceFactory asf = new AnnotationServiceFactory(new Jsr181WebAnnotations(), tm, new AegisBindingProvider(new JaxbTypeRegistry()));
        asf.setBindingCreationEnabled(false);
        service0 = asf.create((com.pega.service.checkIn.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://servcie.pega.com", "CheckInServiceSoapBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
			AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://servcie.pega.com", "checkInLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public checkIn getcheckInLocalEndpoint() {
        return ((checkIn)(this).getEndpoint(new QName("http://servcie.pega.com", "checkInLocalEndpoint")));
    }

    public checkIn getcheckInLocalEndpoint(String url) {
        checkIn var = getcheckInLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public checkIn getCheckInPort() {
        return ((checkIn)(this).getEndpoint(new QName("http://servcie.pega.com", "CheckInPort")));
    }

    public checkIn getCheckInPort(String url) {
        checkIn var = getCheckInPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
