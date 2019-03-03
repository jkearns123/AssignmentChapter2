package com.jadekearns.question2interface;

import java.text.DecimalFormat;

public class MetricInterfaceImplementation implements MetricBMIInterface, MessageInterface{


    @Override
    public double metricValues(double weight, double height) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(weight / (height*height)));
    }

    @Override
    public String bmiMessage(String warning, String reason) {
        return warning + " " + reason;
    }
}
