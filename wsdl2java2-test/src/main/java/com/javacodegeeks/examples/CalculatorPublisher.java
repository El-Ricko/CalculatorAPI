//package com.javacodegeeks.examples;
//
//import javax.xml.ws.Endpoint;
//
//import org.springframework.stereotype.Component;
//
//import com.javacodegeeks.examples.jaxws.CalculatorI;
//import com.javacodegeeks.examples.jaxws.CalculatorImplService;
//
//@Component
//public class CalculatorPublisher implements CalculatorI {
//	
//	private int result=0;
//	
//	public int getResult() {
//		return result;
//	}
//
//	public void setResult(int result) {
//		this.result = result;
//	}
//	
//	public void endpoint() {		
//		Endpoint ep = Endpoint.create(new CalculatorImplService());
//		ep.publish("http://127.0.0.1:8080/wsdl2java/test");
//	}
//	
//	@Override
//	public int divide(int arg0, int arg1) {
//		// TODO Auto-generated method stub
//		result = arg0/arg1;
//		return result;
//	}
//
//	@Override
//	public int add(int arg0, int arg1) {
//		// TODO Auto-generated method stub
//		result = arg0+arg1;
//		return result;
//	}
//
//	@Override
//	public int subtract(int arg0, int arg1) {
//		// TODO Auto-generated method stub
//		result = arg0-arg1;
//		return result;
//	}
//
//	@Override
//	public int multiply(int arg0, int arg1) {
//		// TODO Auto-generated method stub
//		result = arg0*arg1;
//		return result;
//	}	
//}
