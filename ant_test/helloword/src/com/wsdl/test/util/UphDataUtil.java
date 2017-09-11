package com.wsdl.test.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.uph.pojo.UphObject;
import com.uph.wsdl.GET_MLB_UPHClient;
import com.uph.wsdl.GET_MLB_UPHPort;

public class UphDataUtil {
	public List<UphObject> getDataFromService(String date) throws Exception{
		if(null == date){
			throw new NullPointerException("Param is null");
		}
		
		if(!date.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")){
			throw new Exception(date + "is not mathches yyyy-MM-dd");
		}

		List<UphObject> uphList=new ArrayList<UphObject>();
		GET_MLB_UPHClient uph = new GET_MLB_UPHClient();
		GET_MLB_UPHPort service = uph.getGET_MLB_UPHPort();
		XmlObject obj = service.getUPH(date);
		if(obj.toString().contains("no data")){
			return uphList;
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
				Method method;
				method = cls.getMethod(setName, String.class);
				method.invoke(uphObj, value);
			}
			uphList.add(uphObj);
		}
		return uphList;
	}
}
