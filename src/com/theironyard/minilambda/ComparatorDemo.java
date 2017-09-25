package com.theironyard.minilambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("123 Main St.", "Austin", "TX", "78787"));
        addresses.add(new Address("43 High St.", "Columbus", "OH", "43034"));
        addresses.add(new Address("678 Leon Rd.", "Tallahassee", "FL", "32307"));
        addresses.add(new Address("8 Deep Sea Way", "Boca Raton", "FL", "33433"));

        //Feel free to add in more addresses if you would like

        System.out.println("Before sorting");
        print(addresses);

        // !! - Write an anonymous class to sort by state (alphabetically)
        Collections.sort(addresses, new Comparator<Address>() {
            @Override
            public int compare(Address e1, Address e2) {
                return e1.getState().compareTo(e2.getState());
            }
        });

        System.out.println("\nAfter sorting by state");
        print(addresses);

        // !! - Write a lambda to sort by city alphabetically
        Collections.sort(addresses, new Comparator<Address>() {
            @Override
            public int compare(Address o1, Address o2) {
                return o1.getCity().compareTo(o2.getCity());
            }
        });

        System.out.println("\nAfter sorting by city");
        print(addresses);
    }

    private static void print(List<Address> addresses) {
        for(Address address : addresses) {
            System.out.println(address);
        }
    }
}

