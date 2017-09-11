package com.wsdl.test.main;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.xerces.dom.ElementNSImpl;
import org.tempuri.HelloWorld;
import org.tempuri.HelloWorldResponse;
import org.tempuri.MLBUPHREPORT;
import org.tempuri.MLBUPHREPORTResponse;
import org.tempuri.MLBUPHREPORTResponse.MLBUPHREPORTResult;
import org.tempuri.UPHData;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.kirin.service.Service1Client;
import com.kirin.service.Service1Soap;

public class Test5 {
	public static void main(String[] args) {
		Service1Client client = new Service1Client();
		Service1Soap soap = client.getService1Soap();
		MLBUPHREPORT rep = new MLBUPHREPORT();
		rep.setSdate("2016/06/01 08:00:00");
		rep.setEdate("2016/06/01 20:00:00");
		MLBUPHREPORTResponse repResp = soap.mLB_UPH_REPORT(rep);
		MLBUPHREPORTResult result =  repResp.getMLBUPHREPORTResult();
		List<Object> list = result.getAny();
		List<UPHData> resultList = new ArrayList<UPHData>();
		UPHData uph;
		for(Object obj : list){
			ElementNSImpl ele = (ElementNSImpl)obj;
			NodeList eleNodes = ele.getElementsByTagName("RETULT");
			if(null == eleNodes){
				continue;
			}
			for(int i = 0; i < eleNodes.getLength(); i++){
				Node resultNode = eleNodes.item(i);
				NodeList tableNodeList = resultNode.getChildNodes();
				for(int j = 0; j < tableNodeList.getLength(); j++){
					Node tableNode = tableNodeList.item(j);
					NodeList infoNodeList = tableNode.getChildNodes();
					uph = new UPHData();
					for(int x = 0; x < infoNodeList.getLength(); x++){
						Node infoNode = infoNodeList.item(x);
						
						String key = infoNode.getNodeName().toLowerCase();
						String value = infoNode.getFirstChild().getNodeValue();
						
						String setName = "set" + key.substring(0, 1).toUpperCase()+key.substring(1);
						Method method;
						try {
							method = UPHData.class.getMethod(setName, String.class);
							method.invoke(uph, value);
						} catch (Exception e) {
							e.printStackTrace();
						} 
					}
					resultList.add(uph);
				}
			}
		}
		System.out.println(resultList.toString());
	}
}
