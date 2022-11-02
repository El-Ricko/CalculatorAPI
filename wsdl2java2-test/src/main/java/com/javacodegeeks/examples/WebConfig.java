package com.javacodegeeks.examples;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.javacodegeeks.examples.jaxws.CalculatorI;


@Configuration
public class WebConfig {
    @Value("${calculator.client.url}")
    private String address;

    @Bean(name = "calculatorI")
    public CalculatorI calculatorI() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(CalculatorI.class);
        jaxWsProxyFactoryBean.setAddress(address);
        CalculatorI calculatorI = (CalculatorI) jaxWsProxyFactoryBean.create();
        Client client = ClientProxy.getClient(calculatorI);

        return calculatorI;
    }

}

