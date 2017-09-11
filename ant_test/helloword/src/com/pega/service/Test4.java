package com.pega.service;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test4 {
	public static void main(String[] args) {
		request();
	}

	static void request() {
		try {
			URL url = new URL("http://172.28.136.19:8099/faeservice/service/checkIn");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			String sendString = getSendString();
			System.out.println(sendString);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("SoapAction", "http://servcie.pega.com/hello");
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

	static String getSendString() {
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>")
				.append("<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
				.append("<soap:Body>").append("<hello xmlns=\"http://servcie.pega.com\" />")
				.append("</soap:Body></soap:Envelope>");
		return sb.toString();
	}
}
