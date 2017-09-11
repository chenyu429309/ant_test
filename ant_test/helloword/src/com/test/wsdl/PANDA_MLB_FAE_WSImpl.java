
package com.test.wsdl;

import javax.jws.WebService;

@WebService(serviceName = "PANDA_MLB_FAE_WS", targetNamespace = "urn:PANDA_MLB_FAE_WS", endpointInterface = "com.test.wsdl.PANDA_MLB_FAE_WSPort")
public class PANDA_MLB_FAE_WSImpl
    implements PANDA_MLB_FAE_WSPort
{


    public String rEQUEST_FAE_INFO(String sn) {
        throw new UnsupportedOperationException();
    }

    public String helloWorld() {
        throw new UnsupportedOperationException();
    }

}
