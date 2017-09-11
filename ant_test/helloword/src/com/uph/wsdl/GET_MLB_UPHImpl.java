
package com.uph.wsdl;

import javax.jws.WebService;
import org.apache.xmlbeans.XmlObject;

@WebService(serviceName = "GET_MLB_UPH", targetNamespace = "urn:GET_MLB_UPH", endpointInterface = "com.uph.wsdl.GET_MLB_UPHPort")
public class GET_MLB_UPHImpl
    implements GET_MLB_UPHPort
{


    public XmlObject getUPH(String date) {
        throw new UnsupportedOperationException();
    }

}
