
package com.pega.sms.service;

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
    public int send(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "DeptID", targetNamespace = "http://tempuri.org/")
        String DeptID);

    @WebMethod(operationName = "SendMessageIntime", action = "http://tempuri.org/SendMessageIntime")
    @WebResult(name = "SendMessageIntimeResult", targetNamespace = "http://tempuri.org/")
    public int sendMessageIntime(
        @WebParam(name = "Mobiles", targetNamespace = "http://tempuri.org/")
        String Mobiles,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "loginid", targetNamespace = "http://tempuri.org/")
        String loginid);

    @WebMethod(operationName = "SendMessageDept", action = "http://tempuri.org/SendMessageDept")
    @WebResult(name = "SendMessageDeptResult", targetNamespace = "http://tempuri.org/")
    public int sendMessageDept(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "deptid", targetNamespace = "http://tempuri.org/")
        String deptid);

    @WebMethod(operationName = "AssistantSendMessageIntime", action = "http://tempuri.org/AssistantSendMessageIntime")
    @WebResult(name = "AssistantSendMessageIntimeResult", targetNamespace = "http://tempuri.org/")
    public int assistantSendMessageIntime(
        @WebParam(name = "Mobiles", targetNamespace = "http://tempuri.org/")
        String Mobiles,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "loginid", targetNamespace = "http://tempuri.org/")
        String loginid);

    @WebMethod(operationName = "Sms_Log", action = "http://tempuri.org/Sms_Log")
    @WebResult(name = "Sms_LogResult", targetNamespace = "http://tempuri.org/")
    public String sms_Log(
        @WebParam(name = "workid", targetNamespace = "http://tempuri.org/")
        String workid,
        @WebParam(name = "deptid", targetNamespace = "http://tempuri.org/")
        String deptid,
        @WebParam(name = "Mcount", targetNamespace = "http://tempuri.org/")
        int Mcount,
        @WebParam(name = "SendDate", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar SendDate);

    @WebMethod(operationName = "MSend", action = "http://tempuri.org/MSend")
    @WebResult(name = "MSendResult", targetNamespace = "http://tempuri.org/")
    public int mSend(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "DeptID", targetNamespace = "http://tempuri.org/")
        String DeptID);

    @WebMethod(operationName = "Send_SZ", action = "http://tempuri.org/Send_SZ")
    @WebResult(name = "Send_SZResult", targetNamespace = "http://tempuri.org/")
    public int send_SZ(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content,
        @WebParam(name = "DeptID", targetNamespace = "http://tempuri.org/")
        String DeptID);

    @WebMethod(operationName = "SendMessageSetTime", action = "http://tempuri.org/SendMessageSetTime")
    @WebResult(name = "SendMessageSetTimeResult", targetNamespace = "http://tempuri.org/")
    public int sendMessageSetTime(
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
    public int send_MLB(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content);

    @WebMethod(operationName = "PESend", action = "http://tempuri.org/PESend")
    @WebResult(name = "PESendResult", targetNamespace = "http://tempuri.org/")
    public int pESend(
        @WebParam(name = "MNumber", targetNamespace = "http://tempuri.org/")
        String MNumber,
        @WebParam(name = "Content", targetNamespace = "http://tempuri.org/")
        String Content);

}
