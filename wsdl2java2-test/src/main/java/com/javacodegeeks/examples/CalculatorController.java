package com.javacodegeeks.examples;

import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/wsdl2java")
@RestController
public class CalculatorController {

	//private CalculatorPublisher calculatorPublisher;
	private CalculatorService calculatorService;

	public CalculatorController(/*CalculatorPublisher calculatorPublisher,*/ CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
		//this.calculatorPublisher = calculatorPublisher;
	}
	
	/*@PostMapping(value="/test", consumes = MediaType.APPLICATION_XML_VALUE,  produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public Integer test(@RequestBody WebModel webModel) {
		System.out.println(webModel);
		return 3;
	}*/
	
	@PostMapping(value="/add", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public Integer add(@RequestBody WebModel webModel) {
		//return calculatorPublisher.add(webModel.getArg0(), webModel.getArg1());
		return calculatorService.add(webModel);
	}
	
	@PostMapping(value="/subtract", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public Integer subtract(@RequestBody WebModel webModel) {
		//return calculatorPublisher.subtract(webModel.getArg0(), webModel.getArg1());
		return calculatorService.subtract(webModel);
	}
	
	@PostMapping(value="/multiply", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public Integer multiply(@RequestBody WebModel webModel) {
		//return calculatorPublisher.multiply(webModel.getArg0(), webModel.getArg1());
		return calculatorService.multiply(webModel);
	}
	
	@PostMapping(value="/divide", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public Integer divide(@RequestBody WebModel webModel) {
		//return calculatorPublisher.divide(webModel.getArg0(), webModel.getArg1());
		return calculatorService.divide(webModel);
	}
}