
package com.pega.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import com.pega.servcie.CheckIn;
import com.pega.servcie.CheckInResponse;
import com.pega.servcie.Hello;
import com.pega.servcie.HelloResponse;

@WebService(name = "checkIn", targetNamespace = "http://servcie.pega.com")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface checkIn {


    @WebMethod(operationName = "urn:checkIn", action = "")
    @WebResult(name = "checkInResponse", targetNamespace = "http://servcie.pega.com")
    public CheckInResponse checkIn(
        @WebParam(name = "checkIn", targetNamespace = "http://servcie.pega.com")
        CheckIn checkIn);

    @WebMethod(operationName = "urn:hello", action = "")
    @WebResult(name = "helloResponse", targetNamespace = "http://servcie.pega.com")
    public HelloResponse hello(
        @WebParam(name = "hello", targetNamespace = "http://servcie.pega.com")
        Hello hello);

}
