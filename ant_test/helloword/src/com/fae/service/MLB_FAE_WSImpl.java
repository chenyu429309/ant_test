
package com.fae.service;

import javax.jws.WebService;

@WebService(serviceName = "MLB_FAE_WS", targetNamespace = "urn:MLB_FAE_WS", endpointInterface = "com.fae.service.MLB_FAE_WSPort")
public class MLB_FAE_WSImpl
    implements MLB_FAE_WSPort
{


    public String rENEW_FAE_AREA(String sn) {
        throw new UnsupportedOperationException();
    }

    public String rEQUEST_FAE_INFO(String sn) {
        throw new UnsupportedOperationException();
    }

    public String helloWorld() {
        throw new UnsupportedOperationException();
    }

}
