
package com.test.wsdl;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

@WebService(serviceName = "Service1", targetNamespace = "http://tempuri.org/", endpointInterface = "com.test.wsdl.Service1Soap")
public class Service1Impl
    implements Service1Soap
{


    public Integer send(String MNumber, String Content, String DeptID) {
        throw new UnsupportedOperationException();
    }

    public Integer sendMessageDept(String MNumber, String Content, String deptid) {
        throw new UnsupportedOperationException();
    }

    public String sms_Log(String workid, String deptid, Integer Mcount, XMLGregorianCalendar SendDate) {
        throw new UnsupportedOperationException();
    }

    public Integer mSend(String MNumber, String Content, String DeptID) {
        throw new UnsupportedOperationException();
    }

    public Integer sendMessage(String Mobiles, String Content, String loginid) {
        throw new UnsupportedOperationException();
    }

    public Integer send_SZ(String MNumber, String Content, String DeptID) {
        throw new UnsupportedOperationException();
    }

    public Integer sendMessageIMD(String Mobiles, String Content, String SendTime, String loginid) {
        throw new UnsupportedOperationException();
    }

    public Integer send_MLB(String MNumber, String Content) {
        throw new UnsupportedOperationException();
    }

    public Integer assistantSendMessage(String Mobiles, String Content, String loginid) {
        throw new UnsupportedOperationException();
    }

    public Integer pESend(String MNumber, String Content) {
        throw new UnsupportedOperationException();
    }

}
