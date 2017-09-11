
package com.message.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "SmsServicePortType", targetNamespace = "http://service.message.com")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface SmsServicePortType {


    @WebMethod(operationName = "sendMessage", action = "")
    @WebResult(name = "Result", targetNamespace = "http://service.message.com")
    public Boolean sendMessage(
        @WebParam(name = "mobile", targetNamespace = "http://service.message.com")
        String mobile,
        @WebParam(name = "content", targetNamespace = "http://service.message.com")
        String content,
        @WebParam(name = "loginId", targetNamespace = "http://service.message.com")
        String loginId);

}
