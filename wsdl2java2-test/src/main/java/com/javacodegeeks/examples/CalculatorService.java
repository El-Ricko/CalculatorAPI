package com.javacodegeeks.examples;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	private CalculatorClient calculatorClient;

	public CalculatorService(CalculatorClient calculatorClient) {
		this.calculatorClient = calculatorClient;
	}
	
	public Integer add(WebModel webModel) {
		Integer arg0=webModel.getArg0();
		Integer arg1=webModel.getArg1();
		return calculatorClient.add(arg0, arg1);		
	}
	
	public Integer subtract(WebModel webModel) {
		Integer arg0=webModel.getArg0();
		Integer arg1=webModel.getArg1();
		return calculatorClient.subtract(arg0, arg1);		
	}
	
	public Integer divide(WebModel webModel) {
		Integer arg0=webModel.getArg0();
		Integer arg1=webModel.getArg1();
		return calculatorClient.divide(arg0, arg1);		
	}
	
	public Integer multiply(WebModel webModel) {
		Integer arg0=webModel.getArg0();
		Integer arg1=webModel.getArg1();
		return calculatorClient.multiply(arg0, arg1);		
	}
}
