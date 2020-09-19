package com.heading.app.examples.encapsulation;

public class Person {
    private String phoneNumber;
    private String name;
    private String id;
    public static int personsCreated;

    public Person(){
        this.phoneNumber = "N/A";
        Person.personsCreated++;
    }

    public Person(String phoneNumber){
        this.phoneNumber = phoneNumber;
        Person.personsCreated++;
    }

    public Person(String phoneNumber, String name){
        this(phoneNumber);
        this.name = name;
    }

    public Person(String phoneNumber, String name, String id){
        this(phoneNumber, name);
        this.id = id;
    }

    public String givePhoneNumber(String reason) {
//        if("I'm your sister".equals(reason)) { //TODO: Explicar al final del curso
        boolean answer = reason.equals("I'm your sister") || id != null;
        return (answer) ? phoneNumber : "Sorry, I cannot give the number";
    }

    public void setPhoneNumber(int number){
        this.phoneNumber = Integer.toString(number);
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
