# webservice
webservice项目实践，包括restful、SOAP及其相关协议

## SOAP用法
soap.server包包含了SOAP服务端的实现，运行SoapServerMain.java中的main方法即可启动服务端，端口1234。

## SOAP客户端
soap.client中的代码使用 wsimport 通过 WSDL文件生成，命令：
````
wsimport -keep -p com.yeah.webservice.soap.client http://localhost:1234/webService/webservicetest?wsdl
````
```SoapClientMain.java```类通过反射的方式启动客户端，调用服务端提供的服务。
