package com.bridgelabz;

public class Contact {
    String name, age, phoneNumber, city, state;
    public Contact(String name, String age, String phoneNumber, String city, String state) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
    }
    @Override
    public String toString() {
        return "Name : " +name+ ", Age : " +age+ ", Phone Number : " +phoneNumber+ ", City : " +city+ ", State : " +state;
    }
}
