package com.jadekearns.question3spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class CalculateBMI {


    public static void main(String[] args) {

        double userWeight = 0.0;
        double userHeight = 0.0;
        double bmiResult;
        boolean numeric = true;

        Scanner myScanner = new Scanner(System.in);


        try {

            System.out.println("Please Enter your weight in Kilograms(km) eg. 75.00");
            userWeight = Double.parseDouble(myScanner.nextLine());

            System.out.println("Please Enter your height in Meters(m) eg. 1.9");
            userHeight = Double.parseDouble(myScanner.nextLine());

        }catch(NumberFormatException e){
            numeric = false;
        }

        if (numeric) {

            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
            MetricBMIInterface metricBMIInterface = (MetricBMIInterface) applicationContext.getBean("metricBMI");
            bmiResult = metricBMIInterface.metricValues(userWeight, userHeight);


            String messageReason;
            MessageInterface messageInterface = (MessageInterface) applicationContext.getBean("messageBMI");

            if (bmiResult < 25 && bmiResult > 20) {

                messageReason = messageInterface.bmiMessage("Considered a Healthy Weight Range -", "Within a BMI of 20 - 25");
            } else if (bmiResult > 25) {

                messageReason = messageInterface.bmiMessage("Health At Risk -", "Weight is more than it ideally should be");
            } else {

                messageReason = messageInterface.bmiMessage("Health At Risk -", " Weight is less than it ideally should be");
            }

            System.out.println("BMI: " + bmiResult + " " + messageReason);
        }else{
            System.out.println("Please use double");
        }



    }
}
