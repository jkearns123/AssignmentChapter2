package com.jadekearns.question1collections;

import java.util.*;

/**
 * Question 1
 * Create an application that will make use of Collection, List, Set and Map.
 */
public class Question1
{
    public static void main( String[] args )
    {
        //creating objects of Question1model

        //Question1Model student4 = new Question1Model(215006097,"Sakeena","Francis");

        Question1Model student1 = new Question1Model(205074553,"Jade","Kearns");
        Question1Model student2 = new Question1Model(213016567,"Morne","O’Connor");
        Question1Model student3 = new Question1Model(197015476,"Adam","Wesson");
        Question1Model student4 = new Question1Model(205074553,"Jade","Kearns");
        Question1Model student5 = new Question1Model(211137162,"Megan","Jacobs,");

        //Create Linked HashMap to Store Strings
        Map<String, Question1Model> myMap = new LinkedHashMap<>();

        myMap.put(String.valueOf(student1.getStudentNumber()),student1);
        myMap.put(String.valueOf(student2.getStudentNumber()),student2);
        myMap.put(String.valueOf(student3.getStudentNumber()),student3);
        myMap.put(String.valueOf(student4.getStudentNumber()),student4);
        myMap.put(String.valueOf(student5.getStudentNumber()),student5);



        //keys(Strings) in a map are unique and values(Integers) dont have to be unique at all, unique keys will not be repeated
        System.out.println("Make Use of Map (Linked Map:");
        for(String key:myMap.keySet()){
            System.out.println(key + ": " + myMap.get(key));
        }

        //Create HashSet and does not retain an order
        Set<Question1Model> mySet = new HashSet<>();

        mySet.add(student1);
        mySet.add(student2);
        mySet.add(student3);
        mySet.add(student4);
        mySet.add(student5);

        //adding a duplicate object will doing nothing as it will only print out unique objects
        mySet.add(student2);

        System.out.println("Make Use of Set:");


        for(Question1Model qm : mySet){
            System.out.println(qm);
        }

        //Create List (Array List)

        List<Question1Model> myList = new ArrayList<>();

        myList.add(student1);
        myList.add(student2);
        myList.add(student3);
        myList.add(student4);
        myList.add(student5);
        myList.add(student4);

        System.out.println("Make Use of List:");
        for(Question1Model lqm:myList){
            System.out.println(lqm);
        }



    }
}
