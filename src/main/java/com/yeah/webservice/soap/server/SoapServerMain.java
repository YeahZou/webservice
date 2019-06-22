package com.yeah.webservice.soap.server;

import javax.xml.ws.Endpoint;


public class SoapServerMain {
	
	public static void main(String[] args) {
		String url = "http://localhost:1234/webService/webservicetest";
		Endpoint.publish(url, new MyWebServiceImpl());
		
		System.out.println("publish successful");
	}
}
