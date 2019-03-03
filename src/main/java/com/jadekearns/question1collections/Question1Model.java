package com.jadekearns.question1collections;

public class Question1Model {

    private int studentNumber;
    private String name;
    private String lastName;

    public Question1Model(int studentNumber, String name, String lastName) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Question1Model{" +
                "studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
