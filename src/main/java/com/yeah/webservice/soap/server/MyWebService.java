package com.yeah.webservice.soap.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface MyWebService {
	@WebMethod
	String sayHello(@WebParam(name = "name")String name);
	
	@WebMethod
	String save(String name, String pwd);
}
