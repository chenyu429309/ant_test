
package com.uph.wsdl;

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

@SuppressWarnings({"rawtypes","unchecked", "unused"})
public class GET_MLB_UPHClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap<QName, Endpoint> endpoints = new HashMap<QName, Endpoint>();
    private Service service0;

    public GET_MLB_UPHClient() {
        create0();
        Endpoint GET_MLB_UPHPortEP = service0 .addEndpoint(new QName("urn:GET_MLB_UPH", "GET_MLB_UPHPort"), new QName("urn:GET_MLB_UPH", "GET_MLB_UPHBinding"), "http://172.28.129.195/mlb_uph_panther/wsdl/GET_MLB_UPH.php");
        endpoints.put(new QName("urn:GET_MLB_UPH", "GET_MLB_UPHPort"), GET_MLB_UPHPortEP);
        Endpoint GET_MLB_UPHPortLocalEndpointEP = service0 .addEndpoint(new QName("urn:GET_MLB_UPH", "GET_MLB_UPHPortLocalEndpoint"), new QName("urn:GET_MLB_UPH", "GET_MLB_UPHPortLocalBinding"), "xfire.local://GET_MLB_UPH");
        endpoints.put(new QName("urn:GET_MLB_UPH", "GET_MLB_UPHPortLocalEndpoint"), GET_MLB_UPHPortLocalEndpointEP);
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
        service0 = asf.create((com.uph.wsdl.GET_MLB_UPHPort.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("urn:GET_MLB_UPH", "GET_MLB_UPHPortLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("urn:GET_MLB_UPH", "GET_MLB_UPHBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public GET_MLB_UPHPort getGET_MLB_UPHPort() {
        return ((GET_MLB_UPHPort)(this).getEndpoint(new QName("urn:GET_MLB_UPH", "GET_MLB_UPHPort")));
    }

    public GET_MLB_UPHPort getGET_MLB_UPHPort(String url) {
        GET_MLB_UPHPort var = getGET_MLB_UPHPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public GET_MLB_UPHPort getGET_MLB_UPHPortLocalEndpoint() {
        return ((GET_MLB_UPHPort)(this).getEndpoint(new QName("urn:GET_MLB_UPH", "GET_MLB_UPHPortLocalEndpoint")));
    }

    public GET_MLB_UPHPort getGET_MLB_UPHPortLocalEndpoint(String url) {
        GET_MLB_UPHPort var = getGET_MLB_UPHPortLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

}
