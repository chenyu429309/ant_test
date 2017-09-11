
package com.kirin.service;

import javax.jws.WebService;

import org.tempuri.HelloWorldResponse;
import org.tempuri.MLBUPHREPORT;
import org.tempuri.MLBUPHREPORTResponse;

@WebService(serviceName = "Service1", targetNamespace = "http://tempuri.org/", endpointInterface = "com.kirin.service.Service1Soap")
public class Service1Impl implements Service1Soap {

	public MLBUPHREPORTResponse mLB_UPH_REPORT(MLBUPHREPORT MLB_UPH_REPORT) {
		throw new UnsupportedOperationException();
	}

	public HelloWorldResponse helloWorld(org.tempuri.HelloWorld HelloWorld) {
		throw new UnsupportedOperationException();
	}

}
