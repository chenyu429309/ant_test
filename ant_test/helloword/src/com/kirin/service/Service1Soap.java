
package com.kirin.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.tempuri.HelloWorldResponse;
import org.tempuri.MLBUPHREPORT;
import org.tempuri.MLBUPHREPORTResponse;

@WebService(name = "Service1Soap", targetNamespace = "http://tempuri.org/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Service1Soap {


    @WebMethod(operationName = "MLB_UPH_REPORT", action = "http://tempuri.org/MLB_UPH_REPORT")
    @WebResult(name = "MLB_UPH_REPORTResponse", targetNamespace = "http://tempuri.org/")
    public MLBUPHREPORTResponse mLB_UPH_REPORT(
        @WebParam(name = "MLB_UPH_REPORT", targetNamespace = "http://tempuri.org/")
        MLBUPHREPORT MLB_UPH_REPORT);

    @WebMethod(operationName = "HelloWorld", action = "http://tempuri.org/HelloWorld")
    @WebResult(name = "HelloWorldResponse", targetNamespace = "http://tempuri.org/")
    public HelloWorldResponse helloWorld(
        @WebParam(name = "HelloWorld", targetNamespace = "http://tempuri.org/")
        org.tempuri.HelloWorld HelloWorld);

}
