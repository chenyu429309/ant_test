
package com.test.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "PANDA_MLB_FAE_WSPort", targetNamespace = "urn:PANDA_MLB_FAE_WS")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PANDA_MLB_FAE_WSPort {


    @WebMethod(operationName = "REQUEST_FAE_INFO", action = "urn:PANDA_MLB_FAE_WS#PANDA_MLB_FAE_WS#REQUEST_FAE_INFO")
    @WebResult(name = "REQUEST_FAE_INFO", targetNamespace = "urn:PANDA_MLB_FAE_WS")
    public String rEQUEST_FAE_INFO(
        @WebParam(name = "sn", targetNamespace = "urn:PANDA_MLB_FAE_WS")
        String sn);

    @WebMethod(operationName = "HelloWorld", action = "urn:PANDA_MLB_FAE_WS#PANDA_MLB_FAE_WS#HelloWorld")
    @WebResult(name = "HelloWorld", targetNamespace = "urn:PANDA_MLB_FAE_WS")
    public String helloWorld();

}
