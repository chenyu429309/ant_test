
package com.test.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.datatype.XMLGregorianCalendar;

@WebService(name = "Service1Soap", targetNamespace = "http://tempuri.org/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface Service1Soap {


    @WebMethod(operationName = "Send", action = "http://tempuri.org/Send")
    @WebResult(name = "SendResult", targetNamespace = "http://tempuri.org/")
    public Integer send(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "DeptID", targetNamespace = "http://tempuri.org/")
        String DeptID);

    @WebMethod(operationName = "SendMessageDept", action = "http://tempuri.org/SendMessageDept")
    @WebResult(name = "SendMessageDeptResult", targetNamespace = "http://tempuri.org/")
    public Integer sendMessageDept(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "deptid", targetNamespace = "http://tempuri.org/")
        String deptid);

    @WebMethod(operationName = "Sms_Log", action = "http://tempuri.org/Sms_Log")
    @WebResult(name = "Sms_LogResult", targetNamespace = "http://tempuri.org/")
    public String sms_Log(
        @WebParam(name = "workid", targetNamespace = "http://tempuri.org/")
        String workid,
        @WebParam(name = "deptid", targetNamespace = "http://tempuri.org/")
        String deptid,
        @WebParam(name = "Mcount", targetNamespace = "http://tempuri.org/")
        Integer Mcount,
        @WebParam(name = "SendDate", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar SendDate);

    @WebMethod(operationName = "MSend", action = "http://tempuri.org/MSend")
    @WebResult(name = "MSendResult", targetNamespace = "http://tempuri.org/")
    public Integer mSend(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "DeptID", targetNamespace = "http://tempuri.org/")
        String DeptID);

    @WebMethod(operationName = "SendMessage", action = "http://tempuri.org/SendMessage")
    @WebResult(name = "SendMessageResult", targetNamespace = "http://tempuri.org/")
    public Integer sendMessage(
        @WebParam(name = "Mobiles", targetNamespace = "http://tempuri.org/")
        String Mobiles,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "loginid", targetNamespace = "http://tempuri.org/")
        String loginid);

    @WebMethod(operationName = "Send_SZ", action = "http://tempuri.org/Send_SZ")
    @WebResult(name = "Send_SZResult", targetNamespace = "http://tempuri.org/")
    public Integer send_SZ(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "DeptID", targetNamespace = "http://tempuri.org/")
        String DeptID);

    @WebMethod(operationName = "SendMessageIMD", action = "http://tempuri.org/SendMessageIMD")
    @WebResult(name = "SendMessageIMDResult", targetNamespace = "http://tempuri.org/")
    public Integer sendMessageIMD(
        @WebParam(name = "Mobiles", targetNamespace = "http://tempuri.org/")
        String Mobiles,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "SendTime", targetNamespace = "http://tempuri.org/")
        String SendTime,
        @WebParam(name = "loginid", targetNamespace = "http://tempuri.org/")
        String loginid);

    @WebMethod(operationName = "Send_MLB", action = "http://tempuri.org/Send_MLB")
    @WebResult(name = "Send_MLBResult", targetNamespace = "http://tempuri.org/")
    public Integer send_MLB(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content);

    @WebMethod(operationName = "AssistantSendMessage", action = "http://tempuri.org/AssistantSendMessage")
    @WebResult(name = "AssistantSendMessageResult", targetNamespace = "http://tempuri.org/")
    public Integer assistantSendMessage(
        @WebParam(name = "Mobiles", targetNamespace = "http://tempuri.org/")
        String Mobiles,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "loginid", targetNamespace = "http://tempuri.org/")
        String loginid);

    @WebMethod(operationName = "PESend", action = "http://tempuri.org/PESend")
    @WebResult(name = "PESendResult", targetNamespace = "http://tempuri.org/")
    public Integer pESend(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content);

}
