package com.ericgoebelbecker.tutorials.optional.tutorial;

/**
 * Using Optional to process resulta
 */
public class OptionalMap {

    public static void main(String[] args) {

        UserDictionary userDictionary = new UserDictionary();
        for (int i = 0; i < 3; i++) {
            userDictionary.getUserByNumber(i).map(String::toUpperCase).ifPresent(name -> System.out.println("Name is " + name));
        }
    }


}
