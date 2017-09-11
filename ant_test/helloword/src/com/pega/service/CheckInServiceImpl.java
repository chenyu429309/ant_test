
package com.pega.service;

import javax.jws.WebService;
import com.pega.servcie.CheckIn;
import com.pega.servcie.CheckInResponse;
import com.pega.servcie.Hello;
import com.pega.servcie.HelloResponse;

@WebService(serviceName = "CheckInService", targetNamespace = "http://servcie.pega.com", endpointInterface = "com.pega.service.checkIn")
public class CheckInServiceImpl
    implements com.pega.service.checkIn
{


    public CheckInResponse checkIn(CheckIn checkIn) {
        throw new UnsupportedOperationException();
    }

    public HelloResponse hello(Hello hello) {
        throw new UnsupportedOperationException();
    }

}
