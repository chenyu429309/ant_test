
package com.fae.service;

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

public class MLB_FAE_WSClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap<QName, Endpoint> endpoints = new HashMap<QName, Endpoint>();
    private Service service0;

    public MLB_FAE_WSClient() {
        create0();
        Endpoint MLB_FAE_WSPortLocalEndpointEP = service0 .addEndpoint(new QName("urn:MLB_FAE_WS", "MLB_FAE_WSPortLocalEndpoint"), new QName("urn:MLB_FAE_WS", "MLB_FAE_WSPortLocalBinding"), "xfire.local://MLB_FAE_WS");
        endpoints.put(new QName("urn:MLB_FAE_WS", "MLB_FAE_WSPortLocalEndpoint"), MLB_FAE_WSPortLocalEndpointEP);
        Endpoint MLB_FAE_WSPortEP = service0 .addEndpoint(new QName("urn:MLB_FAE_WS", "MLB_FAE_WSPort"), new QName("urn:MLB_FAE_WS", "MLB_FAE_WSBinding"), "http://172.28.129.44/mlb/panther/WS/MLB_FAE_WS.php");
        endpoints.put(new QName("urn:MLB_FAE_WS", "MLB_FAE_WSPort"), MLB_FAE_WSPortEP);
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

    @SuppressWarnings("unused")
	private void create0() {
        TransportManager tm = (org.codehaus.xfire.XFireFactory.newInstance().getXFire().getTransportManager());
        HashMap<String, Object> props = new HashMap<String, Object>();
        props.put("annotations.allow.interface", true);
        AnnotationServiceFactory asf = new AnnotationServiceFactory(new Jsr181WebAnnotations(), tm, new AegisBindingProvider(new XmlBeansTypeRegistry()));
        asf.setBindingCreationEnabled(false);
        service0 = asf.create((com.fae.service.MLB_FAE_WSPort.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("urn:MLB_FAE_WS", "MLB_FAE_WSBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("urn:MLB_FAE_WS", "MLB_FAE_WSPortLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public MLB_FAE_WSPort getMLB_FAE_WSPortLocalEndpoint() {
        return ((MLB_FAE_WSPort)(this).getEndpoint(new QName("urn:MLB_FAE_WS", "MLB_FAE_WSPortLocalEndpoint")));
    }

    public MLB_FAE_WSPort getMLB_FAE_WSPortLocalEndpoint(String url) {
        MLB_FAE_WSPort var = getMLB_FAE_WSPortLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public MLB_FAE_WSPort getMLB_FAE_WSPort() {
        return ((MLB_FAE_WSPort)(this).getEndpoint(new QName("urn:MLB_FAE_WS", "MLB_FAE_WSPort")));
    }

    public MLB_FAE_WSPort getMLB_FAE_WSPort(String url) {
        MLB_FAE_WSPort var = getMLB_FAE_WSPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
