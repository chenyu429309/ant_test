
package com.fae.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "MLB_FAE_WSPort", targetNamespace = "urn:MLB_FAE_WS")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MLB_FAE_WSPort {


    @WebMethod(operationName = "RENEW_FAE_AREA", action = "urn:MLB_FAE_WS#MLB_FAE_WS#RENEW_FAE_AREA")
    @WebResult(name = "RENEW_FAE_AREA", targetNamespace = "urn:MLB_FAE_WS")
    public String rENEW_FAE_AREA(
        @WebParam(name = "sn", targetNamespace = "urn:MLB_FAE_WS")
        String sn);

    @WebMethod(operationName = "REQUEST_FAE_INFO", action = "urn:MLB_FAE_WS#MLB_FAE_WS#REQUEST_FAE_INFO")
    @WebResult(name = "REQUEST_FAE_INFO", targetNamespace = "urn:MLB_FAE_WS")
    public String rEQUEST_FAE_INFO(
        @WebParam(name = "sn", targetNamespace = "urn:MLB_FAE_WS")
        String sn);

    @WebMethod(operationName = "HelloWorld", action = "urn:MLB_FAE_WS#MLB_FAE_WS#HelloWorld")
    @WebResult(name = "HelloWorld", targetNamespace = "urn:MLB_FAE_WS")
    public String helloWorld();

}
