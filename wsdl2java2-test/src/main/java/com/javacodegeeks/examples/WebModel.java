package com.javacodegeeks.examples;

import java.io.Serializable;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@SuppressWarnings("serial")
@JacksonXmlRootElement

public class WebModel implements Serializable{
	
	private Integer arg0;
    
	private Integer arg1;
    
    public WebModel(Integer arg0, Integer arg1) {
		this.arg0 = arg0;
		this.arg1 = arg1;
	}
    
	public Integer getArg0() {
		return arg0;
	}
	public void setArg0(Integer arg0) {
		this.arg0 = arg0;
	}
	
	public Integer getArg1() {
		return arg1;
	}
	public void setArg1(Integer arg1) {
		this.arg1 = arg1;
	}
    
	
	@Override
	public String toString() {
		return "WebModel [arg0=" + arg0 + ", arg1=" + arg1 + "]";
	}
	
}
