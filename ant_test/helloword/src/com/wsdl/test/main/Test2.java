package com.wsdl.test.main;


import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.uph.pojo.UphObject;
import com.uph.wsdl.GET_MLB_UPHClient;
import com.uph.wsdl.GET_MLB_UPHPort;

public class Test2 {
	public static void main(String[] args) throws Exception {
//		Service serviceModel = new ObjectServiceFactory().create(Service1.class);
//		Service1 hello = (Service1) new XFireProxyFactory().create(serviceModel, "http://psh-ap-16/Mas_WebService/Service1.asmx");
//		int result = hello.SendMessage("18321901921", "Test", "Fandy_Chen");
//		System.out.println(result);
		
//		org.codehaus.xfire.gen.WsGenTask
		
		
//		Service1Client client = new Service1Client();
//		Service1Soap soap = client.getService1Soap();
//		int i = soap.sendMessage("18321901921", "Test", "Fandy_Chen");
//		System.out.println(i);
		
		List<UphObject> uphList=new ArrayList<UphObject>();
		GET_MLB_UPHClient uph = new GET_MLB_UPHClient();
		GET_MLB_UPHPort service = uph.getGET_MLB_UPHPort();
		XmlObject obj = service.getUPH("2016-02-20");
		if(obj.toString().contains("no data")){
			return;
		}
		Node node = obj.getDomNode();
		NodeList list = node.getChildNodes().item(0).getChildNodes();
		Class<UphObject> cls = UphObject.class;
		for(int i = 0; i < list.getLength(); i++){
			UphObject uphObj = new UphObject();
			Node n = list.item(i);
			NodeList nList = n.getChildNodes();
			for(int j = 0; j < nList.getLength(); j++){
				Node keyNode = nList.item(j).getFirstChild();
				Node valNode=nList.item(j).getLastChild();
				
				String key = keyNode.getFirstChild().getNodeValue().toLowerCase();
				String value = valNode.getFirstChild().getNodeValue();
				
				String setName = "set" + key.substring(0, 1).toUpperCase()+key.substring(1);
				Method method = cls.getMethod(setName, String.class);
				method.invoke(uphObj, value);
			}
			uphList.add(uphObj);
		}
		
		FileWriter out = new FileWriter(new File("D:\\Users\\Fandy_Chen\\Desktop\\data.txt"));
		out.write(uphList.toString());
		out.close();
		FileWriter out1 = new FileWriter(new File("D:\\Users\\Fandy_Chen\\Desktop\\da.xml"));
		out1.write(obj.toString());
		out1.close();
		
//		Service serviceModel = new ObjectServiceFactory().create(HelloWorld.class);
//		HelloWorld hello = (HelloWorld) new XFireProxyFactory().create(serviceModel, "http://localhost:8080/helloword/services/HelloWorldService");
//		String result = hello.sayHello("Fandy");
//		System.out.println(result);
	}
}
