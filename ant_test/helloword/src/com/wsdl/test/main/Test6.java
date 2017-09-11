package com.wsdl.test.main;

import com.pega.sms.service.Service1Client;

public class Test6 {
	public static void main(String[] args) {
		Service1Client clicent = new Service1Client();
		int i = clicent.getService1Soap().sendMessageIntime("18321901921", "Test", "Fandy_Chen");
		System.out.println(i);
	}
}
