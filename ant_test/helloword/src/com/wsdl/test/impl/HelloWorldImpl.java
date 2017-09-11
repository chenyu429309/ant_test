package com.wsdl.test.impl;

import java.io.File;

import com.wsdl.test.HelloWorld;

public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

	@Override
	public String upFile(File file) {
		return file.getName();
	}
}
