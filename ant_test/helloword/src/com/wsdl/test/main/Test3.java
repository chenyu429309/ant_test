package com.wsdl.test.main;

import java.util.List;

import com.uph.pojo.UphObject;
import com.wsdl.test.util.UphDataUtil;

public class Test3 {
	public static void main(String[] args) {
		UphDataUtil util = new UphDataUtil();
		try {
			List<UphObject> resultList = util.getDataFromService("2016-02-18");

			System.out.println(resultList.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
