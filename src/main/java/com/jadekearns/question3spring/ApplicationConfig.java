package com.jadekearns.question3spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean(name = "metricBMI")
    public MetricBMIInterface getService(){return new MetricInterfaceImplementation();}

    @Bean(name = "messageBMI")
    public MessageInterface getService2(){return new MetricInterfaceImplementationTwo();}
}
