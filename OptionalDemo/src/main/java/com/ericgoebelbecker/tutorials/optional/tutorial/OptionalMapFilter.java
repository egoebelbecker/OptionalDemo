package com.ericgoebelbecker.tutorials.optional.tutorial;

/**
 * Using Optional to process and filter results
 */
public class OptionalMapFilter {

    public static void main(String[] args) {

        UserDictionary userDictionary = new UserDictionary();
        for (int i = 0; i < 3; i++) {
            userDictionary.getUserByNumber(i).map(String::toUpperCase)
                    .filter(item -> item.charAt(0) != 'J')
                    .ifPresent(name -> System.out.println("Name is " + name));
        }
    }


}
