
package com.uph.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import org.apache.xmlbeans.XmlObject;

@WebService(name = "GET_MLB_UPHPort", targetNamespace = "urn:GET_MLB_UPH")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GET_MLB_UPHPort {


    @WebMethod(operationName = "getUPH", action = "urn:GET_MLB_UPH#GET_MLB_UPH#getUPH")
    @WebResult(name = "getUPH", targetNamespace = "urn:GET_MLB_UPH")
    public XmlObject getUPH(
        @WebParam(name = "date", targetNamespace = "urn:GET_MLB_UPH")
        String date);

}
