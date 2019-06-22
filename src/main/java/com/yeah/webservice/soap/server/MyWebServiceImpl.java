package com.yeah.webservice.soap.server;

import javax.jws.WebService;


@WebService(endpointInterface = "com.yeah.webservice.soap.server.MyWebService")
public class MyWebServiceImpl implements MyWebService {
	@Override
	public String sayHello(String name) {
		return "sayHello " + name;
	}
	
	@Override
	public String save(String name, String pwd) {
		return "save success";
	}
}
