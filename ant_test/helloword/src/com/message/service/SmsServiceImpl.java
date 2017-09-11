
package com.message.service;

import javax.jws.WebService;

@WebService(serviceName = "SmsService", targetNamespace = "http://service.message.com", endpointInterface = "com.message.service.SmsServicePortType")
public class SmsServiceImpl
    implements SmsServicePortType
{


    public Boolean sendMessage(String mobile, String content, String loginId) {
        throw new UnsupportedOperationException();
    }

}
