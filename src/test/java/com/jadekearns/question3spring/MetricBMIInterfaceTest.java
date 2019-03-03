package com.jadekearns.question3spring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MetricBMIInterfaceTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

    @Test
    public void metricValues(){
        MetricBMIInterface metricBMIInterface = (MetricBMIInterface) applicationContext.getBean("metricBMI");
        double bmiResult = metricBMIInterface.metricValues(75, 1.9);
        double myPi = 75 / (1.9*1.9);
        Assert.assertEquals(20.6,myPi,bmiResult);

    }

}