package com.javacodegeeks.examples;

//import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.javacodegeeks.examples.jaxws.CalculatorI;

@Service
//@ComponentScan(basePackages="com.javacodegeeks.examples.jaxws")
public class CalculatorClient {

		private CalculatorI calculatorI;

		public CalculatorClient(CalculatorI calculatorI) {
			this.calculatorI = calculatorI;
		}
		
		public Integer add(Integer arg0, Integer arg1) {
			return calculatorI.add(arg0, arg1);
		}
		
		public Integer subtract(Integer arg0, Integer arg1) {
			return calculatorI.subtract(arg0, arg1);
		}
		
		public Integer divide(Integer arg0, Integer arg1) {
			return calculatorI.divide(arg0, arg1);
		}
		
		public Integer multiply(Integer arg0, Integer arg1) {
			return calculatorI.multiply(arg0, arg1);
		}
		
}
