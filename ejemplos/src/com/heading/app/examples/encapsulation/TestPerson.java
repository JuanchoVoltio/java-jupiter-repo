package com.heading.app.examples.encapsulation;

public class TestPerson {

    public static void main (String[] args){
        Person testSubject1 = new Person();
        Person testSubject2 = new Person("3365236", "Juancho", "14545");
        Person testSubject3 = new Person();

        testSubject1.setPhoneNumber(123565);

        System.out.println(testSubject1.givePhoneNumber("i'm your Sister"));
        System.out.println(testSubject2.givePhoneNumber("I'm your sister"));
        System.out.println(testSubject3.givePhoneNumber("I'm your sister"));
    }
}
