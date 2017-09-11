
package com.pega.sms.service;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

@WebService(serviceName = "Service1", targetNamespace = "http://tempuri.org/", endpointInterface = "com.pega.sms.service.Service1Soap")
public class Service1Impl
    implements Service1Soap
{


    public int send(String MNumber, String Content, String DeptID) {
        throw new UnsupportedOperationException();
    }

    public int sendMessageIntime(String Mobiles, String Content, String loginid) {
        throw new UnsupportedOperationException();
    }

    public int sendMessageDept(String MNumber, String Content, String deptid) {
        throw new UnsupportedOperationException();
    }

    public int assistantSendMessageIntime(String Mobiles, String Content, String loginid) {
        throw new UnsupportedOperationException();
    }

    public String sms_Log(String workid, String deptid, int Mcount, XMLGregorianCalendar SendDate) {
        throw new UnsupportedOperationException();
    }

    public int mSend(String MNumber, String Content, String DeptID) {
        throw new UnsupportedOperationException();
    }

    public int send_SZ(String MNumber, String Content, String DeptID) {
        throw new UnsupportedOperationException();
    }

    public int sendMessageSetTime(String Mobiles, String Content, String SendTime, String loginid) {
        throw new UnsupportedOperationException();
    }

    public int send_MLB(String MNumber, String Content) {
        throw new UnsupportedOperationException();
    }

    public int pESend(String MNumber, String Content) {
        throw new UnsupportedOperationException();
    }

}
