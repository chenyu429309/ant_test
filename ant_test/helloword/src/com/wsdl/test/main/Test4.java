package com.wsdl.test.main;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test4 {
	public static void main(String[] args) {
		request("2016/6/1 08:00:00", "2016/6/1 15:00:00");
	}

	static void request(String s, String e) {
		try {
			URL url = new URL("http://sh-sftest-01/KIRIN_MLB_WS/KIRIN_MLB_WS.asmx");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			String sendString = getString(s, e);
			
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
//			conn.setRequestProperty("Content-Type", "application/soap+xml; charset=utf-8");
			conn.setRequestProperty("SoapAction", "http://tempuri.org/MLB_UPH_REPORT");
			conn.setRequestProperty("Content-Length", String.valueOf(sendString.getBytes().length));
			
			conn.setDoOutput(true);
			conn.setDoInput(true);

			OutputStream out = conn.getOutputStream();
			out.write(sendString.getBytes());
			out.close();
			
			InputStream in = conn.getInputStream();
			byte[] buff = new byte[in.available()];
			in.read(buff);
			String result = new String(buff);
			System.out.println(result);
			in.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	static String getString(String s, String e) {
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>")
				.append("<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">")
				.append("<soap12:Body>").append("<MLB_UPH_REPORT xmlns=\"http://tempuri.org/\">").append("<sdate>")
				.append(s).append("</sdate>").append("<edate>").append(e).append("</edate>").append("</MLB_UPH_REPORT>")
				.append("</soap12:Body>").append("</soap12:Envelope>");

		return sb.toString();
	}
}
