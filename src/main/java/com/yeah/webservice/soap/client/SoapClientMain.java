package com.yeah.webservice.soap.client;

import java.lang.reflect.Method;

public class SoapClientMain {
	public static void main(String[] argv) {

/*		
		// 获取服务
		WebServiceImplService service = new WebServiceImplService();
		// 获取实现类
		WebServiceImpl impl = service.getPort(WebServiceImpl.class);
		// impl = service.getWebServiceImplPort()
		
		// 调用实现类的方法
		impl.sayHello("I come from wsimport tool ");
	*/	
		try {
			Class<?> service = Class.forName("com.yeah.webservice.soap.client.MyWebServiceImplService");
			Class<?> portInterface = Class.forName("com.yeah.webservice.soap.client.MyWebService");
			
			if (service == null) {
				System.err.println("service is null");
				return;
			}
			
			if (portInterface == null) {
				System.err.println("portInterface is null");
				return;
			}
			Object obj = service.newInstance();
			Method getPort = service.getMethod("getPort", Class.class);
			Object port = null;
			if (getPort != null) {
				port = getPort.invoke(obj, portInterface);
				if (port != null) {
					Method say = portInterface.getMethod("sayHello", String.class);
					Object res = say.invoke(port, "come from reflection result");
					System.out.println(res);
				}
			}
        } catch (Exception ex) {
        	System.err.println("ERROR: " + ex.getMessage());
        	ex.printStackTrace();
        }
	}
}
