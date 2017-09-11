package com.pega.service;

import com.pega.servcie.Hello;
import com.pega.servcie.HelloResponse;

public class Test {
	public static void main(String[] args) {
		CheckInServiceClient client = new CheckInServiceClient();
		checkIn chk = client.getCheckInPort();
		HelloResponse response = chk.hello(new Hello());
		System.out.println(response.getResult());
	}
}