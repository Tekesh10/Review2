package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
    static List<Contact> contactList = new ArrayList<>();

    public static void main(String[] args) {
        String name = "Aman Kumar";
        String age = "26";
        String phoneNumber = "7560778773";
        String city = "Mumbai";
        String state = "Maharastra";
        Contact contactOne = new Contact(name, age, phoneNumber, city, state);
        contactList.add(contactOne);
        System.out.println(contactOne);

        String name2 = "Amit Kumar";
        String age2 = "24";
        String phoneNumber2 = "7569897698";
        String city2 = "Hydrabad";
        String state2 = "Telangana";
        Contact contactTwo = new Contact(name2, age2, phoneNumber2, city2, state2);
        contactList.add(contactTwo);
        System.out.println(contactTwo);
    }
}
class Contact {
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
