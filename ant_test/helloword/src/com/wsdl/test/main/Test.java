package com.wsdl.test.main;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test {
	public static void main(String[] args) {
		try {
			String urlString = "http://localhost:8080/helloword/services/HelloWorldService";
			String soapActionString = "http://test.wsdl.com/sayHello";
			URL url = new URL(urlString);
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			
			String sendString = getSendString("Fandy");
			
			httpConn.setRequestProperty("Content-Length", String.valueOf(sendString.getBytes().length));
			httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
			httpConn.setRequestProperty("soapActionString", soapActionString);
			httpConn.setRequestMethod("POST");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);

			OutputStream out = httpConn.getOutputStream();
			out.write(sendString.getBytes());
			out.close();
			byte[] datas=readInputStream(httpConn.getInputStream());

			System.out.println(new String(datas));
//			return parse(datas);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static String getSendString(String name){
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>")
		.append("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
		.append("<soap:Body>").append("<sayHello xmlns=\"http://test.wsdl.com\">")
		.append("<in0>").append(name).append("</in0>")
		.append("</sayHello></soap:Body></soap:Envelope>");
		return sb.toString();
	}
	
	private static byte[] readInputStream(InputStream inStream) throws Exception{
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		while( (len = inStream.read(buffer)) !=-1 ){
			outStream.write(buffer, 0, len);
		}

		byte[] data = outStream.toByteArray();//网页的二进制数据
		outStream.close();
		inStream.close();

		return data;
	}
}
